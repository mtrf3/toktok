package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.Oau, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62188Oau extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final Bundle LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C62188Oau(int i, String objectId, Bundle bundle) {
        o.LJIIIZ(objectId, "objectId");
        this.LJLIL = i;
        this.LJLILLLLZI = objectId;
        this.LJLJI = bundle;
    }
}
