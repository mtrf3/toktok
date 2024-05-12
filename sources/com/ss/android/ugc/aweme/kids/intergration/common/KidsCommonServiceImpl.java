package com.ss.android.ugc.aweme.kids.intergration.common;

import X.ActivityC45651qj;
import X.C0RN;
import X.C16880lQ;
import X.C188727au;
import X.C36093EEn;
import X.C36583EXj;
import X.C39328Fc4;
import X.C40328FsC;
import X.C53682L5a;
import X.C53683L5b;
import X.C58096Mr6;
import X.C84763XOl;
import X.C86034Xpe;
import X.EE1;
import X.EFK;
import X.EI0;
import X.EnumC2323399x;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FJT;
import X.FMX;
import X.InterfaceC64592gB;
import X.J7I;
import X.J7M;
import X.J7P;
import X.M58;
import X.MD0;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class KidsCommonServiceImpl implements IKidsCommonService {
    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void LIZJ() {
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new EE1() { // from class: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.AppStateReporterKid$init$1
            @Override // X.EEY
            public final String key() {
                return "AppStateReporterKid$init$1";
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
            public final /* synthetic */ int targetProcess() {
                return C0RN.LIZ();
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
                o.LJIIIZ(context, "context");
                M58.LJLIL.LIZ();
            }
        }, true);
        LIZJ.LIZJ();
        C84763XOl.LJ().LJJJJZI(C53682L5a.LJLIL);
        C84763XOl.LIZLLL().LJJJJZI(new InterfaceC64592gB() { // from class: X.9Ey
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        C84763XOl.LJFF().LJJJJZI(C53683L5b.LJLIL);
    }

    public static IKidsCommonService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IKidsCommonService.class, false);
        if (LIZ != null) {
            return (IKidsCommonService) LIZ;
        }
        if (C58096Mr6.L1 == null) {
            synchronized (IKidsCommonService.class) {
                if (C58096Mr6.L1 == null) {
                    C58096Mr6.L1 = new KidsCommonServiceImpl();
                }
            }
        }
        return C58096Mr6.L1;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void LIZ() {
        MD0.LIZ = EnumC2323399x.COLD;
        MD0.LIZIZ = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void LIZIZ() {
        FJT fjt = FJT.LIZ;
        C39328Fc4.LIZ = fjt;
        C39328Fc4.LIZIZ = fjt;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final String getReleaseBuildString() {
        return C86034Xpe.LIZIZ.getReleaseBuildString();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void LJ() {
        if (C36583EXj.LIZJ()) {
            if (J7M.LIZ() == null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "kids_mode_app_launch");
                c188727au.LJIIIZ("description", "no_kids_setting_param");
                FMX.LJIIL("pns_analysis_event", c188727au.LIZ);
            } else {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", "kids_mode_app_launch");
                c188727au2.LJIIIZ("description", "has_kids_setting_param");
                FMX.LJIIL("pns_analysis_event", c188727au2.LIZ);
            }
        }
        if (J7M.LIZ() == null) {
            J7M.LIZIZ.LIZ(new J7I(), 1);
        } else {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(J7P.LJLIL, 2000L);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void LIZLLL(ActivityC45651qj activityC45651qj) {
        a.LJI().LJIIL(activityC45651qj);
    }
}
