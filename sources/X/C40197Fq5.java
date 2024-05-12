package X;

import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;

/* renamed from: X.Fq5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40197Fq5 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C40197Fq5() {
        throw null;
    }

    public V9W LIZ() {
        return null;
    }

    public LynxFlattenUI LIZIZ(VNU vnu) {
        return null;
    }

    public ShadowNode LIZJ() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(" - ");
        return JBR.LJFF(LIZ, this.LIZ, "]", LIZ);
    }

    public LynxUI LIZLLL(VNU vnu) {
        StringBuilder LIZ = X1D.LIZ();
        throw new RuntimeException(JBR.LJFF(LIZ, this.LIZ, " is a virtual node, do not have real ui!", LIZ));
    }

    public C40197Fq5(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }

    public C40197Fq5(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
