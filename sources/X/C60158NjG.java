package X;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NjG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60158NjG implements InterfaceC60651NrD {
    public final InterfaceC60159NjH LIZ;
    public C73305Spp LIZIZ;

    @Override // X.InterfaceC60651NrD
    public final void LIZIZ(WebView webView, String str) {
    }

    @Override // X.InterfaceC60651NrD
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC60651NrD
    public final void LJ() {
    }

    public C60158NjG(InterfaceC60159NjH sparkContextGetter) {
        o.LJIIIZ(sparkContextGetter, "sparkContextGetter");
        this.LIZ = sparkContextGetter;
    }

    @Override // X.InterfaceC60651NrD
    public final void LIZ(java.util.Map map) {
        map.put("bid", "poi_third_party");
        FMX.LJIIL("scc_cloudservice_result", map);
    }

    @Override // X.InterfaceC60651NrD
    public final void LIZJ(WebView webView, String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJIJI;
        if (webView == null) {
            return;
        }
        if (this.LIZIZ == null) {
            Context context = webView.getContext();
            o.LJIIIIZZ(context, "view.context");
            C73305Spp c73305Spp = new C73305Spp(context, null, 6);
            c73305Spp.setLayoutVariant(0);
            this.LIZIZ = c73305Spp;
        }
        C73305Spp c73305Spp2 = this.LIZIZ;
        if (c73305Spp2 != null) {
            C73306Spq c73306Spq = new C73306Spq();
            AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(this, 7);
            String LJFF = C86V.LJFF(R.string.pl);
            o.LJIIIIZZ(LJFF, "getString(R.string.POIre…error_pageBlocked_header)");
            c73306Spq.LJFF = LJFF;
            String LJFF2 = C86V.LJFF(R.string.pk);
            o.LJIIIIZZ(LJFF2, "getString(R.string.POIre…e_error_pageBlocked_body)");
            c73306Spq.LJI = LJFF2;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_protection;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            c73306Spq.LJII = new AqS176S0100000_10(aqS160S0100000_10, 9);
            c73305Spp2.setStatus(c73306Spq);
        }
        SparkContext LIZIZ = this.LIZ.LIZIZ();
        if (LIZIZ != null && (LJIJI = C62814Ol0.LJIJI(LIZIZ)) != null) {
            LJIJI.addView(this.LIZIZ);
        }
    }
}
