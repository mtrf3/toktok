package com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.policy;

import X.C221108m2;
import X.C26508Aam;
import X.C26554AbW;
import X.C26572Abo;
import X.C27949Ay1;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PolicyStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfPolicyVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, false);
    }

    public TtfPolicyVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 109));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        List<PolicyStatement> list;
        boolean z;
        PolicyModule policyModule;
        C26554AbW item = (C26554AbW) obj;
        o.LJIIIZ(item, "item");
        View view = this.LJLIL;
        BillInfoData billInfoData = ((OrderSubmitViewModel) this.LJLILLLLZI.getValue()).LJZ;
        if (billInfoData != null && (policyModule = billInfoData.getPolicyModule()) != null) {
            list = policyModule.getPolicyStatements();
        } else {
            list = null;
        }
        int i = 0;
        if (!this.LJLJI) {
            if (list != null) {
                int i2 = 0;
                for (PolicyStatement policyStatement : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        PolicyStatement policyStatement2 = policyStatement;
                        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.hvu);
                        Context context = view.getContext();
                        o.LJIIIIZZ(context, "context");
                        if (i2 != C47261Igj.LJJI(list)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        viewGroup.addView(new C26572Abo(context, policyStatement2, z));
                        C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
                        String moduleName = policyStatement2.getModuleName();
                        if (moduleName == null) {
                            moduleName = "";
                        }
                        C27949Ay1.LJJIFFI(c27949Ay1, moduleName, ((OrderSubmitViewModel) this.LJLILLLLZI.getValue()).fw0(false), null, null, null, null, null, 2044);
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            this.LJLJI = true;
        }
        if (!item.LJLIL) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
