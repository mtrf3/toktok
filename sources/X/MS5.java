package X;

import Y.ACallableS112S0100000_9;
import Y.ARunnableS42S0100000_6;
import Y.AgS120S0100000_2;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MS5 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(MS6.LJLIL);

    public static final boolean LIZLLL() {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            return true;
        }
        return false;
    }

    public static final C10K<C76800UCe> LIZ(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        C10K<C76800UCe> LIZIZ = C10K.LIZIZ(new ACallableS112S0100000_9(block, (InterfaceC65784Pro<C76800UCe>) 0), C10K.LJI, null);
        o.LJIIIIZZ(LIZIZ, "block: () -> Unit): Task…Task.BACKGROUND_EXECUTOR)");
        return LIZIZ;
    }

    public static final int LIZJ(Throwable th) {
        BaseResponse baseResponse;
        if (!(th instanceof C38333F2r)) {
            return -1;
        }
        Object rawResponse = ((C38333F2r) th).getRawResponse();
        if (!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null) {
            return -1;
        }
        return baseResponse.status_code;
    }

    public static final void LJ(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        if (LIZLLL()) {
            block.invoke();
        } else {
            LJFF(block);
        }
    }

    public static final void LJFF(InterfaceC65784Pro block) {
        o.LJIIIZ(block, "block");
        o.LJIIIIZZ(C10K.LIZIZ(new ACallableS112S0100000_9(block, (InterfaceC65784Pro<C76800UCe>) 3), C10K.LJIIIIZZ, null), "block: () -> Unit): Task… Task.UI_THREAD_EXECUTOR)");
    }

    public static final C10K<C76800UCe> LJI(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        C10K<C76800UCe> LIZIZ = C10K.LIZIZ(new ACallableS112S0100000_9(block, (InterfaceC65784Pro<C76800UCe>) 1), (Executor) LIZ.getValue(), null);
        o.LJI(LIZIZ);
        return LIZIZ;
    }

    public static final void LIZIZ(InterfaceC65784Pro<C76800UCe> run, long j) {
        o.LJIIIZ(run, "run");
        if (j > 0) {
            C38995FSd.LJ().schedule(new ARunnableS42S0100000_6((InterfaceC65784Pro) run, 5), j, TimeUnit.SECONDS);
        } else {
            run.invoke();
        }
    }

    public static final void LJII(InterfaceC65784Pro block, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(block, "block");
        o.LJIIIIZZ(C10K.LIZIZ(new ACallableS112S0100000_9(block, (InterfaceC65784Pro<C76800UCe>) 4), (Executor) LIZ.getValue(), null).LJ(new AgS120S0100000_2(interfaceC88472Yns, 5), C10K.LJIIIIZZ, null), "block: () -> T?, mainNex… Task.UI_THREAD_EXECUTOR)");
    }
}
