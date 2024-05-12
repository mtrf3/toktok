package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.ReflowSideProcessor$recordRelation$1", f = "ReflowSideProcessor.kt", l = {147}, m = "invokeSuspend")
/* renamed from: X.9Xj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238439Xj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC68342mE<C3C5<User>> LJLILLLLZI;
    public final /* synthetic */ A7W LJLJI;
    public final /* synthetic */ C238479Xn LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C238439Xj(InterfaceC68342mE<? extends C3C5<? extends User>> interfaceC68342mE, A7W a7w, C238479Xn c238479Xn, InterfaceC67352kd<? super C238439Xj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC68342mE;
        this.LJLJI = a7w;
        this.LJLJJI = c238479Xn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238439Xj(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC68342mE<C3C5<User>> interfaceC68342mE = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Object m15unboximpl = ((C3C5) obj).m15unboximpl();
        A7W a7w = this.LJLJI;
        C238479Xn c238479Xn = this.LJLJJI;
        if (C3C5.m13isSuccessimpl(m15unboximpl)) {
            User user = (User) m15unboximpl;
            a7w.LIZJ.setValue(new C33Y(c238479Xn, new C72912tb(user)));
            a7w.LIZIZ.put(c238479Xn, new C72912tb(user));
            o.LJIIIZ(c238479Xn, "<this>");
            o.LJIIIZ(user, "user");
            C55784Luu.LIZ.put(Integer.valueOf(user.hashCode()), c238479Xn);
            String uid = user.getUid();
            if (uid != null && uid.length() != 0) {
                java.util.Map<String, C238479Xn> map = C55784Luu.LIZIZ;
                String uid2 = user.getUid();
                o.LJIIIIZZ(uid2, "user.uid");
                map.put(uid2, c238479Xn);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getAutoMessageTooltipHelper().LIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post sharer: ");
            LIZ.append(V18.LJII(user));
            LIZ.append(" from request");
            C221018lt.LJFF("@LinkRelation", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("request:");
            LIZ2.append(c238479Xn);
            LIZ2.append(", resp: ");
            LIZ2.append(V18.LJII(user));
            C221018lt.LJFF("@LinkRelation", X1D.LIZIZ(LIZ2));
        }
        A7W a7w2 = this.LJLJI;
        C238479Xn c238479Xn2 = this.LJLJJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(m15unboximpl);
        if (m10exceptionOrNullimpl != null) {
            a7w2.LIZJ.setValue(new C33Y(c238479Xn2, new C3C1(m10exceptionOrNullimpl)));
            a7w2.LIZIZ.put(c238479Xn2, new C3C1(m10exceptionOrNullimpl));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("request:");
            LIZ3.append(c238479Xn2);
            LIZ3.append(" fail! message: ");
            LIZ3.append(m10exceptionOrNullimpl.getMessage());
            C221018lt.LIZIZ("@LinkRelation", X1D.LIZIZ(LIZ3));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
