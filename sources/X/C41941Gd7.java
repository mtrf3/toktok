package X;

import android.content.Context;
import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.resize.StickerBitmapResizeHelperKt$resizeStickerBitmap$1", f = "StickerBitmapResizeHelper.kt", l = {57, 69}, m = "invokeSuspend")
/* renamed from: X.Gd7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41941Gd7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83489Wph LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C68322mC<int[]> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJLL;
    public final /* synthetic */ Context LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41941Gd7(C83489Wph c83489Wph, String str, String str2, C68322mC<int[]> c68322mC, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, Context context, InterfaceC67352kd<? super C41941Gd7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c83489Wph;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41941Gd7(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C83489Wph c83489Wph;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    if (!((Boolean) obj).booleanValue() && C44687HgJ.LIZIZ(this.LJLJJI)) {
                        this.LJLJJLL.invoke(this.LJLJJI);
                    } else {
                        this.LJLJJLL.invoke(this.LJLJI);
                    }
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            boolean LIZ = C41942Gd8.LIZ();
            if (LIZ && (c83489Wph = this.LJLILLLLZI) != null) {
                XIA xia = C78613UtF.LIZJ;
                C41943Gd9 c41943Gd9 = new C41943Gd9(this.LJLJJL, LIZ, c83489Wph, this.LJLJL, this.LJLJI, null);
                this.LJLIL = 1;
                if (XKX.LJI(xia, c41943Gd9, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        int[] iArr = this.LJLJJL.element;
        int i2 = iArr[0];
        int i3 = iArr[1];
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        this.LJLIL = 2;
        obj = XKX.LJI(C78613UtF.LIZJ, new C41940Gd6(i2, i3, 4, compressFormat, str, str2, null), this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        this.LJLJJLL.invoke(this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}