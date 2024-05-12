package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Rqy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70828Rqy extends AbstractC65781Prl implements InterfaceC88471Ynr<ViewGroup, InterfaceC65784Pro<? extends C76800UCe>, InterfaceC73206SoE> {
    public static final C70828Rqy LJLIL = new C70828Rqy();

    public C70828Rqy() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final InterfaceC73206SoE invoke(ViewGroup viewGroup, InterfaceC65784Pro<? extends C76800UCe> interfaceC65784Pro) {
        ViewGroup parent = viewGroup;
        InterfaceC65784Pro<? extends C76800UCe> onErrorRetry = interfaceC65784Pro;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(onErrorRetry, "onErrorRetry");
        return new C71303Ryd(parent, onErrorRetry);
    }
}
