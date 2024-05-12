package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright;

import X.C19N;
import X.C26660AdE;
import X.C26672AdQ;
import X.C26673AdR;
import X.C26675AdT;
import X.C70414RkI;
import X.C78565UsT;
import X.InterfaceC26837Ag5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalUserRightVH extends GlobalPdpSelectVH {
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

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public final int getStartIconRes(InterfaceC26837Ag5 item) {
        o.LJIIIZ(item, "item");
        return R.raw.icon_shield_tick;
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
    public GlobalUserRightVH(ViewGroup view, ECBaseFragment fragment) {
        super(view, fragment);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public final void bindCustomView(InterfaceC26837Ag5 interfaceC26837Ag5, View view) {
        ArrayList arrayList;
        int i;
        List<ExposeUserRight> list;
        ArrayList arrayList2;
        C26675AdT item = (C26675AdT) interfaceC26837Ag5;
        TuxTextView customView = (TuxTextView) view;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(customView, "customView");
        customView.setTuxFont(51);
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.go);
        if (LIZIZ != null) {
            customView.setTextColor(LIZIZ.intValue());
        }
        UserRight userRight = item.LJLIL;
        ExposeUserRightPanel exposeUserRightPanel = userRight.exposeUserRightPanel;
        String str = "";
        List<ExposeUserRight> list2 = null;
        if (exposeUserRightPanel != null) {
            Integer num = exposeUserRightPanel.style;
            if (num == null || num.intValue() != 1) {
                String str2 = item.LJLIL.exposeUserRightPanel.title;
                if (str2 == null) {
                    str2 = "";
                }
                customView.setText(str2);
            } else {
                List<ExposeUserRight> list3 = item.LJLIL.exposeUserRightPanel.exposeUserRights;
                if (list3 != null) {
                    arrayList2 = new ArrayList();
                    Iterator<ExposeUserRight> it = list3.iterator();
                    while (it.hasNext()) {
                        String str3 = it.next().name;
                        if (str3 != null) {
                            arrayList2.add(str3);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                String LIZ = C26672AdQ.LIZ(" · ", arrayList2);
                if (LIZ == null) {
                    LIZ = "";
                }
                customView.setText(LIZ);
            }
        } else {
            List<UserRightDetail> list4 = userRight.userRightDetails;
            if (list4 != null) {
                arrayList = new ArrayList();
                for (UserRightDetail userRightDetail : list4) {
                    if (o.LJ(userRightDetail.expose, Boolean.TRUE)) {
                        arrayList.add(userRightDetail);
                    }
                }
            } else {
                arrayList = null;
            }
            customView.setText(C26660AdE.LIZ(arrayList));
        }
        ExposeUserRightPanel exposeUserRightPanel2 = ((C26675AdT) getItem()).LJLIL.exposeUserRightPanel;
        if (exposeUserRightPanel2 != null && (list = exposeUserRightPanel2.exposeUserRights) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ExposeUserRightPanel exposeUserRightPanel3 = ((C26675AdT) getItem()).LJLIL.exposeUserRightPanel;
        if (exposeUserRightPanel3 != null) {
            list2 = exposeUserRightPanel3.exposeUserRights;
        }
        String LIZIZ2 = C26672AdQ.LIZIZ(list2);
        if (LIZIZ2 != null) {
            str = LIZIZ2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rights_cnt", Integer.valueOf(i));
        linkedHashMap.put("rights_content", str);
        linkedHashMap.put("module_show_type", CardStruct.IStatusCode.DEFAULT);
        C70414RkI c70414RkI = getVm().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJJJLL(linkedHashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH
    public final void onClick(InterfaceC26837Ag5 interfaceC26837Ag5, View view) {
        C26675AdT item = (C26675AdT) interfaceC26837Ag5;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(view, "view");
        C78565UsT.LJJIJIIJIL(this.fragment, new C26673AdR(view, this, item, null));
    }
}
