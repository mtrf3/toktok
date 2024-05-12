package X;

import Y.AObserverS38S0110000_1;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.LocalFilterModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetRes;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SqO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73340SqO implements InterfaceC57325Mef, InterfaceC79974Va6, C0WM, InterfaceC48038ItG, InterfaceC63353Oth {
    public static String[] LJLIL;
    public static boolean LJLILLLLZI;
    public static final /* synthetic */ int LJLJI = 0;
    public static final C73340SqO LJLJJI = new C73340SqO();

    public static String[] LIZIZ() {
        String[] strArr = LJLIL;
        if (strArr != null && strArr.length > 0 && !C38354F3m.LJ(strArr[0])) {
            return LJLIL;
        }
        return new String[]{a1.LJ("https://", "log.isnssdk.com", "/service/2/device_register/"), a1.LJ("https://", "log.isnssdk.com", "/service/2/device_register/")};
    }

    public static C47020Icq LJIILLIIL() {
        return new C47020Icq(false, null, null);
    }

    public static InterfaceC46264IDs LJIJ() {
        return LegacyCommercializeServiceImpl.LJIIJ().LIZIZ();
    }

    public static V9W LJIJI() {
        return LegacyCommercializeServiceImpl.LJIIJ().LJ();
    }

    public static FWA LJIJJ() {
        return LegacyCommercializeServiceImpl.LJIIJ().LIZJ();
    }

    public static C61491OBj LJIJJLI() {
        return LegacyCommercializeServiceImpl.LJIIJ().LJII();
    }

    public static OJY LJIL() {
        return LegacyCommercializeServiceImpl.LJIIJ().LJIIIZ();
    }

    public static UCH LJJII() {
        return LegacyCommercializeServiceImpl.LJIIJ().LJIIIIZZ();
    }

    public static C78253UnR LJJIIZI() {
        return LegacyCommercializeServiceImpl.LJIIJ().LIZLLL();
    }

    public static C73246Sos LJIIIIZZ(AbstractC03160Am asDifferConfig) {
        o.LJIIJ(asDifferConfig, "$this$asDifferConfig");
        return new C73246Sos(new C73248Sou(asDifferConfig).LIZ, null);
    }

    public static final String LJIIIZ(Object obj) {
        String subtitle;
        if (!(obj instanceof ProviderEffectModel)) {
            obj = null;
        }
        com.ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel = (com.ss.ugc.effectplatform.model.ProviderEffectModel) obj;
        if (providerEffectModel != null && (subtitle = providerEffectModel.getSubtitle()) != null) {
            return subtitle;
        }
        return "";
    }

    public static final boolean LJIIJ(Fragment fragment) {
        Context context;
        if (fragment == null || (context = fragment.getContext()) == null || !fragment.isAdded() || !LJJIJ(context)) {
            return false;
        }
        return true;
    }

    public static final MediatorLiveData LJIILL(LiveData distinctUntilChanged) {
        o.LJIIIZ(distinctUntilChanged, "$this$distinctUntilChanged");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(distinctUntilChanged, new AObserverS38S0110000_1(mediatorLiveData, 4));
        return mediatorLiveData;
    }

    public static final DiversionEntranceRes LJJ(DiversionData diversionData) {
        List<DiversionEntranceRes> entranceResources;
        if (diversionData != null && (entranceResources = diversionData.getEntranceResources()) != null) {
            return (DiversionEntranceRes) ORZ.LJLLLL(entranceResources);
        }
        return null;
    }

    public static final DiversionTargetRes LJJI(DiversionData diversionData) {
        List<DiversionTargetRes> targetResources;
        if (diversionData != null && (targetResources = diversionData.getTargetResources()) != null) {
            return (DiversionTargetRes) ORZ.LJLLLL(targetResources);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment LJJIFFI(Context context) {
        boolean z;
        if (context == 0) {
            z = true;
        } else {
            z = context instanceof Application;
        }
        if (z) {
            return null;
        }
        if (context instanceof Fragment) {
            return (Fragment) context;
        }
        if (!(context instanceof C81244Vua)) {
            return null;
        }
        return ((C81244Vua) context).LIZJ;
    }

    public static String LJJIIJ(Emoji emoji) {
        return LJJIII(emoji.getResourcesId(), emoji.getId(), emoji.getVersion(), emoji.getAnimateType());
    }

    public static final boolean LJJIJ(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Application) && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC57325Mef
    public MusicDetail LJI(Object obj) {
        C57338Mes a = (C57338Mes) obj;
        o.LJIIIZ(a, "a");
        return a.LIZ;
    }

    @Override // X.C0WM
    public List LJIIJJI(EffectChannelResponse effectChannelResponse) {
        List arrayList;
        List<Effect> allCategoryEffects;
        boolean z;
        C0L1 c0l1;
        m mVar;
        int i;
        int i2;
        int i3;
        j LJJIJ;
        j LJJIJ2;
        j LJJIJ3;
        if (effectChannelResponse != null && (allCategoryEffects = effectChannelResponse.getAllCategoryEffects()) != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(allCategoryEffects, 10));
            for (Effect effect : allCategoryEffects) {
                FilterModel filterModel = new FilterModel();
                filterModel.setFilterType(2);
                filterModel.setEffect(effect);
                filterModel.setTags(effect.getTags());
                String extra = effect.getExtra();
                try {
                    new com.google.gson.o();
                    j LJJIJ4 = com.google.gson.o.LIZ(extra).LJIIZILJ().LJJIJ("filterconfig");
                    if (LJJIJ4 != null) {
                        mVar = LJJIJ4.LJIIZILJ();
                    } else {
                        mVar = null;
                    }
                    c0l1 = new C0L1();
                    if (mVar == null || (LJJIJ3 = mVar.LJJIJ("max")) == null) {
                        i = 100;
                    } else {
                        i = LJJIJ3.LJIILJJIL();
                    }
                    c0l1.LIZ = i;
                    if (mVar == null || (LJJIJ2 = mVar.LJJIJ("min")) == null) {
                        i2 = 0;
                    } else {
                        i2 = LJJIJ2.LJIILJJIL();
                    }
                    c0l1.LIZIZ = i2;
                    if (mVar == null || (LJJIJ = mVar.LJJIJ("value")) == null) {
                        i3 = 50;
                    } else {
                        i3 = LJJIJ.LJIILJJIL();
                    }
                    c0l1.LIZJ = i3;
                } catch (Throwable unused) {
                    c0l1 = new C0L1();
                }
                filterModel.filterConfig = c0l1;
                arrayList2.add(filterModel);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((FilterModel) next).filterConfig != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList3.add(next);
                }
            }
            arrayList = ORZ.LLJILJILJ(arrayList3);
        } else {
            arrayList = new ArrayList();
        }
        FilterModel filterModel2 = new FilterModel();
        filterModel2.setFilterType(0);
        LocalFilterModel localFilterModel = new LocalFilterModel();
        localFilterModel.setId(CardStruct.IStatusCode.DEFAULT);
        localFilterModel.setName(C15380j0.LJIILJJIL(R.string.l8m));
        localFilterModel.setCoverResId(R.drawable.d68);
        localFilterModel.setFilterFilePath("");
        filterModel2.filterConfig = new C0L1();
        filterModel2.setLocalFilter(localFilterModel);
        ListProtector.add(arrayList, 0, filterModel2);
        String LIVE_FILTER_PANEL = C0TY.LJ;
        o.LJIIIIZZ(LIVE_FILTER_PANEL, "LIVE_FILTER_PANEL");
        return C47261Igj.LJJIJ(new C1QC(LIVE_FILTER_PANEL, "livefilter", arrayList, null, 56));
    }

    @Override // X.InterfaceC57325Mef
    public Object LJIILIIL(Object obj) {
        MusicDetail b = (MusicDetail) obj;
        o.LJIIIZ(b, "b");
        return new C57338Mes(b);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        T t;
        Response it = (Response) obj;
        o.LJIIIZ(it, "it");
        if (it.isCodeOK() && (t = it.data) != 0) {
            return t;
        }
        C78983UzD.LJIILL(String.valueOf(it.code));
        throw new C70706Rp0(it, "code is not ok | data is null");
    }

    @Override // X.InterfaceC63353Oth
    public /* bridge */ /* synthetic */ void LIZLLL(Object obj) {
    }

    public static final Object[] LJ(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C61898ORa.LJIJJ(objArr, objArr2, 0, 0, i, 6);
        C61898ORa.LJIIZILJ(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] LJFF(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C61898ORa.LJIJJ(objArr, objArr2, 0, 0, i, 6);
        C61898ORa.LJIIZILJ(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void LJII(C188727au c188727au, java.util.Map map) {
        String str;
        for (String str2 : C47261Igj.LJJIJIIJI("search_id", "search_keyword", "search_result_id", "token_type", "search_type", "list_item_id")) {
            if (map != null && (str = (String) map.get(str2)) != null && C78685UuP.LJJJZ(str)) {
                c188727au.LJI(str2, str);
            }
        }
    }

    public static void LJIIL(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static final InterfaceC72023SOl LJIILJJIL(PdpViewModel pdpViewModel, Class cls) {
        o.LJIIIZ(pdpViewModel, "<this>");
        C69855RbH.LIZ.getClass();
        if (C69855RbH.LIZ()) {
            C26555AbX c26555AbX = pdpViewModel.LLILIL;
            o.LJIIIZ(c26555AbX, "<this>");
            InterfaceC72023SOl interfaceC72023SOl = (InterfaceC72023SOl) C78685UuP.LJIILL(cls, new BizIdentity("", c26555AbX.LIZ, c26555AbX.LIZIZ), true);
            if (interfaceC72023SOl != null) {
                interfaceC72023SOl.Hb(pdpViewModel);
                return interfaceC72023SOl;
            }
            return pdpViewModel;
        }
        return pdpViewModel;
    }

    public static final C69850RbC LJIIZILJ(PdpViewModel pdpViewModel, EnumC28000Ayq biz) {
        o.LJIIIZ(pdpViewModel, "<this>");
        o.LJIIIZ(biz, "biz");
        int LJ = C27206Am2.LJ(biz, "product_detail", null);
        C69850RbC c69850RbC = C69849RbB.LIZ.get(Integer.valueOf(LJ));
        if (c69850RbC == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Pdp Template error: biz: ");
            LIZ.append(biz.name());
            LIZ.append(", template: ");
            LIZ.append(LJ);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
        return c69850RbC;
    }

    public static final DiversionEntranceRes LJJIIJZLJL(DiversionData diversionData, EnumC55928LxE name) {
        o.LJIIIZ(name, "name");
        List<DiversionEntranceRes> entranceResources = diversionData.getEntranceResources();
        DiversionEntranceRes diversionEntranceRes = null;
        if (entranceResources == null) {
            return null;
        }
        Iterator<DiversionEntranceRes> it = entranceResources.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DiversionEntranceRes next = it.next();
            if (o.LJ(next.getName(), name.getValue())) {
                diversionEntranceRes = next;
                break;
            }
        }
        return diversionEntranceRes;
    }

    public static final DiversionTargetRes LJJIIZ(DiversionData diversionData, M15 name) {
        List<DiversionTargetRes> targetResources;
        o.LJIIIZ(name, "name");
        DiversionTargetRes diversionTargetRes = null;
        if (diversionData == null || (targetResources = diversionData.getTargetResources()) == null) {
            return null;
        }
        Iterator<DiversionTargetRes> it = targetResources.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DiversionTargetRes next = it.next();
            if (o.LJ(next.name, name.getValue())) {
                diversionTargetRes = next;
                break;
            }
        }
        return diversionTargetRes;
    }

    public static final C47020Icq LJJIJL(C47007Icd c47007Icd, InterfaceC88472Yns interfaceC88472Yns) {
        return new C47020Icq(true, c47007Icd, interfaceC88472Yns);
    }

    @Override // X.InterfaceC79974Va6
    /* renamed from: LJJIJLIJ, reason: merged with bridge method [inline-methods] */
    public void LIZ(XAudioSrc xAudioSrc, InterfaceC88472Yns interfaceC88472Yns) {
        C73362Sqk c73362Sqk;
        if (xAudioSrc == null) {
            c73362Sqk = null;
        } else {
            c73362Sqk = new C73362Sqk(xAudioSrc.getPlayUrl(), null, null, null, xAudioSrc.getPlayModel(), 14);
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c73362Sqk);
        }
    }

    public static final void LJJIJIIJI(Context context, DataChannel dataChannel, List list) {
        int i;
        long j;
        Room room;
        Room room2;
        Boolean bool;
        String str = "";
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String LIZ = CFU.LIZ(((RankTabInfo) it.next()).rankType, EnumC31059CGx.RANK_DIALOG.getScene());
                if (LIZ != null) {
                    str = LIZ;
                }
            }
        }
        if (str.length() == 0) {
            return;
        }
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || bool.booleanValue()) {
            i = 512;
        } else {
            i = (int) C15380j0.LJIJ(B9K.LIZJ(context));
        }
        int LJIJ = (int) C15380j0.LJIJ(B9K.LIZJ(context));
        C29682Bks LIZIZ = C29683Bkt.LIZIZ(str);
        long j2 = 0;
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        LIZIZ.LJJI("room_id", String.valueOf(j));
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j2 = room.getOwnerUserId();
        }
        LIZIZ.LJJI("anchor_id", String.valueOf(j2));
        LIZIZ.LJJI("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        BY3 by3 = BY3.DP;
        LIZIZ.LJIIJ(i, by3);
        LIZIZ.LJIL(LJIJ, by3);
        C29682Bks.LJIJI(LIZIZ, 8);
        LIZIZ.LJIJJ("bottom");
        LIZIZ.LJIIIZ("bottom");
        LIZIZ.LJIILJJIL("end");
        LIZIZ.LJIILLIIL("end");
        String uri = LIZIZ.LIZ().toString();
        o.LJIIIIZZ(uri, "builder.build().toString()");
        if (context != null) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
            C05590Jv.LJ((IHybridContainerService) LIZ2, context, uri);
        }
    }

    public static String LJJIJIIJIL(JSONObject jSONObject, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            str2 = jSONObject.optString(str);
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void LJJIJIL(JSONObject jSONObject, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final Object[] LIZJ(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C61898ORa.LJIJJ(objArr, objArr2, 0, 0, i, 6);
        C61898ORa.LJIIZILJ(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static String LJJIII(long j, long j2, String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C78934UyQ.LJIIZILJ(j, "STICKER", str));
        LIZ.append("/animate/");
        LIZ.append(j2);
        LIZ.append(".");
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }
}
