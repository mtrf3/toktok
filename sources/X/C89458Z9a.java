package X;

import Y.ACListenerS36S0100000_16;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Z9a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89458Z9a extends C6DA {
    public final InterfaceC89459Z9b LJIIJ;

    @Override // X.C6DA
    public final View LJFF() {
        LinearLayout LIZLLL = LIZLLL();
        LinearLayout LIZIZ = LIZIZ(R.drawable.tb, R.string.e3g);
        C16880lQ.LJIIZILJ(LIZIZ, new ACListenerS36S0100000_16(this, 23));
        LIZLLL.addView(LIZIZ);
        LIZLLL.addView(LIZIZ(R.drawable.t9, R.string.ozy));
        LIZLLL.addView(LIZIZ(R.drawable.tc, R.string.ozz));
        return LIZLLL;
    }

    @Override // X.C6DA
    public final boolean LIZ(C6DL c6dl) {
        o.LJIIIZ(c6dl, "<this>");
        C6DO c6do = new C6DO();
        c6do.LIZ = R.drawable.tb;
        c6do.LIZJ = R.string.e3g;
        c6do.LJFF = new ACListenerS36S0100000_16(this, 20);
        ((ArrayList) c6dl.LIZIZ).add(c6do);
        C6DO c6do2 = new C6DO();
        c6do2.LIZ = R.drawable.t9;
        c6do2.LIZJ = R.string.ozy;
        c6do2.LJFF = new ACListenerS36S0100000_16(this, 21);
        ((ArrayList) c6dl.LIZIZ).add(c6do2);
        C6DO c6do3 = new C6DO();
        c6do3.LIZ = R.drawable.tc;
        c6do3.LIZJ = R.string.ozz;
        c6do3.LJFF = new ACListenerS36S0100000_16(this, 22);
        ((ArrayList) c6dl.LIZIZ).add(c6do3);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89458Z9a(View contentView, C6BP c6bp, C156646Cu c156646Cu) {
        super(contentView, c6bp);
        o.LJIIIZ(contentView, "contentView");
        this.LJIIJ = c156646Cu;
    }
}
