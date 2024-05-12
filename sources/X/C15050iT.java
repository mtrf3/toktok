package X;

import java.io.Writer;

/* renamed from: X.0iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15050iT extends Writer {
    public final StringBuilder LJLIL = new StringBuilder(128);

    public final void LIZ() {
        if (this.LJLIL.length() > 0) {
            StringBuilder sb = this.LJLIL;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LIZ();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        LIZ();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                LIZ();
            } else {
                this.LJLIL.append(c);
            }
        }
    }
}
