package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy;

import X.C03090Af;
import X.C26670AdO;
import X.ORZ;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfSAPdpReturnPolicyVH extends TtfUkPdpReturnPolicyVH {
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH
    public final void L() {
        String str;
        List<LinkRichText> list;
        LinkRichText linkRichText;
        ((ImageView) this.itemView.findViewById(R.id.e_q)).setVisibility(0);
        ((TuxTextView) this.itemView.findViewById(R.id.j00)).setTuxFont(52);
        TextView textView = (TextView) this.itemView.findViewById(R.id.j00);
        ExposeUserRightPanel exposeUserRightPanel = ((C26670AdO) getItem()).LJLIL.exposeUserRightPanel;
        if (exposeUserRightPanel == null || (str = exposeUserRightPanel.title) == null) {
            str = ((C26670AdO) getItem()).LJLIL.name;
        }
        textView.setText(str);
        PDPReturnPolicyModule pDPReturnPolicyModule = ((C26670AdO) getItem()).LJLILLLLZI;
        String str2 = null;
        if (pDPReturnPolicyModule != null && pDPReturnPolicyModule.title != null) {
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.j00);
            PDPReturnPolicyModule pDPReturnPolicyModule2 = ((C26670AdO) getItem()).LJLILLLLZI;
            if (pDPReturnPolicyModule2 != null) {
                str2 = pDPReturnPolicyModule2.title;
            }
            textView2.setText(str2);
        } else {
            PDPReturnPolicyModule pDPReturnPolicyModule3 = ((C26670AdO) getItem()).LJLILLLLZI;
            if (pDPReturnPolicyModule3 != null && (list = pDPReturnPolicyModule3.descriptionList) != null && (linkRichText = (LinkRichText) ORZ.LJLLLL(list)) != null) {
                TextView textView3 = (TextView) this.itemView.findViewById(R.id.j00);
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                textView3.setText(RichTextUtil.LIZJ(richTextUtil, context, linkRichText, null, 0, false, null, null, 124));
            }
        }
        this.itemView.findViewById(R.id.j01).setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfSAPdpReturnPolicyVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, eCBaseFragment);
        this.LJLJJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
    }
}
