package X;

import fjb.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.mediator.SessionDataMediator$handleSourceDataBatchUpdateOperationCallback$1", f = "SessionDataMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Iw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81783Iw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC81793Ix LJLIL;
    public final /* synthetic */ C81803Iy LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81783Iw(InterfaceC81793Ix interfaceC81793Ix, C81803Iy c81803Iy, InterfaceC67352kd<? super C81783Iw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC81793Ix;
        this.LJLILLLLZI = c81803Iy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81783Iw(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleSourceDataBatchUpdateOperationCallback: ");
        LIZ.append(this.LJLIL.LIZ());
        LIZ.append(' ');
        LIZ.append(this.LJLIL.LIZIZ());
        C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ));
        C81983Jq LIZIZ = this.LJLIL.LIZIZ();
        if (LIZIZ == null) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LJLILLLLZI.LJLJJLL).entrySet()) {
                this.LJLILLLLZI.LJIILL(this.LJLIL, (C81983Jq) entry.getKey(), (C3J9) entry.getValue());
            }
        } else {
            C3J9 c3j9 = (C3J9) ((ConcurrentHashMap) this.LJLILLLLZI.LJLJJLL).get(LIZIZ);
            if (c3j9 == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("miss the session page:");
                LIZ2.append(LIZIZ);
                String msg = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(msg, "msg");
                C34B.LIZJ("SessionRefactor-SessionDataMediator", msg);
                return C76800UCe.LIZ;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("target session page : ");
            LIZ3.append(LIZIZ);
            C81843Jc.LIZJ("SessionRefactor-SessionDataMediator", X1D.LIZIZ(LIZ3));
            this.LJLILLLLZI.LJIILL(this.LJLIL, LIZIZ, c3j9);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
