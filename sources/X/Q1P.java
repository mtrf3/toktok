package X;

import com.bytedance.express.command.Instruction;
import com.bytedance.ruler.base.models.RuleModel;
import com.google.gson.j;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1P extends RuleModel {
    public List<? extends Q2L> LIZ;
    public List<Q1P> LIZIZ;
    public List<Instruction> LIZJ;

    public Q1P() {
        this(null, null, null, null, null, 63);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ cel = ");
        LIZ.append(this.cel);
        LIZ.append(" , conf = ");
        j jVar = this.conf;
        if (jVar != null) {
            str = jVar.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        sb.append(X1D.LIZIZ(LIZ));
        List<Q1P> list = this.LIZIZ;
        if (list != null && !list.isEmpty()) {
            sb.append("\nchild = ");
            List<Q1P> list2 = this.LIZIZ;
            if (list2 != null) {
                for (Q1P q1p : list2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("  ");
                    LIZ2.append(q1p);
                    sb.append(X1D.LIZIZ(LIZ2));
                }
            }
        }
        sb.append("}\n");
        String sb2 = sb.toString();
        o.LJFF(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q1P(java.lang.String r3, java.util.List r4, com.google.gson.j r5, java.lang.String r6, java.util.List r7, int r8) {
        /*
            r2 = this;
            r0 = r8 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r8 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r0 = r8 & 4
            if (r0 == 0) goto L10
            r5 = r1
        L10:
            r0 = r8 & 8
            if (r0 == 0) goto L15
            r6 = r1
        L15:
            r0 = r8 & 32
            if (r0 == 0) goto L1a
            r7 = r1
        L1a:
            r2.<init>(r3, r5, r6, r1)
            r2.LIZIZ = r4
            r2.LIZJ = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1P.<init>(java.lang.String, java.util.List, com.google.gson.j, java.lang.String, java.util.List, int):void");
    }
}
