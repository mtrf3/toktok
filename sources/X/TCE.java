package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCE extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL)};
    }

    public TCE(String userId, String secUserId, long j, int i, int i2, int i3, int i4) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        this.LJLIL = userId;
        this.LJLILLLLZI = secUserId;
        this.LJLJI = j;
        this.LJLJJI = 20;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
        this.LJLJLJ = i4;
        this.LJLJLLL = 0;
    }
}
