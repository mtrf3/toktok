package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.service.activitystatus.MUFActivityStatusAnalysisUtils$delayReportAsMUFModuleCache$1", f = "MUFActivityStatusAnalysisUtils.kt", l = {76}, m = "invokeSuspend")
/* renamed from: X.3B4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3B4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC75532xp LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3B4(int i, int i2, int i3, InterfaceC75532xp interfaceC75532xp, InterfaceC67352kd<? super C3B4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = interfaceC75532xp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3B4(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(500L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        int i2 = this.LJLILLLLZI;
        int i3 = this.LJLJI;
        int i4 = this.LJLJJI;
        InterfaceC75532xp interfaceC75532xp = this.LJLJJL;
        C65864Pt6 c65864Pt6 = new C65864Pt6();
        c65864Pt6.put("active_count", String.valueOf(i2));
        c65864Pt6.put("total_count", String.valueOf(i3));
        c65864Pt6.put("muf_count", String.valueOf(i4));
        if (C53117Ksz.LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c65864Pt6.put("optimization_enable", str);
        c65864Pt6.build();
        interfaceC75532xp.LIZIZ("as_muf_module_count", c65864Pt6);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
