package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UmV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78195UmV extends AbstractC78171Um7 {
    public final /* synthetic */ C78192UmS LIZ;
    public final /* synthetic */ InterfaceC78213Umn LIZIZ;
    public final /* synthetic */ List<C32449CoP> LIZJ;
    public final /* synthetic */ C32448CoO LIZLLL;

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        InterfaceC78206Umg interfaceC78206Umg;
        o.LJIIIZ(engine, "engine");
        C78192UmS c78192UmS = this.LIZ;
        if (c78192UmS.LIZLLL) {
            InterfaceC78213Umn interfaceC78213Umn = this.LIZIZ;
            List<C32449CoP> list = this.LIZJ;
            C32448CoO c32448CoO = this.LIZLLL;
            if (c32448CoO != null) {
                interfaceC78206Umg = c32448CoO.LIZ;
            } else {
                interfaceC78206Umg = null;
            }
            c78192UmS.LIZLLL(interfaceC78213Umn, list, interfaceC78206Umg);
        }
    }

    public C78195UmV(C78192UmS c78192UmS, InterfaceC78213Umn interfaceC78213Umn, List<C32449CoP> list, C32448CoO c32448CoO) {
        this.LIZ = c78192UmS;
        this.LIZIZ = interfaceC78213Umn;
        this.LIZJ = list;
        this.LIZLLL = c32448CoO;
    }
}
