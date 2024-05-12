package X;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: X.5y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152135y5 extends Writer implements Serializable {
    public final StringBuilder LJLIL;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.LJLIL.toString();
    }

    public C152135y5() {
        this.LJLIL = new StringBuilder();
    }

    public StringBuilder getBuilder() {
        return this.LJLIL;
    }

    public C152135y5(StringBuilder sb) {
        this.LJLIL = sb == null ? new StringBuilder() : sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.LJLIL.append(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.LJLIL.append(str);
        }
    }

    public C152135y5(int i) {
        this.LJLIL = new StringBuilder(i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.LJLIL.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.LJLIL.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.LJLIL.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }
}
