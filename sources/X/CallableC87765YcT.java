package X;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.YcT, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class CallableC87765YcT<V> implements Callable {
    public final /* synthetic */ C87764YcS LJLIL;

    public CallableC87765YcT(C87764YcS c87764YcS) {
        this.LJLIL = c87764YcS;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLIL.LJ().LJLJJL = true;
        C87764YcS c87764YcS = this.LJLIL;
        c87764YcS.LJIIIZ.LIZJ(((YXR) c87764YcS.LJIIIIZZ.getValue()).LJLJJI, o.LJIILLIIL("_watermark", this.LJLIL.LJI.LIZ));
        return C76800UCe.LIZ;
    }
}
