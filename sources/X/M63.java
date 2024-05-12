package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M63 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public M63(String targetNodeName, String result) {
        o.LJIIIZ(targetNodeName, "targetNodeName");
        o.LJIIIZ(result, "result");
        this.LJLIL = targetNodeName;
        this.LJLILLLLZI = result;
    }
}
