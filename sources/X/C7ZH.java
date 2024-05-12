package X;

import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.7ZH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ZH {
    public static final /* synthetic */ int LIZ = 0;

    public static C57364MfI LIZ(User user) {
        EnumC57366MfK enumC57366MfK = EnumC57366MfK.CARD;
        String recType = user.getRecType();
        String friendTypeStr = user.getFriendTypeStr();
        C57364MfI.Companion.getClass();
        return new C57364MfI("chat", "", enumC57366MfK, recType, C200007t6.LIZ(user), user.getUid(), null, null, user.getRequestId(), "", friendTypeStr, null, null, null, null, null, false, null, "expand_group_chat", null, null, false, null, false, 16513024, null);
    }

    public static void LIZIZ(EnumC57365MfJ enumC57365MfJ, User user, MatchedFriendStruct matchedFriendStruct) {
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI("chat");
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJJ("expand_group_chat");
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        c57362MfG.LJJJJIZL(user);
        c57362MfG.LJJIJLIJ(matchedFriendStruct);
        c57362MfG.LJIILIIL();
    }
}
