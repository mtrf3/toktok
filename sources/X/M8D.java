package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8D extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public M8D(String uid, String secUserId) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(secUserId, "secUserId");
        this.LJLIL = uid;
        this.LJLILLLLZI = secUserId;
    }
}
