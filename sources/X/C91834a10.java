package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS16S1100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a10, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91834a10 {
    public static String LIZ = "unpaid";
    public static long LIZIZ;
    public static long LIZJ;

    public static void LIZ(Context context, RepaymentArg repaymentArg) {
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//bnpl/bill/repayment");
        buildRoute.withNavArg(repaymentArg);
        buildRoute.open();
    }

    public static void LIZIZ(String str, String previousPageId) {
        o.LJIIIZ(previousPageId, "previousPageId");
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        long j2 = 0;
        if (j > 0) {
            j2 = currentTimeMillis - j;
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_statement_details_click", "bnpl_statement_details", previousPageId, C113554cx.LJJLIIIJLLLLLLLZ(C113554cx.LJJLIIIIJ(new OSZ("obj_id", str), new OSZ("click_use_time", String.valueOf(j2)))), 8);
    }

    public static void LIZLLL(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZIZ;
        long j2 = 0;
        if (j > 0) {
            j2 = currentTimeMillis - j;
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_all_statements_click", "bnpl_all_statements", str2, C113554cx.LJJLIIIJLLLLLLLZ(C113554cx.LJJLIIIIJ(new OSZ("obj_id", str), new OSZ("click_use_time", String.valueOf(j2)), new OSZ("sub_page_class", LIZ))), 8);
    }

    public static void LJ(ActivityC45651qj activityC45651qj, String str) {
        String str2;
        if (activityC45651qj != null && (str2 = C91891a1v.LIZ) != null) {
            Uri.Builder buildUpon = UriProtector.parse(str2).buildUpon();
            buildUpon.appendQueryParameter("source", str);
            buildUpon.appendQueryParameter("previous_page_id", str);
            buildUpon.appendQueryParameter("entrance", "bnpl_bill");
            buildUpon.appendQueryParameter("timestamp", String.valueOf(System.currentTimeMillis()));
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "uri.build().toString()");
            C91657Zy9.LIZJ(activityC45651qj, uri, true, false, false);
        }
    }

    public static void LJFF(Context context, String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_popup_show", "bnpl_account_home", str2, C113554cx.LJJLIIIJLLLLLLLZ(C113554cx.LJJLIIIIJ(new OSZ("obj_id", "{1, got_it}"), new OSZ("popup_id", ""))), 8);
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJFF(context.getString(R.string.jmp));
        c26227ARb.LIZIZ(context.getString(R.string.jmo));
        UC0.LIZJ(c26227ARb, new IDqS16S1100000_31(context, str, 7));
        c26227ARb.LJI().LIZLLL();
    }

    public static void LJI(ActivityC45651qj activityC45651qj, String str) {
        if (str == null) {
            str = activityC45651qj.getString(R.string.rf3);
            o.LJIIIIZZ(str, "activity.getString(R.string.something_wrong)");
        }
        C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LIZLLL(2000L);
        c26045AKb.LJIIJ();
    }

    public static void LIZJ(Boolean bool, String str, String previousPageId) {
        o.LJIIIZ(previousPageId, "previousPageId");
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZJ;
        long j2 = 0;
        if (j > 0) {
            j2 = currentTimeMillis - j;
        }
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("obj_id", str), new OSZ("click_use_time", String.valueOf(j2)));
        if (bool != null) {
            bool.booleanValue();
            LJJLIIIIJ.put("is_repayable", String.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_repayment_result_click", "bnpl_repayment_result", previousPageId, C113554cx.LJJLIIIJLLLLLLLZ(LJJLIIIIJ), 8);
    }
}
