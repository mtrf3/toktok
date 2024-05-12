package com.ss.android.ugc.aweme.ecommerce.core.view;

import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C018905p;
import X.C116724i4;
import X.C119774mz;
import X.C16880lQ;
import X.C1FJ;
import X.C2068389v;
import X.C221108m2;
import X.C26338AVi;
import X.C26516Aau;
import X.C26706Ady;
import X.C27160AlI;
import X.C27171AlT;
import X.C32151Nz;
import X.C38350F3i;
import X.C45804HyK;
import X.C5H3;
import X.C62562cu;
import X.C62850Ola;
import X.C69687RWp;
import X.C70589Rn7;
import X.C70590Rn8;
import X.C70600RnI;
import X.C70602RnK;
import X.C70648Ro4;
import X.C70649Ro5;
import X.C70759Rpr;
import X.C76800UCe;
import X.C78685UuP;
import X.C7MY;
import X.EnumC70206Rgw;
import X.EnumC70499Rlf;
import X.FFL;
import X.InterfaceC65784Pro;
import X.InterfaceC70593RnB;
import X.InterfaceC70598RnG;
import X.InterfaceC70599RnH;
import X.InterfaceC70603RnL;
import X.InterfaceC88472Yns;
import X.JBR;
import X.L9G;
import X.O6R;
import X.OH6;
import X.OUP;
import X.RUH;
import X.RUP;
import X.RX8;
import X.SG4;
import X.SJX;
import X.SY9;
import X.T5R;
import X.W5F;
import X.X1D;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S18S0200000_10;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S1S1100000_12;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class CommerceProductInfoView extends FrameLayout implements c {
    public static final SimpleDateFormat hhmmss;
    public Map<Integer, View> _$_findViewCache;
    public Integer bizType;
    public InterfaceC70593RnB couponLogListener;
    public String couponSchema;
    public int couponTagShowCount;
    public final C5H3 couponTags$delegate;
    public final C5H3 desc$delegate;
    public InterfaceC70603RnL favoriteListener;
    public OH6 freeReturnListener;
    public InterfaceC88472Yns<? super Integer, ? extends Object> getItem;
    public final C5H3 icCoupon$delegate;
    public SpannableStringBuilder imageSSB;
    public boolean isFavorite;
    public final C5H3 mShowRating$delegate;
    public final C5H3 openCouponSheet$delegate;
    public List<String> originLogos;
    public String originTitle;
    public final C5H3 primaryPrice$delegate;
    public PromotionView promotionView;
    public InterfaceC70598RnG ratingListener;
    public InterfaceC70599RnH salesInfoIconListener;
    public SkuItem selectSkuItem;
    public final C5H3 style$delegate;
    public SpannableStringBuilder titleSSB;
    public static final C70602RnK Companion = new C70602RnK();
    public static final BDDateFormat mmmDHhMmA = new BDDateFormat("lll-Y");

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommerceProductInfoView(Context context) {
        this(context, null, 0, 6, null);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommerceProductInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        hhmmss = simpleDateFormat;
    }

    private final SG4 getDesc() {
        Object value = this.desc$delegate.getValue();
        o.LJIIIIZZ(value, "<get-desc>(...)");
        return (SG4) value;
    }

    private final TuxIconView getIcCoupon() {
        Object value = this.icCoupon$delegate.getValue();
        o.LJIIIIZZ(value, "<get-icCoupon>(...)");
        return (TuxIconView) value;
    }

    private final boolean getMShowRating() {
        return ((Boolean) this.mShowRating$delegate.getValue()).booleanValue();
    }

    private final ImageView getOpenCouponSheet() {
        Object value = this.openCouponSheet$delegate.getValue();
        o.LJIIIIZZ(value, "<get-openCouponSheet>(...)");
        return (ImageView) value;
    }

    public final C119774mz getCouponTags() {
        Object value = this.couponTags$delegate.getValue();
        o.LJIIIIZZ(value, "<get-couponTags>(...)");
        return (C119774mz) value;
    }

    public final TuxTextView getPrimaryPrice() {
        Object value = this.primaryPrice$delegate.getValue();
        o.LJIIIIZZ(value, "<get-primaryPrice>(...)");
        return (TuxTextView) value;
    }

    public final IProductInfoStyle getStyle() {
        return (IProductInfoStyle) this.style$delegate.getValue();
    }

    public final View getFavoriteBtn() {
        return _$_findCachedViewById(R.id.d5c);
    }

    public final int getTitleLines() {
        return getDesc().getMaxLines();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final InterfaceC88472Yns<Integer, Object> getGetItem() {
        return this.getItem;
    }

    private final SpannableStringBuilder bindDeductionText(DeductibleVoucherReminder deductibleVoucherReminder) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SpannableStringBuilder buildTitleSSB = buildTitleSSB(context, deductibleVoucherReminder.title);
        if (buildTitleSSB != null) {
            spannableStringBuilder.append((CharSequence) buildTitleSSB);
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        SpannableStringBuilder buildImageSSB = buildImageSSB(context2);
        spannableStringBuilder.append((CharSequence) deductibleVoucherReminder.spuDeductionText);
        spannableStringBuilder.append((CharSequence) buildImageSSB);
        return spannableStringBuilder;
    }

    private final SpannableStringBuilder buildImageSSB(Context context) {
        SpannableStringBuilder spannableStringBuilder = this.imageSSB;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
        SY9 sy9 = new SY9(context, R.raw.icon_chevron_right_offset_fill_ltr);
        sy9.setBounds(C7MY.LIZIZ(-1), C7MY.LIZIZ(0), C7MY.LIZIZ(9), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
        sy9.LJFF(R.attr.eb, context);
        spannableStringBuilder2.setSpan(new ImageSpan(sy9, 1), 0, spannableStringBuilder2.length(), 18);
        this.imageSSB = spannableStringBuilder2;
        return spannableStringBuilder2;
    }

    private final SpannableStringBuilder buildPriceSSB(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if ('0' <= charAt && charAt < ':') {
                    break;
                }
                i++;
            } else {
                i = 0;
                break;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (i == 0) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, i, 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C7MY.LIZIZ(17)), 0, i, 17);
        return spannableStringBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> getLogoImages(X.C69687RWp r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle r0 = r6.getStyle()
            boolean r0 = r0.getUseProductLogos()
            r3 = 0
            r2 = 0
            if (r0 == 0) goto L53
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo> r0 = r7.LJIILL
            if (r0 == 0) goto L80
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r0.iterator()
        L19:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo) r4
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = X.AnonymousClass636.LJIILJJIL(r1)
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r4.darkModeImage
            if (r0 == 0) goto L19
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L19
        L3e:
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r3, r0)
            if (r0 == 0) goto L19
            r2.add(r0)
            goto L19
        L48:
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r4.image
            if (r0 == 0) goto L19
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L19
            goto L3e
        L53:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo> r0 = r7.LJIILJJIL
            if (r0 == 0) goto L80
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L60:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo) r0
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.image
            if (r0 == 0) goto L60
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L60
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r3, r0)
            if (r0 == 0) goto L60
            r2.add(r0)
            goto L60
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView.getLogoImages(X.RWp):java.util.List");
    }

    private final boolean isPickTagShow(PickTag pickTag) {
        String str;
        if (pickTag == null || (str = pickTag.name) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    private final boolean populateChannelRestrict(C69687RWp c69687RWp) {
        Image image;
        String str;
        if (isPickTagShow(c69687RWp.LJIIL) && !c69687RWp.LJJIIZI) {
            _$_findCachedViewById(R.id.b9n).setVisibility(0);
            PickTag pickTag = c69687RWp.LJIIL;
            String str2 = null;
            if (pickTag != null) {
                image = pickTag.icon;
            } else {
                image = null;
            }
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJJIIJZLJL = (ImageView) _$_findCachedViewById(R.id.b9o);
            L9G.LIZ(LIZLLL);
            PickTag pickTag2 = c69687RWp.LJIIL;
            if (pickTag2 != null && (str = pickTag2.name) != null && str.length() != 0) {
                TextView textView = (TextView) _$_findCachedViewById(R.id.b9p);
                PickTag pickTag3 = c69687RWp.LJIIL;
                if (pickTag3 != null) {
                    str2 = pickTag3.name;
                }
                textView.setText(str2);
            }
        } else {
            _$_findCachedViewById(R.id.b9n).setVisibility(8);
        }
        if (_$_findCachedViewById(R.id.b9n).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private final void populatePurchaseNotice(C69687RWp c69687RWp) {
        PurchaseNotice purchaseNotice = c69687RWp.LJIIZILJ;
        if (purchaseNotice == null) {
            return;
        }
        _$_findCachedViewById(R.id.ig6).setVisibility(0);
        ((TextView) _$_findCachedViewById(R.id.ig6)).setText(c69687RWp.LJIIZILJ.desc);
        ((ImageView) _$_findCachedViewById(R.id.ig7)).setVisibility(0);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ig7);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.post(new ARunnableS48S0100000_12(this, 31));
        }
        View purchase_notice_icon = _$_findCachedViewById(R.id.ig7);
        o.LJIIIIZZ(purchase_notice_icon, "purchase_notice_icon");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, purchaseNotice, 21, 42), purchase_notice_icon);
    }

    private final void setFavorite(boolean z) {
        int i;
        this.isFavorite = z;
        C2068389v c2068389v = new C2068389v();
        if (z) {
            i = R.raw.icon_3pt_bookmark_fill;
        } else {
            i = R.raw.icon_3pt_bookmark;
        }
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        ((TuxIconView) _$_findCachedViewById(R.id.d5c)).setTuxIcon(c2068389v);
    }

    private final void showCouponExplainText(C69687RWp c69687RWp) {
        EnumC70499Rlf enumC70499Rlf = c69687RWp.LJJI;
        if (enumC70499Rlf == EnumC70499Rlf.PDP) {
            View pdp_coupon_explain = _$_findCachedViewById(R.id.hke);
            o.LJIIIIZZ(pdp_coupon_explain, "pdp_coupon_explain");
            C26338AVi.LJI(pdp_coupon_explain, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), AnonymousClass391.LIZJ(5), C1FJ.LIZIZ(9), C1FJ.LIZIZ(13), false, 16);
        } else if (enumC70499Rlf == EnumC70499Rlf.WAISTPDP) {
            View pdp_coupon_explain2 = _$_findCachedViewById(R.id.hke);
            o.LJIIIIZZ(pdp_coupon_explain2, "pdp_coupon_explain");
            C26338AVi.LJI(pdp_coupon_explain2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), AnonymousClass391.LIZJ(12), C1FJ.LIZIZ(9), C1FJ.LIZIZ(13), false, 16);
        }
        DeductibleVoucherReminder deductibleVoucherReminder = c69687RWp.LJJIFFI;
        if (deductibleVoucherReminder != null && deductibleVoucherReminder.title != null) {
            ((TextView) _$_findCachedViewById(R.id.hkh)).setLineSpacing(C32151Nz.LJIIZILJ(2), 1.0f);
            ((TextView) _$_findCachedViewById(R.id.hkh)).setText(bindDeductionText(c69687RWp.LJJIFFI));
        }
        InterfaceC70593RnB interfaceC70593RnB = this.couponLogListener;
        if (interfaceC70593RnB != null) {
            interfaceC70593RnB.LIZJ(_$_findCachedViewById(R.id.hke));
        }
        View pdp_coupon_explain3 = _$_findCachedViewById(R.id.hke);
        o.LJIIIIZZ(pdp_coupon_explain3, "pdp_coupon_explain");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, c69687RWp, 22, 42), pdp_coupon_explain3);
    }

    private final CharSequence showDiscount(C69687RWp c69687RWp) {
        SkuPrice skuPrice;
        String str;
        SkuItem skuItem = this.selectSkuItem;
        if (skuItem != null && (skuPrice = skuItem.price) != null && (str = skuPrice.discount) != null) {
            return str;
        }
        return c69687RWp.LJI;
    }

    private final CharSequence showMarketPrice(C69687RWp c69687RWp) {
        String str;
        SkuPrice skuPrice;
        SkuItem skuItem = this.selectSkuItem;
        if (skuItem == null || (skuPrice = skuItem.price) == null || (str = skuPrice.originalPrice) == null) {
            str = c69687RWp.LIZJ;
        }
        if (ujb.o.LJJJJJL(str)) {
            return "";
        }
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZLLL(str);
        return c116724i4.LIZ;
    }

    private final void showPrice(C69687RWp c69687RWp) {
        boolean z;
        C018905p c018905p;
        Boolean bool;
        C45804HyK.LJJLIIIJ(getStyle().getPriceMarginTop(), getPrimaryPrice());
        int i = 8;
        if (!c69687RWp.LJIJJ) {
            getIcCoupon().setVisibility(8);
            getPrimaryPrice().setVisibility(8);
            View discount_horizontal = _$_findCachedViewById(R.id.caq);
            o.LJIIIIZZ(discount_horizontal, "discount_horizontal");
            discount_horizontal.setVisibility(8);
            View market_price_horizontal = _$_findCachedViewById(R.id.gec);
            o.LJIIIIZZ(market_price_horizontal, "market_price_horizontal");
            market_price_horizontal.setVisibility(8);
            return;
        }
        SkuItem skuItem = this.selectSkuItem;
        if (skuItem != null && (bool = skuItem.needIcon) != null) {
            z = bool.booleanValue();
        } else {
            z = c69687RWp.LJII;
        }
        TuxIconView icCoupon = getIcCoupon();
        if (z) {
            i = 0;
        }
        icCoupon.setVisibility(i);
        TuxIconView icCoupon2 = getIcCoupon();
        int i2 = R.attr.eb;
        icCoupon2.setTintColorRes(R.attr.eb);
        if (this.selectSkuItem == null && c69687RWp.LJIILIIL) {
            showPrice$setIcCouponSize(this, getIcCoupon(), AnonymousClass391.LIZ(16.0d));
        } else {
            showPrice$setIcCouponSize(this, getIcCoupon(), AnonymousClass391.LIZ(20.0d));
        }
        CharSequence showPrimaryPrice = showPrimaryPrice(c69687RWp);
        if (getStyle().getUsePriceSSB()) {
            OUP.LJJLIIIJILLIZJL(getPrimaryPrice(), buildPriceSSB(showPrimaryPrice));
        } else {
            OUP.LJJLIIIJILLIZJL(getPrimaryPrice(), showPrimaryPrice);
        }
        TuxTextView primaryPrice = getPrimaryPrice();
        if (!z) {
            i2 = R.attr.go;
        }
        primaryPrice.setTextColorRes(i2);
        if (this.selectSkuItem == null && c69687RWp.LJIILIIL) {
            getPrimaryPrice().setTuxFont(getStyle().getIntervalPriceFont());
        } else {
            getPrimaryPrice().setTuxFont(getStyle().getNormalPriceFont());
        }
        ((TextView) _$_findCachedViewById(R.id.gec)).getPaint().setFlags(16);
        ((TextView) _$_findCachedViewById(R.id.gec)).getPaint().setAntiAlias(true);
        TextView market_price_horizontal2 = (TextView) _$_findCachedViewById(R.id.gec);
        o.LJIIIIZZ(market_price_horizontal2, "market_price_horizontal");
        OUP.LJJLIIIJILLIZJL(market_price_horizontal2, showMarketPrice(c69687RWp));
        ((TuxTextView) _$_findCachedViewById(R.id.gec)).setTuxFont(getStyle().getMarketPriceFont());
        TextView discount_horizontal2 = (TextView) _$_findCachedViewById(R.id.caq);
        o.LJIIIIZZ(discount_horizontal2, "discount_horizontal");
        OUP.LJJLIIIJILLIZJL(discount_horizontal2, showDiscount(c69687RWp));
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.gec).getLayoutParams();
        if (layoutParams instanceof C018905p) {
            c018905p = (C018905p) layoutParams;
            if (c018905p != null) {
                int marketPriceLayout = getStyle().getMarketPriceLayout();
                IProductInfoStyle.Companion.getClass();
                if (marketPriceLayout == 0 && c69687RWp.LJIILIIL) {
                    c018905p.bottomToBottom = -1;
                    c018905p.topToTop = -1;
                    c018905p.startToEnd = -1;
                    c018905p.startToStart = R.id.i4d;
                    c018905p.topToBottom = R.id.i4d;
                    c018905p.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                } else {
                    c018905p.bottomToBottom = R.id.i4d;
                    c018905p.startToEnd = R.id.i4d;
                    c018905p.startToStart = -1;
                    c018905p.topToBottom = -1;
                    c018905p.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                    getPrimaryPrice().post(new ARunnableS48S0100000_12(this, 32));
                }
            }
        } else {
            c018905p = null;
        }
        _$_findCachedViewById(R.id.gec).setLayoutParams(c018905p);
    }

    private final CharSequence showPrimaryPrice(C69687RWp c69687RWp) {
        String str;
        Price price;
        SkuItem skuItem = this.selectSkuItem;
        if (skuItem != null) {
            SkuPrice skuPrice = skuItem.price;
            if (skuPrice == null || (price = skuPrice.realPrice) == null || (str = price.getPriceStr()) == null) {
                str = "";
            }
        } else {
            str = c69687RWp.LIZIZ;
        }
        if (str.length() == 0) {
            return "--";
        }
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZLLL(str);
        return c116724i4.LIZ;
    }

    public final void setBizType(Integer num) {
        this.bizType = num;
    }

    public final void setCouponLogListener(InterfaceC70593RnB couponLogListener) {
        o.LJIIIZ(couponLogListener, "couponLogListener");
        this.couponLogListener = couponLogListener;
    }

    public final void setFavoriteListener(InterfaceC70603RnL favoriteListener) {
        o.LJIIIZ(favoriteListener, "favoriteListener");
        this.favoriteListener = favoriteListener;
    }

    public final void setFreeReturnLogListener(OH6 freeReturnListener) {
        o.LJIIIZ(freeReturnListener, "freeReturnListener");
        this.freeReturnListener = freeReturnListener;
    }

    public final void setGetItem(InterfaceC88472Yns<? super Integer, ? extends Object> interfaceC88472Yns) {
        this.getItem = interfaceC88472Yns;
    }

    public final void setRatingListener(InterfaceC70598RnG ratingListener) {
        o.LJIIIZ(ratingListener, "ratingListener");
        this.ratingListener = ratingListener;
    }

    public final void setSalesInfoIconListener(InterfaceC70599RnH salesInfoIconListener) {
        o.LJIIIZ(salesInfoIconListener, "salesInfoIconListener");
        this.salesInfoIconListener = salesInfoIconListener;
    }

    public final void updateTitleLines(int i) {
        SG4 desc = getDesc();
        if (getStyle().getUseExpandTitle() && i != Integer.MAX_VALUE) {
            i++;
        }
        desc.setMaxLines(i);
    }

    private final SpannableStringBuilder buildTitleSSB(Context context, String str) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder = this.titleSSB;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        C70649Ro5 c70649Ro5 = new C70649Ro5(context, null, 6);
        c70649Ro5.setLayoutParams(new ViewGroup.LayoutParams(-2, C7MY.LIZIZ(17)));
        C27171AlT block = C27171AlT.LJLIL;
        o.LJIIIZ(block, "block");
        block.invoke(c70649Ro5);
        c70649Ro5.setTagUi(new RUP(null, new RUH(12, null, null, null, 14), new RUH(6, str, null, null, 12)));
        SJX sjx = new SJX(c70649Ro5);
        sjx.LJLILLLLZI = C7MY.LIZIZ(4);
        spannableStringBuilder2.setSpan(sjx, 0, spannableStringBuilder2.length(), 33);
        this.titleSSB = spannableStringBuilder2;
        return spannableStringBuilder2;
    }

    private final SpannableStringBuilder flashDeductionText(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.titleSSB == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            buildTitleSSB(context, str2);
        }
        SpannableStringBuilder spannableStringBuilder2 = this.titleSSB;
        if (spannableStringBuilder2 != null) {
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        spannableStringBuilder.append((CharSequence) str);
        if (this.imageSSB == null) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            buildImageSSB(context2);
        }
        SpannableStringBuilder spannableStringBuilder3 = this.imageSSB;
        if (spannableStringBuilder3 != null) {
            spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
        }
        return spannableStringBuilder;
    }

    private final void populateCouponTags(boolean z, C69687RWp c69687RWp) {
        PromotionView promotionView;
        List<PromotionItem> list;
        if (z) {
            getCouponTags().setVisibility(0);
            getOpenCouponSheet().setVisibility(0);
        } else {
            getCouponTags().setVisibility(8);
            getOpenCouponSheet().setVisibility(8);
        }
        if (c69687RWp.LJIL && (promotionView = c69687RWp.LJIILLIIL) != null && (list = promotionView.promotion_items) != null) {
            C70648Ro4.LIZ(getCouponTags(), list, EnumC70206Rgw.PDP, null, 0, 60);
        }
        this.promotionView = c69687RWp.LJIILLIIL;
        this.couponSchema = c69687RWp.LJJIIJ;
        if (z) {
            this.couponTagShowCount = 0;
            getCouponTags().post(new ARunnableS48S0100000_12(this, 30));
        }
    }

    public final void updateCountDown(FlashSale flashSale, long j) {
        int i;
        T5R t5r;
        Long LJJIZ;
        Long LJJIZ2;
        o.LJIIIZ(flashSale, "flashSale");
        long j2 = j + 999;
        StringBuilder LIZ = X1D.LIZ();
        String str = flashSale.title;
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(' ');
        T5R t5r2 = new T5R(JBR.LJFF(LIZ, flashSale.price, " · ", LIZ));
        t5r2.LIZ(62);
        if (j2 >= 86400000) {
            i = R.string.f_2;
        } else {
            i = R.string.f_1;
        }
        if (j2 >= 86400000) {
            Integer num = flashSale.status;
            long j3 = 0;
            if (num == null || num.intValue() != 1) {
                String str2 = flashSale.endTime;
                if (str2 != null && (LJJIZ2 = C38350F3i.LJJIZ(str2)) != null) {
                    j3 = 1000 * LJJIZ2.longValue();
                }
                t5r = new T5R(getContext().getString(i, BDDateFormat.LIZJ(mmmDHhMmA, j3)));
            } else {
                String str3 = flashSale.startTime;
                if (str3 != null && (LJJIZ = C38350F3i.LJJIZ(str3)) != null) {
                    j3 = 1000 * LJJIZ.longValue();
                }
                t5r = new T5R(getContext().getString(i, BDDateFormat.LIZJ(mmmDHhMmA, j3)));
            }
        } else {
            t5r = new T5R(getContext().getString(i, hhmmss.format(Long.valueOf(j2))));
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.di_);
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) t5r2);
        t5r.LIZ(61);
        textView.setText(append.append((CharSequence) t5r));
    }

    public final void updatePriceInfoView(C69687RWp item, SkuItem skuItem) {
        String str;
        o.LJIIIZ(item, "item");
        this.selectSkuItem = skuItem;
        String str2 = null;
        if (skuItem == null || (str = skuItem.deductionText) == null) {
            DeductibleVoucherReminder deductibleVoucherReminder = item.LJJIFFI;
            if (deductibleVoucherReminder != null) {
                str = deductibleVoucherReminder.spuDeductionText;
            } else {
                str = null;
            }
        }
        showPrice(item);
        if (str == null || str.length() == 0) {
            _$_findCachedViewById(R.id.hke).setVisibility(8);
            return;
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.hkh);
        DeductibleVoucherReminder deductibleVoucherReminder2 = item.LJJIFFI;
        if (deductibleVoucherReminder2 != null) {
            str2 = deductibleVoucherReminder2.title;
        }
        textView.setText(flashDeductionText(str, str2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommerceProductInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.desc$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 521));
        this.primaryPrice$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 524));
        this.icCoupon$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 522));
        this.openCouponSheet$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 523));
        this.couponTags$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 520));
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 525));
        this.mShowRating$delegate = C221108m2.LIZIZ(C70590Rn8.LJLIL);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a3l, this, true);
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 24, 42), getOpenCouponSheet());
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 25, 42), getCouponTags());
    }

    private final void populateFlashSaleMsg(C69687RWp c69687RWp, boolean z, FlashSale flashSale) {
        boolean z2;
        Integer num;
        Integer num2;
        View flash_sale_container_with_coupon = _$_findCachedViewById(R.id.di7);
        o.LJIIIIZZ(flash_sale_container_with_coupon, "flash_sale_container_with_coupon");
        int i = 0;
        if (flashSale == null || (num2 = flashSale.status) == null || num2.intValue() != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            i = 8;
        }
        flash_sale_container_with_coupon.setVisibility(i);
        if (z || ((flashSale != null && (num = flashSale.flashSaleStyle) != null && num.intValue() == 2) || c69687RWp.LJIJI == 1)) {
            _$_findCachedViewById(R.id.di7).setVisibility(8);
        }
    }

    public static final void showPrice$setIcCouponSize(CommerceProductInfoView commerceProductInfoView, TuxIconView tuxIconView, int i) {
        if (commerceProductInfoView.getVisibility() == 0 && tuxIconView != null) {
            if (tuxIconView.getWidth() != i || tuxIconView.getHeight() != i) {
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = i;
            }
        }
    }

    public final void bind(C69687RWp item, int i, int i2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        Object obj;
        int i6;
        int i7;
        Image image;
        Image image2;
        float f;
        String str;
        boolean z4;
        Float f2;
        List<PromotionItem> list;
        o.LJIIIZ(item, "item");
        SkuItem skuItem = item.LJJIJ;
        if (skuItem != null) {
            this.selectSkuItem = skuItem;
        }
        PromotionView promotionView = item.LJIILLIIL;
        if (promotionView != null && (list = promotionView.promotion_items) != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        boolean z5 = true;
        if (i3 > 0 && item.LJIL) {
            z = true;
        } else {
            z = false;
        }
        showPrice(item);
        EnumC70499Rlf enumC70499Rlf = EnumC70499Rlf.PDP;
        EnumC70499Rlf enumC70499Rlf2 = EnumC70499Rlf.WAISTPDP;
        EnumC70499Rlf enumC70499Rlf3 = item.LJJI;
        if (enumC70499Rlf3.compareTo(enumC70499Rlf) >= 0 && enumC70499Rlf3.compareTo(enumC70499Rlf2) <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            _$_findCachedViewById(R.id.hke).setVisibility(0);
            showCouponExplainText(item);
        } else {
            _$_findCachedViewById(R.id.hke).setVisibility(8);
        }
        View discount_limit = _$_findCachedViewById(R.id.car);
        o.LJIIIIZZ(discount_limit, "discount_limit");
        if (C78685UuP.LJJJZ(item.LJ)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        discount_limit.setVisibility(i4);
        String str2 = item.LJ;
        if (str2 != null) {
            ((TextView) _$_findCachedViewById(R.id.car)).setText(str2);
        }
        populatePurchaseNotice(item);
        populateFlashSaleMsg(item, populateChannelRestrict(item), item.LJIIJJI);
        populateCouponTags(z, item);
        ((C70589Rn7) _$_findCachedViewById(R.id.d2o)).setSalesInfoIconListener(this.salesInfoIconListener);
        ((C70589Rn7) _$_findCachedViewById(R.id.d2o)).setSales(item.LJFF);
        if (getMShowRating()) {
            ((C70589Rn7) _$_findCachedViewById(R.id.d2o)).setRatingListener(this.ratingListener);
            C70589Rn7 c70589Rn7 = (C70589Rn7) _$_findCachedViewById(R.id.d2o);
            ProductDetailReview productDetailReview = item.LJIIIZ;
            if (productDetailReview != null && (f2 = productDetailReview.rating) != null) {
                f = f2.floatValue();
            } else {
                f = 0.0f;
            }
            ProductDetailReview productDetailReview2 = item.LJIIIZ;
            if (productDetailReview2 == null || (str = productDetailReview2.reviewCountStr) == null) {
                str = "";
            }
            c70589Rn7.getClass();
            if (f == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                ((ImageView) c70589Rn7.LIZ(R.id.kbs)).setVisibility(8);
                c70589Rn7.LIZ(R.id.cdj).setVisibility(8);
                c70589Rn7.LIZ(R.id.ink).setVisibility(8);
                c70589Rn7.LIZ(R.id.j0i).setVisibility(8);
            } else {
                ((ImageView) c70589Rn7.LIZ(R.id.kbs)).setVisibility(0);
                if (c70589Rn7.LIZ(R.id.ja7).getVisibility() == 0) {
                    c70589Rn7.LIZ(R.id.cdj).setVisibility(0);
                }
                c70589Rn7.LIZ(R.id.ink).setVisibility(0);
                ((C26516Aau) c70589Rn7.LIZ(R.id.ink)).getScore().setText(String.valueOf(f));
                C70600RnI.LIZ.getClass();
                FFL.LJIIIZ().getClass();
                if (FFL.LJ(31744, "ecom_pdp_display_review_quantity", true, false) == C70600RnI.LIZIZ) {
                    c70589Rn7.LIZ(R.id.j0i).setVisibility(0);
                    TextView textView = (TextView) c70589Rn7.LIZ(R.id.j0i);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('(');
                    LIZ.append(str);
                    LIZ.append(')');
                    textView.setText(X1D.LIZIZ(LIZ));
                    View review_count = c70589Rn7.LIZ(R.id.j0i);
                    o.LJIIIIZZ(review_count, "review_count");
                    C16880lQ.LJIIJ(new Au2S20S0100000_12(c70589Rn7, 94, 42), review_count);
                } else {
                    c70589Rn7.LIZ(R.id.j0i).setVisibility(8);
                }
                View star = c70589Rn7.LIZ(R.id.kbs);
                o.LJIIIIZZ(star, "star");
                C16880lQ.LJIIJ(new Au2S20S0100000_12(c70589Rn7, 95, 42), star);
                View rating_number = c70589Rn7.LIZ(R.id.ink);
                o.LJIIIIZZ(rating_number, "rating_number");
                C16880lQ.LJIIJ(new Au2S20S0100000_12(c70589Rn7, 96, 42), rating_number);
                InterfaceC70598RnG interfaceC70598RnG = c70589Rn7.LJLIL;
                if (interfaceC70598RnG != null) {
                    interfaceC70598RnG.LIZIZ();
                }
            }
            c70589Rn7.LIZIZ();
        }
        ((C70589Rn7) _$_findCachedViewById(R.id.d2o)).setGlobalShipping(item.LJJIJIIJI);
        if (item.LJJIII) {
            z3 = false;
        } else {
            z3 = item.LJIIJ;
        }
        View extras_info = _$_findCachedViewById(R.id.d2p);
        o.LJIIIIZZ(extras_info, "extras_info");
        View extras = _$_findCachedViewById(R.id.d2o);
        o.LJIIIIZZ(extras, "extras");
        if (extras.getVisibility() == 0 || z3 || item.LJJIIZ != null || item.LJJIJIIJI != null) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        extras_info.setVisibility(i5);
        InterfaceC88472Yns<? super Integer, ? extends Object> interfaceC88472Yns = this.getItem;
        C62562cu c62562cu = null;
        if (interfaceC88472Yns != null) {
            obj = interfaceC88472Yns.invoke(Integer.valueOf(i2 + 1));
        } else {
            obj = null;
        }
        if (obj instanceof RankInfo) {
            C26338AVi.LJIIIZ(this, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 23);
        } else if (obj instanceof RX8) {
            C26338AVi.LJIIIZ(this, null, null, null, 0, 23);
        } else {
            C26338AVi.LJIIIZ(this, null, null, null, Integer.valueOf(getStyle().getPricePaddingBottom()), 23);
        }
        View extras2 = _$_findCachedViewById(R.id.d2o);
        o.LJIIIIZZ(extras2, "extras");
        if (extras2.getVisibility() != 0) {
            z5 = false;
        }
        if (z5) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.dnl).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p = (C018905p) layoutParams;
            c018905p.startToStart = -1;
            c018905p.endToEnd = 0;
            _$_findCachedViewById(R.id.dnl).setLayoutParams(c018905p);
            View free_shipping_tag = _$_findCachedViewById(R.id.dnl);
            o.LJIIIIZZ(free_shipping_tag, "free_shipping_tag");
            C26338AVi.LJI(free_shipping_tag, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, null, false, 30);
            View free_shipping_tag2 = _$_findCachedViewById(R.id.dnl);
            o.LJIIIIZZ(free_shipping_tag2, "free_shipping_tag");
            C26338AVi.LJIIIZ(free_shipping_tag2, null, 0, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), 21);
            _$_findCachedViewById(R.id.dnl).setBackground(null);
        } else {
            ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.dnl).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p2 = (C018905p) layoutParams2;
            c018905p2.endToEnd = -1;
            c018905p2.startToStart = 0;
            _$_findCachedViewById(R.id.dnl).setLayoutParams(c018905p2);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.dnl);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            _$_findCachedViewById.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.h4, context));
            _$_findCachedViewById(R.id.dnl).getBackground().setAlpha(10);
            View free_shipping_tag3 = _$_findCachedViewById(R.id.dnl);
            o.LJIIIIZZ(free_shipping_tag3, "free_shipping_tag");
            C26338AVi.LJIIIZ(free_shipping_tag3, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 21);
            View findViewById = _$_findCachedViewById(R.id.dnl).findViewById(R.id.dnk);
            o.LJIIIIZZ(findViewById, "free_shipping_tag.free_shipping_icon");
            C26338AVi.LJI(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, null, null, false, 30);
        }
        View free_shipping_tag4 = _$_findCachedViewById(R.id.dnl);
        o.LJIIIIZZ(free_shipping_tag4, "free_shipping_tag");
        if (z3) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        free_shipping_tag4.setVisibility(i6);
        if (C27160AlI.LIZ()) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.ha, context2);
            ((TuxIconView) _$_findCachedViewById(R.id.dnk)).setTintColor(LJIIIIZZ);
            ((TextView) _$_findCachedViewById(R.id.dnn)).setTextColor(LJIIIIZZ);
        }
        if (o.LJ(item.LJIJ, Boolean.TRUE)) {
            _$_findCachedViewById(R.id.d2o).setVisibility(8);
            _$_findCachedViewById(R.id.dnl).setVisibility(8);
            _$_findCachedViewById(R.id.dnm).setVisibility(0);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.dnm);
            IProductInfoStyle style = getStyle();
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            _$_findCachedViewById2.setBackground(style.freeShippingTagSkeletonBg(context3));
            getCouponTags().setVisibility(8);
            getOpenCouponSheet().setVisibility(8);
            View free_shipping_tag_skeleton = _$_findCachedViewById(R.id.dnm);
            o.LJIIIIZZ(free_shipping_tag_skeleton, "free_shipping_tag_skeleton");
            C26338AVi.LJI(free_shipping_tag_skeleton, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(9))), null, null, false, 29);
            C26338AVi.LJI(getDesc(), null, null, null, AnonymousClass391.LIZJ(0), false, 23);
        } else {
            _$_findCachedViewById(R.id.dnm).setVisibility(8);
            View free_shipping_tag_skeleton2 = _$_findCachedViewById(R.id.dnm);
            o.LJIIIIZZ(free_shipping_tag_skeleton2, "free_shipping_tag_skeleton");
            C26338AVi.LJI(free_shipping_tag_skeleton2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, false, 29);
            C26338AVi.LJIIIZ(getDesc(), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, 29);
        }
        if (z3) {
            ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById(R.id.d2o).getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p3 = (C018905p) layoutParams3;
            c018905p3.endToStart = R.id.dnl;
            _$_findCachedViewById(R.id.d2o).setLayoutParams(c018905p3);
        } else if (item.LJJIIZ != null) {
            ViewGroup.LayoutParams layoutParams4 = _$_findCachedViewById(R.id.d2o).getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p4 = (C018905p) layoutParams4;
            c018905p4.endToStart = R.id.dng;
            _$_findCachedViewById(R.id.d2o).setLayoutParams(c018905p4);
        }
        getDesc().setTuxFont(getStyle().getGoodDescFont());
        UserRightTag userRightTag = item.LJJIIZ;
        if (userRightTag != null) {
            View free_return = _$_findCachedViewById(R.id.dng);
            o.LJIIIIZZ(free_return, "free_return");
            free_return.setVisibility(0);
            OH6 oh6 = this.freeReturnListener;
            if (oh6 != null) {
                oh6.LIZIZ();
            }
            ((TextView) _$_findCachedViewById(R.id.dni)).setText(userRightTag.title);
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            if (AnonymousClass636.LJIILJJIL(context4)) {
                Icon icon = userRightTag.icon;
                if (icon != null && (image2 = icon.iconDark) != null) {
                    c62562cu = image2.toImageUrlModel();
                }
                W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
                LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.dnh);
                L9G.LIZ(LIZLLL);
            } else {
                Icon icon2 = userRightTag.icon;
                if (icon2 != null && (image = icon2.icon) != null) {
                    c62562cu = image.toImageUrlModel();
                }
                W5F LIZLLL2 = C70759Rpr.LIZLLL(c62562cu);
                LIZLLL2.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.dnh);
                L9G.LIZ(LIZLLL2);
            }
            if (userRightTag.schema != null) {
                View free_return2 = _$_findCachedViewById(R.id.dng);
                o.LJIIIIZZ(free_return2, "free_return");
                C16880lQ.LJIIJ(new Au2S18S0200000_10(this, userRightTag, 0), free_return2);
            }
        }
        getDesc().setNeedExpandDesc(getStyle().getUseExpandTitle());
        getDesc().setTuxFont(getStyle().getGoodDescFont());
        List<String> logoImages = getLogoImages(item);
        if (!o.LJ(this.originTitle, item.LIZ) || !o.LJ(this.originLogos, logoImages)) {
            SG4 desc = getDesc();
            if (getStyle().getUseExpandTitle() && i != Integer.MAX_VALUE) {
                i7 = i + 1;
            } else {
                i7 = i;
            }
            desc.setMaxLines(i7);
            SG4.LJJJJJ(getDesc(), item.LIZ, getLogoImages(item), getStyle().getLogosHeight(), i, 16);
            this.originLogos = logoImages;
            this.originTitle = item.LIZ;
        }
        String str3 = item.LJJIJIIJIL;
        if (str3 != null && item.LJJ) {
            View price_zone = _$_findCachedViewById(R.id.i48);
            o.LJIIIIZZ(price_zone, "price_zone");
            C16880lQ.LJIIJ(new Au2S1S1100000_12(this, str3, 1), price_zone);
        }
        if (item.LJJII == null || !getStyle().getShowFavoriteBtn()) {
            View favorite_icon = _$_findCachedViewById(R.id.d5c);
            o.LJIIIIZZ(favorite_icon, "favorite_icon");
            OUP.LJIJJLI(favorite_icon);
            return;
        }
        View favorite_icon2 = _$_findCachedViewById(R.id.d5c);
        o.LJIIIIZZ(favorite_icon2, "favorite_icon");
        OUP.LJJLIIIJ(favorite_icon2);
        setFavorite(item.LJJII.booleanValue());
        View favorite_icon3 = _$_findCachedViewById(R.id.d5c);
        o.LJIIIIZZ(favorite_icon3, "favorite_icon");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 23, 42), favorite_icon3);
        _$_findCachedViewById(R.id.d5c).post(new ARunnableS48S0100000_12(this, 28));
    }

    public /* synthetic */ CommerceProductInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(CommerceProductInfoView commerceProductInfoView, C69687RWp c69687RWp, int i, int i2, InterfaceC65784Pro interfaceC65784Pro, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            interfaceC65784Pro = null;
        }
        commerceProductInfoView.bind(c69687RWp, i, i2, interfaceC65784Pro);
    }
}
