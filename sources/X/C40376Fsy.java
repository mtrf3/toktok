package X;

import Y.ACallableS113S0100000_10;
import Y.ACallableS44S0201000_7;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Fsy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40376Fsy {
    public final Context LIZ;
    public final Intent LIZIZ;

    public final void LIZ(android.net.Uri uri) {
        if (uri.toString().startsWith(NO2.LIZ)) {
            C10K.LIZJ(new ACallableS44S0201000_7(0, this, uri, 0));
        }
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        if (ujb.o.LJJJLIIL(uri2, C58774N4w.LIZ, false)) {
            C10K.LIZJ(new ACallableS113S0100000_10(uri, 24));
        }
    }

    public C40376Fsy(Context context, Intent intent) {
        this.LIZ = context;
        this.LIZIZ = intent;
    }

    public final void LIZIZ(android.net.Uri uri, C40372Fsu c40372Fsu, boolean z) {
        boolean z2;
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("ugdp_id", C56235M5f.LJIILJJIL);
        android.net.Uri build = buildUpon.build();
        if (TextUtils.isEmpty(UriProtector.getQueryParameter(build, "params_url")) && TextUtils.isEmpty(c40372Fsu.LJIIIIZZ)) {
            String uri2 = build.toString();
            o.LJIIIZ(uri2, "<set-?>");
            c40372Fsu.LJIIIIZZ = uri2;
        }
        IUgCommonService LJIJ = UgCommonServiceImpl.LJIJ();
        if (LJIJ.LJIIL()) {
            InterfaceC40375Fsx LJIILL = LJIJ.LJIILL();
            if (o.LJ(C56235M5f.LJIIJ, "normal_deeplink") || o.LJ(C56235M5f.LJIIJ, "semantic")) {
                z2 = true;
            } else {
                z2 = false;
            }
            LJIILL.LJ(build, z, c40372Fsu, z2, C56235M5f.LIZLLL - C56235M5f.LIZJ, C56235M5f.LJ);
            return;
        }
        FIW LIZ = FIW.LIZ(this.LIZ);
        String str = c40372Fsu.LIZ;
        if (TextUtils.isEmpty(str)) {
            str = UriProtector.getQueryParameter(build, "gd_label");
        }
        if (TextUtils.isEmpty(str)) {
            str = UriProtector.getQueryParameter(build, "launch_method");
        }
        if (TextUtils.isEmpty(str)) {
            str = "link_direct";
        }
        o.LJIIIZ(str, "<set-?>");
        c40372Fsu.LIZ = str;
        Uri.Builder appendQueryParameter = build.buildUpon().appendQueryParameter("launch_method", c40372Fsu.LIZ).appendQueryParameter("page_source", c40372Fsu.LIZIZ).appendQueryParameter("enter_to", c40372Fsu.LIZJ).appendQueryParameter("platform", c40372Fsu.LIZLLL).appendQueryParameter("from_user_id", c40372Fsu.LJ).appendQueryParameter("async", c40372Fsu.LJIIIZ).appendQueryParameter("async_fact", c40372Fsu.LJIIJ);
        if (!TextUtils.isEmpty(c40372Fsu.LJI)) {
            appendQueryParameter.appendQueryParameter("link_id", c40372Fsu.LJI);
        }
        if (!TextUtils.isEmpty(c40372Fsu.LJII)) {
            appendQueryParameter.appendQueryParameter("referrer_url", c40372Fsu.LJII);
        }
        if (!TextUtils.isEmpty(c40372Fsu.LJIIIIZZ)) {
            appendQueryParameter.appendQueryParameter("params_url", c40372Fsu.LJIIIIZZ);
        }
        if (!TextUtils.isEmpty(c40372Fsu.LJFF)) {
            appendQueryParameter.appendQueryParameter("to_user_id", c40372Fsu.LJFF);
        }
        if (!TextUtils.isEmpty(c40372Fsu.LJIIJJI)) {
            appendQueryParameter.appendQueryParameter("action_name", c40372Fsu.LJIIJJI);
        }
        appendQueryParameter.appendQueryParameter("needlaunchlog", "true");
        LIZ.LIZJ(appendQueryParameter.build());
    }
}
