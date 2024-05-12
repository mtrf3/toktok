package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.ui.avatar.DMAvatarResManager$onAvatarIsNull$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3fQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89603fQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C89593fP LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89603fQ(C89593fP c89593fP, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = c89593fP;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C89603fQ(this.LJLILLLLZI, this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UrlModel avatarThumb;
        C141335gf.LIZJ(obj);
        IMUser LJFF = C80533Eb.LJFF(this.LJLIL, null);
        if (LJFF != null && (avatarThumb = LJFF.getAvatarThumb()) != null && C89553fL.LJI(avatarThumb, false)) {
            this.LJLILLLLZI.LJ(this.LJLIL, avatarThumb);
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.LJFF(2, this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
