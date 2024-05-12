package X;

import android.os.CountDownTimer;
import com.ss.android.ugc.musicprovider.provider.MusicPlayer;
import java.util.LinkedList;

/* renamed from: X.Iz6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CountDownTimerC48400Iz6 extends CountDownTimer {
    public final /* synthetic */ LinkedList<String> LIZ;
    public final /* synthetic */ MusicPlayer LIZIZ;
    public final /* synthetic */ C47325Ihl LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        if (C79004UzY.LJJIFFI(this.LIZ)) {
            this.LIZIZ.LJI(0, 0);
            return;
        }
        this.LIZIZ.LJIIIIZZ(this.LIZJ, this.LIZ, this.LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC48400Iz6(LinkedList<String> linkedList, MusicPlayer musicPlayer, C47325Ihl c47325Ihl, boolean z, long j) {
        super(j, 1000L);
        this.LIZ = linkedList;
        this.LIZIZ = musicPlayer;
        this.LIZJ = c47325Ihl;
        this.LIZLLL = z;
    }
}
