package X;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class VXH extends FilterInputStream {
    public final /* synthetic */ FileInputStream LJLIL;

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.LJLIL.close();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VXH(FileInputStream fileInputStream, InputStream inputStream) {
        super(inputStream);
        this.LJLIL = fileInputStream;
    }
}
