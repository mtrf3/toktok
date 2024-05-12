package X;

import android.view.SurfaceView;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;

/* loaded from: classes14.dex */
public interface U9U {
    void LIZ(SurfaceView surfaceView, String str);

    void LIZIZ(int i, long j);

    void LIZJ(int i, String str, Exception exc);

    void LIZLLL(long j, String str);

    void LJ(long j, int i);

    void LJFF(int i, String str, Exception exc);

    void LJI();

    void LJII(int i, String str, Exception exc);

    void LJIIIIZZ();

    void LJIIIZ();

    void LJIIJ(String str);

    void LJIIJJI(String str, String str2);

    void LJIIL(long j, long j2);

    void LJIILIIL();

    void LJIILJJIL(int i, long j, Object... objArr);

    void LJIILL(String str);

    void LJIILLIIL(Boolean bool, String str);

    void LJIIZILJ(String str, ILayerControl.ILayer iLayer);

    void LJIJ(String str, ILayerControl.ILayer iLayer);

    void LJIJI(Boolean bool, String str);

    void LJJII(int i, int i2, String str);

    void LJJIII(String str, String str2);

    void LJJIIJ(String[] strArr, boolean[] zArr, int[] iArr);

    void LJJIJIL(String str, SurfaceView surfaceView, int i, int i2);

    void onRemoteVideoStats(RemoteStreamStats remoteStreamStats);

    void onUserJoined(String str);
}
