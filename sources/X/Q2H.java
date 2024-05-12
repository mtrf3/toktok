package X;

import com.bytedance.express.command.Instruction;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q2H implements Q2L {
    public final Q2V LIZ;
    public final int LIZIZ;

    @Override // X.Q2L
    public final Instruction LIZ() {
        return new Instruction((Q2F.OperateCommand.getCode() << 14) | (Q2J.STRING.getCode() << 10) | this.LIZIZ, this.LIZ.LIZ);
    }

    public /* synthetic */ Q2H(Q2V q2v) {
        this(q2v, q2v.LIZJ);
    }

    public Q2H(Q2V operator, int i) {
        o.LJIIJ(operator, "operator");
        this.LIZ = operator;
        this.LIZIZ = i;
    }

    @Override // X.Q2L
    public final void LIZIZ(Stack<Object> stack, InterfaceC66331Q1n env, C66320Q1c c66320Q1c) {
        o.LJIIJ(env, "env");
        ArrayList arrayList = new ArrayList();
        int i = this.LIZIZ;
        for (int i2 = 0; i2 < i; i2++) {
            if (!stack.empty()) {
                ListProtector.add(arrayList, 0, stack.pop());
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("execute error ");
                LIZ.append(this.LIZ.LIZ);
                throw new C61596OFk(105, X1D.LIZIZ(LIZ));
            }
        }
        stack.push(this.LIZ.LIZ(arrayList));
    }
}
