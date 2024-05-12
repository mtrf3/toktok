package com.ss.android.ugc.aweme.main.assems.main;

import X.AbstractC48820JEa;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C35369DuP;
import X.C35371DuR;
import X.C56662Kg;
import X.C5H3;
import X.EnumC221088m0;
import X.X1D;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS63S0110000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MainActivityLogAssem extends BaseMainContainerAssem {
    public final C5H3 LJLIL = C221108m2.LIZ(EnumC221088m0.NONE, C35371DuR.LJLIL);

    @Override // X.C8W0
    public final void onResume() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainActivityLogAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        v3().LJIIJ(new AqS156S0100000_6(this, 62));
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public final AbstractC48820JEa v3() {
        return (AbstractC48820JEa) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void I5() {
        v3().LJIIJ(new AqS156S0100000_6(this, 55));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void N5() {
        v3().LJIIJ(new AqS156S0100000_6(this, 61));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void S5() {
        v3().LJIIJ(new AqS156S0100000_6(this, 56));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void T5() {
        v3().LJIIJ(new AqS156S0100000_6(this, 57));
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        v3().LJIIJ(new AqS156S0100000_6(this, 59));
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        v3().LJIIJ(new AqS156S0100000_6(this, 60));
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        v3().LJIIJ(new AqS156S0100000_6(this, 63));
    }

    @Override // X.C8W0
    public final void onStop() {
        boolean z;
        super.onStop();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            z = LIZ.isChangingConfigurations();
        } else {
            z = false;
        }
        v3().LJIIJ(new AqS63S0110000_6(this, z, 2));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void P5(boolean z) {
        v3().LJIIJ(new AqS63S0110000_6(this, z, 1));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        v3().LJIIJ(new AqS153S0200000_6(this, newConfig, 5));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainActivityLogAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        v3().LJIIJ(new AqS156S0100000_6(this, 58));
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        o.LJIIIZ(intent, "intent");
        AbstractC48820JEa v3 = v3();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNewIntent ");
        LIZ.append(this);
        LIZ.append(' ');
        v3.LJII(intent, X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        v3().LJIIJ(new C35369DuP(this, z, z2));
    }
}
