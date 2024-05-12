package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursDetailAwemeListFragment$toInvite$1$1", f = "AddYoursDetailAwemeListFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219218iz extends AbstractC65782Prm implements InterfaceC88473Ynt<List<? extends UserInvitee>, List<? extends UserInvitee>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AddYoursTopic LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219218iz(AddYoursTopic addYoursTopic, InterfaceC67352kd<? super C219218iz> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = addYoursTopic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.3C4, java.lang.Object] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UrlModel urlModel;
        C141335gf.LIZJ(obj);
        List<UserInvitee> list = (List) this.LJLIL;
        AddYoursTopic addYoursTopic = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (UserInvitee userInvitee : list) {
            Long LJJIZ = C38350F3i.LJJIZ(userInvitee.getUid());
            UrlModel avatarModel = userInvitee.getAvatarModel();
            if (avatarModel == null) {
                String avatarUrl = userInvitee.getAvatarUrl();
                avatarModel = null;
                if (avatarUrl != null) {
                    try {
                        String path = new java.net.URL(avatarUrl).getPath();
                        UrlModel urlModel2 = new UrlModel();
                        urlModel2.setUri(path);
                        urlModel2.setUrlList(C47261Igj.LJJIJ(avatarUrl));
                        C3C5.m7constructorimpl(urlModel2);
                        urlModel = urlModel2;
                    } catch (Throwable th) {
                        ?? LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                        urlModel = LIZ;
                    }
                    if (!C3C5.m12isFailureimpl(urlModel)) {
                        avatarModel = urlModel;
                    }
                    avatarModel = avatarModel;
                }
            }
            arrayList.add(new AddYoursAvatar(LJJIZ, avatarModel, userInvitee.getUserName()));
        }
        C2U8.LIZ(new C219248j2(AddYoursTopic.copy$default(addYoursTopic, null, null, null, null, arrayList, null, null, null, 0, null, 1007, null), EnumC219268j4.INVITE_UPDATE_AVATARS));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(List<? extends UserInvitee> list, List<? extends UserInvitee> list2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C219218iz c219218iz = new C219218iz(this.LJLILLLLZI, interfaceC67352kd);
        c219218iz.LJLIL = list2;
        return c219218iz.invokeSuspend(C76800UCe.LIZ);
    }
}
