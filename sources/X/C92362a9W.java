package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentElements;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.a9W, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92362a9W extends C92219a7D {
    public final String LJIIZILJ;
    public final List<Elements> LJIJ;
    public final ParcelableSnapshotMutableState LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;
    public final ParcelableSnapshotMutableState LJIL;
    public final C44001o4 LJJ;
    public final InterfaceC88472Yns<String, C76800UCe> LJJI;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJJIFFI;

    public C92362a9W() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final List<PaymentElements> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PaymentElements(this.LIZ.getElement(), EnumC91966a38.MobilePhone.getType(), o.LJIILLIIL(this.LJIIIIZZ.getValue(), LJIILJJIL())));
        List<Elements> subElementList = this.LIZ.getSubElementList();
        if (subElementList != null) {
            for (Elements elements : subElementList) {
                String paramName = elements.getParamName();
                EnumC91966a38 enumC91966a38 = EnumC91966a38.PhoneCountryCode;
                if (o.LJ(paramName, enumC91966a38.getType())) {
                    arrayList.add(new PaymentElements(elements.getElement(), enumC91966a38.getType(), LJIILJJIL()));
                } else {
                    EnumC91966a38 enumC91966a382 = EnumC91966a38.Phone;
                    if (o.LJ(paramName, enumC91966a382.getType())) {
                        String str = (String) this.LJIIIIZZ.getValue();
                        if (this.LJIJJ) {
                            str = o.LJIILLIIL(str, CardStruct.IStatusCode.DEFAULT);
                        }
                        arrayList.add(new PaymentElements(elements.getElement(), enumC91966a382.getType(), str));
                    }
                }
            }
        }
        return ORZ.LLJI(arrayList);
    }

    @Override // X.C92219a7D
    public final String LJIIIIZZ() {
        if (this.LJIJJ || this.LJIJJLI) {
            return "8112345678";
        }
        return super.LJIIIIZZ();
    }

    public final String LJIILJJIL() {
        try {
            return (String) ORZ.LLFF(s.LJLJJL((CharSequence) this.LJJ.getValue(), new String[]{"+"}, 0, 6));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92362a9W(Elements elements, String str, String str2, InterfaceC88472Yns interfaceC88472Yns) {
        super(elements, null, true, "", interfaceC88472Yns, null, null, 418);
        AbstractC78621UtN coroutineContext = C36636EZk.LIZ;
        o.LJIIIZ(coroutineContext, "coroutineContext");
        this.LJIIZILJ = str2;
        C64962gm LIZ = C48841JEv.LIZ(coroutineContext);
        this.LJIJ = elements.getSubElementList();
        this.LJIJI = C78966Uyw.LJJJIL(C61878OQg.INSTANCE);
        boolean LJJJLZIJ = s.LJJJLZIJ(str, "pm_pi_ew_ovo_c_", false);
        this.LJIJJ = LJJJLZIJ;
        boolean LJJJLZIJ2 = s.LJJJLZIJ(str, "pm_pi_ew_gopay_c_", false);
        this.LJIJJLI = LJJJLZIJ2;
        this.LJIL = C78966Uyw.LJJJIL(0);
        this.LJJ = C78966Uyw.LJIJI(new IDqS422S0100000_31(this, 70));
        this.LJJI = new IDqS418S0100000_31(this, 58);
        this.LJJIFFI = new IDqS418S0100000_31(this, 56);
        if (LJJJLZIJ || LJJJLZIJ2) {
            this.LJ = ORZ.LLIIIZ(C47261Igj.LJJIJIIJI(C92192a6m.LIZ, C92193a6n.LIZ), this.LJ);
        }
        XKX.LIZLLL(LIZ, null, null, new C93066aKs(this, null), 3);
    }
}
