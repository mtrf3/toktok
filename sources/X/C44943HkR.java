package X;

import android.graphics.Bitmap;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.StickerResizeHelperKt$resizePropImagesAsync$1$3", f = "StickerResizeHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HkR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44943HkR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88471Ynr<IBJ, List<Bitmap>, C76800UCe> LJLIL;
    public final /* synthetic */ List<Bitmap> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44943HkR(List list, InterfaceC67352kd interfaceC67352kd, InterfaceC88471Ynr interfaceC88471Ynr) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C44943HkR(this.LJLILLLLZI, interfaceC67352kd, this.LJLIL);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke(IBJ.ERROR, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
