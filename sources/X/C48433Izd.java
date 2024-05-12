package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.IMediaDataSource;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Izd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48433Izd implements InterfaceC47775Ip1 {
    public static final List<Throwable> LIZLLL = new ArrayList();
    public static boolean LJ = false;
    public AbstractC48434Ize LIZ;
    public boolean LIZIZ;
    public String LIZJ = "";

    @Override // X.InterfaceC47775Ip1
    public final boolean LJI() {
        return this.LIZ instanceof C48408IzE;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIIIZZ() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJI();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final int getCurrentPosition() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getDuration() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LIZIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getPlayerType() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJI();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getVideoHeight() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJII();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final int getVideoWidth() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJIIIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final boolean isMute() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJIIJ();
        }
        return false;
    }

    @Override // X.InterfaceC47775Ip1
    public final boolean isPlaying() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJIIJJI();
        }
        return false;
    }

    @Override // X.InterfaceC47775Ip1
    public final void pause() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIIL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void prepareAsync() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIILIIL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void release() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIILL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void reset() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIIZILJ();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void start() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJJIZL();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void stop() {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJJJ();
        }
    }

    public static long LJJI(int i) {
        try {
            Class<?> LJI = C47756Ioi.LJI(200, "com.ss.ttm.player.TTPlayerClient");
            Method declaredMethod = LJI.getDeclaredMethod("getDemuxerFactory", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(LJI, Integer.valueOf(i));
            if (invoke == null) {
                return 0L;
            }
            return ((Long) invoke).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final String LIZIZ(int i) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJFF(i);
        }
        return null;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJII(IMediaDataSource iMediaDataSource) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIL(iMediaDataSource);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIJ(boolean z) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIIJ(z);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILIIL(C47811Ipb c47811Ipb) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJLIJ(c47811Ipb);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILJJIL(InterfaceC48415IzL interfaceC48415IzL) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJIIJI(interfaceC48415IzL);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILL(C47811Ipb c47811Ipb) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIL(c47811Ipb);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIILLIIL(InterfaceC48418IzO interfaceC48418IzO) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIZ(interfaceC48418IzO);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIZILJ(InterfaceC48417IzN interfaceC48417IzN) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJL(interfaceC48417IzN);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJI(C47811Ipb c47811Ipb) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIIZI(c47811Ipb);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJJ(String str) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIJI();
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJJLI(InterfaceC48414IzK interfaceC48414IzK) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJ(interfaceC48414IzK);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIL(InterfaceC48416IzM interfaceC48416IzM) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIJIL(interfaceC48416IzM);
        }
    }

    public final void LJJIFFI(AudioProcessor audioProcessor) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize == null) {
            return;
        }
        abstractC48434Ize.setAudioProcessor(audioProcessor);
    }

    @Override // X.InterfaceC47775Ip1
    public final void seekTo(int i) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIJ(i);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJI(surfaceHolder);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void setLooping(boolean z) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIIZ(z);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void setPlaybackParams(C46886Iag c46886Iag) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJ(c46886Iag);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void setSurface(Surface surface) {
        AbstractC48434Ize abstractC48434Ize;
        if ((surface != null && !surface.isValid()) || (abstractC48434Ize = this.LIZ) == null) {
            return;
        }
        abstractC48434Ize.LJJJJ(surface);
    }

    public static boolean LJJ(Context context, C48433Izd c48433Izd) {
        try {
            Class<?> cls = Class.forName("com.ss.ttexo.ExoPlayerClient");
            Method declaredMethod = cls.getDeclaredMethod("create", InterfaceC47775Ip1.class, Context.class);
            declaredMethod.setAccessible(true);
            c48433Izd.LIZ = (AbstractC48434Ize) declaredMethod.invoke(cls, c48433Izd, context);
            return true;
        } catch (Throwable th) {
            C78253UnR.LIZLLL("MediaPlayerWrapper", th.toString());
            c48433Izd.LIZIZ = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c48433Izd.LIZJ);
            LIZ.append(th.toString());
            c48433Izd.LIZJ = X1D.LIZIZ(LIZ);
            ((ArrayList) LIZLLL).add(th);
            return false;
        }
    }

    public static void LJJII(int i, int i2) {
        try {
            Class<?> LJI = C47756Ioi.LJI(200, "com.ss.ttm.player.TTPlayerClient");
            Class<?> cls = Integer.TYPE;
            Method declaredMethod = LJI.getDeclaredMethod("setGlobalIntOptionForKey", cls, cls);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(LJI, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final int LIZJ(float f, int i) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIFFI(f, i);
            return 0;
        }
        return 0;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LIZLLL(int i, String str) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJIL(i, str);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJ(int i, int i2) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJIII(i, i2);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final long LJFF(int i, long j) {
        if (this.LIZ != null) {
            return r0.LJJIIJZLJL(i, j);
        }
        return -1L;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIIZ(Context context, android.net.Uri uri) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIJJ(context, uri);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final int LJIIJJI(int i, int i2) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LIZLLL(i, i2);
        }
        return i2;
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIIL(int i, int i2) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJJJL(i, i2);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final float getFloatOption(int i, float f) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LIZJ(i, f);
        }
        return f;
    }

    @Override // X.InterfaceC47775Ip1
    public final long getLongOption(int i, long j) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            return abstractC48434Ize.LJ(i, j);
        }
        return j;
    }

    @Override // X.InterfaceC47775Ip1
    public final void setVolume(float f, float f2) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJJJI(f, f2);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LIZ(FileDescriptor fileDescriptor, long j, long j2) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJJ(fileDescriptor, j, j2);
        }
    }

    @Override // X.InterfaceC47775Ip1
    public final void LJIJ(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        AbstractC48434Ize abstractC48434Ize = this.LIZ;
        if (abstractC48434Ize != null) {
            abstractC48434Ize.LJIJJLI(context, uri, map);
        }
    }
}
