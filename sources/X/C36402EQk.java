package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.exporttasks.MobileEffectGSExportTask$export$2", f = "MobileEffectGSExportTask.kt", l = {45, 46}, m = "invokeSuspend")
/* renamed from: X.EQk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36402EQk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public long LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C36413EQv LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36402EQk(C36413EQv c36413EQv, InterfaceC67352kd<? super C36402EQk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c36413EQv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36402EQk c36402EQk = new C36402EQk(this.LJLJJL, interfaceC67352kd);
        c36402EQk.LJLJJI = obj;
        return c36402EQk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        InterfaceC68342mE LIZIZ;
        boolean booleanValue;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    booleanValue = this.LJLILLLLZI;
                    currentTimeMillis = this.LJLIL;
                    C141335gf.LIZJ(obj);
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    this.LJLJJL.LJII = true;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Export done, exportTimeUsed=");
                    LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                    LIZ.append("ms");
                    C15280iq.LIZIZ("MobileEffectGSExportTask", X1D.LIZIZ(LIZ));
                    if (booleanValue || !booleanValue2) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currentTimeMillis = this.LJLIL;
            LIZIZ = (InterfaceC68342mE) this.LJLJJI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLJJI;
            if (this.LJLJJL.LJII) {
                return Boolean.TRUE;
            }
            currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Export started, effectId=");
            LIZ2.append(this.LJLJJL.LIZJ.effectId);
            C15280iq.LIZIZ("MobileEffectGSExportTask", X1D.LIZIZ(LIZ2));
            C84661XKn LIZIZ2 = XKX.LIZIZ(interfaceC70422pa, C78613UtF.LIZJ, null, new C36404EQm(this.LJLJJL, null), 2);
            LIZIZ = XKX.LIZIZ(interfaceC70422pa, null, null, new C36403EQl(this.LJLJJL, null), 3);
            this.LJLJJI = LIZIZ;
            this.LJLIL = currentTimeMillis;
            this.LJLJI = 1;
            obj = LIZIZ2.LJJIJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        booleanValue = ((Boolean) obj).booleanValue();
        this.LJLJJI = null;
        this.LJLIL = currentTimeMillis;
        this.LJLILLLLZI = booleanValue;
        this.LJLJI = 2;
        obj = LIZIZ.LJI(this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        boolean booleanValue22 = ((Boolean) obj).booleanValue();
        this.LJLJJL.LJII = true;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Export done, exportTimeUsed=");
        LIZ3.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ3.append("ms");
        C15280iq.LIZIZ("MobileEffectGSExportTask", X1D.LIZIZ(LIZ3));
        if (booleanValue) {
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
