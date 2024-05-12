package X;

import java.nio.ByteBuffer;

/* renamed from: X.Vki, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80632Vki implements InterfaceC81378Vwk {
    public final int LJLIL;
    public C81392Vwy<InterfaceC80631Vkh> LJLILLLLZI;

    public final synchronized void LIZ() {
        if (isClosed()) {
            throw new C80633Vkj();
        }
    }

    @Override // X.InterfaceC81378Vwk, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        C81392Vwy.LJ(this.LJLILLLLZI);
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC81378Vwk
    public final synchronized ByteBuffer getByteBuffer() {
        return this.LJLILLLLZI.LJI().getByteBuffer();
    }

    @Override // X.InterfaceC81378Vwk
    public final synchronized long getNativePtr() {
        LIZ();
        return this.LJLILLLLZI.LJI().getNativePtr();
    }

    @Override // X.InterfaceC81378Vwk
    public final synchronized boolean isClosed() {
        return !C81392Vwy.LJIIJJI(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC81378Vwk
    public final synchronized int size() {
        LIZ();
        return this.LJLIL;
    }

    @Override // X.InterfaceC81378Vwk
    public final synchronized byte read(int i) {
        boolean z;
        LIZ();
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i >= this.LJLIL) {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        return this.LJLILLLLZI.LJI().read(i);
    }

    public C80632Vki(C81392Vwy<InterfaceC80631Vkh> c81392Vwy, int i) {
        boolean z;
        c81392Vwy.getClass();
        if (i >= 0 && i <= c81392Vwy.LJI().getSize()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        this.LJLILLLLZI = c81392Vwy.clone();
        this.LJLIL = i;
    }

    @Override // X.InterfaceC81378Vwk
    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        LIZ();
        if (i + i3 <= this.LJLIL) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        return this.LJLILLLLZI.LJI().read(i, bArr, i2, i3);
    }
}
