package com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2;

import X.AbstractC28801Bc;
import X.AbstractC70272Ri0;
import X.C0AX;
import X.C16880lQ;
import X.C26706Ady;
import X.C26782AfC;
import X.C29127Bbv;
import X.C36922EeM;
import X.C70252Rhg;
import X.C70253Rhh;
import X.C70270Rhy;
import X.C70288RiG;
import X.C70289RiH;
import X.C70377Rjh;
import X.C70378Rji;
import X.C70379Rjj;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79234V7u;
import X.InterfaceC70273Ri1;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.utils.Au2S4S0101000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class SpecItemAdapterV2 extends AbstractC28801Bc<Object, AbstractC70272Ri0<?>> implements c {
    public final C26782AfC differ;
    public InterfaceC70273Ri1 listener;

    /* JADX WARN: Multi-variable type inference failed */
    public SpecItemAdapterV2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        return com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(this, viewGroup, i);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final C26782AfC getDiffer() {
        return this.differ;
    }

    public final InterfaceC70273Ri1 getListener() {
        return this.listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecItemAdapterV2(C26782AfC differ) {
        super(differ);
        o.LJIIIZ(differ, "differ");
        this.differ = differ;
    }

    @Override // X.AbstractC029409q
    public int getItemViewType(int i) {
        return getItem(i).getClass().hashCode();
    }

    public final void setListener(InterfaceC70273Ri1 interfaceC70273Ri1) {
        this.listener = interfaceC70273Ri1;
    }

    @Override // X.AbstractC029409q
    public void onBindViewHolder(AbstractC70272Ri0<?> holder, int i) {
        o.LJIIIZ(holder, "holder");
        Object item = getItem(i);
        o.LJIIIIZZ(item, "getItem(position)");
        holder.L(i, item);
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C16880lQ.LJIIJ(new Au2S4S0101000_12(this, i, 0), view);
        InterfaceC70273Ri1 interfaceC70273Ri1 = this.listener;
        if (interfaceC70273Ri1 != null) {
            getItem(i);
            interfaceC70273Ri1.LJJLIIIJL(i, holder);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder, reason: merged with bridge method [inline-methods] */
    public AbstractC70272Ri0<?> com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (i == C70289RiH.class.hashCode()) {
            return new C70378Rji(parent);
        }
        if (i == C70252Rhg.class.hashCode()) {
            return new C70377Rjh(parent);
        }
        if (i == C70288RiG.class.hashCode()) {
            return new C70379Rjj(parent);
        }
        if (i == C70253Rhh.class.hashCode()) {
            return new C70270Rhy(parent);
        }
        return new C70379Rjj(parent);
    }

    public /* synthetic */ SpecItemAdapterV2(C26782AfC c26782AfC, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C26782AfC() : c26782AfC);
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder(SpecItemAdapterV2 specItemAdapterV2, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___ = specItemAdapterV2.com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(viewGroup, i);
        C0AX.LIZ(viewGroup, com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___.itemView, R.id.lj7);
        return com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___;
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder(SpecItemAdapterV2 specItemAdapterV2, ViewGroup viewGroup, int i) {
        View view;
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder = com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder(specItemAdapterV2, viewGroup, i);
        if (com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder != null && (view = com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder.itemView) != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        return com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder;
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(SpecItemAdapterV2 specItemAdapterV2, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder = com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder(specItemAdapterV2, viewGroup, i);
        try {
            if (com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.getClass().getName();
        return com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder;
    }
}
