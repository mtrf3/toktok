package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OAh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61463OAh extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, Integer.valueOf(this.LJLJJL)};
    }

    public C61463OAh(int i, long j, String accessKey, int i2, String businessVersion) {
        o.LJIIJ(accessKey, "accessKey");
        o.LJIIJ(businessVersion, "businessVersion");
        this.LJLIL = accessKey;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = businessVersion;
        this.LJLJJL = i2;
    }
}
