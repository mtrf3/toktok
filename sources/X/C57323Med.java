package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.presenter.MusicDetailHelper$deletePinnedAweme$1", f = "MusicDetailHelper.kt", l = {257}, m = "invokeSuspend")
/* renamed from: X.Med, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57323Med extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57323Med(String str, String str2, InterfaceC67352kd<? super C57323Med> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57323Med(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            XGL LIZ = XGJ.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mota: ");
            LIZ2.append(LIZ.LIZ);
            LIZ2.append(", ");
            LIZ2.append(o.LJ(LIZ.LIZ, XH8.LIZ));
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
            try {
                C78977Uz7.LJJJJJL(LIZ.LIZ);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C36922EeM.LJ("mota retrofitInstance is empty");
            }
            XGR LIZ3 = LIZ.LIZ(new C57333Men(this.LJLILLLLZI, this.LJLJI));
            LIZ3.LIZ(new XH4(new XHV(this.LJLILLLLZI + this.LJLJI)));
            InterfaceC65462ha LIZIZ = LIZ3.LIZIZ();
            C57324Mee c57324Mee = new C57324Mee(this.LJLILLLLZI, this.LJLJI);
            this.LJLIL = 1;
            if (LIZIZ.collect(c57324Mee, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
