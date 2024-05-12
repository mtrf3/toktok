package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.resize.StickerBitmapResizeHelperKt$resizeStickerBitmap$1$1", f = "StickerBitmapResizeHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gd9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41943Gd9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C68322mC<int[]> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C83489Wph LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41943Gd9(C68322mC<int[]> c68322mC, boolean z, C83489Wph c83489Wph, Context context, String str, InterfaceC67352kd<? super C41943Gd9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = z;
        this.LJLJI = c83489Wph;
        this.LJLJJI = context;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41943Gd9(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [int[], T] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C68322mC<int[]> c68322mC = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        int defaultHeight = this.LJLJI.LJ.getPl().getDefaultHeight();
        int defaultWidth = this.LJLJI.LJ.getPl().getDefaultWidth();
        Context context = this.LJLJJI;
        String str = this.LJLJJL;
        int[] iArr = this.LJLIL.element;
        C41944GdA.LIZ(z, defaultHeight, defaultWidth, context, str, iArr);
        c68322mC.element = iArr;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
