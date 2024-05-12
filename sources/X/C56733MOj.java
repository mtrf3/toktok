package X;

import Y.ACListenerS29S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.MOj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56733MOj extends C56766MPq implements InterfaceC56737MOn, G27 {
    public C56736MOm LJLJI;
    public final C5H3 LJLILLLLZI = V1B.LJZI(new AqS159S0100000_9(this, 954));
    public final List<C56732MOi> LJLJJI = C56734MOk.LIZ();
    public int LJLJJL = LiveLayoutPreloadThreadPriority.DEFAULT;

    @Override // X.C56766MPq
    public final void LJFF() {
        if (LIZ().isViewValid()) {
            LJIIL();
        }
    }

    @Override // X.C56766MPq
    public final void LJI() {
        if (LIZ().isViewValid()) {
            LJIIL();
        }
    }

    @Override // X.C56766MPq
    public final void LJII() {
        Intent intent;
        ActivityC45651qj mo49getActivity = LIZ().mo49getActivity();
        if (mo49getActivity != null && (intent = mo49getActivity.getIntent()) != null && intent.getBooleanExtra("is_from_push", false) && ((BaseNotificationVM) this.LJLILLLLZI.getValue()).az() != C56702MNe.LIZ) {
            C56736MOm c56736MOm = this.LJLJI;
            if (c56736MOm != null) {
                ((LiveData) c56736MOm.LJLJJL.LJLIL.getValue()).postValue(Integer.valueOf(C56702MNe.LIZ));
            }
            m6((C56732MOi) ListProtector.get(this.LJLJJI, 0));
        }
    }

    public final void LJIIL() {
        int LJ;
        View LJIIJJI = LJIIJJI(R.id.fbh);
        if (C53405Kxd.LIZLLL()) {
            LJIIJJI.setVisibility(8);
            return;
        }
        int i = this.LJLJJL;
        if (i == Integer.MIN_VALUE) {
            LJ = C54362LVe.LJIILJJIL(C56702MNe.LIZ);
        } else if (ENR.LIZ()) {
            LJ = C54362LVe.LJIIIZ().LJIJJ(i);
        } else {
            LJ = C54362LVe.LJIIL().LJ(i);
        }
        if (LJ > 0) {
            LJIIJJI.setVisibility(0);
        } else {
            LJIIJJI.setVisibility(8);
        }
    }

    @Override // X.C56766MPq
    public final void LIZLLL() {
        C42625Go9.LIZJ(this);
    }

    @Override // X.C56766MPq
    public final void LIZJ(Bundle bundle) {
        C42625Go9.LIZIZ(this);
        ActivityC45651qj mo49getActivity = LIZ().mo49getActivity();
        if (mo49getActivity != null) {
            C9XU.LIZ(mo49getActivity.hashCode(), this);
        }
    }

    @Override // X.InterfaceC56737MOn
    public final void m6(C56732MOi struct) {
        int i;
        o.LJIIIZ(struct, "struct");
        Context context = LIZ().getContext();
        if (context == null) {
            return;
        }
        ((BaseNotificationVM) this.LJLILLLLZI.getValue()).gv0(struct);
        TextView textView = (TextView) LJIIJJI(R.id.m81);
        if (struct.LJLIL == C56702MNe.LIZ) {
            i = R.string.iw5;
        } else {
            i = struct.LJLILLLLZI;
        }
        textView.setText(context.getString(i));
        C56736MOm c56736MOm = this.LJLJI;
        if (c56736MOm != null) {
            c56736MOm.dismiss();
        }
        t1.LJFF("to_tab_name", ((BaseNotificationVM) this.LJLILLLLZI.getValue()).iN(), "change_notification_tab");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNoticeCountChangedEvent(C54262LRi event) {
        o.LJIIIZ(event, "event");
        if (LIZ().isViewValid()) {
            C56736MOm c56736MOm = this.LJLJI;
            if (c56736MOm != null) {
                c56736MOm.LIZ();
            }
            C56736MOm c56736MOm2 = this.LJLJI;
            if (c56736MOm2 == null || !c56736MOm2.isShowing()) {
                LJIIL();
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onNotificationIndicatorEvent(C54251LQx event) {
        o.LJIIIZ(event, "event");
        if (!ENR.LIZ() && LIZ().isViewValid()) {
            C56736MOm c56736MOm = this.LJLJI;
            if (c56736MOm != null) {
                c56736MOm.LIZ();
            }
            C56736MOm c56736MOm2 = this.LJLJI;
            if (c56736MOm2 == null || !c56736MOm2.isShowing()) {
                LJIIL();
            }
        }
    }

    @Override // X.C56766MPq
    public final void LJIIIZ(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        if (C1DH.LJIJJLI()) {
            return;
        }
        C56732MOi c56732MOi = (C56732MOi) ORZ.LJLLLL(this.LJLJJI);
        if (c56732MOi != null) {
            c56732MOi.LJLJL = this.LJLJJL;
            ((BaseNotificationVM) this.LJLILLLLZI.getValue()).gv0(c56732MOi);
        }
        View LJIIJJI = LJIIJJI(R.id.fn0);
        C7FA.LIZIZ(LJIIJJI);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 149), LJIIJJI);
        LJIIJJI(R.id.f36).setVisibility(0);
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        C56736MOm c56736MOm = this.LJLJI;
        if (c56736MOm != null && c56736MOm.isShowing()) {
            return;
        }
        this.LJLJI = null;
    }
}
