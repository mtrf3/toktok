package X;

import Y.ACListenerS36S0100000_16;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Z9e, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89462Z9e extends C6DA {
    public final boolean LJIIJ;

    @Override // X.C6DA
    public final View LJFF() {
        LinearLayout LIZLLL = LIZLLL();
        if (!this.LJIIJ) {
            LinearLayout LIZIZ = LIZIZ(R.drawable.t9, R.string.fm_);
            C16880lQ.LJIIZILJ(LIZIZ, new ACListenerS36S0100000_16(this, 14));
            View LIZJ = LIZJ();
            LIZLLL.addView(LIZIZ);
            LIZLLL.addView(LIZJ);
        }
        LinearLayout LIZIZ2 = LIZIZ(R.drawable.ay0, R.string.bxf);
        C16880lQ.LJIIZILJ(LIZIZ2, new ACListenerS36S0100000_16(this, 15));
        LIZLLL.addView(LIZIZ2);
        return LIZLLL;
    }

    @Override // X.C6DA
    public final boolean LIZ(C6DL c6dl) {
        o.LJIIIZ(c6dl, "<this>");
        if (!this.LJIIJ) {
            C6DO c6do = new C6DO();
            c6do.LIZ = R.drawable.t9;
            c6do.LIZJ = R.string.bwv;
            c6do.LJFF = new ACListenerS36S0100000_16(this, 12);
            ((ArrayList) c6dl.LIZIZ).add(c6do);
            LJIIJJI(2);
        }
        C6DO c6do2 = new C6DO();
        c6do2.LIZ = R.drawable.ay0;
        c6do2.LIZJ = R.string.bxf;
        c6do2.LJFF = new ACListenerS36S0100000_16(this, 13);
        ((ArrayList) c6dl.LIZIZ).add(c6do2);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89462Z9e(View contentView, C1552567l c1552567l, boolean z) {
        super(contentView, c1552567l);
        o.LJIIIZ(contentView, "contentView");
        this.LJIIJ = z;
    }
}
