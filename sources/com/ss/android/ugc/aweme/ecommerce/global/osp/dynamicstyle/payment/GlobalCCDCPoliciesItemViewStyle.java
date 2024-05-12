package com.ss.android.ugc.aweme.ecommerce.global.osp.dynamicstyle.payment;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class GlobalCCDCPoliciesItemViewStyle implements IReturnPoliciesItemViewStyle {
    public final int chevron;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.IDescriptionBlockStyle
    public int getDescFont() {
        return 51;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.IDescriptionBlockStyle
    public int getDescTextColor() {
        return R.attr.gu;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.IDescriptionBlockStyle
    public int getLinkFont() {
        return 53;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.IDescriptionBlockStyle
    public int getLinkTextColor() {
        return R.attr.bx;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle
    public int getPagePaddingHorizontal() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle
    public int getSpanFontStyle() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle
    public int getStartIconMarginStart() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle
    public int getStartIconVisibility() {
        return 8;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle
    public int getTitleFont() {
        return 42;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.IDescriptionBlockStyle
    public int getChevron() {
        return this.chevron;
    }
}
