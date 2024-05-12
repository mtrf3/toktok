package X;

import com.bytedance.express.command.Instruction;
import java.util.Stack;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q2E implements Q2L {
    public final String LIZ;

    @Override // X.Q2L
    public final Instruction LIZ() {
        return new Instruction((Q2F.IdentifierCommand.getCode() << 14) | (Q2J.STRING.getCode() << 10) | 1, this.LIZ);
    }

    public Q2E(String identifier) {
        o.LJIIJ(identifier, "identifier");
        this.LIZ = identifier;
    }

    @Override // X.Q2L
    public final void LIZIZ(Stack<Object> stack, InterfaceC66331Q1n env, C66320Q1c c66320Q1c) {
        o.LJIIJ(env, "env");
        long nanoTime = System.nanoTime();
        if (o.LJ("null", this.LIZ)) {
            stack.push(null);
        }
        Object value = env.getValue(this.LIZ);
        c66320Q1c.LIZLLL += System.nanoTime() - nanoTime;
        C66319Q1b.LIZ(4, new AqS142S0200000_11(this, value, 7));
        stack.push(value);
    }
}
