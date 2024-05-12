package X;

import android.os.HandlerThread;
import kotlin.jvm.internal.o;

/* renamed from: X.Icf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47009Icf implements InterfaceC47032Id2 {
    public final ITZ LIZ;
    public final ITX LIZIZ;
    public HandlerThread LIZJ;

    @Override // X.InterfaceC47032Id2
    public final void release() {
        throw null;
    }

    @Override // X.InterfaceC47032Id2
    public final C47007Icd LIZIZ(IX4 ix4) {
        HandlerThread handlerThread = this.LIZJ;
        if (handlerThread == null) {
            handlerThread = C06M.LIZ("coldBootAsyncPlayThread");
            this.LIZJ = handlerThread;
        }
        String msg = o.LJIILLIIL(C17N.LJJLIIIIJ(handlerThread), "obtain : ");
        o.LJIIIZ(msg, "msg");
        return new C47004Ica(this.LIZ, handlerThread, new IZ7(), this.LIZIZ);
    }

    public C47009Icf(ITZ playerType, ITX itx) {
        o.LJIIIZ(playerType, "playerType");
        this.LIZ = playerType;
        this.LIZIZ = itx;
    }
}
