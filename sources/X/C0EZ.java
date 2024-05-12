package X;

import X.AnonymousClass011;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectMusicFadeCurveModeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectMusicFadeSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0EZ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0EZ<T extends AnonymousClass011> {
    public final List<T> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public AudioEffectProcessor.CallbackV2 LJ;

    public final IAudioFilterManager LIZ() {
        IAudioFilterManager audioFilterMgr;
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 != null && (audioFilterMgr = interfaceC21020s6.getAudioFilterMgr()) != null) {
            audioFilterMgr.setBGMProgressListener(new AudioEffectProcessor.CallbackV2(this) { // from class: X.1id
                public final /* synthetic */ C0EZ<AnonymousClass011> LIZ;

                @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                public final void start() {
                    this.LIZ.LIZIZ(true);
                    AudioEffectProcessor.CallbackV2 callbackV2 = this.LIZ.LJ;
                    if (callbackV2 != null) {
                        callbackV2.start();
                    }
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                public final void stop() {
                    this.LIZ.LIZIZ(false);
                    C0EZ<AnonymousClass011> c0ez = this.LIZ;
                    c0ez.LIZJ = false;
                    c0ez.getClass();
                    AudioEffectProcessor.CallbackV2 callbackV2 = this.LIZ.LJ;
                    if (callbackV2 != null) {
                        callbackV2.stop();
                    }
                }

                {
                    this.LIZ = this;
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                public final void onProgress(long j) {
                    C0EZ<AnonymousClass011> c0ez = this.LIZ;
                    c0ez.LIZLLL = j;
                    AudioEffectProcessor.CallbackV2 callbackV2 = c0ez.LJ;
                    if (callbackV2 != null) {
                        callbackV2.onProgress(j);
                    }
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.CallbackV2
                public final void onError(int i, Exception exc) {
                    this.LIZ.LIZIZ(false);
                    C0EZ<AnonymousClass011> c0ez = this.LIZ;
                    c0ez.LIZJ = false;
                    AudioEffectProcessor.CallbackV2 callbackV2 = c0ez.LJ;
                    if (callbackV2 != null) {
                        callbackV2.onError(i, exc);
                    }
                }
            });
            audioFilterMgr.setLoopEnable(false);
            audioFilterMgr.setMixerEnable(true);
            audioFilterMgr.setEnableAudioFading(LiveEffectMusicFadeSwitchSetting.INSTANCE.getValue());
            LiveEffectMusicFadeCurveModeSetting liveEffectMusicFadeCurveModeSetting = LiveEffectMusicFadeCurveModeSetting.INSTANCE;
            int value = liveEffectMusicFadeCurveModeSetting.getValue();
            int value2 = liveEffectMusicFadeCurveModeSetting.getValue();
            LiveEffectMusicFadeDurationSetting liveEffectMusicFadeDurationSetting = LiveEffectMusicFadeDurationSetting.INSTANCE;
            audioFilterMgr.setAudioFadingParams(value, value2, liveEffectMusicFadeDurationSetting.getValue(), liveEffectMusicFadeDurationSetting.getValue());
            audioFilterMgr.setVoiceVolume(C21210sP.LIZIZ(C21210sP.LJ()));
            audioFilterMgr.setBGMVolume(C21210sP.LIZ(C21210sP.LIZLLL()));
            Boolean LIZJ = InterfaceC30442Bx8.F3.LIZJ();
            o.LJIIIIZZ(LIZJ, "KARAOKE_ORIGINAL_SWITCH.value");
            audioFilterMgr.setOriginEnable(LIZJ.booleanValue());
            audioFilterMgr.setPitchShift(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            return audioFilterMgr;
        }
        return null;
    }

    public C0EZ(List<T> list) {
        this.LIZ = list;
    }

    public final void LIZIZ(boolean z) {
        this.LIZIZ = z;
        C21210sP.LIZ = z;
    }
}
