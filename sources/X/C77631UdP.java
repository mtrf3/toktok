package X;

import Y.AfS65S0100000_13;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.UdP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77631UdP implements InterfaceC77660Uds {
    public final C77636UdU LIZ = new C77636UdU();

    @Override // X.InterfaceC77660Uds
    public final void LIZIZ() {
        String LIZIZ = C77607Ud1.LIZIZ().LIZIZ();
        C77636UdU c77636UdU = this.LIZ;
        RVP rvp = new RVP(2, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), LIZIZ);
        c77636UdU.getClass();
        c77636UdU.LIZ.LIZ(rvp.LIZ());
    }

    @Override // X.InterfaceC77660Uds
    public final C77626UdK LIZ(int i) {
        return this.LIZ.LIZIZ(EnumC77641UdZ.USE, new RVP(i, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), C77607Ud1.LIZIZ().LIZJ()));
    }

    @Override // X.InterfaceC77660Uds
    public final void LIZJ(int i, long j, long j2, EnumC77641UdZ cachePolicy, boolean z) {
        o.LJIIIZ(cachePolicy, "cachePolicy");
        AbstractC73672Svk.LJIIJ(new C77638UdW(this, i, j, j2, cachePolicy, z)).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Cq
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9Cr
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // X.InterfaceC77660Uds
    public final C73390SrC LIZLLL(int i, long j, long j2, RecommendStrategyParam recommendStrategyParam, EnumC77641UdZ cachePolicy) {
        o.LJIIIZ(cachePolicy, "cachePolicy");
        return AbstractC73672Svk.LJIIJ(new C77634UdS(this, i, j, j2, cachePolicy, recommendStrategyParam));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C77626UdK LJ(int i, long j, long j2, InterfaceC77685UeH interfaceC77685UeH, boolean z, RecommendStrategyParam recommendStrategyParam, boolean z2) {
        C77648Udg c77648Udg;
        long j3;
        String str;
        BaseListResponse baseListResponse;
        DiamondPackageExtra diamondPackageExtra;
        String str2;
        DiamondPackageExtra diamondPackageExtra2;
        String str3;
        UIO.LIZ("ttlive_wallet_recharge_query_package_start", null);
        String str4 = "";
        if (z2) {
            if (i != 2) {
                str3 = "";
            } else {
                str3 = "live_room";
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_recharge_preload_sdk_start_init");
            LIZ.LJIJJ(C77608Ud2.LIZ(), "pay_method");
            LIZ.LJIJJ(str3, "request_page");
            LIZ.LJJIIJZLJL();
            c77648Udg = new C77648Udg();
            c77648Udg.LIZLLL = C30725C4b.LIZ();
            c77648Udg.LJ = str3;
        } else {
            c77648Udg = null;
        }
        String LIZIZ = C77607Ud1.LIZIZ().LIZIZ();
        if (c77648Udg != null) {
            c77648Udg.LJFF = C30725C4b.LIZ();
        }
        if (c77648Udg != null) {
            c77648Udg.LIZ = !o.LJ(LIZIZ, "");
        }
        C77626UdK LIZIZ2 = this.LIZ.LIZIZ(interfaceC77685UeH, new RVP(i, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), LIZIZ));
        if (LIZIZ2 != null) {
            UIO.LIZ("ttlive_wallet_recharge_query_package_get_cache", null);
            LIZIZ2.LJLJJI = true;
            if (c77648Udg != null) {
                c77648Udg.LIZIZ = true;
                c77648Udg.LJI = C30725C4b.LIZ();
                c77648Udg.LIZJ = true;
                c77648Udg.LJII = C30725C4b.LIZ();
                C77630UdO.LIZLLL(c77648Udg);
            }
            return LIZIZ2;
        }
        C79146V4k c79146V4k = new C79146V4k(LIZIZ, i, j, j2, z, recommendStrategyParam);
        if (C32358Cmw.LIZ()) {
            j3 = 8;
        } else {
            j3 = 0;
        }
        IRechargeApi iRechargeApi = (IRechargeApi) Q7L.LIZIZ(IRechargeApi.class);
        if (recommendStrategyParam != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(WM7.SCENE_SERVICE, recommendStrategyParam.scene);
            jSONObject.put("charge_reason", recommendStrategyParam.chargeReason);
            jSONObject.put("gift_total_coins", recommendStrategyParam.giftTotalCoins);
            jSONObject.put("coins_gap", recommendStrategyParam.coinsGap);
            jSONObject.put("gift_ids", new JSONArray((Collection) recommendStrategyParam.giftIds));
            str = jSONObject.toString();
            o.LJIIIIZZ(str, "json.toString()");
        } else {
            str = null;
        }
        BaseListResponse baseListResponse2 = (BaseListResponse) iRechargeApi.fetchDiamondPackage(LIZIZ, j, j2, j3, i, z, str).LJIJJLI(new AfS65S0100000_13(c79146V4k, 125)).LJIJJ(new AfS65S0100000_13(c79146V4k, 126)).LIZLLL();
        if (c77648Udg != null) {
            c77648Udg.LJI = C30725C4b.LIZ();
            c77648Udg.LIZIZ = true;
        }
        HashSet hashSet = new HashSet();
        List<T> list = baseListResponse2.data;
        if (list != 0) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Diamond) it.next()).iapId);
            }
            hashSet.addAll(arrayList);
        }
        DiamondPackageExtra diamondPackageExtra3 = (DiamondPackageExtra) baseListResponse2.extra;
        if (diamondPackageExtra3 != null && diamondPackageExtra3.getFullPackageList() != null) {
            List<Diamond> fullPackageList = ((DiamondPackageExtra) baseListResponse2.extra).getFullPackageList();
            o.LJIIIIZZ(fullPackageList, "serverResult.extra.fullPackageList");
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(fullPackageList, 10));
            Iterator<Diamond> it2 = fullPackageList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().iapId);
            }
            hashSet.addAll(arrayList2);
        }
        T LJ = C77607Ud1.LIZIZ().LIZ((List) new OFW(ORZ.LLJI(hashSet)).LIZ).LJ();
        o.LJIIIIZZ(LJ, "WalletServiceManager.pay…,\n        ).blockingGet()");
        List list2 = (List) LJ;
        if (c77648Udg != null) {
            c77648Udg.LJII = C30725C4b.LIZ();
            c77648Udg.LIZJ = !list2.isEmpty();
        }
        C77633UdR c77633UdR = new C77633UdR(baseListResponse2, list2);
        List<Diamond> list3 = (List) c77633UdR.LIZIZ;
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list3, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (Diamond diamond : list3) {
            linkedHashMap.put(diamond.iapId, diamond);
        }
        List<T> list4 = ((BaseListResponse) c77633UdR.LIZ).data;
        o.LJIIIIZZ(list4, "serverResult.data");
        C77633UdR.LIZIZ(list4, linkedHashMap);
        BaseListResponse baseListResponse3 = (BaseListResponse) c77633UdR.LIZ;
        if ((baseListResponse3 == null || (diamondPackageExtra2 = (DiamondPackageExtra) baseListResponse3.extra) == null || diamondPackageExtra2.getFullPackageList() == null) && (baseListResponse = (BaseListResponse) c77633UdR.LIZ) != null && (diamondPackageExtra = (DiamondPackageExtra) baseListResponse.extra) != null) {
            diamondPackageExtra.setFullPackageList(new ArrayList());
        }
        List<Diamond> fullPackageList2 = ((DiamondPackageExtra) ((BaseListResponse) c77633UdR.LIZ).extra).getFullPackageList();
        o.LJIIIIZZ(fullPackageList2, "serverResult.extra.fullPackageList");
        C77633UdR.LIZIZ(fullPackageList2, linkedHashMap);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list4) {
            if (!C38354F3m.LJ(((Diamond) obj).LJLILLLLZI)) {
                arrayList3.add(obj);
            }
        }
        DiamondPackageExtra diamondPackageExtra4 = (DiamondPackageExtra) ((BaseListResponse) c77633UdR.LIZ).extra;
        List<Diamond> fullPackageList3 = diamondPackageExtra4.getFullPackageList();
        ArrayList LIZIZ3 = s1.LIZIZ(fullPackageList3, "serverResult.extra.fullPackageList");
        for (Diamond diamond2 : fullPackageList3) {
            if (!C38354F3m.LJ(diamond2.LJLILLLLZI)) {
                LIZIZ3.add(diamond2);
            }
        }
        diamondPackageExtra4.setFullPackageList(LIZIZ3);
        R r = ((BaseListResponse) c77633UdR.LIZ).extra;
        o.LJIIIIZZ(r, "serverResult.extra");
        C77626UdK c77626UdK = new C77626UdK((DiamondPackageExtra) r, arrayList3);
        Diamond diamond3 = (Diamond) ORZ.LJLLLL(c77626UdK.LJLIL);
        if (diamond3 != null && (str2 = diamond3.LJLILLLLZI) != null) {
            str4 = str2;
        }
        C77607Ud1.LIZIZ().LIZLLL(str4);
        this.LIZ.LIZ(interfaceC77685UeH, new RVP(i, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), str4), c77626UdK);
        if (c77648Udg != null) {
            C77630UdO.LIZLLL(c77648Udg);
        }
        return c77626UdK;
    }
}
