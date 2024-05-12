package X;

import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import org.json.JSONObject;

/* renamed from: X.IWh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC46747IWh {
    void LIZ(String str);

    float LIZIZ(int i);

    <T> T LIZJ(IU1<T> iu1);

    boolean LIZLLL();

    C38798FKo LJ();

    void LJFF(float f);

    void LJI(C74152vb c74152vb);

    void LJJIIJ(float f);

    void LJJJLIIL();

    void LJJJLL(OnUIPlayListener onUIPlayListener);

    void LJJJLZIJ(int i);

    void LJJJZ();

    void LJJL();

    void LJJLI();

    void LJJLIIIIJ(InterfaceC46803IYl interfaceC46803IYl);

    void LJJLIIIJ(int i, JSONObject jSONObject);

    void LJJLIIIJILLIZJL(int i);

    void LJJLIIIJJI();

    void LJJLIIIJJIZ(InterfaceC46826IZi interfaceC46826IZi);

    void LJJLIIIJL();

    boolean LJJLIIIJLJLI(OnUIPlayListener onUIPlayListener);

    void LJJLIIIJLLLLLLLZ(int i);

    String LJJLIIJ(int i);

    void LJJLIL();

    void LJJLJ(IX4 ix4);

    void LJJLJLI(C46755IWp c46755IWp);

    void LJJLL(InterfaceC46942Iba interfaceC46942Iba);

    void LJJZ(int i, Bundle bundle);

    void LJJZZI(ITX itx);

    void LJJZZIII(IWT iwt);

    void LJL(Bundle bundle);

    void LJLI(boolean z);

    void LJLIIIL(IX4 ix4);

    void LJLIIL(InterfaceC46832IZo interfaceC46832IZo);

    void LJLIL(EnumC38817FLh enumC38817FLh);

    void LJLILLLLZI(String str);

    void LJLJI(IWT iwt);

    void LJLJJI(int i);

    void LJLJJL();

    int LJLJJLL();

    boolean LJLJL(String str, String str2);

    void LJLJLJ(InterfaceC46754IWo interfaceC46754IWo);

    void LJLJLLL(int i, int i2);

    void LJLL(boolean z, Bundle bundle);

    void LJLLI(C46543IOl c46543IOl);

    void LJLLILLLL();

    void LJLLJ(Surface surface);

    String LJLLL();

    void LJLLLL(IVL ivl);

    void LJLLLLLL(InterfaceC47128Iea interfaceC47128Iea);

    boolean LJLZ();

    long getCurrentPosition();

    long getDuration();

    ITZ getPlayerType();

    int getState();

    ITI getVideoInfo();

    int getWatchedDuration();

    void init();

    boolean isLoading();

    boolean isMute();

    boolean isPaused();

    boolean isPlaying();

    void pause();

    void release();

    void resume();

    void setDisplay(SurfaceHolder surfaceHolder);

    void setSurface(Surface surface);

    void setVolume(float f, float f2);

    void start();

    void stop();
}
