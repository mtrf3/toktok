package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.broadcast.IsBroadcastPreviewCurrentSceneChannel;
import com.bytedance.android.livesdk.broadcast.IsSpeedTestingChannel;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.VideoPreScheduleStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSpeedTestCountdownTimerSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedMaxTimesSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedTimeoutSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCoreUploadBWProbe;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS171S0100000_5;
import webcast.api.creator.PreScheduleStream;

/* loaded from: classes6.dex */
public final class C9N {
    public final Fragment LIZ;
    public PreScheduleStream LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public LiveCoreUploadBWProbe LJFF;
    public final DataChannel LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public C9T LJIIJ;
    public C9S LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final ARunnableS41S0100000_5 LJIILIIL;
    public final C9Q LJIILJJIL;
    public final C62822Ol8 LJIILL;

    public final C30865C9l LIZ() {
        return (C30865C9l) this.LJIILL.getValue();
    }

    public final void LIZIZ() {
        Boolean bool;
        LiveMode liveMode;
        DataChannel dataChannel = this.LJI;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            bool = Boolean.valueOf(C28509BGv.LJI(liveMode));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool) && this.LJII) {
            C30868C9o.LIZJ(R.string.nrt);
        }
        LJ(C9T.BAD_CONNECTION);
        LJI();
    }

    public final void LIZJ() {
        if (LivePreviewNetworkSpeedSetting.INSTANCE.enable()) {
            C9S c9s = this.LJIIJJI;
            if (c9s != null) {
                c9s.cancel();
            }
            LJII();
            LJI();
            ((C9O) this.LJIIL.getValue()).LIZJ(this.LJIILJJIL);
            ((C9O) this.LJIIL.getValue()).LIZLLL();
            LiveCoreUploadBWProbe liveCoreUploadBWProbe = this.LJFF;
            if (liveCoreUploadBWProbe != null) {
                liveCoreUploadBWProbe.release();
            }
        }
    }

    public final void LJFF() {
        PreScheduleStream preScheduleStream;
        String str;
        Fragment fragment;
        VDR vdr;
        String str2;
        if (this.LJII) {
            PreScheduleStream preScheduleStream2 = this.LIZIZ;
            String str3 = null;
            if (preScheduleStream2 != null) {
                String str4 = preScheduleStream2.speedProbeUrl;
                boolean z = false;
                if (str4 == null || str4.length() == 0 || (preScheduleStream = this.LIZIZ) == null || (str = preScheduleStream.sdkParams) == null || str.length() == 0 || (fragment = this.LIZ) == null || fragment.getContext() == null) {
                    return;
                }
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
                if (!z) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_golive_speedtest");
                    LIZ.LJIJJ(2, "error_code");
                    LIZ.LJIJJ("-999", "call_livecore_speedtest_timestamp");
                    LIZ.LJJIIJZLJL();
                    LIZIZ();
                    return;
                }
                if (this.LJFF == null) {
                    LiveCoreUploadBWProbe liveCoreUploadBWProbe = new LiveCoreUploadBWProbe(new C9R(this));
                    this.LJFF = liveCoreUploadBWProbe;
                    InterfaceC30713C3p SN = C7N.LJIJ().SN();
                    if (SN != null) {
                        vdr = SN.LIZJ();
                    } else {
                        vdr = null;
                    }
                    liveCoreUploadBWProbe.setDns(vdr);
                    LiveCoreUploadBWProbe liveCoreUploadBWProbe2 = this.LJFF;
                    if (liveCoreUploadBWProbe2 != null) {
                        PreScheduleStream preScheduleStream3 = this.LIZIZ;
                        if (preScheduleStream3 == null || (str2 = preScheduleStream3.sdkParams) == null) {
                            str2 = "";
                        }
                        liveCoreUploadBWProbe2.setupSdkParams(str2);
                    }
                }
                C0NB.LIZIZ("VideoPreScheduleHelper", "start test");
                this.LJIIIZ = System.currentTimeMillis();
                BZI LIZ2 = C28787BRn.LIZ("livesdk_client_call_livecore_speedtest");
                LIZ2.LJIILLIIL(this.LJI);
                LIZ2.LJIJJ(Long.valueOf(this.LJIIIZ), "call_livecore_speedtest_timestamp");
                LIZ2.LJJIIJZLJL();
                C30865C9l LIZ3 = LIZ();
                LIZ3.getClass();
                StringBuilder LIZIZ = C25620zW.LIZIZ("recordCallLiveCore: ", CardStruct.IStatusCode.DEFAULT, ", shouldReport: ");
                C19U.LIZJ(LIZIZ, LIZ3.LIZJ, LIZIZ, "LiveSpeedTestLogRecorder");
                if (!LIZ3.LIZJ) {
                    LIZ3.LIZLLL();
                }
                LIZ3.LIZ.put(EnumC30866C9m.LIVECORE_SPEED_TEST_TIME, C30865C9l.LIZ(LIZ3));
                LIZ3.LIZ.put(EnumC30866C9m.LIVECORE_SPEED_TEST_TIME_RESULT, CardStruct.IStatusCode.DEFAULT);
                LiveCoreUploadBWProbe liveCoreUploadBWProbe3 = this.LJFF;
                if (liveCoreUploadBWProbe3 != null) {
                    PreScheduleStream preScheduleStream4 = this.LIZIZ;
                    if (preScheduleStream4 != null) {
                        str3 = preScheduleStream4.speedProbeUrl;
                    }
                    liveCoreUploadBWProbe3.startBWTest(str3);
                }
                C9S c9s = this.LJIIJJI;
                if (c9s != null) {
                    c9s.start();
                }
                LJ(C9T.TESTING);
                this.LIZLLL = SystemClock.elapsedRealtime();
            }
        }
    }

    public final void LJI() {
        if (this.LJ) {
            this.LJ = false;
            DataChannel dataChannel = this.LJI;
            if (dataChannel != null) {
                dataChannel.rv0(IsSpeedTestingChannel.class, Boolean.FALSE);
            }
            C9S c9s = this.LJIIJJI;
            if (c9s != null) {
                c9s.cancel();
            }
            LiveCoreUploadBWProbe liveCoreUploadBWProbe = this.LJFF;
            if (liveCoreUploadBWProbe != null) {
                liveCoreUploadBWProbe.stopBWTest();
            }
        }
    }

    public final void LIZLLL() {
        boolean z;
        InterfaceC28605BKn ho;
        String str;
        LJI();
        this.LJ = true;
        C0NB.LIZIZ("VideoPreScheduleHelper", "start Record");
        LIZ().LIZLLL();
        DataChannel dataChannel = this.LJI;
        if (dataChannel != null) {
            dataChannel.rv0(IsSpeedTestingChannel.class, Boolean.TRUE);
        }
        if (this.LIZJ >= LivePreviewNetworkSpeedMaxTimesSetting.INSTANCE.getValue()) {
            C30865C9l LIZ = LIZ();
            LIZ.getClass();
            LIZ.LJ(C30865C9l.LIZ(LIZ), "3");
            LJI();
            return;
        }
        Fragment fragment = this.LIZ;
        if (fragment == null || fragment.getContext() == null) {
            return;
        }
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_golive_speedtest");
            LIZ2.LJIJJ(2, "error_code");
            LIZ2.LJIJJ("-999", "call_livecore_speedtest_timestamp");
            LIZ2.LJJIIJZLJL();
            C30865C9l LIZ3 = LIZ();
            LIZ3.getClass();
            LIZ3.LJ(C30865C9l.LIZ(LIZ3), "2");
            LIZIZ();
            return;
        }
        this.LIZJ++;
        PreScheduleStream preScheduleStream = this.LIZIZ;
        if (preScheduleStream == null || (str = preScheduleStream.speedProbeUrl) == null || str.length() == 0) {
            C30865C9l LIZ4 = LIZ();
            LIZ4.getClass();
            LIZ4.LJ(C30865C9l.LIZ(LIZ4), CardStruct.IStatusCode.DEFAULT);
            IPullStreamService iPullStreamService = (IPullStreamService) CN1.LIZ(IPullStreamService.class);
            if (iPullStreamService != null && (ho = iPullStreamService.ho()) != null) {
                ho.LIZ();
            }
            C1EW.LIZ(C28718BOw.LIZ().LIZ().preScheduleStream().LJII(BTJ.LIZIZ(this.LIZ))).LJJJLIIL(new AfS57S0100000_5(this, 14), new AfS57S0100000_5(this, 15));
            return;
        }
        LIZ().LJ("-999", "1");
        LIZ().LIZJ("1");
        LJFF();
    }

    public final void LJII() {
        OSZ osz;
        long j;
        String str;
        Integer num;
        Long l;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trigger Report: ");
        C19U.LIZJ(LIZ, LIZ().LIZJ, LIZ, "VideoPreScheduleHelper");
        DataChannel dataChannel = this.LJI;
        if (dataChannel != null) {
            osz = (OSZ) dataChannel.kv0(StartLiveSuccessChannel.class);
        } else {
            osz = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (dataChannelGlobal != null && (l = (Long) dataChannelGlobal.mv0(C30380Bw8.class)) != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        if (osz != null && ((Boolean) osz.getFirst()).booleanValue()) {
            DataChannel dataChannel2 = this.LJI;
            if (dataChannel2 == null || (num = (Integer) dataChannel2.kv0(BGE.class)) == null || num.intValue() != 2) {
                str = "go_live";
            } else {
                str = "continue_live";
            }
            C30865C9l LIZ2 = LIZ();
            DataChannel dataChannel3 = this.LJI;
            String LIZIZ = C29184Bcq.LIZIZ(dataChannel3, Integer.valueOf(C29184Bcq.LIZ(dataChannel3)));
            if (LIZIZ == null) {
                LIZIZ = "";
            }
            LIZ2.LJFF(j, str, LIZIZ, String.valueOf(((Number) osz.getSecond()).longValue()));
            return;
        }
        LIZ().LJFF(j, "active_exit", "", "");
    }

    public C9N(Fragment fragment) {
        Context context;
        this.LIZ = fragment;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(fragment);
        this.LJI = LJIILIIL;
        this.LJII = true;
        this.LJIIJ = C9T.DEFAULT;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C9U.LJLIL);
        this.LJIIL = LIZIZ;
        this.LJIILIIL = new ARunnableS41S0100000_5(this, 8);
        C9Q c9q = new C9Q(this);
        this.LJIILJJIL = c9q;
        this.LJIILL = C221108m2.LIZIZ(C9V.LJLIL);
        if (LivePreviewNetworkSpeedSetting.INSTANCE.enable()) {
            if (BroadcastSpeedTestCountdownTimerSetting.INSTANCE.enable()) {
                this.LJIIJJI = new C9S(this, LivePreviewNetworkSpeedTimeoutSetting.INSTANCE.getValue());
            }
            if (LJIILIIL != null) {
                LJIILIIL.ov0(fragment, IsBroadcastPreviewCurrentSceneChannel.class, new AqS171S0100000_5(this, 34));
            }
            C9O c9o = (C9O) LIZIZ.getValue();
            if (fragment == null || (context = fragment.getContext()) == null) {
                return;
            }
            c9o.LIZ(context);
            ((ArrayList) ((C9O) LIZIZ.getValue()).LIZJ).add(new WeakReference(c9q));
        }
    }

    public final void LJ(C9T c9t) {
        this.LJIIJ = c9t;
        DataChannel dataChannel = this.LJI;
        if (dataChannel != null) {
            dataChannel.rv0(VideoPreScheduleStatusChannel.class, c9t);
        }
    }
}
