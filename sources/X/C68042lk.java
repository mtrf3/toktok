package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFloatingViewKt$ScreenShotImageView$3$1$1$1", f = "ScreenShotFloatingView.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68042lk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Bitmap> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68042lk(String str, InterfaceC35811ar<Bitmap> interfaceC35811ar, InterfaceC67352kd<? super C68042lk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68042lk(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLILLLLZI.setValue(BitmapFactory.decodeFile(this.LJLIL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
