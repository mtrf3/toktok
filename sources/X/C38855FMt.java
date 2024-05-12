package X;

import android.content.Context;

/* renamed from: X.FMt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38855FMt {
    public FA1 LIZ;
    public InterfaceC38856FMu LIZIZ;
    public int LIZJ = -1;
    public int LIZLLL;
    public boolean LJ;
    public Context LJFF;

    public static void LIZ() {
    }

    public final void LIZIZ(int i, int i2, int[] iArr) {
        try {
            if (!this.LJ) {
                int i3 = this.LIZJ;
                if (i3 == 1) {
                    this.LIZIZ = new FNA();
                } else if (i3 == 2) {
                    this.LIZIZ = new FNC();
                } else if (i3 == 3) {
                    this.LIZIZ = new FNB();
                }
                InterfaceC38856FMu interfaceC38856FMu = this.LIZIZ;
                if (interfaceC38856FMu != null) {
                    interfaceC38856FMu.LIZLLL();
                    this.LJ = true;
                }
            }
            InterfaceC38856FMu interfaceC38856FMu2 = this.LIZIZ;
            if (interfaceC38856FMu2 != null) {
                interfaceC38856FMu2.LIZ(i, i2, iArr);
            }
        } catch (Throwable unused) {
        }
    }
}
