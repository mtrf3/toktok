package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NwW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60980NwW extends FrameLayout {
    public final C73305Spp LJLIL;
    public String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60980NwW(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = "safe";
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.chn, this, true);
        View findViewById = findViewById(R.id.lm2);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tsv_landing_page_safe_status)");
        this.LJLIL = (C73305Spp) findViewById;
    }

    public final void setCurrentStatus$search_release(String status) {
        o.LJIIIZ(status, "status");
        this.LJLILLLLZI = status;
    }

    public final void setCurrentStatusView$search_release(InterfaceC60132Niq listener) {
        o.LJIIIZ(listener, "listener");
        String str = this.LJLILLLLZI;
        switch (str.hashCode()) {
            case -1684858151:
                if (!str.equals("protection")) {
                    return;
                }
                C73305Spp c73305Spp = this.LJLIL;
                if (c73305Spp != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_large_protection;
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    c2068389v.LIZLLL = C79045V0n.LJI(R.attr.gp, context);
                    c73306Spq.LIZJ = 0;
                    c73306Spq.LIZIZ = c2068389v;
                    String LJFF = C86V.LJFF(R.string.qe1);
                    o.LJIIIIZZ(LJFF, "getString(R.string.searc…fe_website_warning_title)");
                    c73306Spq.LJFF = LJFF;
                    String LJFF2 = C86V.LJFF(R.string.qe0);
                    o.LJIIIIZZ(LJFF2, "getString(R.string.searc…website_warning_subtitle)");
                    c73306Spq.LJI = LJFF2;
                    c73306Spq.LJII = new AqS176S0100000_10(listener, 186);
                    c73305Spp.setStatus(c73306Spq);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            case -1380616235:
                if (!str.equals("broken")) {
                    return;
                }
                C73305Spp c73305Spp2 = this.LJLIL;
                if (c73305Spp2 != null) {
                    C73306Spq c73306Spq2 = new C73306Spq();
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_large_no_access;
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "context");
                    c2068389v2.LIZLLL = C79045V0n.LJI(R.attr.gp, context2);
                    c73306Spq2.LIZJ = 0;
                    c73306Spq2.LIZIZ = c2068389v2;
                    String LJFF3 = C86V.LJFF(R.string.qdu);
                    o.LJIIIIZZ(LJFF3, "getString(R.string.searc…age_page_not_found_title)");
                    c73306Spq2.LJFF = LJFF3;
                    String LJFF4 = C86V.LJFF(R.string.qdt);
                    o.LJIIIIZZ(LJFF4, "getString(R.string.searc…_page_not_found_subtitle)");
                    c73306Spq2.LJI = LJFF4;
                    c73306Spq2.LJII = new AqS176S0100000_10(listener, 187);
                    c73305Spp2.setStatus(c73306Spq2);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            case -1095865757:
                if (!str.equals("not_secure")) {
                    return;
                }
                C73305Spp c73305Spp3 = this.LJLIL;
                if (c73305Spp3 != null) {
                    C73306Spq c73306Spq3 = new C73306Spq();
                    C2068389v c2068389v3 = new C2068389v();
                    c2068389v3.LIZ = R.raw.search_landing_page_icon_unsafe_website;
                    Context context3 = getContext();
                    o.LJIIIIZZ(context3, "context");
                    c2068389v3.LIZLLL = C79045V0n.LJI(R.attr.gp, context3);
                    c73306Spq3.LIZJ = 0;
                    c73306Spq3.LIZIZ = c2068389v3;
                    String LJFF5 = C86V.LJFF(R.string.qdz);
                    o.LJIIIIZZ(LJFF5, "getString(R.string.searc…fe_website_blocked_title)");
                    c73306Spq3.LJFF = LJFF5;
                    String LJFF6 = C86V.LJFF(R.string.qdy);
                    o.LJIIIIZZ(LJFF6, "getString(R.string.searc…website_blocked_subtitle)");
                    c73306Spq3.LJI = LJFF6;
                    c73306Spq3.LJII = new AqS176S0100000_10(listener, 185);
                    c73305Spp3.setStatus(c73306Spq3);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            case 226612223:
                if (!str.equals("no_internet")) {
                    return;
                }
                C73305Spp c73305Spp4 = this.LJLIL;
                if (c73305Spp4 != null) {
                    C73306Spq c73306Spq4 = new C73306Spq();
                    C2068389v c2068389v4 = new C2068389v();
                    c2068389v4.LIZ = R.raw.icon_large_refresh;
                    Context context4 = getContext();
                    o.LJIIIIZZ(context4, "context");
                    c2068389v4.LIZLLL = C79045V0n.LJI(R.attr.gp, context4);
                    c73306Spq4.LIZJ = 0;
                    c73306Spq4.LIZIZ = c2068389v4;
                    String LJFF7 = C86V.LJFF(R.string.qdp);
                    o.LJIIIIZZ(LJFF7, "getString(R.string.searc…nternet_connection_title)");
                    c73306Spq4.LJFF = LJFF7;
                    String LJFF8 = C86V.LJFF(R.string.qdo);
                    o.LJIIIIZZ(LJFF8, "getString(R.string.searc…rnet_connection_subtitle)");
                    c73306Spq4.LJI = LJFF8;
                    c73306Spq4.LJII = new AqS176S0100000_10(listener, 188);
                    c73305Spp4.setStatus(c73306Spq4);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            default:
                return;
        }
    }
}
