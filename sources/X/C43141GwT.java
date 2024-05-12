package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$getOutputFileTask$1", f = "OptimizeTakePhotoProcessor.kt", l = {137}, m = "invokeSuspend")
/* renamed from: X.GwT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43141GwT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ HD3 LJLILLLLZI;
    public final /* synthetic */ Bitmap LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43141GwT(HD3 hd3, Bitmap bitmap, String str, InterfaceC67352kd<? super C43141GwT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = hd3;
        this.LJLJI = bitmap;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43141GwT(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            HD3 hd3 = this.LJLILLLLZI;
            Bitmap bitmap = this.LJLJI;
            String str = this.LJLJJI;
            this.LJLIL = 1;
            hd3.getClass();
            obj = HD3.LJII(bitmap, str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
