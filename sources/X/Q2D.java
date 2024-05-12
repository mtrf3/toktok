package X;

import com.bytedance.express.command.Instruction;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q2D implements Q2L {
    public final PQ5 LIZ;
    public final int LIZIZ;

    @Override // X.Q2L
    public final Instruction LIZ() {
        return new Instruction((Q2F.FunctionCommand.getCode() << 14) | (Q2J.STRING.getCode() << 10) | this.LIZIZ, this.LIZ.LIZ);
    }

    public Q2D(PQ5 pq5, int i) {
        this.LIZ = pq5;
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
                throw new C61596OFk(105, "execute error");
            }
        }
        Object LIZ = this.LIZ.LIZ(arrayList);
        C66319Q1b.LIZ(4, new AqS142S0200000_11(this, LIZ, 6));
        stack.push(LIZ);
    }
}
