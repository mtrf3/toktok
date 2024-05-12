package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.AmV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27235AmV extends AbstractC65781Prl implements InterfaceC88472Yns<AddressEditState, AddressEditState> {
    public static final C27235AmV LJLIL = new C27235AmV();

    public C27235AmV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final AddressEditState invoke(AddressEditState addressEditState) {
        AddressEditState setState = addressEditState;
        o.LJIIIZ(setState, "$this$setState");
        ArrayList arrayList = new ArrayList();
        for (C27021Aj3 c27021Aj3 : setState.getInputItemVOList()) {
            if (o.LJ(c27021Aj3.LIZ.key, "address_searchbar")) {
                arrayList.add(C27021Aj3.LIZ(c27021Aj3, "", null, false, false, null, 125));
            } else {
                arrayList.add(c27021Aj3);
            }
        }
        return AddressEditState.copy$default(setState, 0, null, null, null, arrayList, false, null, null, null, null, null, null, false, 8175, null);
    }
}
