package X;

import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FCh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38583FCh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(java.util.Map map) {
        Boolean LJ = C38987FRv.LJ();
        o.LJIIIIZZ(LJ, "isFirstInstallAndFirstLaunchLowCost()");
        map.put("is_first_launch", Integer.valueOf(LJ.booleanValue() ? 1 : 0));
        map.put("is_cold_launch", Integer.valueOf(!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isAppHot() ? 1 : 0));
        map.put("is_first_enter_mall", Integer.valueOf(C56090Lzq.LIZIZ() ? 1 : 0));
        map.put("is_ug_allowlist_user", C61275O3b.LIZIZ().getSecond());
    }

    public static void LIZIZ(int i, String stage, String str, String str2) {
        o.LJIIIZ(stage, "stage");
        HashMap LIZJ = C03660Ck.LIZJ("stage", stage);
        LIZJ.put("has_mall_tab", Integer.valueOf(i));
        LIZJ.put("tab_name", str);
        LIZJ.put("schema", str2);
        LIZ(LIZJ);
        C76542zS.LIZ("rd_tiktokec_mall_tab_state", LIZJ);
    }
}
