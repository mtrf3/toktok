package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ATg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26284ATg extends AbstractC029409q<RecyclerView.ViewHolder> {
    public List<AnchorPublishStruct> LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final C26285ATh<List<AnchorPublishStruct>> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public final void LJLLLLLL(List<AnchorPublishStruct> data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < this.LJLIL.size()) {
            return this.LJLJI.LIZIZ(i, this.LJLIL);
        }
        return super.getItemViewType(i);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJI.LIZJ();
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLJI.LJFF();
    }

    public C26284ATg(LifecycleOwner lifecycleOwner, List data) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = data;
        this.LJLILLLLZI = lifecycleOwner;
        C26285ATh<List<AnchorPublishStruct>> c26285ATh = new C26285ATh<>();
        this.LJLJI = c26285ATh;
        c26285ATh.LIZ(new C42925Gsz(lifecycleOwner));
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        this.LJLJI.LIZLLL(i, holder, this.LJLIL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        RecyclerView.ViewHolder LJ = this.LJLJI.LJ(parent, i);
        C0AX.LIZ(parent, LJ.itemView, R.id.lj7);
        View view = LJ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LJ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LJ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LJ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJ.getClass().getName();
        return LJ;
    }
}
