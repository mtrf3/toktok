package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WQm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82268WQm extends F9E {
    public final int LJLIL;
    public final EnumC82260WQe LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C82268WQm(int i, EnumC82260WQe state, String filterFilePath, String filterFolder) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(filterFilePath, "filterFilePath");
        o.LJIIIZ(filterFolder, "filterFolder");
        this.LJLIL = i;
        this.LJLILLLLZI = state;
        this.LJLJI = filterFilePath;
        this.LJLJJI = filterFolder;
    }
}
