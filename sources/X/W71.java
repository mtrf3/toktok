package X;

/* loaded from: classes15.dex */
public final class W71 implements InterfaceC81759W6x<W8X> {
    public final W70<W8X>[] LIZ;

    public W71(W70<W8X>... w70Arr) {
        this.LIZ = w70Arr;
        C32151Nz.LJII(0, w70Arr.length);
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        if (interfaceC81770W7i.LJ().LJIIIIZZ == null) {
            w7f.LIZIZ(1, null);
        } else {
            if (LIZJ(0, w7f, interfaceC81770W7i)) {
                return;
            }
            w7f.LIZIZ(1, null);
        }
    }

    public final boolean LIZJ(int i, W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        C79238V7y c79238V7y = interfaceC81770W7i.LJ().LJIIIIZZ;
        while (true) {
            W70<W8X>[] w70Arr = this.LIZ;
            if (i < w70Arr.length) {
                if (w70Arr[i].LIZ(c79238V7y)) {
                    if (i == -1) {
                        return false;
                    }
                    this.LIZ[i].LIZIZ(new W72(this, w7f, interfaceC81770W7i, i), interfaceC81770W7i);
                    return true;
                }
                i++;
            } else {
                return false;
            }
        }
    }
}
