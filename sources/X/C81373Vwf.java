package X;

/* renamed from: X.Vwf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81373Vwf extends AbstractC81374Vwg {
    public final W8H LJLIL;
    public C81392Vwy<InterfaceC80631Vkh> LJLILLLLZI;
    public int LJLJI;

    public final C80632Vki LIZ() {
        if (C81392Vwy.LJIIJJI(this.LJLILLLLZI)) {
            return new C80632Vki(this.LJLILLLLZI, this.LJLJI);
        }
        throw new C81375Vwh();
    }

    @Override // X.AbstractC81374Vwg, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C81392Vwy.LJ(this.LJLILLLLZI);
        this.LJLILLLLZI = null;
        this.LJLJI = -1;
        super.close();
    }

    public C81373Vwf(W8H w8h) {
        this(w8h, w8h.LJLL[0]);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public C81373Vwf(W8H w8h, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        w8h.getClass();
        this.LJLIL = w8h;
        this.LJLJI = 0;
        this.LJLILLLLZI = C81392Vwy.LJIILIIL(w8h.get(i), w8h);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (C81392Vwy.LJIIJJI(this.LJLILLLLZI)) {
                int i3 = this.LJLJI + i2;
                if (C81392Vwy.LJIIJJI(this.LJLILLLLZI)) {
                    if (i3 > this.LJLILLLLZI.LJI().getSize()) {
                        InterfaceC80631Vkh interfaceC80631Vkh = this.LJLIL.get(i3);
                        this.LJLILLLLZI.LJI().copy(0, interfaceC80631Vkh, 0, this.LJLJI);
                        this.LJLILLLLZI.close();
                        this.LJLILLLLZI = C81392Vwy.LJIILIIL(interfaceC80631Vkh, this.LJLIL);
                    }
                    this.LJLILLLLZI.LJI().write(this.LJLJI, bArr, i, i2);
                    this.LJLJI += i2;
                    return;
                }
                throw new C81375Vwh();
            }
            throw new C81375Vwh();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("length=");
        C15890jp.LIZIZ(LIZ, bArr.length, "; regionStart=", i, "; regionLength=");
        LIZ.append(i2);
        throw new ArrayIndexOutOfBoundsException(X1D.LIZIZ(LIZ));
    }
}
