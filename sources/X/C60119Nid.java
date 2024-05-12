package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Nid, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60119Nid {
    public static SparkContext LIZIZ;
    public static boolean LIZLLL;
    public static SparkActivity LJ;
    public static C60161NjJ LJFF;
    public static MusicLandingPageViewModel LJI;
    public static String LIZ = "safe";
    public static String LIZJ = "";

    public static void LIZ() {
        if (o.LJ(LIZ, "no_internet")) {
            LIZ = "safe";
            MusicLandingPageViewModel musicLandingPageViewModel = LJI;
            if (musicLandingPageViewModel != null) {
                musicLandingPageViewModel.gv0("safe");
                LIZLLL = true;
            } else {
                o.LJIJI("safeStatusViewModel");
                throw null;
            }
        }
    }

    public static void LIZIZ(C60161NjJ c60161NjJ) {
        if (c60161NjJ != null && c60161NjJ.getParent() != null && (c60161NjJ.getParent() instanceof ViewGroup)) {
            ViewParent parent = c60161NjJ.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(c60161NjJ, (ViewGroup) parent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.webkit.WebView r2, X.InterfaceC88472Yns r3) {
        /*
            X.NjJ r1 = X.C60119Nid.LJFF
            if (r1 == 0) goto L11
            java.lang.String r0 = X.C60119Nid.LIZ
            r1.setCurrentStatus$anchor_business_release(r0)
            X.Nie r0 = new X.Nie
            r0.<init>(r2, r3)
            r1.setCurrentStatusView$anchor_business_release(r0)
        L11:
            com.bytedance.hybrid.spark.SparkContext r0 = X.C60119Nid.LIZIZ
            r3 = 0
            if (r0 == 0) goto L3a
            X.Ch9 r1 = X.C31999Ch9.LIZJ
            java.lang.String r0 = r0.containerId
            r1.getClass()
            X.Nsz r1 = X.C31999Ch9.LIZIZ(r0)
            if (r1 == 0) goto L3a
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L3a
            android.view.View r1 = (android.view.View) r1
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L3a
            boolean r0 = r1 instanceof X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS
            if (r0 == 0) goto L3a
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L35:
            X.NjJ r0 = X.C60119Nid.LJFF
            if (r1 == 0) goto L3f
            goto L3c
        L3a:
            r1 = r3
            goto L35
        L3c:
            r1.addView(r0)     // Catch: java.lang.IllegalArgumentException -> L3f
        L3f:
            com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel r2 = X.C60119Nid.LJI
            java.lang.String r1 = "safeStatusViewModel"
            if (r2 == 0) goto L5f
            java.lang.String r0 = X.C60119Nid.LIZ
            r2.gv0(r0)
            com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel r2 = X.C60119Nid.LJI
            if (r2 == 0) goto L5b
            java.lang.String r1 = X.C60119Nid.LIZJ
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r2.LJLIL
            r0.setValue(r1)
            return
        L5b:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r3
        L5f:
            kotlin.jvm.internal.o.LJIJI(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60119Nid.LIZJ(android.webkit.WebView, X.Yns):void");
    }
}
