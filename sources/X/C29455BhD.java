package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.UserExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileRepository$asyncBatchRequestInCo$userDeferred$1", f = "LiveProfileRepository.kt", l = {108}, m = "invokeSuspend")
/* renamed from: X.BhD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29455BhD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super BaseResponse<User, UserExtra>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29465BhN LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29455BhD(C29465BhN c29465BhN, boolean z, InterfaceC67352kd<? super C29455BhD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29465BhN;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29455BhD(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        java.util.Map LJJL;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            C29465BhN c29465BhN = this.LJLILLLLZI;
            C29475BhX c29475BhX = c29465BhN.LIZ;
            long j = c29475BhX.LIZJ;
            Room room = c29475BhX.LIZLLL;
            C29456BhE c29456BhE = c29465BhN.LIZIZ;
            int i3 = 4;
            if (c29456BhE.LIZ()) {
                i = 4;
            } else {
                i = 1;
            }
            if (!c29456BhE.LIZJ()) {
                i3 = 1;
            }
            if (c29456BhE.LIZIZ()) {
                i |= 2;
            }
            if (c29456BhE.LJ() || c29456BhE.LIZ.coHostEnable) {
                i3 |= 8;
            }
            if (c29456BhE.LIZLLL()) {
                LJJL = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(c29456BhE.LIZIZ.getId()), Integer.valueOf(i)));
            } else {
                LJJL = C113554cx.LJJL(new OSZ(Long.valueOf(c29456BhE.LIZIZ.getId()), Integer.valueOf(i)), new OSZ(Long.valueOf(c29456BhE.LIZJ), Integer.valueOf(i3)));
            }
            C73470SsU LJIILJJIL = ((C29374Bfu) LIZIZ).LJIILJJIL(C29272BeG.LIZ(j, room, LJJL, this.LJLJI));
            o.LJIIIIZZ(LJIILJJIL, "getInstance().user().que…tchRequest\"\n            )");
            this.LJLIL = 1;
            obj = C29306Beo.LJJIIZI(LJIILJJIL, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super BaseResponse<User, UserExtra>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
