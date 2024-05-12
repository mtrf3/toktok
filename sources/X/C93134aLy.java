package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM;
import com.ss.android.ugc.aweme.bnpl.network.VerifyApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM$requestRegisterInfo$2", f = "LandingAssemVM.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48, C61447O9r.LJIIJ, 65}, m = "invokeSuspend")
/* renamed from: X.aLy, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93134aLy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LandingAssemVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93134aLy(LandingAssemVM landingAssemVM, InterfaceC67352kd<? super C93134aLy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = landingAssemVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93134aLy(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C93133aLx c93133aLx = new C93133aLx(this.LJLILLLLZI, e, null);
            this.LJLIL = 3;
            if (XKX.LJI(abstractC78621UtN, c93133aLx, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C91820a0m c91820a0m = VerifyApi.LIZ;
            this.LJLIL = 1;
            c91820a0m.getClass();
            obj = C91820a0m.LIZIZ.consultRegisterInfo(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
        C93132aLw c93132aLw = new C93132aLw((C64797Pbt) obj, this.LJLILLLLZI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN2, c93132aLw, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
