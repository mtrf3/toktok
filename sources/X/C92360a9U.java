package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a9U, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92360a9U extends C92219a7D {
    public final List<C92219a7D> LJIIZILJ;
    public final ParcelableSnapshotMutableState LJIJ;

    public C92360a9U() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[], java.lang.String[]] */
    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final List<PaymentElements> LIZIZ() {
        C92219a7D c92219a7D;
        C92219a7D c92219a7D2;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        Object value;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2;
        Object value2;
        if (this.LJIIZILJ.size() == 1 && o.LJ(((C92219a7D) ORZ.LJLLJ(this.LJIIZILJ)).LIZ.getParamName(), EnumC91966a38.CardHolderName.getType())) {
            return C61878OQg.INSTANCE;
        }
        ?? r4 = new String[2];
        Iterator<C92219a7D> it = this.LJIIZILJ.iterator();
        while (true) {
            c92219a7D = null;
            if (it.hasNext()) {
                c92219a7D2 = it.next();
                if (o.LJ(c92219a7D2.LIZ.getParamName(), EnumC91966a38.HolderFirstName.getType())) {
                    break;
                }
            } else {
                c92219a7D2 = null;
                break;
            }
        }
        C92219a7D c92219a7D3 = c92219a7D2;
        Object obj = "";
        if (c92219a7D3 == null || (parcelableSnapshotMutableState = c92219a7D3.LJIIIIZZ) == null || (value = parcelableSnapshotMutableState.getValue()) == null) {
            value = "";
        }
        r4[0] = value;
        Iterator<C92219a7D> it2 = this.LJIIZILJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C92219a7D next = it2.next();
            if (o.LJ(next.LIZ.getParamName(), EnumC91966a38.HolderLastName.getType())) {
                c92219a7D = next;
                break;
            }
        }
        C92219a7D c92219a7D4 = c92219a7D;
        if (c92219a7D4 != null && (parcelableSnapshotMutableState2 = c92219a7D4.LJIIIIZZ) != null && (value2 = parcelableSnapshotMutableState2.getValue()) != null) {
            obj = value2;
        }
        r4[1] = obj;
        return C47261Igj.LJJIJ(new PaymentElements(this.LIZ.getElement(), this.LIZ.getParamName(), ORZ.LLD(C47261Igj.LJJIJIIJI(r4), " ", null, null, null, 62)));
    }

    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final InterfaceC24760y8<C91941a2j> LIZLLL() {
        return this.LJIJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92360a9U(String str, InterfaceC88472Yns interfaceC88472Yns, Elements elements, List controllers) {
        super(elements, 128, true, str, interfaceC88472Yns, null, null, 418);
        o.LJIIIZ(controllers, "controllers");
        this.LJIIZILJ = controllers;
        this.LJIJ = C78966Uyw.LJJJIL(new C91941a2j(null, true, 14));
    }
}
