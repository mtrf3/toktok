package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7E8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7E8 extends AbstractC65781Prl implements InterfaceC88471Ynr<StoryViewerEntranceComponent, OSZ<? extends String, ? extends List<? extends User>>, C76800UCe> {
    public static final C7E8 LJLIL = new C7E8();

    public C7E8() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(StoryViewerEntranceComponent storyViewerEntranceComponent, OSZ<? extends String, ? extends List<? extends User>> osz) {
        StoryViewerEntranceComponent selectSubscribe = storyViewerEntranceComponent;
        OSZ<? extends String, ? extends List<? extends User>> osz2 = osz;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (osz2 != null) {
            String first = osz2.getFirst();
            List<? extends User> second = osz2.getSecond();
            List<? extends User> subList = second.subList(0, Math.min(second.size(), 3));
            if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), first) && subList != null && !subList.isEmpty()) {
                int size = subList.size();
                ArrayList arrayList = new ArrayList(C32I.LJJL(subList, 10));
                for (User user : subList) {
                    String secUid = user.getSecUid();
                    UrlModel avatarMedium = user.getAvatarMedium();
                    UrlModel avatarThumb = user.getAvatarThumb();
                    String nickname = user.getNickname();
                    String uid = user.getUid();
                    o.LJIIIIZZ(secUid, "secUid");
                    o.LJIIIIZZ(nickname, "nickname");
                    o.LJIIIIZZ(uid, "uid");
                    arrayList.add(new MutualUser(secUid, nickname, avatarMedium, avatarThumb, uid));
                }
                MutualStruct mutualStruct = new MutualStruct(0, size, arrayList, 0, 9, null);
                C199897sv c199897sv = selectSubscribe.LLI;
                if (c199897sv != null) {
                    c199897sv.setDarkMode(true);
                    c199897sv.LJFF(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                    c199897sv.LIZ(mutualStruct);
                    c199897sv.setVisibility(0);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
