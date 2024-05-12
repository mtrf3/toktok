package com.ss.android.ugc.aweme.base;

import X.C55096Ljo;
import X.C8W0;
import X.InterfaceC55372LoG;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class BaseMainContainerAssem extends C8W0 implements InterfaceC55372LoG {
    @Override // X.InterfaceC55372LoG
    public void I5() {
    }

    public void K5(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC55372LoG
    public void LJIIJ() {
    }

    @Override // X.InterfaceC55372LoG
    public void N5() {
    }

    @Override // X.InterfaceC55372LoG
    public void P5(boolean z) {
    }

    @Override // X.InterfaceC55372LoG
    public void S5() {
    }

    public void T5() {
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC55372LoG
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC55372LoG
    public final void onSaveInstanceState(Bundle bundle) {
    }

    public void splashOverShowMandatoryLoginPage() {
    }

    @Override // X.C8W0
    public void onParentSet() {
        C55096Ljo.LIZJ(this);
    }

    @Override // X.InterfaceC55372LoG
    public void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    public void onNewIntent(Intent intent) {
        o.LJIIIZ(intent, "intent");
    }
}
