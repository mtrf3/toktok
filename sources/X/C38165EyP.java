package X;

import Y.ACallableS33S1100000_6;
import java.util.List;

/* renamed from: X.EyP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38165EyP implements InterfaceC38140Ey0 {
    public final /* synthetic */ InterfaceC88471Ynr<String, EnumC38166EyQ, C76800UCe> LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ C38150EyA LIZJ;
    public final /* synthetic */ InterfaceC88473Ynt<String, EnumC38166EyQ, Integer, C76800UCe> LIZLLL;

    @Override // X.InterfaceC38140Ey0
    public final /* synthetic */ void LIZJ(C38117Exd c38117Exd, int i) {
    }

    public final void LIZLLL(String str) {
        EnumC38166EyQ enumC38166EyQ;
        if (str != null) {
            InterfaceC88471Ynr<String, EnumC38166EyQ, C76800UCe> interfaceC88471Ynr = this.LIZ;
            if (this.LIZIZ.contains(str)) {
                enumC38166EyQ = EnumC38166EyQ.PUBLIC;
            } else {
                enumC38166EyQ = EnumC38166EyQ.PRIVATE;
            }
            interfaceC88471Ynr.invoke(str, enumC38166EyQ);
        }
    }

    @Override // X.InterfaceC38140Ey0
    public final void LIZ(String str, String str2, C17230lz c17230lz) {
        LIZLLL(str2);
    }

    public final void LJ(int i, String str, String str2) {
        String LJJIJIIJIL;
        EnumC38166EyQ enumC38166EyQ;
        if (str2 != null) {
            InterfaceC88473Ynt<String, EnumC38166EyQ, Integer, C76800UCe> interfaceC88473Ynt = this.LIZLLL;
            if (this.LIZIZ.contains(str2)) {
                enumC38166EyQ = EnumC38166EyQ.PUBLIC;
            } else {
                enumC38166EyQ = EnumC38166EyQ.PRIVATE;
            }
            interfaceC88473Ynt.invoke(str2, enumC38166EyQ, Integer.valueOf(i));
        }
        if (this.LIZJ.LJIIIIZZ) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(str);
                            LIZ.append(" failed to visit func: ");
                            LIZ.append(str2);
                            LIZ.append(", reason: ");
                            LIZ.append(i);
                            LIZ.append(";\n                                                Enter DebugSettings->JSB and try to add secure domain for debugging\n                                    ");
                            LJJIJIIJIL = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ));
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str);
                            LIZ2.append(" failed to visit func: ");
                            LIZ2.append(str2);
                            LIZ2.append(", reason: ");
                            LIZ2.append(i);
                            LIZ2.append(";\n                                                BridgeMethod Released;\n                                    ");
                            LJJIJIIJIL = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ2));
                        }
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(str);
                        LIZ3.append(" failed to visit func: ");
                        LIZ3.append(str2);
                        LIZ3.append(", reason: ");
                        LIZ3.append(i);
                        LIZ3.append(";\n                                                Malformed data;\n                                    ");
                        LJJIJIIJIL = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ3));
                    }
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(str);
                    LIZ4.append(" failed to visit func: ");
                    LIZ4.append(str2);
                    LIZ4.append(", reason: ");
                    LIZ4.append(i);
                    LIZ4.append(";\n                                                Method not registered;\n                                    ");
                    LJJIJIIJIL = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ4));
                }
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(str);
                LIZ5.append(" failed to visit func: ");
                LIZ5.append(str2);
                LIZ5.append(", reason: ");
                LIZ5.append(i);
                LIZ5.append(";\n                                                Permission Denied;\n                                                Enter DebugSettings->JSB and try to add secure domain for debugging\n                                    ");
                LJJIJIIJIL = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ5));
            }
            C10K.LIZIZ(new ACallableS33S1100000_6(this.LIZJ, LJJIJIIJIL, 1), C10K.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38165EyP(InterfaceC88471Ynr<? super String, ? super EnumC38166EyQ, C76800UCe> interfaceC88471Ynr, List<String> list, C38150EyA c38150EyA, InterfaceC88473Ynt<? super String, ? super EnumC38166EyQ, ? super Integer, C76800UCe> interfaceC88473Ynt) {
        this.LIZ = interfaceC88471Ynr;
        this.LIZIZ = list;
        this.LIZJ = c38150EyA;
        this.LIZLLL = interfaceC88473Ynt;
    }

    @Override // X.InterfaceC38140Ey0
    public final void LIZIZ(String str, String str2, int i, String str3, C17230lz c17230lz) {
        LJ(i, str, str2);
    }
}
