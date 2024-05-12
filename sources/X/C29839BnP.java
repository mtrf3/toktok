package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.PrepareEffectChannel;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsNewAnchorEffect;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BnP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29839BnP extends C29840BnQ {
    @Override // X.InterfaceC29848BnY
    public final void LIZ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
        CQQ LJLIIL = capsuleModel.LJLIIL();
        BZI LIZ = C28787BRn.LIZ("livesdk_live_capsule_effective_show");
        LIZ.LJIILLIIL(LJLIIL.LJIIIIZZ);
        LIZ.LJIJJ(C29841BnR.LIZIZ(LJLIIL.LJI, LJLIIL.LJIIIIZZ), "admin_type");
        LIZ.LJIJJ(Long.valueOf(capsuleModel.LJIJJLI.getMessageId()), "msg_id");
        LIZ.LJIJJ(((CapsuleMessage) capsuleModel.LJIJJLI).scene, "msg_name");
        LIZ.LJIJJ(Integer.valueOf(((CapsuleMessage) capsuleModel.LJIJJLI).capsuleType), "msg_type");
        LIZ.LJIJJ(String.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()), "online_user");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LIZJ(C29846BnW c29846BnW) {
        LifecycleOwner lifecycleOwner;
        C29285BeT c29285BeT;
        CapsuleBizParamsNewAnchorEffect capsuleBizParamsNewAnchorEffect;
        CQQ LJLIIL = c29846BnW.LJLIIL();
        DataChannel dataChannel = LJLIIL.LJIIIIZZ;
        if (dataChannel == null || (lifecycleOwner = LJLIIL.LIZIZ) == null) {
            return false;
        }
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c29846BnW.LJIJJLI).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsNewAnchorEffect = capsuleBizParams.effectParams) != null) {
            c29285BeT = new C29285BeT(capsuleBizParamsNewAnchorEffect.effectPanel, capsuleBizParamsNewAnchorEffect.resourceId, capsuleBizParamsNewAnchorEffect.tabKey);
            if (o.LJ(((CapsuleMessage) c29846BnW.LJIJJLI).scene, "effect_guide")) {
                dataChannel.rv0(PrepareEffectChannel.class, new C29285BeT(capsuleBizParamsNewAnchorEffect.effectPanel, capsuleBizParamsNewAnchorEffect.resourceId, capsuleBizParamsNewAnchorEffect.tabKey));
            }
        } else {
            c29285BeT = null;
        }
        return C29293Beb.LIZIZ(c29285BeT, ((CapsuleMessage) c29846BnW.LJIJJLI).scene, dataChannel, lifecycleOwner, C29306Beo.LIZIZ(LJLIIL.LIZ), true);
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZIZ(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
        map.put("online_user", String.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()));
    }

    @Override // X.InterfaceC29848BnY
    public final void LJI(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
        map.put("online_user", String.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()));
    }
}
