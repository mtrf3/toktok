package com.ss.ttm.player;

import X.C03880Dg;
import X.C07670Rv;
import X.C0H1;
import X.C16880lQ;
import X.C39519Ff9;
import X.C48263Iwt;
import X.C65300Pk0;
import X.J2M;
import X.O5Y;
import X.P44;
import X.UC7;
import X.V10;
import X.V16;
import X.X1D;
import Y.ARunnableS30S0200000_11;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes12.dex */
public class AJVoice implements AudioTrack.OnPlaybackPositionUpdateListener {
    public static final int LJJIJIL = Build.VERSION.SDK_INT;
    public static boolean LJJIJL;
    public static String LJJIJLIJ;
    public AudioTrack LIZ;
    public TTPlayer LIZIZ;
    public int LJI;
    public AudioManager LJII;
    public int LJIIIIZZ;
    public int LJIIJJI;
    public byte[] LJIILIIL;
    public Method LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJJ;
    public P44 LJJIFFI;
    public ConditionVariable LJJII;
    public int LJJIII;
    public ByteBuffer LJJIIZ;
    public boolean LJJIIZI;
    public long LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public long mNativeObject;
    public int LIZJ = 2048;
    public int LIZLLL = 44100;
    public int LJ = 2;
    public int LJFF = 2;
    public int LJIIIZ = 2;
    public float LJIIJ = -1.0f;
    public volatile boolean LJIIL = true;
    public int LJIILJJIL = -1;
    public long LJIL = -9223372036854775807L;
    public int LJJI = 3;
    public int LJJIIJ = -1;
    public int LJJIIJZLJL = -1;

    public static Object LIZ(Object obj, Method method) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, null}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "5822406184100679614"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, null);
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onMarkerReached(AudioTrack audioTrack) {
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public final long LIZJ() {
        int playState = this.LIZ.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.LIZ.getPlaybackHeadPosition() & 4294967295L;
        if (playbackHeadPosition == 0 && this.LJIJJLI > 0 && playState == 3) {
            if (this.LJIL == -9223372036854775807L) {
                this.LJIL = SystemClock.elapsedRealtime();
            }
            return this.LJIJJLI;
        }
        this.LJIL = -9223372036854775807L;
        this.LJIJJLI = playbackHeadPosition;
        return playbackHeadPosition;
    }

    public final boolean LIZLLL() {
        if (this.LJIL != -9223372036854775807L && this.LJIJJ > 0 && SystemClock.elapsedRealtime() - this.LJIL >= 200) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a8, code lost:
    
        if (r12 != false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJ() {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.LJ():int");
    }

    public final int LJI() {
        this.LJIJJ = 0L;
        this.LJIIZILJ = 0;
        this.LJIL = -9223372036854775807L;
        this.LJIJI = 0L;
        this.LJIJJLI = 0L;
        this.LJIIJ = -1.0f;
        AudioTrack audioTrack = this.LIZ;
        this.LIZ = null;
        try {
            audioTrack.flush();
            audioTrack.release();
        } catch (Exception unused) {
        } catch (Throwable th) {
            LJ();
            throw th;
        }
        return LJ();
    }

    public void close() {
        AudioTrack audioTrack = this.LIZ;
        if (audioTrack != null) {
            this.LIZ = null;
            try {
                V16.LIZLLL(new ARunnableS30S0200000_11(this, audioTrack, 20));
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create close thread fail = ");
                LIZ.append(th);
                O5Y.LJII("JAJVoice", this, X1D.LIZIZ(LIZ));
                LJFF(audioTrack);
            }
        }
        O5Y.LJI("JAJVoice", this, "JAJVoice#$");
    }

    public void flush() {
        try {
            P44 p44 = this.LJJIFFI;
            if (p44 != null) {
                p44.LJI = 0L;
                p44.LJIILLIIL = 0;
                p44.LJIILL = 0;
                p44.LJII = 0L;
                p44.LIZIZ = null;
                p44.LIZJ = null;
            }
            this.LJJIII = -1;
            this.LIZ.flush();
            if (this.LJIJJ > 0) {
                this.LJIJJ = 0L;
            }
        } catch (Throwable unused) {
        }
    }

    public int getAvailableBufferSize() {
        long j = this.LJIJJ;
        int playState = this.LIZ.getPlayState();
        long j2 = 0;
        if (playState != 1) {
            long playbackHeadPosition = this.LIZ.getPlaybackHeadPosition() & 4294967295L;
            if (J2M.LIZ <= 29) {
                if (playbackHeadPosition == 0 && this.LJIJJLI > 0 && playState == 3) {
                    if (this.LJIL == -9223372036854775807L) {
                        this.LJIL = SystemClock.elapsedRealtime();
                    }
                    j2 = this.LJIJJLI;
                } else {
                    this.LJIL = -9223372036854775807L;
                }
            }
            if (this.LJIJJLI > playbackHeadPosition) {
                this.LJJIJ++;
            }
            this.LJIJJLI = playbackHeadPosition;
            j2 = playbackHeadPosition + (this.LJJIJ << 32);
        }
        return this.LJIILLIIL - ((int) (j - (j2 * this.LJJIJIIJI)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        if (r16 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getCurrentPositionMs() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.getCurrentPositionMs():int");
    }

    public int getEOSDelayMs() {
        long j;
        long LIZIZ = ((this.LJIJJ / LIZIZ(this.LJIIIZ, this.LJ)) * 1000) / this.LIZLLL;
        long LIZJ = (LIZJ() * 1000) / this.LIZLLL;
        if (getLatency() > 0) {
            j = this.LJIIZILJ - this.LJIJ;
        } else {
            j = 0;
        }
        return (int) ((LIZIZ - LIZJ) + j);
    }

    public int getLatency() {
        if (this.LJJIJIIJIL == 0) {
            LIZJ();
        }
        if (this.LJIILL != null) {
            long nanoTime = System.nanoTime() / 1000000;
            if (nanoTime - this.LJIJI > 500) {
                try {
                    int intValue = ((Integer) LIZ(this.LIZ, this.LJIILL)).intValue();
                    this.LJIIZILJ = intValue;
                    int max = Math.max(intValue, 0);
                    this.LJIIZILJ = max;
                    if (max > 5000) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Ignoring impossibly large audio latency: ");
                        LIZ.append(this.LJIIZILJ);
                        O5Y.LJII("JAJVoice", this, X1D.LIZIZ(LIZ));
                        this.LJIIZILJ = 0;
                    }
                } catch (Exception unused) {
                    this.LJIILL = null;
                }
                this.LJIJI = nanoTime;
            }
        }
        return this.LJIIZILJ;
    }

    public int getSessionId() {
        AudioTrack audioTrack;
        int i = this.LJJIIJ;
        if (i == -1 && (audioTrack = this.LIZ) != null) {
            return audioTrack.getAudioSessionId();
        }
        return i;
    }

    public int getUnderRunCount() {
        AudioTrack audioTrack;
        if (Build.VERSION.SDK_INT >= 24 && (audioTrack = this.LIZ) != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    public float getVolume() {
        AudioManager audioManager;
        int i = 0;
        if (this.LIZIZ != null && this.LJIIJ == -1.0f && (audioManager = this.LJII) != null) {
            try {
                int LLLLLLZZ = C16880lQ.LLLLLLZZ(audioManager, this.LJJI);
                try {
                    i = this.LJII.getStreamVolume(this.LJJI);
                } catch (Exception unused) {
                }
                if (i < 0) {
                    if (LLLLLLZZ > 0) {
                        return LLLLLLZZ / 4;
                    }
                    return 10.0f;
                }
            } catch (Exception unused2) {
            }
        }
        return i;
    }

    public void pause() {
        try {
            P44 p44 = this.LJJIFFI;
            if (p44 != null) {
                p44.LJI = 0L;
                p44.LJIILLIIL = 0;
                p44.LJIILL = 0;
                p44.LJII = 0L;
                if (p44.LJIIZILJ == -9223372036854775807L) {
                    p44.LIZJ.LIZ();
                }
            }
            this.LIZ.pause();
        } catch (Throwable unused) {
        }
    }

    public void resume() {
        try {
            P44 p44 = this.LJJIFFI;
            if (p44 != null) {
                AudioTrack audioTrack = this.LIZ;
                int i = this.LJIIIZ;
                p44.LIZJ(audioTrack, i, LIZIZ(i, this.LJ), this.LJIILLIIL);
                this.LJJIFFI.LIZJ.LIZ();
            }
            this.LIZ.play();
        } catch (Throwable unused) {
        }
    }

    public int start() {
        if (this.LIZ == null) {
            O5Y.LJFF("JAJVoice", this, "audiotrack start before created");
            return -2;
        }
        this.LJIIL = false;
        try {
            P44 p44 = this.LJJIFFI;
            if (p44 != null) {
                AudioTrack audioTrack = this.LIZ;
                int i = this.LJIIIZ;
                p44.LIZJ(audioTrack, i, LIZIZ(i, this.LJ), this.LJIILLIIL);
            }
            this.LIZ.play();
            this.LJIILJJIL = -1;
            if (LJJIJL) {
                this.LJJ = SystemClock.elapsedRealtime();
            }
            return 0;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("audioTrack start failed = ");
            LIZ.append(th);
            O5Y.LJFF("JAJVoice", this, X1D.LIZIZ(LIZ));
            return -3;
        }
    }

    public void stop() {
        if (this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        try {
            P44 p44 = this.LJJIFFI;
            if (p44 != null) {
                p44.LJI = 0L;
                p44.LJIILLIIL = 0;
                p44.LJIILL = 0;
                p44.LJII = 0L;
                if (p44.LJIIZILJ == -9223372036854775807L) {
                    p44.LIZJ.LIZ();
                }
            }
            this.LIZ.pause();
        } catch (Throwable unused) {
        }
    }

    public AJVoice() {
        O5Y.LJI("JAJVoice", this, "JAJVoice#^");
        this.LJJIII = -1;
        if (LJJIJLIJ == null) {
            String str = Build.DEVICE;
            LJJIJLIJ = str;
            if (str.equals("OnePlus6T")) {
                LJJIJL = true;
            }
        }
    }

    public int getMaxVolume() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getMaxVolume:");
        LIZ.append(this.LJIIJJI);
        X1D.LIZIZ(LIZ);
        return this.LJIIJJI;
    }

    public ByteBuffer getPCMFrameBuffer() {
        return this.LJJIIZ;
    }

    public int getTrackBufferSize() {
        return this.LJIILLIIL;
    }

    public final void LJFF(AudioTrack audioTrack) {
        if (audioTrack == null) {
            return;
        }
        try {
            if (LJJIJL) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJJ;
                if (elapsedRealtime <= 80) {
                    Thread.sleep(80 - elapsedRealtime);
                }
            }
        } catch (Exception unused) {
        }
        try {
            audioTrack.release();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release in invalid state = ");
            LIZ.append(e);
            O5Y.LJII("JAJVoice", this, X1D.LIZIZ(LIZ));
        }
    }

    public void setAudioTrackSmoothClock(int i) {
        if (J2M.LIZ >= 21 && i > 0) {
            this.LJJIFFI = new P44();
            this.LJJII = new ConditionVariable(true);
        }
    }

    public void setCalibrationType(int i) {
        UC7.LIZLLL("type: ", i);
        this.LJJIJIIJIL = i;
    }

    public void setContentType(int i) {
        UC7.LIZLLL("setContentType contentType=", i);
        this.LJJIIJZLJL = i;
        if (this.LIZIZ != null && LJI() == 0) {
            start();
        }
    }

    public void setSessionId(int i) {
        UC7.LIZLLL("setSessionId : ", i);
        this.LJJIIJ = i;
        if (this.LIZIZ != null && LJI() == 0) {
            start();
        }
    }

    public void setStreamType(int i) {
        UC7.LIZLLL("set Stream type : ", i);
        this.LJJI = i;
        if (this.LIZIZ != null && LJI() == 0) {
            start();
        }
    }

    public void setUseDirectBuffer(boolean z) {
        C07670Rv.LIZLLL("useDirectBuffer: ", z);
        this.LJJIIZI = z;
    }

    public static int LIZIZ(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            throw new IllegalArgumentException();
        }
        return i2 * 2;
    }

    public int open(long j, TTPlayer tTPlayer) {
        this.mNativeObject = j;
        C16880lQ.LLLZI(Locale.US, "native object:%d", new Object[]{Long.valueOf(j)});
        this.LIZIZ = tTPlayer;
        int LJ = LJ();
        if (LJ == 0) {
            float f = this.LJIIJ;
            if (f != -1.0f) {
                setVolume(f, f);
            }
            try {
                this.LJIILL = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        return LJ;
    }

    public void setTrackVolume(float f, float f2) {
        AudioTrack audioTrack = this.LIZ;
        if (audioTrack != null) {
            if (LJJIJIL < 21) {
                audioTrack.setStereoVolume(f, f2);
            } else {
                audioTrack.setVolume(f);
            }
        }
    }

    public void setVolume(float f, float f2) {
        AudioTrack audioTrack;
        try {
            int i = this.LJIIJJI;
            if (i < f) {
                f = i;
            }
            if (f2 != -1048575.0f || (audioTrack = this.LIZ) == null) {
                AudioManager audioManager = this.LJII;
                if (audioManager != null) {
                    audioManager.setStreamVolume(this.LJJI, (int) f, 0);
                }
            } else {
                audioTrack.setStereoVolume(f, f2);
            }
            this.LJIIJ = f;
        } catch (Exception unused) {
        }
    }

    public int write(int i, int i2, int i3) {
        int write;
        int i4 = 0;
        if (this.LJIIL) {
            return 0;
        }
        if (this.LJIILJJIL != i3) {
            this.LJIILJJIL = i3;
            if (this.LJIJJ > 0) {
                this.LIZ.flush();
            }
        }
        try {
            if (J2M.LIZ >= 21) {
                write = this.LIZ.write(this.LJJIIZ, i2, 0);
            } else {
                this.LJJIIZ.get(this.LJIILIIL, i, i2);
                write = this.LIZ.write(this.LJIILIIL, 0, i2);
            }
            if (write < 0) {
                O5Y.LJFF("JAJVoice", this, C48263Iwt.LIZLLL("write failed : ret: ", write, ", size = ", i2));
                return write;
            }
            this.LJIJJ += write;
            if (LIZLLL() && LJI() == 0) {
                i4 = start();
            }
            this.LJJIIZ.clear();
            if (i4 == 0) {
                return write;
            }
            return i4;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("write fail = ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public int write(byte[] bArr, int i, int i2, int i3) {
        int start;
        if (bArr == null || bArr.length == 0) {
            O5Y.LJFF("JAJVoice", this, "buffer is nullpoint");
            return -10;
        }
        if (this.LJIIL) {
            return 0;
        }
        if (this.LJIILJJIL != i3) {
            this.LJIILJJIL = i3;
            if (this.LJIJJ > 0) {
                this.LIZ.flush();
            }
        }
        try {
            int write = this.LIZ.write(bArr, i, i2);
            if (write < 0) {
                O5Y.LJFF("JAJVoice", this, C48263Iwt.LIZLLL("write failed : ret: ", write, ", size = ", i2));
                return write;
            }
            this.LJIJJ += write;
            if (!LIZLLL() || LJI() != 0 || (start = start()) == 0) {
                return write;
            }
            return start;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("write fail = ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public int write(byte[] bArr, int i, int i2, int i3, long j) {
        if (bArr == null || bArr.length == 0) {
            O5Y.LJFF("JAJVoice", this, "buffer is nullpoint");
            return -10;
        }
        if (this.LJIIL) {
            return 0;
        }
        if (this.LJIILJJIL != i3) {
            this.LJIILJJIL = i3;
            P44 p44 = this.LJJIFFI;
            if (p44 != null && this.LJJII != null) {
                if (this.LJIJJ > 0) {
                    if (p44.LIZIZ.getPlayState() == 3) {
                        this.LIZ.pause();
                    }
                    P44 p442 = this.LJJIFFI;
                    p442.LJI = 0L;
                    p442.LJIILLIIL = 0;
                    p442.LJIILL = 0;
                    p442.LJII = 0L;
                    p442.LIZIZ = null;
                    p442.LIZJ = null;
                    this.LJJIII = -1;
                    this.LJJII.close();
                    this.LJIJJ = 0L;
                    AudioTrack audioTrack = this.LIZ;
                    this.LIZ = null;
                    V16.LIZLLL(new ARunnableS30S0200000_11(this, audioTrack, 21));
                    this.LJJII.block();
                    LJ();
                    start();
                    this.LJIILJJIL = i3;
                }
            } else if (this.LJIJJ > 0) {
                this.LIZ.flush();
            }
        }
        int i4 = this.LJJIII;
        if (i4 == -1) {
            this.LJJIII = (int) Math.max(0L, j);
        } else {
            long LIZIZ = (((this.LJIJJ / LIZIZ(this.LJIIIZ, this.LJ)) * 1000) / this.LIZLLL) + i4;
            if (Math.abs(LIZIZ - j) > 200) {
                StringBuilder LIZJ = V10.LIZJ("Discontinuity detected [expected ", LIZIZ, ", got ");
                O5Y.LJFF("JAJVoice", this, C0H1.LIZJ(LIZJ, j, "]", LIZJ));
                this.LJJIII = (int) (this.LJJIII + (j - LIZIZ));
            }
        }
        try {
            int write = this.LIZ.write(bArr, i, i2);
            if (write < 0) {
                O5Y.LJFF("JAJVoice", this, C48263Iwt.LIZLLL("write failed : ret: ", write, ", size = ", i2));
                return write;
            }
            this.LJIJJ += write;
            if (LIZLLL() && LJI() == 0) {
                int start = start();
                this.LJIILJJIL = i3;
                if (start == 0) {
                    return write;
                }
                return start;
            }
            return write;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("write fail = ");
            LIZ.append(e);
            X1D.LIZIZ(LIZ);
            C16880lQ.LLLLIIL(e);
            return -1;
        }
    }

    public void setSampleInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LIZJ = i4;
        this.LJFF = i6;
        this.LJI = i5;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mBlockSize:");
        LIZ.append(this.LIZJ);
        X1D.LIZIZ(LIZ);
    }
}
