package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N91 extends AbstractC029409q<C58879N8x> {
    public final RecommendMusicV2ViewModel LJLIL;
    public final LifecycleOwner LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((N4T) V1M.LIZLLL(this.LJLIL.LJLJJL).getValue()).LJLIL.size();
    }

    public N91(RecommendMusicV2ViewModel recommendMusicV2ViewModel, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = recommendMusicV2ViewModel;
        this.LJLILLLLZI = lifecycleOwner;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C58879N8x c58879N8x, int i) {
        C58879N8x holder = c58879N8x;
        o.LJIIIZ(holder, "holder");
        holder.LJLLILLLL.setValue(Integer.valueOf(i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C58879N8x com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C58879N8x c58879N8x = new C58879N8x(C1FL.LIZIZ(parent, R.layout.a68, parent, false, "from(parent.context).inf…card_view, parent, false)"), this.LJLILLLLZI);
        RecommendMusicV2ViewModel viewModel = this.LJLIL;
        o.LJIIIZ(viewModel, "viewModel");
        LifecycleOwnerKt.getLifecycleScope(c58879N8x.LJLILLLLZI).launchWhenStarted(new C59008NDw(viewModel, c58879N8x, null));
        C0AX.LIZ(parent, c58879N8x.itemView, R.id.lj7);
        View view = c58879N8x.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c58879N8x.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C58879N8x.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c58879N8x.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c58879N8x.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C58879N8x.class.getName();
        return c58879N8x;
    }
}
