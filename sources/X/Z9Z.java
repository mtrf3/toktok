package X;

import Y.ACListenerS36S0100000_16;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class Z9Z extends C6DA {
    @Override // X.C6DA
    public final View LJFF() {
        LinearLayout LIZLLL = LIZLLL();
        LinearLayout LIZIZ = LIZIZ(R.drawable.t9, R.string.e43);
        LinearLayout LIZIZ2 = LIZIZ(R.drawable.tb, R.string.e3g);
        C16880lQ.LJIIZILJ(LIZIZ, new ACListenerS36S0100000_16(this, 26));
        C16880lQ.LJIIZILJ(LIZIZ2, new ACListenerS36S0100000_16(this, 27));
        LIZLLL.addView(LIZIZ);
        LIZLLL.addView(LIZIZ2);
        return LIZLLL;
    }

    @Override // X.C6DA
    public final boolean LIZ(C6DL c6dl) {
        o.LJIIIZ(c6dl, "<this>");
        C6DO c6do = new C6DO();
        c6do.LIZ = R.drawable.t9;
        c6do.LIZJ = R.string.e43;
        c6do.LJFF = new ACListenerS36S0100000_16(this, 24);
        ((ArrayList) c6dl.LIZIZ).add(c6do);
        C6DO c6do2 = new C6DO();
        c6do2.LIZ = R.drawable.tb;
        c6do2.LIZJ = R.string.e3g;
        c6do2.LJFF = new ACListenerS36S0100000_16(this, 25);
        ((ArrayList) c6dl.LIZIZ).add(c6do2);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z9Z(View contentView, C6BP c6bp) {
        super(contentView, c6bp);
        o.LJIIIZ(contentView, "contentView");
    }
}
