package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy;

import X.C19N;
import X.C26660AdE;
import X.C26661AdF;
import X.C26664AdI;
import X.C26666AdK;
import X.C26669AdN;
import X.C62850Ola;
import X.C78565UsT;
import X.C78946Uyc;
import X.InterfaceC26837Ag5;
import X.ORZ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPReturnPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalReturnPolicyVH extends GlobalPdpSelectVH {
    public final Map<Integer, View> LJLIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        return o.LJ(((C26669AdN) getItem()).LJLJI, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public final int getStartIconRes(InterfaceC26837Ag5 item) {
        o.LJIIIZ(item, "item");
        return R.raw.icon_box_uturn_left;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public final View onCreateMiddleCustomView(InterfaceC26837Ag5 item) {
        o.LJIIIZ(item, "item");
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        if (tuxTextView.getLayoutParams() != null) {
            tuxTextView.getLayoutParams().height = -2;
            tuxTextView.getLayoutParams().width = -1;
        } else {
            tuxTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        return tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalReturnPolicyVH(ViewGroup view, ECBaseFragment fragment) {
        super(view, fragment);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public final void bindCustomView(InterfaceC26837Ag5 interfaceC26837Ag5, View view) {
        ArrayList arrayList;
        String LIZ;
        LinkRichText linkRichText;
        C26669AdN item = (C26669AdN) interfaceC26837Ag5;
        TuxTextView customView = (TuxTextView) view;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(customView, "customView");
        customView.setTuxFont(51);
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
        if (LIZIZ != null) {
            customView.setTextColor(LIZIZ.intValue());
        }
        PDPReturnPolicyModule pDPReturnPolicyModule = item.LJLILLLLZI;
        if (pDPReturnPolicyModule != null) {
            String str = pDPReturnPolicyModule.title;
            if (str != null) {
                customView.setText(str);
            } else {
                List<LinkRichText> list = pDPReturnPolicyModule.descriptionList;
                if (list != null && (linkRichText = (LinkRichText) ORZ.LJLLLL(list)) != null) {
                    RichTextUtil richTextUtil = RichTextUtil.LIZ;
                    Context context = customView.getContext();
                    o.LJIIIIZZ(context, "customView.context");
                    customView.setText(RichTextUtil.LIZJ(richTextUtil, context, linkRichText, null, 0, false, null, null, 124));
                }
            }
        } else {
            UserRight userRight = item.LJLIL;
            ExposeUserRightPanel exposeUserRightPanel = userRight.exposeUserRightPanel;
            if (exposeUserRightPanel == null || (LIZ = exposeUserRightPanel.description) == null) {
                List<UserRightDetail> list2 = userRight.userRightDetails;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (UserRightDetail userRightDetail : list2) {
                        if (o.LJ(userRightDetail.expose, Boolean.TRUE)) {
                            arrayList.add(userRightDetail);
                        }
                    }
                } else {
                    arrayList = null;
                }
                LIZ = C26660AdE.LIZ(arrayList);
            }
            customView.setText(LIZ);
        }
        View view2 = this.itemView;
        C78946Uyc.LJJIIJZLJL(view2, C62850Ola.LJI(view2, "itemView"), C26664AdI.LJLIL, C26661AdF.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public final void onClick(InterfaceC26837Ag5 interfaceC26837Ag5, View view) {
        C26669AdN item = (C26669AdN) interfaceC26837Ag5;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(view, "view");
        C78565UsT.LJJIJIIJIL(this.fragment, new C26666AdK(this, item, null));
    }
}
