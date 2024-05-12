package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UYn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77381UYn implements InterfaceC116954iR<C32235Ckx> {
    public final /* synthetic */ List<C77383UYp> LJLIL;
    public final /* synthetic */ C77380UYm LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<C78163Ulz, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<List<? extends C77383UYp>, C76800UCe> LJLJJI;

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        C77380UYm c77380UYm = this.LJLILLLLZI;
        c77380UYm.LIZ = Boolean.TRUE;
        List<C77383UYp> list = this.LJLIL;
        c77380UYm.LIZIZ = list;
        this.LJLJJI.invoke(list);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLILLLLZI.LIZ = Boolean.FALSE;
        C32444CoK.LIZJ(e);
        this.LJLJI.invoke(new C78163Ulz(-22, "download mask failed", e));
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(C32235Ckx c32235Ckx) {
        C32235Ckx srcModel = c32235Ckx;
        o.LJIIIZ(srcModel, "srcModel");
        C77383UYp c77383UYp = new C77383UYp();
        c77383UYp.LIZ = srcModel.LIZIZ;
        c77383UYp.LIZIZ = 1;
        c77383UYp.LIZJ = srcModel.LIZ;
        this.LJLIL.add(c77383UYp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C77381UYn(List<C77383UYp> list, C77380UYm c77380UYm, InterfaceC88472Yns<? super C78163Ulz, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super List<? extends C77383UYp>, C76800UCe> interfaceC88472Yns2) {
        this.LJLIL = list;
        this.LJLILLLLZI = c77380UYm;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = interfaceC88472Yns2;
    }
}
