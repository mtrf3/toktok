package X;

import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;

/* renamed from: X.Pip, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65227Pip implements InterfaceC65014PfO {
    public final InterfaceC65014PfO<?, ?> LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ.LIZ();
    }

    public C65227Pip(InterfaceC65014PfO<?, ?> interfaceC65014PfO) {
        this.LIZ = interfaceC65014PfO;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        C76L c76l = (C76L) this.LIZ.LIZIZ(ssHttpCall);
        C37277Ek5 c37277Ek5 = new C37277Ek5(ssHttpCall);
        c76l.LJFF(new RunnableC65751PrH(c76l, c37277Ek5), EnumC169566l6.LJLIL);
        return c76l;
    }
}
