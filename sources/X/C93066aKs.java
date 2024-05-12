package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.response.CashierOptionList;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.bytedance.pipo.checkout.element.utils.CountryInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.controller.PhoneNumberController$1", f = "PhoneNumberController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aKs, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93066aKs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C92362a9W LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93066aKs(C92362a9W c92362a9W, InterfaceC67352kd<? super C93066aKs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c92362a9W;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93066aKs(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Elements elements;
        C141335gf.LIZJ(obj);
        C92362a9W c92362a9W = this.LJLIL;
        List<Elements> list = c92362a9W.LJIJ;
        if (list != null) {
            Iterator<Elements> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    elements = it.next();
                    if (o.LJ(elements.getParamName(), EnumC91966a38.PhoneCountryCode.getType())) {
                        break;
                    }
                } else {
                    elements = null;
                    break;
                }
            }
            Elements elements2 = elements;
            if (elements2 != null) {
                List<CashierOptionList> optionList = elements2.getOptionList();
                int i = 0;
                if (optionList == null || optionList.isEmpty()) {
                    List<CountryInfo> list2 = C91956a2y.LIZ;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                    for (CountryInfo countryInfo : list2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            CountryInfo countryInfo2 = countryInfo;
                            if (o.LJ(countryInfo2.countryCode, c92362a9W.LJIIZILJ)) {
                                c92362a9W.LJIL.setValue(Integer.valueOf(i));
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            String str = countryInfo2.countryCode;
                            String str2 = "";
                            if (str == null) {
                                str = "";
                            }
                            LIZ.append(str);
                            LIZ.append('+');
                            String str3 = countryInfo2.phoneCountryCode;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            LIZ.append(str2);
                            arrayList.add(X1D.LIZIZ(LIZ));
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = c92362a9W.LJIJI;
                    parcelableSnapshotMutableState.setValue(ORZ.LLIIIZ(arrayList, (Collection) parcelableSnapshotMutableState.getValue()));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
