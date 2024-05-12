package X;

import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.resources.AnimatedEmojiResHelper$downloadAnimatedEmojiRes$unzipListener$1$unZipSucceed$1", f = "AnimatedEmojiResHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65702hy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C65702hy(InterfaceC67352kd<? super C65702hy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65702hy(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C71392r9.LIZJ());
        LIZ.append("/resources.zip");
        File file = new File(X1D.LIZIZ(LIZ));
        if (file.exists() && file.isFile()) {
            C16880lQ.LLLZZIL(file);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C65702hy(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
