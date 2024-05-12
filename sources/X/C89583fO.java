package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.ui.avatar.DMAvatarResManager$checkOuterAvatar$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3fO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89583fO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ UrlModel LJLILLLLZI;
    public final /* synthetic */ C89593fP LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89583fO(String str, UrlModel urlModel, C89593fP c89593fP, InterfaceC67352kd<? super C89583fO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = urlModel;
        this.LJLJI = c89593fP;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C89583fO(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UrlModel avatarThumb;
        C141335gf.LIZJ(obj);
        UrlModel urlModel = null;
        IMUser LJFF = C80533Eb.LJFF(this.LJLIL, null);
        if (LJFF != null && (avatarThumb = LJFF.getAvatarThumb()) != null && C89553fL.LJI(avatarThumb, false)) {
            urlModel = avatarThumb;
        }
        if (C89553fL.LJ(this.LJLILLLLZI, urlModel)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkOuterAvatar: outer avatar is same as db avatar, uid=");
            LIZ.append(this.LJLIL);
            LIZ.append(", uri=");
            LIZ.append(C89553fL.LJIIIIZZ(this.LJLILLLLZI, true));
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ));
            this.LJLJI.LIZIZ.remove(this.LJLIL);
        } else if (urlModel != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("checkOuterAvatar: outer avatar is not same as db avatar, uid=");
            LIZ2.append(this.LJLIL);
            LIZ2.append(", uri=");
            LIZ2.append(C89553fL.LJIIIIZZ(this.LJLILLLLZI, true));
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ2));
            this.LJLJI.LIZIZ.remove(this.LJLIL);
            this.LJLJI.LIZLLL(urlModel, this.LJLIL, true);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("checkOuterAvatar: db avatar is null, refresh, uid=");
            LIZ3.append(this.LJLIL);
            LIZ3.append(", uri=");
            LIZ3.append(C89553fL.LJIIIIZZ(this.LJLILLLLZI, true));
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ3));
            this.LJLJI.LJFF(2, this.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
