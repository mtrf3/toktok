package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HY0 extends F9E {
    public final long LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public HY0(long j, String cameraType, String toStatus, String str) {
        o.LJIIIZ(cameraType, "cameraType");
        o.LJIIIZ(toStatus, "toStatus");
        this.LJLIL = j;
        this.LJLILLLLZI = cameraType;
        this.LJLJI = toStatus;
        this.LJLJJI = str;
    }
}
