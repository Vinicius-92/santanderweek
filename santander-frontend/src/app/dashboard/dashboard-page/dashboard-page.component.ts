import { DashboardService } from './../dashboard.service';
import Stock from 'src/app/shared/models/stock-model';
import { OnInit, Component } from '@angular/core';


@Component({
    selector: 'app-dashboard-component',
    templateUrl: './dashboard-page.component.html',
    styleUrls: ['./dashboard-page.component.css']
})

export class DashBoardPageComponent implements OnInit {
   
    stocks: Stock[] = [];

    constructor(private service: DashboardService) { }

    ngOnInit(): void {
        this.fetchStocks();
    }

    async fetchStocks(): Promise<void> {
        this.stocks = await this.service.getStocks();
    }
}