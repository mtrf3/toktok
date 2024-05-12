package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.improve.action.DownloadAction$copyFileToAlbum$1", f = "DownloadAction.kt", l = {443}, m = "invokeSuspend")
/* renamed from: X.6eP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165416eP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C44928HkC LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165416eP(String str, C44928HkC c44928HkC, Context context, boolean z, String str2, InterfaceC67352kd<? super C165416eP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = c44928HkC;
        this.LJLJJI = context;
        this.LJLJJL = z;
        this.LJLJJLL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165416eP(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            String str = this.LJLILLLLZI;
            if (str == null) {
                str = "";
            }
            this.LJLIL = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new C165366eK(str, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC165396eN abstractC165396eN = (AbstractC165396eN) obj;
        if (abstractC165396eN instanceof C165386eM) {
            C44928HkC c44928HkC = this.LJLJI;
            C62340OdM.LIZLLL(c44928HkC.LJLILLLLZI, this.LJLJJI, ((C165386eM) abstractC165396eN).LIZ, this.LJLJJLL, c44928HkC.LJLJI, c44928HkC.LJLJLLL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
