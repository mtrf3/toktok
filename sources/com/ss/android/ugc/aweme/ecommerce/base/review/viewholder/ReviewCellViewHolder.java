package com.ss.android.ugc.aweme.ecommerce.base.review.viewholder;

import X.AbstractC70683Rod;
import X.AbstractC70686Rog;
import X.AbstractC70861RrV;
import X.AnonymousClass636;
import X.C00F;
import X.C024607u;
import X.C119774mz;
import X.C16880lQ;
import X.C1FL;
import X.C2068389v;
import X.C221108m2;
import X.C26508Aam;
import X.C26515Aat;
import X.C26777Af7;
import X.C27162AlK;
import X.C27739Aud;
import X.C32151Nz;
import X.C32I;
import X.C44878HjO;
import X.C45804HyK;
import X.C47135Ieh;
import X.C53571L0t;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70671RoR;
import X.C70673RoT;
import X.C70677RoX;
import X.C70678RoY;
import X.C70679RoZ;
import X.C70682Roc;
import X.C70691Rol;
import X.C70759Rpr;
import X.C70913RsL;
import X.C78857UxB;
import X.C78946Uyc;
import X.C78977Uz7;
import X.C7MY;
import X.EnumC72807Shn;
import X.O6R;
import X.ORZ;
import X.W5F;
import Y.ARunnableS23S0300000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.IReviewInnerPageCellStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewProductCard;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS34S1300000_12;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewCellViewHolder extends ECJediViewHolder {
    public static final int LJLLILLLL = C47135Ieh.LIZ(76, C27162AlK.LIZ);
    public final FragmentManager LJLIL;
    public final HashMap<String, Object> LJLILLLLZI;
    public final boolean LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public View LJLJJLL;
    public final C62822Ol8 LJLJL;
    public C70677RoX LJLJLJ;
    public final int LJLJLLL;
    public final C62822Ol8 LJLL;
    public final Map<Integer, View> LJLLI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final IReviewInnerPageCellStyle P() {
        return (IReviewInnerPageCellStyle) this.LJLJJI.getValue();
    }

    public final ProductReviewViewModel Q() {
        return (ProductReviewViewModel) this.LJLJL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T() {
        C70677RoX c70677RoX;
        ReviewItemStruct reviewItemStruct;
        Boolean bool;
        ITEM item = getItem();
        if ((item instanceof C70677RoX) && (c70677RoX = (C70677RoX) item) != null && (reviewItemStruct = c70677RoX.LIZ) != null && (bool = reviewItemStruct.isOwner) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b5  */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.text.SpannableStringBuilder, T] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(X.C70677RoX r21) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolder.N(X.RoX):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        List<ReviewMedia> list;
        String string;
        List<ReviewMedia> list2;
        String str;
        String str2;
        String str3;
        AbstractC70686Rog item = (AbstractC70686Rog) obj;
        o.LJIIIZ(item, "item");
        C70677RoX c70677RoX = (C70677RoX) item;
        this.LJLJLJ = c70677RoX;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, c70677RoX.LJIIIIZZ);
        if (this.LJLJLLL == 2) {
            ShopReviewProductCard shopReviewProductCard = c70677RoX.LIZIZ;
            if (shopReviewProductCard == null || (str = shopReviewProductCard.pdpSchema) == null || str.length() == 0) {
                View findViewById = this.itemView.findViewById(R.id.i68);
                o.LJIIIIZZ(findViewById, "itemView.product_link");
                findViewById.setVisibility(8);
            } else {
                View findViewById2 = this.itemView.findViewById(R.id.i68);
                o.LJIIIIZZ(findViewById2, "itemView.product_link");
                findViewById2.setVisibility(0);
                ((TextView) this.itemView.findViewById(R.id.i68).findViewById(R.id.i6b)).setText(shopReviewProductCard.displayProductName);
                Image image = shopReviewProductCard.displayImage;
                if (image != null) {
                    W5F LIZLLL = C70759Rpr.LIZLLL(image.toImageUrlModel());
                    LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
                    LIZLLL.LJIJJLI = C70759Rpr.LIZIZ;
                    LIZLLL.LJJIIJZLJL = (ImageView) this.itemView.findViewById(R.id.i5x);
                    C16880lQ.LLJJJ(LIZLLL);
                }
                Integer num = shopReviewProductCard.displayProductType;
                if (num != null) {
                    if (num.intValue() == 1) {
                        View findViewById3 = this.itemView.findViewById(R.id.i68).findViewById(R.id.ip8);
                        o.LJIIIIZZ(findViewById3, "itemView.product_link.real_price");
                        findViewById3.setVisibility(0);
                        View findViewById4 = this.itemView.findViewById(R.id.i68).findViewById(R.id.hdr);
                        o.LJIIIIZZ(findViewById4, "itemView.product_link.original_price");
                        findViewById4.setVisibility(0);
                        View findViewById5 = this.itemView.findViewById(R.id.i68).findViewById(R.id.l5m);
                        o.LJIIIIZZ(findViewById5, "itemView.product_link.text_str");
                        findViewById5.setVisibility(8);
                        ((TextView) this.itemView.findViewById(R.id.i68).findViewById(R.id.ip8)).setText(shopReviewProductCard.displayRealPrice);
                        ((TextView) this.itemView.findViewById(R.id.i68).findViewById(R.id.hdr)).setText(shopReviewProductCard.displayOriginPrice);
                        ((TextView) this.itemView.findViewById(R.id.i68).findViewById(R.id.hdr)).setPaintFlags(16);
                    } else if (num.intValue() == 2) {
                        View findViewById6 = this.itemView.findViewById(R.id.i68).findViewById(R.id.ip8);
                        o.LJIIIIZZ(findViewById6, "itemView.product_link.real_price");
                        findViewById6.setVisibility(0);
                        View findViewById7 = this.itemView.findViewById(R.id.i68).findViewById(R.id.hdr);
                        o.LJIIIIZZ(findViewById7, "itemView.product_link.original_price");
                        findViewById7.setVisibility(8);
                        View findViewById8 = this.itemView.findViewById(R.id.i68).findViewById(R.id.l5m);
                        o.LJIIIIZZ(findViewById8, "itemView.product_link.text_str");
                        findViewById8.setVisibility(8);
                        ((TextView) this.itemView.findViewById(R.id.i68).findViewById(R.id.ip8)).setText(shopReviewProductCard.displayOriginPrice);
                    } else if (num.intValue() == 3) {
                        View findViewById9 = this.itemView.findViewById(R.id.i68).findViewById(R.id.ip8);
                        o.LJIIIIZZ(findViewById9, "itemView.product_link.real_price");
                        findViewById9.setVisibility(8);
                        View findViewById10 = this.itemView.findViewById(R.id.i68).findViewById(R.id.hdr);
                        o.LJIIIIZZ(findViewById10, "itemView.product_link.original_price");
                        findViewById10.setVisibility(8);
                        View findViewById11 = this.itemView.findViewById(R.id.i68).findViewById(R.id.l5m);
                        o.LJIIIIZZ(findViewById11, "itemView.product_link.text_str");
                        findViewById11.setVisibility(0);
                    }
                }
                C70691Rol c70691Rol = Q().LJLLILLLL;
                if (c70691Rol != null) {
                    View itemView2 = this.itemView;
                    o.LJIIIIZZ(itemView2, "itemView");
                    int i = this.latestItemPositionInternal + 1;
                    ReviewItemStruct reviewItemStruct = c70677RoX.LIZ;
                    String str4 = c70677RoX.LIZJ;
                    o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
                    Set<String> set = c70691Rol.LJFF;
                    ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
                    if (mainReview != null) {
                        str2 = mainReview.reviewId;
                    } else {
                        str2 = null;
                    }
                    if (!ORZ.LJLJJI(str2, set)) {
                        ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                        if (mainReview2 != null && (str3 = mainReview2.reviewId) != null) {
                            c70691Rol.LJFF.add(str3);
                        }
                        C78946Uyc.LJJIIJZLJL(itemView2, new C70913RsL(), new AqS162S0100000_12(reviewItemStruct, 1172), new AqS61S0201000_12(i, (int) reviewItemStruct, (ReviewItemStruct) C27739Aud.LJII(str4), (HashMap<String, Object>) 14));
                    }
                }
                View findViewById12 = this.itemView.findViewById(R.id.i68);
                o.LJIIIIZZ(findViewById12, "itemView.product_link");
                C16880lQ.LJIIJ(new Au2S11S0300000_12(this, c70677RoX, shopReviewProductCard, 23), findViewById12);
            }
        }
        N(c70677RoX);
        ReviewItemStruct.MainReview mainReview3 = c70677RoX.LIZ.review;
        if (mainReview3 != null) {
            String str5 = mainReview3.reviewId;
            ReviewItemStruct.AppendReview appendReview = mainReview3.appendReview;
            if (appendReview != null && (C78857UxB.LJJJIL(appendReview.text) || ((list2 = appendReview.media) != null && (!list2.isEmpty())))) {
                if (this.LJLJJLL == null) {
                    this.LJLJJLL = ((ViewStub) this.itemView.findViewById(R.id.j0d)).inflate();
                }
                View view = this.LJLJJLL;
                if (view != null) {
                    view.setVisibility(0);
                    view.findViewById(R.id.j1d).setVisibility(0);
                    if (appendReview.daysForPruchase != null) {
                        TextView textView = (TextView) view.findViewById(R.id.j1d);
                        if (CastIntegerProtector.parseInt(appendReview.daysForPruchase) > 0) {
                            string = view.getContext().getResources().getQuantityString(R.plurals.du, CastIntegerProtector.parseInt(appendReview.daysForPruchase), Integer.valueOf(CastIntegerProtector.parseInt(appendReview.daysForPruchase)));
                        } else {
                            string = view.getContext().getResources().getString(R.string.f5b);
                        }
                        textView.setText(string);
                    }
                    if (!C78857UxB.LJJJIL(appendReview.text) && (list = appendReview.media) != null && (!list.isEmpty())) {
                        view.findViewById(R.id.j0h).setVisibility(8);
                    } else {
                        view.findViewById(R.id.j0h).setVisibility(0);
                    }
                    if (c70677RoX.LJFF) {
                        C70682Roc c70682Roc = (C70682Roc) view.findViewById(R.id.j0h);
                        o.LJIIIIZZ(c70682Roc, "it.review_content");
                        C70682Roc.LIZJ(c70682Roc, appendReview.text, 0, false, null, 14);
                    } else {
                        C70682Roc c70682Roc2 = (C70682Roc) view.findViewById(R.id.j0h);
                        o.LJIIIIZZ(c70682Roc2, "it.review_content");
                        C70682Roc.LIZJ(c70682Roc2, appendReview.text, 4, true, null, 8);
                        ((C70682Roc) view.findViewById(R.id.j0h)).setExpandListener(new AqS34S1300000_12(this, str5, view, appendReview, 3));
                    }
                    C70682Roc c70682Roc3 = (C70682Roc) view.findViewById(R.id.j18);
                    o.LJIIIIZZ(c70682Roc3, "it.review_reply");
                    U(c70682Roc3, str5, appendReview.reply, true, c70677RoX.LJII);
                    Q().getClass();
                    ProductReviewViewModel.Nv0(appendReview.media);
                    view.post(new ARunnableS23S0300000_12(this, view, c70677RoX, 9));
                }
                LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.n0x);
                o.LJIIIIZZ(linearLayout, "itemView.user_tags");
                C78977Uz7.LJJIIJZLJL(linearLayout, c70677RoX.LIZ.tags, new AqS170S0100000_4(linearLayout, 1606), C26777Af7.LJLIL);
            }
        }
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.n0x);
        o.LJIIIIZZ(linearLayout2, "itemView.user_tags");
        C78977Uz7.LJJIIJZLJL(linearLayout2, c70677RoX.LIZ.tags, new AqS170S0100000_4(linearLayout2, 1606), C26777Af7.LJLIL);
    }

    public final void L(C119774mz c119774mz, C70677RoX c70677RoX, boolean z) {
        ReviewItemStruct.AppendReview appendReview;
        int i;
        List<ReviewMedia> list;
        Image image;
        Object obj;
        List<String> thumbUrls;
        List<String> urls;
        ReviewItemStruct.MainReview mainReview = c70677RoX.LIZ.review;
        List<ReviewMedia> list2 = null;
        if (z) {
            if (mainReview != null) {
                list2 = mainReview.media;
            }
        } else if (mainReview != null && (appendReview = mainReview.appendReview) != null) {
            list2 = appendReview.media;
        }
        c119774mz.setGravity(-1);
        if (list2 == null || list2.isEmpty()) {
            c119774mz.setVisibility(8);
            return;
        }
        c119774mz.setVisibility(0);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        for (ReviewMedia reviewMedia : list2) {
            Image image2 = reviewMedia.image;
            if ((image2 == null || (urls = image2.getUrls()) == null || (obj = ORZ.LJLLLL(urls)) == null) && ((image = reviewMedia.image) == null || (thumbUrls = image.getThumbUrls()) == null || (obj = ORZ.LJLLLL(thumbUrls)) == null)) {
                obj = "";
            }
            arrayList.add(obj);
        }
        int i2 = (LJLLILLLL - (C27162AlK.LJIIIZ * 3)) / 4;
        ReviewItemStruct.MainReview mainReview2 = c70677RoX.LIZ.review;
        if (mainReview2 != null && (list = mainReview2.media) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C78977Uz7.LJJIIJZLJL(c119774mz, list2, new AqS94S0101000_4(c119774mz, i2, 7), new C70673RoT(this, z, i, arrayList, list2));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d3 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(X.C70676RoW r32, X.C70677RoX r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolder.M(X.RoW, X.RoX, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj, int i, List list) {
        AbstractC70686Rog item = (AbstractC70686Rog) obj;
        o.LJIIIZ(item, "item");
        C70677RoX c70677RoX = (C70677RoX) item;
        this.LJLJLJ = c70677RoX;
        if (i == 0) {
            C53571L0t.LIZ.getClass();
            if (!C53571L0t.LIZ()) {
                C26515Aat.LIZ.getClass();
                if (C26515Aat.LIZ()) {
                    this.itemView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    View findViewById = this.itemView.findViewById(R.id.l8x);
                    o.LJIIIIZZ(findViewById, "itemView.tips");
                    findViewById.setVisibility(0);
                    String str = c70677RoX.LIZLLL;
                    if (str != null && !ujb.o.LJJJJJL(str)) {
                        ((TextView) this.itemView.findViewById(R.id.l9b)).setText(str);
                    }
                }
            }
            if (this.LJLJI) {
                this.itemView.setPadding(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            } else {
                this.itemView.setPadding(0, C7MY.LIZIZ(8), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            }
        } else {
            this.itemView.setPadding(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            View findViewById2 = this.itemView.findViewById(R.id.l8x);
            o.LJIIIIZZ(findViewById2, "itemView.tips");
            findViewById2.setVisibility(8);
        }
        if (list == null || list.isEmpty()) {
            super.onBind(item, i, list);
        } else {
            N(c70677RoX);
        }
        C70691Rol c70691Rol = Q().LJLLILLLL;
        if (c70691Rol != null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            c70691Rol.LJJIFFI(this.latestItemPositionInternal + 1, itemView, c70677RoX.LIZ, c70677RoX.LIZJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCellViewHolder(FragmentManager fragmentManager, ViewGroup viewGroup, int i, HashMap<String, Object> hashMap, boolean z) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a5n, viewGroup, false, "from(container.context).…w_cell, container, false)"));
        this.LJLLI = C44878HjO.LIZIZ(viewGroup, "container");
        this.LJLIL = fragmentManager;
        this.LJLILLLLZI = hashMap;
        this.LJLJI = z;
        this.LJLJJI = C221108m2.LIZIZ(C70679RoZ.LJLIL);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 474));
        this.LJLJJL = LIZIZ;
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-userInfoView>(...)");
        ((AbstractC70683Rod) value).setUiStyle(P());
        ((C70682Roc) this.itemView.findViewById(R.id.j0h)).setContentFont(P().getContentFont());
        C45804HyK.LJJLIIIJ(P().getImageMarginTop(), this.itemView.findViewById(R.id.j0z));
        C45804HyK.LJJLIIIJ(P().getImageMarginTop(), this.itemView.findViewById(R.id.j16));
        ((TuxTextView) this.itemView.findViewById(R.id.j0k)).setTuxFont(P().getDateFont());
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.gmg);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_ellipsis_horizontal;
        c2068389v.LJ = Integer.valueOf(P().getMoreIconColor());
        tuxIconView.setTuxIcon(c2068389v);
        ((TuxTextView) this.itemView.findViewById(R.id.fr4)).setTextColorRes(P().getLikeBtnColor());
        View findViewById = this.itemView.findViewById(R.id.i68);
        ((AbstractC70861RrV) C024607u.LIZ.LIZIZ(ViewDataBinding.LIZIZ(null), findViewById, R.layout.a6d)).LJIILLIIL(P());
        View findViewById2 = this.itemView.findViewById(R.id.i5x);
        o.LJIIIIZZ(findViewById2, "itemView.product_image");
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
            layoutParams.width = P().getProductImageWidth();
            layoutParams.height = P().getProductImageHeight();
            findViewById2.setLayoutParams(layoutParams);
        }
        C65776Prg LIZ = C65352Pkq.LIZ(ProductReviewViewModel.class);
        this.LJLJL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 76));
        this.LJLJLLL = i;
        this.LJLL = C221108m2.LIZIZ(C70671RoR.LJLIL);
    }

    public final void U(C70682Roc c70682Roc, String str, String str2, boolean z, boolean z2) {
        if (str2 == null || ujb.o.LJJJJJL(str2)) {
            c70682Roc.setVisibility(8);
            return;
        }
        c70682Roc.setVisibility(0);
        Context context = c70682Roc.getContext();
        o.LJIIIIZZ(context, "view.context");
        c70682Roc.setContentTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
        String string = c70682Roc.getContext().getResources().getString(R.string.f5c);
        o.LJIIIIZZ(string, "view.context.resources.g…_detail_cell_text_seller)");
        String LIZIZ = C00F.LIZIZ(string, ' ', str2);
        if (z2) {
            C70682Roc.LIZJ(c70682Roc, LIZIZ, 0, false, new AqS35S1000000_12(string, 6), 6);
        } else {
            c70682Roc.LIZIZ(LIZIZ, 2, true, new AqS35S1000000_12(string, 7));
            c70682Roc.setExpandListener(new C70678RoY(z, this, str, c70682Roc, LIZIZ, string));
        }
    }
}
