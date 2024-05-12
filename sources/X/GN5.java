package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.da.DraftMonitorHelper$mobDraftEntrance$1", f = "DraftMonitorHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GN5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ GP9 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GN5(GP9 gp9, String str, InterfaceC67352kd<? super GN5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = gp9;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GN5(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C145995oB LIZIZ = GFJ.LIZIZ(GPD.LIZLLL(new GPG(null, null, null, false, this.LJLIL, null, 47)), "draft_cnt");
        LIZIZ.LJI("enter_from", this.LJLILLLLZI);
        FMX.LJIIL("click_draft_entrance", LIZIZ.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
