package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O0X extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public O0X(boolean z, String bizCaseId, boolean z2, boolean z3, String policyKey) {
        o.LJIIIZ(bizCaseId, "bizCaseId");
        o.LJIIIZ(policyKey, "policyKey");
        this.LJLIL = bizCaseId;
        this.LJLILLLLZI = policyKey;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
    }

    public /* synthetic */ O0X(String str, String str2, boolean z, boolean z2, int i) {
        this(false, str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, str2);
    }
}
