package X;

import X.N5J;
import Y.ACListenerS30S0100000_10;
import Y.IDeS362S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.N8z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58881N8z extends AbstractC029409q<N5J> {
    public final CommerceMusicSubstituteMusicVideoViewModel LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final CommerceMusicLogger LJLJI;
    public final InterfaceC88472Yns<MusicModel, C76800UCe> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((N4O) V1M.LIZLLL(this.LJLIL.LJLJI).getValue()).LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(N5J n5j, int i) {
        N5J holder = n5j;
        o.LJIIIZ(holder, "holder");
        holder.LJLJLJ.setValue(Integer.valueOf(i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final N5J com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        final N5J n5j = new N5J(C1FL.LIZIZ(parent, R.layout.a8b, parent, false, "from(parent.context).inf…item_view, parent, false)"), this.LJLILLLLZI, this.LJLJI, this.LJLIL, this.LJLJJI);
        InterfaceC65462ha LJIIJJI = V1M.LJIIJJI(new IDeS362S0100000_10(new C70342pS(V1M.LIZLLL(n5j.LJLJJI.LJLJI), n5j.LJLJLJ, new NEX(null)), 1));
        Object value = n5j.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-shootButton>(...)");
        C16880lQ.LJJIZ((SY4) value, new ACListenerS30S0100000_10(n5j, 125));
        Object value2 = n5j.LJLLI.getValue();
        o.LJIIIIZZ(value2, "<get-playPauseButton>(...)");
        C16880lQ.LJJJ((TuxIconView) value2, new ACListenerS30S0100000_10(n5j, 126));
        Object value3 = n5j.LJLLJ.getValue();
        o.LJIIIIZZ(value3, "<get-coverImageView>(...)");
        C16880lQ.LJJIJLIJ((SmartImageView) value3, new ACListenerS30S0100000_10(n5j, 127));
        Object value4 = n5j.LJLJLLL.getValue();
        o.LJIIIIZZ(value4, "<get-playerView>(...)");
        C16880lQ.LJIILJJIL((FrameLayout) value4, new ACListenerS30S0100000_10(n5j, 128));
        n5j.LJLILLLLZI.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v1.CommerceMusicSubstituteMusicVideoViewHolder$bindUiState$5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_PAUSE) {
                    N5J.this.L().stop();
                }
            }
        });
        n5j.L().LJII(n5j);
        LifecycleOwnerKt.getLifecycleScope(n5j.LJLILLLLZI).launchWhenStarted(new NEK(LJIIJJI, n5j, null));
        C0AX.LIZ(parent, n5j.itemView, R.id.lj7);
        View view = n5j.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (n5j.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(N5J.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) n5j.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(n5j.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = N5J.class.getName();
        return n5j;
    }

    public C58881N8z(CommerceMusicSubstituteMusicVideoViewModel viewModel, LifecycleOwner lifecycleOwner, CommerceMusicLogger logger, AqS141S0200000_10 aqS141S0200000_10) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(logger, "logger");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = logger;
        this.LJLJJI = aqS141S0200000_10;
    }
}
