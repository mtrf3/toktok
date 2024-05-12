package X;

import Y.ACListenerS44S1100000_5;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.IllegalReviewDialog;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BtA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30196BtA implements BYU, C10U {
    public final Context LJLIL;
    public final DataChannel LJLILLLLZI;
    public final C10W LJLJI;
    public IllegalReviewDialog LJLJJI;
    public final LiveIllegalPresenter LJLJJL;
    public final ActivityC45651qj LJLJJLL;
    public boolean LJLJL;

    @Override // X.BYU
    public final void S8(boolean z) {
    }

    @Override // X.BYU
    public final void Xe() {
        C30868C9o.LIZLLL(R.string.sx4, this.LJLIL);
    }

    @Override // X.BYU
    public final void aa() {
        FragmentManager fragmentManager;
        if (this.LJLJL || this.LJLJJLL == null || (fragmentManager = (FragmentManager) this.LJLILLLLZI.kv0(C29494Bhq.class)) == null) {
            return;
        }
        IllegalReviewDialog illegalReviewDialog = this.LJLJJI;
        if (illegalReviewDialog == null) {
            Context context = this.LJLIL;
            LiveIllegalPresenter liveIllegalPresenter = this.LJLJJL;
            illegalReviewDialog = new IllegalReviewDialog();
            illegalReviewDialog.LJLIL = context;
            illegalReviewDialog.LJLLILLLL = liveIllegalPresenter;
            LiveIllegalPresenter liveIllegalPresenter2 = this.LJLJJL;
            if (liveIllegalPresenter2 != null) {
                liveIllegalPresenter2.setIllegalDialogFragment(illegalReviewDialog);
            }
            illegalReviewDialog.show(fragmentManager, "IllegalReviewDialog");
        }
        this.LJLJJI = illegalReviewDialog;
    }

    @Override // X.BYU
    public final void jd() {
        C29689Bkz.LIZ.LJIIL(C30194Bt8.LJLIL);
        this.LJLJI.Lc(10004);
        this.LJLJI.Ta(8, C78857UxB.LJJIIJ(1476788483, "bpea-580"));
    }

    @Override // X.BYU
    public final void n0() {
        if (this.LJLJL) {
            return;
        }
        new DialogC30679C2h(this.LJLJJLL).LJJIIJZLJL(new ACListenerS44S1100000_5(this, 4));
    }

    @Override // X.BYU
    public final void kg(CharSequence charSequence) {
        if (this.LJLJL) {
            return;
        }
        new DialogC30679C2h(this.LJLJJLL).LJLJJI.setText(charSequence);
    }

    @Override // X.BYU
    public final void s5(CharSequence charSequence) {
        if (this.LJLJL) {
            return;
        }
        new DialogC30679C2h(this.LJLJJLL).LJLJJL.setText(charSequence);
    }

    @Override // X.BYU
    public final void Sd(String str, boolean z) {
        if (this.LJLJL) {
            return;
        }
        DialogC30679C2h dialogC30679C2h = new DialogC30679C2h(this.LJLJJLL);
        dialogC30679C2h.LJLJJLL.setEnabled(z);
        dialogC30679C2h.LJLJJLL.setText(str);
    }

    public C30196BtA(Room mRoom, Context context, DataChannel dataChannel, C10W stopLiveListener) {
        o.LJIIIZ(mRoom, "mRoom");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(stopLiveListener, "stopLiveListener");
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = stopLiveListener;
        this.LJLJJLL = C29306Beo.LIZIZ(context);
        LiveIllegalPresenter liveIllegalPresenter = new LiveIllegalPresenter(mRoom.getId(), context);
        liveIllegalPresenter.attachView(this);
        this.LJLJJL = liveIllegalPresenter;
    }
}
