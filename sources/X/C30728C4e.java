package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.C4e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30728C4e extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public final Object invoke(JSONObject params, C38131Exr context) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        InterfaceC06390Mx LIZ = CN1.LIZ(IGameLinkMicService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        ((IGameLinkMicService) LIZ).sV();
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IInteractService.class);
        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
        ((IInteractService) LIZ2).sL();
        return null;
    }
}
