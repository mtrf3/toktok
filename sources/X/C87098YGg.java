package X;

import android.graphics.PointF;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.YGg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87098YGg {
    public final ViewOnTouchListenerC87097YGf LIZ;
    public C87113YGv LIZIZ;
    public String LIZJ;
    public AwemePlayFunModel LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public final C62822Ol8 LJII;
    public DataCenter LJIIIIZZ;
    public final boolean LJIIIZ;
    public long LJIIJ;
    public NL9 LJIIJJI;
    public String LJIIL;
    public final HashMap<String, String> LJIILIIL;
    public final HashMap<String, AbstractC87105YGn> LJIILJJIL;

    public final PointF LIZ() {
        int LIZ;
        float f = ((1 - this.LIZIZ.LIZLLL) / 2.0f) * r1.LIZ;
        float LIZJ = KL2.LIZJ(EF7.LIZIZ(), 12.0f) - f;
        if (C90193gN.LIZ()) {
            LIZJ = -LIZJ;
        }
        if (this.LJII.getValue() != null) {
            View view = (View) this.LJII.getValue();
            o.LJI(view);
            LIZ = C87115YGx.LIZ(view);
        } else {
            LIZ = C87115YGx.LIZ(this.LIZ) + this.LIZ.getHeight();
        }
        return new PointF(LIZJ, (((LIZ - C87115YGx.LIZ(this.LIZ)) - this.LIZIZ.LIZ) + f) - KL2.LIZJ(EF7.LIZIZ(), 8.0f));
    }

    public final void LIZLLL() {
        this.LJFF.setAlpha(0.0f);
        this.LJI.setAlpha(0.0f);
        this.LJ.setAlpha(0.0f);
        Iterator LJ = C06540Nm.LJ(this.LJIILJJIL, "stateTable.values");
        while (LJ.hasNext()) {
            ((AbstractC87105YGn) LJ.next()).LJ();
        }
        this.LIZJ = "IdleState";
    }

    public C87098YGg(ViewOnTouchListenerC87097YGf playFunView) {
        o.LJIIIZ(playFunView, "playFunView");
        this.LIZ = playFunView;
        this.LIZIZ = new C87113YGv();
        this.LIZJ = "IdleState";
        View findViewById = playFunView.findViewById(R.id.tf);
        o.LJIIIIZZ(findViewById, "playFunView.findViewById…d.ad_play_fun_background)");
        this.LJ = findViewById;
        View findViewById2 = playFunView.findViewById(R.id.tg);
        o.LJIIIIZZ(findViewById2, "playFunView.findViewById…id.ad_play_fun_egg_image)");
        this.LJFF = findViewById2;
        View findViewById3 = playFunView.findViewById(R.id.th);
        o.LJIIIIZZ(findViewById3, "playFunView.findViewById…id.ad_play_fun_egg_title)");
        this.LJI = findViewById3;
        this.LJII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 14));
        this.LJIIIZ = true;
        this.LJIIL = "";
        this.LJIILIIL = C113554cx.LJJJLZIJ(new OSZ("IdleState", "ExpandState"), new OSZ("ExpandState", "EggShowState"), new OSZ("EggShowState", "CollapseState"), new OSZ("CollapseState", "WidgetShowState"), new OSZ("WidgetShowState", "FinishState"));
        this.LJIILJJIL = C113554cx.LJJJLZIJ(new OSZ("IdleState", new C87109YGr(this)), new OSZ("ExpandState", new C87103YGl(this)), new OSZ("EggShowState", new C87102YGk(this)), new OSZ("CollapseState", new C87101YGj(this)), new OSZ("WidgetShowState", new C87100YGi(this)), new OSZ("FinishState", new C87114YGw(this)));
    }

    public final void LIZIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LIZJ = "FinishState";
            return;
        }
        String str = this.LJIILIIL.get(this.LIZJ);
        if (str == null) {
            return;
        }
        this.LIZJ = str;
        AbstractC87105YGn abstractC87105YGn = this.LJIILJJIL.get(str);
        if (abstractC87105YGn == null) {
            return;
        }
        abstractC87105YGn.LIZIZ();
    }

    public final void LIZJ(String str) {
        AwemeRawAd awemeRawAd;
        ViewOnTouchListenerC87097YGf viewOnTouchListenerC87097YGf = this.LIZ;
        viewOnTouchListenerC87097YGf.getClass();
        Aweme aweme = viewOnTouchListenerC87097YGf.LJLJL;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C025908h.LIZLLL("draw_ad", "othershow", awemeRawAd, str, "refer");
    }
}
