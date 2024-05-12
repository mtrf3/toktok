package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.ui.avatar.DMAvatarResManager$refreshFixedAvatar$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3fN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89573fN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C89593fP LJLIL;
    public final /* synthetic */ IMUser LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89573fN(C89593fP c89593fP, IMUser iMUser, InterfaceC67352kd<? super C89573fN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c89593fP;
        this.LJLILLLLZI = iMUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C89573fN(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        UrlModel urlModel = this.LJLIL.LIZIZ.get(this.LJLILLLLZI.getUid());
        if (urlModel == null) {
            return C76800UCe.LIZ;
        }
        if (C89553fL.LJ(urlModel, this.LJLILLLLZI.getAvatarThumb())) {
            this.LJLIL.LIZIZ.remove(this.LJLILLLLZI.getUid());
        } else if (C89553fL.LJI(this.LJLILLLLZI.getAvatarThumb(), false)) {
            C89593fP c89593fP = this.LJLIL;
            String uid = this.LJLILLLLZI.getUid();
            o.LJIIIIZZ(uid, "result.uid");
            UrlModel avatarThumb = this.LJLILLLLZI.getAvatarThumb();
            o.LJIIIIZZ(avatarThumb, "result.avatarThumb");
            c89593fP.LIZLLL(avatarThumb, uid, false);
        } else {
            C89553fL.LIZ("DMAvatarResManager", "refreshFixedUser: avatar from net is not valid");
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
