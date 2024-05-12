package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.0s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC21020s6 {
    boolean LIZ(String str, JSONObject jSONObject, boolean z);

    int LIZIZ(float f);

    void LIZJ(Cert cert);

    void LIZLLL(Cert cert);

    void LJ(Bundle bundle, C30529ByX c30529ByX);

    void LJFF(Cert cert);

    AudioDeviceModule LJII();

    void LJIIIIZZ(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    void LJIIIZ(float f);

    void LJIIJ(List<String> list);

    void LJIIJJI(AbstractC39330Fc6 abstractC39330Fc6);

    void LJIIL(boolean z, AbstractC39330Fc6 abstractC39330Fc6);

    void LJIILIIL(Bundle bundle, CKK ckk);

    void LJIILL(Bitmap bitmap, Cert cert);

    void LJIILLIIL(Cert cert);

    void LJIIZILJ();

    void LJIJ(boolean z);

    void LJIJI(Cert cert);

    void LJIJJ(float f);

    void LJIJJLI(AbstractC39330Fc6 abstractC39330Fc6);

    long LJIL();

    int LJJ();

    void LJJI(C78862UxG c78862UxG);

    void LJJIFFI(C1KW c1kw);

    void LJJII(AbstractC39330Fc6 abstractC39330Fc6);

    void LJJIII(boolean z, String str, BZG bzg);

    void LJJIIJ(AbstractC39330Fc6 abstractC39330Fc6);

    void LJJIIJZLJL(int i, Cert cert);

    void LJJIIZ(Bundle bundle, CKV ckv);

    void LJJIIZI(Cert cert);

    void LJJIJ(View view);

    Client create(InteractConfig interactConfig);

    IAudioFilterManager getAudioFilterMgr();

    int getExposureCompensationRange();

    LiveCore getLiveCore();

    IFilterManager getVideoFilterMgr();

    void setErrorListener(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener);

    void setExposureCompensation(float f);

    void setFocusAreas(int i, int i2, int i3, int i4);

    void setInfoListener(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener);

    void setStreamCallback(InterfaceC21030s7 interfaceC21030s7);

    void setTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener);

    void start(String str);

    void start(List<String> list);

    void stop();
}
