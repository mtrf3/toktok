package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UmW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78196UmW extends C78205Umf {
    public final /* synthetic */ C78192UmS LIZIZ;
    public final /* synthetic */ InterfaceC78213Umn LIZJ;
    public final /* synthetic */ List<C32449CoP> LIZLLL;
    public final /* synthetic */ C32448CoO LJ;

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        o.LJIIIZ(engine, "engine");
        C78192UmS c78192UmS = this.LIZIZ;
        if (c78192UmS.LIZLLL) {
            c78192UmS.LIZLLL(this.LIZJ, this.LIZLLL, this.LJ.LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78196UmW(InterfaceC78206Umg interfaceC78206Umg, C78192UmS c78192UmS, InterfaceC78213Umn interfaceC78213Umn, List<C32449CoP> list, C32448CoO c32448CoO) {
        super(interfaceC78206Umg);
        this.LIZIZ = c78192UmS;
        this.LIZJ = interfaceC78213Umn;
        this.LIZLLL = list;
        this.LJ = c32448CoO;
    }
}
