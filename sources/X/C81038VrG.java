package X;

import Y.ACListenerS54S0000000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhihu.matisse.internal.ui.MediaSelectionFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VrG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81038VrG extends AbstractC81036VrE<RecyclerView.ViewHolder> implements InterfaceC81044VrM {
    public final C81051VrT LJLJI;
    public final C81052VrU LJLJJI = C81055VrX.LIZ;
    public MediaSelectionFragment LJLJJL;
    public MediaSelectionFragment LJLJJLL;
    public final RecyclerView LJLJL;
    public int LJLJLJ;

    public final void LJLZ() {
        notifyDataSetChanged();
        MediaSelectionFragment mediaSelectionFragment = this.LJLJJL;
        if (mediaSelectionFragment != null) {
            mediaSelectionFragment.LJIILLIIL();
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean z = true;
        if (i == 1) {
            viewHolder = new C81039VrH(C28289B8j.LIZ(viewGroup, R.layout.bzb, viewGroup, false));
            C16880lQ.LJIIJ(new ACListenerS54S0000000_14(1), viewHolder.itemView);
        } else if (i == 2) {
            viewHolder = new C81040VrI(C28289B8j.LIZ(viewGroup, R.layout.bs2, viewGroup, false));
        } else {
            viewHolder = null;
        }
        C0AX.LIZ(viewGroup, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }

    public C81038VrG(Context context, C81051VrT c81051VrT, RecyclerView recyclerView) {
        this.LJLJI = c81051VrT;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.aiq});
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.LJLJL = recyclerView;
    }
}
