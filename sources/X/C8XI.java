package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8XI, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8XI extends TAZ implements InterfaceC88472Yns<ReusedAssem<?>, C76800UCe> {
    public C8XI(C8XH c8xh) {
        super(1, c8xh, C8XH.class, "onProxyBound", "onProxyBound(Lcom/bytedance/assem/arch/reused/ReusedAssem;Z)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ReusedAssem<?> reusedAssem) {
        C8XO c8xo;
        ReusedAssem<?> p0 = reusedAssem;
        o.LJIIIZ(p0, "p0");
        C8XH c8xh = (C8XH) this.receiver;
        if (!c8xh.LJLLJ) {
            p0.F3();
        }
        p0.A3();
        Object obj = c8xh.LJLIL;
        if (obj != null && (p0 instanceof C8XO) && (c8xo = (C8XO) p0) != null) {
            c8xo.n3(obj);
        }
        return C76800UCe.LIZ;
    }
}
