package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectMusicFadeCurveModeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectMusicFadeSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.0hC */
/* loaded from: classes.dex */
public final class C14260hC {
    public static IAudioFilterManager LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static MusicSong LJ;
    public static long LJFF;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C21O.LJLIL);
    public static long LJI = 1;

    public static IAudioFilterManager LIZIZ() {
        IAudioFilterManager audioFilterMgr;
        IAudioFilterManager iAudioFilterManager = LIZIZ;
        if (iAudioFilterManager == null) {
            InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
            if (interfaceC21020s6 != null && (audioFilterMgr = interfaceC21020s6.getAudioFilterMgr()) != null) {
                audioFilterMgr.setBGMProgressListener(new AudioEffectProcessor.CallbackV2() { // from class: X.1mK
                    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                    public final void start() {
                        if (o.LJ(DataChannelGlobal.LJLJJI.mv0(C54962Ds.class), Boolean.FALSE)) {
                            C14260hC.LJIIL = true;
                            C14260hC.LJII(true);
                            C14360hM.LIZLLL();
                            C15610jN.LIZIZ(new Runnable() { // from class: X.0h7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean LIZ2;
                                    try {
                                        Iterator it = C14260hC.LIZJ().iterator();
                                        while (it.hasNext()) {
                                            ((InterfaceC14440hU) it.next()).h9();
                                        }
                                    } finally {
                                        if (LIZ2) {
                                        }
                                    }
                                }
                            });
                            C31014CFe.LJIJI(true);
                        }
                    }

                    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                    public final void stop() {
                        if (C14260hC.LIZJ != 0) {
                            C14360hM.LIZJ(C14260hC.LIZJ, "1");
                        }
                        C14260hC.LIZJ = 0;
                        C14260hC.LJII(false);
                        C15610jN.LIZIZ(new Runnable() { // from class: X.0h8
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean LIZ2;
                                try {
                                    Iterator it = C14260hC.LIZJ().iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC14440hU) it.next()).Ee();
                                    }
                                } finally {
                                    if (LIZ2) {
                                    }
                                }
                            }
                        });
                        C31014CFe.LJIJI(false);
                        C30326BvG.LIZJ(new Runnable() { // from class: X.0h9
                            public static void LIZ() {
                                if (C14260hC.LJIIIZ) {
                                    C32101Nu.LJIIJJI(Long.valueOf(C14260hC.LJFF), Long.valueOf(System.currentTimeMillis() / 1000), 2L, null);
                                } else {
                                    C32101Nu.LJIIJJI(Long.valueOf(C14260hC.LJFF), Long.valueOf(System.currentTimeMillis() / 1000), 1L, null);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean LIZ2;
                                try {
                                    LIZ();
                                } finally {
                                    if (LIZ2) {
                                    }
                                }
                            }
                        }, null, 300L);
                        C14260hC.LJIIIZ = false;
                    }

                    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.Callback
                    public final void onProgress(long j) {
                        C14260hC.LIZJ = (int) (j / 1000);
                    }

                    @Override // com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioEffectProcessor.CallbackV2
                    public final void onError(int i, Exception exc) {
                        String str;
                        StringBuilder LJ2 = C7MY.LJ("BGM-onError: ", i, ", ");
                        if (exc != null) {
                            str = exc.getMessage();
                        } else {
                            str = null;
                        }
                        C1EW.LIZLLL(LJ2, str, LJ2, "BGMPlayerManager");
                    }
                });
                audioFilterMgr.setLoopEnable(false);
                Float LIZJ2 = InterfaceC30442Bx8.P.LIZJ();
                o.LJIIIIZZ(LIZJ2, "EFFECT_BGM_VOLUME.value");
                audioFilterMgr.setBGMVolume(LIZJ2.floatValue());
                audioFilterMgr.setMixerEnable(true);
                audioFilterMgr.setEnableAudioFading(LiveEffectMusicFadeSwitchSetting.INSTANCE.getValue());
                LiveEffectMusicFadeCurveModeSetting liveEffectMusicFadeCurveModeSetting = LiveEffectMusicFadeCurveModeSetting.INSTANCE;
                int value = liveEffectMusicFadeCurveModeSetting.getValue();
                int value2 = liveEffectMusicFadeCurveModeSetting.getValue();
                LiveEffectMusicFadeDurationSetting liveEffectMusicFadeDurationSetting = LiveEffectMusicFadeDurationSetting.INSTANCE;
                audioFilterMgr.setAudioFadingParams(value, value2, liveEffectMusicFadeDurationSetting.getValue(), liveEffectMusicFadeDurationSetting.getValue());
                LIZIZ = audioFilterMgr;
                return audioFilterMgr;
            }
            return null;
        }
        return iAudioFilterManager;
    }

    public static java.util.Set LIZJ() {
        return (java.util.Set) LIZ.getValue();
    }

    public static void LIZ(InterfaceC14440hU listener) {
        o.LJIIIZ(listener, "listener");
        LIZJ().add(listener);
    }

    public static void LJFF(InterfaceC14440hU listener) {
        o.LJIIIZ(listener, "listener");
        LIZJ().remove(listener);
    }

    public static void LJI(boolean z) {
        if (!z) {
            if (LIZLLL) {
                return;
            }
        } else {
            LIZLLL = false;
        }
        IAudioFilterManager LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.setEnable(true);
            LIZIZ2.resume();
        }
        LJII(true);
        C15610jN.LIZIZ(new Runnable() { // from class: X.0hB
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    Iterator it = C14260hC.LIZJ().iterator();
                    while (it.hasNext()) {
                        ((InterfaceC14440hU) it.next()).h9();
                    }
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        LJFF = System.currentTimeMillis() / 1000;
        o.LJIIIIZZ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), "getService(IBroadcastSer…lass.java).broadcastScene");
        if (o.LJ(DataChannelGlobal.LJLJJI.mv0(C54962Ds.class), Boolean.FALSE) && !LJIIJ) {
            LJI = 2L;
        }
        C32101Nu.LJIIJJI(Long.valueOf(LJFF), null, null, Long.valueOf(LJI));
        LJI = 1L;
        Boolean LIZJ2 = InterfaceC30442Bx8.LLLF.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_BGM_SHOULD_OPEN_MINI_PANEL.value");
        if (LIZJ2.booleanValue() && LIZJ == 0) {
            C14360hM.LIZLLL();
        }
    }

    public static void LJII(boolean z) {
        boolean z2 = LJIIIIZZ;
        if (z || z2) {
            BYI.LIZJ(BWZ.BGM);
        } else {
            BYI.LIZLLL(BWZ.BGM);
        }
        LJIIJJI = z;
    }

    public static void LIZLLL(boolean z, boolean z2) {
        if (!LJIIJJI) {
            return;
        }
        if (z && !z2) {
            LIZLLL = true;
        }
        IAudioFilterManager LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.pause();
        }
        LJII(false);
        C15610jN.LIZIZ(new Runnable() { // from class: X.0hA
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    Iterator it = C14260hC.LIZJ().iterator();
                    while (it.hasNext()) {
                        ((InterfaceC14440hU) it.next()).LJJJLL();
                    }
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        if (z && !LJII) {
            LJI = 2L;
            C32101Nu.LJIIJJI(Long.valueOf(LJFF), Long.valueOf(System.currentTimeMillis() / 1000), 4L, null);
        }
        if (LJIIIZ) {
            C32101Nu.LJIIJJI(Long.valueOf(LJFF), Long.valueOf(System.currentTimeMillis() / 1000), 2L, null);
        }
    }

    public static /* synthetic */ void LJ(boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        LIZLLL(z, false);
    }
}
