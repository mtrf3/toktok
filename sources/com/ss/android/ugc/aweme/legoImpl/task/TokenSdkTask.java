package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C10K;
import X.C1B6;
import X.C34891Dmh;
import X.C35478DwA;
import X.C36922EeM;
import X.C38776FJs;
import X.C39627Fgt;
import X.C65083PgV;
import X.C66952QPk;
import X.C66953QPl;
import X.DPI;
import X.DS1;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FX7;
import X.FXA;
import X.FXE;
import X.HG3;
import X.MPE;
import X.QSV;
import Y.AgS45S0000000_6;
import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.AccountService;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes7.dex */
public class TokenSdkTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "TokenSdkTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        String str;
        long j;
        boolean z;
        C36922EeM.LJ("TokenSdkTask");
        if (!FCD.LJI(EF7.LIZIZ())) {
            return;
        }
        int i = EF7.LJII;
        if (i == 5 || i == 4) {
            str = "lite";
        } else {
            str = "normal";
        }
        C65083PgV.LIZIZ(new C39627Fgt(str));
        AccountService.LJIJ().tryInit();
        FXA.LIZ = new C1B6();
        FX7 fx7 = new FX7();
        fx7.LIZJ = 600000L;
        List asList = Arrays.asList("tiktokv.com", "tiktok.com", "byteoversea.com");
        if (asList != null && asList.size() != 0) {
            ((CopyOnWriteArraySet) fx7.LIZIZ).addAll(asList);
        }
        Context LIZIZ = EF7.LIZIZ();
        synchronized (C66952QPk.class) {
            if (!C66952QPk.LIZ) {
                C66953QPl c66953QPl = new C66953QPl(LIZIZ, fx7);
                C66953QPl.LJZL = c66953QPl;
                c66953QPl.LJLL = C66952QPk.LIZIZ;
                if (!c66953QPl.LJLL && C66953QPl.LLD) {
                    c66953QPl.LIZ();
                }
                C66952QPk.LIZ = true;
                if (C66952QPk.LIZJ.size() != 0) {
                    C66953QPl c66953QPl2 = C66953QPl.LJZL;
                    Set<String> set = C66952QPk.LIZJ;
                    FX7 fx72 = c66953QPl2.LJLJJLL;
                    if (fx72 != null && set != null && set.size() > 0) {
                        ((CopyOnWriteArraySet) fx72.LIZIZ).addAll(set);
                    }
                    C66952QPk.LIZJ.clear();
                    C66952QPk.LIZJ = null;
                }
                QSV.LIZ().getClass();
            }
        }
        if (MPE.LJLIL == null) {
            SharedPreferences LIZLLL = C38776FJs.LJIIL().LIZLLL(EF7.LIZIZ());
            if (LIZLLL == null || LIZLLL.getInt("awe_network_x_token_disabled", 0) == 0) {
                z = true;
            } else {
                z = false;
            }
            MPE.LJLIL = Boolean.valueOf(z);
        }
        boolean booleanValue = MPE.LJLIL.booleanValue();
        if (C66952QPk.LIZ && booleanValue != C66952QPk.LIZIZ) {
            C66953QPl c66953QPl3 = C66953QPl.LJZL;
            c66953QPl3.LJLL = booleanValue;
            if (!c66953QPl3.LJLL && C66953QPl.LLD) {
                c66953QPl3.LIZ();
            }
            C66952QPk.LIZIZ = booleanValue;
        }
        if (DPI.LIZ() || (C34891Dmh.LIZ() & 4) != 4) {
            if (!DPI.LIZ() ? (C34891Dmh.LIZ() & 8) == 8 : !(!C35478DwA.LIZIZ() || !DS1.LIZ())) {
                j = 7000;
            } else {
                j = 1000;
            }
        } else {
            j = 5000;
        }
        C10K.LJII(j).LJ(new AgS45S0000000_6(2), C10K.LJI, null);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new FXE());
    }
}
