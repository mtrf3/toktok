package X;

import Y.AfS56S0100000_4;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.repo.RegionApi;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$createTopSearchBoxListener$searchListener$1$onSearch$1", f = "DistrictFragment.kt", l = {1980}, m = "invokeSuspend")
/* renamed from: X.Aoe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27368Aoe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchDistrictRequest LJLILLLLZI;
    public final /* synthetic */ DistrictFragment LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27368Aoe(SearchDistrictRequest searchDistrictRequest, DistrictFragment districtFragment, String str, InterfaceC67352kd<? super C27368Aoe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchDistrictRequest;
        this.LJLJI = districtFragment;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27368Aoe(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj2);
            } else {
                C141335gf.LIZJ(obj2);
                C27386Aow c27386Aow = RegionApi.LIZ;
                SearchDistrictRequest searchDistrictRequest = this.LJLILLLLZI;
                c27386Aow.getClass();
                AbstractC73672Svk LIZIZ = C27386Aow.LIZIZ(searchDistrictRequest);
                this.LJLIL = 1;
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                xks.LJIILIIL(new AqS170S0100000_4(LIZIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(xks, 108), new AfS56S0100000_4(xks, 109)), 1251));
                obj2 = xks.LJIIJJI();
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            SearchDistrictsData searchDistrictsData = (SearchDistrictsData) obj2;
            if (searchDistrictsData != null) {
                DistrictFragment districtFragment = this.LJLJI;
                String str = this.LJLJJI;
                ArrayList arrayList = new ArrayList();
                List<District> list = searchDistrictsData.districts;
                if (list != null) {
                    ORS.LJJLIL(C27370Aog.LJLIL, list);
                    for (District district : list) {
                        String str2 = district.name;
                        if (str2 != null) {
                            StringBuilder sb = new StringBuilder();
                            List<District> list2 = district.parRegions;
                            if (list2 != null) {
                                int i2 = 0;
                                for (District district2 : list2) {
                                    int i3 = i2 + 1;
                                    if (i2 >= 0) {
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append(district2.name);
                                        LIZ.append(", ");
                                        sb.append(X1D.LIZIZ(LIZ));
                                        i2 = i3;
                                    } else {
                                        C47261Igj.LJJJJJ();
                                        throw null;
                                    }
                                }
                            }
                            sb.append(str2);
                            String sb2 = sb.toString();
                            o.LJIIIIZZ(sb2, "fullName.toString()");
                            arrayList.add(new C27356AoS(district, sb2, null, str, true, null, 224));
                        }
                    }
                }
                C27354AoQ<District> c27354AoQ = districtFragment.LJLJI;
                if (c27354AoQ != null) {
                    c27354AoQ.LJFF(false, arrayList, districtFragment.LJLJLLL, true, false);
                }
                if (arrayList.size() > 0 && !districtFragment.LLFF) {
                    districtFragment.LLFF = true;
                    districtFragment.LLFFF = SystemClock.elapsedRealtime();
                    View view = districtFragment.getView();
                    if (view != null) {
                        C78946Uyc.LJJIIJ(view, new C70989RtZ(), new AqS135S0200000_4((List) arrayList, (List<C27356AoS<District>>) districtFragment, (DistrictFragment) 230));
                    }
                }
            }
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "DistrictFragment.onSearch.netAPI");
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
