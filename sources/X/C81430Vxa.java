package X;

import com.bytedance.bpea.basics.Cert;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81430Vxa extends AbstractC83672Wse {
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

    public C81430Vxa(C83622Wrq cameraApiComponent, VJ5 params) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(params, "params");
        this.LIZ = "action_name_switch_shake_free_mode";
        this.LIZIZ = C47261Igj.LJJIJIIJI(1, 0);
        this.LIZJ = new AqS145S0200000_14(cameraApiComponent, params, 34);
    }
}