package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.GHf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41259GHf extends AbstractC43973HNp {
    public C41259GHf() {
        super(null);
    }

    @Override // X.AbstractC43973HNp
    public final void LJLZ(int i, int i2) {
    }

    @Override // X.AbstractC43973HNp
    public final int LJZI() {
        return -1;
    }

    @Override // X.AbstractC43973HNp
    public final CutSameVideoImageExtraData LLD() {
        return null;
    }

    @Override // X.AbstractC43973HNp
    public final void LLFZ(ArrayList<CutSameVideoImageExtraData> arrayList) {
    }

    @Override // X.AbstractC43973HNp
    public final void LLIIIJ(MyMediaModel myMediaModel) {
    }

    @Override // X.AbstractC43973HNp
    public final int LJZL() {
        return getItemCount();
    }

    public C41259GHf(Integer num) {
        super(num);
    }

    @Override // X.AbstractC43973HNp, X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        o.LJIIIZ(viewGroup, "viewGroup");
        C42605Gnp c42605Gnp = new C42605Gnp(this, viewGroup);
        C0AX.LIZ(viewGroup, c42605Gnp.itemView, R.id.lj7);
        View view = c42605Gnp.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c42605Gnp.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C42605Gnp.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c42605Gnp.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c42605Gnp.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C42605Gnp.class.getName();
        return c42605Gnp;
    }
}
