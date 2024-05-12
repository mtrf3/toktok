package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review;

import X.AbstractC70683Rod;
import X.AbstractC70860RrU;
import X.C024607u;
import X.C119774mz;
import X.C1EU;
import X.C221108m2;
import X.C26706Ady;
import X.C44878HjO;
import X.C45804HyK;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70445Rkn;
import X.C70657RoD;
import X.C70672RoS;
import X.C70682Roc;
import X.C72545SdZ;
import X.EnumC70569Rmn;
import X.UC0;
import Y.ARunnableS40S0100000_4;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS8S0401000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class PdpReviewViewHolder extends AbsFullSpanVH implements c {
    public Map<Integer, View> _$_findViewCache;
    public final C5H3 pdpSeparateDisplay$delegate;
    public final IReviewCellStyle style;
    public final C5H3 userInfoView$delegate;
    public final C5H3 vm$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final boolean getPdpSeparateDisplay() {
        return ((Boolean) this.pdpSeparateDisplay$delegate.getValue()).booleanValue();
    }

    private final AbstractC70683Rod getUserInfoView() {
        Object value = this.userInfoView$delegate.getValue();
        o.LJIIIIZZ(value, "<get-userInfoView>(...)");
        return (AbstractC70683Rod) value;
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.vm$delegate.getValue();
    }

    private final void bindStyle() {
        getUserInfoView().setUiStyle(this.style);
        ((C70682Roc) _$_findCachedViewById(R.id.j0h)).setContentFont(this.style.getContentFont());
        C45804HyK.LJJLIIIJ(this.style.getImageMarginTop(), _$_findCachedViewById(R.id.j0z));
        C45804HyK.LJJLIIIJ(this.style.getImageMarginTop(), _$_findCachedViewById(R.id.j16));
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public boolean needDivider() {
        return ((ReviewItemVO) getItem()).needDivider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onResume() {
        super.onResume();
        trackTag(new C70445Rkn(((ReviewItemVO) getItem()).reviewItemStruct));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpReviewViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a40, viewGroup, false));
        this._$_findViewCache = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 63));
        AbstractC70860RrU abstractC70860RrU = (AbstractC70860RrU) C024607u.LIZ.LIZIZ(ViewDataBinding.LIZIZ(null), this.itemView, R.layout.a40);
        IReviewCellStyle iReviewCellStyle = (IReviewCellStyle) UC0.LJIIJJI(this, "product_detail", null, null, null, 14);
        iReviewCellStyle = iReviewCellStyle == null ? new DefaultReviewCellStyle() : iReviewCellStyle;
        this.style = iReviewCellStyle;
        abstractC70860RrU.LJIILLIIL(iReviewCellStyle);
        this.pdpSeparateDisplay$delegate = C221108m2.LIZIZ(C70672RoS.LJLIL);
        this.userInfoView$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 365));
    }

    public final void addPdpContentImageMonitor(ReviewMedia reviewMedia) {
        List<String> thumbUrls;
        List<String> urls;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Image image = reviewMedia.image;
        if (image != null && (urls = image.getUrls()) != null) {
            Iterator<String> it = urls.iterator();
            while (it.hasNext()) {
                arrayList.add(C70657RoD.LJIIJJI(it.next(), EnumC70569Rmn.PDP_REVIEW));
            }
        }
        Image image2 = reviewMedia.image;
        if (image2 != null && (thumbUrls = image2.getThumbUrls()) != null) {
            Iterator<String> it2 = thumbUrls.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C70657RoD.LJIIJJI(it2.next(), EnumC70569Rmn.PDP_REVIEW));
            }
        }
        Image image3 = reviewMedia.image;
        if (image3 != null) {
            image3.setUrls(arrayList);
        }
        Image image4 = reviewMedia.image;
        if (image4 == null) {
            return;
        }
        image4.setThumbUrls(arrayList2);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(ReviewItemVO item) {
        o.LJIIIZ(item, "item");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        bindReviewCell(itemView, item.reviewItemStruct);
        bindStyle();
    }

    private final void bindMedia(C119774mz c119774mz, ReviewItemStruct reviewItemStruct) {
        List<ReviewMedia> list;
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        if (mainReview == null || (list = mainReview.media) == null || list.isEmpty()) {
            c119774mz.setVisibility(8);
            return;
        }
        c119774mz.setVisibility(0);
        AqS8S0401000_4 aqS8S0401000_4 = new AqS8S0401000_4(c119774mz, (C119774mz) list, (List<ReviewMedia>) this, (PdpReviewViewHolder) (list.size() - 4), (int) reviewItemStruct, (ReviewItemStruct) 0);
        if (c119774mz.getWidth() == 0) {
            c119774mz.post(new ARunnableS40S0100000_4((Object) aqS8S0401000_4, 39));
        } else {
            aqS8S0401000_4.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindReviewCell(android.view.View r13, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewViewHolder.bindReviewCell(android.view.View, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct):void");
    }

    private final SpannableStringBuilder buildTagSpanString(View view, List<ReviewItemStruct.DisplayReviewText> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (list != null) {
            int i = 0;
            for (ReviewItemStruct.DisplayReviewText displayReviewText : list) {
                if (i != 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                Integer num = displayReviewText.textType;
                if (num == null || num.intValue() != 2) {
                    Integer num2 = displayReviewText.textType;
                    if (num2 != null && num2.intValue() == 1) {
                        String str = displayReviewText.plainText;
                        if (str != null && !ujb.o.LJJJJJL(str)) {
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) displayReviewText.plainText);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(C1EU.LIZ(view, "itemView.context", R.attr.go)), length, spannableStringBuilder.length(), 33);
                        }
                    }
                } else {
                    if (displayReviewText.tagKey != null) {
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) displayReviewText.tagKey);
                        spannableStringBuilder.append((CharSequence) ":");
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C1EU.LIZ(view, "itemView.context", R.attr.gv)), length2, spannableStringBuilder.length(), 33);
                    }
                    if (displayReviewText.tagText != null) {
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) displayReviewText.tagText);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C1EU.LIZ(view, "itemView.context", R.attr.go)), length3, spannableStringBuilder.length(), 33);
                    }
                }
                i++;
            }
        }
        return spannableStringBuilder;
    }
}
