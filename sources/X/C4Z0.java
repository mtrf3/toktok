package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.ui.avatar.LegacyDMInboxAvatarLoadHelper$loadAvatar$1$2", f = "LegacyDMInboxAvatarLoadHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Z0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Z0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ImageUrlModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC85013Vh LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Z0(String str, ImageUrlModel imageUrlModel, InterfaceC85013Vh interfaceC85013Vh, int i, InterfaceC67352kd<? super C4Z0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = imageUrlModel;
        this.LJLJI = interfaceC85013Vh;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4Z0(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String str = this.LJLIL;
        ImageUrlModel imageModel = this.LJLILLLLZI;
        o.LJIIIIZZ(imageModel, "imageModel");
        C85353Wp.LIZIZ(this.LJLJJI, 4, this.LJLJI, imageModel, str);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
