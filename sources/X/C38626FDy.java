package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.FDy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38626FDy implements InterfaceC88472Yns<FE5, Boolean> {
    public final Context LJLIL;
    public final FE3 LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(FE5 fe5) {
        boolean z;
        Integer LIZ;
        FE5 cacheItem = fe5;
        o.LJIIJ(cacheItem, "cacheItem");
        if (this.LJLJI && (LIZ = this.LJLILLLLZI.LIZ()) != null) {
            if (LIZ.intValue() != cacheItem.LJLJJLL) {
                return Boolean.FALSE;
            }
        }
        Activity LIZJ = C109434Rf.LIZJ(this.LJLIL);
        if (LIZJ != null) {
            if (!cacheItem.LJLJLJ) {
                return Boolean.TRUE;
            }
            if (LIZJ.hashCode() == cacheItem.LJLJL) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    public C38626FDy(Context context, FE1 fe1, boolean z) {
        o.LJIIJ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = fe1;
        this.LJLJI = z;
    }
}
