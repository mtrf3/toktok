package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$getDrawBitmap$1$1", f = "StickerItemView.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2kR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67232kR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C130525Ai LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67232kR(C130525Ai c130525Ai, Bitmap bitmap, InterfaceC67352kd<? super C67232kR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c130525Ai;
        this.LJLILLLLZI = bitmap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67232kR(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C130525Ai c130525Ai = this.LJLIL;
        Bitmap bitmap = this.LJLILLLLZI;
        c130525Ai.LLIFFJFJJ = bitmap;
        if (bitmap != null) {
            c130525Ai.requestLayout();
            this.LJLIL.invalidate();
        }
        this.LJLIL.LLIIII = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
