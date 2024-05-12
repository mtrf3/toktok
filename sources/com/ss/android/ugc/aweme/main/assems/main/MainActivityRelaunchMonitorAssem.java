package com.ss.android.ugc.aweme.main.assems.main;

import X.AbstractC48820JEa;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C52987Kqt;
import X.C55419Lp1;
import X.C55420Lp2;
import X.C56662Kg;
import X.C62822Ol8;
import X.C67642l6;
import X.FMX;
import X.OSZ;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainActivityRelaunchMonitorAssem extends BaseMainContainerAssem {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C55419Lp1.LJLIL);
    public Configuration LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void N5() {
        FMX.onEventV3("main_recreate_monitor");
    }

    @Override // X.C8W0
    public final void onStop() {
        int i;
        super.onStop();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && LIZ.isChangingConfigurations()) {
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 != null) {
                i = LIZ2.getChangingConfigurations();
            } else {
                i = 0;
            }
            FMX.LJIIL("changing_configuration_recreate", C113554cx.LJJL(new OSZ("enter_from", "homepage"), new OSZ("changing_configurations", String.valueOf(i))));
            ((AbstractC48820JEa) this.LJLIL.getValue()).LJIIJ(new AqS154S0100000_4(this, 384));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        Configuration configuration = this.LJLILLLLZI;
        if (configuration == null) {
            configuration = newConfig;
        }
        int i = newConfig.navigation;
        int i2 = configuration.navigation;
        if (i != i2) {
            FMX.LJIIL("activity_configuration_change", C113554cx.LJJL(new OSZ("enter_from", "homepage"), new OSZ("event_type", "navigation"), new OSZ("old_navi", String.valueOf(i2)), new OSZ("new_navi", String.valueOf(i))));
            ((AbstractC48820JEa) this.LJLIL.getValue()).LJIIJ(new C67642l6(i2, i));
            if (((Number) C52987Kqt.LIZ.getValue()).intValue() == 1) {
                ((AbstractC48820JEa) this.LJLIL.getValue()).LJIIJ(C55420Lp2.LJLIL);
                ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                if (LIZ != null) {
                    LIZ.recreate();
                }
            }
            ((AbstractC48820JEa) this.LJLIL.getValue()).LJIIJ(new AqS156S0200000_9(configuration, newConfig, 15));
        }
        Configuration configuration2 = this.LJLILLLLZI;
        if (configuration2 == null) {
            this.LJLILLLLZI = new Configuration(newConfig);
        } else {
            configuration2.setTo(newConfig);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        Resources resources;
        Configuration configuration;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainActivityRelaunchMonitorAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (resources = LIZ.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            this.LJLILLLLZI = new Configuration(configuration);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }
}
