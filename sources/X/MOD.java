package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MOD extends AbstractC65781Prl implements InterfaceC88472Yns<Bundle, C76800UCe> {
    public static final MOD LJLIL = new MOD();

    public MOD() {
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
