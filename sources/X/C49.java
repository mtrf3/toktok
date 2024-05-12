package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.PauseTimeChannel;
import com.bytedance.android.livesdk.broadcast.interaction.widget.pause.PauseLiveWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class C49 extends CountDownTimer {
    public final /* synthetic */ PauseLiveWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LJLZ(C4A.END_LIVE);
        UPJ.LJFF(17, C73943T0h.LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49(PauseLiveWidget pauseLiveWidget) {
        super(LivePreviewNetworkSpeedThresholdSetting.DEFAULT, 1000L);
        this.LIZ = pauseLiveWidget;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        StringBuilder LIZ;
        TextView textView;
        PauseLiveWidget pauseLiveWidget = this.LIZ;
        int i = (int) (j / 1000);
        pauseLiveWidget.getClass();
        int i2 = i % 60;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('0');
        LIZ2.append(i / 60);
        LIZ2.append(':');
        if (i2 < 10) {
            LIZ = X1D.LIZ();
            LIZ.append('0');
        } else {
            LIZ = X1D.LIZ();
            LIZ.append("");
        }
        LIZ.append(i2);
        LIZ2.append(X1D.LIZIZ(LIZ));
        String LIZIZ = X1D.LIZIZ(LIZ2);
        View view = pauseLiveWidget.getView();
        if (view != null && (textView = (TextView) view.findViewById(R.id.m3d)) != null) {
            textView.setText(LIZIZ);
        }
        pauseLiveWidget.dataChannel.rv0(PauseTimeChannel.class, LIZIZ);
    }
}
