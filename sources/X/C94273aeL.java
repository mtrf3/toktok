package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aeL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94273aeL extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C94273aeL(String path, String id, String resID) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(resID, "resID");
        this.LJLIL = path;
        this.LJLILLLLZI = id;
        this.LJLJI = resID;
    }
}
