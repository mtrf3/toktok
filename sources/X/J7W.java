package X;

import android.content.Context;
import com.lynx.tasm.base.LLog;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.FileDescriptor;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J7W implements InterfaceC80053VbN {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final int LIZ;
    public final C62822Ol8 LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public volatile boolean LJ;
    public volatile boolean LJFF;
    public volatile long LJI;
    public final InterfaceC48640J7c LJII;

    public final TTVideoEngine LJIIJ() {
        return (TTVideoEngine) this.LIZIZ.getValue();
    }

    public final void LJIIJJI() {
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = 0L;
    }

    @Override // X.InterfaceC80053VbN
    public final int LIZIZ() {
        return LJIIJ().LIZ.LJJJZ;
    }

    @Override // X.InterfaceC80053VbN
    public final long LJFF() {
        return LJIIJ().LJJIIJZLJL(60);
    }

    @Override // X.InterfaceC80053VbN
    public final boolean LJIIIIZZ() {
        Object obj;
        try {
            try {
                obj = EW5.LIZ(LJIIJ());
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
                obj = null;
                o.LJFF(obj, "Reflect.getField(mTTEngine, \"mIsPlayComplete\")");
                return ((Boolean) obj).booleanValue();
            } catch (NoSuchFieldException e2) {
                C16880lQ.LLLLIIL(e2);
                obj = null;
                o.LJFF(obj, "Reflect.getField(mTTEngine, \"mIsPlayComplete\")");
                return ((Boolean) obj).booleanValue();
            }
            o.LJFF(obj, "Reflect.getField(mTTEngine, \"mIsPlayComplete\")");
            return ((Boolean) obj).booleanValue();
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isPlayingCompletion: ");
            LIZ.append(android.util.Log.getStackTraceString(th));
            LLog.LIZLLL(4, "TTAudioEngineImpl", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    @Override // X.InterfaceC80053VbN
    public final EnumC79954VZm LJIIZILJ() {
        return C48646J7i.LIZ(LJIIJ().LIZ.LJIIL);
    }

    @Override // X.InterfaceC80053VbN
    public final long getCurrentPlaybackTime() {
        return LJIIJ().LJIJ();
    }

    @Override // X.InterfaceC80053VbN
    public final long getDuration() {
        return LJIIJ().LJIL();
    }

    @Override // X.InterfaceC80053VbN
    public final void pause() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> stop(),  already pause ?: ");
        if (LJIIJ().LJJIJIIJIL() == 2) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        if (LJIIJ().LJJIJIIJIL() == 2) {
            return;
        }
        LJIIJ().LJJL();
    }

    @Override // X.InterfaceC80053VbN
    public final void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> release(),  mIsEngineInstantiate ?: ");
        LIZ.append(this.LIZJ);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        if (this.LIZJ) {
            LJIIJ().LJZI(null);
            LJIIJ().LJJLIIIJILLIZJL();
        } else {
            J7Z.LIZ("TTAudioEngineImpl", "TTVideoEngine is not instantiate, ignore release.");
        }
    }

    @Override // X.InterfaceC80053VbN
    public final void resume() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> resume(),  isPlaying ?: ");
        if (LJIIJ().LIZ.LJIIL == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        if (LJIIJ().LJJIJIIJIL() == 2) {
            LJIIJ().LJJLI();
        }
    }

    @Override // X.InterfaceC80053VbN
    public final void stop() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> stop(),  already stop ?: ");
        if (LJIIJ().LJJIJIIJIL() == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        if (LJIIJ().LJJIJIIJIL() == 0) {
            return;
        }
        LJIIJ().LLJJJJJIL();
    }

    @Override // X.InterfaceC80053VbN
    public final void LIZJ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> play(),  startPlayTime is ");
        LIZ.append(j);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        this.LJFF = true;
        if (this.LJ) {
            LJIIJ().LJJLI();
        }
    }

    @Override // X.InterfaceC80053VbN
    public final void LIZLLL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> setLocalURL(),  localFilePath is ");
        LIZ.append(str);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        LJIIJJI();
        LJIIJ().LL(str);
        LJIIJ().LJJLIIIIJ();
    }

    @Override // X.InterfaceC80053VbN
    public final void LJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> setDirectURL(),  playUrl is ");
        LIZ.append(str);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        LJIIJJI();
        LJIIJ().LJLJJLL(str);
        LJIIJ().LJJLIIIIJ();
    }

    public J7W(Context context, C80048VbI c80048VbI) {
        o.LJIIJ(context, "context");
        this.LJII = c80048VbI;
        this.LIZ = 300;
        this.LIZIZ = C221108m2.LIZIZ(new AqS155S0200000_8(this, context, 40));
    }

    @Override // X.InterfaceC80053VbN
    public final void LJI(long j, C80055VbP c80055VbP) {
        StringBuilder LIZJ = V10.LIZJ(" ---> seekToTime(),  time is ?: ", j, ",   mIsSeeking : ");
        LIZJ.append(this.LIZLLL);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZJ));
        if (!this.LIZLLL) {
            long j2 = 0;
            if (j >= 0) {
                this.LIZLLL = true;
                long duration = getDuration() - 2000;
                if (0 < duration) {
                    j2 = duration;
                }
                if (j > j2) {
                    j = j2;
                }
                LJIIJ().LJJLIIIJLJLI((int) j, new J7X(this, c80055VbP, j));
                return;
            }
        }
        if (c80055VbP != null) {
            c80055VbP.LIZ(j, false);
        }
    }

    @Override // X.InterfaceC80053VbN
    public final void LJII(String str, String str2) {
        J7Z.LIZIZ("TTAudioEngineImpl", C0ON.LIZJ(" ---> setDirectUrlUseDataLoader(),  playUrl is ", str, ",   cacheKey is ", str2));
        LJIIJJI();
        LJIIJ().LJLJL(str, str2);
        LJIIJ().LJJLIIIIJ();
    }

    @Override // X.InterfaceC80053VbN
    public final void LJIIIZ(EnumC47176IfM enumC47176IfM, C47164IfA c47164IfA) {
        LJIIJJI();
        if (c47164IfA == null) {
            J7Z.LIZIZ("TTAudioEngineImpl", "videoMode is empty");
            return;
        }
        LJIIJ().LLJJIJIIJIL(c47164IfA);
        LJIIJ().LJII(enumC47176IfM);
        LJIIJ().LJJLIIIIJ();
    }

    @Override // X.InterfaceC80053VbN
    public final void LIZ(FileDescriptor fileDescriptor, long j, long j2) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> setDataSource(),  FileDescriptor is ");
        if (fileDescriptor != null) {
            str = fileDescriptor.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        J7Z.LIZIZ("TTAudioEngineImpl", X1D.LIZIZ(LIZ));
        LJIIJJI();
        LJIIJ().LJLJJI(fileDescriptor, j, j2);
    }
}
