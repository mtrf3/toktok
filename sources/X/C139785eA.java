package X;

import android.graphics.Bitmap;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sharedar.message.handler.EffectReadyMessageHandler$loadCurrentUserAvatarAndSendToEffect$1$result$1", f = "EffectReadyMessageHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5eA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139785eA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ Bitmap LJLIL;
    public final /* synthetic */ File LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139785eA(Bitmap bitmap, File file, InterfaceC67352kd<? super C139785eA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = bitmap;
        this.LJLILLLLZI = file;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C139785eA(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return Boolean.valueOf(C42299Git.LJFF(this.LJLIL, this.LJLILLLLZI, 80, Bitmap.CompressFormat.JPEG));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
