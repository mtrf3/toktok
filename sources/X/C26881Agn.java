package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import kotlin.jvm.internal.o;

/* renamed from: X.Agn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26881Agn extends AbstractC65781Prl implements InterfaceC88471Ynr<AddressListState, Bundle, AddressListState> {
    public static final C26881Agn INSTANCE = new C26881Agn();

    public C26881Agn() {
        super(2);
    }

    public final AddressListState invoke(AddressListState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ AddressListState invoke(AddressListState addressListState, Bundle bundle) {
        AddressListState addressListState2 = addressListState;
        invoke(addressListState2, bundle);
        return addressListState2;
    }
}
