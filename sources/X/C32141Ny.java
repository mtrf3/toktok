package X;

import android.os.Handler;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveVoiceEffectUseVoipModeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.1Ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32141Ny implements InterfaceC08150Tr {
    public static IAudioFilterManager LIZIZ;
    public static IAudioStrangeVoice LIZJ;
    public static DataChannel LIZLLL;
    public static InterfaceC08980Ww LJI;
    public static InterfaceC08970Wv LJII;
    public static LiveEffect LJIIIIZZ;
    public static InterfaceC88472Yns<? super Boolean, C76800UCe> LJIIIZ;
    public static boolean LJIIJ;
    public static final C5H3 LJIIJJI;
    public static final C32141Ny LIZ = new C32141Ny();
    public static final java.util.Map<Long, Long> LJ = new LinkedHashMap();
    public static final java.util.Map<Long, C32111Nv> LJFF = new LinkedHashMap();

    static {
        C31014CFe.LJIJJLI = C50481yW.LJLIL;
        LJIIJJI = C78996UzQ.LJJIJIIJI(C50491yX.INSTANCE);
    }

    public static void LIZ() {
        IAudioStrangeVoice iAudioStrangeVoice;
        InterfaceC12590eV echoHelper = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getEchoHelper();
        if (echoHelper != null && !echoHelper.LIZIZ() && (iAudioStrangeVoice = LIZJ) != null) {
            iAudioStrangeVoice.enablePlayerMode(false, LiveVoiceEffectUseVoipModeSetting.INSTANCE.getValue());
        }
        LJIIJ = false;
        InterfaceC08970Wv interfaceC08970Wv = LJII;
        if (interfaceC08970Wv != null) {
            interfaceC08970Wv.D2(false);
        }
    }

    public static final boolean LIZIZ() {
        LiveEffect liveEffect = LJIIIIZZ;
        if (liveEffect != null) {
            return C29306Beo.LJIILLIIL(Boolean.valueOf(LIZJ(liveEffect)));
        }
        return false;
    }

    public static final void LIZLLL() {
        Long l;
        LiveEffect liveEffect = LJIIIIZZ;
        if (liveEffect != null && !LIZJ(liveEffect)) {
            java.util.Map<Long, C32111Nv> map = LJFF;
            LiveEffect liveEffect2 = LJIIIIZZ;
            if (liveEffect2 != null) {
                l = Long.valueOf(liveEffect2.effectId);
            } else {
                l = null;
            }
            C32111Nv c32111Nv = (C32111Nv) ((LinkedHashMap) map).get(l);
            if (c32111Nv != null) {
                C32101Nu.LIZ(4L);
                C32101Nu.LJIILLIIL(liveEffect, Long.valueOf(c32111Nv.LJLIL), c32111Nv.LJLILLLLZI);
            }
        }
        LJ(LJIIIIZZ);
        LJIIIIZZ = null;
        LJI = null;
        LJII = null;
        ((Handler) LJIIJJI.getValue()).removeCallbacksAndMessages(null);
        LIZLLL = null;
        LIZIZ = null;
        LIZJ = null;
        BYI.LIZLLL(BWZ.VOICE_EFFECT);
    }

    public static boolean LIZJ(LiveEffect effect) {
        o.LJIIIZ(effect, "effect");
        try {
            String str = effect.extra;
            if (str != null) {
                return JSONObjectProtectorUtils.getBoolean(new JSONObject(str), "Original");
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void LJ(LiveEffect liveEffect) {
        IAudioFilterManager iAudioFilterManager = LIZIZ;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.setEnable(false);
        }
        IAudioStrangeVoice iAudioStrangeVoice = LIZJ;
        if (iAudioStrangeVoice != null) {
            iAudioStrangeVoice.setEnable(false);
        }
        IAudioStrangeVoice iAudioStrangeVoice2 = LIZJ;
        if (iAudioStrangeVoice2 != null) {
            iAudioStrangeVoice2.setAudioStrangeResource(null, null);
        }
        if (liveEffect == null) {
            return;
        }
        DataChannel dataChannel = LIZLLL;
        C32111Nv c32111Nv = (C32111Nv) ((LinkedHashMap) LJFF).get(Long.valueOf(liveEffect.effectId));
        if (c32111Nv != null) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_live_voice_use_time");
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJIJJ(liveEffect.nameForEnglish, "effect_name");
            LIZ2.LJIJJ(Long.valueOf(liveEffect.effectId), "effect_id");
            LIZ2.LJIJJ(Long.valueOf((System.currentTimeMillis() / 1000) - c32111Nv.LJLIL), "use_time");
            LIZ2.LJIJJ(liveEffect.getResourceId(), "resource_id");
            java.util.Map<Long, String> map = AnonymousClass139.LIZ;
            LIZ2.LJIJJ(((LinkedHashMap) map).get(Long.valueOf(liveEffect.effectId)), "select_scene");
            LIZ2.LJJIIJZLJL();
            map.remove(Long.valueOf(liveEffect.effectId));
        }
        BYI.LIZLLL(BWZ.VOICE_EFFECT);
    }

    public static void LJFF(LiveEffect liveEffect, boolean z) {
        o.LJIIIZ(liveEffect, "liveEffect");
        InterfaceC08980Ww interfaceC08980Ww = LJI;
        if (interfaceC08980Ww != null) {
            interfaceC08980Ww.Y(liveEffect, LIZJ(liveEffect));
        }
        if (!z && o.LJ(LJIIIIZZ, liveEffect)) {
            return;
        }
        LiveEffect liveEffect2 = LJIIIIZZ;
        LJIIIIZZ = liveEffect;
        if (LIZJ(liveEffect)) {
            if (liveEffect2 != null) {
                C32111Nv c32111Nv = (C32111Nv) ((LinkedHashMap) LJFF).get(Long.valueOf(liveEffect2.effectId));
                if (c32111Nv != null) {
                    C32101Nu.LIZ(4L);
                    C32101Nu.LJIILLIIL(liveEffect2, Long.valueOf(c32111Nv.LJLIL), c32111Nv.LJLILLLLZI);
                }
            }
            LJ(liveEffect2);
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = LJIIIZ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        LiveEffect liveEffect3 = LJIIIIZZ;
        if (liveEffect3 != null) {
            liveEffect3.isDownloaded = true;
            LJ(liveEffect2);
            BYI.LIZJ(BWZ.VOICE_EFFECT);
            IAudioFilterManager iAudioFilterManager = LIZIZ;
            if (iAudioFilterManager != null) {
                iAudioFilterManager.setEnable(true);
            }
            IAudioStrangeVoice iAudioStrangeVoice = LIZJ;
            if (iAudioStrangeVoice != null) {
                iAudioStrangeVoice.setEnable(true);
            }
            IAudioStrangeVoice iAudioStrangeVoice2 = LIZJ;
            if (iAudioStrangeVoice2 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                iAudioStrangeVoice2.setAudioStrangeResource(JBR.LJFF(LIZ2, liveEffect3.unzipPath, "/mdsp_preset.json", LIZ2), liveEffect3.unzipPath);
            }
            String scene = ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene();
            java.util.Map<Long, C32111Nv> map = LJFF;
            Long valueOf = Long.valueOf(liveEffect3.effectId);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            o.LJIIIIZZ(scene, "scene");
            map.put(valueOf, new C32111Nv(currentTimeMillis, scene));
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2 = LJIIIZ;
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(Boolean.TRUE);
            }
        }
    }
}
