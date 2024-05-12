package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.view;

import X.C27083Ak3;
import X.C62850Ola;
import X.C76800UCe;
import X.C79045V0n;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.core.view.PdpPoliciesItemView;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dynamicstyle.payment.GlobalCCDCPoliciesItemViewStyle;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CCDCPolicyItemView extends PdpPoliciesItemView {
    public Map<Integer, View> _$_findViewCache;
    public final IReturnPoliciesItemViewStyle ccdcStyle;
    public InterfaceC88472Yns<? super String, C76800UCe> clickListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CCDCPolicyItemView(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CCDCPolicyItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.view.PdpPoliciesItemView
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.view.PdpPoliciesItemView
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

    public final InterfaceC88472Yns<String, C76800UCe> getClickListener() {
        return this.clickListener;
    }

    public final void setClickListener(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.clickListener = interfaceC88472Yns;
    }

    public final void setUserRightDescBlocks(List<UserRightDescBlock> list) {
        if (list == null) {
            return;
        }
        ((ViewGroup) _$_findCachedViewById(R.id.c7a)).removeAllViews();
        Iterator<UserRightDescBlock> it = list.iterator();
        while (it.hasNext()) {
            LinkRichText linkRichText = it.next().mixLinkDescription;
            if (linkRichText != null) {
                LinearLayout desc_container = (LinearLayout) _$_findCachedViewById(R.id.c7a);
                o.LJIIIIZZ(desc_container, "desc_container");
                addMixLink(desc_container, linkRichText);
            }
        }
    }

    private final void addMixLink(LinearLayout linearLayout, LinkRichText linkRichText) {
        RichTextUtil richTextUtil = RichTextUtil.LIZ;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        SpannableStringBuilder LIZJ = RichTextUtil.LIZJ(richTextUtil, context, linkRichText, C79045V0n.LJI(this.ccdcStyle.getDescTextColor(), context2), this.ccdcStyle.getLinkTextColor(), true, null, new AqS170S0100000_4(this, 280), 32);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        TuxTextView tuxTextView = new TuxTextView(context3, null, 6, 0);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setText(LIZJ);
        tuxTextView.setTuxFont(this.ccdcStyle.getDescFont());
        tuxTextView.setClickable(true);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linearLayout.addView(tuxTextView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CCDCPolicyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null, 8, 0 == true ? 1 : 0);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        GlobalCCDCPoliciesItemViewStyle globalCCDCPoliciesItemViewStyle = new GlobalCCDCPoliciesItemViewStyle();
        this.ccdcStyle = globalCCDCPoliciesItemViewStyle;
        this.clickListener = C27083Ak3.LJLIL;
        getBinding().LJIILLIIL(globalCCDCPoliciesItemViewStyle);
        getBinding().LLF.setVisibility(8);
    }

    public /* synthetic */ CCDCPolicyItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
