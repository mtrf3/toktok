package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import kotlin.jvm.internal.o;

/* renamed from: X.Aed, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26747Aed extends AbstractC65781Prl implements InterfaceC88471Ynr<AddressSelectState, Bundle, AddressSelectState> {
    public static final C26747Aed INSTANCE = new C26747Aed();

    public C26747Aed() {
        super(2);
    }

    public final AddressSelectState invoke(AddressSelectState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ AddressSelectState invoke(AddressSelectState addressSelectState, Bundle bundle) {
        AddressSelectState addressSelectState2 = addressSelectState;
        invoke(addressSelectState2, bundle);
        return addressSelectState2;
    }
}
