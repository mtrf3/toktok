package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$5$photoIntercept$2", f = "OptimizeTakePhotoProcessor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GwV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43143GwV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ I4X LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ HD3 LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43143GwV(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, I4X i4x, String str, HD3 hd3, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C43143GwV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = i4x;
        this.LJLJI = str;
        this.LJLJJI = hd3;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43143GwV(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke();
        boolean booleanValue = ((Boolean) ((InterfaceC88472Yns) this.LJLILLLLZI.LJLJI).invoke(this.LJLJI)).booleanValue();
        this.LJLJJI.LJ();
        this.LJLJJL.invoke(Boolean.TRUE);
        return Boolean.valueOf(booleanValue);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
