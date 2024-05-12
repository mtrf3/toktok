package X;

import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;

/* loaded from: classes6.dex */
public final class BX7 extends CountDownTimer {
    public final /* synthetic */ TryModeGoLiveWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        LiveDialog liveDialog = this.LIZ.LJLJJI;
        if (liveDialog != null) {
            liveDialog.dismiss();
        }
        this.LIZ.LJZL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BX7(TryModeGoLiveWidget tryModeGoLiveWidget) {
        super(5500L, 1000L);
        this.LIZ = tryModeGoLiveWidget;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        int i = ((int) j) / 1000;
        LiveDialog liveDialog = this.LIZ.LJLJJI;
        if (liveDialog != null) {
            SpannableString LJLZ = TryModeGoLiveWidget.LJLZ(i);
            if (TextUtils.isEmpty(liveDialog.LJZI) && TextUtils.isEmpty(LJLZ)) {
                return;
            }
            liveDialog.LJIJJLI(null, LJLZ);
        }
    }
}
