package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.Mbi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57142Mbi extends AbstractC65781Prl implements InterfaceC88472Yns<Bundle, C76800UCe> {
    public static final C57142Mbi LJLIL = new C57142Mbi();

    public C57142Mbi() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        o.LJIIIZ(bundle2, "$this$bundle");
        bundle2.putBoolean("is_login", true);
        return C76800UCe.LIZ;
    }
}
