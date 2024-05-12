package X;

import com.bytedance.bpea.basics.Cert;
import java.util.List;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WsD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83645WsD extends AbstractC83672Wse {
    public final String LIZ;
    public final List<Integer> LIZIZ;
    public final AqS180S0100000_14 LIZJ;

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

    public C83645WsD(C83622Wrq<?> cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = "action_name_init_camera";
        this.LIZIZ = C47261Igj.LJJIJ(0);
        this.LIZJ = new AqS180S0100000_14(cameraApiComponent, 327);
    }
}
