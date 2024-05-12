package com.ss.android.ugc.aweme.ecommerce.anchor.adapter;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.C025908h;
import X.C0AX;
import X.C16880lQ;
import X.C188727au;
import X.C1E4;
import X.C227768wm;
import X.C27739Aud;
import X.C29127Bbv;
import X.C36922EeM;
import X.C45804HyK;
import X.C47261Igj;
import X.C59592Na8;
import X.C63081OpJ;
import X.C65330PkU;
import X.C65352Pkq;
import X.C71360RzY;
import X.C71361RzZ;
import X.C71363Rzb;
import X.C71366Rze;
import X.C71367Rzf;
import X.C71370Rzi;
import X.C71376Rzo;
import X.C71379Rzr;
import X.C71380Rzs;
import X.C71396S0i;
import X.C71406S0s;
import X.C78765Uvh;
import X.C78857UxB;
import X.C78946Uyc;
import X.C78949Uyf;
import X.C78983UzD;
import X.C79234V7u;
import X.EnumC42934Gt8;
import X.EnumC71103RvP;
import X.FMX;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.S0J;
import X.S0V;
import X.SHA;
import X.Z9N;
import Y.ARunnableS48S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.internal.b;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.model.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.PriceDaInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShowTextInfo;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS16S1101000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes13.dex */
public final class AnchorPanelAdapter extends AbstractC029409q<C71406S0s> {
    public final ProductListModel LJLIL;
    public final Context LJLILLLLZI;
    public final HashMap<String, String> LJLJI;
    public final boolean LJLJJI;
    public int LJLJJL;
    public final IECommerceVideoService LJLJJLL;
    public final IECommerceAnchorService LJLJL;
    public final PanelOpenInfo LJLJLJ;
    public final List<ShopWindowAnchorModel> LJLJLLL;
    public final int LJLL;
    public final boolean LJLLI;
    public Map<String, List<PromotionLogo>> LJLLILLLL;
    public Map<String, String> LJLLJ;
    public Map<String, PromotionView> LJLLL;
    public Map<String, String> LJLLLL;
    public Map<String, String> LJLLLLLL;
    public Map<String, Map<String, Object>> LJLZ;
    public Map<String, AddToCartButton> LJZ;
    public Map<String, String> LJZI;
    public Map<String, Float> LJZL;
    public Map<String, Integer> LL;
    public Map<String, ShowTextInfo> LLD;
    public Map<String, String> LLF;
    public Map<String, String> LLFF;
    public Map<String, List<SkuItem>> LLFFF;
    public Map<String, String> LLFII;
    public Map<String, C71376Rzo> LLFZ;
    public Map<String, String> LLI;
    public long LLIFFJFJJ;
    public final Map<String, String> LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final List<Integer> LLIIIJ;
    public final List<Integer> LLIIIL;
    public boolean LLIIIZ;
    public int LLIIJI;

    public final void LLFZ() {
        String aid;
        C71379Rzr c71379Rzr;
        ProductListModel productListModel = this.LJLIL;
        if (productListModel == null || (aid = productListModel.getAid()) == null || aid.length() == 0 || (c71379Rzr = (C71379Rzr) ((LinkedHashMap) C71370Rzi.LJ).get(aid)) == null) {
            return;
        }
        LLII(c71379Rzr);
    }

    public final void LJLLLLLL() {
        Handler handler;
        ARunnableS48S0100000_12 aRunnableS48S0100000_12;
        Map<String, C71376Rzo> map = this.LLFZ;
        if (map != null) {
            Iterator it = ((LinkedHashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                C71376Rzo c71376Rzo = (C71376Rzo) ((Map.Entry) it.next()).getValue();
                c71376Rzo.getClass();
                try {
                    ((ArrayList) c71376Rzo.LJFF).clear();
                    handler = c71376Rzo.LJ;
                    aRunnableS48S0100000_12 = c71376Rzo.LJIIIZ;
                } catch (Exception unused) {
                }
                if (aRunnableS48S0100000_12 != null) {
                    handler.removeCallbacks(aRunnableS48S0100000_12);
                    c71376Rzo.LIZIZ = c71376Rzo.LIZLLL;
                    c71376Rzo.LIZ();
                } else {
                    o.LJIJI("countDownAction");
                    throw null;
                    break;
                }
            }
        }
        Map<String, C71376Rzo> map2 = this.LLFZ;
        if (map2 != null) {
            ((LinkedHashMap) map2).clear();
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (this.LJLLI) {
            return this.LJLJLLL.size() + 1;
        }
        return this.LJLJLLL.size();
    }

    public final String LJZI(String str) {
        if (this.LLII.containsKey(str)) {
            return String.valueOf(((LinkedHashMap) this.LLII).get(str));
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        ProductListModel productListModel = this.LJLIL;
        c71361RzZ.getClass();
        String LJJI = C71361RzZ.LJJI(productListModel, str);
        this.LLII.put(str, LJJI);
        return LJJI;
    }

    public final void LLIFFJFJJ(List<C71379Rzr> initMap) {
        o.LJIIIZ(initMap, "initMap");
        for (C71379Rzr productPromotionInfo : initMap) {
            LLII(productPromotionInfo);
            String aid = this.LJLIL.getAid();
            o.LJIIIZ(productPromotionInfo, "productPromotionInfo");
            if (aid != null && aid.length() != 0) {
                Map<String, C71379Rzr> map = C71370Rzi.LJ;
                if (map.size() > 3) {
                    ((LinkedHashMap) map).clear();
                }
                map.put(aid, productPromotionInfo);
            }
        }
    }

    public final void LLII(C71379Rzr c71379Rzr) {
        Map<String, PromotionView> map;
        Map<String, String> map2;
        String str;
        if (c71379Rzr != null) {
            Map<String, String> map3 = this.LJLLJ;
            this.LJLLJ = c71379Rzr.LIZ;
            this.LJLLLL = c71379Rzr.LIZJ;
            this.LJLLLLLL = c71379Rzr.LIZIZ;
            this.LLI = c71379Rzr.LJIIJ;
            this.LJLLL = c71379Rzr.LJ;
            this.LJLLILLLL = c71379Rzr.LIZLLL;
            this.LJZI = c71379Rzr.LJIIJJI;
            this.LJLZ = c71379Rzr.LJFF;
            this.LLFFF = c71379Rzr.LJII;
            this.LLFII = c71379Rzr.LJIIIZ;
            this.LJZ = c71379Rzr.LJI;
            this.LL = c71379Rzr.LJIILIIL;
            this.LLD = c71379Rzr.LJIILLIIL;
            this.LJZL = c71379Rzr.LJIIL;
            this.LLF = c71379Rzr.LJIILJJIL;
            this.LLFF = c71379Rzr.LJIILL;
            int i = 0;
            for (ShopWindowAnchorModel shopWindowAnchorModel : this.LJLJLLL) {
                int i2 = i + 1;
                String str2 = null;
                if (i >= 0) {
                    String valueOf = String.valueOf(shopWindowAnchorModel.LIZ.productId);
                    Map<String, String> map4 = this.LJLLJ;
                    if (map4 != null) {
                        str2 = map4.get(valueOf);
                    }
                    if (map3 != null) {
                        map3.get(valueOf);
                    }
                    Map<String, String> map5 = this.LJLLLL;
                    if (map5 != null && map5.containsKey(valueOf) && (map2 = this.LJLLLL) != null && (str = map2.get(valueOf)) != null) {
                        C78857UxB.LJJJIL(str);
                    }
                    Map<String, PromotionView> map6 = this.LJLLL;
                    if (map6 != null && map6.containsKey(valueOf) && (map = this.LJLLL) != null) {
                        map.get(valueOf);
                    }
                    notifyItemChanged(i, str2);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.LJLLI && i == getItemCount() - 1) {
            return 2;
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        int i2 = this.LJLL;
        c71361RzZ.getClass();
        if (i2 != 0) {
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2 && i <= 0) {
                return 1;
            }
        }
        return 0;
    }

    @QD3
    public final void onEvent$ecommerce_video_release(C59592Na8 event) {
        ShopWindowAnchorModel shopWindowAnchorModel;
        o.LJIIIZ(event, "event");
        int i = this.LLIIJI;
        if (i != -1 && (shopWindowAnchorModel = (ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)) != null) {
            ProductListModel productListModel = this.LJLIL;
            String eventType = productListModel.getEventType();
            String str = shopWindowAnchorModel.keyword;
            Long l = event.LJLIL;
            HashMap<String, String> eventMap = this.LJLJI;
            o.LJIIIZ(eventMap, "eventMap");
            C188727au c188727au = new C188727au();
            c188727au.LJII(eventMap);
            c188727au.LJIIIZ("enter_from", eventType);
            c188727au.LJIIIZ("anchor_entry", str);
            String authorUid = productListModel.getAuthorUid();
            String str2 = "";
            if (authorUid == null) {
                authorUid = "";
            }
            c188727au.LJIIIZ("author_id", authorUid);
            String aid = productListModel.getAid();
            if (aid != null) {
                str2 = aid;
            }
            c188727au.LJIIIZ("group_id", str2);
            c188727au.LJIIIZ("duration", String.valueOf(l));
            c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(productListModel.getAweme()));
            FMX.LJIIL("anchor_stay_time", c188727au.LIZ);
            C71363Rzb.LJIILIIL(this.LJLIL.getEventType(), this.LJLIL, event.LJLIL, null, null);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LL(int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter.LL(int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    @Override // X.AbstractC029409q
    /* renamed from: LLF, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C71406S0s r23, int r24) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter.onBindViewHolder(X.S0s, int):void");
    }

    public final void LLFF(ShopWindowAnchorModel shopWindowAnchorModel, String str) {
        Lifecycle lifecycle;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        Context context = this.LJLILLLLZI;
        String str2 = shopWindowAnchorModel.LIZ.finalUrl;
        String aid = this.LJLIL.getAid();
        String authorUid = this.LJLIL.getAuthorUid();
        c71361RzZ.getClass();
        if (C71361RzZ.LJJJJLI(str, str2, aid, authorUid, context)) {
            C71363Rzb.LJIILLIIL(this.LJLIL, shopWindowAnchorModel.LIZ, "actual", "", 0, 48);
        } else {
            C71361RzZ.LJI(shopWindowAnchorModel, true, this.LJLIL.getEventType(), false);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLILLLLZI);
        if (LJJIFFI != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter$openThirdPartyPage$1
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
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C71406S0s com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        C71406S0s c71406S0s;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                c71406S0s = new C71406S0s(AnonymousClass030.LIZLLL(this.LJLILLLLZI, R.layout.bck, parent, false, "from(context)\n          …ndow_grid, parent, false)"));
            } else {
                c71406S0s = new C71406S0s(AnonymousClass030.LIZLLL(this.LJLILLLLZI, R.layout.zu, parent, false, "from(context)\n          …st_footer, parent, false)"));
            }
        } else {
            c71406S0s = new C71406S0s(AnonymousClass030.LIZLLL(this.LJLILLLLZI, R.layout.bcl, parent, false, "from(context)\n          …ndow_line, parent, false)"));
        }
        C0AX.LIZ(parent, c71406S0s.itemView, R.id.lj7);
        View view = c71406S0s.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c71406S0s.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C71406S0s.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c71406S0s.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c71406S0s.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C71406S0s.class.getName();
        return c71406S0s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x021c, code lost:
    
        if (r3 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x02fb, code lost:
    
        if (r3 == null) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x043f  */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C71406S0s r31, int r32, java.util.List r33) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r2.intValue() == X.EnumC71103RvP.PRODUCT_STATUS_DOWN.getValue()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLZ(android.view.View r15, com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r16, int r17, boolean r18) {
        /*
            r14 = this;
            r0 = 2131363865(0x7f0a0819, float:1.834755E38)
            android.view.View r6 = r15.findViewById(r0)
            X.SY4 r6 = (X.SY4) r6
            if (r6 == 0) goto L55
        Lb:
            r5 = r16
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel r0 = r5.LIZ
            java.lang.Long r0 = r0.productId
            if (r0 == 0) goto L19
            java.lang.String r7 = r0.toString()
            if (r7 != 0) goto L1b
        L19:
            java.lang.String r7 = ""
        L1b:
            r3 = r17
            r4 = r14
            if (r18 == 0) goto L32
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel r0 = r5.LIZ
            java.lang.Integer r2 = r0.productStatus
            if (r2 == 0) goto L45
            X.RvP r0 = X.EnumC71103RvP.PRODUCT_STATUS_DOWN
            int r1 = r0.getValue()
            int r0 = r2.intValue()
            if (r0 != r1) goto L45
        L32:
            if (r6 == 0) goto L44
            r0 = 0
            r6.setEnabled(r0)
            r0 = 1
            r6.setSupportClickWhenDisable(r0)
            X.Rys r2 = new X.Rys
            r2.<init>(r3, r4, r5, r6, r7)
            X.C16880lQ.LJIIJ(r2, r6)
        L44:
            return
        L45:
            if (r6 == 0) goto L44
            com.ss.android.ugc.aweme.utils.Au2S0S1201000_12 r8 = new com.ss.android.ugc.aweme.utils.Au2S0S1201000_12
            r13 = 0
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            X.C16880lQ.LJIIJ(r8, r6)
            goto L44
        L55:
            r6 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter.LJLZ(android.view.View, com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel, int, boolean):void");
    }

    public final void LJZ(View view, int i, ShopWindowAnchorModel shopWindowAnchorModel, String str) {
        String LJIIIZ;
        String str2;
        Integer num;
        String str3;
        String str4;
        Integer num2;
        Integer num3;
        Integer num4;
        AwemeRawAd LJJJJI;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        Long adId;
        Integer num5;
        String str5;
        int i2;
        C71370Rzi.LIZ = false;
        boolean LJJJIL = C78857UxB.LJJJIL(shopWindowAnchorModel.LIZ.schema);
        C71363Rzb.LJIILLIIL(this.LJLIL, ((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ, "pre", "", this.LJLJLJ.getPanelStyle(), 32);
        this.LLIIJI = i;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        Context context = this.LJLILLLLZI;
        c71361RzZ.getClass();
        if (!C71361RzZ.LJIIIIZZ(context, shopWindowAnchorModel)) {
            return;
        }
        String valueOf = String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.productId);
        String trackerId = LJZI(valueOf);
        ProductListModel productListModel = this.LJLIL;
        if ((productListModel == null || (LJIIIZ = productListModel.getEntranceForm()) == null) && (LJIIIZ = C71360RzY.LJIIIZ(this.LJLIL, this.LJLJJI)) == null) {
            LJIIIZ = "video_multi_anchor";
        }
        boolean LJJJJJ = C71361RzZ.LJJJJJ(this.LJLL, i);
        if (LJJJIL) {
            Integer num6 = shopWindowAnchorModel.type;
            int type = EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE();
            if (num6 == null || num6.intValue() != type || (num5 = shopWindowAnchorModel.LIZ.platform) == null || num5.intValue() != 100) {
                ProductListModel productListModel2 = this.LJLIL;
                String LJJII = C71360RzY.LJJII(shopWindowAnchorModel, productListModel2, LJJJJJ, productListModel2.getEventType(), LJIIIZ, trackerId, this.LJLJJI);
                HashMap<String, String> mobParams = this.LJLIL.getMobParams();
                if (mobParams == null || (str5 = mobParams.get("request_id")) == null) {
                    str5 = "";
                }
                Bundle bundle = new Bundle();
                if (trackerId.length() > 0) {
                    bundle.putString("track_id", trackerId);
                }
                if (str5.length() > 0) {
                    bundle.putString("request_id", str5);
                }
                bundle.putBoolean("video_anchor", true);
                bundle.putString("title", String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.title));
                bundle.putString("price", String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.formatPrice));
                IECommerceAnchorService iECommerceAnchorService = this.LJLJL;
                if (iECommerceAnchorService != null) {
                    i2 = iECommerceAnchorService.LJJJJ();
                } else {
                    i2 = 300;
                }
                String str6 = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.coverUrl;
                if (str6 == null) {
                    str6 = "";
                }
                try {
                    str6 = C1E4.LJJIIJZLJL(i2, i2, str6);
                } catch (Exception unused) {
                }
                bundle.putString("cover", str6);
                bundle.putString("id", String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.productId));
                SmartRoute buildRoute = SmartRouter.buildRoute(C78949Uyf.LJIILL(this.LJLILLLLZI), LJJII);
                buildRoute.withParam(bundle);
                buildRoute.withCallback(new C71380Rzs(this, i, shopWindowAnchorModel));
                buildRoute.open();
            } else {
                Activity LJIILL = C78949Uyf.LJIILL(this.LJLILLLLZI);
                ProductListModel productListModel3 = this.LJLIL;
                C71360RzY.LJJIIJZLJL(LJIILL, shopWindowAnchorModel, productListModel3, productListModel3.getEventType(), LJIIIZ, trackerId, this.LJLJJI);
            }
        } else {
            Integer num7 = shopWindowAnchorModel.type;
            int type2 = EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE();
            if (num7 == null || num7.intValue() != type2) {
                Integer num8 = shopWindowAnchorModel.type;
                int type3 = EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE();
                if (num8 == null || num8.intValue() != type3) {
                    str2 = null;
                } else {
                    str2 = shopWindowAnchorModel.schema;
                    LLFF(shopWindowAnchorModel, str2);
                }
            } else {
                if (C71361RzZ.LJJJJIZL(shopWindowAnchorModel.LIZ.finalUrl, false)) {
                    str2 = shopWindowAnchorModel.LIZ.finalUrl;
                } else {
                    str2 = shopWindowAnchorModel.LIZ.detailUrl;
                }
                String str7 = shopWindowAnchorModel.LIZ.detailUrl;
                if (str7 == null) {
                    str7 = "";
                }
                LLFF(shopWindowAnchorModel, str7);
            }
            ECommerceAnchorService.LJJJJI().LJIJ(C78949Uyf.LJIILL(this.LJLILLLLZI), str2);
        }
        C71363Rzb.LJIIL(this.LJLIL, (ShopWindowAnchorModel) ORZ.LJLLLL(this.LJLJLLL));
        C71363Rzb.LJIIJ(true, this.LJLIL.getEventType(), this.LJLIL.getAweme(), null, (ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i), ORZ.LLJILJILJ(this.LJLJLLL), "video_anchor", 8);
        ProductListModel model = this.LJLIL;
        ShopWindowAnchorModel anchor = (ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i);
        boolean z = this.LJLJJI;
        int panelStyle = this.LJLJLJ.getPanelStyle();
        AqS16S1101000_12 aqS16S1101000_12 = new AqS16S1101000_12(i, this, valueOf, 0);
        o.LJIIIZ(model, "model");
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(trackerId, "trackerId");
        ICommerceService LIZ = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        c71367Rzf.LJIJJ = "TEMAI";
        c71367Rzf.LIZJ = model.getAid();
        Boolean isAd = model.isAd();
        Boolean bool = Boolean.TRUE;
        Integer num9 = 1;
        if (o.LJ(isAd, bool)) {
            num = num9;
        } else {
            num = 0;
        }
        c71367Rzf.LJIL = num;
        if (!o.LJ(model.isAd(), bool) || (awemeRawAd2 = model.getAwemeRawAd()) == null || (adId = awemeRawAd2.getAdId()) == null) {
            str3 = "";
        } else {
            str3 = String.valueOf(adId);
        }
        c71367Rzf.LJJ = str3;
        if (!o.LJ(model.isAd(), bool) || (awemeRawAd = model.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            str4 = "";
        } else {
            str4 = String.valueOf(creativeId);
        }
        c71367Rzf.LJJI = str4;
        if (o.LJ(model.isAd(), bool)) {
            num2 = num9;
        } else {
            num2 = 0;
        }
        c71367Rzf.LJIL = num2;
        c71367Rzf.LIZLLL = model.getAuthorUid();
        c71367Rzf.LJ = model.getRequestId();
        String eventType = model.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        c71367Rzf.LIZIZ = eventType;
        c71367Rzf.LJIIL = "video_cart_tag";
        c71367Rzf.LJIILL = String.valueOf(anchor.LIZ.platform);
        ShopWindowExtraModel shopWindowExtraModel = anchor.LIZ;
        c71367Rzf.LJIILJJIL = shopWindowExtraModel.sourceFrom;
        c71367Rzf.LJIILIIL = shopWindowExtraModel.source;
        c71367Rzf.LJIIZILJ = String.valueOf(shopWindowExtraModel.productId);
        c71367Rzf.LJJIIJZLJL = C71366Rze.LJFF(anchor);
        if (C025908h.LJFF(false, model.getAuthorUid())) {
            num3 = num9;
        } else {
            num3 = 0;
        }
        c71367Rzf.LJIJ = num3;
        c71367Rzf.LJIJI = "no";
        c71367Rzf.LJIJJLI = String.valueOf(i + 1);
        c71367Rzf.LJJIII = C71361RzZ.LJJIIZ(model);
        String entranceForm = model.getEntranceForm();
        if (entranceForm == null) {
            entranceForm = LJIIIZ;
        }
        c71367Rzf.LJJIFFI = entranceForm;
        String pageName = model.getPageName();
        if (pageName == null) {
            pageName = "video";
        }
        c71367Rzf.LJJII = pageName;
        c71367Rzf.LJJJJ = trackerId;
        c71367Rzf.LJJJJI = "video";
        c71367Rzf.LJJJLL = str;
        c71367Rzf.LJI = C71360RzY.LJIJ(anchor, model.getAweme(), model.getEventType(), LJIIIZ, trackerId, z);
        c71367Rzf.LJJLJLI = "2";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C71360RzY.LJIILIIL("tiktokec_product_click", model.getAweme(), c71367Rzf.LIZIZ));
        HashMap<String, String> mobParams2 = model.getMobParams();
        if (mobParams2 != null) {
            mobParams2.put("track_id", trackerId);
        }
        HashMap<String, String> mobParams3 = model.getMobParams();
        if (mobParams3 != null) {
            for (Map.Entry<String, String> entry : mobParams3.entrySet()) {
                if (C78857UxB.LJJJIL(entry.getValue())) {
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        c71367Rzf.LIZ = linkedHashMap;
        aqS16S1101000_12.invoke(c71367Rzf);
        c71367Rzf.LJJJ = C71360RzY.LJIILLIIL(anchor.extra);
        c71367Rzf.LJJLIIIJJIZ = Integer.valueOf(panelStyle);
        C71361RzZ.LIZ.getClass();
        if (!C71361RzZ.LJJJI(model)) {
            num9 = 0;
        }
        c71367Rzf.LJJJZ = num9;
        List<ShopWindowAnchorModel> products = model.getProducts();
        if (products != null) {
            num4 = Integer.valueOf(products.size());
        } else {
            num4 = null;
        }
        c71367Rzf.LJJIJL = num4;
        String enterListForm = model.getEnterListForm();
        if (enterListForm == null) {
            enterListForm = "";
        }
        c71367Rzf.LJFF = enterListForm;
        LIZ.logCommerceEvents("tiktokec_product_click", c71367Rzf);
        if (o.LJ(this.LJLIL.isAd(), Boolean.TRUE) || C63081OpJ.LLF(this.LJLIL.getAweme())) {
            if (!C63081OpJ.LLF(this.LJLIL.getAweme())) {
                LJJJJI = this.LJLIL.getAwemeRawAd();
            } else {
                LJJJJI = C63081OpJ.LJJJJI(this.LJLIL.getAweme());
            }
            C025908h.LIZLLL("anchor_detail", "otherclick", LJJJJI, "shop_anchor", "refer");
        }
        C71370Rzi.LJIIIIZZ(((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.productId, this.LJLIL.getAid(), this.LJLIL.getAuthorUid());
    }

    public static final void LLFFF(int i, SHA sha, AnchorPanelAdapter anchorPanelAdapter, ShopWindowAnchorModel shopWindowAnchorModel, String str, boolean z) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C47261Igj.LJJIJIL(str));
        C78765Uvh.LJII(sha, urlModel, new S0J(i, sha, anchorPanelAdapter, shopWindowAnchorModel, str, z));
    }

    public final void LLD(String str, Long l, Boolean bool, int i, Boolean bool2, String str2) {
        if (!this.LLIIIZ) {
            return;
        }
        ProductListModel model = this.LJLIL;
        int panelStyle = this.LJLJLJ.getPanelStyle();
        o.LJIIIZ(model, "model");
        Boolean bool3 = Boolean.TRUE;
        b.LJJIJIIJIL("rd_tiktokec_video_shopping_list_render", new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("enter_from", model.getEventType()), new OSZ("author_id", model.getAuthorUid()), new OSZ("product_id", str), new OSZ("item_order", String.valueOf(i + 1)), new OSZ("group_id", model.getAid()), new OSZ("is_success", Integer.valueOf(o.LJ(bool, bool3) ? 1 : 0)), new OSZ("click_to_show_duration", String.valueOf(l)), new OSZ("image_url", str2), new OSZ("use_cache", Integer.valueOf(o.LJ(bool2, bool3) ? 1 : 0)), new OSZ("video_shopping_list_style", Integer.valueOf(panelStyle)));
    }

    public static final void LLFII(AnchorPanelAdapter anchorPanelAdapter, int i, String str, SHA icon, ShopWindowAnchorModel shopWindowAnchorModel, boolean z, Boolean bool) {
        boolean z2;
        String str2 = str;
        anchorPanelAdapter.LLD(String.valueOf(((ShopWindowAnchorModel) ListProtector.get(anchorPanelAdapter.LJLJLLL, i)).LIZ.productId), Long.valueOf(System.currentTimeMillis() - anchorPanelAdapter.LLIFFJFJJ), Boolean.valueOf(z), i, bool, str2);
        if (!z) {
            icon.setActualImageResource(R.drawable.b1k);
        }
        if (i == 0 && z) {
            anchorPanelAdapter.LLIIII = true;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = false;
            }
            anchorPanelAdapter.LLIIIILZ = z2;
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        o.LJIIIIZZ(icon, "icon");
        if (str2 == null) {
            str2 = "";
        }
        int i2 = anchorPanelAdapter.LJLL;
        c71361RzZ.getClass();
        C71361RzZ.LJIJJ(icon, shopWindowAnchorModel, str2, C71361RzZ.LJJJJJ(i2, i));
    }

    public AnchorPanelAdapter(ProductListModel productListModel, Context context, HashMap<String, String> hashMap, boolean z, int i, IECommerceVideoService iECommerceVideoService, IECommerceAnchorService iECommerceAnchorService, PanelOpenInfo panelOpenInfo) {
        o.LJIIIZ(panelOpenInfo, "panelOpenInfo");
        this.LJLIL = productListModel;
        this.LJLILLLLZI = context;
        this.LJLJI = hashMap;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = iECommerceVideoService;
        this.LJLJL = iECommerceAnchorService;
        this.LJLJLJ = panelOpenInfo;
        List<ShopWindowAnchorModel> products = productListModel.getProducts();
        if (products == null) {
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            List<AnchorCommonStruct> anchors = productListModel.getAnchors();
            c71361RzZ.getClass();
            products = C71361RzZ.LJJJJLL(C71361RzZ.LJJIIJ(anchors), true);
        }
        this.LJLJLLL = products;
        this.LJLL = panelOpenInfo.getPanelStyle();
        this.LJLLI = panelOpenInfo.getPanelNeedMaybeYouLike();
        this.LLII = new LinkedHashMap();
        this.LLIIIJ = new ArrayList();
        this.LLIIIL = new ArrayList();
        this.LLIIJI = -1;
        SystemClock.elapsedRealtime();
    }

    public final void LJZL(String str, int i, ShopWindowAnchorModel shopWindowAnchorModel, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7) {
        int i2;
        String str8;
        String str9;
        int i3;
        String str10;
        String str11;
        String str12;
        int i4;
        Map map;
        String str13;
        String str14;
        Long adId;
        Long creativeId;
        String LJIIIZ = C71360RzY.LJIIIZ(this.LJLIL, this.LJLJJI);
        if (LJIIIZ == null) {
            LJIIIZ = "video_multi_anchor";
        }
        String LJZI = LJZI(str2);
        String str15 = "";
        Map<String, String> LJJZ = Z9N.LIZIZ.LIZ.LJJZ(this.LJLIL.getEventType(), "", "search_id", "search_result_id", "search_entrance", "list_item_id", "last_from_group_id");
        ICommerceService LIZ = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        c71367Rzf.LJIJJ = "TEMAI";
        c71367Rzf.LJJII = "video";
        c71367Rzf.LJJZ = "video";
        c71367Rzf.LIZLLL = this.LJLIL.getAuthorUid();
        c71367Rzf.LJIIZILJ = str2;
        c71367Rzf.LJIILL = String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.platform);
        c71367Rzf.LJIILIIL = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.source;
        ProductListModel productListModel = this.LJLIL;
        c71367Rzf.LJI = C71360RzY.LJIJI(shopWindowAnchorModel, productListModel, productListModel.getEventType(), LJIIIZ, LJZI, this.LJLJJI, LJJZ, str7);
        Boolean isAd = this.LJLIL.isAd();
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(isAd, bool2)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c71367Rzf.LJIL = i2;
        PriceDaInfo priceDaInfo = null;
        if (!o.LJ(this.LJLIL.isAd(), bool2)) {
            str8 = "";
        } else {
            AwemeRawAd awemeRawAd = this.LJLIL.getAwemeRawAd();
            if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                str8 = String.valueOf(creativeId);
            } else {
                str8 = null;
            }
        }
        c71367Rzf.LJJI = str8;
        if (!o.LJ(this.LJLIL.isAd(), bool2)) {
            str9 = "";
        } else {
            AwemeRawAd awemeRawAd2 = this.LJLIL.getAwemeRawAd();
            if (awemeRawAd2 != null && (adId = awemeRawAd2.getAdId()) != null) {
                str9 = String.valueOf(adId);
            } else {
                str9 = null;
            }
        }
        c71367Rzf.LJJ = str9;
        if (C025908h.LJFF(false, this.LJLIL.getAuthorUid())) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c71367Rzf.LJIJ = i3;
        c71367Rzf.LJJIII = S0V.LIZ(this.LJLIL.getAweme());
        c71367Rzf.LJJJJI = "video";
        c71367Rzf.LJJLL = "add_to_cart";
        c71367Rzf.LJJZZI = "add_to_cart";
        c71367Rzf.LJJZZIII = this.LJLIL.getAid();
        c71367Rzf.LJL = this.LJLIL.getEventType();
        c71367Rzf.LJLI = str3;
        c71367Rzf.LJLIIIL = "1";
        c71367Rzf.LJJJJI = "video";
        Integer num = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJLLL, i)).LIZ.productStatus;
        int value = EnumC71103RvP.PRODUCT_STATUS_ON_SALES.getValue();
        if (num != null && num.intValue() == value) {
            str10 = "1";
        } else {
            int value2 = EnumC71103RvP.PRODUCT_STATUS_STOCK.getValue();
            if (num == null || num.intValue() != value2) {
                str10 = "3";
            } else {
                str10 = "2";
            }
        }
        c71367Rzf.LJIIIIZZ = str10;
        HashMap<String, String> mobParams = this.LJLIL.getMobParams();
        if (mobParams != null && mobParams.containsKey("rec_session_id")) {
            HashMap<String, String> mobParams2 = this.LJLIL.getMobParams();
            if (mobParams2 != null && (str14 = mobParams2.get("rec_session_id")) != null) {
                str15 = str14;
            }
            c71367Rzf.LJII = str15;
        }
        Map<String, String> map2 = this.LJLLLL;
        if (map2 != null) {
            str11 = (String) ((LinkedHashMap) map2).get(str2);
        } else {
            str11 = null;
        }
        c71367Rzf.LJLIIL = str11;
        Map<String, String> map3 = this.LJLLJ;
        if (map3 != null) {
            str12 = (String) ((LinkedHashMap) map3).get(str2);
        } else {
            str12 = null;
        }
        c71367Rzf.LJLIL = str12;
        c71367Rzf.LJLJJL = str7;
        if (o.LJ(bool, bool2)) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c71367Rzf.LJJIZ = i4;
        c71367Rzf.LJLJJLL = str4;
        c71367Rzf.LJLJL = "1";
        c71367Rzf.LJLJLJ = str5;
        c71367Rzf.LJLJLLL = str6;
        c71367Rzf.LJLLLL = LJJZ.get("search_entrance");
        c71367Rzf.LJJIFFI = LJIIIZ;
        Map<String, String> map4 = this.LJZI;
        if (map4 != null && (str13 = (String) ((LinkedHashMap) map4).get(str2)) != null) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str13, C65330PkU.LIZJ(C65352Pkq.LJI(PriceDaInfo.class)));
                if (!(fromJson instanceof PriceDaInfo)) {
                    fromJson = null;
                }
                priceDaInfo = (PriceDaInfo) fromJson;
            } catch (s unused) {
            }
            if (priceDaInfo != null) {
                c71367Rzf.LJLILLLLZI = priceDaInfo.originPriceValue;
                c71367Rzf.LJLJI = priceDaInfo.availablePriceValue;
                c71367Rzf.LJLJJI = priceDaInfo.currency;
            }
        }
        c71367Rzf.LJJLIIIJJIZ = Integer.valueOf(this.LJLJLJ.getPanelStyle());
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        Map<String, C71376Rzo> map5 = this.LLFZ;
        c71361RzZ.getClass();
        C71361RzZ.LIZJ(map5, c71367Rzf, str2);
        Map<String, Map<String, Object>> map6 = this.LJLZ;
        if (map6 != null && (map = (Map) ((LinkedHashMap) map6).get(str2)) != null) {
            C71361RzZ.LJFF(c71367Rzf, map);
        }
        LIZ.logCommerceEvents(str, c71367Rzf);
    }
}
