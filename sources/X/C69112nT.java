package X;

import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel$zipEffect$2", f = "EffectDraftSubmissionModule.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2nT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69112nT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super File>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69112nT(String str, String str2, InterfaceC67352kd<? super C69112nT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69112nT(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            if (!C38977FRl.LJ(this.LJLIL, this.LJLILLLLZI)) {
                return null;
            }
            return new File(this.LJLIL);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("failed to zip effect package, e=");
            LIZ.append(th);
            H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super File> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
