package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcLiveVideoParam;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.List;

/* loaded from: classes14.dex */
public interface U8M {
    java.util.Map<String, OnLineMicInfo> LIZ();

    OnLineMicInfo LIZIZ(String str);

    void LIZJ(java.util.Map<Integer, Integer> map);

    java.util.Map<String, OnLineMicInfo> LIZLLL();

    void LJ(InterfaceC75804Tp2 interfaceC75804Tp2);

    List<LinkUser> LJFF();

    LinkUser LJI(String str);

    OnLineMicInfo LJII(String str);

    int LJIIIIZZ();

    boolean LJIIIZ();

    void LJIIJ(InterfaceC75804Tp2 interfaceC75804Tp2);

    DataChannel LJIIL();

    int LJIILIIL(int i);

    java.util.Map<String, OnLineMicInfo> LJIILJJIL();

    boolean LJIILL(String str);

    void LJIILLIIL(String str, boolean z);

    void LJIIZILJ(int i, String str, UC6 uc6);

    int LJIJ();

    LinkUser LJIJI(long j);

    void LJIJJ(java.util.Map<String, String> map);

    OnLineMicInfo LJIJJLI(String str);

    LinkUser LJIL(String str);

    LinkUser LJJ(String str);

    void LJJI(int i, int i2, UC4 uc4);

    void LJJIFFI();

    OnLineMicInfo LJJII(String str);

    LinkUser LJJIII(long j);

    String LJJIIJ();

    java.util.Map<String, OnLineMicInfo> LJJIIJZLJL();

    void LJJIIZ(String str);

    List<LinkUser> LJJIIZI();

    void LJJIJ();

    boolean LJJIJIIJI(String str);

    ILayerControl.ILayer LJJIJIIJIL();

    void LJJIJIL(RtcLiveVideoParam rtcLiveVideoParam);

    EnumC53637L3h LJJIJL();

    void LJJIJLIJ(LinkLayerRTCMessage linkLayerRTCMessage);

    void LJJIL();

    void LJJIZ(String str, Client.RTCWaterMarkRegion rTCWaterMarkRegion);

    boolean LJJJ();

    void LJJJI(U8L u8l);

    void LJJJIL(List<LinkUser> list, List<LinkUser> list2);

    boolean LJJJJ();

    void LJJJJI();

    void LJJJJIZL(List<LinkUser> list, List<LinkUser> list2);

    void LLLLLLLLL(InterfaceC76768UAy<JoinRtcChannelResult> interfaceC76768UAy);

    ILayerControl.ILayer getLayer(String str);

    void removeAllWaterMarks();
}
