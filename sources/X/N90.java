package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N90 extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final CommerceMusicSubstituteMusicListViewModel LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final CommerceMusicLogger LJLJI;
    public final InterfaceC88472Yns<MusicModel, C76800UCe> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return i == 0 ? 101 : 102;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((N4T) V1M.LIZLLL(this.LJLIL.LJLJJLL).getValue()).LJLIL.size() + 1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C58878N8w) {
            ((C58878N8w) holder).LJLLL.setValue(Integer.valueOf(i - 1));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder viewHolder;
        o.LJIIIZ(parent, "parent");
        if (i == 101) {
            viewHolder = new N5K(C1FL.LIZIZ(parent, R.layout.a89, parent, false, "from(parent.context).inf…et_header, parent, false)"), this.LJLILLLLZI, V1M.LIZLLL(this.LJLIL.LJLJJLL));
        } else {
            C58878N8w c58878N8w = new C58878N8w(C1FL.LIZIZ(parent, R.layout.a8_, parent, false, "from(parent.context).inf…item_view, parent, false)"), this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            CommerceMusicSubstituteMusicListViewModel viewModel = this.LJLIL;
            o.LJIIIZ(viewModel, "viewModel");
            LifecycleOwnerKt.getLifecycleScope(c58878N8w.LJLILLLLZI).launchWhenStarted(new C59009NDx(viewModel, c58878N8w, null));
            viewHolder = c58878N8w;
        }
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
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

    public N90(CommerceMusicSubstituteMusicListViewModel viewModel, LifecycleOwner lifecycleOwner, CommerceMusicLogger logger, AqS141S0200000_10 aqS141S0200000_10) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(logger, "logger");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = logger;
        this.LJLJJI = aqS141S0200000_10;
    }
}
