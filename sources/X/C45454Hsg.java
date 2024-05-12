package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Hsg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45454Hsg extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C45454Hsg(String url, String destFilePath) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(destFilePath, "destFilePath");
        this.LJLIL = url;
        this.LJLILLLLZI = destFilePath;
    }
}
