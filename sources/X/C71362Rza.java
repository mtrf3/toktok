package X;

import Y.IDTListenerS120S0100000_12;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.service.AnchorPdpPreloadModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS12S1110000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Rza, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71362Rza implements S0R {
    public ShopWindowAnchorModel LIZIZ;
    public C71365Rzd LIZJ;
    public ECommerceAnchorPanelViewModel LIZLLL;
    public RunnableC71356RzU LJFF;
    public XKQ LJI;
    public View LJII;
    public long LJIIIIZZ;
    public C188727au LJIIIZ;
    public HashMap<String, String> LJIIJ;
    public WeakReference<InterfaceC44105HSr> LJIIL;
    public List<ShopWindowAnchorModel> LIZ = new ArrayList();
    public int LJ = 1;
    public final java.util.Map<String, String> LJIIJJI = new LinkedHashMap();

    @Override // X.S0R
    public final ShopWindowExtraModel LJIIIIZZ() {
        for (ShopWindowAnchorModel shopWindowAnchorModel : this.LIZ) {
            Integer num = shopWindowAnchorModel.LIZ.productStatus;
            int value = EnumC71103RvP.PRODUCT_STATUS_DOWN.getValue();
            if (num != null && num.intValue() == value) {
                return shopWindowAnchorModel.LIZ;
            }
        }
        return null;
    }

    @Override // X.S0R
    public final L7W LJIILIIL() {
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        List<ShopWindowAnchorModel> list = this.LIZ;
        c71361RzZ.getClass();
        return C71361RzZ.LJJIL(list);
    }

    @Override // X.S0R
    public final String LJIJI() {
        if (!this.LIZ.isEmpty()) {
            Integer num = ((ShopWindowAnchorModel) ListProtector.get(this.LIZ, 0)).type;
            int type = EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE();
            if (num == null || num.intValue() != type) {
                Integer num2 = ((ShopWindowAnchorModel) ListProtector.get(this.LIZ, 0)).type;
                int type2 = EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE();
                if (num2 == null || num2.intValue() != type2) {
                    return "";
                }
                return ((ShopWindowAnchorModel) ListProtector.get(this.LIZ, 0)).keyword;
            }
            String str = ((ShopWindowAnchorModel) ListProtector.get(this.LIZ, 0)).LIZ.elasticTitle;
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    return "";
                }
            } else {
                str = ((ShopWindowAnchorModel) ListProtector.get(this.LIZ, 0)).LIZ.title;
                if (str == null) {
                    return "";
                }
            }
            return str;
        }
        return null;
    }

    @Override // X.S0R
    public final int LJIJJ() {
        return this.LIZ.size();
    }

    public final List LJJIFFI() {
        ArrayList arrayList = new ArrayList();
        List<ShopWindowAnchorModel> list = this.LIZ;
        ArrayList arrayList2 = new ArrayList();
        for (ShopWindowAnchorModel shopWindowAnchorModel : list) {
            Integer num = shopWindowAnchorModel.LIZ.loadMethodType;
            if (num != null && num.intValue() == 2) {
                arrayList2.add(shopWindowAnchorModel);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((ShopWindowAnchorModel) it.next()).LIZ.productId));
        }
        return arrayList;
    }

    public final List LJJII() {
        String str;
        ArrayList arrayList = new ArrayList();
        List<ShopWindowAnchorModel> list = this.LIZ;
        ArrayList arrayList2 = new ArrayList();
        for (ShopWindowAnchorModel shopWindowAnchorModel : list) {
            Integer num = shopWindowAnchorModel.LIZ.loadMethodType;
            if (num != null && num.intValue() == 2) {
                arrayList2.add(shopWindowAnchorModel);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) it.next();
            if (C78857UxB.LJJJIL(shopWindowAnchorModel2.LIZ.elasticUrl)) {
                str = shopWindowAnchorModel2.LIZ.elasticUrl;
            } else if (C78857UxB.LJJJIL(shopWindowAnchorModel2.LIZ.coverUrl)) {
                str = shopWindowAnchorModel2.LIZ.coverUrl;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // X.S0R
    public final List<ShopWindowAnchorModel> LJIIL() {
        return this.LIZ;
    }

    @Override // X.S0R
    public final void LIZJ(int i) {
        InterfaceC71392S0e interfaceC71392S0e;
        C71365Rzd c71365Rzd = this.LIZJ;
        if (c71365Rzd != null && (interfaceC71392S0e = c71365Rzd.LJLJLLL) != null) {
            interfaceC71392S0e.LJIIIIZZ(i);
        }
        C71370Rzi.LIZ(Integer.valueOf(i));
    }

    @Override // X.S0R
    public final String LJFF(boolean z) {
        ShopWindowExtraModel shopWindowExtraModel;
        String str;
        ShopWindowExtraModel shopWindowExtraModel2;
        String str2;
        if (z) {
            ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
            if (shopWindowAnchorModel == null || (shopWindowExtraModel2 = shopWindowAnchorModel.LIZ) == null || (str2 = shopWindowExtraModel2.elasticTitle) == null) {
                ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
                if (shopWindowAnchorModel2 == null || (shopWindowExtraModel = shopWindowAnchorModel2.LIZ) == null || (str = shopWindowExtraModel.title) == null) {
                    return "";
                }
                return str;
            }
            return str2;
        }
        List<ShopWindowAnchorModel> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<ShopWindowAnchorModel> it = list.iterator();
        while (it.hasNext()) {
            ShopWindowExtraModel shopWindowExtraModel3 = it.next().LIZ;
            String str3 = shopWindowExtraModel3.elasticTitle;
            if (str3 != null || (str3 = shopWindowExtraModel3.title) != null) {
                arrayList.add(str3);
            }
        }
        return ORZ.LLD(arrayList, ",", null, null, null, 62);
    }

    @Override // X.S0R
    public final String LJI(boolean z) {
        Long l;
        ShopWindowExtraModel shopWindowExtraModel;
        if (z) {
            ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
            if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null) {
                l = shopWindowExtraModel.productId;
            } else {
                l = null;
            }
            return String.valueOf(l);
        }
        List<ShopWindowAnchorModel> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<ShopWindowAnchorModel> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ.productId);
        }
        return ORZ.LLD(arrayList, ",", null, null, null, 62);
    }

    @Override // X.S0R
    public final void LJIILL(AqS162S0100000_12 aqS162S0100000_12) {
        XKQ xkq;
        try {
            C39468FeK.LJII(this.LJII, false);
            aqS162S0100000_12.invoke();
            if (this.LJFF != null && (xkq = this.LJI) != null) {
                this.LJFF = null;
                xkq.LIZIZ(null);
            }
            C71365Rzd c71365Rzd = this.LIZJ;
            if (c71365Rzd != null) {
                EventCenter.LJ().LIZIZ("ec_cart_refresh", c71365Rzd);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    @Override // X.S0R
    public final String LJIJ(boolean z) {
        if (z) {
            return "product";
        }
        List<ShopWindowAnchorModel> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<ShopWindowAnchorModel> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            arrayList.add("product");
        }
        return ORZ.LLD(arrayList, ",", null, null, null, 62);
    }

    @QD3
    public final void onEvent(C59592Na8 event) {
        InterfaceC44105HSr interfaceC44105HSr;
        String str;
        o.LJIIIZ(event, "event");
        WeakReference<InterfaceC44105HSr> weakReference = this.LJIIL;
        if (weakReference != null && (interfaceC44105HSr = weakReference.get()) != null) {
            Long l = event.LJLIL;
            boolean z = true;
            String LJIJ = LJIJ(true);
            ShopWindowAnchorModel shopWindowAnchorModel = this.LIZIZ;
            if (shopWindowAnchorModel != null) {
                String LJJLJLI = interfaceC44105HSr.LJJLJLI();
                Aweme aweme = interfaceC44105HSr.LJJLL();
                C188727au c188727au = this.LJIIIZ;
                o.LJIIIZ(aweme, "aweme");
                if (c188727au == null) {
                    c188727au = new C188727au();
                }
                String str2 = shopWindowAnchorModel.logExtra;
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        Iterator<String> keys = jSONObject.keys();
                        o.LJIIIIZZ(keys, "logExtraObj.keys()");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object obj = jSONObject.get(next);
                            if ((obj instanceof String) && (str = (String) obj) != null) {
                                c188727au.LJI(next, str);
                            }
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable unused) {
                    }
                }
                c188727au.LJIIIZ("enter_from", LJJLJLI);
                c188727au.LJIIIZ("anchor_entry", shopWindowAnchorModel.keyword);
                String authorUid = aweme.getAuthorUid();
                String str3 = "";
                if (authorUid == null) {
                    authorUid = "";
                }
                c188727au.LJIIIZ("author_id", authorUid);
                String aid = aweme.getAid();
                if (aid != null) {
                    str3 = aid;
                }
                c188727au.LJIIIZ("group_id", str3);
                c188727au.LJIIIZ("duration", String.valueOf(l));
                c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(aweme));
                FMX.LJIIL("multi_anchor_stay_time", c188727au.LIZ);
                C71363Rzb.LJIILIIL(LJJLJLI, C71360RzY.LJJIJ(aweme, interfaceC44105HSr, null, null, 28), l, LJIJ, this.LIZIZ);
            }
        }
        EventBus.LIZJ().LJIJ(this);
    }

    public static void LJJI(C188727au c188727au, ShopWindowAnchorModel shopWindowAnchorModel) {
        String str;
        String str2 = shopWindowAnchorModel.logExtra;
        if (str2.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "logExtraObj.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if ((obj instanceof String) && (str = (String) obj) != null) {
                        c188727au.LJI(next, str);
                    }
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.S0R
    public final void LIZIZ(SmartImageView imageView, Aweme aweme) {
        int LIZ;
        o.LJIIIZ(imageView, "imageView");
        C71361RzZ.LIZ.getClass();
        if (aweme != null && aweme.isAd()) {
            LIZ = C71358RzW.LIZIZ();
        } else {
            LIZ = C71358RzW.LIZ();
        }
        if (LIZ != 0) {
            if (LIZ != 1) {
                if (LIZ != 2) {
                    return;
                }
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_anchor_product_alt_1;
                Context context = imageView.getContext();
                o.LJIIIIZZ(context, "it.context");
                imageView.setImageDrawable(c2068389v.LIZ(context));
                return;
            }
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_anchor_product_alt_2;
            Context context2 = imageView.getContext();
            o.LJIIIIZZ(context2, "it.context");
            imageView.setImageDrawable(c2068389v2.LIZ(context2));
            return;
        }
        C2068389v c2068389v3 = new C2068389v();
        c2068389v3.LIZ = R.raw.icon_anchor_product;
        Context context3 = imageView.getContext();
        o.LJIIIIZZ(context3, "it.context");
        imageView.setImageDrawable(c2068389v3.LIZ(context3));
    }

    @Override // X.S0R
    public final void LJ(String eventName, String str) {
        Object obj;
        long j;
        Object obj2;
        int i;
        String valueOf;
        Boolean bool;
        List<Aweme> LLJILJILJ;
        List<AnchorCommonStruct> anchors;
        o.LJIIIZ(eventName, "eventName");
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        if (LJII != null) {
            obj = LJII.get("product_id");
        } else {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            j = CastLongProtector.parseLong(str2);
        } else {
            j = 0;
        }
        if (LJII != null) {
            obj2 = LJII.get("quit_type");
        } else {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (i != EnumC61929OSf.RETURN.getValue() || (valueOf = String.valueOf(j)) == null || valueOf.length() == 0 || (bool = (Boolean) ((LinkedHashMap) C71370Rzi.LJI).get(valueOf)) == null || !bool.booleanValue()) {
            return;
        }
        Collection<Aweme> values = C71370Rzi.LJIIIIZZ.snapshot().values();
        if (values != null && (LLJILJILJ = ORZ.LLJILJILJ(values)) != null) {
            for (Aweme aweme : LLJILJILJ) {
                if (aweme != null && (anchors = aweme.getAnchors()) != null && anchors.size() == 1) {
                    ECommerceAnchorService.LJJJJI().LJJIJIIJIL(aweme, null, "video_single_anchor");
                } else {
                    ECommerceAnchorService.LJJJJI().LJJIJIIJIL(aweme, null, "video_main_anchor");
                }
            }
        }
        ((LinkedHashMap) C71370Rzi.LJI).clear();
    }

    @Override // X.S0R
    public final void LJIIIZ(int i, InterfaceC44105HSr interfaceC44105HSr) {
        String str;
        String str2;
        Long l;
        int i2;
        int i3;
        String str3;
        String str4;
        String str5;
        int i4;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        String str6;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        ShopWindowExtraModel shopWindowExtraModel3;
        Long l2;
        if (this.LJIIJ == null) {
            this.LJIIJ = new HashMap<>();
        }
        Aweme LJJLL = interfaceC44105HSr.LJJLL();
        ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLLLL(i, this.LIZ);
        String str7 = "";
        if (shopWindowAnchorModel == null || (shopWindowExtraModel3 = shopWindowAnchorModel.LIZ) == null || (l2 = shopWindowExtraModel3.productId) == null || (str = l2.toString()) == null) {
            str = "";
        }
        String aid = LJJLL.getAid();
        if (aid == null) {
            aid = "";
        }
        String trackId = C70570Rmo.LIZ("", aid, str);
        HashMap<String, String> hashMap = this.LJIIJ;
        if (hashMap != null) {
            hashMap.put(str, trackId);
        }
        List<ShopWindowAnchorModel> data = this.LIZ;
        C71399S0l appendExtraParam = C71399S0l.LJLIL;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(trackId, "trackId");
        o.LJIIIZ(appendExtraParam, "appendExtraParam");
        ICommerceService LIZ = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        try {
            c71367Rzf.LJIJJ = "TEMAI";
            c71367Rzf.LIZJ = LJJLL.getAid();
            c71367Rzf.LIZLLL = LJJLL.getAuthorUid();
            c71367Rzf.LJ = LJJLL.getRequestId();
            String LJJLJLI = interfaceC44105HSr.LJJLJLI();
            if (LJJLJLI == null) {
                LJJLJLI = "";
            }
            c71367Rzf.LIZIZ = LJJLJLI;
            c71367Rzf.LJIIL = "video_cart_tag";
            c71367Rzf.LJIILL = String.valueOf(C71366Rze.LJI(data));
            ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLLLL(i, data);
            Integer num = null;
            if (shopWindowAnchorModel2 != null && (shopWindowExtraModel2 = shopWindowAnchorModel2.LIZ) != null) {
                str2 = shopWindowExtraModel2.source;
            } else {
                str2 = null;
            }
            c71367Rzf.LJIILIIL = str2;
            ShopWindowAnchorModel shopWindowAnchorModel3 = (ShopWindowAnchorModel) ORZ.LJLLLLLL(i, data);
            if (shopWindowAnchorModel3 != null && (shopWindowExtraModel = shopWindowAnchorModel3.LIZ) != null) {
                l = shopWindowExtraModel.productId;
            } else {
                l = null;
            }
            c71367Rzf.LJIIZILJ = String.valueOf(l);
            c71367Rzf.LJJIIJZLJL = C71366Rze.LJFF((ShopWindowAnchorModel) ORZ.LJLLLLLL(i, data));
            if (o.LJ(LJJLL.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID())) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c71367Rzf.LJIJ = i2;
            c71367Rzf.LJIJI = "yes";
            if (LJJLL.isAd()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c71367Rzf.LJIL = i3;
            if (LJJLL.isAd() && (awemeRawAd2 = LJJLL.getAwemeRawAd()) != null && (adId = awemeRawAd2.getAdId()) != null) {
                str3 = String.valueOf(adId);
            } else {
                str3 = null;
            }
            c71367Rzf.LJJ = str3;
            if (LJJLL.isAd() && (awemeRawAd = LJJLL.getAwemeRawAd()) != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                str4 = String.valueOf(creativeId);
            } else {
                str4 = null;
            }
            c71367Rzf.LJJI = str4;
            c71367Rzf.LJJIII = S0V.LIZ(LJJLL);
            c71367Rzf.LJJIFFI = "video_photo_detail_single_anchor";
            c71367Rzf.LJJII = "graphic_detail";
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            Aweme LJJLL2 = interfaceC44105HSr.LJJLL();
            c71361RzZ.getClass();
            if (!C71361RzZ.LJIIL(LJJLL2) || !interfaceC44105HSr.LJJLJ()) {
                str5 = "";
            } else {
                str5 = "Shop";
            }
            c71367Rzf.LJJIIJ = str5;
            ShopWindowAnchorModel shopWindowAnchorModel4 = (ShopWindowAnchorModel) ORZ.LJLLLL(data);
            if (shopWindowAnchorModel4 != null && shopWindowAnchorModel4.extra != null) {
                ShopWindowAnchorModel shopWindowAnchorModel5 = (ShopWindowAnchorModel) ORZ.LJLLLL(data);
                if (shopWindowAnchorModel5 != null && (str6 = shopWindowAnchorModel5.extra) != null) {
                    str7 = str6;
                }
                c71367Rzf.LJJJ = C71360RzY.LJIILLIIL(str7);
            }
            c71367Rzf.LJLZ = "maker-window";
            c71367Rzf.LJJJJ = trackId;
            c71367Rzf.LJJJJI = "video";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C71360RzY.LJIILIIL("tiktok_video_anchor_click", LJJLL, c71367Rzf.LIZIZ));
            java.util.Map mobParams = LJJLL.getMobParams();
            if (mobParams == null) {
                mobParams = C113554cx.LJJJLIIL();
            }
            linkedHashMap.putAll(mobParams);
            c71367Rzf.LIZ = linkedHashMap;
            c71367Rzf.LJJJJI = "video";
            if (LJJLL.isPhotoMode()) {
                c71367Rzf.LJLLILLLL = 150;
                if (LJJLL.getPhotoModeImageInfo() != null && (photoModeImageInfo = LJJLL.getPhotoModeImageInfo()) != null && photoModeImageInfo.getImageList() != null) {
                    PhotoModeImageInfo photoModeImageInfo2 = LJJLL.getPhotoModeImageInfo();
                    if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                        num = Integer.valueOf(imageList.size());
                    }
                    c71367Rzf.LJLLJ = num;
                }
                c71367Rzf.LJLLL = Integer.valueOf(i + 1);
            }
            if (C71361RzZ.LJJIL(data) != L7W.REGION_UNAVAILABLE) {
                c71367Rzf.LJJJI = S0G.PRODUCT_AVAILABLE.getValue();
            } else {
                c71367Rzf.LJJJI = S0G.PRODUCT_NOT_AVAILABLE.getValue();
            }
            if (C71361RzZ.LJJJIL(LJJLL)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            c71367Rzf.LJJJZ = i4;
            c71367Rzf.LJJIJL = Integer.valueOf(data.size());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        appendExtraParam.invoke(c71367Rzf);
        LIZ.logCommerceEvents("tiktok_video_anchor_view", c71367Rzf);
    }

    @Override // X.S0R
    public final void LJIIJJI(AnchorCommonStruct anchor, Aweme aweme) {
        o.LJIIIZ(anchor, "anchor");
        if (this.LIZ.isEmpty()) {
            C71361RzZ.LIZ.getClass();
            List<ShopWindowAnchorModel> LJJJJLL = C71361RzZ.LJJJJLL(anchor, true);
            this.LIZ = LJJJJLL;
            this.LIZIZ = (ShopWindowAnchorModel) ORZ.LJLLLL(LJJJJLL);
            if (aweme != null) {
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "it.aid");
                String authorUid = aweme.getAuthorUid();
                o.LJIIIIZZ(authorUid, "it.authorUid");
                List<ShopWindowAnchorModel> list = this.LIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<ShopWindowAnchorModel> it = list.iterator();
                while (it.hasNext()) {
                    Long l = it.next().LIZ.productId;
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                C71370Rzi.LJIIIZ(aid, authorUid, arrayList);
                String aid2 = aweme.getAid();
                if (aid2 == null || aid2.length() == 0) {
                    return;
                }
                C71370Rzi.LJIIIIZZ.put(aid2, aweme);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.S0R
    public final void LJIILJJIL(Dialog dialog, long j) {
        String str;
        InterfaceC71392S0e interfaceC71392S0e;
        AnchorPanelAdapter anchorPanelAdapter;
        AnchorPanelAdapter anchorPanelAdapter2;
        o.LJIIIZ(dialog, "dialog");
        long j2 = -1;
        if (j != -1) {
            j2 = j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
        boolean LJI = AnchorStateServiceImpl.LJIIIZ().LJI();
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else {
            Window window = dialog.getWindow();
            if ((window == null || !window.isActive()) && !LJI) {
                str = "return";
            } else {
                str = "next";
            }
        }
        C71365Rzd c71365Rzd = this.LIZJ;
        if (c71365Rzd != null) {
            C71370Rzi.LIZ = false;
            C71365Rzd.LJZ = false;
            AbstractC029409q abstractC029409q = null;
            if (o.LJ(str, "return")) {
                AbstractC029409q adapter = c71365Rzd.LIZ().getAdapter();
                if ((adapter instanceof AnchorPanelAdapter) && (anchorPanelAdapter2 = (AnchorPanelAdapter) adapter) != null) {
                    anchorPanelAdapter2.LJLLLLLL();
                }
                IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
                Aweme aweme = c71365Rzd.LJLIL.getAweme();
                String entranceForm = c71365Rzd.LJLIL.getEntranceForm();
                if (entranceForm == null) {
                    entranceForm = "video_multi_anchor";
                }
                LJJJJI.LJJIJIIJIL(aweme, 0, entranceForm);
            }
            AbstractC029409q adapter2 = c71365Rzd.LIZ().getAdapter();
            if ((adapter2 instanceof AnchorPanelAdapter) && (anchorPanelAdapter = (AnchorPanelAdapter) adapter2) != null) {
                anchorPanelAdapter.LLIIIZ = false;
            }
            String LJIIIZ = C71360RzY.LJIIIZ(c71365Rzd.LJLIL, c71365Rzd.LJLJJI);
            if (LJIIIZ == null) {
                LJIIIZ = "video_multi_anchor";
            }
            String str2 = str;
            C76542zS.LIZJ("rd_tiktokec_video_shopping_list_close", new C27535ArL(elapsedRealtime, str2, LJIIIZ, c71365Rzd.LJLIL.getGroupId()));
            ProductListModel productListModel = c71365Rzd.LJLIL;
            RecyclerView LIZ = c71365Rzd.LIZ();
            if (LIZ != null) {
                abstractC029409q = LIZ.getAdapter();
            }
            o.LJII(abstractC029409q, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter");
            C71363Rzb.LJIJI(productListModel, LJIIIZ, ((ArrayList) ((AnchorPanelAdapter) abstractC029409q).LLIIIJ).size(), c71365Rzd.LJLJI, c71365Rzd.LJLJJLL, System.currentTimeMillis() - c71365Rzd.LJLLLLLL, str2, c71365Rzd.LJLJLJ, 0);
            EventCenter.LJ().LIZIZ("ec_cart_refresh", c71365Rzd);
            if ((dialog instanceof InterfaceC71392S0e) && (interfaceC71392S0e = (InterfaceC71392S0e) dialog) != null) {
                interfaceC71392S0e.LJIILLIIL();
            }
        }
        this.LJIIIIZZ = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71362Rza.LJJIIZ(com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.S0R
    public final void LJII(boolean z, Dialog dialog, boolean z2) {
        InterfaceC71392S0e interfaceC71392S0e;
        Object LIZ;
        String path;
        InterfaceC71392S0e interfaceC71392S0e2;
        AnchorPanelAdapter anchorPanelAdapter;
        AnchorPanelAdapter anchorPanelAdapter2;
        C71365Rzd c71365Rzd = this.LIZJ;
        String str = null;
        if (c71365Rzd != null) {
            AbstractC029409q adapter = c71365Rzd.LIZ().getAdapter();
            if ((adapter instanceof AnchorPanelAdapter) && (anchorPanelAdapter2 = (AnchorPanelAdapter) adapter) != null) {
                anchorPanelAdapter2.LLIIIZ = true;
            }
        }
        C71365Rzd c71365Rzd2 = this.LIZJ;
        if (c71365Rzd2 != null) {
            long j = this.LJIIIIZZ;
            C78929UyL.LJIJI(c71365Rzd2);
            AbstractC029409q adapter2 = c71365Rzd2.LIZ().getAdapter();
            if ((adapter2 instanceof AnchorPanelAdapter) && (anchorPanelAdapter = (AnchorPanelAdapter) adapter2) != null) {
                anchorPanelAdapter.LLIFFJFJJ = j;
            }
            c71365Rzd2.LJLLLLLL = System.currentTimeMillis();
            String LJIIIZ = C71360RzY.LJIIIZ(c71365Rzd2.LJLIL, c71365Rzd2.LJLJJI);
            if (LJIIIZ == null) {
                LJIIIZ = "video_multi_anchor";
            }
            C71363Rzb.LJIJ(c71365Rzd2.LJLIL, LJIIIZ, c71365Rzd2.LJLJI, z2, j, c71365Rzd2.LJLJJLL, 0);
            C71365Rzd.LJZ = true;
            int i = C71370Rzi.LJIIIZ;
            c71365Rzd2.LJLLL = i;
            C71363Rzb.LJIIIIZZ(i, c71365Rzd2.LJLIL);
            int i2 = c71365Rzd2.LJLLL;
            InterfaceC71392S0e interfaceC71392S0e3 = c71365Rzd2.LJLJLLL;
            if (interfaceC71392S0e3 != null) {
                interfaceC71392S0e3.LJIIIIZZ(i2);
            }
            boolean z3 = dialog instanceof InterfaceC71392S0e;
            if (z3) {
                InterfaceC71392S0e interfaceC71392S0e4 = (InterfaceC71392S0e) dialog;
                c71365Rzd2.LJLJLLL = interfaceC71392S0e4;
                interfaceC71392S0e4.LJIILL(new AqS178S0100000_12(c71365Rzd2, 464));
                RecyclerView LIZ2 = c71365Rzd2.LIZ();
                if (LIZ2 != null) {
                    LIZ2.setOnTouchListener(new IDTListenerS120S0100000_12(c71365Rzd2, 6));
                }
            }
            EventCenter.LJ().LIZIZ("ec_cart_refresh", c71365Rzd2);
            EventCenter.LJ().LIZJ("ec_cart_refresh", c71365Rzd2);
            if (!z) {
                if (!z2 && (interfaceC71392S0e2 = c71365Rzd2.LJLJLLL) != null) {
                    interfaceC71392S0e2.LJIILJJIL(null, c71365Rzd2.LJLLJ, false);
                }
                C70853RrN.LIZJ(c71365Rzd2, c71365Rzd2.LIZ());
                try {
                    ArrayList arrayList = new ArrayList();
                    String str2 = ((ShopWindowAnchorModel) ListProtector.get(c71365Rzd2.LJLJI, 0)).LIZ.coverUrl;
                    if (str2 != null && (path = UriProtector.parse(str2).getPath()) != null) {
                        arrayList.add(s.LJLL(path, C78842Uww.LJJ(0, s.LJJLIIIJL(path, "~", 0, false, 6))));
                    }
                    C78929UyL.LJIJJ(c71365Rzd2, arrayList);
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                    C78983UzD.LJIIZILJ(new RuntimeException(String.valueOf(c71365Rzd2.LJLJI)));
                    return;
                }
                return;
            }
            if (!(c71365Rzd2.LIZ().getAdapter() instanceof AnchorPanelAdapter) || c71365Rzd2.LIZ().getAdapter() == null) {
                return;
            }
            AbstractC029409q adapter3 = c71365Rzd2.LIZ().getAdapter();
            o.LJII(adapter3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter");
            AnchorPanelAdapter anchorPanelAdapter3 = (AnchorPanelAdapter) adapter3;
            if (((ArrayList) anchorPanelAdapter3.LLIIIJ).size() > 4) {
                ((ArrayList) anchorPanelAdapter3.LLIIIJ).clear();
                if (z3) {
                    InterfaceC71392S0e interfaceC71392S0e5 = (InterfaceC71392S0e) dialog;
                    if (interfaceC71392S0e5 != null) {
                        interfaceC71392S0e5.LJIIJ(-1);
                    }
                    if (z3 && (interfaceC71392S0e = (InterfaceC71392S0e) dialog) != null) {
                        interfaceC71392S0e.LJIIJ(1);
                    }
                }
            } else {
                Iterator it = ((ArrayList) anchorPanelAdapter3.LLIIIJ).iterator();
                while (it.hasNext()) {
                    anchorPanelAdapter3.LL(((Number) it.next()).intValue(), true);
                }
            }
            if (!(!c71365Rzd2.LJLJI.isEmpty())) {
                return;
            }
            Long l = ((ShopWindowAnchorModel) ListProtector.get(c71365Rzd2.LJLJI, 0)).LIZ.productId;
            if (l != null) {
                str = l.toString();
            }
            boolean z4 = anchorPanelAdapter3.LLIIII;
            boolean z5 = anchorPanelAdapter3.LLIIIILZ;
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            ShopWindowExtraModel shopWindowExtraModel = ((ShopWindowAnchorModel) ListProtector.get(c71365Rzd2.LJLJI, 0)).LIZ;
            c71361RzZ.getClass();
            anchorPanelAdapter3.LLD(str, C44847Hit.LIZ(j), Boolean.valueOf(z4), 0, Boolean.valueOf(z5), C71361RzZ.LJJIJ(shopWindowExtraModel));
            C78929UyL.LJIJJLI(c71365Rzd2);
            C78929UyL.LJIL(c71365Rzd2);
            PageNodeMonitorService.LJIIIZ().LJII("video_multi_anchor");
        }
    }

    @Override // X.S0R
    public final void LJIJJLI(boolean z, String str, InterfaceC44105HSr interfaceC44105HSr) {
        String str2;
        String str3;
        String str4;
        List<ShopWindowAnchorModel> data = this.LIZ;
        o.LJIIIZ(data, "data");
        Aweme LJJLL = interfaceC44105HSr.LJJLL();
        OSZ[] oszArr = new OSZ[12];
        oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        oszArr[1] = new OSZ("page_name", "video");
        oszArr[2] = new OSZ("enter_from", str);
        oszArr[3] = new OSZ("author_id", LJJLL.getAuthorUid());
        oszArr[4] = new OSZ("group_id", LJJLL.getAid());
        C71361RzZ.LIZ.getClass();
        oszArr[5] = new OSZ("anchor_type", ORZ.LLD(data, ",", null, null, C71391S0d.LJLIL, 30));
        oszArr[6] = new OSZ("product_cnt", Integer.valueOf(data.size()));
        oszArr[7] = new OSZ("request_id", LJJLL.getRequestId());
        if (interfaceC44105HSr.LJJLJ()) {
            str2 = "video_single_anchor";
        } else {
            str2 = "video_multi_anchor";
        }
        oszArr[8] = new OSZ("entrance_form", str2);
        if (interfaceC44105HSr.LJJLJ()) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        oszArr[9] = new OSZ("is_single_anchor", str3);
        if (z) {
            str4 = "custom-window";
        } else {
            str4 = "maker-window";
        }
        oszArr[10] = new OSZ("rd_extra", str4);
        oszArr[11] = new OSZ("product_ids", C71361RzZ.LJJ(data));
        b.LJJIJIIJIL("rd_tiktokec_video_anchor_data_get", oszArr);
    }

    @Override // X.S0R
    public final void LJIL(C188727au c188727au, boolean z, InterfaceC44105HSr interfaceC44105HSr) {
        String str;
        String str2;
        String LIZ;
        Integer num;
        String str3;
        Long l;
        Integer num2;
        Integer num3;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer num4;
        String str8;
        PhotoModeImageInfo photoModeImageInfo;
        Integer num5;
        List<PhotoModeImageUrlModel> imageList;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Long creativeId;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        ShopWindowExtraModel shopWindowExtraModel3;
        ShopWindowExtraModel shopWindowExtraModel4;
        Long l2;
        Integer num6;
        String str9;
        ShopWindowExtraModel shopWindowExtraModel5;
        ShopWindowExtraModel shopWindowExtraModel6;
        this.LJIIIZ = c188727au;
        int i = 0;
        String str10 = "video_single_anchor";
        String str11 = "yes";
        String str12 = "";
        if (!z) {
            ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
            OSZ[] oszArr = new OSZ[9];
            oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            String LJJLJLI = interfaceC44105HSr.LJJLJLI();
            if (LJJLJLI != null) {
                str12 = LJJLJLI;
            }
            oszArr[1] = new OSZ("enter_from", str12);
            oszArr[2] = new OSZ("anchor_show_type", "video_cart_tag");
            if (shopWindowAnchorModel != null && (shopWindowExtraModel6 = shopWindowAnchorModel.LIZ) != null) {
                num6 = shopWindowExtraModel6.platform;
            } else {
                num6 = null;
            }
            oszArr[3] = new OSZ("product_source", String.valueOf(num6));
            if (shopWindowAnchorModel != null && (shopWindowExtraModel5 = shopWindowAnchorModel.LIZ) != null) {
                str9 = shopWindowExtraModel5.source;
            } else {
                str9 = null;
            }
            oszArr[4] = new OSZ("source", str9);
            if (!interfaceC44105HSr.LJJLJ()) {
                str11 = "no";
            }
            oszArr[5] = new OSZ("is_single_anchor", str11);
            if (!interfaceC44105HSr.LJJLJ()) {
                str10 = "video_multi_anchor";
            }
            oszArr[6] = new OSZ("entrance_form", str10);
            oszArr[7] = new OSZ("page_name", "video");
            oszArr[8] = new OSZ("rd_extra", "maker-window-fail");
            b.LJJIJIIJIL("rd_tiktok_video_anchor_show", oszArr);
            return;
        }
        ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
        java.util.Map<String, String> map = this.LJIIJJI;
        String aid = interfaceC44105HSr.LJJLL().getAid();
        if (aid == null) {
            aid = "";
        }
        ShopWindowAnchorModel shopWindowAnchorModel3 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
        if (shopWindowAnchorModel3 != null && (shopWindowExtraModel4 = shopWindowAnchorModel3.LIZ) != null && (l2 = shopWindowExtraModel4.productId) != null) {
            str = l2.toString();
        } else {
            str = null;
        }
        if (map == null) {
            LIZ = "";
        } else {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            LIZ = C70570Rmo.LIZ("", aid, str2);
            if (str == null) {
                str = "";
            }
            map.put(str, LIZ);
        }
        Aweme LJJLL = interfaceC44105HSr.LJJLL();
        ICommerceService LIZ2 = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        c71367Rzf.LJIJJ = "TEMAI";
        c71367Rzf.LIZJ = LJJLL.getAid();
        c71367Rzf.LIZLLL = LJJLL.getAuthorUid();
        c71367Rzf.LJ = LJJLL.getRequestId();
        String LJJLJLI2 = interfaceC44105HSr.LJJLJLI();
        if (LJJLJLI2 == null) {
            LJJLJLI2 = "";
        }
        c71367Rzf.LIZIZ = LJJLJLI2;
        c71367Rzf.LJIIL = "video_cart_tag";
        if (shopWindowAnchorModel2 != null && (shopWindowExtraModel3 = shopWindowAnchorModel2.LIZ) != null) {
            num = shopWindowExtraModel3.platform;
        } else {
            num = null;
        }
        c71367Rzf.LJIILL = String.valueOf(num);
        if (shopWindowAnchorModel2 != null && (shopWindowExtraModel2 = shopWindowAnchorModel2.LIZ) != null) {
            str3 = shopWindowExtraModel2.source;
        } else {
            str3 = null;
        }
        c71367Rzf.LJIILIIL = str3;
        if (shopWindowAnchorModel2 != null && (shopWindowExtraModel = shopWindowAnchorModel2.LIZ) != null) {
            l = shopWindowExtraModel.productId;
        } else {
            l = null;
        }
        c71367Rzf.LJIIZILJ = String.valueOf(l);
        c71367Rzf.LJJIIJZLJL = C71366Rze.LJFF(shopWindowAnchorModel2);
        if (C025908h.LJFF(false, LJJLL.getAuthorUid())) {
            num2 = 1;
        } else {
            num2 = 0;
        }
        c71367Rzf.LJIJ = num2;
        if (!interfaceC44105HSr.LJJLJ()) {
            str11 = "no";
        }
        c71367Rzf.LJIJI = str11;
        if (LJJLL.isAd()) {
            num3 = 1;
        } else {
            num3 = 0;
        }
        c71367Rzf.LJIL = num3;
        if (LJJLL.isAd() && (awemeRawAd2 = LJJLL.getAwemeRawAd()) != null && (creativeId = awemeRawAd2.getCreativeId()) != null) {
            str4 = String.valueOf(creativeId);
        } else {
            str4 = null;
        }
        c71367Rzf.LJJ = str4;
        if (LJJLL.isAd() && (awemeRawAd = LJJLL.getAwemeRawAd()) != null) {
            str5 = awemeRawAd.getCreativeIdStr();
        } else {
            str5 = null;
        }
        c71367Rzf.LJJI = str5;
        c71367Rzf.LJJIII = S0V.LIZ(LJJLL);
        c71367Rzf.LJJII = "video";
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        Aweme LJJLL2 = interfaceC44105HSr.LJJLL();
        c71361RzZ.getClass();
        if (!C71361RzZ.LJIIL(LJJLL2) || !interfaceC44105HSr.LJJLJ()) {
            str6 = "";
        } else {
            str6 = "Shop";
        }
        c71367Rzf.LJJIIJ = str6;
        if (shopWindowAnchorModel2 == null || (str7 = shopWindowAnchorModel2.extra) == null) {
            str7 = "";
        }
        c71367Rzf.LJJJ = C71360RzY.LJIILLIIL(str7);
        c71367Rzf.LJJJJI = "video";
        if (LJJLL.isPhotoMode()) {
            c71367Rzf.LJLLILLLL = 150;
            if (LJJLL.getPhotoModeImageInfo() != null && (photoModeImageInfo = LJJLL.getPhotoModeImageInfo()) != null && photoModeImageInfo.getImageList() != null) {
                PhotoModeImageInfo photoModeImageInfo2 = LJJLL.getPhotoModeImageInfo();
                if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                    num5 = Integer.valueOf(imageList.size());
                } else {
                    num5 = null;
                }
                c71367Rzf.LJLLJ = num5;
            }
        }
        c71367Rzf.LJJJJI = "video";
        c71367Rzf.LJLZ = "maker-window";
        c71367Rzf.LJZI = c188727au.LJIIJ("is_content_truncate");
        c71367Rzf.LJZL = c188727au.LJIIJ("anchor_content_size");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C71360RzY.LJIILIIL("tiktok_video_anchor_click", LJJLL, c71367Rzf.LIZIZ));
        if (LIZ != null) {
            str12 = LIZ;
        }
        linkedHashMap.put("track_id", str12);
        java.util.Map mobParams = LJJLL.getMobParams();
        if (mobParams == null) {
            mobParams = C113554cx.LJJJLIIL();
        }
        linkedHashMap.putAll(mobParams);
        c71367Rzf.LIZ = linkedHashMap;
        if (!interfaceC44105HSr.LJJLJ()) {
            if (C71361RzZ.LJJJJ(interfaceC44105HSr.LJJLL())) {
                c71367Rzf.LJJL = 0;
                c71367Rzf.LJJIFFI = "video_multi_anchor";
            } else {
                java.util.Map<String, String> map2 = c188727au.LIZ;
                if (map2 == null || (str8 = (String) ((HashMap) map2).get("multi_anchor_display")) == null || (num4 = C38350F3i.LJJIL(str8)) == null) {
                    num4 = 0;
                }
                c71367Rzf.LJJL = num4;
                if (num4 == null || num4.intValue() != 0) {
                    c71367Rzf.LJJIFFI = "video_main_anchor";
                } else {
                    c71367Rzf.LJJIFFI = "video_multi_anchor";
                }
            }
        } else {
            c71367Rzf.LJJIFFI = "video_single_anchor";
        }
        if (C71361RzZ.LJJJIL(LJJLL)) {
            i = 1;
        }
        c71367Rzf.LJJJZ = i;
        c71367Rzf.LJJIJL = 1;
        C71366Rze.LIZ(c71367Rzf, LJJLL);
        LIZ2.logCommerceEvents("tiktok_video_anchor_view", c71367Rzf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r2.intValue() == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(java.util.List<java.lang.String> r28, X.InterfaceC44105HSr r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71362Rza.LJJIIJZLJL(java.util.List, X.HSr, boolean):void");
    }

    @Override // X.S0R
    public final void LIZLLL(boolean z, InterfaceC44105HSr interfaceC44105HSr, C188727au c188727au, InterfaceC88472Yns<? super C188727au, C76800UCe> interfaceC88472Yns) {
        Object obj;
        String str;
        java.util.Map<String, String> map;
        if (z && c188727au != null) {
            interfaceC88472Yns.invoke(c188727au);
        }
        ShopWindowAnchorModel shopWindowAnchorModel = this.LIZIZ;
        if (shopWindowAnchorModel != null) {
            if (z && interfaceC44105HSr.LJJLL().isAd()) {
                C58655N0h LIZLLL = C58704N2e.LIZLLL("anchor_detail", "otherclick", interfaceC44105HSr.LJJLL().getAwemeRawAd());
                LIZLLL.LIZJ("shop_anchor", "refer");
                LIZLLL.LJI();
            }
            C39468FeK.LJII(this.LJII, true);
            if (c188727au != null && (map = c188727au.LIZ) != null) {
                obj = ((HashMap) map).get("click_method");
            } else {
                obj = null;
            }
            if (interfaceC44105HSr.LJJLJ()) {
                str = "video_single_anchor";
            } else if (o.LJ(obj, "click_anchor")) {
                str = "video_main_anchor";
            } else {
                str = "video_multi_anchor";
            }
            LJJIIJ(shopWindowAnchorModel, z, interfaceC44105HSr, str);
        }
    }

    @Override // X.S0R
    public final void LJIILLIIL(ShopWindowAnchorModel model, int i, InterfaceC44105HSr interfaceC44105HSr, AqS178S0100000_12 aqS178S0100000_12) {
        Integer num;
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        String str4;
        int i4;
        PhotoModeImageInfo photoModeImageInfo;
        Integer num2;
        List<PhotoModeImageUrlModel> imageList;
        String str5;
        AwemeRawAd awemeRawAd;
        Long adId;
        AwemeRawAd awemeRawAd2;
        Long creativeId;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        ShopWindowExtraModel shopWindowExtraModel3;
        o.LJIIIZ(model, "model");
        C188727au c188727au = this.LJIIIZ;
        if (c188727au != null) {
            aqS178S0100000_12.invoke(c188727au);
        }
        String str6 = "otherclick";
        if (interfaceC44105HSr.LJJLL().isAd()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("anchor_detail", "otherclick", interfaceC44105HSr.LJJLL().getAwemeRawAd());
            LIZLLL.LIZJ("shop_anchor", "refer");
            LIZLLL.LJI();
        }
        Long l = null;
        LJJIIJ(model, true, interfaceC44105HSr, null);
        Aweme aweme = interfaceC44105HSr.LJJLL();
        List<ShopWindowAnchorModel> data = this.LIZ;
        AqS178S0100000_12 aqS178S0100000_122 = new AqS178S0100000_12(this, 367);
        o.LJIIIZ(data, "data");
        o.LJIIIZ(aweme, "aweme");
        ICommerceService LIZ = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        try {
            c71367Rzf.LJIJJ = "TEMAI";
            c71367Rzf.LIZJ = aweme.getAid();
            c71367Rzf.LIZLLL = aweme.getAuthorUid();
            c71367Rzf.LJ = aweme.getRequestId();
            String LJJLJLI = interfaceC44105HSr.LJJLJLI();
            String str7 = "";
            if (LJJLJLI == null) {
                LJJLJLI = "";
            }
            c71367Rzf.LIZIZ = LJJLJLI;
            c71367Rzf.LJIIL = "video_cart_tag";
            ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLLLL(i, data);
            if (shopWindowAnchorModel != null && (shopWindowExtraModel3 = shopWindowAnchorModel.LIZ) != null) {
                num = shopWindowExtraModel3.platform;
            } else {
                num = null;
            }
            c71367Rzf.LJIILL = String.valueOf(num);
            ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLLLL(i, data);
            if (shopWindowAnchorModel2 != null && (shopWindowExtraModel2 = shopWindowAnchorModel2.LIZ) != null) {
                str = shopWindowExtraModel2.source;
            } else {
                str = null;
            }
            c71367Rzf.LJIILIIL = str;
            ShopWindowAnchorModel shopWindowAnchorModel3 = (ShopWindowAnchorModel) ORZ.LJLLLLLL(i, data);
            if (shopWindowAnchorModel3 != null && (shopWindowExtraModel = shopWindowAnchorModel3.LIZ) != null) {
                l = shopWindowExtraModel.productId;
            }
            c71367Rzf.LJIIZILJ = String.valueOf(l);
            c71367Rzf.LJJIIJZLJL = C71366Rze.LJFF((ShopWindowAnchorModel) ORZ.LJLLLLLL(i, data));
            if (o.LJ(aweme.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID())) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c71367Rzf.LJIJ = i2;
            c71367Rzf.LJIJI = "yes";
            if (aweme.isAd()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c71367Rzf.LJIL = i3;
            if (aweme.isAd() && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (creativeId = awemeRawAd2.getCreativeId()) != null) {
                str2 = String.valueOf(creativeId);
            } else {
                str2 = null;
            }
            c71367Rzf.LJJ = str2;
            if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adId = awemeRawAd.getAdId()) != null) {
                str3 = String.valueOf(adId);
            } else {
                str3 = null;
            }
            c71367Rzf.LJJI = str3;
            c71367Rzf.LJJIII = S0V.LIZ(aweme);
            c71367Rzf.LJJIFFI = "video_photo_detail_single_anchor";
            c71367Rzf.LJJII = "graphic_detail";
            c71367Rzf.LJJJJI = "video";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C71360RzY.LJIILIIL("tiktok_video_anchor_click", aweme, c71367Rzf.LIZIZ));
            java.util.Map mobParams = aweme.getMobParams();
            if (mobParams == null) {
                mobParams = C113554cx.LJJJLIIL();
            }
            linkedHashMap.putAll(mobParams);
            c71367Rzf.LIZ = linkedHashMap;
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            Aweme LJJLL = interfaceC44105HSr.LJJLL();
            c71361RzZ.getClass();
            if (!C71361RzZ.LJIIL(LJJLL) || !interfaceC44105HSr.LJJLJ()) {
                str4 = "";
            } else {
                str4 = "Shop";
            }
            c71367Rzf.LJJIIJ = str4;
            ShopWindowAnchorModel shopWindowAnchorModel4 = (ShopWindowAnchorModel) ORZ.LJLLLL(data);
            if (shopWindowAnchorModel4 != null && (str5 = shopWindowAnchorModel4.extra) != null) {
                str7 = str5;
            }
            c71367Rzf.LJJJ = C71360RzY.LJIILLIIL(str7);
            if (aweme.isPhotoMode()) {
                c71367Rzf.LJLLILLLL = 150;
                if (aweme.getPhotoModeImageInfo() != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && photoModeImageInfo.getImageList() != null) {
                    PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                    if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                        num2 = Integer.valueOf(imageList.size());
                    } else {
                        num2 = null;
                    }
                    c71367Rzf.LJLLJ = num2;
                }
                c71367Rzf.LJLLL = Integer.valueOf(i + 1);
            }
            if (C71361RzZ.LJJJIL(aweme)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            c71367Rzf.LJJJZ = i4;
            c71361RzZ.getClass();
            if (C71361RzZ.LJJIL(data) != L7W.REGION_UNAVAILABLE) {
                c71367Rzf.LJJJI = S0G.PRODUCT_AVAILABLE.getValue();
            } else {
                c71367Rzf.LJJJI = S0G.PRODUCT_NOT_AVAILABLE.getValue();
            }
            aqS178S0100000_122.invoke(c71367Rzf);
            C71366Rze.LIZ(c71367Rzf, aweme);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        LIZ.logCommerceEvents("tiktok_video_anchor_click", c71367Rzf);
        if (aweme.isAd()) {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null && awemeRawAd3.getAnchorClickType() == 2) {
                str6 = "click";
            }
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", str6, aweme.getAwemeRawAd());
            LIZLLL2.LIZJ("shop_anchor", "refer");
            LIZLLL2.LJI();
        }
    }

    @Override // X.S0R
    public final void LJIIZILJ(C188727au eventMapBuilder, boolean z, InterfaceC44105HSr interfaceC44105HSr, String str) {
        String str2;
        String str3;
        String str4;
        Integer num;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        String str5;
        Long l;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        this.LJIIIZ = eventMapBuilder;
        int i = 1;
        if (!z) {
            Activity LIZ = interfaceC44105HSr.LIZ();
            if (this.LIZLLL == null && (LIZ instanceof ActivityC45651qj)) {
                ActivityC45651qj activity = (ActivityC45651qj) LIZ;
                o.LJIIIZ(activity, "activity");
                this.LIZLLL = (ECommerceAnchorPanelViewModel) ViewModelProviders.of(activity).get(ECommerceAnchorPanelViewModel.class);
            }
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            Aweme LJJLL = interfaceC44105HSr.LJJLL();
            c71361RzZ.getClass();
            if (C71361RzZ.LJIILIIL(LJJLL)) {
                this.LJ = 2;
                C71365Rzd c71365Rzd = this.LIZJ;
                if (c71365Rzd != null) {
                    c71365Rzd.LIZIZ();
                }
                List<ShopWindowAnchorModel> list = this.LIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<ShopWindowAnchorModel> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(it.next().LIZ.productId));
                }
                LJJIIJZLJL(arrayList, interfaceC44105HSr, true);
            }
        }
        Iterator<ShopWindowAnchorModel> it2 = this.LIZ.iterator();
        while (true) {
            str2 = "";
            str3 = "video_single_anchor";
            str4 = null;
            if (!it2.hasNext()) {
                break;
            }
            ShopWindowAnchorModel next = it2.next();
            if (o.LJ(next.LIZ.need_preload, Boolean.TRUE) && C78685UuP.LJJJZ(next.LIZ.schema)) {
                Aweme LJJLL2 = interfaceC44105HSr.LJJLL();
                String LJJLJLI = interfaceC44105HSr.LJJLJLI();
                if (!interfaceC44105HSr.LJJLJ()) {
                    str3 = "video_multi_anchor";
                }
                java.util.Map<String, String> map = this.LJIIJJI;
                String aid = interfaceC44105HSr.LJJLL().getAid();
                if (aid == null) {
                    aid = "";
                }
                ShopWindowExtraModel shopWindowExtraModel3 = next.LIZ;
                if (shopWindowExtraModel3 != null && (l = shopWindowExtraModel3.productId) != null) {
                    str4 = l.toString();
                }
                if (map != null) {
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    String LIZ2 = C70570Rmo.LIZ("", aid, str5);
                    if (str4 != null) {
                        str2 = str4;
                    }
                    map.put(str2, LIZ2);
                    str2 = LIZ2;
                }
                String LJJIFFI = C71360RzY.LJJIFFI(next, LJJLL2, LJJLJLI, str3, str2, true);
                if (LJJIFFI != null) {
                    ECommerceService.createIECommerceServicebyMonsterPlugin(false).prefetchPdp(LJJIFFI, interfaceC44105HSr.LIZ(), 2, new AqS116S0300000_12(interfaceC44105HSr, next, this, 22));
                }
            }
        }
        ShopWindowAnchorModel shopWindowAnchorModel = this.LIZIZ;
        Aweme LJJLL3 = interfaceC44105HSr.LJJLL();
        OSZ[] oszArr = new OSZ[12];
        String LJJLJLI2 = interfaceC44105HSr.LJJLJLI();
        if (LJJLJLI2 != null) {
            str2 = LJJLJLI2;
        }
        oszArr[0] = new OSZ("enter_from", str2);
        oszArr[1] = new OSZ("author_id", LJJLL3.getAuthorUid());
        oszArr[2] = new OSZ("group_id", LJJLL3.getAid());
        oszArr[3] = new OSZ("product_type", str);
        oszArr[4] = new OSZ("page_type", "video");
        oszArr[5] = new OSZ("anchor_show_type", "video_cart_tag");
        if (shopWindowAnchorModel != null && (shopWindowExtraModel2 = shopWindowAnchorModel.LIZ) != null) {
            num = shopWindowExtraModel2.platform;
        } else {
            num = null;
        }
        oszArr[6] = new OSZ("product_source", String.valueOf(num));
        if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null) {
            str4 = shopWindowExtraModel.source;
        }
        oszArr[7] = new OSZ("source", str4);
        oszArr[8] = new OSZ("follow_status", S0V.LIZ(LJJLL3));
        if (!interfaceC44105HSr.LJJLJ()) {
            str3 = "video_multi_anchor";
        }
        oszArr[9] = new OSZ("entrance_form", str3);
        oszArr[10] = new OSZ("page_name", "video");
        if (!LJJLL3.isAd()) {
            i = 0;
        }
        oszArr[11] = new OSZ("is_ad", Integer.valueOf(i));
        b.LJJIJIIJIL("product_anchor_show", oszArr);
        if (interfaceC44105HSr.LJJLL().isAd()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", interfaceC44105HSr.LJJLL().getAwemeRawAd());
            LIZLLL.LIZJ("shop_anchor", "refer");
            LIZLLL.LJI();
        }
    }

    @Override // X.S0R
    public final void LJJ(Aweme aweme, View view, boolean z, AqS162S0100000_12 aqS162S0100000_12) {
        boolean z2;
        long j;
        Integer num;
        this.LJII = view;
        C39468FeK.LJII(view, true);
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = 1500L;
        C34K c34k = new C34K();
        try {
            if (z) {
                try {
                    AnchorPdpPreloadModel LJJIII = ECommerceAnchorService.LJJJJI().LJJIII();
                    if (LJJIII != null && (num = LJJIII.duration) != null) {
                        j = num.intValue();
                    } else {
                        j = 3000;
                    }
                    c72242sW.element = j;
                    if (LJJIII != null && LJJIII.enable == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c34k.element = z2;
                } catch (CancellationException e) {
                    throw e;
                }
            } else {
                try {
                    aqS162S0100000_12.invoke();
                    try {
                        c72242sW.element = C71357RzV.LIZ().preloadDuration;
                    } catch (Throwable unused) {
                    }
                    z2 = true;
                } catch (CancellationException e2) {
                    throw e2;
                }
            }
        } catch (Throwable unused2) {
            z2 = false;
        }
        if (!z2) {
            this.LJFF = null;
            return;
        }
        this.LJFF = new RunnableC71356RzU(view, this, c34k, z, aweme);
        this.LJI = XKX.LIZLLL(C780334l.LJLIL, null, null, new C72312sd(c72242sW, this, null), 3);
        if (aweme != null) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            String authorUid = aweme.getAuthorUid();
            o.LJIIIIZZ(authorUid, "it.authorUid");
            List<ShopWindowAnchorModel> list = this.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<ShopWindowAnchorModel> it = list.iterator();
            while (it.hasNext()) {
                Long l = it.next().LIZ.productId;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            C71370Rzi.LJIIIZ(aid, authorUid, arrayList);
            String aid2 = aweme.getAid();
            if (aid2 == null || aid2.length() == 0) {
                return;
            }
            C71370Rzi.LJIIIIZZ.put(aid2, aweme);
        }
    }

    public final void LJJIII(String str, String str2, String str3, InterfaceC44105HSr interfaceC44105HSr) {
        Integer num;
        ShopWindowExtraModel shopWindowExtraModel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("enter_from", str3);
        linkedHashMap.put("page_type", "video");
        ShopWindowAnchorModel shopWindowAnchorModel = this.LIZIZ;
        if (shopWindowAnchorModel != null && (shopWindowExtraModel = shopWindowAnchorModel.LIZ) != null) {
            num = shopWindowExtraModel.platform;
        } else {
            num = null;
        }
        linkedHashMap.put("product_source", String.valueOf(num));
        linkedHashMap.put("rd_extra", str2);
        if (LJIILIIL() != L7W.REGION_UNAVAILABLE) {
            linkedHashMap.put("shopping_status", S0G.PRODUCT_AVAILABLE.getValue());
        } else {
            linkedHashMap.put("shopping_status", S0G.PRODUCT_NOT_AVAILABLE.getValue());
        }
        C76542zS.LIZJ("rd_tiktok_video_anchor_click", new AqS12S1110000_12(str, linkedHashMap, interfaceC44105HSr.LJJLJ(), 2));
    }

    public final void LJJIIJ(ShopWindowAnchorModel shopWindowAnchorModel, boolean z, InterfaceC44105HSr interfaceC44105HSr, String str) {
        AnchorCustomData anchorCustomData;
        String ecEntranceFormMall;
        String str2;
        String str3;
        Long l;
        String LJJLJLI;
        String str4;
        String str5;
        String str6;
        java.util.Map LJJJLIIL;
        String str7;
        String str8;
        Integer num;
        String str9;
        Aweme LJJLL;
        String requestId;
        java.util.Map<String, String> trackingData;
        java.util.Map<String, String> trackingData2;
        String str10 = str;
        Aweme LJJLL2 = interfaceC44105HSr.LJJLL();
        if (str10 == null && (str10 = C71360RzY.LJIIJ(LJJLL2, z)) == null) {
            if (interfaceC44105HSr.LJJLJ()) {
                str10 = "video_single_anchor";
            } else {
                str10 = "video_multi_anchor";
            }
        }
        if (!z && (anchorCustomData = LJJLL2.getAnchorCustomData()) != null && (ecEntranceFormMall = anchorCustomData.getEcEntranceFormMall()) != null) {
            str10 = ecEntranceFormMall;
        }
        AnchorCustomData anchorCustomData2 = LJJLL2.getAnchorCustomData();
        String str11 = "";
        if (anchorCustomData2 == null || (trackingData2 = anchorCustomData2.getTrackingData()) == null || (str3 = trackingData2.get("track_id")) == null) {
            java.util.Map<String, String> map = this.LJIIJJI;
            ShopWindowExtraModel shopWindowExtraModel = shopWindowAnchorModel.LIZ;
            if (shopWindowExtraModel == null || (l = shopWindowExtraModel.productId) == null || (str2 = l.toString()) == null) {
                str2 = "";
            }
            str3 = (String) ((LinkedHashMap) map).get(str2);
            if (str3 == null) {
                str3 = "";
            }
        }
        AnchorCustomData anchorCustomData3 = LJJLL2.getAnchorCustomData();
        if (anchorCustomData3 == null || (trackingData = anchorCustomData3.getTrackingData()) == null || (LJJLJLI = trackingData.get("enter_from_info")) == null) {
            LJJLJLI = interfaceC44105HSr.LJJLJLI();
        }
        if (C78857UxB.LJJJIL(shopWindowAnchorModel.LIZ.schema)) {
            Integer num2 = shopWindowAnchorModel.type;
            int type = EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE();
            if (num2 == null || num2.intValue() != type || (num = shopWindowAnchorModel.LIZ.platform) == null || num.intValue() != 100) {
                String LJJIFFI = C71360RzY.LJJIFFI(shopWindowAnchorModel, LJJLL2, LJJLJLI, str10, str3, z);
                Bundle LIZ = C01R.LIZ("video_anchor", true);
                LIZ.putString("title", String.valueOf(shopWindowAnchorModel.LIZ.title));
                LIZ.putString("price", String.valueOf(shopWindowAnchorModel.LIZ.formatPrice));
                LIZ.putString("cover", String.valueOf(shopWindowAnchorModel.LIZ.coverUrl));
                LIZ.putString("id", String.valueOf(shopWindowAnchorModel.LIZ.productId));
                LIZ.putString("entrance_form", str10);
                HashMap<String, String> mobParams = interfaceC44105HSr.LJJLL().getMobParams();
                if (mobParams == null || (str9 = mobParams.get("click_timestamp")) == null) {
                    str9 = "-1";
                }
                LIZ.putString("click_timestamp", str9);
                if (str3.length() > 0) {
                    LIZ.putString("track_id", str3);
                }
                HashMap<String, String> mobParams2 = LJJLL2.getMobParams();
                if ((mobParams2 != null && (requestId = mobParams2.get("request_id")) != null) || ((LJJLL = interfaceC44105HSr.LJJLL()) != null && (requestId = LJJLL.getRequestId()) != null)) {
                    str11 = requestId;
                }
                if (str11.length() > 0) {
                    LIZ.putString("request_id", str11);
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(interfaceC44105HSr.LIZ(), LJJIFFI);
                buildRoute.withParam(LIZ);
                buildRoute.withCallback(new C71385Rzx(this, interfaceC44105HSr, shopWindowAnchorModel, str10));
                buildRoute.open();
                return;
            }
            C71360RzY.LJJIIJZLJL(interfaceC44105HSr.LIZ(), shopWindowAnchorModel, C71360RzY.LJJIJ(LJJLL2, null, str10, null, 24), LJJLJLI, str10, str3, z);
            return;
        }
        String LJJLJLI2 = interfaceC44105HSr.LJJLJLI();
        Aweme LJJLL3 = interfaceC44105HSr.LJJLL();
        Integer num3 = shopWindowAnchorModel.type;
        int type2 = EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE();
        if (num3 == null || num3.intValue() != type2) {
            str4 = null;
        } else {
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            String str12 = shopWindowAnchorModel.LIZ.finalUrl;
            c71361RzZ.getClass();
            if (C71361RzZ.LJJJJIZL(str12, false)) {
                str4 = shopWindowAnchorModel.LIZ.finalUrl;
            } else {
                str4 = shopWindowAnchorModel.LIZ.detailUrl;
            }
            String str13 = shopWindowAnchorModel.LIZ.detailUrl;
            if (str13 == null) {
                str13 = "";
            }
            Activity LIZ2 = interfaceC44105HSr.LIZ();
            String str14 = shopWindowAnchorModel.LIZ.finalUrl;
            Aweme LJJLL4 = interfaceC44105HSr.LJJLL();
            if (LJJLL4 != null) {
                str5 = LJJLL4.getAid();
            } else {
                str5 = null;
            }
            Aweme LJJLL5 = interfaceC44105HSr.LJJLL();
            if (LJJLL5 != null) {
                str6 = LJJLL5.getAuthorUid();
            } else {
                str6 = null;
            }
            if (C71361RzZ.LJJJJLI(str13, str14, str5, str6, LIZ2)) {
                LJJIII("actual", "", LJJLJLI2, interfaceC44105HSr);
            } else {
                C71361RzZ.LJI(shopWindowAnchorModel, false, LJJLJLI2, interfaceC44105HSr.LJJLJ());
            }
            this.LJIIL = new WeakReference<>(interfaceC44105HSr);
            EventBus.LIZJ().LJIILJJIL(this);
            ComponentCallbacks2 LIZ3 = interfaceC44105HSr.LIZ();
            if (LIZ3 instanceof LifecycleOwner) {
                ((LifecycleOwner) LIZ3).getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.anchor.maker.ShopWindowAnchorMaker$onShopWindowAnchorClick$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        EventBus.LIZJ().LJIJ(this);
                    }
                });
            }
            C188727au c188727au = new C188727au();
            LJJI(c188727au, shopWindowAnchorModel);
            C188727au c188727au2 = this.LJIIIZ;
            if (c188727au2 == null || (LJJJLIIL = c188727au2.LIZ) == null) {
                LJJJLIIL = C113554cx.LJJJLIIL();
            }
            c188727au.LJII(new HashMap(LJJJLIIL));
            c188727au.LJIIIZ("enter_from", interfaceC44105HSr.LJJLJLI());
            c188727au.LJIIIZ("anchor_entry", shopWindowAnchorModel.keyword);
            c188727au.LJIIIZ("anchor_name", shopWindowAnchorModel.keyword);
            String authorUid = interfaceC44105HSr.LJJLL().getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            c188727au.LJIIIZ("author_id", authorUid);
            String aid = interfaceC44105HSr.LJJLL().getAid();
            if (aid == null) {
                aid = "";
            }
            c188727au.LJIIIZ("group_id", aid);
            c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(interfaceC44105HSr.LJJLL()));
            c188727au.LJIIIZ("click_type", "webview");
            FMX.LJIIL("enter_multi_anchor_detail", c188727au.LIZ);
            C188727au c188727au3 = this.LJIIIZ;
            if (c188727au3 == null) {
                c188727au3 = new C188727au();
                LJJI(c188727au3, shopWindowAnchorModel);
            }
            c188727au3.LJIIIZ("enter_from", interfaceC44105HSr.LJJLJLI());
            c188727au3.LJIIIZ("anchor_entry", shopWindowAnchorModel.keyword);
            String authorUid2 = interfaceC44105HSr.LJJLL().getAuthorUid();
            if (authorUid2 == null) {
                authorUid2 = "";
            }
            c188727au3.LJIIIZ("author_id", authorUid2);
            String aid2 = interfaceC44105HSr.LJJLL().getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            c188727au3.LJIIIZ("group_id", aid2);
            c188727au3.LJIIIZ("music_id", C227768wm.LJIIJJI(interfaceC44105HSr.LJJLL()));
            C211648Si.LIZ(c188727au3, interfaceC44105HSr.LJJLL(), interfaceC44105HSr.LJJLJLI(), false);
            FMX.LJIIL("multi_anchor_entrance_click", c188727au3.LIZ);
        }
        Integer num4 = shopWindowAnchorModel.type;
        int type3 = EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE();
        if (num4 != null && num4.intValue() == type3) {
            str4 = shopWindowAnchorModel.schema;
            C71361RzZ c71361RzZ2 = C71361RzZ.LIZ;
            Activity LIZ4 = interfaceC44105HSr.LIZ();
            String str15 = shopWindowAnchorModel.schema;
            String str16 = shopWindowAnchorModel.LIZ.finalUrl;
            Aweme LJJLL6 = interfaceC44105HSr.LJJLL();
            if (LJJLL6 != null) {
                str7 = LJJLL6.getAid();
            } else {
                str7 = null;
            }
            Aweme LJJLL7 = interfaceC44105HSr.LJJLL();
            if (LJJLL7 != null) {
                str8 = LJJLL7.getAuthorUid();
            } else {
                str8 = null;
            }
            c71361RzZ2.getClass();
            if (C71361RzZ.LJJJJLI(str15, str16, str7, str8, LIZ4)) {
                LJJIII("actual", "", LJJLJLI2, interfaceC44105HSr);
            }
            this.LJIIL = new WeakReference<>(interfaceC44105HSr);
            EventBus.LIZJ().LJIILJJIL(this);
            ComponentCallbacks2 LIZ5 = interfaceC44105HSr.LIZ();
            if (LIZ5 instanceof LifecycleOwner) {
                ((LifecycleOwner) LIZ5).getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.anchor.maker.ShopWindowAnchorMaker$onShopLinkAnchorClick$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroy() {
                        EventBus.LIZJ().LJIJ(this);
                    }
                });
            }
            C188727au c188727au4 = new C188727au();
            if (C174826ta.LIZ()) {
                C76V.LIZ().LIZ(C227768wm.LIZIZ(interfaceC44105HSr.LJJLL()));
                c188727au4.LIZLLL(0, "spammy_tag_cnt");
            }
            C71363Rzb.LJIIJ(interfaceC44105HSr.LJJLJ(), interfaceC44105HSr.LJJLJLI(), interfaceC44105HSr.LJJLL(), null, shopWindowAnchorModel, this.LIZ, "video_anchor", 8);
            C71363Rzb.LJIILJJIL(interfaceC44105HSr.LJJLJ(), interfaceC44105HSr.LJJLJLI(), interfaceC44105HSr.LJJLL(), C47261Igj.LJJIJIL(shopWindowAnchorModel), "video_anchor");
        }
        ECommerceAnchorService.LJJJJI().LJIJ(interfaceC44105HSr.LIZ(), str4);
        C71363Rzb.LJIIL(C71360RzY.LJJIJ(LJJLL3, interfaceC44105HSr, null, null, 28), (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ));
    }

    @Override // X.S0R
    public final void LIZ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, boolean z, InterfaceC44105HSr interfaceC44105HSr) {
        String str;
        RecyclerView recyclerView;
        RecyclerView LIZ;
        List<Observer<List<C71379Rzr>>> list;
        MutableLiveData<List<C71379Rzr>> mutableLiveData;
        RecyclerView LIZ2;
        List<Observer<List<C71379Rzr>>> list2;
        List<Observer<List<C71379Rzr>>> list3;
        MutableLiveData<List<C71379Rzr>> mutableLiveData2;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel;
        MutableLiveData<List<C71379Rzr>> mutableLiveData3;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2;
        MutableLiveData<List<C71379Rzr>> mutableLiveData4;
        o.LJIIIZ(dialog, "dialog");
        try {
            if (this.LIZJ != null && (eCommerceAnchorPanelViewModel = this.LIZLLL) != null && (mutableLiveData3 = eCommerceAnchorPanelViewModel.LJLLJ) != null && mutableLiveData3.hasObservers() && (eCommerceAnchorPanelViewModel2 = this.LIZLLL) != null && (mutableLiveData4 = eCommerceAnchorPanelViewModel2.LJLLJ) != null) {
                C71365Rzd c71365Rzd = this.LIZJ;
                if (c71365Rzd != null) {
                    mutableLiveData4.removeObserver(c71365Rzd);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel3 = this.LIZLLL;
            if (eCommerceAnchorPanelViewModel3 != null && (list3 = eCommerceAnchorPanelViewModel3.LJLLILLLL) != null) {
                Iterator it = ((ArrayList) list3).iterator();
                while (it.hasNext()) {
                    Observer<? super List<C71379Rzr>> observer = (Observer) it.next();
                    ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel4 = this.LIZLLL;
                    if (eCommerceAnchorPanelViewModel4 != null && (mutableLiveData2 = eCommerceAnchorPanelViewModel4.LJLLJ) != null) {
                        mutableLiveData2.removeObserver(observer);
                    }
                }
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel5 = this.LIZLLL;
            if (eCommerceAnchorPanelViewModel5 != null && (list2 = eCommerceAnchorPanelViewModel5.LJLLILLLL) != null) {
                ((ArrayList) list2).clear();
            }
            C71365Rzd c71365Rzd2 = this.LIZJ;
            if (c71365Rzd2 != null) {
                EventCenter.LJ().LIZIZ("ec_cart_refresh", c71365Rzd2);
            }
            int LJII = C71366Rze.LJII(interfaceC44105HSr.LJJLL(), c188727au, this.LIZ);
            java.util.Map<String, String> map = c188727au.LIZ;
            if (map != null) {
            }
            if (interfaceC44105HSr.LJJLJ()) {
                str = "video_single_anchor";
            } else if (LJII == 1) {
                str = "video_main_anchor";
            } else {
                str = "video_multi_anchor";
            }
            AbstractC029409q abstractC029409q = null;
            ProductListModel LJJIJ = C71360RzY.LJJIJ(interfaceC44105HSr.LJJLL(), interfaceC44105HSr, str, null, 24);
            Context context = viewGroup.getContext();
            o.LJIIIIZZ(context, "parent.context");
            this.LIZJ = new C71365Rzd(LJJIJ, context, this.LIZ, c188727au, z, this.LJ, LJIILIIL());
            viewGroup.removeAllViews();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            C71365Rzd c71365Rzd3 = this.LIZJ;
            if (c71365Rzd3 != null && (LIZ2 = c71365Rzd3.LIZ()) != null) {
                LIZ2.setLayoutParams(layoutParams);
            }
            C71365Rzd c71365Rzd4 = this.LIZJ;
            if (c71365Rzd4 != null) {
                recyclerView = c71365Rzd4.LIZ();
            } else {
                recyclerView = null;
            }
            viewGroup.addView(recyclerView, 0);
            C71365Rzd c71365Rzd5 = this.LIZJ;
            if (c71365Rzd5 != null) {
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel6 = this.LIZLLL;
                if (eCommerceAnchorPanelViewModel6 != null && (mutableLiveData = eCommerceAnchorPanelViewModel6.LJLLJ) != null) {
                    mutableLiveData.observeForever(c71365Rzd5);
                }
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel7 = this.LIZLLL;
                if (eCommerceAnchorPanelViewModel7 != null && (list = eCommerceAnchorPanelViewModel7.LJLLILLLL) != null) {
                    ((ArrayList) list).add(c71365Rzd5);
                }
            }
            List<ShopWindowAnchorModel> list4 = this.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<ShopWindowAnchorModel> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().LIZ.productId));
            }
            this.LJ = 2;
            C71365Rzd c71365Rzd6 = this.LIZJ;
            if (c71365Rzd6 != null) {
                c71365Rzd6.LIZIZ();
            }
            LJJIIJZLJL(arrayList, interfaceC44105HSr, false);
            C71365Rzd c71365Rzd7 = this.LIZJ;
            if (c71365Rzd7 != null && (LIZ = c71365Rzd7.LIZ()) != null) {
                abstractC029409q = LIZ.getAdapter();
            }
            AnchorPanelAdapter anchorPanelAdapter = (AnchorPanelAdapter) abstractC029409q;
            if (anchorPanelAdapter != null) {
                anchorPanelAdapter.LLFZ();
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.S0R
    public final void LJIIJ(boolean z, C188727au c188727au, boolean z2, InterfaceC44105HSr interfaceC44105HSr, AqS178S0100000_12 aqS178S0100000_12) {
        String str;
        String str2;
        ShopWindowExtraModel shopWindowExtraModel;
        Long l;
        int i;
        String str3;
        String str4;
        String str5;
        AwemeRawAd LJJJJI;
        ShopWindowExtraModel shopWindowExtraModel2;
        Long l2;
        String str6;
        ShopWindowExtraModel shopWindowExtraModel3;
        Long l3;
        AnchorCustomData anchorCustomData;
        int i2 = 0;
        if (z && (anchorCustomData = interfaceC44105HSr.LJJLL().getAnchorCustomData()) != null && anchorCustomData.getOpenPdp()) {
            LIZLLL(false, interfaceC44105HSr, c188727au, new AqS143S0200000_12(c188727au, aqS178S0100000_12, 74));
            LJJIII("pre", "", interfaceC44105HSr.LJJLJLI(), interfaceC44105HSr);
            return;
        }
        String str7 = "video_multi_anchor";
        if (z2) {
            if (z) {
                LIZLLL(false, interfaceC44105HSr, c188727au, new AqS143S0200000_12(c188727au, aqS178S0100000_12, 75));
            }
            ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
            if (shopWindowAnchorModel != null && (shopWindowExtraModel3 = shopWindowAnchorModel.LIZ) != null && (l3 = shopWindowExtraModel3.productId) != null) {
                str6 = l3.toString();
            } else {
                str6 = null;
            }
            C71370Rzi.LIZIZ(str6);
            ECommerceAnchorService.LJJJJI().LJJIZ(interfaceC44105HSr.LJJLL(), null, "video_single_anchor");
            LJJIII("pre", "", interfaceC44105HSr.LJJLJLI(), interfaceC44105HSr);
        } else {
            this.LJIIIIZZ = System.currentTimeMillis();
            Activity LIZ = interfaceC44105HSr.LIZ();
            if (this.LIZLLL == null && (LIZ instanceof ActivityC45651qj)) {
                ActivityC45651qj activity = (ActivityC45651qj) LIZ;
                o.LJIIIZ(activity, "activity");
                this.LIZLLL = (ECommerceAnchorPanelViewModel) ViewModelProviders.of(activity).get(ECommerceAnchorPanelViewModel.class);
            }
            List LJJII = LJJII();
            if (((ArrayList) LJJII).size() > 0 && LJJII != null) {
                int LJIJJ = ECommerceAnchorService.LJJJJI().LJIJJ();
                for (Object obj : LJJII) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        String str8 = (String) obj;
                        if (str8 == null) {
                            str8 = "";
                        }
                        try {
                            str8 = C1E4.LJJIIJZLJL(LJIJJ, LJIJJ, str8);
                        } catch (Exception unused) {
                        }
                        String LJIIJJI = C70657RoD.LJIIJJI(str8, EnumC70569Rmn.VIDEO_MULTI_ANCHOR);
                        LruCache<String, InterfaceC43919HLn<C76800UCe>> lruCache = C70868Rrc.LIZ;
                        if (lruCache.get(LJIIJJI) == null) {
                            C84657XKj LIZ2 = C77275UUl.LIZ();
                            XKX.LIZLLL(C780334l.LJLIL, null, null, new C27817Avt(LJIIJJI, LIZ2, null), 3);
                            lruCache.put(LJIIJJI, LIZ2);
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            if (o.LJ(((HashMap) c188727au.LIZ).get("click_method"), "click_anchor")) {
                ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
                if (shopWindowAnchorModel2 != null && (shopWindowExtraModel = shopWindowAnchorModel2.LIZ) != null && (l = shopWindowExtraModel.productId) != null) {
                    str2 = l.toString();
                } else {
                    str2 = null;
                }
                C71370Rzi.LIZIZ(str2);
                ECommerceAnchorService.LJJJJI().LJJIZ(interfaceC44105HSr.LJJLL(), null, "video_main_anchor");
            } else {
                if (C71366Rze.LJII(interfaceC44105HSr.LJJLL(), c188727au, this.LIZ) == 0) {
                    str = "video_multi_anchor";
                } else {
                    str = "video_main_anchor";
                }
                ECommerceAnchorService.LJJJJI().LJJIZ(interfaceC44105HSr.LJJLL(), 0, str);
            }
        }
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "eventMapBuilder.builder()");
        Aweme aweme = interfaceC44105HSr.LJJLL();
        String str9 = "pdp";
        if (!z2) {
            i = C71366Rze.LJII(interfaceC44105HSr.LJJLL(), this.LJIIIZ, this.LIZ);
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            Aweme LJJLL = interfaceC44105HSr.LJJLL();
            c71361RzZ.getClass();
            if (C71361RzZ.LJJJJ(LJJLL) || (str3 = (String) ((HashMap) map).get("click_method")) == null) {
                str3 = "click_list";
            }
            if (!o.LJ(str3, "click_anchor")) {
                str9 = "origin_panel";
            }
        } else {
            i = 0;
            str3 = "click_list";
        }
        List<ShopWindowAnchorModel> anchors = this.LIZ;
        Integer valueOf = Integer.valueOf(i);
        java.util.Map<String, String> map2 = this.LJIIJJI;
        ShopWindowAnchorModel shopWindowAnchorModel3 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LIZ);
        if (shopWindowAnchorModel3 == null || (shopWindowExtraModel2 = shopWindowAnchorModel3.LIZ) == null || (l2 = shopWindowExtraModel2.productId) == null || (str4 = l2.toString()) == null) {
            str4 = "";
        }
        String str10 = (String) ((LinkedHashMap) map2).get(str4);
        HashMap hashMap = (HashMap) map;
        String str11 = (String) hashMap.get("is_content_truncate");
        String str12 = (String) hashMap.get("anchor_content_size");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(anchors, "anchors");
        if (z2) {
            str7 = "video_single_anchor";
        } else if (valueOf == null || valueOf.intValue() != 0) {
            str7 = "video_main_anchor";
        }
        C71363Rzb.LIZJ(C71360RzY.LJJIJ(interfaceC44105HSr.LJJLL(), interfaceC44105HSr, str7, null, 24), anchors, valueOf, str3, str10, z2, str9, "anchor", str11, str12);
        if (aweme.isAd() || C63081OpJ.LLF(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if ((awemeRawAd != null && awemeRawAd.getAnchorClickType() == 2) || C63081OpJ.LLF(aweme)) {
                str5 = "click";
            } else {
                str5 = "otherclick";
            }
            if (!C63081OpJ.LLF(aweme)) {
                LJJJJI = aweme.getAwemeRawAd();
            } else {
                LJJJJI = C63081OpJ.LJJJJI(aweme);
            }
            C025908h.LIZLLL("draw_ad", str5, LJJJJI, "shop_anchor", "refer");
        }
        if (o.LJ(str3, "click_list")) {
            C73332uH.LIZ(PageNodeMonitorService.LJIIIZ(), "video_multi_anchor", null, null, null, 14);
        }
    }
}
