package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.HXh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44225HXh extends F9E {
    public final Bundle LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public C44225HXh(Bundle bundle, boolean z, boolean z2) {
        o.LJIIIZ(bundle, "bundle");
        this.LJLIL = bundle;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
