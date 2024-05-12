package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright;

import X.AnonymousClass636;
import X.C03090Af;
import X.C16880lQ;
import X.C26678AdW;
import X.C26679AdX;
import X.C26830Afy;
import X.C32151Nz;
import X.C45804HyK;
import X.C47261Igj;
import X.C76800UCe;
import X.O6R;
import X.ORS;
import X.OUP;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class TtfSAPdpUserRightVH extends PdpUserRightHolder {
    public final Map<Integer, View> LJLJLJ;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder
    public final void L(C26678AdW item) {
        int i;
        o.LJIIIZ(item, "item");
        ((ImageView) _$_findCachedViewById(R.id.lml)).setVisibility(0);
        ((TuxIconView) _$_findCachedViewById(R.id.lml)).setTintColorRes(R.attr.gx);
        ((ImageView) _$_findCachedViewById(R.id.a7n)).setVisibility(4);
        StringBuilder sb = new StringBuilder();
        ExposeUserRightPanel exposeUserRightPanel = item.LJLIL.exposeUserRightPanel;
        if (exposeUserRightPanel == null) {
            return;
        }
        View findViewById = this.itemView.findViewById(R.id.k8e);
        o.LJIIIIZZ(findViewById, "itemView.space_line");
        OUP.LJIJJLI(findViewById);
        View view = this.itemView;
        View user_right_new_default_layout = view.findViewById(R.id.n0c);
        o.LJIIIIZZ(user_right_new_default_layout, "user_right_new_default_layout");
        OUP.LJIJJLI(user_right_new_default_layout);
        View user_right_old_layout = view.findViewById(R.id.n0f);
        o.LJIIIIZZ(user_right_old_layout, "user_right_old_layout");
        OUP.LJIJJLI(user_right_old_layout);
        View user_right_new_default_layout_mark = view.findViewById(R.id.n0d);
        o.LJIIIIZZ(user_right_new_default_layout_mark, "user_right_new_default_layout_mark");
        OUP.LJIJJLI(user_right_new_default_layout_mark);
        View user_right_new_layout = view.findViewById(R.id.n0e);
        o.LJIIIIZZ(user_right_new_layout, "user_right_new_layout");
        OUP.LJJLIIIJ(user_right_new_layout);
        if (C26830Afy.LIZ()) {
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.ba8);
            o.LJIIIIZZ(viewGroup, "itemView.child_user_right_layout");
            LinkedList<C26679AdX> linkedList = this.LJLJJL;
            while (viewGroup.getChildCount() > 0) {
                C16880lQ.LLIFFJFJJ(0, viewGroup);
                C76800UCe c76800UCe = C76800UCe.LIZ;
                if (c76800UCe instanceof C26679AdX) {
                    linkedList.add(c76800UCe);
                }
            }
        } else {
            ((ViewGroup) this.itemView.findViewById(R.id.ba8)).removeAllViews();
        }
        List<ExposeUserRight> list = item.LJLIL.exposeUserRightPanel.exposeUserRights;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
        ((TextView) view.findViewById(R.id.n0o)).setText(exposeUserRightPanel.title);
        ((TuxTextView) view.findViewById(R.id.n0o)).setTuxFont(52);
        C45804HyK.LJJLIIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), view.findViewById(R.id.n0o));
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.n0a);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        tuxIconView.setTintColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        ((TuxIconView) view.findViewById(R.id.n0a)).setIconRes(R.raw.icon_shield_tick);
        C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)), view.findViewById(R.id.n0a));
        List<ExposeUserRight> list2 = exposeUserRightPanel.exposeUserRights;
        if (list2 != null) {
            int i2 = 0;
            for (ExposeUserRight exposeUserRight : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ExposeUserRight exposeUserRight2 = exposeUserRight;
                    StringBuilder sb2 = this.LJLJI;
                    sb2.append(exposeUserRight2.nameEn);
                    sb2.append(",");
                    sb.append(exposeUserRight2.name);
                    if (i2 != C47261Igj.LJJI(exposeUserRightPanel.exposeUserRights)) {
                        sb.append(" · ");
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        if (this.LJLJI.length() > 0) {
            StringBuilder sb3 = this.LJLJI;
            sb3.deleteCharAt(s.LJJLIIIJ(sb3));
        }
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.ba8);
        View view2 = (View) ORS.LJJLJLI(this.LJLJJL);
        View view3 = view2;
        if (view2 == null) {
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "context");
            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
            tuxTextView.setText(sb);
            tuxTextView.setTuxFont(51);
            Context context3 = this.itemView.getContext();
            o.LJIIIIZZ(context3, "itemView.context");
            tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context3));
            view3 = tuxTextView;
        }
        viewGroup2.addView(view3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfSAPdpUserRightVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, eCBaseFragment);
        this.LJLJLJ = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
    }
}
