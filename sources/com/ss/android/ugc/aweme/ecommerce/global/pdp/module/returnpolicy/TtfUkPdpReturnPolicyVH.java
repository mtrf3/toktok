package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy;

import X.C03090Af;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26655Ad9;
import X.C26656AdA;
import X.C26670AdO;
import X.C32151Nz;
import X.C45804HyK;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78946Uyc;
import X.O6R;
import X.ORZ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class TtfUkPdpReturnPolicyVH extends PdpHolder {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void L() {
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
        ((TuxTextView) this.itemView.findViewById(R.id.j00)).setTuxFont(51);
        C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)), this.itemView.findViewById(R.id.j00));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26670AdO item = (C26670AdO) obj;
        o.LJIIIZ(item, "item");
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.hku);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.hku).getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        layoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        tuxIconView.setLayoutParams(layoutParams);
        tuxIconView.setTintColorRes(R.attr.gx);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.e_q);
        ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById.findViewById(R.id.e_q).getLayoutParams();
        layoutParams2.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        layoutParams2.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        _$_findCachedViewById.setLayoutParams(layoutParams2);
        View view = this.itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), C26656AdA.LJLIL, C26655Ad9.LJLIL);
        L();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 56, 42), itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, item.LJLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfUkPdpReturnPolicyVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a3z);
        this.LJLJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 163));
    }
}
