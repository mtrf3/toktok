package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PzA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66240PzA extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final EnumC66268Pzc LJLJI;
    public final C57309MeP LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C66240PzA(String str, String str2, EnumC66268Pzc storeSourceType, C57309MeP c57309MeP) {
        o.LJIIIZ(storeSourceType, "storeSourceType");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = storeSourceType;
        this.LJLJJI = c57309MeP;
    }
}
