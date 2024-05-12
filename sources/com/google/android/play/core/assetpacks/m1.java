package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

/* loaded from: classes7.dex */
public final class m1 extends InputStream {
    public final Enumeration<File> LJLIL;
    public InputStream LJLILLLLZI;

    public m1(Enumeration<File> enumeration) {
        this.LJLIL = enumeration;
        LIZ();
    }

    public final void LIZ() {
        InputStream inputStream = this.LJLILLLLZI;
        if (inputStream != null) {
            inputStream.close();
        }
        this.LJLILLLLZI = this.LJLIL.hasMoreElements() ? new FileInputStream(this.LJLIL.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        InputStream inputStream = this.LJLILLLLZI;
        if (inputStream != null) {
            inputStream.close();
            this.LJLILLLLZI = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        while (true) {
            InputStream inputStream = this.LJLILLLLZI;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            LIZ();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.LJLILLLLZI == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int read = this.LJLILLLLZI.read(bArr, i, i2);
            if (read > 0) {
                return read;
            }
            LIZ();
        } while (this.LJLILLLLZI != null);
        return -1;
    }
}
