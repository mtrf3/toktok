package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W1J implements W1V {
    public final /* synthetic */ W1H LIZ;

    @Override // X.W1V
    public final boolean LIZIZ(int i) {
        return true;
    }

    public W1J(W1H w1h) {
        this.LIZ = w1h;
    }

    @Override // X.W1V
    public final void LIZ(int i) {
        WRQ wrq = this.LIZ.LJLJLJ;
        if (wrq != null) {
            wrq.y90(W1H.LLJJ(i));
            this.LIZ.LJLILLLLZI.LIZIZ(W1H.LLJJ(i));
        } else {
            o.LJIJI("cameraApiComponent");
            throw null;
        }
    }
}
