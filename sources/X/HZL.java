package X;

import Y.ARunnableS43S0100000_7;
import android.os.Looper;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZL implements InterfaceC45863HzH {
    public final I0N LJLIL;
    public final SafeHandler LJLILLLLZI;

    @Override // X.InterfaceC45863HzH
    public final boolean LIZ() {
        return HZZ.LIZ();
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            this.LJLIL.bi0();
        } else {
            this.LJLILLLLZI.post(new ARunnableS43S0100000_7(this, 106));
        }
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        return EnumC45752HxU.P0;
    }

    public HZL(I0N i0n, SafeHandler handler) {
        o.LJIIIZ(handler, "handler");
        this.LJLIL = i0n;
        this.LJLILLLLZI = handler;
    }
}
