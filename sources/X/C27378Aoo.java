package X;

import Y.AfS56S0100000_4;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.MatchedAddress;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.RegionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.repo.RegionApi;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$onSearch$1", f = "DistrictFragment.kt", l = {1980}, m = "invokeSuspend")
/* renamed from: X.Aoo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27378Aoo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RegionRequest LJLILLLLZI;
    public final /* synthetic */ DistrictFragment LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27378Aoo(RegionRequest regionRequest, DistrictFragment districtFragment, String str, InterfaceC67352kd<? super C27378Aoo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = regionRequest;
        this.LJLJI = districtFragment;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27378Aoo(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        District district;
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
                RegionRequest regionRequest = this.LJLILLLLZI;
                c27386Aow.getClass();
                AbstractC73672Svk LIZ = C27386Aow.LIZ(regionRequest);
                this.LJLIL = 1;
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                xks.LJIILIIL(new AqS170S0100000_4(LIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(xks, 21), new AfS56S0100000_4(xks, 22)), 330));
                obj2 = xks.LJIIJJI();
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            DistrictData districtData = (DistrictData) obj2;
            if (districtData != null) {
                DistrictFragment districtFragment = this.LJLJI;
                String str = this.LJLJJI;
                ArrayList arrayList = new ArrayList();
                List<MatchedAddress> list = districtData.matchedAddressList;
                if (list != null) {
                    ORS.LJJLIL(C27391Ap1.LJLIL, list);
                    for (MatchedAddress matchedAddress : list) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(matchedAddress.zipcodeInfo);
                        LIZ2.append(' ');
                        LIZ2.append(matchedAddress.relatedCityInfo);
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        List<District> list2 = matchedAddress.multilevelDistricts;
                        if (list2 == null || (district = (District) ORZ.LLFII(list2)) == null) {
                            district = new District(null, null, null, null, null, null, null, null, null, 511, null);
                        }
                        district.multilevelDistricts = matchedAddress.multilevelDistricts;
                        arrayList.add(new C27356AoS(district, LIZIZ, null, str, true, null, 224));
                    }
                } else {
                    List<District> list3 = districtData.districts;
                    if (list3 != null) {
                        ORS.LJJLIL(C27390Ap0.LJLIL, list3);
                        for (District district2 : list3) {
                            String str2 = district2.name;
                            if (str2 != null) {
                                arrayList.add(new C27356AoS(district2, str2, null, str, true, null, 224));
                            }
                        }
                    }
                }
                C27354AoQ<District> c27354AoQ = districtFragment.LJLJI;
                if (c27354AoQ != null) {
                    districtFragment = districtFragment;
                    arrayList = arrayList;
                    c27354AoQ.LJFF(false, arrayList, districtFragment, false, true);
                }
                if (arrayList.size() > 0 && !districtFragment.LLFF) {
                    districtFragment.LLFF = true;
                    districtFragment.LLFFF = SystemClock.elapsedRealtime();
                    View view = districtFragment.getView();
                    if (view != null) {
                        C78946Uyc.LJJIIJ(view, new C70989RtZ(), new AqS135S0200000_4((List) arrayList, (List<C27356AoS<District>>) districtFragment, (DistrictFragment) 56));
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
