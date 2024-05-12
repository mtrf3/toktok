package com.ss.android.ugc.aweme.base;

import X.C55096Ljo;
import X.InterfaceC55372LoG;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class BaseMainContainerUIAssem extends UIContentAssem implements InterfaceC55372LoG {
    @Override // X.InterfaceC55372LoG
    public final void I5() {
    }

    @Override // X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC55372LoG
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC55372LoG
    public final void N5() {
    }

    @Override // X.InterfaceC55372LoG
    public final void P5(boolean z) {
    }

    @Override // X.InterfaceC55372LoG
    public final void S5() {
    }

    @Override // X.InterfaceC55372LoG
    public final void T5() {
    }

    @Override // X.InterfaceC55372LoG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC55372LoG
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC55372LoG
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC55372LoG
    public final void splashOverShowMandatoryLoginPage() {
    }

    public BaseMainContainerUIAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8W0
    public void onParentSet() {
        C55096Ljo.LIZJ(this);
    }

    @Override // X.InterfaceC55372LoG
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        o.LJIIIZ(intent, "intent");
    }
}
