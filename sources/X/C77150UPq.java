package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.UPq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77150UPq extends F9E {
    public final boolean LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final Bundle LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL};
    }

    public C77150UPq(boolean z, int i, int i2, Bundle bundle, int i3) {
        String message;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            message = "";
        } else {
            message = null;
        }
        bundle = (i3 & 16) != 0 ? null : bundle;
        o.LJIIJ(message, "message");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = message;
        this.LJLJJL = bundle;
    }
}
