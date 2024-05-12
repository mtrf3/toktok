package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusContainerChangeEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpLeftListChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpRightListChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U1J implements U08 {
    public C76485U0b<U1S> LIZ;

    @Override // X.U08
    public final void LIZ() {
    }

    @Override // X.U08
    public final void LIZLLL(DataChannel dataChannel, boolean z, boolean z2) {
    }

    @Override // X.U08
    public final void LJFF() {
    }

    @Override // X.U08
    public final int LJI() {
        return 0;
    }

    @Override // X.U08
    public final void LIZIZ() {
        C76485U0b<U1S> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U1S u1s = c76485U0b.LIZIZ;
            u1s.LJLJLLL = null;
            u1s.LJLJJL = null;
            u1s.LJLJJLL = false;
            return;
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }

    @Override // X.U08
    public final View getView() {
        C76485U0b<U1S> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U1S u1s = c76485U0b.LIZIZ;
            o.LJIIIIZZ(u1s, "battleMvpObserverView.view");
            return u1s;
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }

    @Override // X.U08
    public final void start() {
        C76485U0b<U1S> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            U1S u1s = c76485U0b.LIZIZ;
            Iterator it = ((ArrayList) u1s.LJLL).iterator();
            while (it.hasNext()) {
                U1T u1t = (U1T) it.next();
                u1t.LJFF = -1L;
                u1t.LJI = -1;
            }
            Iterator it2 = ((ArrayList) u1s.LJLLI).iterator();
            while (it2.hasNext()) {
                U1T u1t2 = (U1T) it2.next();
                u1t2.LJFF = -1L;
                u1t2.LJI = -1;
            }
            u1s.LJLJLLL = null;
            u1s.LJLJJL = null;
            u1s.LJLJJLL = false;
            u1s.LIZLLL(null, true);
            u1s.LIZLLL(null, false);
            u1s.post(U1H.LJLIL);
            return;
        }
        o.LJIJI("battleMvpObserverView");
        throw null;
    }

    @Override // X.U08
    public final void LJ(AqS179S0100000_13 aqS179S0100000_13) {
        C76485U0b<U1S> c76485U0b = this.LIZ;
        if (c76485U0b != null) {
            c76485U0b.LIZIZ.setClickCallback(aqS179S0100000_13);
        } else {
            o.LJIJI("battleMvpObserverView");
            throw null;
        }
    }

    @Override // X.U08
    public final void LIZJ(U0Z u0z, MatchBaseWidget matchBaseWidget) {
        C76484U0a LIZ = u0z.LIZ(R.id.fkc);
        LIZ.LJFF = C76857UEj.LJLILLLLZI;
        LIZ.LJ = matchBaseWidget;
        this.LIZ = LIZ.LIZIZ(BattleMvpLeftListChannel.class, U1M.LIZ).LIZIZ(BattleMvpRightListChannel.class, U1N.LIZ).LIZIZ(BattleIsCurrentWinChannel.class, U1L.LIZ).LIZIZ(BattleBonusContainerChangeEvent.class, U1K.LIZ).LIZ();
    }
}
