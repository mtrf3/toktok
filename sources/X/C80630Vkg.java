package X;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.Vkg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80630Vkg implements InterfaceC80631Vkh, Closeable {
    public ByteBuffer LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI = System.identityHashCode(this);

    @Override // X.InterfaceC80631Vkh, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.LJLIL = null;
    }

    @Override // X.InterfaceC80631Vkh
    public final synchronized ByteBuffer getByteBuffer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC80631Vkh
    public final synchronized boolean isClosed() {
        boolean z;
        if (this.LJLIL != null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    @Override // X.InterfaceC80631Vkh
    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // X.InterfaceC80631Vkh
    public final int getSize() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC80631Vkh
    public final long getUniqueId() {
        return this.LJLJI;
    }

    public C80630Vkg(int i) {
        this.LJLIL = ByteBuffer.allocateDirect(i);
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC80631Vkh
    public final synchronized byte read(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        if (i < this.LJLILLLLZI) {
            z3 = true;
        }
        C32151Nz.LJI(z3);
        return this.LJLIL.get(i);
    }

    public final void LIZ(InterfaceC80631Vkh interfaceC80631Vkh, int i) {
        if (interfaceC80631Vkh instanceof C80630Vkg) {
            C32151Nz.LJIIIZ(!isClosed());
            C32151Nz.LJIIIZ(!interfaceC80631Vkh.isClosed());
            C77123UOp.LJIJ(0, interfaceC80631Vkh.getSize(), 0, i, this.LJLILLLLZI);
            this.LJLIL.position(0);
            interfaceC80631Vkh.getByteBuffer().position(0);
            byte[] bArr = new byte[i];
            this.LJLIL.get(bArr, 0, i);
            interfaceC80631Vkh.getByteBuffer().put(bArr, 0, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // X.InterfaceC80631Vkh
    public final void copy(int i, InterfaceC80631Vkh interfaceC80631Vkh, int i2, int i3) {
        interfaceC80631Vkh.getClass();
        if (interfaceC80631Vkh.getUniqueId() == this.LJLJI) {
            C32151Nz.LJI(false);
        }
        if (interfaceC80631Vkh.getUniqueId() < this.LJLJI) {
            synchronized (interfaceC80631Vkh) {
                synchronized (this) {
                    LIZ(interfaceC80631Vkh, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC80631Vkh) {
                    LIZ(interfaceC80631Vkh, i3);
                }
            }
        }
    }

    @Override // X.InterfaceC80631Vkh
    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int min;
        bArr.getClass();
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        min = Math.min(Math.max(0, this.LJLILLLLZI - i), i3);
        C77123UOp.LJIJ(i, bArr.length, i2, min, this.LJLILLLLZI);
        this.LJLIL.position(i);
        this.LJLIL.get(bArr, i2, min);
        return min;
    }

    @Override // X.InterfaceC80631Vkh
    public final synchronized int write(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int min;
        bArr.getClass();
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        min = Math.min(Math.max(0, this.LJLILLLLZI - i), i3);
        C77123UOp.LJIJ(i, bArr.length, i2, min, this.LJLILLLLZI);
        this.LJLIL.position(i);
        this.LJLIL.put(bArr, i2, min);
        return min;
    }
}
