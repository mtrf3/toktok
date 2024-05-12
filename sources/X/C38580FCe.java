package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.FCe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38580FCe {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Activity activity) {
        if (activity != null && o.LJ(C65352Pkq.LIZ(activity.getClass()), C65352Pkq.LIZ(ShopTabOverlayActivity.class))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0055 A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:3:0x0004, B:40:0x0013, B:43:0x0023, B:47:0x0049, B:52:0x0055, B:55:0x005b, B:59:0x0067, B:64:0x0073), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0073 A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:3:0x0004, B:40:0x0013, B:43:0x0023, B:47:0x0049, B:52:0x0055, B:55:0x005b, B:59:0x0067, B:64:0x0073), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZ(android.net.Uri r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38580FCe.LIZ(android.net.Uri, java.lang.String):android.net.Uri");
    }

    public static boolean LIZJ(String str, boolean z) {
        Integer LJJIL;
        try {
            LJJIL = C38350F3i.LJJIL(ED3.LJ(UriProtector.parse(str), "need_overlay"));
        } catch (Throwable unused) {
        }
        if (LJJIL != null) {
            if (LJJIL.intValue() != 0) {
            }
            return false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public static boolean LIZLLL(Context context, Fragment fragment, String str, boolean z, boolean z2) {
        if ((context == null && fragment == null) || str == 0 || ujb.o.LJJJJJL(str)) {
            return false;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = "";
        C68322mC c68322mC3 = new C68322mC();
        c68322mC3.element = "";
        C68322mC c68322mC4 = new C68322mC();
        c68322mC4.element = "";
        C68322mC c68322mC5 = new C68322mC();
        c68322mC5.element = "";
        C68322mC c68322mC6 = new C68322mC();
        c68322mC6.element = "";
        C68322mC c68322mC7 = new C68322mC();
        c68322mC7.element = "";
        C38579FCd c38579FCd = new C38579FCd(c68322mC, c68322mC2, c68322mC3, c68322mC4, c68322mC5, c68322mC6, c68322mC7, z, z2);
        try {
            android.net.Uri uri = UriProtector.parse(str);
            o.LJIIIIZZ(uri, "uri");
            C36998Efa.LIZ(uri);
            if (fragment != null) {
                SmartRouter.buildFragmentRoute(fragment, str).open(0);
            } else {
                SmartRouter.buildRoute(context, str).open();
            }
            c68322mC.element = ED3.LJ(uri, "previous_page");
            c68322mC2.element = ED3.LJ(uri, "deeplink_type");
            ?? LJ = ED3.LJ(uri, "top_product_ids");
            c68322mC3.element = LJ;
            if (ujb.o.LJJJJJL(LJ)) {
                c68322mC3.element = ED3.LJ(uri, "product_id_list");
            }
            c68322mC4.element = ED3.LJ(uri, "creative_id");
            c68322mC5.element = ED3.LJ(uri, "campaign_id");
            c68322mC6.element = ED3.LJ(uri, "url");
            c68322mC7.element = str;
            c38579FCd.invoke(Boolean.TRUE, "");
            return true;
        } catch (Throwable th) {
            c38579FCd.invoke(Boolean.FALSE, th.getMessage());
            return false;
        }
    }
}
