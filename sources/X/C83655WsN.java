package X;

/* renamed from: X.WsN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83655WsN implements InterfaceC83705WtB {
    @Override // X.InterfaceC83705WtB
    public final void LIZ(InterfaceC83704WtA interfaceC83704WtA) {
        boolean z;
        if ("lens_taint_scene_detect".length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || "TaintSceneDetectModel".length() == 0) {
            if (interfaceC83704WtA != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("parameter null, modelName: ");
                LIZ.append("lens_taint_scene_detect");
                LIZ.append(" requirement:");
                LIZ.append("TaintSceneDetectModel");
                interfaceC83704WtA.onError(X1D.LIZIZ(LIZ));
                return;
            }
            return;
        }
        if (interfaceC83704WtA == null) {
            return;
        }
        C142265iA.LIZ("TaintSceneDetectModel", "lens_taint_scene_detect", new C83690Wsw(interfaceC83704WtA));
    }
}
