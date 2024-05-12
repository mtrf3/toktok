package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227128vk implements InterfaceC57784Mm4 {
    public final User LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;
    public final UrlModel LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final MatchedFriendStruct LJLJLJ;
    public final EnumC227268vy LJLJLLL;

    public C227128vk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C227128vk)) {
            return false;
        }
        C227128vk c227128vk = (C227128vk) obj;
        return o.LJ(this.LJLIL, c227128vk.LJLIL) && o.LJ(this.LJLILLLLZI, c227128vk.LJLILLLLZI) && o.LJ(this.LJLJI, c227128vk.LJLJI) && o.LJ(this.LJLJJI, c227128vk.LJLJJI) && o.LJ(this.LJLJJL, c227128vk.LJLJJL) && o.LJ(this.LJLJJLL, c227128vk.LJLJJLL) && o.LJ(this.LJLJL, c227128vk.LJLJL) && o.LJ(this.LJLJLJ, c227128vk.LJLJLJ) && this.LJLJLLL == c227128vk.LJLJLLL;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchFriendItem(rawUser=");
        LIZ.append(this.LJLIL);
        LIZ.append(", trackParams=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", avatarUri=");
        LIZ.append(this.LJLJI);
        LIZ.append(", nickname=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", username=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", followerCount=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", videoCount=");
        LIZ.append(this.LJLJL);
        LIZ.append(", matchFriend=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", section=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LIZ = C12400eC.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        UrlModel urlModel = this.LJLJI;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, (LIZ + hashCode) * 31, 31), 31);
        String str = this.LJLJJLL;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        String str2 = this.LJLJL;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        MatchedFriendStruct matchedFriendStruct = this.LJLJLJ;
        if (matchedFriendStruct != null) {
            i = matchedFriendStruct.hashCode();
        }
        return this.LJLJLLL.hashCode() + ((i3 + i) * 31);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C227128vk(User rawUser, java.util.Map map, EnumC227268vy enumC227268vy) {
        String LIZLLL;
        UrlModel avatarMedium = rawUser.getAvatarMedium();
        String nickname = rawUser.getNickname();
        nickname = nickname == null ? "" : nickname;
        String uniqueId = rawUser.getUniqueId();
        String str = uniqueId != null ? uniqueId : "";
        o.LJIIIZ(rawUser, "<this>");
        String LIZLLL2 = C86V.LIZLLL(R.plurals.sl, rawUser.getFollowerCount(), C77123UOp.LJJIIJ(rawUser.getFollowerCount()));
        o.LJIIIZ(rawUser, "<this>");
        if (rawUser.isAccuratePrivateAccount() && rawUser.getFollowStatus() != 1 && rawUser.getFollowStatus() != 2) {
            LIZLLL = null;
        } else {
            LIZLLL = C86V.LIZLLL(R.plurals.sr, rawUser.getAwemeCount(), C77123UOp.LJJIIJ(rawUser.getAwemeCount()));
        }
        MatchedFriendStruct matchedFriendStruct = rawUser.getMatchedFriendStruct();
        o.LJIIIZ(rawUser, "rawUser");
        this.LJLIL = rawUser;
        this.LJLILLLLZI = map;
        this.LJLJI = avatarMedium;
        this.LJLJJI = nickname;
        this.LJLJJL = str;
        this.LJLJJLL = LIZLLL2;
        this.LJLJL = LIZLLL;
        this.LJLJLJ = matchedFriendStruct;
        this.LJLJLLL = enumC227268vy;
    }
}
