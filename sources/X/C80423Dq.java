package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.service.IMUserService$updateIMUser$1", f = "IMUserService.kt", l = {63, SubscriptionExpireRemindHourSetting.DEFAULT, 76}, m = "invokeSuspend")
/* renamed from: X.3Dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80423Dq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IMUser LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80423Dq(IMUser iMUser, InterfaceC67352kd<? super C80423Dq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iMUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80423Dq(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        IMUser LJIIJ;
        IMUser LJIIJ2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            C34B.LJFF(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI.getAvatarThumb() != null && this.LJLILLLLZI.getAvatarMedium() != null) {
                IMUser iMUser = this.LJLILLLLZI;
                if (iMUser != null && (LJIIJ = C80533Eb.LJIIJ(iMUser.getUid(), iMUser.getSecUid())) != null) {
                    iMUser.setContactName(LJIIJ.getContactName());
                }
                IMUser iMUser2 = this.LJLILLLLZI;
                this.LJLIL = 3;
                if (C80533Eb.LJIJ(iMUser2, null, this, 6) == enumC58928NAu) {
                    return enumC58928NAu;
                }
                return C76800UCe.LIZ;
            }
            ImApi imApi = C793739p.LIZIZ;
            String uid = this.LJLILLLLZI.getUid();
            String secUid = this.LJLILLLLZI.getSecUid();
            this.LJLIL = 1;
            obj = imApi.queryUser(uid, secUid, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        UserStruct userStruct = (UserStruct) obj;
        if (userStruct != null && userStruct.getUser() != null) {
            userStruct.getUser().setFollowStatus(this.LJLILLLLZI.getFollowStatus());
            IMUser imUser = IMUser.fromUser(userStruct.getUser());
            if (imUser != null && (LJIIJ2 = C80533Eb.LJIIJ(imUser.getUid(), imUser.getSecUid())) != null) {
                imUser.setContactName(LJIIJ2.getContactName());
            }
            o.LJIIIIZZ(imUser, "imUser");
            this.LJLIL = 2;
            if (C80533Eb.LJIJ(imUser, null, this, 6) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
