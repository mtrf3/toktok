package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* renamed from: X.Ws0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83632Ws0 extends AbstractC83637Ws5 {
    public final String LIZIZ = "type_surface_view";
    public final C83626Wru LIZJ;

    @Override // X.InterfaceC83706WtC
    public final String getType() {
        return this.LIZIZ;
    }

    public C83632Ws0(C83626Wru c83626Wru) {
        this.LIZJ = c83626Wru;
    }

    public final void LIZIZ(Cert privacyCert) {
        o.LJIIIZ(privacyCert, "privacyCert");
        LIZ(new C83644WsC(this.LIZIZ, new C83677Wsj(0, 0), new NDG(this.LIZJ.LIZ(null, "action_name_init_camera"), privacyCert)));
    }

    public final void LIZJ(C78862UxG c78862UxG, boolean z) {
        LIZ(new C83644WsC(this.LIZIZ, new C83677Wsj(0, 0), new NDG(this.LIZJ.LIZ(new C83683Wsp(z), "action_name_release_camera"), c78862UxG)));
    }
}
