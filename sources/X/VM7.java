package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VM7 implements InterfaceC79625VMv {
    public final /* synthetic */ VMK LIZ;

    @Override // X.InterfaceC79625VMv
    public final void LIZ() {
        VML vml = this.LIZ.LJII;
        if (vml != null) {
            VM4.LJIILL.getClass();
            VM4 LIZ = VM3.LIZ("nativeError", null);
            JSONObject jSONObject = new JSONObject();
            C40082FoE.LJIIIIZZ(jSONObject, WM7.SCENE_SERVICE, "web_process_terminate");
            C40082FoE.LJIIIIZZ(jSONObject, "error_code", Integer.valueOf(this.LIZ.LJIILLIIL));
            C40082FoE.LJIIIIZZ(jSONObject, "error_msg", "webview renderer is unresponsive");
            vml.LJI(LIZ, jSONObject);
        }
    }

    @Override // X.InterfaceC79625VMv
    public final void LIZIZ() {
        VML vml = this.LIZ.LJII;
        if (vml != null) {
            VM4.LJIILL.getClass();
            VM4 LIZ = VM3.LIZ("nativeError", null);
            JSONObject jSONObject = new JSONObject();
            C40082FoE.LJIIIIZZ(jSONObject, WM7.SCENE_SERVICE, "web_process_terminate");
            C40082FoE.LJIIIIZZ(jSONObject, "error_code", Integer.valueOf(this.LIZ.LJIILL));
            C40082FoE.LJIIIIZZ(jSONObject, "error_msg", "webview js thread is unresponsive");
            vml.LJI(LIZ, jSONObject);
        }
    }

    public VM7(VMK vmk) {
        this.LIZ = vmk;
    }
}
