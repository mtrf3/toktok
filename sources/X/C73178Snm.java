package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Snm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73178Snm extends AbstractC65781Prl implements InterfaceC88471Ynr<ViewGroup, InterfaceC65784Pro<? extends C76800UCe>, C73177Snl> {
    public static final C73178Snm LJLIL = new C73178Snm();

    public C73178Snm() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C73177Snl invoke(ViewGroup viewGroup, InterfaceC65784Pro<? extends C76800UCe> interfaceC65784Pro) {
        ViewGroup parent = viewGroup;
        InterfaceC65784Pro<? extends C76800UCe> onErrorRetry = interfaceC65784Pro;
        o.LJIIJ(parent, "parent");
        o.LJIIJ(onErrorRetry, "onErrorRetry");
        return new C73177Snl(parent, onErrorRetry);
    }
}
