package X;

import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sticker.resources.ActionBarStickerResHelper$downloadActionBarStickerRes$unzipListener$1$unZipSucceed$1", f = "ActionBarStickerResHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65722i0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C65722i0(InterfaceC67352kd<? super C65722i0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65722i0(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C4FC.LIZLLL(null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C4FC.LIZJ());
        LIZ.append("/resources.zip");
        File file = new File(X1D.LIZIZ(LIZ));
        if (file.exists() && file.isFile()) {
            C16880lQ.LLLZZIL(file);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C65722i0(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
