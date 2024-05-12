package X;

import com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Bb2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29072Bb2 extends AbstractC60811Ntn {
    public final /* synthetic */ LiveGoalPinCardWidget LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI.LJLJJI = new CountDownTimerC29073Bb3(this.LJLJI, this.LJLILLLLZI);
        CountDownTimerC29073Bb3 countDownTimerC29073Bb3 = this.LJLILLLLZI.LJLJJI;
        if (countDownTimerC29073Bb3 != null) {
            countDownTimerC29073Bb3.start();
        }
        this.LJLILLLLZI.show();
    }

    public C29072Bb2(long j, LiveGoalPinCardWidget liveGoalPinCardWidget) {
        this.LJLILLLLZI = liveGoalPinCardWidget;
        this.LJLJI = j;
    }
}
