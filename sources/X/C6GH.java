package X;

import Y.ACListenerS22S0100000_2;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6GH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GH extends C6DA {
    public final InterfaceC65784Pro<EnumC157466Fy> LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;

    @Override // X.C6DA
    public final View LJFF() {
        LinearLayout LIZLLL = LIZLLL();
        int i = C157476Fz.LIZ[this.LJIIJ.invoke().ordinal()];
        if (i != 1) {
            if (i == 2) {
                LinearLayout LIZIZ = LIZIZ(R.drawable.tb, R.string.e3g);
                C16880lQ.LJIIZILJ(LIZIZ, new ACListenerS22S0100000_2(this, 7));
                LIZLLL.addView(LIZIZ);
            }
        } else {
            LinearLayout LIZIZ2 = LIZIZ(R.drawable.t9, R.string.e43);
            C16880lQ.LJIIZILJ(LIZIZ2, new ACListenerS22S0100000_2(this, 4));
            LinearLayout LIZIZ3 = LIZIZ(R.drawable.u0, R.string.pmj);
            C16880lQ.LJIIZILJ(LIZIZ3, new ACListenerS22S0100000_2(this, 5));
            LinearLayout LIZIZ4 = LIZIZ(R.drawable.tb, R.string.e3g);
            C16880lQ.LJIIZILJ(LIZIZ4, new ACListenerS22S0100000_2(this, 6));
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJIIL.getValue();
            if (videoPublishEditModel == null || !H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
                LIZLLL.addView(LIZIZ3);
                LIZLLL.addView(LIZJ());
            }
            LIZLLL.addView(LIZIZ2);
            LIZLLL.addView(LIZJ());
            LIZLLL.addView(LIZIZ4);
        }
        return LIZLLL;
    }

    @Override // X.C6DA
    public final boolean LIZ(C6DL c6dl) {
        o.LJIIIZ(c6dl, "<this>");
        int i = C157476Fz.LIZ[this.LJIIJ.invoke().ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                C6DO c6do = new C6DO();
                c6do.LIZ = R.drawable.tb;
                c6do.LIZJ = R.string.e3g;
                c6do.LJFF = new ACListenerS22S0100000_2(this, 3);
                ((ArrayList) c6dl.LIZIZ).add(c6do);
            }
        } else {
            C6DO c6do2 = new C6DO();
            c6do2.LIZ = R.drawable.t9;
            c6do2.LIZJ = R.string.e43;
            c6do2.LJFF = new ACListenerS22S0100000_2(this, 0);
            ((ArrayList) c6dl.LIZIZ).add(c6do2);
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJIIL.getValue();
            if (videoPublishEditModel != null && H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
                i2 = 1;
            } else {
                C6DO c6do3 = new C6DO();
                c6do3.LIZ = R.drawable.u0;
                c6do3.LIZJ = R.string.pmj;
                c6do3.LJFF = new ACListenerS22S0100000_2(this, 1);
                ((ArrayList) c6dl.LIZIZ).add(c6do3);
            }
            C6DO c6do4 = new C6DO();
            c6do4.LIZ = R.drawable.tb;
            c6do4.LIZJ = R.string.e3g;
            c6do4.LJFF = new ACListenerS22S0100000_2(this, 2);
            ((ArrayList) c6dl.LIZIZ).add(c6do4);
            LJIIJJI(i2 + 1);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6GH(View contentView, C82622Wbi c82622Wbi, AqS152S0100000_2 aqS152S0100000_2, C157396Fr c157396Fr) {
        super(contentView, c157396Fr);
        o.LJIIIZ(contentView, "contentView");
        this.LJIIJ = aqS152S0100000_2;
        this.LJIIJJI = C221108m2.LIZIZ(new AqS152S0100000_2(c82622Wbi, 2));
        this.LJIIL = C221108m2.LIZIZ(new AqS152S0100000_2(c82622Wbi, 3));
    }
}
