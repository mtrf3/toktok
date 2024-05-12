package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fst, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40371Fst extends AbstractC40360Fsi {
    public static final C40371Fst LJI = new C40371Fst();
    public static final java.util.Map<android.net.Uri, C9BW> LJII = new LinkedHashMap();

    @Override // X.InterfaceC40375Fsx
    public final void LIZIZ() {
        this.LIZLLL = false;
        this.LJ = null;
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(this.LIZ ? 1 : 0, "is_cold_launch");
        FMX.LJIIL("deep_link_short2long_launch", c188727au.LIZ);
    }

    @Override // X.InterfaceC40375Fsx
    public final void LIZJ() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("launch_method", "link_direct");
        c188727au.LJIIIZ("c_launch_method", "deep_link_short_link_fallback");
        int i = 0;
        if (this.LIZ) {
            this.LIZ = false;
            i = 1;
        }
        c188727au.LIZLLL(i, "is_cold_launch");
        c188727au.LJIIIZ("from_channel", "short_link");
        c188727au.LJIIIZ("is_gp_large_screen", CardStruct.IStatusCode.DEFAULT);
        c188727au.LJIIIZ("is_pad", String.valueOf(LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL()));
        FMX.LJIIL("launch_log", c188727au.LIZ);
    }

    @Override // X.InterfaceC40375Fsx
    public final void LIZ(boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJFF(Boolean.valueOf(this.LIZ), "is_cold_launch");
        c188727au.LIZLLL(z ? 1 : 0, "is_bg");
        FMX.LJIIL("deep_link_short2long_success", c188727au.LIZ);
    }

    @Override // X.InterfaceC40375Fsx
    public final void LIZLLL(android.net.Uri uri, boolean z, long j, boolean z2) {
        o.LJIIIZ(uri, "uri");
        LJII.put(uri, new C9BW(z, j, z2));
    }

    @Override // X.InterfaceC40375Fsx
    public final void LJ(android.net.Uri uri, boolean z, C40372Fsu launchDataBoat, boolean z2, long j, boolean z3) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(launchDataBoat, "launchDataBoat");
        this.LIZLLL = false;
        this.LJ = null;
        java.util.Map<android.net.Uri, C9BW> map = LJII;
        C9BW c9bw = (C9BW) ((LinkedHashMap) map).get(uri);
        if (c9bw == null) {
            c9bw = new C9BW(z2, j, z3);
        }
        if (c9bw.LIZ) {
            FIW.LIZ(EF7.LIZIZ()).LIZJ(LJIIIIZZ(uri, z, "deep_link", launchDataBoat, false, false));
        } else {
            FIW.LIZ(EF7.LIZIZ()).LIZJ(LJIIIIZZ(uri, z, "deep_link_short_link", launchDataBoat, true, c9bw.LIZJ));
        }
        map.remove(uri);
    }

    public final android.net.Uri LJIIIIZZ(android.net.Uri uri, boolean z, String str, C40372Fsu c40372Fsu, boolean z2, boolean z3) {
        boolean z4;
        String str2;
        String queryParameter = UriProtector.getQueryParameter(uri, "gd_label");
        int i = 1;
        if (queryParameter == null || queryParameter.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            queryParameter = UriProtector.getQueryParameter(uri, "launch_method");
        }
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = "link_direct";
        }
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("launch_method", queryParameter).appendQueryParameter("c_launch_method", str);
        if (this.LIZ) {
            this.LIZ = false;
        } else {
            i = 0;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("is_cold_launch", String.valueOf(i)).appendQueryParameter("is_from_noti", String.valueOf(z)).appendQueryParameter("needlaunchlog", "true");
        if (c40372Fsu != null) {
            appendQueryParameter2.appendQueryParameter("page_source", c40372Fsu.LIZIZ);
            appendQueryParameter2.appendQueryParameter("enter_to", c40372Fsu.LIZJ);
            appendQueryParameter2.appendQueryParameter("platform", c40372Fsu.LIZLLL);
            appendQueryParameter2.appendQueryParameter("from_user_id", c40372Fsu.LJ);
            appendQueryParameter2.appendQueryParameter("async", c40372Fsu.LJIIIZ);
            appendQueryParameter2.appendQueryParameter("async_fact", c40372Fsu.LJIIJ);
            if (C78685UuP.LJJJZ(c40372Fsu.LJI)) {
                appendQueryParameter2.appendQueryParameter("link_id", c40372Fsu.LJI);
            }
            if (C78685UuP.LJJJZ(c40372Fsu.LJII)) {
                appendQueryParameter2.appendQueryParameter("referrer_url", c40372Fsu.LJII);
            }
            if (C78685UuP.LJJJZ(c40372Fsu.LJIIIIZZ)) {
                appendQueryParameter2.appendQueryParameter("params_url", c40372Fsu.LJIIIIZZ);
            }
            if (C78685UuP.LJJJZ(c40372Fsu.LJFF)) {
                appendQueryParameter2.appendQueryParameter("to_user_id", c40372Fsu.LJFF);
            }
            if (C78685UuP.LJJJZ(c40372Fsu.LJIIJJI)) {
                appendQueryParameter2.appendQueryParameter("action_name", c40372Fsu.LJIIJJI);
            }
        }
        if (z2) {
            if (z3) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            appendQueryParameter2.appendQueryParameter("c_short_link_is_bg", str2);
        }
        android.net.Uri build = appendQueryParameter2.build();
        o.LJIIIIZZ(build, "originBuilder.build()");
        return build;
    }
}
