package X;

import android.os.CountDownTimer;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;

/* renamed from: X.OVv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CountDownTimerC62023OVv extends CountDownTimer {
    public final /* synthetic */ MusicPlayViewModel LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.hv0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC62023OVv(long j, MusicPlayViewModel musicPlayViewModel) {
        super(j, 1000L);
        this.LIZ = musicPlayViewModel;
    }
}
