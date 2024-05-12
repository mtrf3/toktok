package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.exporttasks.MobileEffectExportTask$export$2", f = "MobileEffectExportTask.kt", l = {38, 39}, m = "invokeSuspend")
/* renamed from: X.EQp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36407EQp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public long LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C36411EQt LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36407EQp(C36411EQt c36411EQt, InterfaceC67352kd<? super C36407EQp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c36411EQt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C36407EQp c36407EQp = new C36407EQp(this.LJLJJL, interfaceC67352kd);
        c36407EQp.LJLJJI = obj;
        return c36407EQp;
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
                    this.LJLJJL.LJ = true;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Export done, exportTimeUsed=");
                    LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                    LIZ.append("ms");
                    C15280iq.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
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
            if (this.LJLJJL.LJ) {
                return Boolean.TRUE;
            }
            currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Export started, effectId=");
            LIZ2.append(this.LJLJJL.LIZIZ.effectId);
            C15280iq.LIZIZ("DiyProp", X1D.LIZIZ(LIZ2));
            C84661XKn LIZIZ2 = XKX.LIZIZ(interfaceC70422pa, null, null, new C36408EQq(this.LJLJJL, null), 3);
            LIZIZ = XKX.LIZIZ(interfaceC70422pa, null, null, new C36409EQr(this.LJLJJL, null), 3);
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
        this.LJLJJL.LJ = true;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Export done, exportTimeUsed=");
        LIZ3.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ3.append("ms");
        C15280iq.LIZIZ("DiyProp", X1D.LIZIZ(LIZ3));
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
