package X;

import android.os.CountDownTimer;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;

/* renamed from: X.Jek, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CountDownTimerC49686Jek extends CountDownTimer {
    public final /* synthetic */ MusicPlayHelper LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.hv0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC49686Jek(long j, MusicPlayHelper musicPlayHelper) {
        super(j, 1000L);
        this.LIZ = musicPlayHelper;
    }
}
