package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WQr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82273WQr extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C82273WQr(String filterFilePath, String filterFolder) {
        o.LJIIIZ(filterFilePath, "filterFilePath");
        o.LJIIIZ(filterFolder, "filterFolder");
        this.LJLIL = filterFilePath;
        this.LJLILLLLZI = filterFolder;
    }
}
