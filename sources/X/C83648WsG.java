package X;

import com.bytedance.bpea.basics.Cert;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WsG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83648WsG extends AbstractC83672Wse {
    public final String LIZ;
    public final List<Integer> LIZIZ;
    public final AqS145S0200000_14 LIZJ;

    @Override // X.InterfaceC83686Wss
    public final InterfaceC88472Yns<Cert, C76800UCe> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC83686Wss
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC83686Wss
    public final List<Integer> LIZJ() {
        return this.LIZIZ;
    }

    public C83648WsG(C83622Wrq cameraApiComponent, C83678Wsk params) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(params, "params");
        this.LIZ = "action_name_start_preview";
        this.LIZIZ = C47261Igj.LJJIJ(0);
        this.LIZJ = new AqS145S0200000_14(cameraApiComponent, params, 39);
    }
}
