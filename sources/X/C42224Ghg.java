package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ghg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42224Ghg extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final C28871Bj LJLIL;
    public final C84539XFv LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.getItemCount();
    }

    public C42224Ghg(C28871Bj c28871Bj) {
        this.LJLIL = c28871Bj;
        C84539XFv c84539XFv = new C84539XFv(this);
        this.LJLILLLLZI = c84539XFv;
        c28871Bj.registerAdapterDataObserver(c84539XFv);
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return this.LJLIL.getItemId(i);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return this.LJLIL.getItemViewType(i);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL.onDetachedFromRecyclerView(recyclerView);
        this.LJLILLLLZI.LJLJJI.dispose();
    }

    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        return this.LJLIL.onFailedToRecycleView(holder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.onViewAttachedToWindow(holder);
        if (holder instanceof InterfaceC56632MKm) {
            ((InterfaceC56632MKm) holder).LLJLL(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.onViewDetachedFromWindow(holder);
        if (holder instanceof InterfaceC56632MKm) {
            ((InterfaceC56632MKm) holder).LLJLL(false);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.onViewRecycled(holder);
    }

    @Override // X.AbstractC029409q
    public final void registerAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLIL.registerAdapterDataObserver(observer);
    }

    @Override // X.AbstractC029409q
    public final void setHasStableIds(boolean z) {
        this.LJLIL.setHasStableIds(z);
        throw null;
    }

    @Override // X.AbstractC029409q
    public final void unregisterAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLIL.unregisterAdapterDataObserver(observer);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.onBindViewHolder(holder, i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___ = this.LJLIL.com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(parent, i);
        C0AX.LIZ(parent, com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView, R.id.lj7);
        View view = com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.getClass().getName();
        return com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        this.LJLIL.onBindViewHolder(holder, i, payloads);
    }
}
