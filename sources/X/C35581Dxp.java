package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Dxp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35581Dxp extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), this.LJLJJLL};
    }

    public C35581Dxp(String str, long j, String linkMicId, boolean z, boolean z2) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = linkMicId;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = "";
    }
}
