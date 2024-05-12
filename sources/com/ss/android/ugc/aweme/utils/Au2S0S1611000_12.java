package com.ss.android.ugc.aweme.utils;

import X.C26045AKb;
import X.C34K;
import X.C68322mC;
import X.C71332Rz6;
import X.C71335Rz9;
import X.C71360RzY;
import X.C71361RzZ;
import X.C71370Rzi;
import X.C76542zS;
import X.ORZ;
import X.TAT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS6S0211000_12;
import kotlin.jvm.internal.AqS6S2300000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S0S1611000_12 extends TAT {
    public final int $t;
    public int i8;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public boolean z7;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0166, code lost:
    
        if (r10 != null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(com.ss.android.ugc.aweme.utils.Au2S0S1611000_12 r24, android.view.View r25) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S0S1611000_12.LIZ$0(com.ss.android.ugc.aweme.utils.Au2S0S1611000_12, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    public static final void LIZ$1(Au2S0S1611000_12 au2S0S1611000_12, View view) {
        String str;
        String str2;
        String eventType;
        SkuItem skuItem;
        if (view != null) {
            C71370Rzi.LIZ = true;
            CommonVideoAnchorModel commonVideoAnchorModel = ((C71335Rz9) au2S0S1611000_12.l1).LJLJJI;
            int i = au2S0S1611000_12.i8;
            ShopWindowAnchorModel data = (ShopWindowAnchorModel) au2S0S1611000_12.l2;
            boolean z = !((C34K) au2S0S1611000_12.l3).element;
            o.LJIIIZ(data, "data");
            if (commonVideoAnchorModel != null) {
                C76542zS.LIZJ("tiktokec_button_click", new AqS6S0211000_12(i, commonVideoAnchorModel, data, z, 1));
            }
            if (((C34K) au2S0S1611000_12.l3).element) {
                if (((CharSequence) ((C68322mC) au2S0S1611000_12.l4).element).length() > 0) {
                    C26045AKb c26045AKb = new C26045AKb(((C71335Rz9) au2S0S1611000_12.l1).LJLILLLLZI);
                    c26045AKb.LJIIIZ((CharSequence) ((C68322mC) au2S0S1611000_12.l4).element);
                    c26045AKb.LJIIJ();
                    return;
                }
                return;
            }
            IECommerceVideoService iECommerceVideoService = ((C71335Rz9) au2S0S1611000_12.l1).LJLJLJ;
            if (iECommerceVideoService != null) {
                TuxIconView addCartBtn = (TuxIconView) au2S0S1611000_12.l5;
                o.LJIIIIZZ(addCartBtn, "addCartBtn");
                TuxIconView tuxIconView = (TuxIconView) au2S0S1611000_12.l5;
                View findViewById = ((View) au2S0S1611000_12.l6).findViewById(R.id.a27);
                o.LJIIIIZZ(findViewById, "view.findViewById(R.id.anchor_icon_bg)");
                C71361RzZ c71361RzZ = C71361RzZ.LIZ;
                ShopWindowExtraModel shopWindowExtraModel = ((ShopWindowAnchorModel) ListProtector.get(((C71335Rz9) au2S0S1611000_12.l1).LJLJI, au2S0S1611000_12.i8)).LIZ;
                c71361RzZ.getClass();
                iECommerceVideoService.LIZIZ(tuxIconView, (ViewGroup) findViewById, C71361RzZ.LJJIJLIJ(shopWindowExtraModel, 2));
            }
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = ((C71335Rz9) au2S0S1611000_12.l1).M(au2S0S1611000_12.s0);
            if (au2S0S1611000_12.z7) {
                List<SkuItem> list = ((ShopWindowAnchorModel) au2S0S1611000_12.l2).LIZ.skus;
                String str3 = "";
                if (list == null || (skuItem = (SkuItem) ORZ.LJLLLLLL(0, list)) == null || (str2 = skuItem.skuId) == null) {
                    str2 = "";
                }
                String str4 = ((ShopWindowAnchorModel) au2S0S1611000_12.l2).LIZ.sellerId;
                if (str4 == null) {
                    str4 = "";
                }
                TuxIconView tuxIconView2 = (TuxIconView) ((View) au2S0S1611000_12.l6).findViewById(R.id.jyu);
                IECommerceVideoService iECommerceVideoService2 = ((C71335Rz9) au2S0S1611000_12.l1).LJLJLJ;
                if (iECommerceVideoService2 != null) {
                    TuxIconView addCartBtn2 = (TuxIconView) au2S0S1611000_12.l5;
                    o.LJIIIIZZ(addCartBtn2, "addCartBtn");
                    TuxIconView tuxIconView3 = (TuxIconView) au2S0S1611000_12.l5;
                    String str5 = au2S0S1611000_12.s0;
                    C71361RzZ c71361RzZ2 = C71361RzZ.LIZ;
                    String str6 = ((ShopWindowAnchorModel) au2S0S1611000_12.l2).LIZ.schema;
                    c71361RzZ2.getClass();
                    String LJJIFFI = C71361RzZ.LJJIFFI(str6);
                    AqS6S2300000_12 aqS6S2300000_12 = new AqS6S2300000_12((ShopWindowAnchorModel) au2S0S1611000_12.l2, (ShopWindowAnchorModel) au2S0S1611000_12.s0, (String) au2S0S1611000_12.l1, (C71335Rz9) "video_comment_multi_anchor", (String) c68322mC, (C68322mC<String>) 0);
                    ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) au2S0S1611000_12.l2;
                    CommonVideoAnchorModel commonVideoAnchorModel2 = ((C71335Rz9) au2S0S1611000_12.l1).LJLJJI;
                    if (commonVideoAnchorModel2 != null && (eventType = commonVideoAnchorModel2.getEventType()) != null) {
                        str3 = eventType;
                    }
                    String LJIIZILJ = C71360RzY.LJIIZILJ(shopWindowAnchorModel, commonVideoAnchorModel2, str3, "video_comment_multi_anchor", (String) c68322mC.element);
                    C71332Rz6 c71332Rz6 = new C71332Rz6((C71335Rz9) au2S0S1611000_12.l1, au2S0S1611000_12.i8, (ShopWindowAnchorModel) au2S0S1611000_12.l2, au2S0S1611000_12.s0, str2, "video_comment_multi_anchor");
                    str2 = str2;
                    iECommerceVideoService2.LJI(tuxIconView2, tuxIconView3, str5, str2, str4, LJJIFFI, aqS6S2300000_12, LJIIZILJ, c71332Rz6);
                }
                C71335Rz9 c71335Rz9 = (C71335Rz9) au2S0S1611000_12.l1;
                c71335Rz9.P("tiktokec_confirm_cart", au2S0S1611000_12.i8, (ShopWindowAnchorModel) au2S0S1611000_12.l2, c71335Rz9.LJLJJI, str2, null, null, null, null, null, "video_comment_multi_anchor");
                return;
            }
            ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) au2S0S1611000_12.l2;
            String str7 = au2S0S1611000_12.s0;
            CommonVideoAnchorModel commonVideoAnchorModel3 = ((C71335Rz9) au2S0S1611000_12.l1).LJLJJI;
            if (commonVideoAnchorModel3 != null) {
                str = commonVideoAnchorModel3.getEventType();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(((C71335Rz9) au2S0S1611000_12.l1).LJLILLLLZI, C71360RzY.LJIJJLI(null, shopWindowAnchorModel2, str7, commonVideoAnchorModel3, true, str, "video_comment_multi_anchor", (String) c68322mC.element, Boolean.TRUE, "/sku")).open();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S1611000_12(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, boolean z, int i2) {
        super(700L);
        this.$t = i2;
        this.l1 = obj;
        this.i8 = i;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
        this.l5 = obj5;
        this.l6 = obj6;
        this.s0 = str;
        this.z7 = z;
    }
}
