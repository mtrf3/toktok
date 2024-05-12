package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes11.dex */
public final class N98 extends AbstractC029409q<N99> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ XXU LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List list = this.LJLILLLLZI;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(N99 n99, int i) {
        N99 n992 = n99;
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) ListProtector.get(this.LJLILLLLZI, i);
        if (musicCollectionItem == null) {
            return;
        }
        musicCollectionItem.setPlaylistOrder(i);
        n992.LJLJI = musicCollectionItem;
        n992.LJLIL.setText(musicCollectionItem.mcName);
        C78765Uvh.LJFF(n992.LJLILLLLZI, n992.LJLJI.awemeCover);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final N99 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        int i2;
        if (C59859NeR.LIZ()) {
            i2 = R.layout.bcv;
        } else {
            i2 = R.layout.bct;
        }
        N99 n99 = new N99(C28289B8j.LIZ(viewGroup, i2, viewGroup, false), this.LJLIL, this.LJLJI.LJLJJI);
        C0AX.LIZ(viewGroup, n99.itemView, R.id.lj7);
        View view = n99.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (n99.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(N99.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) n99.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(n99.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = N99.class.getName();
        return n99;
    }

    public N98(XXU xxu, int i, List list) {
        this.LJLJI = xxu;
        this.LJLIL = i;
        this.LJLILLLLZI = list;
    }
}
