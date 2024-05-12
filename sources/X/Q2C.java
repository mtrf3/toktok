package X;

import com.bytedance.express.command.Instruction;
import java.util.Stack;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q2C implements Q2L {
    public Q2D LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final C61689OIz LIZLLL;

    @Override // X.Q2L
    public final Instruction LIZ() {
        return new Instruction((Q2F.FunctionCommand.getCode() << 14) | (Q2J.STRING.getCode() << 10) | this.LIZJ, this.LIZIZ);
    }

    public Q2C(String functionName, int i, C61689OIz functionManager) {
        o.LJIIJ(functionName, "functionName");
        o.LJIIJ(functionManager, "functionManager");
        this.LIZIZ = functionName;
        this.LIZJ = i;
        this.LIZLLL = functionManager;
    }

    @Override // X.Q2L
    public final void LIZIZ(Stack<Object> stack, InterfaceC66331Q1n env, C66320Q1c c66320Q1c) {
        o.LJIIJ(env, "env");
        C66319Q1b.LIZ(5, new AqS177S0100000_11(this, 27));
        if (this.LIZ == null) {
            PQ5 LIZ = this.LIZLLL.LIZ(this.LIZIZ);
            if (LIZ != null || (LIZ = env.LIZ(this.LIZIZ)) != null) {
                this.LIZ = new Q2D(LIZ, this.LIZJ);
            } else {
                C66319Q1b.LIZ(6, new AqS177S0100000_11(this, 28));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("function name = ");
                LIZ2.append(this.LIZIZ);
                throw new C61596OFk(109, X1D.LIZIZ(LIZ2));
            }
        }
        Q2D q2d = this.LIZ;
        if (q2d != null) {
            q2d.LIZIZ(stack, env, c66320Q1c);
        }
    }
}
