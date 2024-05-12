package X;

import Y.AfS60S0100000_8;
import android.os.Looper;
import androidx.lifecycle.Observer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Jtg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50612Jtg implements Observer<Integer> {
    public final ActivityC45651qj LJLIL;

    public C50612Jtg(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        Integer num2 = num;
        if (num2 == null) {
            return;
        }
        if (num2.intValue() == 1) {
            C50594JtO c50594JtO = C50594JtO.LIZ;
            ActivityC45651qj activity = this.LJLIL;
            c50594JtO.getClass();
            o.LJIIIZ(activity, "activity");
            HandlerC50613Jth handlerC50613Jth = C50594JtO.LIZIZ;
            if (handlerC50613Jth == null) {
                Looper looper = C06M.LIZ("feed-search-icon").getLooper();
                o.LJIIIIZZ(looper, "thread.looper");
                handlerC50613Jth = new HandlerC50613Jth(looper);
                C50594JtO.LIZIZ = handlerC50613Jth;
            }
            if (handlerC50613Jth.hasMessages(1)) {
                return;
            }
            handlerC50613Jth.LIZ = new WeakReference<>(activity);
            handlerC50613Jth.LIZIZ = (C73411SrX) C84763XOl.LJIIJ.LJJJJLL().LJJJJZI(new AfS60S0100000_8(handlerC50613Jth, 7));
            handlerC50613Jth.LIZIZ(((Number) handlerC50613Jth.LJ.getValue()).longValue());
            return;
        }
        if (num2.intValue() != 2) {
            return;
        }
        C50594JtO.LIZ.getClass();
        HandlerC50613Jth handlerC50613Jth2 = C50594JtO.LIZIZ;
        if (handlerC50613Jth2 == null) {
            return;
        }
        handlerC50613Jth2.LIZJ();
    }
}
