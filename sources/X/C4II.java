package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4II, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4II extends AbstractC029409q {
    public boolean mShowFooter = true;

    public abstract int getBasicItemCount();

    public int getBasicItemViewType(int i) {
        return 0;
    }

    public abstract void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    public abstract void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    public abstract RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup);

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(this, viewGroup, i);
    }

    public void onShowFooterChanged(boolean z) {
    }

    @Override // X.AbstractC029409q
    public int getItemCount() {
        if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.mShowFooter && i == getBasicItemCount()) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return getBasicItemViewType(i);
    }

    public void setShowFooter(boolean z) {
        if (z != this.mShowFooter) {
            this.mShowFooter = z;
            onShowFooterChanged(z);
        }
    }

    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return onCreateFooterViewHolder(viewGroup);
        }
        return onCreateBasicViewHolder(viewGroup, i);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(viewHolder);
        } else {
            onBindBasicViewHolder(viewHolder, i);
        }
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder(C4II c4ii, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___ = c4ii.com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___(viewGroup, i);
        C0AX.LIZ(viewGroup, com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.itemView, R.id.lj7);
        return com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___;
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder(C4II c4ii, ViewGroup viewGroup, int i) {
        View view;
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder = com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder(c4ii, viewGroup, i);
        if (com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder != null && (view = com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder.itemView) != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        return com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_analytics_expose_HookRecyclerView_onCreateViewHolder;
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(C4II c4ii, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder = com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder(c4ii, viewGroup, i);
        try {
            if (com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.getClass().getName();
        return com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder;
    }
}
