package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SecUidOfIMUserManager$onMemberListUpdate$6$1", f = "SecUidOfIMUserManager.kt", l = {75}, m = "invokeSuspend")
/* renamed from: X.3Dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80473Dv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<IMUser> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C80473Dv(List<? extends IMUser> list, InterfaceC67352kd<? super C80473Dv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80473Dv(this.LJLILLLLZI, interfaceC67352kd);
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
            List<IMUser> list = this.LJLILLLLZI;
            this.LJLIL = 1;
            C80483Dw c80483Dw = new C80483Dw(false, false, 3);
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (IMUser iMUser : list) {
                C78841Uwv.LJJJJL(iMUser, c80483Dw, iMUser);
                arrayList.add(C76800UCe.LIZ);
            }
            C80533Eb c80533Eb = C80533Eb.LIZ;
            for (IMUser iMUser2 : list) {
                c80533Eb.getClass();
                C80533Eb.LJIILLIIL(iMUser2);
            }
            C80533Eb c80533Eb2 = C80533Eb.LIZ;
            for (IMUser iMUser3 : list) {
                c80533Eb2.getClass();
                C2U8.LIZ(new C39R(iMUser3.getUid(), iMUser3.getSecUid(), iMUser3));
            }
            InterfaceC80883Fk LJ = C80853Fh.LJ();
            ArrayList arrayList2 = new ArrayList();
            for (IMUser iMUser4 : list) {
                if (!C76917UGr.LJJJJJL(iMUser4)) {
                    arrayList2.add(iMUser4);
                }
            }
            Object LJIIIIZZ = LJ.LJIIIIZZ(arrayList2, this);
            if (LJIIIIZZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                LJIIIIZZ = C76800UCe.LIZ;
            }
            if (LJIIIIZZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
