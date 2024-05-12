package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.ShowStickerPanelEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.OpenMultiLivePanelEvent;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Beb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29293Beb {
    public static final void LIZ(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        dataChannel.qv0(ShowStickerPanelEvent.class, new C32801Qm(LiveEffectShortcutPanelTypeSetting.INSTANCE.canShowShortCutPanelWhenClickEntrance(), true, true));
    }

    public static final Object LIZJ(C29285BeT c29285BeT, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (c29285BeT == null) {
            return C76800UCe.LIZ;
        }
        C0WL liveEffectController = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectController();
        o.LJIIIIZZ(liveEffectController, "getService(IEffectServic…ava).liveEffectController");
        Object LIZ = C0WK.LIZ(liveEffectController, c29285BeT.LJLILLLLZI, c29285BeT.LJLIL, c29285BeT.LJLJI, null, null, null, interfaceC67352kd, LiveTryModeCountDownThresholdSetting.DEFAULT);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }

    public static final boolean LIZIZ(C29285BeT c29285BeT, String str, DataChannel dataChannel, LifecycleOwner lifecycleOwner, ActivityC45651qj activityC45651qj, boolean z) {
        String str2;
        String str3;
        LifecycleCoroutineScope lifecycleScope;
        if (o.LJ(str, "effect_guide")) {
            if (c29285BeT == null) {
                return false;
            }
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveStickerLogManager().getClass();
            C32041No.LJIILLIIL = true;
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                XKX.LIZLLL(lifecycleScope, null, null, new C29279BeN(c29285BeT, dataChannel, null), 3);
            }
            return true;
        }
        if (o.LJ(str, "share_guide")) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            if (room == null || lifecycleOwner == null) {
                return false;
            }
            C29930Bos c29930Bos = new C29930Bos(new C29929Bor(room));
            ((C29338BfK) ((IShareService) CN1.LIZ(IShareService.class)).un0()).LIZ(activityC45651qj, c29930Bos, new C29277BeL(room, dataChannel, lifecycleOwner, c29930Bos));
            return true;
        }
        if (o.LJ(str, "multi_guest_guide")) {
            if (z) {
                str3 = "mutual_notice";
            } else {
                str3 = "anchor_guidance";
            }
            dataChannel.qv0(OpenMultiLivePanelEvent.class, str3);
            return true;
        }
        if (!o.LJ(str, "co_host_guide")) {
            return false;
        }
        if (z) {
            str2 = "anchor_host_notice";
        } else {
            str2 = "anchor_host_guidance";
        }
        dataChannel.qv0(OpenCoHostEvent.class, str2);
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService.ZQ()) {
            iInteractService.Jj();
        }
        return true;
    }
}
