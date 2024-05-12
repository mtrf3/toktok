package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZuN, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91423ZuN extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public C91423ZuN(String id, String fullClipId, int i, boolean z) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(fullClipId, "fullClipId");
        this.LJLIL = id;
        this.LJLILLLLZI = fullClipId;
        this.LJLJI = i;
        this.LJLJJI = z;
    }
}
