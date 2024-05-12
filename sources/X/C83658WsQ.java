package X;

import com.bytedance.bpea.basics.Cert;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WsQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83658WsQ extends AbstractC83672Wse {
    public final String LIZ;
    public final C61878OQg LIZIZ;
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

    public C83658WsQ(C83622Wrq cameraApiComponent, C83693Wsz params) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(params, "params");
        this.LIZ = "action_name_init_audio_capture";
        this.LIZIZ = C61878OQg.INSTANCE;
        this.LIZJ = new AqS145S0200000_14(cameraApiComponent, params, 35);
    }
}
