package X;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: X.Pwx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66103Pwx extends BufferedInputStream {
    public boolean LJLIL;
    public boolean LJLILLLLZI;

    public final synchronized C39718FiM LIZ() {
        byte[] bArr;
        if (!this.LJLIL) {
            if (!this.LJLILLLLZI) {
                this.LJLIL = true;
                int i = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
                bArr = new byte[i];
                System.arraycopy(((BufferedInputStream) this).buf, ((BufferedInputStream) this).pos, bArr, 0, i);
                ((BufferedInputStream) this).pos = 0;
                ((BufferedInputStream) this).count = 0;
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalStateException();
        }
        return new C39718FiM(new InputStream[]{new ByteArrayInputStream(bArr), ((BufferedInputStream) this).in});
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.LJLIL) {
            this.LJLILLLLZI = false;
            super.reset();
        } else {
            throw new IllegalStateException();
        }
    }

    public C66103Pwx(InputStream inputStream) {
        super(inputStream, 1024);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        if (!this.LJLIL) {
            this.LJLILLLLZI = true;
            super.mark(i);
        } else {
            throw new IllegalStateException();
        }
    }
}
