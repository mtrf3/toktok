package X;

import android.graphics.drawable.BitmapDrawable;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderLowImgRep$LowImgLoadTask$start$1", f = "HeaderLowImgRep.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.RoH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70661RoH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C70663RoJ LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70661RoH(C70663RoJ c70663RoJ, InterfaceC67352kd<? super C70661RoH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c70663RoJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70661RoH(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (C70759Rpr.LIZJ(this.LJLIL.LIZJ)) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LJLIL.LJ.getResources(), C70759Rpr.LIZ(this.LJLIL.LIZJ));
            C70663RoJ c70663RoJ = this.LJLIL;
            c70663RoJ.LJFF = bitmapDrawable;
            c70663RoJ.LIZ(bitmapDrawable);
        }
        C70759Rpr.LIZLLL(this.LJLIL.LIZJ).LJIIIZ(new C70662RoI(this.LJLIL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
