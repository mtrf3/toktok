package X;

import com.ss.android.ugc.aweme.feed.assem.friendstab.FriendsTabEducateButtonAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8tU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225728tU extends AbstractC65781Prl implements InterfaceC88471Ynr<FriendsTabEducateButtonAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C225728tU LJLIL = new C225728tU();

    public C225728tU() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FriendsTabEducateButtonAssem friendsTabEducateButtonAssem, C43I<? extends Integer> c43i) {
        FriendsTabEducateButtonAssem selectSubscribe = friendsTabEducateButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.LLII = true;
        selectSubscribe.LLIIII = false;
        C17N.LJJIIJZLJL(selectSubscribe.Y3());
        selectSubscribe.q4();
        if (C226068u2.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme(), EnumC61832bj.BOTTOM_BUTTON)) {
            List<User> educateAvatarUserList = LHM.LIZIZ.LIZ().getEducateAvatarUserList();
            selectSubscribe.LLIIIILZ = C226068u2.LIZIZ();
            C199897sv c199897sv = selectSubscribe.LLFII;
            if (c199897sv != null) {
                c199897sv.setAvatarSizeModel(16);
                ArrayList arrayList = new ArrayList(C32I.LJJL(educateAvatarUserList, 10));
                for (User user : educateAvatarUserList) {
                    String nickname = user.getNickname();
                    o.LJIIIIZZ(nickname, "it.nickname");
                    arrayList.add(new MutualUser("", nickname, user.getAvatarThumb(), user.getAvatarThumb(), ""));
                }
                c199897sv.LIZIZ(new MutualStruct(0, 0, arrayList, 0, 11, null));
            }
        }
        return C76800UCe.LIZ;
    }
}
