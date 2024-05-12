package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TmZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75651TmZ<T> implements InterfaceC64592gB {
    public static final C75651TmZ<T> LJLIL = new C75651TmZ<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        long j;
        List<ImageModel> list;
        long j2;
        long j3;
        String str;
        TopicPairResponse.ResponseData responseData;
        TopicPairResponse.ResponseData.Setting setting;
        TopicPairResponse.ResponseData responseData2;
        TopicPairResponse.ResponseData.Setting setting2;
        TopicPairResponse.ResponseData responseData3;
        TopicPairResponse.ResponseData responseData4;
        TopicPairResponse.ResponseData responseData5;
        BaseResponse baseResponse = (BaseResponse) obj;
        B5G.LIZIZ().LJIILIIL(EnumC75636TmK.MATCH);
        if (baseResponse != null && (responseData5 = (TopicPairResponse.ResponseData) baseResponse.data) != null) {
            j = responseData5.pairId;
        } else {
            j = 0;
        }
        C75650TmY.LJII = j;
        C75650TmY c75650TmY = C75650TmY.LIZ;
        TopicPairResponse.ResponseData.Setting setting3 = null;
        if (baseResponse != null && (responseData4 = (TopicPairResponse.ResponseData) baseResponse.data) != null) {
            list = responseData4.rivalAvatars;
        } else {
            list = null;
        }
        C75650TmY.LJIIIZ = list;
        if (baseResponse != null && (responseData3 = (TopicPairResponse.ResponseData) baseResponse.data) != null) {
            setting3 = responseData3.setting;
        }
        C75650TmY.LJIIJ = setting3;
        if (baseResponse != null && (responseData2 = (TopicPairResponse.ResponseData) baseResponse.data) != null && (setting2 = responseData2.setting) != null) {
            j2 = setting2.expectSuccSec;
        } else {
            j2 = 16;
        }
        C75650TmY.LJIIJJI = j2;
        if (baseResponse != null && (responseData = (TopicPairResponse.ResponseData) baseResponse.data) != null && (setting = responseData.setting) != null) {
            j3 = setting.timeoutSec;
        } else {
            j3 = 180;
        }
        C75650TmY.LJIIL = j3;
        C0NB.LIZIZ("TopicPairManager", "start topic pair success");
        InterfaceC92693kP LJJJLIIL = C265112h.LIZ(AbstractC73672Svk.LJJIIZI(0L, 1000L, TimeUnit.MILLISECONDS)).LJJJLIIL(C75666Tmo.LJLIL, C75667Tmp.LJLIL);
        C73318Sq2 c73318Sq2 = C75650TmY.LIZJ;
        c73318Sq2.LIZ(LJJJLIIL);
        C75650TmY.LIZLLL = (C73411SrX) LJJJLIIL;
        long j4 = C75650TmY.LJIIL;
        C0NB.LIZIZ("TopicPairManager", "start topic roundtable pair timeout countdown");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        InterfaceC92693kP LJJJLIIL2 = AbstractC73672Svk.LJJLIIIJLJLI(j4, timeUnit).LJII(new C62705OjF()).LJJJLIIL(C75658Tmg.LJLIL, C75656Tme.LJLIL);
        c73318Sq2.LIZ(LJJJLIIL2);
        C75650TmY.LJ = (C73411SrX) LJJJLIIL2;
        C8E.LIZLLL().LJJJZ(C75607Tlr.class, C75650TmY.LJIILJJIL);
        C8E.LIZLLL().LJJJZ(C75678Tn0.class, C75650TmY.LJIILL);
        C8E.LIZLLL().LJJJZ(C75677Tmz.class, C75650TmY.LJIILLIIL);
        DataChannel dataChannel = C75650TmY.LIZIZ;
        if (dataChannel != null) {
            dataChannel.mv0(MultiCoHostStateChannel.class, c75650TmY, C75659Tmh.LJLIL);
        }
        C75878TqE c75878TqE = new C75878TqE();
        int value = EnumC75660Tmi.ACTION_PAIR.getValue();
        if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
            str = "";
        }
        c75878TqE.LJJLIIIJILLIZJL(value, str);
        InterfaceC92693kP LJJJJZI = C265112h.LIZ(AbstractC73672Svk.LJJIIZI(4L, 4L, timeUnit)).LJJJJZI(C75654Tmc.LJLIL);
        C75650TmY.LJFF = (C73411SrX) LJJJJZI;
        c73318Sq2.LIZ(LJJJJZI);
    }
}
