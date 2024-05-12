package X;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$getAuditFileTask$1", f = "OptimizeTakePhotoProcessor.kt", l = {98, 110}, m = "invokeSuspend")
/* renamed from: X.GwU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43142GwU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC68342mE<OSZ<Bitmap, Long>> LJLILLLLZI;
    public final /* synthetic */ HD3 LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43142GwU(InterfaceC68342mE<OSZ<Bitmap, Long>> interfaceC68342mE, HD3 hd3, C68322mC<String> c68322mC, InterfaceC67352kd<? super C43142GwU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC68342mE;
        this.LJLJI = hd3;
        this.LJLJJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43142GwU(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC68342mE<OSZ<Bitmap, Long>> interfaceC68342mE = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Bitmap bitmap = (Bitmap) ((OSZ) obj).getFirst();
        if (bitmap != null) {
            int i2 = C54846Lfm.LJLJJI[0];
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i2 < width) {
                height = (int) (((height * 1.0d) / width) * i2);
            } else {
                i2 = width;
            }
            Bitmap resizeBitmap = BitmapUtils.resizeBitmap(bitmap, i2, height);
            HD3 hd3 = this.LJLJI;
            String str = this.LJLJJI.element;
            if (str != null) {
                this.LJLIL = 2;
                hd3.getClass();
                Object LJII = HD3.LJII(resizeBitmap, str, this);
                if (LJII != enumC58928NAu) {
                    return LJII;
                }
                return enumC58928NAu;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        this.LJLJJI.element = null;
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
