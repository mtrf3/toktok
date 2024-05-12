package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.widget.multiImageview.loader.MultiIconLoadHelper$fetchImageUrls$2$1", f = "MultiIconLoadHelper.kt", l = {67}, m = "invokeSuspend")
/* renamed from: X.SbD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72399SbD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Bitmap>, Object> {
    public int LJLIL;
    public final /* synthetic */ C72400SbE LJLILLLLZI;
    public final /* synthetic */ C72831SiB LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72399SbD(C72400SbE c72400SbE, C72831SiB c72831SiB, InterfaceC67352kd<? super C72399SbD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c72400SbE;
        this.LJLJI = c72831SiB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72399SbD(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C72400SbE c72400SbE = this.LJLILLLLZI;
                C72831SiB c72831SiB = this.LJLJI;
                this.LJLIL = 1;
                c72400SbE.getClass();
                obj = C72400SbE.LIZJ(c72831SiB, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return (Bitmap) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
