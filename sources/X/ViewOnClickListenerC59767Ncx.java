package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Ncx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class ViewOnClickListenerC59767Ncx implements YGF, View.OnClickListener {
    public final LinearLayout LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 484));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 483));
    public Context LJLJJI;
    public Aweme LJLJJL;
    public C43659HBn LJLJJLL;

    @Override // X.YGF
    public void LJI() {
        C16880lQ.LJIIZILJ(this.LJLIL, this);
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-adBottomCloseBtn>(...)");
        C16880lQ.LJIIJ(this, (View) value);
        C16880lQ.LJIJI(LJIIJ(), this);
    }

    public final TextView LJIIJ() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-adBottomMoreBtn>(...)");
        return (TextView) value;
    }

    public ViewOnClickListenerC59767Ncx(LinearLayout linearLayout) {
        this.LJLIL = linearLayout;
    }

    @Override // X.YGF
    public void LJII(C59771Nd1 c59771Nd1) {
        this.LJLJJL = c59771Nd1.LIZIZ;
        this.LJLJJI = c59771Nd1.LIZ;
        this.LJLJJLL = c59771Nd1.LIZJ;
        C59894Nf0.LIZ(LJIIJ());
        LJIIJ().setBackground(new C198747r4(C17N.LJIILL(2.0d), NPC.LIZIZ(this.LJLJJI, this.LJLJJL)));
        LJIIJ().setText(C78926UyI.LJIIL(this.LJLJJI, this.LJLJJL, false));
    }
}
