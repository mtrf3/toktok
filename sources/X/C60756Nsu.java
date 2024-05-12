package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nsu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60756Nsu {
    public int LIZ;
    public long LIZIZ;
    public String LIZJ = "unknown";
    public int LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public C61295O3v LJII;
    public InterfaceC88472Yns<? super C61295O3v, C76800UCe> LJIIIIZZ;
    public String LJIIIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C60756Nsu) && o.LJ(this.LJIIIZ, ((C60756Nsu) obj).LJIIIZ);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.LJIIIZ;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Category(channel=");
        return JBR.LJFF(LIZ, this.LJIIIZ, ")", LIZ);
    }

    public C60756Nsu(String str) {
        this.LJIIIZ = str;
    }

    public final void LIZ(C60755Nst c60755Nst) {
        synchronized (this) {
            this.LJIIIIZZ = c60755Nst;
            C61295O3v c61295O3v = this.LJII;
            if (c61295O3v != null) {
                LIZIZ(null);
                this.LJIIIIZZ = null;
                if (c60755Nst != null) {
                }
            }
        }
    }

    public final void LIZIZ(C61295O3v c61295O3v) {
        synchronized (this) {
            this.LJII = c61295O3v;
            InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns = this.LJIIIIZZ;
            if (interfaceC88472Yns != null) {
                LIZ(null);
                this.LJII = null;
                if (c61295O3v != null) {
                    interfaceC88472Yns.invoke(c61295O3v);
                }
            }
        }
    }
}
