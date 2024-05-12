package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8XV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XV extends AbstractC65781Prl implements InterfaceC88472Yns<ReusedAssem<?>, C76800UCe> {
    public static final C8XV LJLIL = new C8XV();

    public C8XV() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ReusedAssem<?> reusedAssem) {
        C8XO c8xo;
        ReusedAssem<?> iterateChildren = reusedAssem;
        o.LJIIIZ(iterateChildren, "$this$iterateChildren");
        ReusedAssem.I3(iterateChildren, C8X3.HOSTDETACH, false, false, 6);
        if ((iterateChildren instanceof C8XO) && (c8xo = (C8XO) iterateChildren) != null) {
            c8xo.unBind();
        }
        iterateChildren.C3(LJLIL);
        return C76800UCe.LIZ;
    }
}
