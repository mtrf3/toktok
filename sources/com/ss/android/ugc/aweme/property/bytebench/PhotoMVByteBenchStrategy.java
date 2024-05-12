package com.ss.android.ugc.aweme.property.bytebench;

import X.InterfaceC09230Xv;
import X.InterfaceC09240Xw;
import X.InterfaceC44777Hhl;

/* loaded from: classes8.dex */
public interface PhotoMVByteBenchStrategy extends InterfaceC44777Hhl, InterfaceC09230Xv {
    @Override // X.InterfaceC44777Hhl
    boolean enableMvBindingHDSwitch();

    @Override // X.InterfaceC44777Hhl
    boolean enableSynthesisMvTo1080p();

    @Override // X.InterfaceC44777Hhl
    int mvDynamicResolutionStrategy();

    @Override // X.InterfaceC44777Hhl
    int mvFastImportStrategy();

    @Override // X.InterfaceC44777Hhl
    String mvSynthesisSettingsFor1080p();

    @Override // X.InterfaceC09230Xv
    /* synthetic */ void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw);

    /* synthetic */ void updateValue();
}
