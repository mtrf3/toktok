package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Og4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62508Og4 extends F9E {
    public final String LJLIL;
    public final List<String> LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final C62511Og7 LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public C62508Og4(String shareLinkPath, List<String> list, String shareTitle, String shareDesc, C62511Og7 shareControlModel) {
        o.LJIIIZ(shareLinkPath, "shareLinkPath");
        o.LJIIIZ(shareTitle, "shareTitle");
        o.LJIIIZ(shareDesc, "shareDesc");
        o.LJIIIZ(shareControlModel, "shareControlModel");
        this.LJLIL = shareLinkPath;
        this.LJLILLLLZI = list;
        this.LJLJI = shareTitle;
        this.LJLJJI = shareDesc;
        this.LJLJJL = shareControlModel;
    }
}
