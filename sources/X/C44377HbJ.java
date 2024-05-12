package X;

import Y.ARunnableS43S0100000_7;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HbJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44377HbJ implements InterfaceC30078BrG, IAVTransformService.ITransformCallback, InterfaceC47042IdC {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ C44377HbJ(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(InterfaceC29879Bo3 interfaceC29879Bo3) {
        ((AbsAudienceInteractionFragment) this.LJLIL).messageManager.addMessageListener(EnumC31509CYf.DRAW_GUESS_START_MESSAGE.getIntType(), new C30064Br2(interfaceC29879Bo3));
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback
    public final void finish(Object obj) {
        ARunnableS43S0100000_7 aRunnableS43S0100000_7 = (ARunnableS43S0100000_7) this.LJLIL;
        Integer num = (Integer) obj;
        C38816FLg.LIZJ(((AvatarCutActivity) aRunnableS43S0100000_7.l0).LLIIL);
        if (num.intValue() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", num);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C09900aA.LJIIJJI("aweme_video_clip_success_rate", 1, jSONObject);
        } else {
            C09900aA.LJIIJJI("aweme_video_clip_success_rate", 0, null);
        }
        ((AvatarCutActivity) aRunnableS43S0100000_7.l0).LLIFFJFJJ = true;
    }

    @Override // X.InterfaceC47042IdC
    public final void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
        ((IZL) this.LJLIL).LJLLLLLL.LJIILJJIL(C47165IfB.LIZIZ(enumC47176IfM), i);
    }
}
