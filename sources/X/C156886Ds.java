package X;

import Y.ACListenerS22S0100000_2;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156886Ds extends C6DA {
    @Override // X.C6DA
    public final View LJFF() {
        LinearLayout LIZLLL = LIZLLL();
        LinearLayout LIZIZ = LIZIZ(R.drawable.tb, R.string.e3g);
        C16880lQ.LJIIZILJ(LIZIZ, new ACListenerS22S0100000_2(this, 108));
        LIZLLL.addView(LIZIZ);
        return LIZLLL;
    }

    @Override // X.C6DA
    public final boolean LIZ(C6DL c6dl) {
        o.LJIIIZ(c6dl, "<this>");
        C6DO c6do = new C6DO();
        c6do.LIZ = R.drawable.tb;
        c6do.LIZJ = R.string.e3g;
        c6do.LJFF = new ACListenerS22S0100000_2(this, 107);
        ((ArrayList) c6dl.LIZIZ).add(c6do);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156886Ds(View contentView, C6BP c6bp) {
        super(contentView, c6bp);
        o.LJIIIZ(contentView, "contentView");
    }
}
