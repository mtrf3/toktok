package X;

import com.bytedance.bpea.basics.Cert;

/* renamed from: X.Wrx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83629Wrx extends AbstractC83637Ws5 {
    public final String LIZIZ = "type_activity_lifecycle";
    public final C83626Wru LIZJ;

    @Override // X.InterfaceC83706WtC
    public final String getType() {
        return this.LIZIZ;
    }

    public C83629Wrx(C83626Wru c83626Wru) {
        this.LIZJ = c83626Wru;
    }

    public final void LIZJ(Cert cert) {
        LIZ(new C83644WsC(this.LIZIZ, new C83677Wsj(1, 1), new NDG(this.LIZJ.LIZ(new C83678Wsk(true, 2), "action_name_start_preview"), cert)));
    }

    public final void LIZLLL(C78862UxG c78862UxG) {
        LIZ(new C83644WsC(this.LIZIZ, new C83677Wsj(2, 2), new NDG(this.LIZJ.LIZ(new C83684Wsq(true), "action_name_stop_preview"), c78862UxG)));
    }

    public final void LIZIZ(C78862UxG c78862UxG, boolean z) {
        LIZ(new C83644WsC(this.LIZIZ, new C83677Wsj(2, 2), new NDG(this.LIZJ.LIZ(new C83682Wso(z), "action_name_close_camera"), c78862UxG)));
    }
}
