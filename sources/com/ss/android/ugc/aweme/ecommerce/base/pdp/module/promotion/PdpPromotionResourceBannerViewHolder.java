package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion;

import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C27513Aqz;
import X.C27514Ar0;
import X.C27570Aru;
import X.C32151Nz;
import X.C5H3;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.C78946Uyc;
import X.C78983UzD;
import X.C7MY;
import X.EnumC72807Shn;
import X.O6R;
import X.OUR;
import X.W5F;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class PdpPromotionResourceBannerViewHolder extends PdpHolder implements c {
    public Map<Integer, View> _$_findViewCache;
    public final C5H3 style$delegate;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final IPromotionStyle getStyle() {
        return (IPromotionStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getModuleName() {
        Integer num = ((C27513Aqz) getItem()).LIZLLL;
        if (num != null) {
            if (num.intValue() == 1) {
                return "flash_sale";
            }
            if (num.intValue() == 2) {
                return "new_user_deal";
            }
            if (num.intValue() == 3) {
                return "commerce_resource";
            }
        }
        return "unKnown";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        int i;
        String str;
        EntranceBannerInfo entranceBannerInfo = ((C27513Aqz) getItem()).LIZ;
        int i2 = 0;
        if (entranceBannerInfo != null && (str = entranceBannerInfo.title) != null) {
            View findViewById = this.itemView.findViewById(R.id.hkt);
            o.LJIIIIZZ(findViewById, "itemView.pdp_resource_banner_title");
            findViewById.setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.hkt)).setText(str);
        }
        View findViewById2 = this.itemView.findViewById(R.id.hkr);
        o.LJIIIIZZ(findViewById2, "itemView.pdp_resource_banner_layout");
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        if (((C27513Aqz) getItem()).LJ) {
            i = 14;
        } else {
            i = 0;
        }
        C27570Aru.LJII(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i)) + LJJIIZ, findViewById2);
        View findViewById3 = this.itemView.findViewById(R.id.hks);
        o.LJIIIIZZ(findViewById3, "itemView.pdp_resource_banner_split_line");
        if (!((C27513Aqz) getItem()).LJ) {
            i2 = 8;
        }
        findViewById3.setVisibility(i2);
        ((TuxTextView) this.itemView.findViewById(R.id.hkp)).setTextColorRes(R.attr.eb);
        ((TextView) this.itemView.findViewById(R.id.hkp)).setText(((C27513Aqz) getItem()).LIZIZ);
        ((TuxTextView) this.itemView.findViewById(R.id.hkp)).setTuxFont(getStyle().getPromotionButtonTextFont());
        setIcon();
    }

    private final void logModuleShow() {
        String moduleName = getModuleName();
        View view = this.itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), C27514Ar0.LJLIL, new AqS58S1100000_4(moduleName, this, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setIcon() {
        Image image;
        int LIZIZ;
        EntranceBannerInfo entranceBannerInfo = ((C27513Aqz) getItem()).LIZ;
        if (entranceBannerInfo != null && (image = entranceBannerInfo.titleImg) != null) {
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.hkq);
            o.LJIIIIZZ(imageView, "itemView.pdp_resource_banner_icon");
            imageView.setVisibility(0);
            View setIcon$lambda$4$lambda$3 = this.itemView.findViewById(R.id.hkq);
            o.LJIIIIZZ(setIcon$lambda$4$lambda$3, "setIcon$lambda$4$lambda$3");
            ViewGroup.LayoutParams layoutParams = setIcon$lambda$4$lambda$3.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                layoutParams.height = C7MY.LIZIZ(14);
                if (image.getWidth() == null || image.getHeight() == null) {
                    LIZIZ = C7MY.LIZIZ(14);
                } else {
                    LIZIZ = calWidth(image);
                }
                layoutParams.width = LIZIZ;
                setIcon$lambda$4$lambda$3.setLayoutParams(layoutParams);
            }
            W5F LIZLLL = C70759Rpr.LIZLLL(image.toThumbFirstImageUrlModel());
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJIILIIL = C7MY.LIZJ(this.itemView, "itemView.context", R.attr.cj);
            LIZLLL.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.hkq);
            C16880lQ.LLJJJ(LIZLLL);
        }
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final void logModuleClick() {
        String moduleName = getModuleName();
        View view = this.itemView;
        C78946Uyc.LJJIIJ(view, OUR.LIZLLL(view, "itemView"), new AqS58S1100000_4(moduleName, this, 12));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpPromotionResourceBannerViewHolder(View view) {
        super(view, R.layout.a3w);
        o.LJIIIZ(view, "view");
        this._$_findViewCache = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 59));
        this.style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 231));
    }

    private final int calWidth(Image image) {
        Integer width = image.getWidth();
        if (width != null) {
            int intValue = width.intValue();
            Integer height = image.getHeight();
            if (height != null) {
                int intValue2 = height.intValue();
                if (intValue2 == 0) {
                    C78983UzD.LJIILL("resourceBanner image height is zero");
                    return 0;
                }
                return (int) ((intValue * C7MY.LIZIZ(14)) / intValue2);
            }
        }
        return 0;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C27513Aqz item) {
        o.LJIIIZ(item, "item");
        getViewModel();
        initView();
        logModuleShow();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 9), itemView);
    }
}
