package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.C35697Dzh;
import X.C69825Ran;
import X.InterfaceC61312at;
import X.InterfaceC69848RbA;
import X.X1D;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MiniPdpTitleViewModel extends JediViewModel<TitleState> {
    public InterfaceC69848RbA LJLJJLL;
    public ProductPackStruct LJLJL;
    public SkuPanelStarter.SkuEnterParams LJLJLJ;
    public List<String> LJLJLLL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final TitleState kv0() {
        String str;
        Integer hidePdpEntrance;
        ProductBase productBase;
        ProductPackStruct productPackStruct = this.LJLJL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            str = productBase.title;
        } else {
            str = null;
        }
        boolean z = false;
        C35697Dzh c35697Dzh = new C35697Dzh(str, Iv0(false), Iv0(true));
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLJLJ;
        if (skuEnterParams != null && (hidePdpEntrance = skuEnterParams.getHidePdpEntrance()) != null && hidePdpEntrance.intValue() == 1) {
            z = true;
        }
        return Hv0(new TitleState(null, null, null, null, Boolean.FALSE, c35697Dzh, null, null, Boolean.valueOf(!z), null, 719, null), this.LJLJLLL);
    }

    /* loaded from: classes13.dex */
    public static final class TitleState implements InterfaceC61312at {
        public final Boolean detailShow;
        public final CharSequence discount;
        public final Boolean layoutVertical;
        public final CharSequence marketPrice;
        public final C69825Ran openPDPEvent;
        public final CharSequence price;
        public final PromotionView promotionView;
        public final Boolean showCouponIcon;
        public final Boolean showTitleByCouponStyle;
        public final C35697Dzh title;

        public TitleState() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public static /* synthetic */ TitleState copy$default(TitleState titleState, CharSequence charSequence, PromotionView promotionView, CharSequence charSequence2, CharSequence charSequence3, Boolean bool, C35697Dzh c35697Dzh, Boolean bool2, Boolean bool3, Boolean bool4, C69825Ran c69825Ran, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = titleState.price;
            }
            if ((i & 2) != 0) {
                promotionView = titleState.promotionView;
            }
            if ((i & 4) != 0) {
                charSequence2 = titleState.marketPrice;
            }
            if ((i & 8) != 0) {
                charSequence3 = titleState.discount;
            }
            if ((i & 16) != 0) {
                bool = titleState.layoutVertical;
            }
            if ((i & 32) != 0) {
                c35697Dzh = titleState.title;
            }
            if ((i & 64) != 0) {
                bool2 = titleState.showCouponIcon;
            }
            if ((i & 128) != 0) {
                bool3 = titleState.showTitleByCouponStyle;
            }
            if ((i & 256) != 0) {
                bool4 = titleState.detailShow;
            }
            if ((i & 512) != 0) {
                c69825Ran = titleState.openPDPEvent;
            }
            return titleState.copy(charSequence, promotionView, charSequence2, charSequence3, bool, c35697Dzh, bool2, bool3, bool4, c69825Ran);
        }

        public final TitleState copy(CharSequence charSequence, PromotionView promotionView, CharSequence charSequence2, CharSequence charSequence3, Boolean bool, C35697Dzh c35697Dzh, Boolean bool2, Boolean bool3, Boolean bool4, C69825Ran c69825Ran) {
            return new TitleState(charSequence, promotionView, charSequence2, charSequence3, bool, c35697Dzh, bool2, bool3, bool4, c69825Ran);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleState)) {
                return false;
            }
            TitleState titleState = (TitleState) obj;
            return o.LJ(this.price, titleState.price) && o.LJ(this.promotionView, titleState.promotionView) && o.LJ(this.marketPrice, titleState.marketPrice) && o.LJ(this.discount, titleState.discount) && o.LJ(this.layoutVertical, titleState.layoutVertical) && o.LJ(this.title, titleState.title) && o.LJ(this.showCouponIcon, titleState.showCouponIcon) && o.LJ(this.showTitleByCouponStyle, titleState.showTitleByCouponStyle) && o.LJ(this.detailShow, titleState.detailShow) && o.LJ(this.openPDPEvent, titleState.openPDPEvent);
        }

        public int hashCode() {
            CharSequence charSequence = this.price;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            PromotionView promotionView = this.promotionView;
            int hashCode2 = (hashCode + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
            CharSequence charSequence2 = this.marketPrice;
            int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.discount;
            int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            Boolean bool = this.layoutVertical;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            C35697Dzh c35697Dzh = this.title;
            int hashCode6 = (hashCode5 + (c35697Dzh == null ? 0 : c35697Dzh.hashCode())) * 31;
            Boolean bool2 = this.showCouponIcon;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.showTitleByCouponStyle;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.detailShow;
            int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            C69825Ran c69825Ran = this.openPDPEvent;
            return hashCode9 + (c69825Ran != null ? c69825Ran.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TitleState(price=");
            LIZ.append((Object) this.price);
            LIZ.append(", promotionView=");
            LIZ.append(this.promotionView);
            LIZ.append(", marketPrice=");
            LIZ.append((Object) this.marketPrice);
            LIZ.append(", discount=");
            LIZ.append((Object) this.discount);
            LIZ.append(", layoutVertical=");
            LIZ.append(this.layoutVertical);
            LIZ.append(", title=");
            LIZ.append(this.title);
            LIZ.append(", showCouponIcon=");
            LIZ.append(this.showCouponIcon);
            LIZ.append(", showTitleByCouponStyle=");
            LIZ.append(this.showTitleByCouponStyle);
            LIZ.append(", detailShow=");
            LIZ.append(this.detailShow);
            LIZ.append(", openPDPEvent=");
            LIZ.append(this.openPDPEvent);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public final Boolean getDetailShow() {
            return this.detailShow;
        }

        public final CharSequence getDiscount() {
            return this.discount;
        }

        public final Boolean getLayoutVertical() {
            return this.layoutVertical;
        }

        public final CharSequence getMarketPrice() {
            return this.marketPrice;
        }

        public final C69825Ran getOpenPDPEvent() {
            return this.openPDPEvent;
        }

        public final CharSequence getPrice() {
            return this.price;
        }

        public final PromotionView getPromotionView() {
            return this.promotionView;
        }

        public final Boolean getShowCouponIcon() {
            return this.showCouponIcon;
        }

        public final Boolean getShowTitleByCouponStyle() {
            return this.showTitleByCouponStyle;
        }

        public final C35697Dzh getTitle() {
            return this.title;
        }

        public TitleState(CharSequence charSequence, PromotionView promotionView, CharSequence charSequence2, CharSequence charSequence3, Boolean bool, C35697Dzh c35697Dzh, Boolean bool2, Boolean bool3, Boolean bool4, C69825Ran c69825Ran) {
            this.price = charSequence;
            this.promotionView = promotionView;
            this.marketPrice = charSequence2;
            this.discount = charSequence3;
            this.layoutVertical = bool;
            this.title = c35697Dzh;
            this.showCouponIcon = bool2;
            this.showTitleByCouponStyle = bool3;
            this.detailShow = bool4;
            this.openPDPEvent = c69825Ran;
        }

        public /* synthetic */ TitleState(CharSequence charSequence, PromotionView promotionView, CharSequence charSequence2, CharSequence charSequence3, Boolean bool, C35697Dzh c35697Dzh, Boolean bool2, Boolean bool3, Boolean bool4, C69825Ran c69825Ran, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : promotionView, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : c35697Dzh, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : bool4, (i & 512) == 0 ? c69825Ran : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> Iv0(boolean r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r6.LJLJL
            r2 = 0
            if (r0 == 0) goto L6a
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo> r0 = r0.productLogos
            if (r0 == 0) goto L6a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L12:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L30
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo) r0
            java.lang.Integer r0 = r0.productLogoType
            if (r0 != 0) goto L25
            goto L12
        L25:
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L12
            r5.add(r2)
            goto L12
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r5.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo) r0
            if (r7 == 0) goto L5b
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.darkModeImage
            if (r0 == 0) goto L39
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L39
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r3, r0)
        L55:
            if (r0 == 0) goto L39
            r2.add(r0)
            goto L39
        L5b:
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.image
            if (r0 == 0) goto L39
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L39
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r3, r0)
            goto L55
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel.Iv0(boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        if (r1 != null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0 == null) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel.TitleState Hv0(com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel.TitleState r18, java.util.List<java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel.Hv0(com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel$TitleState, java.util.List):com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel$TitleState");
    }
}
