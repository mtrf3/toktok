package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.OHr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61655OHr extends InputStream {
    public volatile AtomicBoolean LJLIL = new AtomicBoolean(false);
    public final ByteArrayOutputStream LJLILLLLZI = new ByteArrayOutputStream();
    public final InputStream LJLJI;
    public final InterfaceC61656OHs LJLJJI;

    @Override // java.io.InputStream
    public final int available() {
        return this.LJLJI.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLJI.close();
        InterfaceC61656OHs interfaceC61656OHs = this.LJLJJI;
        if (interfaceC61656OHs != null && !this.LJLIL.get()) {
            byte[] byteArray = this.LJLILLLLZI.toByteArray();
            o.LJIIIIZZ(byteArray, "bufferStream.toByteArray()");
            interfaceC61656OHs.LIZ(byteArray);
            this.LJLIL.set(true);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LJLJI.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.LJLJI.read();
        InterfaceC61656OHs interfaceC61656OHs = this.LJLJJI;
        if (interfaceC61656OHs != null) {
            if (read == -1 && !this.LJLIL.get()) {
                byte[] byteArray = this.LJLILLLLZI.toByteArray();
                o.LJIIIIZZ(byteArray, "bufferStream.toByteArray()");
                interfaceC61656OHs.LIZ(byteArray);
                this.LJLIL.set(true);
            }
            this.LJLILLLLZI.write(read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.LJLJI.reset();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LJLJI.mark(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.LJLJI.skip(j);
    }

    public C61655OHr(InputStream inputStream, InterfaceC61656OHs interfaceC61656OHs) {
        this.LJLJI = inputStream;
        this.LJLJJI = interfaceC61656OHs;
    }
}
