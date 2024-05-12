package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CAx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30903CAx extends TBS implements InterfaceC88473Ynt<InterfaceC60761Nsz, String, Object, C76800UCe> {
    public C30903CAx(C30905CAz c30905CAz) {
        super(3, c30905CAz, C30905CAz.class, "handleSparkEventToLive", "handleSparkEventToLive(Lcom/bytedance/lynx/hybrid/base/IKitView;Ljava/lang/String;Ljava/lang/Object;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC60761Nsz interfaceC60761Nsz, String p1, Object obj) {
        InterfaceC60761Nsz p0 = interfaceC60761Nsz;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.receiver.getClass();
        if (o.LJ(p1, "containerMaskTapped")) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("container_id", p0.getHybridContext().containerId);
            C76052yf c76052yf = new C76052yf(currentTimeMillis, new C78528Urs(jSONObject), "container_popupTapSpace");
            o.LJIIJ(p0.getHybridContext().containerId, "<set-?>");
            C72818Shy.LIZ(c76052yf);
        }
        return C76800UCe.LIZ;
    }
}
