import { FooterComponent } from './layout/footer/footer.component';
import { HeaderComponent } from './layout/header/header.component';
import { NgModule } from "@angular/core";
import { CommonModule } from '@angular/common';


@NgModule ({
    declarations: [
        HeaderComponent,
        FooterComponent
    ],
    imports: [
        CommonModule
    ],
    exports: [
        HeaderComponent,
        FooterComponent
    ],
})

export class SharedModule { }