package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IuK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48104IuK implements Closeable {
    public final C48105IuL LJLIL;
    public final int LJLILLLLZI;
    public final List<C48099IuF> LJLJI;
    public final C64797Pbt<?> LJLJJI;
    public final C64598PWw LJLJJL;

    public final InputStream LIZ() {
        C64797Pbt<?> c64797Pbt = this.LJLJJI;
        InputStream inputStream = null;
        if (c64797Pbt != null) {
            TypedInput typedInput = c64797Pbt.LIZ.LJ;
            if (typedInput == null) {
                return null;
            }
            try {
                inputStream = typedInput.in();
                return inputStream;
            } catch (IOException unused) {
                return inputStream;
            }
        }
        PVM pvm = this.LJLJJL.LJLJL;
        if (pvm == null) {
            return null;
        }
        return pvm.byteStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream in;
        C64797Pbt<?> c64797Pbt = this.LJLJJI;
        if (c64797Pbt != null) {
            TypedInput typedInput = c64797Pbt.LIZ.LJ;
            if (typedInput == null || (in = typedInput.in()) == null) {
                return;
            }
            in.close();
            return;
        }
        C64598PWw c64598PWw = this.LJLJJL;
        if (c64598PWw == null) {
            return;
        }
        c64598PWw.close();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HttpResponse{request=");
        LIZ.append(this.LJLIL);
        LIZ.append(", code=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", headers=");
        return C1NE.LIZIZ(LIZ, this.LJLJI, '}', LIZ);
    }

    public C48104IuK(C64598PWw c64598PWw, C48105IuL c48105IuL) {
        this.LJLJI = new ArrayList();
        this.LJLIL = c48105IuL;
        this.LJLJJL = c64598PWw;
        this.LJLJJI = null;
        this.LJLILLLLZI = c64598PWw.LJLJI;
        C64606PXe c64606PXe = c64598PWw.LJLJJLL;
        if (c64606PXe != null) {
            int length = c64606PXe.LIZ.length / 2;
            for (int i = 0; i < length; i++) {
                if (c64606PXe.LJ(i).length() != 0 && c64606PXe.LJIIJ(i).length() != 0) {
                    this.LJLJI.add(new C48099IuF(c64606PXe.LJ(i), c64606PXe.LJIIJ(i)));
                }
            }
        }
    }

    public final String LIZIZ(String str, String str2) {
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            C48099IuF c48099IuF = (C48099IuF) it.next();
            if (c48099IuF.LIZ.equalsIgnoreCase(str)) {
                return c48099IuF.LIZIZ;
            }
        }
        return str2;
    }

    public C48104IuK(C64797Pbt<?> c64797Pbt, C48105IuL c48105IuL) {
        this.LJLJI = new ArrayList();
        this.LJLIL = c48105IuL;
        this.LJLJJI = c64797Pbt;
        this.LJLJJL = null;
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        this.LJLILLLLZI = c36910EeA.LIZIZ;
        List<EJ6> list = c36910EeA.LIZLLL;
        if (list != null) {
            for (EJ6 ej6 : list) {
                if (ej6.LIZ.length() != 0 && ej6.LIZIZ.length() != 0) {
                    this.LJLJI.add(new C48099IuF(ej6.LIZ, ej6.LIZIZ));
                }
            }
        }
    }
}
