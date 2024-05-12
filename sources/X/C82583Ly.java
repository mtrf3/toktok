package X;

import fjb.a;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.mediator.InboxSessionMediator$startWorking$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82583Ly extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C82543Lu LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82583Ly(C82543Lu c82543Lu, InterfaceC67352kd<? super C82583Ly> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c82543Lu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82583Ly(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", "startWorking");
        C82543Lu c82543Lu = this.LJLIL;
        if (!c82543Lu.LJZ) {
            c82543Lu.LJZ = true;
            C87687YbD.LIZ.getClass();
            if (C87687YbD.LIZIZ()) {
                c82543Lu.LJLJL.add(c82543Lu.LJLIL.getValue());
            }
            c82543Lu.LJLJL.add(c82543Lu.LJLILLLLZI.getValue());
            c82543Lu.LJLJL.add(c82543Lu.LJLJI.getValue());
            c82543Lu.LJLJLJ.add(c82543Lu.LJLILLLLZI.getValue());
            c82543Lu.LJLJLJ.add(c82543Lu.LJLJI.getValue());
            Iterator<C3MX> it = c82543Lu.LJLJL.iterator();
            while (it.hasNext()) {
                it.next().LIZJ(new C3MG(c82543Lu));
            }
        }
        C96963rI.LJ().getClass();
        C96963rI.LIZLLL().getClass();
        if (C84563To.LIZ()) {
            C84543Tm.LIZ();
        }
        AbstractC82423Li LJIIIIZZ = this.LJLIL.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LJIIIZ();
        }
        Iterator<C3JJ> it2 = this.LJLIL.LJLJLJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
        C114304eA.LIZIZ(C82823Mw.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
