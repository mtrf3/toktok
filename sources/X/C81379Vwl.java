package X;

import java.nio.ByteBuffer;

/* renamed from: X.Vwl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81379Vwl implements InterfaceC81378Vwk, VWQ<C81379Vwl>, InterfaceC81386Vws {
    public final C81392Vwy<InterfaceC81378Vwk> LJLIL;
    public java.util.Map<String, String> LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC81386Vws
    public final void hitMemoryCache() {
        this.LJLJI = true;
    }

    @Override // X.InterfaceC81378Vwk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.LJI().close();
    }

    @Override // X.InterfaceC81378Vwk
    public final ByteBuffer getByteBuffer() {
        return this.LJLIL.LJI().getByteBuffer();
    }

    @Override // X.InterfaceC81378Vwk
    public final long getNativePtr() {
        return this.LJLIL.LJI().getNativePtr();
    }

    @Override // X.InterfaceC81378Vwk
    public final boolean isClosed() {
        return this.LJLIL.LJI().isClosed();
    }

    @Override // X.InterfaceC81378Vwk
    public final int size() {
        return this.LJLIL.LJI().size();
    }

    public C81379Vwl(C81392Vwy<InterfaceC81378Vwk> c81392Vwy) {
        this.LJLIL = c81392Vwy;
    }

    @Override // X.VWQ
    public final void LIZ(C81379Vwl c81379Vwl) {
        c81379Vwl.LJLIL.close();
    }

    @Override // X.InterfaceC81378Vwk
    public final byte read(int i) {
        return this.LJLIL.LJI().read(i);
    }

    @Override // X.InterfaceC81378Vwk
    public final int read(int i, byte[] bArr, int i2, int i3) {
        return this.LJLIL.LJI().read(i, bArr, i2, i3);
    }
}
