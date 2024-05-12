package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Zur, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91453Zur extends F9E {
    public final boolean LJLIL;
    public final EnumC91282Zs6 LJLILLLLZI;
    public final boolean LJLJI;

    public C91453Zur() {
        this(false, null, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C91453Zur(boolean z, EnumC91282Zs6 refreshType, int i) {
        z = (i & 1) != 0 ? false : z;
        refreshType = (i & 2) != 0 ? EnumC91282Zs6.UNKNOWN : refreshType;
        boolean z2 = (i & 4) != 0;
        o.LJIIIZ(refreshType, "refreshType");
        this.LJLIL = z;
        this.LJLILLLLZI = refreshType;
        this.LJLJI = z2;
    }
}
