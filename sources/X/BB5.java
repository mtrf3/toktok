package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.CaptchaLiveWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BB5 extends CountDownTimer {
    public final /* synthetic */ CaptchaLiveWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        BZI LIZ = C28787BRn.LIZ("livesdk_captcha_fail_popup_show");
        LIZ.LJIILLIIL(this.LIZ.dataChannel);
        LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() - this.LIZ.LJLILLLLZI) / 1000), "live_duration");
        LIZ.LJJIIJZLJL();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        TextView textView;
        StringBuilder LIZ;
        CaptchaLiveWidget captchaLiveWidget = this.LIZ;
        int i = (int) (j / 1000);
        captchaLiveWidget.getClass();
        int i2 = i / 60;
        int i3 = i % 60;
        View view = captchaLiveWidget.getView();
        if (view == null || (textView = (TextView) view.findViewById(R.id.b4j)) == null) {
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = C169696lJ.LIZIZ('0', i2);
        if (i3 < 10) {
            LIZ = X1D.LIZ();
            LIZ.append('0');
        } else {
            LIZ = X1D.LIZ();
            LIZ.append("");
        }
        LIZ.append(i3);
        objArr[1] = X1D.LIZIZ(LIZ);
        textView.setText(C15380j0.LJIILL(R.string.mol, objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BB5(CaptchaLiveWidget captchaLiveWidget, long j) {
        super(j, 1000L);
        this.LIZ = captchaLiveWidget;
    }
}
