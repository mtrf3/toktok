package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.bgbroadcast.game.FloatTipView$handleAutoDismiss$1", f = "FloatTipView.kt", l = {277}, m = "invokeSuspend")
/* renamed from: X.2Gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55802Gy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC264412a LJLILLLLZI;
    public final /* synthetic */ C55792Gx LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55802Gy(EnumC264412a enumC264412a, C55792Gx c55792Gx, InterfaceC67352kd<? super C55802Gy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC264412a;
        this.LJLJI = c55792Gx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55802Gy(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C55792Gx c55792Gx;
        InterfaceC88473Ynt<EnumC264412a, C12X, Object, C76800UCe> interfaceC88473Ynt;
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
            int priority = this.LJLILLLLZI.getPriority();
            if (priority != 0 && priority != 1) {
                if (priority != 2) {
                    if (priority == 3) {
                        j = 5000;
                    }
                } else {
                    j = 10000;
                }
                this.LJLIL = 1;
                if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        C55792Gx c55792Gx2 = this.LJLJI;
        boolean z = !c55792Gx2.LJLJL;
        EnumC264412a enumC264412a = EnumC264412a.LIVE_TIP_UNKNOWN;
        o.LJIIIZ(enumC264412a, "<set-?>");
        c55792Gx2.LLIIJI = enumC264412a;
        c55792Gx2.LLF = 2;
        this.LJLJI.hide();
        if (z && (interfaceC88473Ynt = (c55792Gx = this.LJLJI).LJLJLJ) != null) {
            interfaceC88473Ynt.invoke(this.LJLILLLLZI, C12X.TIME_OUT, c55792Gx.LLIIJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
