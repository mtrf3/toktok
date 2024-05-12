package X;

import android.graphics.Bitmap;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.widget.multiImageview.loader.MultiIconLoadHelper$fetchImageUrlsWithListener$1", f = "MultiIconLoadHelper.kt", l = {38}, m = "invokeSuspend")
/* renamed from: X.SbF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72401SbF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C72400SbE LJLJI;
    public final /* synthetic */ List<C72831SiB> LJLJJI;
    public final /* synthetic */ InterfaceC72403SbH LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C72401SbF(C72400SbE c72400SbE, List<? extends C72831SiB> list, InterfaceC72403SbH interfaceC72403SbH, InterfaceC67352kd<? super C72401SbF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c72400SbE;
        this.LJLJJI = list;
        this.LJLJJL = interfaceC72403SbH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C72401SbF c72401SbF = new C72401SbF(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c72401SbF.LJLILLLLZI = obj;
        return c72401SbF;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C72400SbE c72400SbE = this.LJLJI;
            List<C72831SiB> list = this.LJLJJI;
            this.LJLIL = 1;
            obj = c72400SbE.LIZ(list, interfaceC70422pa, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        List<Bitmap> list2 = (List) obj;
        if (list2.isEmpty()) {
            this.LJLJJL.LJIL();
        } else {
            this.LJLJJL.LIZ(list2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
