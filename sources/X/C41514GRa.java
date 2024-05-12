package X;

import android.app.Activity;
import android.text.Spannable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GRa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41514GRa implements GQ2<GR9> {
    @Override // X.GQ2
    public final Spannable LIZ(GRT renderContext, GR9 gr9) {
        Spannable LIZIZ;
        GR9 block = gr9;
        o.LJIIIZ(renderContext, "renderContext");
        o.LJIIIZ(block, "block");
        Activity LIZLLL = renderContext.LIZLLL();
        String LJIILL = block.LJIILL();
        GRQ LIZIZ2 = renderContext.LIZIZ();
        if (LJIILL.length() > 71) {
            String string = LIZLLL.getString(R.string.h0g, 70);
            o.LJIIIIZZ(string, "activity.getString(R.str…oast, HASHTAG_MAX_LENGTH)");
            C5S1 c5s1 = new C5S1(LIZLLL);
            c5s1.LIZLLL(string);
            c5s1.LJ();
            LIZIZ = GRQ.LIZIZ(LJIILL.subSequence(0, 71));
        } else {
            LIZIZ = GRQ.LIZIZ(LJIILL);
        }
        LIZIZ.setSpan(LIZIZ2.LIZ(LIZLLL, block), 0, LIZIZ.length(), 33);
        return LIZIZ;
    }
}
