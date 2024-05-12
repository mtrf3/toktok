package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.payment;

import X.C16880lQ;
import X.C1EU;
import X.C221108m2;
import X.C47261Igj;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70360RjQ;
import X.C70361RjR;
import X.C70365RjV;
import X.C70367RjX;
import X.C70368RjY;
import X.C70370Rja;
import X.C70885Rrt;
import X.C70962Rt8;
import X.C78946Uyc;
import X.C79081V1x;
import X.ORS;
import X.OUP;
import X.RVL;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS22S0301000_12;
import Y.IDObjectS332S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpPaymentModuleViewHolder extends PdpHolder {
    public final C62822Ol8 LJLIL;
    public final LinkedList<C70360RjQ> LJLILLLLZI;
    public long LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void L() {
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.g0y);
        o.LJIIIIZZ(viewGroup, "itemView.llInstalmentPlansContainer");
        IDObjectS332S0100000_12 iDObjectS332S0100000_12 = new IDObjectS332S0100000_12(viewGroup, 8);
        ArrayList arrayList = new ArrayList();
        Iterator it = iDObjectS332S0100000_12.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof C70360RjQ) && view != null) {
                arrayList.add(view);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C70360RjQ c70360RjQ = (C70360RjQ) it2.next();
            if (c70360RjQ.LIZJ()) {
                c70360RjQ.setChecked$ecommerce_transaction_release(false);
            }
        }
    }

    public final void M() {
        SmartRouter.buildRoute(this.itemView.getContext(), C1EU.LIZIZ("//ec/bnpl/middle", "source", "product_detail").toString()).open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpPaymentModuleViewHolder(View view) {
        super(view, R.layout.a3h);
        o.LJIIIZ(view, "view");
        this.LJLJJI = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 52));
        this.LJLILLLLZI = new LinkedList<>();
        this.LJLJI = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        List<InstallmentPlan> list;
        InstallmentPlan installmentPlan;
        String str;
        String str2;
        RVL item = (RVL) obj;
        o.LJIIIZ(item, "item");
        BnplInfo bnplInfo = ((RVL) getItem()).LIZ;
        if (bnplInfo != null && (str2 = bnplInfo.title) != null) {
            ((TextView) this.itemView.findViewById(R.id.lyc)).setText(str2);
        }
        BnplInfo bnplInfo2 = ((RVL) getItem()).LIZ;
        if (bnplInfo2 != null && (str = bnplInfo2.text) != null) {
            ((TextView) this.itemView.findViewById(R.id.ly7)).setText(str);
        }
        BnplInfo bnplInfo3 = ((RVL) getItem()).LIZ;
        if (bnplInfo3 != null) {
            z = o.LJ(bnplInfo3.isAuth, Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 0, 42), itemView);
            View findViewById = this.itemView.findViewById(R.id.ly7);
            o.LJIIIIZZ(findViewById, "itemView.tvText");
            OUP.LJJLIIIJ(findViewById);
            View findViewById2 = this.itemView.findViewById(R.id.ead);
            o.LJIIIIZZ(findViewById2, "itemView.iconRightArrow");
            OUP.LJJLIIIJ(findViewById2);
            View hsvInstallmentPlans = _$_findCachedViewById(R.id.e8b);
            o.LJIIIIZZ(hsvInstallmentPlans, "hsvInstallmentPlans");
            OUP.LJIJJLI(hsvInstallmentPlans);
        } else {
            View findViewById3 = this.itemView.findViewById(R.id.ly7);
            o.LJIIIIZZ(findViewById3, "itemView.tvText");
            OUP.LJIJJLI(findViewById3);
            View findViewById4 = this.itemView.findViewById(R.id.ead);
            o.LJIIIIZZ(findViewById4, "itemView.iconRightArrow");
            OUP.LJIJJLI(findViewById4);
            View hsvInstallmentPlans2 = _$_findCachedViewById(R.id.e8b);
            o.LJIIIIZZ(hsvInstallmentPlans2, "hsvInstallmentPlans");
            OUP.LJJLIIIJ(hsvInstallmentPlans2);
            C70370Rja c70370Rja = (C70370Rja) _$_findCachedViewById(R.id.e8b);
            if (c70370Rja != null) {
                c70370Rja.setScrollViewListener(new C70361RjR(this));
            }
            if (((ViewGroup) this.itemView.findViewById(R.id.g0y)).getChildCount() > 0) {
                ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.g0y);
                o.LJIIIIZZ(viewGroup, "itemView.llInstalmentPlansContainer");
                LinkedList<C70360RjQ> linkedList = this.LJLILLLLZI;
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    C16880lQ.LJLLL(childAt, viewGroup);
                    if (childAt instanceof C70360RjQ) {
                        linkedList.add(childAt);
                    }
                }
            }
            BnplInfo bnplInfo4 = ((RVL) getItem()).LIZ;
            if (bnplInfo4 != null && (list = bnplInfo4.installmentPlans) != null) {
                int i = 0;
                for (InstallmentPlan installmentPlan2 : list) {
                    int i2 = i + 1;
                    String str3 = null;
                    if (i >= 0) {
                        InstallmentPlan installmentPlan3 = installmentPlan2;
                        C70360RjQ c70360RjQ = (C70360RjQ) ORS.LJJLJLI(this.LJLILLLLZI);
                        if (c70360RjQ == null) {
                            Context context = this.itemView.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            c70360RjQ = new C70360RjQ(context);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        if (i != 0) {
                            layoutParams.setMarginStart(C79081V1x.LJII(8));
                        }
                        c70360RjQ.setLayoutParams(layoutParams);
                        c70360RjQ.LIZIZ(installmentPlan3);
                        c70360RjQ.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0301000_12(this, c70360RjQ, installmentPlan3, i, 0)));
                        SkuPanelState skuPanelState = ((PdpViewModel) this.LJLIL.getValue()).LJLL;
                        if (skuPanelState != null && (installmentPlan = skuPanelState.getInstallmentPlan()) != null) {
                            str3 = installmentPlan.tenure;
                        }
                        if (o.LJ(str3, installmentPlan3.tenure)) {
                            c70360RjQ.performClick();
                        }
                        ((ViewGroup) this.itemView.findViewById(R.id.g0y)).addView(c70360RjQ);
                        C78946Uyc.LJJIIJZLJL(c70360RjQ, new C70962Rt8(), new AqS162S0100000_12(installmentPlan3, 1), new AqS61S0201000_12(i, this, installmentPlan3, 0));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        View view = this.itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), C70367RjX.LJLIL, new AqS178S0100000_12(item, 3));
        BnplInfo bnplInfo5 = item.LIZ;
        if (bnplInfo5 == null || !o.LJ(bnplInfo5.isAuth, Boolean.TRUE)) {
            View iconRightArrow = _$_findCachedViewById(R.id.ead);
            o.LJIIIIZZ(iconRightArrow, "iconRightArrow");
            C78946Uyc.LJJIIJZLJL(iconRightArrow, new C70885Rrt(), C70368RjY.LJLIL, C70365RjV.LJLIL);
        }
    }
}
