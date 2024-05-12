package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusContainerChangeEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpRightListChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1I implements U08 {
    public C76485U0b<U1X> LIZ;

    @Override // X.U08
    public final void LIZ() {
        C76485U0b<U1X> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            c76485U0b.LIZIZ.LIZ();
        } else {
            o.LJIJI("battleMvpObserverView");
            throw null;
        }
    }

    @Override // X.U08
    public final void LIZIZ() {
        C76485U0b<U1X> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            c76485U0b.LIZIZ.LIZIZ();
        } else {
            o.LJIJI("battleMvpObserverView");
            throw null;
        }
    }

    @Override // X.U08
    public final void LJFF() {
        U1Y u1y;
        ImageView imageView;
        C76485U0b<U1X> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U1X u1x = c76485U0b.LIZIZ;
            if (o.LJ(u1x.LJLJJL, Boolean.TRUE)) {
                u1y = u1x.LJLJLLL;
            } else {
                u1y = u1x.LJLLL;
            }
            if (u1y == null || (imageView = (ImageView) u1y.findViewById(R.id.gv8)) == null) {
                return;
            }
            imageView.setVisibility(0);
            imageView.setAlpha(1.0f);
            return;
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }

    @Override // X.U08
    public final int LJI() {
        C76485U0b<U1X> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            return c76485U0b.LIZIZ.getMvpWidth();
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }

    @Override // X.U08
    public final View getView() {
        C76485U0b<U1X> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U1X u1x = c76485U0b.LIZIZ;
            o.LJIIIIZZ(u1x, "battleMvpObserverView.view");
            return u1x;
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }

    @Override // X.U08
    public final void start() {
        C76485U0b<U1X> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U1X u1x = c76485U0b.LIZIZ;
            u1x.LIZIZ();
            u1x.LIZ();
            FrameLayout frameLayout = u1x.LJLL;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            u1x.post(U1G.LJLIL);
            return;
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }

    @Override // X.U08
    public final void LJ(AqS179S0100000_13 aqS179S0100000_13) {
        C76485U0b<U1X> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            c76485U0b.LIZIZ.setClickCallback(aqS179S0100000_13);
        } else {
            o.LJIJI("battleMvpObserverView");
            throw null;
        }
    }

    @Override // X.U08
    public final void LIZJ(U0Z u0z, MatchBaseWidget matchBaseWidget) {
        C76484U0a LIZ = u0z.LIZ(R.id.fkd);
        LIZ.LJFF = C31073CHl.LJLJJLL;
        LIZ.LJ = matchBaseWidget;
        this.LIZ = LIZ.LIZIZ(BattleMvpLeftListChannel.class, U1Q.LIZ).LIZIZ(BattleMvpRightListChannel.class, U1R.LIZ).LIZIZ(BattleIsCurrentWinChannel.class, U1P.LIZ).LIZIZ(BattleBonusContainerChangeEvent.class, U1O.LIZ).LIZ();
    }

    @Override // X.U08
    public final void LIZLLL(DataChannel dataChannel, boolean z, boolean z2) {
        C76485U0b<U1X> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U1X u1x = c76485U0b.LIZIZ;
            u1x.LJLJJLL = dataChannel;
            u1x.LJLJI = z;
            u1x.LJLJJI = z2;
            return;
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }
}
