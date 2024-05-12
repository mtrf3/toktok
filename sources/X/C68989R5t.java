package X;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.R5t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68989R5t {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Activity activity, Intent intent) {
        String str;
        String str2;
        String str3;
        String LLJJIJIIJIL;
        o.LJIIIZ(activity, "activity");
        String str4 = "";
        if (intent == null || (str = C16880lQ.LLJJIJIIJIL(intent, "platform")) == null) {
            str = "";
        }
        if (intent == null || (str2 = C16880lQ.LLJJIJIIJIL(intent, "enter_method")) == null) {
            str2 = "";
        }
        if (intent == null || (str3 = C16880lQ.LLJJIJIIJIL(intent, "enter_from")) == null) {
            str3 = "";
        }
        if (intent != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "login_panel_type")) != null) {
            str4 = LLJJIJIIJIL;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", str);
        c35936E8m.LIZLLL("enter_method", str2);
        c35936E8m.LIZLLL("enter_from", str3);
        c35936E8m.LIZLLL("login_panel_type", str4);
        FMX.LJIIL("3p_auth_page_show", c35936E8m.LIZ);
        if (intent != null) {
            C16880lQ.LJFF(activity, 1001, intent);
        }
    }

    public static void LIZJ(Activity activity, String platform, C63026OoQ c63026OoQ) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(platform, "platform");
        Intent LIZ2 = LIZ(activity, false, platform, c63026OoQ);
        if (LIZ2 != null) {
            C16880lQ.LJFF(activity, 1001, LIZ2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        if (r6.LIZ() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent LIZ(android.app.Activity r14, boolean r15, java.lang.String r16, X.InterfaceC68974R5e r17) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68989R5t.LIZ(android.app.Activity, boolean, java.lang.String, X.R5e):android.content.Intent");
    }
}
