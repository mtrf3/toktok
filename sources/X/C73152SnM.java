package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.SnM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73152SnM extends AbstractC65781Prl implements InterfaceC88471Ynr<ViewGroup, InterfaceC65784Pro<? extends C76800UCe>, C73176Snk> {
    public static final C73152SnM LJLIL = new C73152SnM();

    public C73152SnM() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C73176Snk invoke(ViewGroup viewGroup, InterfaceC65784Pro<? extends C76800UCe> interfaceC65784Pro) {
        ViewGroup parent = viewGroup;
        InterfaceC65784Pro<? extends C76800UCe> onErrorRetry = interfaceC65784Pro;
        o.LJIIJ(parent, "parent");
        o.LJIIJ(onErrorRetry, "onErrorRetry");
        return new C73176Snk(parent, onErrorRetry);
    }
}
