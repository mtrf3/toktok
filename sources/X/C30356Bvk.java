package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.broadcast.voicechat.layer.VoiceChatWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Bvk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30356Bvk implements InterfaceC72822Si2 {
    public final /* synthetic */ VoiceChatWidget LJLIL;

    public C30356Bvk(VoiceChatWidget voiceChatWidget) {
        this.LJLIL = voiceChatWidget;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String str;
        Effect effect;
        this.LJLIL.getClass();
        if (!o.LJ(c199097rd.LJLIL, "live_goal_update_event") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null) {
            return;
        }
        InterfaceC08090Tl liveGoalEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
        if (interfaceC78280Uns.hasKey("isQuit") && interfaceC78280Uns.getBoolean("isQuit")) {
            ((C31691Mf) liveGoalEffectHelper).LJIILL();
            return;
        }
        if (interfaceC78280Uns.hasKey("live_goal_background_position") && interfaceC78280Uns.getInt("live_goal_background_position") == 0) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper().getClass();
            LiveEffect liveEffect = C1XG.LIZIZ;
            if (liveEffect != null && (effect = liveEffect.getEffect()) != null) {
                str = effect.getPanel();
            } else {
                str = null;
            }
            if (o.LJ(str, "livebackground")) {
                C1XG.LIZIZ = null;
            }
            ((C31691Mf) liveGoalEffectHelper).LJIIJJI();
        } else {
            C31691Mf.LJJI();
            C31691Mf.LJJ();
        }
        liveGoalEffectHelper.getClass();
        C31691Mf.LJ = null;
    }
}
