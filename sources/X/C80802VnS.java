package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.PrintStream;

/* renamed from: X.VnS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80802VnS {
    public C80815Vnf LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ C80796VnM LIZJ;

    public C80802VnS(C80796VnM c80796VnM) {
        this.LIZJ = c80796VnM;
    }

    public final boolean LIZ(int i) {
        C80815Vnf c80815Vnf;
        Object obj;
        boolean z = false;
        if (!C2Q3.LIZ) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 < this.LIZJ.LJLL.size()) {
                if (((C80815Vnf) ListProtector.get(this.LIZJ.LJLL, i2)).LIZIZ == i) {
                    c80815Vnf = (C80815Vnf) ListProtector.get(this.LIZJ.LJLL, i2);
                    if (c80815Vnf != null) {
                        C80815Vnf c80815Vnf2 = this.LIZ;
                        if (c80815Vnf2 != null && (obj = c80815Vnf.LIZ) == c80815Vnf2.LIZ && c80815Vnf.LIZIZ != c80815Vnf2.LIZIZ && this.LIZJ.LJLLJ.LJIIL(obj) == i) {
                            PrintStream printStream = System.out;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("VerticalViewPagercheckMultiInvokePageSelected>>>pos:");
                            LIZ.append(i);
                            printStream.println(X1D.LIZIZ(LIZ));
                            z = true;
                        }
                        C80815Vnf c80815Vnf3 = new C80815Vnf();
                        c80815Vnf3.LIZIZ = c80815Vnf.LIZIZ;
                        c80815Vnf3.LIZ = c80815Vnf.LIZ;
                        c80815Vnf = c80815Vnf3;
                    }
                } else {
                    i2++;
                }
            } else {
                c80815Vnf = null;
                break;
            }
        }
        this.LIZ = c80815Vnf;
        this.LIZIZ = z;
        return z;
    }
}
