package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Itr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48075Itr {
    public final OutputStream LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    public final void LIZ() {
        try {
            this.LIZ.flush();
        } catch (IOException e) {
            if (C47455Ijr.LJI != null) {
                IUW.LIZ(-1, "flush error.", this.LIZIZ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("flush error");
            LIZ.append(e.toString());
            C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ), null);
            throw new C48092Iu8(e);
        }
    }

    public final void LIZIZ(byte[] bArr, int i) {
        try {
            this.LIZ.write(bArr, 0, i);
            this.LIZJ += i;
        } catch (IOException e) {
            if (C47455Ijr.LJI != null) {
                IUW.LIZ(-1, "Write data to player error.", this.LIZIZ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("writeData error");
            LIZ.append(e.toString());
            C48841JEv.LJIIIZ("TAG_PROXY_ProxyTask", X1D.LIZIZ(LIZ), null);
            throw new C48092Iu8(e);
        }
    }

    public final void LIZJ(byte[] bArr, int i) {
        if (!this.LIZLLL) {
            try {
                this.LIZ.write(bArr, 0, i);
                this.LIZLLL = true;
            } catch (IOException e) {
                if (C47455Ijr.LJI != null) {
                    IUW.LIZ(-1, "Write header to player error.", this.LIZIZ);
                }
                throw new C48092Iu8(e);
            }
        }
    }

    public C48075Itr(OutputStream outputStream, int i, String str) {
        this.LIZ = outputStream;
        this.LIZJ = i;
        this.LIZIZ = str;
    }
}
