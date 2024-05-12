package X;

import android.view.View;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BasePreviewWidgetVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastPreviewBannerChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollEnableChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LevelupNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveProNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSimplifiedVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.StickerHintShowChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0NA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NA {
    public static DataChannel LIZIZ;
    public static final C0NA LIZ = new C0NA();
    public static final java.util.Set<InterfaceC65350Pko<? extends BasePreviewWidgetVisibilityChannel>> LIZJ = C77275UUl.LJIIIIZZ(C65352Pkq.LIZ(StickerDialogShowChannel.class), C65352Pkq.LIZ(EffectDialogShowChannel.class), C65352Pkq.LIZ(BlockVisibilityChannel.class), C65352Pkq.LIZ(ReplayInfluenceBannerChannel.class), C65352Pkq.LIZ(LiveStudioTagShowChannel.class), C65352Pkq.LIZ(AccessRecallVisibilityChannel.class), C65352Pkq.LIZ(ReplayEnableChannel.class), C65352Pkq.LIZ(CustomPollEnableChannel.class), C65352Pkq.LIZ(StickerHintShowChannel.class), C65352Pkq.LIZ(LiveSimplifiedVisibilityChannel.class), C65352Pkq.LIZ(LiveGoalDialogShowChannel.class), C65352Pkq.LIZ(LevelupNotifyBannerChannel.class), C65352Pkq.LIZ(LiveProNotifyBannerChannel.class), C65352Pkq.LIZ(BroadcastPreviewBannerChannel.class));
    public static final java.util.Map<InterfaceC65350Pko<? extends PreviewWidget>, java.util.Set<InterfaceC65350Pko<? extends BasePreviewWidgetVisibilityChannel>>> LIZLLL = new LinkedHashMap();
    public static final java.util.Map<InterfaceC65350Pko<? extends PreviewWidget>, Boolean> LJ = new LinkedHashMap();

    public static boolean LIZ(InterfaceC65350Pko interfaceC65350Pko) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(interfaceC65350Pko, "<this>");
        java.util.Set<InterfaceC65350Pko> set = (java.util.Set) ((LinkedHashMap) LIZLLL).get(interfaceC65350Pko);
        Boolean bool2 = null;
        if (set != null) {
            if (!set.isEmpty()) {
                for (InterfaceC65350Pko interfaceC65350Pko2 : set) {
                    DataChannel dataChannel = LIZIZ;
                    if (dataChannel != null) {
                        bool = (Boolean) dataChannel.kv0(C39557Ffl.LIZ(interfaceC65350Pko2));
                    } else {
                        bool = null;
                    }
                    if (!C29306Beo.LJJIFFI(bool)) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            bool2 = Boolean.valueOf(z);
        }
        return C29306Beo.LJJ(bool2);
    }

    public static void LIZIZ(C65776Prg c65776Prg) {
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.rv0(C39557Ffl.LIZ(c65776Prg), Boolean.FALSE);
        }
    }

    public static void LIZJ(C65776Prg c65776Prg) {
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.rv0(C39557Ffl.LIZ(c65776Prg), Boolean.TRUE);
        }
    }

    public static void LIZLLL(InterfaceC65350Pko interfaceC65350Pko) {
        View view;
        PreviewWidget LIZIZ2;
        PreviewWidget LIZIZ3 = C0N9.LIZIZ(interfaceC65350Pko);
        if (LIZIZ3 != null && (view = LIZIZ3.getView()) != null) {
            C29306Beo.LJI(view);
            if (C76800UCe.LIZ != null && (LIZIZ2 = C0N9.LIZIZ(interfaceC65350Pko)) != null) {
                LIZIZ2.onHide();
            }
        }
    }

    public static void LJ(InterfaceC65350Pko interfaceC65350Pko) {
        PreviewWidget LIZIZ2;
        View view;
        PreviewWidget LIZIZ3;
        PreviewWidget LIZIZ4 = C0N9.LIZIZ(interfaceC65350Pko);
        if (LIZIZ4 != null && LIZIZ4.getView() != null && C29306Beo.LJJIFFI((Boolean) ((LinkedHashMap) LJ).get(interfaceC65350Pko)) && LIZ(interfaceC65350Pko) && (LIZIZ2 = C0N9.LIZIZ(interfaceC65350Pko)) != null && (view = LIZIZ2.getView()) != null) {
            C29306Beo.LJJLJLI(view);
            if (C76800UCe.LIZ == null || (LIZIZ3 = C0N9.LIZIZ(interfaceC65350Pko)) == null) {
                return;
            }
            LIZIZ3.onShow();
        }
    }
}
