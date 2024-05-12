package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttm.player.IMediaDataSource;
import java.io.FileDescriptor;

/* renamed from: X.Ip1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47775Ip1 {
    void LIZ(FileDescriptor fileDescriptor, long j, long j2);

    String LIZIZ(int i);

    int LIZJ(float f, int i);

    void LIZLLL(int i, String str);

    void LJ(int i, int i2);

    long LJFF(int i, long j);

    boolean LJI();

    void LJII(IMediaDataSource iMediaDataSource);

    void LJIIIIZZ();

    void LJIIIZ(Context context, android.net.Uri uri);

    void LJIIJ(boolean z);

    int LJIIJJI(int i, int i2);

    void LJIIL(int i, int i2);

    void LJIILIIL(C47811Ipb c47811Ipb);

    void LJIILJJIL(InterfaceC48415IzL interfaceC48415IzL);

    void LJIILL(C47811Ipb c47811Ipb);

    void LJIILLIIL(InterfaceC48418IzO interfaceC48418IzO);

    void LJIIZILJ(InterfaceC48417IzN interfaceC48417IzN);

    void LJIJ(Context context, android.net.Uri uri, java.util.Map<String, String> map);

    void LJIJI(C47811Ipb c47811Ipb);

    void LJIJJ(String str);

    void LJIJJLI(InterfaceC48414IzK interfaceC48414IzK);

    void LJIL(InterfaceC48416IzM interfaceC48416IzM);

    int getCurrentPosition();

    int getDuration();

    float getFloatOption(int i, float f);

    long getLongOption(int i, long j);

    int getPlayerType();

    int getVideoHeight();

    int getVideoWidth();

    boolean isMute();

    boolean isPlaying();

    void pause();

    void prepareAsync();

    void release();

    void reset();

    void seekTo(int i);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setLooping(boolean z);

    void setPlaybackParams(C46886Iag c46886Iag);

    void setSurface(Surface surface);

    void setVolume(float f, float f2);

    void start();

    void stop();
}
