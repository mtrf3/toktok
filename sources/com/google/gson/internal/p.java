package com.google.gson.internal;

import X.C38302F1m;
import X.C65385PlN;
import X.C65403Plf;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes12.dex */
public final class p {

    /* loaded from: classes12.dex */
    public static final class a extends Writer {
        public final Appendable LJLIL;
        public final C0022a LJLILLLLZI = new C0022a();

        /* renamed from: com.google.gson.internal.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes12.dex */
        public static class C0022a implements CharSequence {
            public char[] LJLIL;

            @Override // java.lang.CharSequence
            public final int length() {
                return this.LJLIL.length;
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.LJLIL[i];
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.LJLIL, i, i2 - i);
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        public a(Appendable appendable) {
            this.LJLIL = appendable;
        }

        @Override // java.io.Writer
        public final void write(int i) {
            this.LJLIL.append((char) i);
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            C0022a c0022a = this.LJLILLLLZI;
            c0022a.LJLIL = cArr;
            this.LJLIL.append(c0022a, i, i2 + i);
        }
    }

    public static com.google.gson.j LIZ(C65385PlN c65385PlN) {
        try {
            try {
                c65385PlN.LJJIJIL();
                try {
                    return TypeAdapters.LJJIIJ.read(c65385PlN);
                } catch (EOFException e) {
                    throw new com.google.gson.s(e);
                }
            } catch (EOFException unused) {
                return com.google.gson.l.LJLIL;
            }
        } catch (C38302F1m e2) {
            throw new com.google.gson.s(e2);
        } catch (IOException e3) {
            throw new com.google.gson.k(e3);
        } catch (NumberFormatException e4) {
            throw new com.google.gson.s(e4);
        }
    }

    public static void LIZIZ(com.google.gson.j jVar, C65403Plf c65403Plf) {
        TypeAdapters.LJJIIJ.write(c65403Plf, jVar);
    }
}
