package X;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.W8o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81802W8o {
    public static C81802W8o LIZLLL;
    public int LIZ;
    public List<InterfaceC81843WAd> LIZIZ;
    public final C81801W8n LIZJ = new C81801W8n();

    public static synchronized C81802W8o LIZIZ() {
        C81802W8o c81802W8o;
        synchronized (C81802W8o.class) {
            if (LIZLLL == null) {
                LIZLLL = new C81802W8o();
            }
            c81802W8o = LIZLLL;
        }
        return c81802W8o;
    }

    public final void LIZJ() {
        this.LIZ = this.LIZJ.LIZ;
        List<InterfaceC81843WAd> list = this.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC81843WAd> it = list.iterator();
            while (it.hasNext()) {
                this.LIZ = Math.max(this.LIZ, it.next().getHeaderSize());
            }
        }
    }

    public C81802W8o() {
        LIZJ();
    }

    public static C81828W9o LIZ(InputStream inputStream) {
        int LIZ;
        C81802W8o LIZIZ = LIZIZ();
        LIZIZ.getClass();
        inputStream.getClass();
        int i = LIZIZ.LIZ;
        byte[] bArr = new byte[i];
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                LIZ = C81826W9m.LIZ(inputStream, bArr, i);
            } finally {
                inputStream.reset();
            }
        } else {
            LIZ = C81826W9m.LIZ(inputStream, bArr, i);
        }
        List<InterfaceC81843WAd> list = LIZIZ.LIZIZ;
        if (list != null) {
            Iterator<InterfaceC81843WAd> it = list.iterator();
            while (it.hasNext()) {
                C81828W9o LIZ2 = it.next().LIZ(LIZ, bArr);
                if (LIZ2 != null && LIZ2 != C81828W9o.LIZIZ) {
                    return LIZ2;
                }
            }
        }
        C81828W9o LIZ3 = LIZIZ.LIZJ.LIZ(LIZ, bArr);
        if (LIZ3 != null && LIZ3 != C81828W9o.LIZIZ) {
            return LIZ3;
        }
        return C81828W9o.LIZIZ;
    }
}
