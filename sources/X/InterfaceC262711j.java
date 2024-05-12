package X;

import java.io.Closeable;

/* renamed from: X.11j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC262711j extends Closeable {
    InterfaceC262211e LJLJLLL();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
