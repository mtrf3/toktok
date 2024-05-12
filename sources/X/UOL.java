package X;

import Y.ACListenerS23S0100100_5;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UOL extends AbstractC77108UOa {
    public final C5H3 LJIIL;
    public final C5H3 LJIILIIL;

    @Override // X.InterfaceC30642C0w
    public final View LIZJ() {
        View view = (View) this.LJIILIIL.getValue();
        o.LJIIIIZZ(view, "view");
        return view;
    }

    @Override // X.AbstractC77108UOa
    public final void LJIIIZ() {
        C29306Beo.LJJLJLI((View) this.LJIIL.getValue());
        C29701Eo c29701Eo = (C29701Eo) this.LJIIL.getValue();
        if (c29701Eo != null) {
            UOT uot = this.LIZLLL;
            C15490jB.LJIIIIZZ(c29701Eo, uot.LJLIL, uot.LJLILLLLZI);
        }
    }

    @Override // X.AbstractC77108UOa
    public final void LJIIJJI() {
        C29701Eo c29701Eo = (C29701Eo) this.LJIIL.getValue();
        if (c29701Eo != null) {
            c29701Eo.playAnimation();
        }
    }

    @Override // X.AbstractC77108UOa
    public final void LJIIL() {
        C29701Eo c29701Eo = (C29701Eo) this.LJIIL.getValue();
        UOT uot = this.LIZLLL;
        C15490jB.LJIIJ(c29701Eo, uot.LJLIL, uot.LJLJI, true);
    }

    @Override // X.AbstractC77108UOa
    public final C47121t6 LJIIIIZZ() {
        View findViewById = LJII().findViewById(R.id.bwf);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(id)");
        return (C47121t6) findViewById;
    }

    @Override // X.AbstractC77108UOa, X.InterfaceC30642C0w
    public final void LLLLZLL() {
        super.LLLLZLL();
        C29701Eo c29701Eo = (C29701Eo) this.LJIIL.getValue();
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        }
    }

    public UOL(Context context, long j, UOT uot, ACListenerS23S0100100_5 aCListenerS23S0100100_5) {
        super(context, j, uot, aCListenerS23S0100100_5);
        this.LJIIL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(this, 422));
        this.LJIILIIL = C78996UzQ.LJJIJIIJI(new AqS151S0200000_4(context, this, 42));
    }
}
