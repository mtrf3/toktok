package X;

import Y.IDCListenerS242S0100000_1;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.486, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass486 {
    public final View LIZ;
    public C109544Rq LIZIZ;
    public String LIZJ;
    public final C62822Ol8 LIZLLL;
    public String LJ;
    public final C62822Ol8 LJFF;
    public boolean LJI;

    public final C77869UhF LIZJ() {
        return (C77869UhF) this.LIZLLL.getValue();
    }

    public final void LIZ() {
        C77869UhF LIZJ = LIZJ();
        if (LIZJ == null) {
            return;
        }
        this.LJI = false;
        this.LIZJ = null;
        LIZJ.setVisibility(8);
        if (LIZJ.isAnimating()) {
            LIZJ.cancelAnimation();
        }
    }

    public final void LIZIZ() {
        C77869UhF LIZJ = LIZJ();
        if (LIZJ == null) {
            return;
        }
        LIZJ.setVisibility(8);
        this.LIZJ = null;
        C109544Rq c109544Rq = this.LIZIZ;
        if (c109544Rq != null && !C46U.LJFF(c109544Rq)) {
            java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
            o.LJIIIIZZ(localExt, "localExt");
            localExt.put("IS_DONE_SUG_ANIME", "1");
            C106674Gp.LJIILJJIL(c109544Rq);
        }
        LIZJ.updateBitmap(CardStruct.IStatusCode.DEFAULT, null);
    }

    public final void LIZLLL() {
        C77869UhF LIZJ = LIZJ();
        if (LIZJ != null && this.LJI && this.LIZ.isAttachedToWindow() && LIZJ.getVisibility() == 0 && C78685UuP.LJJJZ(this.LJ)) {
            C109544Rq c109544Rq = this.LIZIZ;
            if (c109544Rq != null && C46U.LJFF(c109544Rq)) {
                return;
            }
            if (LIZJ.isAnimating() && !o.LJ(this.LIZJ, this.LJ)) {
                LIZJ.cancelAnimation();
            }
            if (LIZJ.isAnimating()) {
                return;
            }
            LIZJ.setVisibility(0);
            this.LIZJ = this.LJ;
            LIZJ.updateBitmap(CardStruct.IStatusCode.DEFAULT, null);
            LIZJ.playAnimation();
            this.LJI = false;
        }
    }

    public AnonymousClass486(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        this.LIZ = itemView;
        this.LIZLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 846));
        this.LJFF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 847));
        itemView.addOnAttachStateChangeListener(new IDCListenerS242S0100000_1(this, 1));
    }
}
