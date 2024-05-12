package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IJX extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;

    public IJX() {
        this(null, false, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI)};
    }

    public IJX(String highLightPoiId, boolean z, int i) {
        long j;
        highLightPoiId = (i & 1) != 0 ? "" : highLightPoiId;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        o.LJIIIZ(highLightPoiId, "highLightPoiId");
        this.LJLIL = highLightPoiId;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
    }
}
