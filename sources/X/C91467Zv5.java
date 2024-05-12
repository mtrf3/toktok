package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zv5, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91467Zv5 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final long LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, Long.valueOf(this.LJLJL)};
    }

    public C91467Zv5(String str, String str2, String enterMethod, String fullClipId, long j, int i) {
        String fromGroupId;
        if ((i & 1) != 0) {
            fromGroupId = "";
        } else {
            fromGroupId = null;
        }
        String fromGroupType = (i & 2) != 0 ? "" : null;
        str = (i & 4) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        enterMethod = (i & 16) != 0 ? "" : enterMethod;
        fullClipId = (i & 32) != 0 ? "" : fullClipId;
        j = (i & 64) != 0 ? 0L : j;
        o.LJIIIZ(fromGroupId, "fromGroupId");
        o.LJIIIZ(fromGroupType, "fromGroupType");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(fullClipId, "fullClipId");
        this.LJLIL = fromGroupId;
        this.LJLILLLLZI = fromGroupType;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = enterMethod;
        this.LJLJJLL = fullClipId;
        this.LJLJL = j;
    }
}
