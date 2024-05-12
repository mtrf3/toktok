package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import kotlin.jvm.internal.o;

/* renamed from: X.Agi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26876Agi extends AbstractC65781Prl implements InterfaceC88471Ynr<AddressListState, Bundle, AddressListState> {
    public static final C26876Agi INSTANCE = new C26876Agi();

    public C26876Agi() {
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
