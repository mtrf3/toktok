package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UmT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78193UmT extends AbstractC78171Um7 {
    public final /* synthetic */ C76732zl LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ InterfaceC78206Umg LIZJ;
    public final /* synthetic */ C78192UmS LIZLLL;
    public final /* synthetic */ InterfaceC78213Umn LJ;
    public final /* synthetic */ List<C32449CoP> LJFF;

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        InterfaceC78206Umg interfaceC78206Umg = this.LIZJ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJFF(engine, new C78163Ulz(-29, (String) null, 6));
        }
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJFF(EnumC78220Umu engine, C78163Ulz error) {
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(error, "error");
        InterfaceC78206Umg interfaceC78206Umg = this.LIZJ;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJFF(engine, error);
        }
    }

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        o.LJIIIZ(engine, "engine");
        C76732zl c76732zl = this.LIZ;
        int i = c76732zl.element + 1;
        c76732zl.element = i;
        if (i == this.LIZIZ) {
            InterfaceC78206Umg interfaceC78206Umg = this.LIZJ;
            if (interfaceC78206Umg != null) {
                interfaceC78206Umg.LJII(engine, c78165Um1);
                return;
            }
            return;
        }
        C78192UmS c78192UmS = this.LIZLLL;
        InterfaceC78213Umn interfaceC78213Umn = this.LJ;
        C32449CoP c32449CoP = (C32449CoP) ListProtector.get(this.LJFF, i);
        c78192UmS.getClass();
        C78192UmS.LIZJ(interfaceC78213Umn, c32449CoP, this);
    }

    public C78193UmT(C76732zl c76732zl, int i, InterfaceC78206Umg interfaceC78206Umg, C78192UmS c78192UmS, InterfaceC78213Umn interfaceC78213Umn, List<C32449CoP> list) {
        this.LIZ = c76732zl;
        this.LIZIZ = i;
        this.LIZJ = interfaceC78206Umg;
        this.LIZLLL = c78192UmS;
        this.LJ = interfaceC78213Umn;
        this.LJFF = list;
    }
}
