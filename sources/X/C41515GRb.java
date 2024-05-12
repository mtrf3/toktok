package X;

import android.app.Activity;
import android.text.Spannable;
import kotlin.jvm.internal.o;

/* renamed from: X.GRb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41515GRb implements GQ2<C41509GQv> {
    @Override // X.GQ2
    public final Spannable LIZ(GRT renderContext, C41509GQv c41509GQv) {
        C41509GQv block = c41509GQv;
        o.LJIIIZ(renderContext, "renderContext");
        o.LJIIIZ(block, "block");
        String LJIILL = block.LJIILL();
        GRQ LIZIZ = renderContext.LIZIZ();
        Spannable LIZIZ2 = GRQ.LIZIZ(LJIILL);
        int length = LIZIZ2.length();
        Activity LIZLLL = renderContext.LIZLLL();
        LIZIZ2.setSpan(LIZIZ.LIZ(LIZLLL, block), 0, length, 33);
        LIZIZ2.setSpan(new C8FD(LIZLLL, new C41523GRj(renderContext)), 0, length, 33);
        renderContext.LIZJ().LIZ(GRD.VIDEO);
        return LIZIZ2;
    }
}
