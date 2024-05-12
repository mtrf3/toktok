package X;

import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Handler;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.UnU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78256UnU implements WO9 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Handler LIZLLL = new Handler();
    public final SoundPool LJ;
    public final LinkedList<Integer> LJFF;
    public Integer LJI;

    public final void LIZIZ() {
        Integer poll = this.LJFF.poll();
        this.LJI = poll;
        if (poll != null) {
            this.LJ.play(poll.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            this.LIZLLL.postDelayed(new ARunnableS49S0100000_13(this, 94), 1000L);
        }
    }

    @Override // X.WO9
    public final void release() {
        this.LIZLLL.removeCallbacksAndMessages(null);
        this.LJ.release();
        this.LJI = null;
        this.LJFF.clear();
    }

    public C78256UnU(Context context) {
        SoundPool build = new SoundPool.Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
        o.LJIIIIZZ(build, "run {\n            val au…ibutes).build()\n        }");
        this.LJ = build;
        this.LIZ = build.load(context, R.raw.shot_count_down_a, 1);
        this.LIZIZ = build.load(context, R.raw.shot_count_down_b, 1);
        this.LIZJ = build.load(context, R.raw.shot_count_down_c, 1);
        this.LJFF = new LinkedList<>();
    }

    @Override // X.WO9
    public final void LIZ(int i) {
        if (i == 10) {
            int i2 = 0;
            do {
                this.LJFF.offer(Integer.valueOf(this.LIZ));
                i2++;
            } while (i2 < 7);
        }
        this.LJFF.offer(Integer.valueOf(this.LIZIZ));
        this.LJFF.offer(Integer.valueOf(this.LIZIZ));
        this.LJFF.offer(Integer.valueOf(this.LIZJ));
        LIZIZ();
    }
}
