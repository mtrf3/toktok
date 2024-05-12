package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NwZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60983NwZ {
    public static SparkContext LIZIZ;
    public static boolean LIZLLL;
    public static SparkActivity LJ;
    public static C60980NwW LJFF;
    public static SearchLandingPageViewModel LJI;
    public static String LIZ = "safe";
    public static String LIZJ = "";

    public static boolean LIZ() {
        if (o.LJ(LIZ, "not_secure") || o.LJ(LIZ, "protection")) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(C60980NwW c60980NwW) {
        if (c60980NwW != null && c60980NwW.getParent() != null && (c60980NwW.getParent() instanceof ViewGroup)) {
            ViewParent parent = c60980NwW.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(c60980NwW, (ViewGroup) parent);
        }
    }
}
