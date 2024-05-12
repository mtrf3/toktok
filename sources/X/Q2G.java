package X;

import com.bytedance.express.command.Instruction;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q2G<T> implements Q2L {
    public final T LIZ;
    public final Q2J LIZIZ;

    @Override // X.Q2L
    public final Instruction LIZ() {
        int code = (Q2F.ValueCommand.getCode() << 14) | (this.LIZIZ.getCode() << 10) | 1;
        Object obj = this.LIZ;
        if (obj == null) {
            obj = "null";
        }
        return new Instruction(code, obj);
    }

    public Q2G(T t, Q2J primitive) {
        o.LJIIJ(primitive, "primitive");
        this.LIZ = t;
        this.LIZIZ = primitive;
    }

    @Override // X.Q2L
    public final void LIZIZ(Stack<Object> stack, InterfaceC66331Q1n env, C66320Q1c c66320Q1c) {
        o.LJIIJ(env, "env");
        stack.push(this.LIZ);
    }
}
