package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MSv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56849MSv extends F9E {
    public final boolean LJLIL;
    public final EnumC94693nd LJLILLLLZI;
    public final boolean LJLJI;

    public C56849MSv() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C56849MSv(int i) {
        this(false, EnumC94693nd.LOADING, false);
    }

    public C56849MSv(boolean z, EnumC94693nd recommendWidgetState, boolean z2) {
        o.LJIIIZ(recommendWidgetState, "recommendWidgetState");
        this.LJLIL = z;
        this.LJLILLLLZI = recommendWidgetState;
        this.LJLJI = z2;
    }

    public static C56849MSv L(C56849MSv c56849MSv, boolean z, EnumC94693nd recommendWidgetState, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c56849MSv.LJLIL;
        }
        if ((i & 2) != 0) {
            recommendWidgetState = c56849MSv.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = c56849MSv.LJLJI;
        }
        o.LJIIIZ(recommendWidgetState, "recommendWidgetState");
        return new C56849MSv(z, recommendWidgetState, z2);
    }
}
