package X;

import Y.ACListenerS23S0100100_5;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UOK extends AbstractC77108UOa {
    public final C5H3 LJIIL;

    @Override // X.AbstractC77108UOa
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC77108UOa
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC30642C0w
    public final View LIZJ() {
        View view = (View) this.LJIIL.getValue();
        o.LJIIIIZZ(view, "view");
        return view;
    }

    @Override // X.AbstractC77108UOa
    public final C47121t6 LJIIIIZZ() {
        View findViewById = LJII().findViewById(R.id.bwf);
        o.LJIIIIZZ(findViewById, "contentView.findViewById(id)");
        return (C47121t6) findViewById;
    }

    public UOK(Context context, long j, UOT uot, ACListenerS23S0100100_5 aCListenerS23S0100100_5) {
        super(context, j, uot, aCListenerS23S0100100_5);
        this.LJIIL = C78996UzQ.LJJIJIIJI(new AqS151S0200000_4(context, this, 41));
    }
}
