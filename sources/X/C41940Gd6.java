package X;

import android.graphics.Bitmap;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.resize.StickerBitmapResizeHelperKt$saveBitImgBitmap$2", f = "StickerBitmapResizeHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gd6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41940Gd6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Bitmap.CompressFormat LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41940Gd6(int i, int i2, int i3, Bitmap.CompressFormat compressFormat, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = str2;
        this.LJLJJLL = compressFormat;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        String str = this.LJLIL;
        return new C41940Gd6(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJLL, str, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!C44687HgJ.LIZIZ(this.LJLIL)) {
            return Boolean.FALSE;
        }
        Bitmap LJFF = C42307Gj1.LJFF(this.LJLILLLLZI, this.LJLJI, C42307Gj1.LIZIZ(this.LJLIL), this.LJLJJI, this.LJLIL);
        if (LJFF == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(C42307Gj1.LJ(LJFF, new File(this.LJLJJL), 100, this.LJLJJLL));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
