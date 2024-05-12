package X;

import android.app.Dialog;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$restore$3", f = "DraftRestoreOp.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GXF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C41656GWm>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ GXC LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GXF(GXC gxc, InterfaceC67352kd<? super GXF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = gxc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        GXF gxf = new GXF(this.LJLJI, interfaceC67352kd);
        gxf.LJLILLLLZI = obj;
        return gxf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.app.Dialog] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ProgressDialogC43239Gy3 progressDialogC43239Gy3;
        ProgressDialogC43239Gy3 progressDialogC43239Gy32;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                ?? r3 = (Dialog) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
                progressDialogC43239Gy32 = r3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C41665GWv c41665GWv = (C41665GWv) ((InterfaceC41667GWx) this.LJLJI.LJLILLLLZI);
            if (c41665GWv.LIZIZ != 1000) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                progressDialogC43239Gy3 = C42034Gec.LIZJ(c41665GWv.LIZ, EnumC42288Gii.VISIBLE_AFTER_5S, null);
            } else {
                progressDialogC43239Gy3 = null;
            }
            C82519Wa3.LJFF(true);
            C84661XKn LIZIZ = XKX.LIZIZ(interfaceC70422pa, null, null, new GXE(this.LJLJI, progressDialogC43239Gy3, null), 3);
            if (progressDialogC43239Gy3 != null) {
                progressDialogC43239Gy3.LJLJLJ = new GXN(LIZIZ);
            }
            this.LJLILLLLZI = progressDialogC43239Gy3;
            this.LJLIL = 1;
            obj = LIZIZ.LJJIJ(this);
            progressDialogC43239Gy32 = progressDialogC43239Gy3;
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (progressDialogC43239Gy32 != null) {
            progressDialogC43239Gy32.dismiss();
        }
        C82519Wa3.LJFF(false);
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C41656GWm> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
