package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.control.VideoCoverHelper$getDisplayImageAndResize$2", f = "VideoCoverHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131145Cs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Bitmap>, Object> {
    public final /* synthetic */ C55O LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131145Cs(C55O c55o, InterfaceC67352kd<? super C131145Cs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c55o;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131145Cs(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Bitmap LJII = this.LJLIL.LIZ.getNleSession().P8().LJII(-1);
        if (LJII != null) {
            Bitmap resizeBitmapSync = C5CG.LIZ.resizeBitmapSync(C125444w8.LIZ().LIZ(), LJII, 300, 300);
            LJII.recycle();
            return resizeBitmapSync;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
