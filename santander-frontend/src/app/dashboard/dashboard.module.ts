import { CommonModule } from '@angular/common';
import { StockCardComponent } from './stock-card/stock-card.component';
import { DashBoardPageComponent } from './dashboard-page/dashboard-page.component';
import { NgModule } from "@angular/core";
import { HttpClientModule } from '@angular/common/http';

@NgModule({
    declarations: [
    DashBoardPageComponent,
    StockCardComponent
    ],
    imports: [
        CommonModule,
        HttpClientModule,
    ],
})

export class DashboardModule { };