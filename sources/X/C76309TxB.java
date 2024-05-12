package X;

import Y.AObserverS81S0100000_13;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multihost.biz.feed.InteractionFeedTitleViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TxB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76309TxB {
    public InterfaceC75871Tq7 LIZIZ;
    public FrameLayout LIZJ;
    public ConstraintLayout LIZLLL;
    public LinearLayout LJ;
    public ConstraintLayout LJFF;
    public C47061t0 LJI;
    public final InteractionFeedTitleViewModel LIZ = new InteractionFeedTitleViewModel();
    public final C76388TyS LJII = new C76388TyS();
    public final C76356Txw LJIIIIZZ = new C76356Txw();
    public final AObserverS81S0100000_13 LJIIIZ = new AObserverS81S0100000_13(this, 64);

    public final void LIZ() {
        ConstraintLayout constraintLayout = this.LIZLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            LinearLayout linearLayout = this.LJ;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                this.LIZ.hv0();
                this.LJII.getClass();
                C29306Beo.LJJIFFI(null);
                return;
            }
            o.LJIJI("battlePunishCountDownLayout");
            throw null;
        }
        o.LJIJI("battleCountDownLayout");
        throw null;
    }
}
