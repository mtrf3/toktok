package X;

import java.io.File;

/* renamed from: X.1CE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CE implements InterfaceC262711j, C0BH {
    public C0BG LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC262711j
    public final synchronized InterfaceC262211e LJLJLLL() {
        if (!this.LJLILLLLZI) {
            LIZIZ(true);
            this.LJLILLLLZI = true;
        }
        throw null;
    }

    @Override // X.InterfaceC262711j, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // X.C0BH
    public final InterfaceC262711j getDelegate() {
        return null;
    }

    @Override // X.InterfaceC262711j
    public final String getDatabaseName() {
        throw null;
    }

    public final void LIZ(File file) {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    public final void LIZIZ(boolean z) {
        getDatabaseName();
        throw null;
    }

    @Override // X.InterfaceC262711j
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }
}
