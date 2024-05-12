package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Sno, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73180Sno extends AbstractC65781Prl implements InterfaceC88471Ynr<ViewGroup, InterfaceC65784Pro<? extends C76800UCe>, C73179Snn> {
    public static final C73180Sno LJLIL = new C73180Sno();

    public C73180Sno() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C73179Snn invoke(ViewGroup viewGroup, InterfaceC65784Pro<? extends C76800UCe> interfaceC65784Pro) {
        ViewGroup parent = viewGroup;
        InterfaceC65784Pro<? extends C76800UCe> onErrorRetry = interfaceC65784Pro;
        o.LJIIJ(parent, "parent");
        o.LJIIJ(onErrorRetry, "onErrorRetry");
        return new C73179Snn(parent, onErrorRetry);
    }
}
