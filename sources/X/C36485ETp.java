package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.AsyncPhotoSaver$saveBitmap$1$1", f = "AsyncPhotoSaver.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ETp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36485ETp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Integer, ? extends Integer>>, Object> {
    public final /* synthetic */ Bitmap LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36485ETp(Bitmap bitmap, InterfaceC67352kd<? super C36485ETp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bitmap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36485ETp(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            return new C57730MlC().LIZIZ(this.LJLIL);
        } catch (Exception unused) {
            return new OSZ(new Integer(-16777216), new Integer(-16777216));
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Integer, ? extends Integer>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
