package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes11.dex */
public final class N97 extends AbstractC029409q {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ XXV LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List list = this.LJLILLLLZI;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        XXO xxo = (XXO) viewHolder;
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) ListProtector.get(this.LJLILLLLZI, i);
        xxo.LJLJI = musicCollectionItem;
        if (musicCollectionItem == null) {
            return;
        }
        xxo.LJLIL.setText(musicCollectionItem.mcName);
        C78765Uvh.LJFF(xxo.LJLILLLLZI, xxo.LJLJI.awemeCover);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        XXO xxo = new XXO(C28289B8j.LIZ(viewGroup, R.layout.bga, viewGroup, false), this.LJLIL, this.LJLJI.LJLJJI);
        C0AX.LIZ(viewGroup, xxo.itemView, R.id.lj7);
        View view = xxo.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (xxo.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(XXO.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) xxo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(xxo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = XXO.class.getName();
        return xxo;
    }

    public N97(XXV xxv, int i, List list) {
        this.LJLJI = xxv;
        this.LJLIL = i;
        this.LJLILLLLZI = list;
    }
}
