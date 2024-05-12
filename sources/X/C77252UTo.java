package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.UTo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77252UTo extends AbstractC65781Prl implements InterfaceC88472Yns<Bundle, C76800UCe> {
    public static final C77252UTo LJLIL = new C77252UTo();

    public C77252UTo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        o.LJIIIZ(bundle2, "$this$bundle");
        bundle2.putBoolean("is_manual", true);
        return C76800UCe.LIZ;
    }
}
