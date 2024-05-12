package X;

import com.ss.android.ugc.aweme.contact.data.api.IMContactApi;
import com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo;
import com.ss.android.ugc.aweme.contact.model.UserProfileResponse;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager$getIMUserFromDB$1", f = "IMContactManager.kt", l = {69, 70}, m = "invokeSuspend")
/* renamed from: X.2vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74382vy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74382vy(Long l, InterfaceC67352kd<? super C74382vy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74382vy(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<IMUserProfileInfo> list;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
        } catch (Exception e) {
            C85913Yt c85913Yt = C85913Yt.LIZ;
            String str = "getIMUserFromDB: error=" + e.getMessage();
            c85913Yt.getClass();
            C85913Yt.LJIIIIZZ(str);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            IMContactApi.LIZ.getClass();
            IMContactApi LIZ = C74602wK.LIZ();
            String LIZJ = C75792yF.LIZJ(new String[]{this.LJLJI.toString()});
            this.LJLILLLLZI = 1;
            obj = LIZ.getUsersByUids(LIZJ, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        UserProfileResponse userProfileResponse = (UserProfileResponse) obj;
        if (userProfileResponse != null && (list = userProfileResponse.users) != null) {
            C85913Yt c85913Yt2 = C85913Yt.LIZ;
            IMUserProfileInfo iMUserProfileInfo = (IMUserProfileInfo) ORZ.LJLLLLLL(0, list);
            this.LJLIL = list;
            this.LJLILLLLZI = 2;
            if (c85913Yt2.LJIIJJI(iMUserProfileInfo, this) == enumC58928NAu) {
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
