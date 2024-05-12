package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NSs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractViewOnClickListenerC59394NSs implements View.OnClickListener {
    public final LinearLayout LJLIL;
    public final Context LJLILLLLZI;
    public final Aweme LJLJI;
    public final InterfaceC59400NSy LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public abstract void LIZJ();

    public abstract void LIZLLL(View view);

    public final TextView LIZIZ() {
        return (TextView) this.LJLJJL.getValue();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        boolean LJLJJL = C63081OpJ.LJLJJL(this.LJLJI);
        if (!this.LJLJI.isAd() && LJLJJL) {
            if (view != null) {
                AnonymousClass030.LJ(view, R.string.b95);
                return;
            }
            return;
        }
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.d6l) {
                this.LJLJJI.LIZ(3);
                this.LJLJJI.LIZJ(false, true);
                return;
            }
            if (valueOf.intValue() == R.id.d6n || valueOf.intValue() == R.id.d6p) {
                if (this.LJLJI.isAd()) {
                    AwemeRawAd awemeRawAd = this.LJLJI.getAwemeRawAd();
                    C55707Ltf c55707Ltf = new C55707Ltf();
                    c55707Ltf.LIZ = awemeRawAd;
                    c55707Ltf.LIZIZ = "button";
                    JSONObject LIZ = c55707Ltf.LIZ();
                    o.LJIIIIZZ(LIZ, "ExtraJsonBuilder()\n     …                .create()");
                    if (awemeRawAd != null) {
                        C58776N4y.LIZ("background_ad", "replay", LIZ, awemeRawAd);
                        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(4);
                        if (LIZLLL != null && (LIZLLL instanceof InterfaceC58848N7s)) {
                            ((InterfaceC58848N7s) LIZLLL).LJIIIZ(awemeRawAd);
                        }
                    }
                    C58655N0h LIZLLL2 = C58704N2e.LIZLLL("background_ad", "replay", awemeRawAd);
                    LIZLLL2.LIZJ("button", "refer");
                    LIZLLL2.LIZIZ(0, "is_lynx");
                    LIZLLL2.LJII();
                    this.LJLJJI.LIZIZ();
                }
                this.LJLJJI.LIZJ(true, false);
                return;
            }
        }
        LIZLLL(view);
    }

    public AbstractViewOnClickListenerC59394NSs(LinearLayout feedAdLayout, NQD nqd) {
        o.LJIIIZ(feedAdLayout, "feedAdLayout");
        this.LJLIL = feedAdLayout;
        Context context = nqd.LIZ;
        if (context != null) {
            this.LJLILLLLZI = context;
            Aweme aweme = nqd.LIZIZ;
            if (aweme != null) {
                this.LJLJI = aweme;
                InterfaceC59400NSy interfaceC59400NSy = nqd.LIZJ;
                if (interfaceC59400NSy != null) {
                    this.LJLJJI = interfaceC59400NSy;
                    if (nqd.LIZLLL != null) {
                        this.LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 447));
                        this.LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 448));
                        return;
                    } else {
                        o.LJIJI("eventType");
                        throw null;
                    }
                }
                o.LJIJI("adMaskCallback");
                throw null;
            }
            o.LJIJI("aweme");
            throw null;
        }
        o.LJIJI("context");
        throw null;
    }

    public final View LIZ(int i, ViewGroup rootView) {
        o.LJIIIZ(rootView, "rootView");
        View findViewById = rootView.findViewById(R.id.det);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.fl_mask_content)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        viewGroup.removeAllViews();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLILLLLZI), i, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "from(mContext).inflate(layout, frameLayout, false)");
        viewGroup.addView(LLLLIILL);
        C16880lQ.LJIIZILJ(this.LJLIL, this);
        return LLLLIILL;
    }
}
