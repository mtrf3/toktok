package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM$saveDraft$1$1", f = "EffectEditVM.kt", l = {364, 367}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class TA5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public CKEDraftInfoWrapper LJLIL;
    public C68322mC LJLILLLLZI;
    public C68322mC LJLJI;
    public int LJLJJI;
    public final /* synthetic */ C74189T9t LJLJJL;
    public final /* synthetic */ EffectEditVM LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TA5(C74189T9t c74189T9t, EffectEditVM effectEditVM, String str, InterfaceC67352kd<? super TA5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c74189T9t;
        this.LJLJJLL = effectEditVM;
        this.LJLJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new TA5(this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TA5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
