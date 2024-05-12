package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import fjb.a;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.MAFListManager$updateMafUser$1", f = "MAFListManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80783Fa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ IMUser LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80783Fa(IMUser iMUser, InterfaceC67352kd<? super C80783Fa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iMUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C80783Fa c80783Fa = new C80783Fa(this.LJLILLLLZI, interfaceC67352kd);
        c80783Fa.LJLIL = obj;
        return c80783Fa;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        MAFIMUser mAFIMUser;
        C141335gf.LIZJ(obj);
        Object obj2 = this.LJLIL;
        IMUser iMUser = this.LJLILLLLZI;
        synchronized (obj2) {
            List<MAFIMUser> list = C3FW.LIZ;
            ListIterator<MAFIMUser> listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    mAFIMUser = listIterator.previous();
                    if (o.LJ(mAFIMUser.getUid(), iMUser.getUid())) {
                        break;
                    }
                } else {
                    mAFIMUser = null;
                    break;
                }
            }
            MAFIMUser mAFIMUser2 = mAFIMUser;
            if (mAFIMUser2 != null) {
                mAFIMUser2.setNickName(iMUser.getNickName());
                mAFIMUser2.setUniqueId(iMUser.getUniqueId());
                mAFIMUser2.setAvatarThumb(iMUser.getAvatarThumb());
                mAFIMUser2.setAvatarMedium(iMUser.getAvatarMedium());
                mAFIMUser2.setFollowStatus(iMUser.getFollowStatus());
                mAFIMUser2.setShareStatus(iMUser.getShareStatus());
            }
            C3FV LJIJJ = C86443aK.LIZIZ(EF7.LIZIZ()).LJIJJ();
            String uid = iMUser.getUid();
            o.LJIIIIZZ(uid, "uid");
            String nickName = iMUser.getNickName();
            String uniqueId = iMUser.getUniqueId();
            LJIJJ.LJ(new C3ZY(uid, nickName, iMUser.getFollowStatus(), new Integer(iMUser.getShareStatus()), uniqueId, iMUser.getAvatarStr(), iMUser.getAvatarMediumStr()));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
