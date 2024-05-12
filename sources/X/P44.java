package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class P44 {
    public final long[] LIZ;
    public AudioTrack LIZIZ;
    public P45 LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public Method LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7747154901639256113"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final long LIZIZ() {
        int playState;
        AudioTrack audioTrack = this.LIZIZ;
        long j = 0;
        if (this.LJIIZILJ != -9223372036854775807L) {
            j = Math.min(0L, ((((SystemClock.elapsedRealtime() * 1000) - this.LJIIZILJ) * this.LIZLLL) / 1000000) + 0);
        } else if (audioTrack != null && (playState = audioTrack.getPlayState()) != 1) {
            long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
            if (this.LJ) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.LJIILJJIL = this.LJIIL;
                }
                playbackHeadPosition += this.LJIILJJIL;
            }
            if (J2M.LIZ <= 28) {
                if (playbackHeadPosition == 0 && this.LJIIL > 0 && playState == 3) {
                    if (this.LJIJ == -9223372036854775807L) {
                        this.LJIJ = SystemClock.elapsedRealtime();
                    }
                    j = this.LJIIL;
                } else {
                    this.LJIJ = -9223372036854775807L;
                }
            }
            if (this.LJIIL > playbackHeadPosition) {
                this.LJIILIIL++;
            }
            this.LJIIL = playbackHeadPosition;
            j = playbackHeadPosition + (this.LJIILIIL << 32);
        }
        return (j * 1000000) / this.LIZLLL;
    }

    public P44() {
        if (J2M.LIZ >= 18) {
            try {
                this.LJIIIIZZ = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.LIZ = new long[10];
    }

    public final void LIZJ(AudioTrack audioTrack, int i, int i2, int i3) {
        boolean z;
        long j;
        this.LIZIZ = audioTrack;
        this.LIZJ = new P45(audioTrack);
        int sampleRate = audioTrack.getSampleRate();
        this.LIZLLL = sampleRate;
        boolean z2 = false;
        if (J2M.LIZ < 23 && (i == 5 || i == 6)) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = z;
        if (i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4) {
            z2 = true;
        }
        this.LJIIJ = z2;
        if (z2) {
            j = ((i3 / i2) * 1000000) / sampleRate;
        } else {
            j = -9223372036854775807L;
        }
        this.LJFF = j;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIIZILJ = -9223372036854775807L;
        this.LJIJ = -9223372036854775807L;
        this.LJIIIZ = 0L;
    }
}
