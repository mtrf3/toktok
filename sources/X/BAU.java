package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BAU extends CountDownTimer {
    public final /* synthetic */ DrawGuessStatusWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LLIIIILZ();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        DrawGuessStatusWidget drawGuessStatusWidget = this.LIZ;
        C47121t6 c47121t6 = drawGuessStatusWidget.LJLJI;
        if (c47121t6 != null) {
            c47121t6.setText(DrawGuessStatusWidget.LLFFF(drawGuessStatusWidget.LL((int) (j / 1000))));
        } else {
            o.LJIJI("countDownTextView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BAU(long j, DrawGuessStatusWidget drawGuessStatusWidget) {
        super(j, 1000L);
        this.LIZ = drawGuessStatusWidget;
    }
}
