package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.HashSet;

/* loaded from: classes14.dex */
public interface U9F {
    void LIZ(SurfaceView surfaceView, String str);

    void LJ(long j, int i);

    void LJIIJJI(String str, String str2);

    void LJIIL(long j, long j2);

    void LJIILL(String str);

    HashSet<String> LJIILLIIL(String str);

    void LJIIZILJ(String str, float f, float f2);

    void LJIJ(String str, ILayerControl.ILayer iLayer);

    void LJIJI(String str, String str2);

    void LJIJJLI(String str);

    void LJJI(LinkCoreError linkCoreError);

    void LJJIFFI();

    void LJJII(int i, int i2, String str);

    void LJJIII(String str, String str2);

    void LJJIIJ(String[] strArr, boolean[] zArr, int[] iArr);

    void LJJIIZI(String str, long j);

    void LJJIJIIJIL();

    void LJJIJIL(String str, SurfaceView surfaceView, int i, int i2);

    RTCClientData LJJIJL();

    void LJJIL(String str, boolean z);

    void LJLIIL(RtcStartResultMessage rtcStartResultMessage);

    void LJLJJL();

    void LJLLI(boolean z, LinkCoreError linkCoreError);

    void LJLLLLLL(LinkCoreError linkCoreError);

    void LLF(String str, boolean z);

    void LLFF();

    void LLIFFJFJJ();

    void LLIIIL(Object... objArr);

    void LLILLL(String str);

    void LLIZLLLIL(LinkCoreError linkCoreError);

    void onUserJoined(String str);
}
