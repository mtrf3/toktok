package com.ss.android.ugc.aweme.property.bytebench;

import X.InterfaceC09230Xv;
import X.InterfaceC09240Xw;
import X.InterfaceC44775Hhj;

/* loaded from: classes8.dex */
public interface FuncSwitchByteBenchStrategy extends InterfaceC44775Hhj, InterfaceC09230Xv {
    @Override // X.InterfaceC44775Hhj
    boolean enableDefaultOpenHDSwitch();

    @Override // X.InterfaceC44775Hhj
    boolean enableFastImport1080pHigher();

    @Override // X.InterfaceC44775Hhj
    boolean enableFastImport1080pLower();

    @Override // X.InterfaceC44775Hhj
    boolean enableImportHD();

    @Override // X.InterfaceC44775Hhj
    boolean enableRecordHD();

    @Override // X.InterfaceC09230Xv
    /* synthetic */ void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw);

    @Override // X.InterfaceC44775Hhj
    boolean showHDButton();

    /* synthetic */ void updateValue();
}
