package X;

import defpackage.i0;
import java.util.HashMap;

/* renamed from: X.Qc8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67360Qc8<T> implements IIL<T> {
    public final AbstractC67354Qc2 LIZ;
    public final String LIZIZ;
    public final C67365QcD LIZJ;
    public final InterfaceC67369QcH<T, byte[]> LIZLLL;
    public final InterfaceC67293Qb3 LJ;

    public final void LIZ(C67358Qc6 c67358Qc6) {
        C72545SdZ c72545SdZ = new C72545SdZ();
        InterfaceC67293Qb3 interfaceC67293Qb3 = this.LJ;
        C67364QcC c67364QcC = new C67364QcC();
        AbstractC67354Qc2 abstractC67354Qc2 = this.LIZ;
        if (abstractC67354Qc2 != null) {
            c67364QcC.LIZ = abstractC67354Qc2;
            c67364QcC.LIZJ = c67358Qc6;
            String str = this.LIZIZ;
            if (str != null) {
                c67364QcC.LIZIZ = str;
                InterfaceC67369QcH<T, byte[]> interfaceC67369QcH = this.LIZLLL;
                if (interfaceC67369QcH != null) {
                    c67364QcC.LIZLLL = interfaceC67369QcH;
                    C67365QcD c67365QcD = this.LIZJ;
                    if (c67365QcD != null) {
                        c67364QcC.LJ = c67365QcD;
                        String str2 = "";
                        if (c67364QcC.LIZLLL == null) {
                            str2 = i0.LJFF("", " transformer");
                        }
                        if (c67364QcC.LJ == null) {
                            str2 = i0.LJFF(str2, " encoding");
                        }
                        if (str2.isEmpty()) {
                            C67361Qc9 c67361Qc9 = new C67361Qc9(c67364QcC.LIZ, c67364QcC.LIZIZ, c67364QcC.LIZJ, c67364QcC.LIZLLL, c67364QcC.LJ);
                            C67350Qby c67350Qby = (C67350Qby) interfaceC67293Qb3;
                            InterfaceC67367QcF interfaceC67367QcF = c67350Qby.LIZJ;
                            AbstractC67354Qc2 abstractC67354Qc22 = c67361Qc9.LIZ;
                            EnumC67357Qc5 LIZJ = c67361Qc9.LIZJ.LIZJ();
                            abstractC67354Qc22.getClass();
                            C67352Qc0 LIZ = AbstractC67354Qc2.LIZ();
                            LIZ.LIZIZ(abstractC67354Qc22.LIZIZ());
                            LIZ.LIZJ(LIZJ);
                            LIZ.LIZIZ = abstractC67354Qc22.LIZJ();
                            C67355Qc3 LIZ2 = LIZ.LIZ();
                            C67362QcA c67362QcA = new C67362QcA();
                            c67362QcA.LJFF = new HashMap();
                            c67362QcA.LIZLLL = Long.valueOf(c67350Qby.LIZ.getTime());
                            c67362QcA.LJ = Long.valueOf(c67350Qby.LIZIZ.getTime());
                            c67362QcA.LIZLLL(c67361Qc9.LIZIZ);
                            c67362QcA.LIZJ(new C67366QcE(c67361Qc9.LJ, c67361Qc9.LIZLLL.apply(c67361Qc9.LIZJ.LIZIZ())));
                            c67362QcA.LIZIZ = c67361Qc9.LIZJ.LIZ();
                            interfaceC67367QcF.LIZ(c67362QcA.LIZIZ(), LIZ2, c72545SdZ);
                            return;
                        }
                        throw new IllegalStateException(i0.LJFF("Missing required properties:", str2));
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }

    public C67360Qc8(AbstractC67354Qc2 abstractC67354Qc2, String str, C67365QcD c67365QcD, InterfaceC67369QcH<T, byte[]> interfaceC67369QcH, InterfaceC67293Qb3 interfaceC67293Qb3) {
        this.LIZ = abstractC67354Qc2;
        this.LIZIZ = str;
        this.LIZJ = c67365QcD;
        this.LIZLLL = interfaceC67369QcH;
        this.LJ = interfaceC67293Qb3;
    }
}
