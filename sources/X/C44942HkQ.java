package X;

import android.graphics.Bitmap;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.StickerResizeHelperKt$resizePropImagesAsync$1$2", f = "StickerResizeHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HkQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44942HkQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<IB3> LJLIL;
    public final /* synthetic */ List<Bitmap> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<IBJ, List<Bitmap>, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C44942HkQ(List<IB3> list, List<Bitmap> list2, InterfaceC88471Ynr<? super IBJ, ? super List<Bitmap>, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C44942HkQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C44942HkQ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.size() == this.LJLILLLLZI.size()) {
            this.LJLJI.invoke(IBJ.COMPLETE, this.LJLILLLLZI);
        } else {
            this.LJLJI.invoke(IBJ.ERROR, this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
