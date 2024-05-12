package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CUp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31415CUp extends AbstractC029409q<RecyclerView.ViewHolder> {
    public List<?> LJLIL;
    public final List<?> LJLILLLLZI;
    public final C31413CUn LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJI.getItemCount();
    }

    public C31415CUp() {
        List<?> emptyList = Collections.emptyList();
        C31411CUl c31411CUl = new C31411CUl();
        this.LJLIL = emptyList;
        this.LJLILLLLZI = emptyList;
        this.LJLJI = new C31413CUn(emptyList, c31411CUl);
    }

    public final void LJLZ(List<?> list) {
        this.LJLIL = list;
        this.LJLJI.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        this.LJLJI.getItemId(i);
        return -1L;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return this.LJLJI.getItemViewType(i);
    }

    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        this.LJLJI.LJLLLLLL(viewHolder).getClass();
        return false;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.LJLJI.LJLLLLLL(viewHolder).LIZLLL(viewHolder);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.LJLJI.LJLLLLLL(viewHolder).LJ(viewHolder);
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.LJLJI.LJLLLLLL(viewHolder).LJFF(viewHolder);
    }

    public final <T> void LJLLLLLL(Class<? extends T> cls, CZA<T, ?> cza) {
        this.LJLJI.LJLZ(cls, cza);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.LJLJI.onBindViewHolder(viewHolder, i);
        throw null;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___;
        LayoutInflater LLZIL = C16880lQ.LLZIL(viewGroup.getContext());
        if (((C31411CUl) this.LJLJI.LJLILLLLZI).LIZIZ(i) instanceof CZA) {
            AbstractC31414CUo<?, ?> LIZIZ = ((C31411CUl) this.LJLJI.LJLILLLLZI).LIZIZ(i);
            LIZIZ.getClass();
            com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___ = LIZIZ.LIZJ(LLZIL, viewGroup);
        } else {
            com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___ = this.LJLJI.com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(viewGroup, i);
        }
        C0AX.LIZ(viewGroup, com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView, R.id.lj7);
        View view = com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
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
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___.itemView, viewGroup2);
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
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (((C31411CUl) this.LJLJI.LJLILLLLZI).LIZIZ(viewHolder.getItemViewType()) instanceof CZA) {
            ((C31411CUl) this.LJLJI.LJLILLLLZI).LIZIZ(viewHolder.getItemViewType()).LIZIZ(viewHolder, ListProtector.get(this.LJLJI.LJLIL, i), list);
            return;
        }
        this.LJLJI.onBindViewHolder(viewHolder, i, list);
    }
}
