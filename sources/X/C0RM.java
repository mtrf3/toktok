package X;

import X.C05520Jo;
import X.C0NB;
import X.C0RM;
import X.C0TO;
import X.C0W0;
import X.C30922CBq;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastClickStartLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastOpenDefinitionDialogEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveBroadcastPreviewFragmentHideEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewBroadcastBlockChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0RM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RM {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public boolean LIZJ;
    public final C0TO LIZLLL;
    public boolean LJ;
    public String LJFF;

    public final void LIZ() {
        final RoomCreateInfo roomCreateInfo;
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        if (this.LIZJ) {
            return;
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("GameBroadcastPreviewAutoSpeedDetectorHelper", "tryStartAutoSpeedDetection(). call this method.");
        }
        DataChannel dataChannel = this.LIZ;
        LiveMode liveMode = null;
        if (dataChannel != null) {
            roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class);
        } else {
            roomCreateInfo = null;
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            liveMode = (LiveMode) dataChannel2.kv0(PreviewPageSelectLiveMode.class);
        }
        DataChannel dataChannel3 = this.LIZ;
        boolean z3 = false;
        if (dataChannel3 != null && (bool2 = (Boolean) dataChannel3.kv0(PreviewBroadcastBlockChannel.class)) != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        DataChannel dataChannel4 = this.LIZ;
        if (dataChannel4 != null && (bool = (Boolean) dataChannel4.kv0(LiveAccessTipsShowChannel.class)) != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        if (roomCreateInfo != null && liveMode != null) {
            boolean LIZLLL = C0RJ.LIZLLL(roomCreateInfo, liveMode, z, z2);
            if (C30922CBq.LIZIZ) {
                C0RN.LIZLLL("tryStartAutoSpeedDetection(). should auto speed detection? should=", LIZLLL, "GameBroadcastPreviewAutoSpeedDetectorHelper");
            }
            if (LIZLLL) {
                final long currentTimeMillis = System.currentTimeMillis();
                C0RJ.LJ(currentTimeMillis);
                this.LIZJ = true;
                this.LIZLLL.LJ(C0TP.SCENE_TIKTOK_GAME_LIVE_AUTO, new C0W5() { // from class: X.1Jz
                    @Override // X.C0W5
                    public final void LIZ(long j, long j2) {
                        String str;
                        boolean z4;
                        Object obj;
                        String str2;
                        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) DataChannelGlobal.LJLJJI.mv0(BroadcastShareScreenDefinition.class);
                        if (quality != null) {
                            str = quality.sdkKey;
                        } else {
                            str = null;
                        }
                        String str3 = "";
                        if (str == null) {
                            str = "";
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        C31091Jx LIZIZ = C0RJ.LIZIZ(j, RoomCreateInfo.this);
                        if (LIZIZ != null && (str2 = LIZIZ.sdkKey) != null) {
                            str3 = str2;
                        }
                        C0TO c0to = this.LIZLLL;
                        String str4 = c0to.LIZ.LIZJ;
                        String LIZJ = c0to.LIZJ();
                        if (j > 64000) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        String str5 = str3;
                        C1JD.LJJIJIIJIL(j, j2, str4, LIZJ, str3, "auto", z4);
                        if (str3.length() == 0) {
                            return;
                        }
                        C77357UXp.LJJIJIL(str3);
                        OUP.LJJIJ(str, str3);
                        DataChannel dataChannel5 = this.LIZ;
                        if (dataChannel5 != null) {
                            obj = dataChannel5.kv0(PreviewPageSelectLiveMode.class);
                        } else {
                            obj = null;
                        }
                        C0RM c0rm = this;
                        c0rm.LJ = false;
                        c0rm.LJFF = str3;
                        if (obj == LiveMode.SCREEN_RECORD) {
                            C30868C9o.LJI(C15380j0.LJIILL(R.string.lfr, C78939UyV.LJIILLIIL(c0rm.LIZ, str3)));
                        } else {
                            c0rm.LJ = true;
                        }
                        if (C30922CBq.LIZIZ) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("tryStartAutoSpeedDetection(). onDetectSuccess. uploadSpeed=");
                            LIZ.append(C0RJ.LIZ(j));
                            LIZ.append("mbps, caculate suggested definition={sdkKey=");
                            LIZ.append(str3);
                            LIZ.append(", name=");
                            C0RM c0rm2 = this;
                            LIZ.append(C78939UyV.LJIILLIIL(c0rm2.LIZ, c0rm2.LJFF));
                            LIZ.append('}');
                            C0NB.LJIIIZ("GameBroadcastPreviewAutoSpeedDetectorHelper", X1D.LIZIZ(LIZ));
                        }
                        OUP.LJJIL(currentTimeMillis2 - currentTimeMillis, "success", "", str, str5);
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
                        C0TO c0to = this.LIZLLL;
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
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("tryStartAutoSpeedDetection(). onDetectFailure. errorCode=");
                        LIZ.append(i);
                        LIZ.append(", message=");
                        LIZ.append(message);
                        C0NB.LJ("GameBroadcastPreviewAutoSpeedDetectorHelper", X1D.LIZIZ(LIZ));
                    }
                });
                return;
            }
            return;
        }
        if (!C30922CBq.LIZIZ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryStartAutoSpeedDetection. not start. roomCreateInfo not null=");
        if (roomCreateInfo != null) {
            z3 = true;
        }
        LIZ.append(z3);
        LIZ.append(", liveMode=");
        LIZ.append(liveMode);
        LIZ.append(", isBlocked=");
        FT5.LJ(LIZ, z, LIZ, "GameBroadcastPreviewAutoSpeedDetectorHelper");
    }

    public C0RM(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        this.LIZLLL = new C0TO();
        this.LJFF = "";
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.live.broadcast.speeddetector.GameBroadcastPreviewAutoSpeedDetectorHelper$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                int i = C05520Jo.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    C0RM c0rm = C0RM.this;
                    c0rm.getClass();
                    if (C30922CBq.LIZIZ) {
                        C0NB.LJIIIZ("GameBroadcastPreviewAutoSpeedDetectorHelper", "unRegister.");
                    }
                    C0TO c0to = c0rm.LIZLLL;
                    C0W0 c0w0 = C0W0.DisconnectTypeAutoDetectionExitPreviewPage;
                    c0to.LIZ(c0w0.getCode(), c0w0.getMessage());
                    c0rm.LIZLLL.LIZIZ();
                    return;
                }
                C0RM c0rm2 = C0RM.this;
                c0rm2.getClass();
                if (C30922CBq.LIZIZ) {
                    C0NB.LJIIIZ("GameBroadcastPreviewAutoSpeedDetectorHelper", "register.");
                }
                DataChannel dataChannel2 = c0rm2.LIZ;
                if (dataChannel2 != null) {
                    dataChannel2.lv0(c0rm2.LIZIZ, RoomCreateInfoChannel.class, new IDqS416S0100000(c0rm2, 152));
                    dataChannel2.lv0(c0rm2.LIZIZ, PreviewPageSelectLiveMode.class, new IDqS416S0100000(c0rm2, 153));
                }
                DataChannel dataChannel3 = c0rm2.LIZ;
                if (dataChannel3 == null) {
                    return;
                }
                dataChannel3.lv0(c0rm2.LIZIZ, BroadcastOpenDefinitionDialogEvent.class, new IDqS416S0100000(c0rm2, 147));
                dataChannel3.lv0(c0rm2.LIZIZ, BroadcastClickStartLiveEvent.class, new IDqS416S0100000(c0rm2, 148));
                dataChannel3.lv0(c0rm2.LIZIZ, PreviewBroadcastBlockChannel.class, new IDqS416S0100000(c0rm2, 149));
                dataChannel3.lv0(c0rm2.LIZIZ, LiveBroadcastPreviewFragmentHideEvent.class, new IDqS416S0100000(c0rm2, 150));
                dataChannel3.lv0(c0rm2.LIZIZ, LiveAccessTipsShowChannel.class, new IDqS416S0100000(c0rm2, 151));
            }
        });
    }
}
