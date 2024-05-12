package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.CAr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30897CAr extends F9E {
    public final android.net.Uri LJLIL;
    public final android.net.Uri LJLILLLLZI;
    public final View LJLJI;
    public final EnumC53636L3g LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C30897CAr(android.net.Uri originSchema, android.net.Uri uniqueSchema, C60193Njp c60193Njp, EnumC53636L3g cacheType) {
        o.LJIIJ(originSchema, "originSchema");
        o.LJIIJ(uniqueSchema, "uniqueSchema");
        o.LJIIJ(cacheType, "cacheType");
        this.LJLIL = originSchema;
        this.LJLILLLLZI = uniqueSchema;
        this.LJLJI = c60193Njp;
        this.LJLJJI = cacheType;
    }
}
