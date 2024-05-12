package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.core.sendv2.postsend.PostSendGiftChecker$onResultCheck$1", f = "PostSendGiftChecker.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UVG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UVR LJLILLLLZI;
    public final /* synthetic */ C32816CuK LJLJI;
    public final /* synthetic */ UVA LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UVG(UVR uvr, C32816CuK c32816CuK, UVA uva, InterfaceC67352kd<? super UVG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = uvr;
        this.LJLJI = c32816CuK;
        this.LJLJJI = uva;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UVG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            C0NB.LJI(this.LJLILLLLZI.LJ, e);
            this.LJLILLLLZI.LIZLLL.invoke(this.LJLJI, new UV8(UVH.EXCEPTION, e));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            String str = this.LJLILLLLZI.LJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("thread(");
            LIZ.append(C16880lQ.LLLLIIIILLL().getId());
            LIZ.append(") onResultCheck task: ");
            LIZ.append(this.LJLJI.LIZ());
            C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
            UVA uva = this.LJLJJI;
            if (uva instanceof UVB) {
                this.LJLILLLLZI.LIZLLL.invoke(this.LJLJI, new UV8(UVH.REQUEST_FAIL, ((UVB) uva).LIZ));
            } else if (uva instanceof UV9) {
                this.LJLIL = 1;
                obj = this.LJLILLLLZI.LIZIZ(this.LJLJI, (UV9) uva, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        if (((Boolean) obj).booleanValue()) {
            String str2 = this.LJLILLLLZI.LJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("thread(");
            LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
            LIZ2.append(") onResultCheck pass: ");
            LIZ2.append(this.LJLJI.LIZ());
            C0NB.LIZIZ(str2, X1D.LIZIZ(LIZ2));
            this.LJLILLLLZI.LIZJ.invoke(this.LJLJI, new UV7(((UV9) this.LJLJJI).LIZ));
        }
        return C76800UCe.LIZ;
    }
}
