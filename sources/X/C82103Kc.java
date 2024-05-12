package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.tab.DefaultInboxTabHandler$onSourceDataUpdate$1", f = "DefaultInboxTabHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82103Kc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC82423Li LJLIL;
    public final /* synthetic */ List<C3L4> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C82103Kc(AbstractC82423Li abstractC82423Li, List<? extends C3L4> list, boolean z, InterfaceC67352kd<? super C82103Kc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC82423Li;
        this.LJLILLLLZI = list;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82103Kc(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<InterfaceC82123Ke> list = this.LJLIL.LJLJL;
        List<C3L4> list2 = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        for (InterfaceC82123Ke interfaceC82123Ke : list) {
            C81833Jb LJ = C81843Jc.LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSessionListChange ");
            LIZ.append(interfaceC82123Ke);
            LJ.LIZJ(X1D.LIZIZ(LIZ));
            if (interfaceC82123Ke.LIZIZ() != C39N.INBOX || !C3K3.LIZ().LJLJJI) {
                interfaceC82123Ke.LIZJ(list2, z);
                C81833Jb LJ2 = C81843Jc.LJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onSessionListChange ");
                LIZ2.append(interfaceC82123Ke);
                LJ2.LIZ(X1D.LIZIZ(LIZ2));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
