package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRightScoreChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76476Tzs implements InterfaceC76488U0e {
    public C76485U0b<U2A> LIZ;

    @Override // X.InterfaceC76488U0e
    public final View LIZ() {
        C76485U0b<U2A> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            return c76485U0b.LIZIZ.getLeftTextView$liveinteract_impl_release();
        }
        o.LJIJI("healthBarObserverView");
        throw null;
    }

    @Override // X.InterfaceC76488U0e
    public final void LIZJ() {
        C76485U0b<U2A> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            c76485U0b.LIZIZ.LJII(true);
        } else {
            o.LJIJI("healthBarObserverView");
            throw null;
        }
    }

    @Override // X.InterfaceC76488U0e
    public final View getView() {
        C76485U0b<U2A> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U2A u2a = c76485U0b.LIZIZ;
            o.LJIIIIZZ(u2a, "healthBarObserverView.getView()");
            return u2a;
        }
        o.LJIJI("healthBarObserverView");
        throw null;
    }

    @Override // X.InterfaceC76488U0e
    public final void onDestroy() {
        C76485U0b<U2A> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U2A u2a = c76485U0b.LIZIZ;
            DataChannel dataChannel = u2a.LJLLJ;
            if (dataChannel != null) {
                dataChannel.jv0(u2a);
            }
            u2a.LJLLJ = null;
            u2a.LJII(false);
            return;
        }
        o.LJIJI("healthBarObserverView");
        throw null;
    }

    @Override // X.InterfaceC76488U0e
    public final void LIZIZ(U0Z u0z, DataChannel dataChannel, MatchBaseWidget matchBaseWidget) {
        C76484U0a LIZ = u0z.LIZ(R.id.nai);
        LIZ.LJFF = new U0X(dataChannel);
        LIZ.LJ = matchBaseWidget;
        this.LIZ = LIZ.LIZIZ(BattleLeftScoreChannel.class, C76425Tz3.LIZ).LIZIZ(BattleRightScoreChannel.class, C76424Tz2.LIZ).LIZ();
    }
}
