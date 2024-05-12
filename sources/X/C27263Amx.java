package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import kotlin.jvm.internal.o;

/* renamed from: X.Amx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27263Amx extends AbstractC65781Prl implements InterfaceC88471Ynr<AddressEditState, Bundle, AddressEditState> {
    public static final C27263Amx INSTANCE = new C27263Amx();

    public C27263Amx() {
        super(2);
    }

    public final AddressEditState invoke(AddressEditState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ AddressEditState invoke(AddressEditState addressEditState, Bundle bundle) {
        AddressEditState addressEditState2 = addressEditState;
        invoke(addressEditState2, bundle);
        return addressEditState2;
    }
}
