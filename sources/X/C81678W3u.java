package X;

import kotlin.jvm.internal.o;

/* renamed from: X.W3u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81678W3u extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C81678W3u(String frontImgPath, String backImgPath) {
        o.LJIIIZ(frontImgPath, "frontImgPath");
        o.LJIIIZ(backImgPath, "backImgPath");
        this.LJLIL = frontImgPath;
        this.LJLILLLLZI = backImgPath;
    }
}
