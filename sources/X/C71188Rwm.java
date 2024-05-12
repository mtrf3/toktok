package X;

import Y.ALAdapterS9S0100000_12;
import Y.AObserverS80S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.message.AddToCartButton;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.ProductSnapShot;
import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import com.bytedance.android.livesdk.model.message.ext.ECTaskRegisterMessage;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.EcDrawEntity;
import com.bytedance.android.livesdk.model.message.ext.EcDrawMessage;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRegisterMessageEntity;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.EcMessageApi;
import com.ss.android.ugc.aweme.ecommercelive.business.cache.LiveExposedProductsCache;
import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.framework.settings.EcLuckyBagConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.i0;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Rwm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71188Rwm extends AbstractC32065CiD implements InterfaceC72822Si2, InterfaceC60061Nhh, InterfaceC27538ArO {
    public static final HashMap<String, Boolean> LLJJI = new HashMap<>();
    public static final List<String> LLJJIII = C47261Igj.LJJIJ("fe_tiktok_ecommerce_shop_cart");
    public static final List<String> LLJJIJI = C47261Igj.LJJIJ("fe_tiktok_ecommerce_live_room_shop_bag");
    public final Context LJLJJLL;
    public IIconSlot.SlotViewModel LJLJL;
    public A72 LJLJLJ;
    public Room LJLJLLL;
    public Boolean LJLL;
    public java.util.Map<String, String> LJLLI;
    public EHE<java.util.Map<String, String>> LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public long LJLLLL;
    public long LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public String LJZI;
    public String LJZL;
    public Integer LL;
    public Integer LLD;
    public String LLF;
    public java.util.Map<String, String> LLFF;
    public String LLFFF;
    public String LLFII;
    public long LLFZ;
    public long LLI;
    public long LLIFFJFJJ;
    public long LLII;
    public long LLIIII;
    public String LLIIIILZ;
    public OecInitData LLIIIJ;
    public String LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public ALE LLIIJLIL;
    public C25570A1u LLIIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LLIILII;
    public XKQ LLIILZL;
    public String LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public boolean LLILLIZIL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public C71216RxE LLILZIL;
    public int LLILZLL;
    public final C64962gm LLIZ;
    public XKQ LLIZLLLIL;
    public final C71239Rxb LLJ;
    public boolean LLJI;
    public final C48502J1u LLJIJIL;
    public final C141335gf LLJILJIL;
    public final C62822Ol8 LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ec_shop";
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(10000, 100002, 100001, Integer.valueOf(EnumC31509CYf.MEMBER.getIntType()), 10004);
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageName() {
        return "shop_bag_icon";
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onPause() {
        this.LLILL = false;
        this.LLIIIILZ = "";
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onResume() {
        this.LLILL = true;
        if (!o.LJ(this.LLIIIILZ, "")) {
            SmartRouter.buildRoute(this.LJLJJLL, this.LLIIIILZ).open();
            this.LLIIIILZ = "";
        }
    }

    public final boolean LJIIZILJ() {
        LruCache<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> lruCache;
        java.util.Map<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> snapshot;
        java.util.Set<Map.Entry<String, LinkedList<SoftReference<InterfaceC60831Nu7>>>> entrySet;
        C58310MuY.LIZIZ.getClass();
        C59886Nes c59886Nes = (C59886Nes) C60827Nu3.LJ().get("ec_shop_bag_biz");
        if (c59886Nes != null && (lruCache = c59886Nes.LJI) != null && (snapshot = lruCache.snapshot()) != null && (entrySet = snapshot.entrySet()) != null) {
            for (Map.Entry<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> entry : entrySet) {
                if (o.LJ(entry.getKey(), this.LLIIIL) && entry.getValue().size() > 0 && entry.getValue().get(0).get() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJIJI() {
        Room room;
        String idStr;
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        String valueOf;
        IIconSlot.SlotViewModel slotViewModel = this.LJLJL;
        if (slotViewModel != null && (mutableLiveData2 = slotViewModel.LJLJJI) != null) {
            int i = this.LLJILLL;
            if (i <= 0) {
                valueOf = "";
            } else if (i >= 100) {
                valueOf = "99+";
            } else {
                valueOf = String.valueOf(i);
            }
            mutableLiveData2.setValue(valueOf);
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LJLJL;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LJLLI) != null) {
            mutableLiveData.setValue(this.LJLJJLL.getString(R.string.n6a));
        }
        int i2 = this.LLILZLL;
        if ((i2 == 3 || i2 == 4) && (room = this.LJLJLLL) != null && (idStr = room.getIdStr()) != null) {
            C53799L9n.LIZLLL(2, idStr, "SLOT_LIVE_WATCHER_TOOLBAR");
        }
        this.LLILZLL = 0;
    }

    public final void LJJII() {
        Long l;
        if (!this.LLILIL) {
            Room room = this.LJLJLLL;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            boolean z = this.LLILL;
            boolean z2 = this.LLILLJJLI;
            if (C71166RwQ.LIZ(l)) {
                C71166RwQ.LJFF = true;
            }
            b.LJJIJIIJIL("rd_tiktokec_entrance_preshow", new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("anchor_show_type", "live_cart_tag"), new OSZ("entrance_form", "live_cart"), new OSZ("page_name", "live"), new OSZ(WM7.SCENE_SERVICE, "bag"), new OSZ("duration", Long.valueOf(System.currentTimeMillis() - C71195Rwt.LJIIIZ)), new OSZ("user_type", C71166RwQ.LJII), new OSZ("source", C71166RwQ.LJI), new OSZ("is_page_visible", Integer.valueOf(z ? 1 : 0)), new OSZ("has_ec_perm", Integer.valueOf(z2 ? 1 : 0)));
            this.LLILIL = true;
        }
    }

    public final void LJJIII() {
        Long l;
        if (!this.LLILII) {
            this.LLILZ = System.currentTimeMillis();
            Room room = this.LJLJLLL;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            boolean z = this.LLILL;
            boolean z2 = this.LLILLJJLI;
            if (C71166RwQ.LIZ(l)) {
                C71166RwQ.LJ = true;
            }
            b.LJJIJIIJIL("rd_tiktokec_entrance_show", new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("anchor_show_type", "live_cart_tag"), new OSZ("entrance_form", "live_cart"), new OSZ("page_name", "live"), new OSZ(WM7.SCENE_SERVICE, "bag"), new OSZ("duration", Long.valueOf(System.currentTimeMillis() - C71195Rwt.LJIIIZ)), new OSZ("user_type", C71166RwQ.LJII), new OSZ("source", C71166RwQ.LJI), new OSZ("is_page_visible", Integer.valueOf(z ? 1 : 0)), new OSZ("has_ec_perm", Integer.valueOf(z2 ? 1 : 0)));
            this.LLILII = true;
        }
    }

    public final void LJJIIZ() {
        if (this.LLILLL) {
            this.LLJIJIL.LJII("ec_access_forbidden", "1", false);
        } else {
            if (!this.LLJIJIL.LJ("ec_access_forbidden")) {
                return;
            }
            this.LLJIJIL.LJIIJ("ec_access_forbidden");
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<EnumC29188Bcu> LLJJJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC29188Bcu.LIVE_ROOM_EC_LIVE_STATUS);
        return arrayList;
    }

    @Override // X.AbstractC32066CiE, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        Object obj;
        FragmentManager supportFragmentManager;
        List<Fragment> LJJJJLI;
        SparkPopup sparkPopup;
        SparkContext sparkContext;
        String str;
        LinkedHashMap<String, SoftReference<InterfaceC60833Nu9>> linkedHashMap;
        Iterator<Map.Entry<String, SoftReference<InterfaceC60833Nu9>>> it;
        String idStr;
        String str2;
        super.onDestroy();
        if (this.LLJI) {
            Room room = this.LJLJLLL;
            if (room != null) {
                str2 = room.getIdStr();
            } else {
                str2 = null;
            }
            C247849o4.LIZ(str2);
        }
        Room room2 = this.LJLJLLL;
        if (room2 != null && (idStr = room2.getIdStr()) != null) {
            C53799L9n.LIZJ(idStr, "SLOT_BAG_BUBBLE_SHOW");
            C53799L9n.LIZJ(idStr, "SLOT_LIVE_WATCHER_TOOLBAR");
            C71023Ru7.LIZ.remove(idStr);
        }
        C48841JEv.LIZJ(this.LLIZ, null);
        ((C40135Fp5) C40133Fp3.LIZ.getValue()).LJLILLLLZI = false;
        XKQ xkq = this.LLIILZL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        if (this.LLIIJLIL != null) {
            C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
            String str3 = this.LLIIIL;
            c60827Nu3.getClass();
            C60827Nu3.LIZ(str3, "ec_shop_bag_biz");
            C60827Nu3.LJIIL("ec_shop_bag_biz");
            this.LLIIJLIL = null;
        }
        if (this.LLIIL != null) {
            C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
            String schema = this.LLIIZ;
            c60828Nu4.getClass();
            o.LJIIJ(schema, "schema");
            C25570A1u c25570A1u = (C25570A1u) C60828Nu4.LIZJ().get(C60797NtZ.LIZ("ec_shop_bag_biz"));
            if (c25570A1u != null && (linkedHashMap = c25570A1u.LIZIZ) != null && (it = linkedHashMap.entrySet().iterator()) != null) {
                while (it.hasNext()) {
                    Map.Entry<String, SoftReference<InterfaceC60833Nu9>> next = it.next();
                    if (c25570A1u.LJFF.invoke(next.getKey(), schema).booleanValue()) {
                        it.remove();
                        InterfaceC60833Nu9 interfaceC60833Nu9 = next.getValue().get();
                        if (interfaceC60833Nu9 != null) {
                            interfaceC60833Nu9.release();
                        }
                    }
                }
            }
            C37724ErI.LIZIZ.getClass();
            C60828Nu4.LJFF("ec_shop_bag_biz");
            this.LLIIL = null;
        }
        IEventCenter LJ = EventCenter.LJ();
        JSONObject jSONObject = new JSONObject();
        Room room3 = this.LJLJLLL;
        if (room3 != null) {
            obj = Long.valueOf(room3.getId());
        } else {
            obj = "";
        }
        jSONObject.put("room_id", obj);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
        LJ.LIZ("ec_live_shop_widget_on_destroy", jSONObject2);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLJJLL);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (LJJJJLI = supportFragmentManager.LJJJJLI()) != null) {
            Iterator<Fragment> it2 = LJJJJLI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Fragment next2 = it2.next();
                if ((next2 instanceof SparkPopup) && (sparkPopup = (SparkPopup) next2) != null && (sparkContext = sparkPopup.LJLLI) != null && (str = sparkContext.url) != null && s.LJJJLZIJ(str, C36349EOj.LIZ(), false)) {
                    sparkPopup.Nl(true);
                    break;
                }
            }
        }
        C72818Shy.LJII("redeem_live_product_list", this);
        C72818Shy.LJII("ec_open_live_bag", this);
        C72818Shy.LJII("ec_audience_deliver_product_param_event", this);
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // X.InterfaceC37828Esy
    public final java.util.Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    public C71188Rwm(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJJLL = context;
        this.LJLL = Boolean.FALSE;
        this.LJLLI = new HashMap();
        this.LJLLLL = -1L;
        this.LJLLLLLL = -1L;
        this.LLFF = new HashMap();
        this.LLIIII = -1L;
        this.LLIIIILZ = "";
        this.LLIIIL = "";
        this.LLIIIZ = true;
        this.LLIIZ = "";
        this.LLIZ = C48841JEv.LIZ(C36576EXc.LIZJ);
        this.LLJ = new C71239Rxb(new C71236RxY(this), new ALAdapterS9S0100000_12(this, 16));
        this.LLJIJIL = new C48502J1u(C71188Rwm.class.getName());
        this.LLJILJIL = new C141335gf();
        C221108m2.LIZIZ(L9W.INSTANCE);
        this.LLJILJILJ = C221108m2.LIZIZ(C53038Kri.LJLIL);
    }

    public final android.net.Uri LJIIL(android.net.Uri uri) {
        String str;
        java.util.Map<String, String> map = this.LLFF;
        if (map != null && (str = map.get("source_module")) != null) {
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            Uri.Builder buildUpon = uri.buildUpon();
            if (queryParameterNames.contains("source_module")) {
                return uri;
            }
            android.net.Uri build = buildUpon.appendQueryParameter("source_module", str).build();
            o.LJIIIIZZ(build, "builder.appendQueryParameter(key, value).build()");
            return build;
        }
        return uri;
    }

    public final void LJIILIIL(java.util.Map<Integer, Integer> map) {
        boolean z;
        boolean z2;
        String idStr;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        Integer num;
        boolean z3 = this.LLJI;
        if (map == null || (num = map.get(5)) == null || num.intValue() != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z3 != z) {
            this.LLJI = z;
            try {
                SettingsManager.LIZLLL().getClass();
                z2 = SettingsManager.LIZ("ec_anchor_or_moderator_permission_check_enable", true);
            } catch (Throwable unused) {
                z2 = C71249Rxl.LIZ;
            }
            if (!z2) {
                return;
            }
            if (z) {
                XKQ xkq = this.LLIZLLLIL;
                if (xkq != null && true == xkq.isActive()) {
                    return;
                }
                IIconSlot.SlotViewModel slotViewModel = this.LJLJL;
                if (slotViewModel != null && (mutableLiveData2 = slotViewModel.LJZL) != null) {
                    mutableLiveData2.setValue(Boolean.FALSE);
                }
                this.LLIZLLLIL = XKX.LIZLLL(this.LLIZ, null, null, new C71165RwP(this, null), 3);
                return;
            }
            XKQ xkq2 = this.LLIZLLLIL;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            }
            IIconSlot.SlotViewModel slotViewModel2 = this.LJLJL;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LJZL) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            Room room = this.LJLJLLL;
            if (room != null && (idStr = room.getIdStr()) != null) {
                C71023Ru7.LIZ.remove(idStr);
            }
        }
    }

    public final void LJIILJJIL(String str) {
        Long l;
        java.util.Map map;
        String str2;
        Long l2;
        Long l3;
        User owner;
        Long l4 = null;
        if (this.LLJI) {
            String LIZ = CreatorProductListLynxConfigSettings.LIZ();
            Room room = this.LJLJLLL;
            if (room == null || (str2 = room.getIdStr()) == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            StringBuilder LIZJ = b1.LIZJ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(LIZ, "_roomId_", str2, false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false), "&moderate_author_id=");
            Room room2 = this.LJLJLLL;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                l2 = Long.valueOf(owner.getId());
            } else {
                l2 = null;
            }
            LIZJ.append(l2);
            LIZJ.append("&user_type=moderator");
            SmartRouter.buildRoute(this.LJLJJLL, X1D.LIZIZ(LIZJ)).open();
            OSZ[] oszArr = new OSZ[5];
            oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            Room room3 = this.LJLJLLL;
            if (room3 != null) {
                l3 = Long.valueOf(room3.getId());
            } else {
                l3 = null;
            }
            oszArr[1] = new OSZ("room_id", String.valueOf(l3));
            Room room4 = this.LJLJLLL;
            if (room4 != null) {
                l4 = Long.valueOf(room4.getOwnerUserId());
            }
            oszArr[2] = new OSZ("author_id", String.valueOf(l4));
            oszArr[3] = new OSZ("moderator_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
            oszArr[4] = new OSZ("user_type", "moderator");
            C48658J7u.LIZ("livesdk_tiktokec_product_icon_click", C113554cx.LJJL(oszArr));
            return;
        }
        this.LLIIII = System.currentTimeMillis();
        LJIILL(this.LLIIIJ);
        C48502J1u c48502J1u = this.LLJIJIL;
        Room room5 = this.LJLJLLL;
        if (room5 != null) {
            l = Long.valueOf(room5.getId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        Boolean bool = this.LJLL;
        java.util.Map<String, String> map2 = this.LJLLI;
        HashMap hashMap = new HashMap();
        EHE<java.util.Map<String, String>> ehe = this.LJLLILLLL;
        if (ehe != null && (map = (java.util.Map) EHE.LIZ(ehe)) != null) {
            hashMap.putAll(map);
            hashMap.put("refer", "icon");
            hashMap.put("label", "user_otherclick");
        }
        C71183Rwh.LJ(c48502J1u, bool, valueOf, "icon", map2, hashMap, null);
        C71216RxE c71216RxE = this.LLILZIL;
        if (c71216RxE != null) {
            C71237RxZ c71237RxZ = c71216RxE.LIZ;
            String userId = c71216RxE.LIZIZ;
            c71237RxZ.getClass();
            o.LJIIIZ(userId, "userId");
            int LIZJ2 = i0.LIZJ("click_shop_bag_count_", userId, c71237RxZ.LIZ, 0);
            if (LIZJ2 < 3) {
                C71237RxZ c71237RxZ2 = c71216RxE.LIZ;
                int i = LIZJ2 + 1;
                String userId2 = c71216RxE.LIZIZ;
                c71237RxZ2.getClass();
                o.LJIIIZ(userId2, "userId");
                Keva keva = c71237RxZ2.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("click_shop_bag_count_");
                LIZ2.append(userId2);
                keva.storeInt(X1D.LIZIZ(LIZ2), i);
            }
        }
        LJIJJ(null, str, false, null);
        if (((Number) C73782v0.LIZ.getValue()).intValue() <= 0) {
            return;
        }
        C73732uv.LIZIZ(C73712ut.LIZ);
    }

    public final void LJIILL(OecInitData oecInitData) {
        String str;
        if (oecInitData != null) {
            int i = oecInitData.productNum;
            int i2 = oecInitData.displayProductNum;
            if (i <= 0) {
                if (i2 > 0) {
                    str = "product_not_available";
                } else {
                    return;
                }
            } else {
                str = "product_available";
            }
            if (!TextUtils.isEmpty(str)) {
                this.LLJIJIL.LJII("shopping_status", str, false);
            }
        }
    }

    public final void LJIILLIIL(int i) {
        boolean z;
        java.util.Map<EnumC29188Bcu, MutableLiveData<Object>> map;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLIL != z) {
            this.LLIL = z;
            IIconSlot.SlotViewModel slotViewModel = this.LJLJL;
            if (slotViewModel != null && (map = slotViewModel.LJLLLLLL) != null) {
                LiveData liveData = (LiveData) ((ConcurrentHashMap) map).get(EnumC29188Bcu.LIVE_ROOM_EC_LIVE_STATUS);
                if (liveData != null) {
                    liveData.postValue(Boolean.valueOf(this.LLIL));
                }
            }
        }
    }

    public final void LJJIIJ(int i) {
        String str;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<String> mutableLiveData;
        Room room = this.LJLJLLL;
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (C53799L9n.LIZ(str, "SLOT_LIVE_WATCHER_TOOLBAR") != 5 && (slotViewModel = this.LJLJL) != null && (mutableLiveData = slotViewModel.LJLJJI) != null) {
            if (i > 0) {
                if (i >= 100) {
                    str2 = "99+";
                } else {
                    str2 = String.valueOf(i);
                }
            }
            mutableLiveData.postValue(str2);
        }
    }

    public final void LJJIIJZLJL(boolean z) {
        Long l;
        Long l2;
        Long l3;
        java.util.Map map;
        MutableLiveData<Boolean> mutableLiveData;
        int i = this.LLJILLL;
        boolean z2 = false;
        if (i <= 0 && !this.LLJI && !this.LLILLL) {
            IIconSlot.SlotViewModel slotViewModel = this.LJLJL;
            if (slotViewModel != null) {
                C78897Uxp.LJJJLIIL(slotViewModel, false);
            }
            LJIIIZ();
            return;
        }
        LJJIIJ(i);
        IIconSlot.SlotViewModel slotViewModel2 = this.LJLJL;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LJLILLLLZI) != null) {
            z2 = o.LJ(mutableLiveData.getValue(), Boolean.TRUE);
        }
        Long l4 = null;
        if (!z2) {
            IIconSlot.SlotViewModel slotViewModel3 = this.LJLJL;
            if (slotViewModel3 != null) {
                C78897Uxp.LJJJLIIL(slotViewModel3, true);
            }
            C48502J1u c48502J1u = this.LLJIJIL;
            Room room = this.LJLJLLL;
            if (room != null) {
                l2 = Long.valueOf(room.getId());
            } else {
                l2 = null;
            }
            String valueOf = String.valueOf(l2);
            Boolean bool = this.LJLL;
            java.util.Map<String, String> map2 = this.LJLLI;
            HashMap hashMap = new HashMap();
            EHE<java.util.Map<String, String>> ehe = this.LJLLILLLL;
            if (ehe != null && (map = (java.util.Map) EHE.LIZ(ehe)) != null) {
                hashMap.putAll(map);
                hashMap.put("refer", "icon");
                hashMap.put("label", "user_othershow");
            }
            C71183Rwh.LJFF(c48502J1u, valueOf, bool, map2, hashMap);
            Room room2 = this.LJLJLLL;
            if (room2 != null) {
                l3 = Long.valueOf(room2.getId());
            } else {
                l3 = null;
            }
            C71167RwR.LIZ(l3, true, this.LLILLJJLI);
            LJJII();
            LJJIII();
        }
        if (z) {
            Room room3 = this.LJLJLLL;
            if (room3 != null) {
                l = Long.valueOf(room3.getId());
            } else {
                l = null;
            }
            String valueOf2 = String.valueOf(l);
            Room room4 = this.LJLJLLL;
            if (room4 != null) {
                l4 = Long.valueOf(room4.getOwnerUserId());
            }
            C72852tV.LIZIZ(l4, valueOf2);
        }
        this.LLILLIZIL = true;
    }

    @Override // X.AbstractC32066CiE, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72818Shy.LIZLLL("redeem_live_product_list", this);
        C72818Shy.LIZLLL("ec_open_live_bag", this);
        C72818Shy.LIZLLL("ec_audience_deliver_product_param_event", this);
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        Long l;
        String str;
        EnumC71217RxF enumC71217RxF;
        String str2;
        Integer num;
        long j;
        Long l2;
        int i;
        Long l3;
        String str3;
        Long l4;
        String str4;
        int i2;
        String str5;
        boolean LIZ;
        MutableLiveData<Boolean> mutableLiveData;
        Room room = this.LJLJLLL;
        Long l5 = null;
        String str6 = null;
        Long l6 = null;
        Long l7 = null;
        Long l8 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        String str7 = "";
        if (iMessage instanceof ECommerceMessage) {
            ECommerceMessage eCommerceMessage = (ECommerceMessage) iMessage;
            int i3 = eCommerceMessage.actionType;
            IIconSlot.SlotViewModel slotViewModel = this.LJLJL;
            if (slotViewModel == null || (mutableLiveData = slotViewModel.LJLILLLLZI) == null || !o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
                Room room2 = this.LJLJLLL;
                if (room2 != null) {
                    l2 = Long.valueOf(room2.getId());
                } else {
                    l2 = null;
                }
                String valueOf2 = String.valueOf(l2);
                String str8 = C71166RwQ.LJII;
                if (C71150RwA.LIZJ) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        if (i3 == 7) {
                                            i = 1008;
                                        }
                                    } else {
                                        i = 1007;
                                    }
                                } else {
                                    i = 1006;
                                }
                            } else {
                                i = 1005;
                            }
                        } else {
                            i = 1004;
                        }
                    } else {
                        i = 1003;
                    }
                    EnumC53638L3i enumC53638L3i = EnumC53638L3i.SHOP_BAG_ICON;
                    Integer valueOf3 = Integer.valueOf(i);
                    LinkedHashMap LIZ2 = C0JU.LIZ("room_id", valueOf2);
                    if (str8 == null) {
                        str8 = "";
                    }
                    LIZ2.put("live_role", str8);
                    C66832jn.LIZIZ("rd_tiktokec_shop_bag_icon_exception", enumC53638L3i, valueOf3, null, LIZ2);
                }
            }
            int i4 = eCommerceMessage.actionType;
            switch (i4) {
                case 0:
                    int i5 = eCommerceMessage.liveProductNumber;
                    if (this.LLJI) {
                        this.LLJILLL = i5;
                        this.LLJJ = 0;
                        C71150RwA.LIZ = i5;
                        LJJIIJZLJL(true);
                        LJIILLIIL(i5);
                    } else {
                        XKX.LIZLLL(this.LLIZ, null, null, new C75082x6(this, i5, null), 3);
                    }
                    LJIL(eCommerceMessage.actionType, null);
                    LJJ(eCommerceMessage.actionType, null);
                    return;
                case 1:
                    PopProduct popProduct = eCommerceMessage.popProduct;
                    if (popProduct != null) {
                        String.valueOf(Long.valueOf(popProduct.productId).longValue());
                        this.LLILLIZIL = true;
                    }
                    int i6 = eCommerceMessage.actionType;
                    JSONObject jSONObject = new JSONObject();
                    PopProduct popProduct2 = eCommerceMessage.popProduct;
                    if (popProduct2 != null) {
                        jSONObject.put("product_id", String.valueOf(Long.valueOf(popProduct2.productId).longValue()));
                    }
                    LJJ(i6, jSONObject);
                    return;
                case 2:
                    LJIL(i4, null);
                    LJJ(eCommerceMessage.actionType, null);
                    return;
                case 3:
                    LJIL(i4, null);
                    LJJ(eCommerceMessage.actionType, null);
                    Room room3 = this.LJLJLLL;
                    if (room3 != null) {
                        l7 = Long.valueOf(room3.getOwnerUserId());
                    }
                    C72852tV.LIZIZ(l7, valueOf);
                    this.LLILLIZIL = true;
                    return;
                case 4:
                case 5:
                    LJJ(i4, null);
                    this.LLILLIZIL = true;
                    if (((Boolean) C52668Klk.LIZ.getValue()).booleanValue()) {
                        ProductSnapShot productSnapShot = eCommerceMessage.productSnapShot;
                        if (productSnapShot == null || productSnapShot.productId == null) {
                            return;
                        }
                        int i7 = eCommerceMessage.actionType;
                        JSONObject jSONObject2 = new JSONObject();
                        ProductSnapShot productSnapShot2 = eCommerceMessage.productSnapShot;
                        if (productSnapShot2 != null) {
                            str3 = C27739Aud.LJI(productSnapShot2);
                        } else {
                            str3 = null;
                        }
                        jSONObject2.put("product_snap_shot", str3);
                        LJIL(i7, jSONObject2);
                        Room room4 = this.LJLJLLL;
                        if (room4 != null) {
                            l4 = Long.valueOf(room4.getId());
                        } else {
                            l4 = null;
                        }
                        String valueOf4 = String.valueOf(l4);
                        int i8 = eCommerceMessage.actionType;
                        ProductSnapShot productSnapShot3 = eCommerceMessage.productSnapShot;
                        if (valueOf4.length() == 0 || productSnapShot3 == null || (str4 = productSnapShot3.productId) == null || str4.length() == 0) {
                            return;
                        }
                        String LIZ3 = C71284RyK.LIZ("product_update", valueOf4);
                        if (LIZ3 == null) {
                            if (i8 == 5) {
                                productSnapShot3.timestamp = 0L;
                            }
                            C71284RyK.LIZIZ("product_update", valueOf4, C27739Aud.LJI(C51029K0z.LJJIIZI(new OSZ(productSnapShot3.productId, productSnapShot3))));
                            return;
                        }
                        try {
                            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), LIZ3, C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(HashMap.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(ProductSnapShot.class)))));
                            if (!(fromJson instanceof HashMap)) {
                                fromJson = null;
                            }
                            HashMap hashMap = (HashMap) fromJson;
                            if (hashMap == null) {
                                return;
                            }
                            ProductSnapShot productSnapShot4 = (ProductSnapShot) hashMap.get(productSnapShot3.productId);
                            if (productSnapShot4 == null) {
                                productSnapShot4 = productSnapShot3;
                            } else if (i8 != 4) {
                                if (i8 == 5) {
                                    if (!o.LJ(productSnapShot3.title, "")) {
                                        productSnapShot4.title = productSnapShot3.title;
                                    }
                                    com.bytedance.android.livesdk.model.message.Img img = productSnapShot3.cover;
                                    if (img == null || (str5 = img.url) == null || str5.length() == 0) {
                                        productSnapShot4.cover = productSnapShot3.cover;
                                    }
                                }
                            } else {
                                long j2 = productSnapShot3.timestamp;
                                if (j2 > productSnapShot4.timestamp && ((i2 = productSnapShot3.stockType) == 1 || i2 == 2)) {
                                    productSnapShot4.stockType = i2;
                                    productSnapShot4.timestamp = j2;
                                    AddToCartButton addToCartButton = productSnapShot3.addToCartButton;
                                    if (addToCartButton != null) {
                                        productSnapShot4.addToCartButton = addToCartButton;
                                    }
                                }
                            }
                            String str9 = productSnapShot3.productId;
                            o.LJIIIIZZ(str9, "productSnapShot.productId");
                            hashMap.put(str9, productSnapShot4);
                            C71284RyK.LIZIZ("product_update", valueOf4, C27739Aud.LJI(hashMap));
                            return;
                        } catch (com.google.gson.s unused) {
                            return;
                        }
                    }
                    LJIL(eCommerceMessage.actionType, null);
                    Room room5 = this.LJLJLLL;
                    if (room5 != null) {
                        l3 = Long.valueOf(room5.getId());
                    } else {
                        l3 = null;
                    }
                    String valueOf5 = String.valueOf(l3);
                    Room room6 = this.LJLJLLL;
                    if (room6 != null) {
                        l6 = Long.valueOf(room6.getOwnerUserId());
                    }
                    C72852tV.LIZIZ(l6, valueOf5);
                    return;
                case 6:
                default:
                    return;
                case 7:
                    AtmosphereTagInfo atmosphereTagInfo = eCommerceMessage.atmosphereTagInfo;
                    if (atmosphereTagInfo == null) {
                        return;
                    }
                    if (this.LLJI) {
                        int i9 = atmosphereTagInfo.tagType;
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 == 3) {
                                    LIZ = C71023Ru7.LIZJ(valueOf, true);
                                }
                                XKX.LIZLLL(this.LLIZ, null, null, new C71207Rx5(atmosphereTagInfo, null), 3);
                                return;
                            }
                            LIZ = C71023Ru7.LIZIZ(valueOf, true);
                        } else {
                            LIZ = C71023Ru7.LIZ(valueOf, true);
                        }
                        if (!LIZ) {
                            return;
                        }
                        XKX.LIZLLL(this.LLIZ, null, null, new C71207Rx5(atmosphereTagInfo, null), 3);
                        return;
                    }
                    XKX.LIZLLL(this.LLIZ, null, null, new C71208Rx6(atmosphereTagInfo, null), 3);
                    return;
                case 8:
                    C52258Kf8.LIZ.getClass();
                    if (!C52258Kf8.LIZ()) {
                        return;
                    }
                    this.LLILLL = true;
                    this.LLILLJJLI = false;
                    this.LLILLIZIL = true;
                    this.LLJILLL = 0;
                    this.LLJJ = 0;
                    LJJIIZ();
                    LJJIIJZLJL(false);
                    LJIILLIIL(0);
                    LJIL(eCommerceMessage.actionType, null);
                    LJJ(eCommerceMessage.actionType, null);
                    Room room7 = this.LJLJLLL;
                    if (room7 != null) {
                        str6 = C17280m4.LIZ(room7);
                    }
                    C71284RyK.LIZIZ("shop_bag", str6, "");
                    C71284RyK.LIZIZ("product_update", str6, "");
                    return;
                case 9:
                    C52258Kf8.LIZ.getClass();
                    if (!C52258Kf8.LIZ()) {
                        return;
                    }
                    this.LLILLL = false;
                    this.LLILLJJLI = true;
                    this.LLILLIZIL = true;
                    LJJIIZ();
                    LJIL(eCommerceMessage.actionType, null);
                    LJJ(eCommerceMessage.actionType, null);
                    try {
                        XKX.LIZLLL(this.LLIZ, null, null, new C75092x7(this, null), 3);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable unused2) {
                    }
                    LJJIFFI(null, true);
                    return;
            }
        }
        if (iMessage instanceof ECTaskRegisterMessage) {
            String userId = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            if (!C78685UuP.LJJJZ(valueOf) || !C78685UuP.LJJJZ(userId)) {
                return;
            }
            C74992wx c74992wx = EcMessageApi.LIZ;
            o.LJIIIIZZ(userId, "userId");
            ECTaskRegisterMessage eCTaskRegisterMessage = (ECTaskRegisterMessage) iMessage;
            EcTaskRegisterMessageEntity ecTaskRegisterMessageEntity = eCTaskRegisterMessage.entity;
            if (ecTaskRegisterMessageEntity != null) {
                str2 = ecTaskRegisterMessageEntity.taskId;
            } else {
                str2 = null;
            }
            String valueOf6 = String.valueOf(str2);
            EcTaskRegisterMessageEntity ecTaskRegisterMessageEntity2 = eCTaskRegisterMessage.entity;
            if (ecTaskRegisterMessageEntity2 != null) {
                num = Integer.valueOf(ecTaskRegisterMessageEntity2.interval);
            } else {
                num = null;
            }
            if (num != null) {
                j = num.intValue();
            } else {
                j = 0;
            }
            long LJIJI = C78842Uww.LJIJI(V0Q.Default, new UIW(0L, j)) + 0;
            c74992wx.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C73892vB(LJIJI, valueOf, userId, valueOf6, null), 3);
            return;
        }
        if (iMessage instanceof ECShortItemRefreshMessage) {
            LJJIFFI((ECShortItemRefreshMessage) iMessage, false);
            return;
        }
        if (iMessage instanceof MemberMessage) {
            MemberMessage memberMessage = (MemberMessage) iMessage;
            int i10 = memberMessage.action;
            if (i10 != 5 && i10 != 6 && i10 != 20) {
                return;
            }
            LJIILIIL(memberMessage.adminPermissions);
            Room room8 = this.LJLJLLL;
            if (room8 != null) {
                l8 = Long.valueOf(room8.getId());
            }
            boolean z = this.LLJI;
            if (C71166RwQ.LIZ(l8)) {
                if (z) {
                    enumC71217RxF = EnumC71217RxF.MODERATOR;
                } else {
                    enumC71217RxF = EnumC71217RxF.AUDIENCE;
                }
                C71166RwQ.LJII = enumC71217RxF.getRoleStr();
            }
            if (this.LLJJ > 0) {
                return;
            }
            LJJIIJZLJL(true);
            return;
        }
        if (!(iMessage instanceof EcDrawMessage)) {
            return;
        }
        IShortTouchService LJI = LiveOuterService.LJJJLL().LJJIJIL().LJI();
        if (LJI != null) {
            LJI.sX(UOS.NAME, "shortTouchEcommerceLuckyBag");
        }
        EcDrawEntity ecDrawEntity = ((EcDrawMessage) iMessage).entity;
        if (ecDrawEntity == null) {
            return;
        }
        EcLuckyBagConfig.LIZ.getClass();
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcLuckyBagConfig.EcLuckyBagSettingConfig ecLuckyBagSettingConfig = EcLuckyBagConfig.LIZIZ;
        EcLuckyBagConfig.EcLuckyBagSettingConfig ecLuckyBagSettingConfig2 = (EcLuckyBagConfig.EcLuckyBagSettingConfig) LIZLLL.LJIIIIZZ("ec_lucky_bag_config", EcLuckyBagConfig.EcLuckyBagSettingConfig.class, ecLuckyBagSettingConfig);
        if (ecLuckyBagSettingConfig2 != null) {
            ecLuckyBagSettingConfig = ecLuckyBagSettingConfig2;
        }
        Uri.Builder buildUpon = UriProtector.parse(ecLuckyBagSettingConfig.getResultSchema()).buildUpon();
        buildUpon.appendQueryParameter("sub_type", String.valueOf(ecDrawEntity.subType));
        buildUpon.appendQueryParameter("activity_id", String.valueOf(ecDrawEntity.activityId));
        buildUpon.appendQueryParameter("start_time", String.valueOf(System.currentTimeMillis()));
        ImageModel imageModel = ecDrawEntity.incentiveImage;
        if (imageModel != null) {
            List<String> urls = imageModel.getUrls();
            o.LJIIIIZZ(urls, "image.urls");
            buildUpon.appendQueryParameter("incentive_image", (String) ORZ.LJLLLL(urls));
            buildUpon.appendQueryParameter("incentive_record_id", String.valueOf(ecDrawEntity.incentiveRecordId));
        }
        OSZ[] oszArr = new OSZ[8];
        Room room9 = this.LJLJLLL;
        if (room9 == null || (str = room9.getIdStr()) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("room_id", str);
        String str10 = this.LJLLJ;
        if (str10 == null) {
            str10 = "";
        }
        oszArr[1] = new OSZ("enter_from_merge", str10);
        String str11 = this.LJLLL;
        if (str11 == null) {
            str11 = "";
        }
        oszArr[2] = new OSZ("enter_method", str11);
        String str12 = this.LJLZ;
        if (str12 != null) {
            str7 = str12;
        }
        oszArr[3] = new OSZ("action_type", str7);
        Room room10 = this.LJLJLLL;
        if (room10 != null) {
            l5 = Long.valueOf(room10.getOwnerUserId());
        }
        oszArr[4] = new OSZ("author_id", String.valueOf(l5));
        oszArr[5] = new OSZ("follow_status", this.LJLJJI);
        oszArr[6] = new OSZ("source_page_type", "live");
        oszArr[7] = new OSZ("page_type", "live");
        buildUpon.appendQueryParameter("track_params", C27739Aud.LJI(C113554cx.LJJL(oszArr)));
        String uri = buildUpon.build().toString();
        o.LJIIIIZZ(uri, "finalSchema.build().toString()");
        this.LLIIIILZ = uri;
        SmartRouter.buildRoute(this.LJLJJLL, buildUpon.build().toString()).open();
    }

    @QD3(sticky = true)
    public final void onPopCardChangeStatus(C68092lp event) {
        String str;
        String idStr;
        o.LJIIIZ(event, "event");
        Room room = this.LJLJLLL;
        if (room != null && (idStr = room.getIdStr()) != null && C53799L9n.LIZ(idStr, "SLOT_LIVE_WATCHER_TOOLBAR") == 5) {
            return;
        }
        int i = event.LJLIL;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (event.LJLILLLLZI) {
                C48502J1u eventParamHelper = this.LLJIJIL;
                o.LJIIIZ(eventParamHelper, "eventParamHelper");
                C188727au c188727au = new C188727au();
                String LIZJ = eventParamHelper.LIZJ("author_id");
                String str2 = "";
                if (LIZJ == null) {
                    LIZJ = "";
                }
                c188727au.LJIIIZ("author_id", LIZJ);
                c188727au.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                String LIZJ2 = eventParamHelper.LIZJ("room_id");
                if (LIZJ2 == null) {
                    LIZJ2 = "";
                }
                c188727au.LJIIIZ("room_id", LIZJ2);
                String LIZJ3 = eventParamHelper.LIZJ("enter_from_merge");
                if (LIZJ3 == null) {
                    LIZJ3 = "";
                }
                c188727au.LJIIIZ("enter_from_merge", LIZJ3);
                String LIZJ4 = eventParamHelper.LIZJ("enter_method");
                if (LIZJ4 == null) {
                    LIZJ4 = "";
                }
                c188727au.LJIIIZ("enter_method", LIZJ4);
                String LIZJ5 = eventParamHelper.LIZJ("action_type");
                if (LIZJ5 == null) {
                    LIZJ5 = "";
                }
                c188727au.LJIIIZ("action_type", LIZJ5);
                String LIZJ6 = eventParamHelper.LIZJ("is_ad");
                if (LIZJ6 != null) {
                    str2 = LIZJ6;
                }
                c188727au.LJIIIZ("is_ad", str2);
                C48658J7u.LIZ("livesdk_tiktokec_cart_effect_show", c188727au.LIZ);
                this.LLILZLL = 2;
                if (C71126Rvm.LIZIZ() == 1 || C71126Rvm.LIZIZ() == 3) {
                    LJIIJJI("ecommerce_live_shopping_bag/ecommercelive_shopping_cart_daily_anim.json");
                    return;
                } else {
                    LJIIJJI("ecommerce_live_shopping_bag/ecommercelive_shopping_bag_daily_anim.json");
                    return;
                }
            }
            LJIIIZ();
            return;
        }
        if (event.LJLILLLLZI) {
            this.LLILZLL = 1;
            OecInitData oecInitData = this.LLIIIJ;
            if (oecInitData != null) {
                str = oecInitData.bagAnimation;
            } else {
                str = null;
            }
            LJIIJJI(str);
            return;
        }
        LJIIIZ();
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        java.util.Map<String, Object> LIZIZ;
        String str;
        Long l;
        List list;
        java.util.Map<String, Object> map;
        String str2 = c199097rd.LJLIL;
        int hashCode = str2.hashCode();
        List list2 = null;
        if (hashCode != -1212468668) {
            if (hashCode != -1130961282) {
                if (hashCode != 1743779497 || !str2.equals("ec_open_live_bag")) {
                    return;
                }
                this.LLIIII = System.currentTimeMillis();
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null) {
                    map = interfaceC78280Uns2.LIZIZ();
                } else {
                    map = null;
                }
                LJIJJLI(this, null, "ec_open_live_bag", map, 8);
                return;
            }
            if (!str2.equals("redeem_live_product_list")) {
                return;
            }
            this.LLIIII = System.currentTimeMillis();
            LJIJJLI(this, null, "redeem_live_product_list", null, 12);
            return;
        }
        if (!str2.equals("ec_audience_deliver_product_param_event") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null || (LIZIZ = interfaceC78280Uns.LIZIZ()) == null) {
            return;
        }
        try {
            LiveExposedProductsCache liveExposedProductsCache = LiveExposedProductsCache.LIZ;
            Room room = this.LJLJLLL;
            if (room != null) {
                str = room.getIdStr();
            } else {
                str = null;
            }
            Room room2 = this.LJLJLLL;
            if (room2 != null) {
                l = Long.valueOf(room2.getOwnerUserId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            Object obj = LIZIZ.get("deliver_show_product_list");
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            Object obj2 = LIZIZ.get("deliver_click_product_list");
            if (obj2 instanceof List) {
                list2 = (List) obj2;
            }
            liveExposedProductsCache.getClass();
            if (str == null) {
                return;
            }
            LiveExposedProductsCache.LIZ(str, valueOf, new AqS143S0200000_12(list, (List<String>) list2, (List<String>) 43));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    @QD3
    public final void onShowBagList(C9CU showBagEvent) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        Long l;
        o.LJIIIZ(showBagEvent, "showBagEvent");
        if (!this.LLJI && (slotViewModel = this.LJLJL) != null && (mutableLiveData = slotViewModel.LJLILLLLZI) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
            String str = showBagEvent.LJLIL;
            Room room = this.LJLJLLL;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            if (o.LJ(str, String.valueOf(l))) {
                LJIJJLI(this, showBagEvent.LJLILLLLZI, "ec_open_live_bag_from_voucher", showBagEvent.LJLJI, 8);
            }
        }
    }

    @QD3
    public final void onShowBagList(C71061Ruj showBagList) {
        Long l;
        o.LJIIIZ(showBagList, "showBagList");
        if (showBagList.LJLIL) {
            String str = showBagList.LJLILLLLZI;
            Room room = this.LJLJLLL;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            if (o.LJ(str, String.valueOf(l))) {
                LJIILJJIL(showBagList.LJLJI);
            }
        }
    }

    public static boolean LJIJ(String str, String str2) {
        try {
            android.net.Uri uri1 = UriProtector.parse(str);
            android.net.Uri uri2 = UriProtector.parse(str2);
            o.LJIIIIZZ(uri1, "uri1");
            String LJIJJLI = C78939UyV.LJIJJLI(uri1, "surl");
            o.LJIIIIZZ(uri2, "uri2");
            String LJIJJLI2 = C78939UyV.LJIJJLI(uri2, "surl");
            String LJIJJLI3 = C78939UyV.LJIJJLI(uri1, "room_id");
            String LJIJJLI4 = C78939UyV.LJIJJLI(uri2, "room_id");
            if (LJIJJLI != null && LJIJJLI2 != null && o.LJ(LJIJJLI, LJIJJLI2) && LJIJJLI3 != null && LJIJJLI4 != null) {
                if (o.LJ(LJIJJLI3, LJIJJLI4)) {
                    return true;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final void LJIL(int i, JSONObject jSONObject) {
        IEventCenter LJ = EventCenter.LJ();
        JSONObject LIZLLL = C770830u.LIZLLL("action_type", i);
        if (jSONObject != null) {
            LIZLLL.put("data", jSONObject);
        }
        String jSONObject2 = LIZLLL.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
        LJ.LIZ("ec_audience_message_event", jSONObject2);
    }

    public static void LJJ(int i, JSONObject jSONObject) {
        IEventCenter LJ = EventCenter.LJ();
        JSONObject LIZLLL = C770830u.LIZLLL("action_type", i);
        if (jSONObject != null) {
            LIZLLL.put("data", jSONObject);
        }
        String jSONObject2 = LIZLLL.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
        LJ.LIZ("ec_author_message_event", jSONObject2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC32065CiD
    /* renamed from: LJIIJ */
    public final void LLJJJJ(IIconSlot.SlotViewModel viewModel, A72 slotGate) {
        String str;
        String str2;
        String str3;
        boolean z;
        InterfaceC05190Ih author;
        String l;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSlotCreated, roomid = ");
        Room room = this.LJLJLLL;
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        CK3.LIZIZ(LIZ, str, LIZ, 4);
        super.LLJJJJ(viewModel, slotGate);
        Room room2 = this.LJLJLLL;
        if (room2 != null) {
            str2 = room2.getIdStr();
        } else {
            str2 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room3 = this.LJLJLLL;
        if (room3 != null) {
            str3 = room3.getIdStr();
        } else {
            str3 = null;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("room_id", str3);
        Room room4 = this.LJLJLLL;
        if (room4 != null && (author = room4.author()) != null && (l = Long.valueOf(author.getId()).toString()) != null) {
            str4 = l;
        }
        linkedHashMap.put("author_id", str4);
        linkedHashMap.put("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
        C36033ECf.LIZLLL("live_view_action", str2, linkedHashMap);
        C78929UyL.LJIJI(this);
        ((C40135Fp5) C40133Fp3.LIZ.getValue()).LJLILLLLZI = true;
        this.LLILZIL = new C71216RxE();
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLJJLL);
        if (LJJIFFI != null) {
            viewModel.LJLJI.observe(LJJIFFI, new AObserverS80S0100000_12(this, 117));
        }
        C141335gf c141335gf = this.LLJILJIL;
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(this, viewModel, 94);
        C71182Rwg c71182Rwg = new C71182Rwg(this, slotGate);
        c141335gf.getClass();
        if (C16880lQ.LLLZLL() || FTB.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (C00F.LIZ(31744, 0, "ec_anr_opt_accurate", true) == 0 || !z) {
            c71182Rwg.invoke((List<Drawable>) aqS159S0200000_12.invoke());
        } else {
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C63442eK(aqS159S0200000_12, c71182Rwg, null), 2);
        }
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(this.LJLJJLL);
        if (LJJIFFI2 != null) {
            BJ4.LIZ(LJJIFFI2, new AqS178S0100000_12(this, 666));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (r9 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(com.bytedance.android.livesdkapi.depend.model.live.Room r22, java.util.List<com.ss.android.ugc.aweme.ecommercelive.business.audience.api.SlimShortTouch> r23) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71188Rwm.LJJI(com.bytedance.android.livesdkapi.depend.model.live.Room, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r11 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage r10, boolean r11) {
        /*
            r9 = this;
            r6 = r9
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LJLJLLL
            r8 = 0
            if (r0 == 0) goto L62
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        Le:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LJLJLLL
            if (r0 == 0) goto L24
            long r0 = r0.getOwnerUserId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L26
        L24:
            java.lang.String r4 = ""
        L26:
            if (r11 == 0) goto L4f
            java.lang.String r1 = "shortTouchEcommerceLuckyBag"
            java.lang.String r0 = "shortTouchEcommerceVoucher"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r5 = X.C47261Igj.LJJIJIIJI(r0)
        L34:
            if (r11 == 0) goto L59
        L36:
            r7 = 0
        L37:
            boolean r0 = X.C78685UuP.LJJJZ(r3)
            if (r0 == 0) goto L4e
            boolean r0 = X.C78685UuP.LJJJZ(r4)
            if (r0 == 0) goto L4e
            X.2gm r1 = r6.LLIZ
            X.2x9 r2 = new X.2x9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 3
            X.XKX.LIZLLL(r1, r8, r8, r2, r0)
        L4e:
            return
        L4f:
            if (r10 == 0) goto L58
            com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity r0 = r10.entity
            if (r0 == 0) goto L58
            java.util.List<java.lang.String> r5 = r0.refreshItems
            goto L34
        L58:
            r5 = r8
        L59:
            if (r10 == 0) goto L36
            com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity r0 = r10.entity
            if (r0 == 0) goto L36
            int r7 = r0.interval
            goto L37
        L62:
            r0 = r8
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71188Rwm.LJJIFFI(com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage, boolean):void");
    }

    @Override // X.AbstractC32065CiD, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final /* bridge */ /* synthetic */ void LLJJJJ(ViewModel viewModel, A72 a72) {
        LLJJJJ((IIconSlot.SlotViewModel) viewModel, a72);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d8, code lost:
    
        if (r5 != null) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19, types: [X.MBA, X.2kd, X.XKY] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    @Override // X.InterfaceC31710CcU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<java.lang.String, ? extends java.lang.Object> r22, X.InterfaceC25704A6y r23) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71188Rwm.LLJJLIIIJLLLLLLLZ(java.util.Map, X.A6y):void");
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIJJ(java.lang.String r24, java.lang.String r25, boolean r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 1325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71188Rwm.LJIJJ(java.lang.String, java.lang.String, boolean, java.util.Map):java.lang.String");
    }

    public static /* synthetic */ void LJIJJLI(C71188Rwm c71188Rwm, String str, String str2, java.util.Map map, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        c71188Rwm.LJIJJ(str, str2, false, map);
    }
}
