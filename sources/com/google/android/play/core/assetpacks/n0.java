package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C40650FxO;
import X.InterfaceC38408F5o;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class n0 {
    public static final C13T LJIIIZ = new C13T("ExtractorLooper");
    public final c1 LIZ;
    public final l0 LIZIZ;
    public final d2 LIZJ;
    public final p1 LIZLLL;
    public final t1 LJ;
    public final x1 LJFF;
    public final InterfaceC38408F5o<s2> LJI;
    public final e1 LJII;
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);

    public n0(c1 c1Var, InterfaceC38408F5o<s2> interfaceC38408F5o, l0 l0Var, d2 d2Var, p1 p1Var, t1 t1Var, x1 x1Var, e1 e1Var) {
        this.LIZ = c1Var;
        this.LJI = interfaceC38408F5o;
        this.LIZIZ = l0Var;
        this.LIZJ = d2Var;
        this.LIZLLL = p1Var;
        this.LJ = t1Var;
        this.LJFF = x1Var;
        this.LJII = e1Var;
    }

    public final void LIZ(int i, Exception exc) {
        try {
            c1 c1Var = this.LIZ;
            c1Var.getClass();
            c1Var.LIZIZ(new C40650FxO(c1Var, i));
            c1 c1Var2 = this.LIZ;
            c1Var2.getClass();
            c1Var2.LIZIZ(new w0(i, c1Var2));
        } catch (m0 unused) {
            LJIIIZ.LIZJ("Error during error handling: %s", 6, new Object[]{exc.getMessage()});
        }
    }
}
