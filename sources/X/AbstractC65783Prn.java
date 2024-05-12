package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Prn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65783Prn extends C3CU implements InterfaceC65778Pri<Object> {
    public final int LJLIL;

    @Override // fjb.a
    public String toString() {
        if (getCompletion() == null) {
            C65352Pkq.LIZ.getClass();
            String LIZ = C65351Pkp.LIZ(this);
            o.LJIIIIZZ(LIZ, "renderLambdaToString(this)");
            return LIZ;
        }
        return super.toString();
    }

    @Override // X.InterfaceC65778Pri
    public int getArity() {
        return this.LJLIL;
    }

    public AbstractC65783Prn(int i) {
        this(i, null);
    }

    public AbstractC65783Prn(int i, InterfaceC67352kd<Object> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLIL = i;
    }
}
