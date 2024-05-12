package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewBroadcastBlockChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.barrage.TtliveEnablePreparationPageSpeedtestOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.0RK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RK {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final C0TO LIZ = new C0TO();
    public static String LJ = "";

    public static void LIZ() {
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GameBroadcastNewAutoSpeedDetectorHelper", "reset speed test.");
        }
        LIZLLL = false;
        LIZIZ = false;
        LJ = "";
        LIZJ = false;
        LIZ.LIZIZ();
    }

    public static void LIZJ(final DataChannel dataChannel) {
        boolean z;
        if (LIZJ) {
            return;
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GameBroadcastNewAutoSpeedDetectorHelper", "try start auto speed test in game mode live preview page.");
        }
        final RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class);
        LiveMode liveMode = (LiveMode) dataChannel.kv0(PreviewPageSelectLiveMode.class);
        Boolean bool = (Boolean) dataChannel.kv0(PreviewBroadcastBlockChannel.class);
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean bool2 = (Boolean) dataChannel.kv0(LiveAccessTipsShowChannel.class);
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        }
        if (roomCreateInfo != null && liveMode != null) {
            if (C0RJ.LIZLLL(roomCreateInfo, liveMode, z, z2)) {
                final long currentTimeMillis = System.currentTimeMillis();
                C0RJ.LJ(currentTimeMillis);
                LIZJ = true;
                LIZ.LJ(C0TP.SCENE_TIKTOK_GAME_LIVE_AUTO, new C0W5() { // from class: X.1Jy
                    @Override // X.C0W5
                    public final void LIZ(long j, long j2) {
                        boolean z3;
                        String str;
                        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
                        String str2 = null;
                        if (quality != null) {
                            str2 = quality.sdkKey;
                        }
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        C31091Jx LIZIZ2 = C0RJ.LIZIZ(j, RoomCreateInfo.this);
                        if (LIZIZ2 != null && (str = LIZIZ2.sdkKey) != null) {
                            str3 = str;
                        }
                        C0TO c0to = C0RK.LIZ;
                        String str4 = c0to.LIZ.LIZJ;
                        String LIZJ2 = c0to.LIZJ();
                        if (j > 64000) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C1JD.LJJIJIIJIL(j, j2, str4, LIZJ2, str3, "auto", z3);
                        if (str3.length() == 0) {
                            return;
                        }
                        C0RK.LJ = str3;
                        if (!C0RK.LIZLLL) {
                            C0RK.LIZIZ = false;
                            if (dataChannel.kv0(PreviewPageSelectLiveMode.class) == LiveMode.SCREEN_RECORD) {
                                if (!TtliveEnablePreparationPageSpeedtestOptimizeSetting.INSTANCE.isExperimentGroup()) {
                                    if (C30922CBq.LIZIZ) {
                                        C0NB.LJIIIZ("GameBroadcastNewAutoSpeedDetectorHelper", "auto speed test success and toast!");
                                    }
                                    C30868C9o.LJI(C15380j0.LJIILL(R.string.lfr, C78939UyV.LJIILLIIL(dataChannel, C0RK.LJ)));
                                }
                            } else {
                                if (C30922CBq.LIZIZ) {
                                    C0NB.LJIIIZ("GameBroadcastNewAutoSpeedDetectorHelper", "auto speed test success and don't toast because current live mode tab is not mobile gaming.");
                                }
                                C0RK.LIZIZ = true;
                            }
                        }
                        C77357UXp.LJJIJIL(str3);
                        if (C30922CBq.LIZIZ) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("auto speed test success. uploadSpeed=");
                            LIZ2.append(C0RJ.LIZ(j));
                            LIZ2.append("mbps, caculate suggested definition={sdkKey=");
                            LIZ2.append(str3);
                            LIZ2.append(", name=");
                            LIZ2.append(C78939UyV.LJIILLIIL(dataChannel, C0RK.LJ));
                            LIZ2.append('}');
                            C0NB.LJIIIZ("GameBroadcastNewAutoSpeedDetectorHelper", X1D.LIZIZ(LIZ2));
                        }
                        OUP.LJJIJ(str2, str3);
                        OUP.LJJIL(currentTimeMillis2 - currentTimeMillis, "success", "", str2, str3);
                    }

                    @Override // X.C0W5
                    public final void LIZIZ(int i, String message) {
                        String str;
                        o.LJIIIZ(message, "message");
                        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
                        if (quality == null || (str = quality.sdkKey) == null) {
                            str = "";
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        C0TO c0to = C0RK.LIZ;
                        C1JD.LJJIJ(i, c0to.LIZ.LIZJ, c0to.LIZJ(), message, "auto");
                        if (i == C0W0.DisconnectTypeAutoDetectionClickStartLive.getCode()) {
                            OUP.LJJIL(currentTimeMillis2 - currentTimeMillis, "cancelled", "click_go_live", str, "");
                        } else if (i == C0W0.DisconnectTypeAutoDetectionOpenDefinitionDialog.getCode()) {
                            OUP.LJJIL(currentTimeMillis2 - currentTimeMillis, "cancelled", "click_video_quality", str, "");
                        } else if (i == C0W0.DisconnectTypeAutoDetectionExitPreviewPage.getCode()) {
                            OUP.LJJIL(currentTimeMillis2 - currentTimeMillis, "cancelled", "exit_live_page", str, "");
                        } else {
                            OUP.LJJIL(currentTimeMillis2 - currentTimeMillis, "failed", "", str, "");
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("auto speed test failure. errorCode=");
                        LIZ2.append(i);
                        LIZ2.append(", message=");
                        LIZ2.append(message);
                        C0NB.LJ("GameBroadcastNewAutoSpeedDetectorHelper", X1D.LIZIZ(LIZ2));
                    }
                });
                return;
            }
            if (!C30922CBq.LIZIZ) {
                return;
            }
            C0NB.LJ("GameBroadcastNewAutoSpeedDetectorHelper", "should not start auto speed test, execute 'adb logcat | grep SpeedDetectorBusinessCommonFunction' for get more info");
            return;
        }
        if (!C30922CBq.LIZIZ) {
            return;
        }
        C0NB.LJ("GameBroadcastNewAutoSpeedDetectorHelper", "should not start auto speed test because room create info is null or live mode is null!");
    }

    public static void LIZIZ(int i, String str) {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("stop auto speed test. stop_code=");
            LIZ2.append(i);
            LIZ2.append(", stop_message=");
            LIZ2.append(str);
            C0NB.LJIIIZ("GameBroadcastNewAutoSpeedDetectorHelper", X1D.LIZIZ(LIZ2));
        }
        LIZ.LIZ(i, str);
    }
}
