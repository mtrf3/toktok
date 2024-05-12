package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.ActivityC45651qj;
import X.C1A8;
import X.C212608Wa;
import X.C26045AKb;
import X.C26622Acc;
import X.C26623Acd;
import X.C26647Ad1;
import X.C26750Aeg;
import X.C26754Aek;
import X.C26755Ael;
import X.C27090AkA;
import X.C27096AkG;
import X.C27739Aud;
import X.C36636EZk;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C68322mC;
import X.C70917RsP;
import X.C73969T1h;
import X.C78565UsT;
import X.C78685UuP;
import X.C78946Uyc;
import X.InterfaceC60061Nhh;
import X.InterfaceC71003Rtn;
import X.InterfaceC74236TBo;
import X.T16;
import X.TBV;
import android.app.Activity;
import android.content.Context;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClaimIncentiveWithAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AddressListViewModel extends JediViewModel<AddressListState> implements InterfaceC60061Nhh {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public HashMap<String, Object> LJLJL;
    public Boolean LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLLL;
    public Integer LJLLLLLL;
    public String LJLZ;
    public Integer LJZ;
    public Map<String, String> LJZI;
    public AddressListData LJZL;
    public Address LL;
    public final C212608Wa LJLJJLL = new C212608Wa();
    public final List<ReachableAddress> LJLLI = new ArrayList();
    public int LJLLL = 20;

    static {
        TBV tbv = new TBV(AddressListViewModel.class, "isSelectMode", "isSelectMode()Z", 0);
        C65352Pkq.LIZ.getClass();
        LLD = new InterfaceC74236TBo[]{tbv};
    }

    public void Sv0(Address address) {
        o.LJIIIZ(address, "address");
    }

    public final boolean Nv0() {
        return o.LJ(this.LJLJLJ, Boolean.TRUE);
    }

    public final boolean Ov0() {
        return ((Boolean) this.LJLJJLL.LIZ(this, LLD[0])).booleanValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final AddressListState kv0() {
        return new AddressListState(0, null, null, null, null, 31, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lv0() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel.Lv0():void");
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventCenter.LJ().LIZIZ("ec_address_change", this);
    }

    public final void Hv0(String str) {
        String str2 = this.LJLJLLL;
        if (str2 != null) {
            ClaimIncentiveWithAddressRequest claimIncentiveWithAddressRequest = new ClaimIncentiveWithAddressRequest(str2, str);
            AddressApi.LIZ.getClass();
            ((AddressApi) C27096AkG.LIZIZ.create(AddressApi.class)).claimIncentive(claimIncentiveWithAddressRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C26647Ad1.LJLIL, C26750Aeg.LJLIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Jv0(Address address) {
        o.LJIIIZ(address, "address");
        String str = address.id;
        C27090AkA.LJLILLLLZI = str;
        if (C78685UuP.LJJJZ(str)) {
            C27090AkA.LJLJJI.clear();
        }
        IEventCenter LJ = EventCenter.LJ();
        String str2 = address.id;
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJ.LIZ("ec_address_select", C27739Aud.LJI(new AddressPageStarter.AddressEvent(str2, 3, new ReachableAddress(Boolean.TRUE, address, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 896, 0 == true ? 1 : 0))));
        this.LL = address;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    public List<Object> Pv0(AddressListData addressListData) {
        o.LJIIIZ(addressListData, "addressListData");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new ArrayList();
        withState(new AqS108S0300000_4(this, (AddressListViewModel) c68322mC, (C68322mC<List<Object>>) addressListData, (AddressListData) 6));
        return (List) c68322mC.element;
    }

    public void Rv0(Address address) {
        o.LJIIIZ(address, "address");
        setState(new AqS135S0200000_4(this, address, 19));
    }

    public final void Uv0(int i) {
        setState(new AqS29S0001000_4(i, 1));
    }

    public final void Iv0(Activity activity, InterfaceC71003Rtn interfaceC71003Rtn) {
        String str;
        o.LJIIIZ(activity, "activity");
        if (interfaceC71003Rtn != null) {
            C78946Uyc.LJJII(interfaceC71003Rtn, new C70917RsP(), C26622Acc.LJLIL);
        }
        if (((ArrayList) this.LJLLI).size() >= this.LJLLL) {
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIZ(activity.getString(R.string.f6i));
            c26045AKb.LJIIJ();
            return;
        }
        HashMap<String, Object> hashMap = this.LJLJL;
        if (hashMap != null) {
            hashMap.put("previous_page", "shipping_info");
        }
        HashMap<String, Object> hashMap2 = this.LJLJL;
        Address address = null;
        if (hashMap2 != null) {
            str = C27739Aud.LJI(hashMap2);
        } else {
            str = null;
        }
        if (((ArrayList) this.LJLLI).size() > 0) {
            address = ((ReachableAddress) ListProtector.get(this.LJLLI, 0)).address;
        }
        AddressPageStarter.LIZ(activity, interfaceC71003Rtn, null, null, "shipping_info", true, str, null, null, null, false, 0, null, null, null, null, null, address, 130956);
    }

    public final void Mv0(AddressPageStarter.AddressListEnterParams addressListEnterParams, String str) {
        boolean z;
        Boolean bool;
        String str2;
        String str3;
        HashMap<String, Object> hashMap;
        Integer num;
        String str4;
        Integer num2;
        String str5;
        Integer num3;
        boolean z2 = false;
        if (addressListEnterParams != null) {
            z = addressListEnterParams.isSelectMode;
        } else {
            z = false;
        }
        C212608Wa c212608Wa = this.LJLJJLL;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LLD;
        c212608Wa.LIZIZ(interfaceC74236TBoArr[0], this, Boolean.valueOf(z));
        if (addressListEnterParams != null) {
            bool = Boolean.valueOf(addressListEnterParams.fromClaimIncentive);
        } else {
            bool = Boolean.FALSE;
        }
        this.LJLJLJ = bool;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!Ov0()) {
                this.LJLJJLL.LIZIZ(interfaceC74236TBoArr[0], this, Boolean.valueOf(booleanValue));
            }
        }
        Map<String, String> map = null;
        if (addressListEnterParams != null) {
            str2 = addressListEnterParams.incentiveRecordId;
        } else {
            str2 = null;
        }
        this.LJLJLLL = str2;
        if (addressListEnterParams != null) {
            str3 = addressListEnterParams.productId;
        } else {
            str3 = null;
        }
        this.LJLL = str3;
        if (addressListEnterParams != null) {
            try {
                String str6 = addressListEnterParams.trackParams;
                if (str6 != null) {
                    String decode = URLDecoder.decode(str6);
                    if (decode != null) {
                        hashMap = C27739Aud.LJII(decode);
                    } else {
                        hashMap = null;
                    }
                    this.LJLJL = hashMap;
                }
            } catch (Exception unused) {
            }
        }
        if (str != null) {
            String str7 = (String) C1A8.LJIJ(str, "current_select_address_id");
            if (str7 != null) {
                setState(new AqS29S1000000_4(str7, 10));
            } else {
                String str8 = C27090AkA.LJLILLLLZI;
                if (str8 != null) {
                    setState(new AqS29S1000000_4(str8, 11));
                }
            }
        }
        if (addressListEnterParams != null) {
            num = addressListEnterParams.scene;
        } else {
            num = null;
        }
        this.LJLLLLLL = num;
        if (addressListEnterParams != null) {
            str4 = addressListEnterParams.sceneParamsStr;
        } else {
            str4 = null;
        }
        this.LJLZ = str4;
        if (addressListEnterParams != null && (num3 = addressListEnterParams.markUnavailableAddress) != null && num3.intValue() == 1) {
            z2 = true;
        }
        this.LJLLJ = z2;
        if (addressListEnterParams != null) {
            num2 = addressListEnterParams.selectScene;
        } else {
            num2 = null;
        }
        this.LJZ = num2;
        if (addressListEnterParams != null && (str5 = addressListEnterParams.extraInfo) != null) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str5, C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(Map.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(String.class)))));
                if (!(fromJson instanceof Map)) {
                    fromJson = null;
                }
                map = (Map) fromJson;
            } catch (s unused2) {
            }
        }
        this.LJZI = map;
        EventCenter.LJ().LIZJ("ec_address_change", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Qv0(X.C26753Aej r6, X.InterfaceC67352kd r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C26752Aei
            if (r0 == 0) goto L2d
            r4 = r7
            X.Aei r4 = (X.C26752Aei) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJI
            r0 = 1
            if (r1 == 0) goto L21
            if (r1 != r0) goto L33
            X.C141335gf.LIZJ(r3)
        L20:
            return r3
        L21:
            X.C141335gf.LIZJ(r3)
            r4.LJLJI = r0
            java.lang.Object r3 = r6.invoke(r4)
            if (r3 != r2) goto L20
            return r2
        L2d:
            X.Aei r4 = new X.Aei
            r4.<init>(r5, r7)
            goto L12
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel.Qv0(X.Aej, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_address_change")) {
            int i = C26755Ael.LIZ(str).type;
            if (i != 0 && i != 1) {
                if (i != 2) {
                    return;
                }
                Lv0();
                return;
            }
            Lv0();
        }
    }

    public final void Kv0(Context context, InterfaceC71003Rtn interfaceC71003Rtn, Address address) {
        String str;
        o.LJIIIZ(address, "address");
        HashMap<String, Object> hashMap = this.LJLJL;
        if (hashMap != null) {
            hashMap.put("previous_page", "shipping_info");
        }
        HashMap<String, Object> hashMap2 = this.LJLJL;
        if (hashMap2 != null) {
            str = C27739Aud.LJI(hashMap2);
        } else {
            str = null;
        }
        AddressPageStarter.LIZ(context, interfaceC71003Rtn, address, null, "shipping_info", true, str, null, null, null, false, 0, null, null, null, null, null, null, 262024);
    }

    public void Tv0(ActivityC45651qj activityC45651qj, InterfaceC71003Rtn interfaceC71003Rtn, AqS154S0100000_4 aqS154S0100000_4) {
        this.LJLLLL = true;
        AqS151S0200000_4 aqS151S0200000_4 = new AqS151S0200000_4(this, aqS154S0100000_4, 63);
        if (interfaceC71003Rtn != null) {
            C78946Uyc.LJJII(interfaceC71003Rtn, new C70917RsP(), C26623Acd.LJLIL);
        }
        C78565UsT.LJJIJ(this, C36636EZk.LIZ, new C26754Aek(this, activityC45651qj, interfaceC71003Rtn, aqS151S0200000_4, null));
    }
}
