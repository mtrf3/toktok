package X;

import Y.IDfS24S0200000_9;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import fjb.a;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.presenter.MusicDetailHelper$query$1", f = "MusicDetailHelper.kt", l = {274}, m = "invokeSuspend")
/* renamed from: X.Mec, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57322Mec extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC57356MfA LJLJI;
    public final /* synthetic */ InterfaceC57325Mef LJLJJI;
    public final /* synthetic */ MJ0 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57322Mec(boolean z, InterfaceC57356MfA interfaceC57356MfA, InterfaceC57325Mef interfaceC57325Mef, MJ0 mj0, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC57356MfA;
        this.LJLJJI = interfaceC57325Mef;
        this.LJLJJL = mj0;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57322Mec(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC199577sP enumC199577sP;
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
            if (this.LJLILLLLZI) {
                enumC199577sP = EnumC199577sP.NetWhenCacheMiss;
            } else {
                enumC199577sP = EnumC199577sP.NetworkOnly;
            }
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
            XGR LIZIZ = LIZ.LIZIZ(this.LJLJI);
            AbstractC54815LfH abstractC54815LfH = (AbstractC54815LfH) MJ0.LJ.getValue();
            AqS191S0100000_9 aqS191S0100000_9 = new AqS191S0100000_9(this.LJLJJI, 30);
            AqS140S0200000_9 aqS140S0200000_9 = new AqS140S0200000_9(this.LJLJJI, this.LJLJJL, 15);
            o.LJ(MusicDetail.class, C57338Mes.class);
            LIZIZ.LIZ(new C84569XGz(new C57354Mf8(abstractC54815LfH, aqS191S0100000_9, aqS140S0200000_9, C57338Mes.class, MusicDetail.class)));
            C78977Uz7.LJJIJL(LIZIZ, enumC199577sP);
            InterfaceC65462ha LIZIZ2 = LIZIZ.LIZIZ();
            IDfS24S0200000_9 iDfS24S0200000_9 = new IDfS24S0200000_9(this.LJLJJI, this.LJLJJL, 2);
            this.LJLIL = 1;
            if (LIZIZ2.collect(iDfS24S0200000_9, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
