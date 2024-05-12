package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Prl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65781Prl<R> implements InterfaceC65778Pri<R>, Serializable {
    public final int arity;

    public String toString() {
        C65352Pkq.LIZ.getClass();
        String LIZ = C65351Pkp.LIZ(this);
        o.LJIIIIZZ(LIZ, "renderLambdaToString(this)");
        return LIZ;
    }

    @Override // X.InterfaceC65778Pri
    public int getArity() {
        return this.arity;
    }

    public AbstractC65781Prl(int i) {
        this.arity = i;
    }
}
