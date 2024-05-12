package X;

import Y.ACListenerS36S0100000_16;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Z9f, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89463Z9f extends C6DA {
    public VideoPublishEditModel LJIIJ;

    @Override // X.C6DA
    public final View LJFF() {
        LinearLayout LIZLLL = LIZLLL();
        VideoPublishEditModel videoPublishEditModel = this.LJIIJ;
        if (videoPublishEditModel != null && H7R.LJJJJL(videoPublishEditModel)) {
            LinearLayout LIZIZ = LIZIZ(R.drawable.ay0, R.string.bxf);
            C16880lQ.LJIIZILJ(LIZIZ, new ACListenerS36S0100000_16(this, 9));
            LIZLLL.addView(LIZIZ);
            return LIZLLL;
        }
        LinearLayout LIZIZ2 = LIZIZ(R.drawable.t_, R.string.e3l);
        C16880lQ.LJIIZILJ(LIZIZ2, new ACListenerS36S0100000_16(this, 10));
        LinearLayout LIZIZ3 = LIZIZ(R.drawable.tb, R.string.e3g);
        C16880lQ.LJIIZILJ(LIZIZ3, new ACListenerS36S0100000_16(this, 11));
        if (this.LJIIJ != null) {
            LIZLLL.addView(LIZIZ2);
            LIZLLL.addView(LIZJ());
        }
        LIZLLL.addView(LIZIZ3);
        return LIZLLL;
    }

    @Override // X.C6DA
    public final boolean LIZ(C6DL c6dl) {
        o.LJIIIZ(c6dl, "<this>");
        VideoPublishEditModel videoPublishEditModel = this.LJIIJ;
        if (videoPublishEditModel != null && H7R.LJJJJL(videoPublishEditModel)) {
            C6DO c6do = new C6DO();
            c6do.LIZ = R.drawable.ay0;
            c6do.LIZJ = R.string.bxf;
            c6do.LJFF = new ACListenerS36S0100000_16(this, 6);
            ((ArrayList) c6dl.LIZIZ).add(c6do);
            return true;
        }
        if (this.LJIIJ != null) {
            C6DO c6do2 = new C6DO();
            c6do2.LIZ = R.drawable.t_;
            c6do2.LIZJ = R.string.e3l;
            c6do2.LJFF = new ACListenerS36S0100000_16(this, 7);
            ((ArrayList) c6dl.LIZIZ).add(c6do2);
            LJIIJJI(2);
        }
        C6DO c6do3 = new C6DO();
        c6do3.LIZ = R.drawable.tb;
        c6do3.LIZJ = R.string.e3g;
        c6do3.LJFF = new ACListenerS36S0100000_16(this, 8);
        ((ArrayList) c6dl.LIZIZ).add(c6do3);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89463Z9f(View contentView, AbstractC38911fr abstractC38911fr) {
        super(contentView, abstractC38911fr);
        o.LJIIIZ(contentView, "contentView");
    }
}
