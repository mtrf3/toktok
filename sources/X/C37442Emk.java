package X;

import Y.ARunnableS25S0200000_6;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.pia.core.PiaManifest;
import com.bytedance.pia.core.setting.Settings;
import kotlin.jvm.internal.o;

/* renamed from: X.Emk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37442Emk {
    public C37558Eoc LIZ;
    public final C37499Enf LIZIZ;

    public C37442Emk(C37499Enf c37499Enf, PiaManifest manifest) {
        Object LIZ;
        WebSettings settings;
        o.LJIIJ(manifest, "manifest");
        this.LIZIZ = c37499Enf;
        if (!manifest.LIZLLL || !C37413EmH.LIZ(Settings.LJIIIZ).isPrefetchV1Enabled) {
            return;
        }
        try {
            C37441Emj c37441Emj = new C37441Emj();
            c37441Emj.LJII = "Prefetch";
            c37441Emj.LJFF = c37499Enf.LJIJJ;
            c37441Emj.LIZ = manifest.LIZ.toString();
            android.net.Uri uri = manifest.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("assets/js/");
            LIZ2.append(manifest.LIZIZ);
            LIZ2.append(".pia.worker.js");
            String uri2 = android.net.Uri.withAppendedPath(uri, X1D.LIZIZ(LIZ2)).toString();
            o.LJFF(uri2, "Uri.withAppendedPath(pub…ia.worker.js\").toString()");
            c37441Emj.LIZIZ = uri2;
            View LJI = c37499Enf.LJI();
            WebView webView = (WebView) (LJI instanceof WebView ? LJI : null);
            if (webView != null && (settings = webView.getSettings()) != null) {
                settings.getUserAgentString();
            }
            c37441Emj.LIZJ = c37499Enf;
            c37441Emj.LJI = false;
            LIZ = c37441Emj.LIZ();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C37561Eof c37561Eof = (C37561Eof) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (c37561Eof == null) {
            return;
        }
        C37613EpV.LIZ().post(new ARunnableS25S0200000_6(c37561Eof, this, 53));
    }
}
