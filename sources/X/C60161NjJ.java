package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NjJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60161NjJ extends FrameLayout {
    public final C73305Spp LJLIL;
    public String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60161NjJ(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLILLLLZI = "safe";
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bvl, this, true);
        View findViewById = findViewById(R.id.lm2);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tsv_landing_page_safe_status)");
        this.LJLIL = (C73305Spp) findViewById;
    }

    public final void setCurrentStatus$anchor_business_release(String status) {
        o.LJIIIZ(status, "status");
        this.LJLILLLLZI = status;
    }

    public final void setCurrentStatusView$anchor_business_release(InterfaceC60115NiZ listener) {
        o.LJIIIZ(listener, "listener");
        String str = this.LJLILLLLZI;
        int hashCode = str.hashCode();
        if (hashCode != -1684858151) {
            if (hashCode != -1095865757) {
                if (hashCode != 226612223 || !str.equals("no_internet")) {
                    return;
                }
                C73305Spp c73305Spp = this.LJLIL;
                if (c73305Spp != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_large_refresh;
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    c2068389v.LIZLLL = C79045V0n.LJI(R.attr.gp, context);
                    c73306Spq.LIZJ = 0;
                    c73306Spq.LIZIZ = c2068389v;
                    String LJFF = C86V.LJFF(R.string.im9);
                    o.LJIIIIZZ(LJFF, "getString(R.string.network_error)");
                    c73306Spq.LJFF = LJFF;
                    String LJFF2 = C86V.LJFF(R.string.g5t);
                    o.LJIIIIZZ(LJFF2, "getString(R.string.error_retry)");
                    c73306Spq.LJI = LJFF2;
                    c73306Spq.LJII = new AqS176S0100000_10(listener, LiveTryModeCountDownThresholdSetting.DEFAULT);
                    c73305Spp.setStatus(c73306Spq);
                    return;
                }
                o.LJIJI("statusView");
                throw null;
            }
            if (!str.equals("not_secure")) {
                return;
            }
            C73305Spp c73305Spp2 = this.LJLIL;
            if (c73305Spp2 != null) {
                C73306Spq c73306Spq2 = new C73306Spq();
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.music_landing_page_icon_unsafe_website;
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                c2068389v2.LIZLLL = C79045V0n.LJI(R.attr.gp, context2);
                c73306Spq2.LIZJ = 0;
                c73306Spq2.LIZIZ = c2068389v2;
                String LJFF3 = C86V.LJFF(R.string.s8f);
                o.LJIIIIZZ(LJFF3, "getString(R.string.ticke…sSite_blockedPage_header)");
                c73306Spq2.LJFF = LJFF3;
                String LJFF4 = C86V.LJFF(R.string.s8e);
                o.LJIIIIZZ(LJFF4, "getString(R.string.ticke…ousSite_blockedPage_desc)");
                c73306Spq2.LJI = LJFF4;
                c73306Spq2.LJII = new AqS176S0100000_10(listener, 118);
                c73305Spp2.setStatus(c73306Spq2);
                return;
            }
            o.LJIJI("statusView");
            throw null;
        }
        if (!str.equals("protection")) {
            return;
        }
        C73305Spp c73305Spp3 = this.LJLIL;
        if (c73305Spp3 != null) {
            C73306Spq c73306Spq3 = new C73306Spq();
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_large_protection;
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            c2068389v3.LIZLLL = C79045V0n.LJI(R.attr.gp, context3);
            c73306Spq3.LIZJ = 0;
            c73306Spq3.LIZIZ = c2068389v3;
            String LJFF5 = C86V.LJFF(R.string.s8k);
            o.LJIIIIZZ(LJFF5, "getString(R.string.ticke…kAlert_unsafePage_header)");
            c73306Spq3.LJFF = LJFF5;
            String LJFF6 = C86V.LJFF(R.string.s8j);
            o.LJIIIIZZ(LJFF6, "getString(R.string.ticke…iskAlert_unsafePage_desc)");
            c73306Spq3.LJI = LJFF6;
            c73306Spq3.LJII = new AqS176S0100000_10(listener, 119);
            c73305Spp3.setStatus(c73306Spq3);
            return;
        }
        o.LJIJI("statusView");
        throw null;
    }
}
