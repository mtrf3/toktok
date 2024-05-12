package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.mention.model.MentionCheckResult;
import com.ss.android.ugc.aweme.mention.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.mention.models.MentionRecentContactResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217958gx {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C217978gz.LJLIL);

    public static C217808gi LIZIZ(SearchUserSugResponse response, String keyword) {
        String str;
        boolean z;
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(response, "response");
        ArrayList arrayList = new ArrayList();
        List<? extends SearchSugEntity> list = response.sugList;
        String str2 = "";
        if (list != null) {
            for (SearchSugEntity item : list) {
                o.LJIIIZ(item, "item");
                SugExtraInfo sugExtraInfo = item.sugExtraInfo;
                if (sugExtraInfo != null) {
                    String userId = sugExtraInfo.getUserId();
                    if (userId == null) {
                        userId = "";
                    }
                    int followStatus = sugExtraInfo.getFollowStatus();
                    String userNickname = sugExtraInfo.getUserNickname();
                    if (userNickname == null) {
                        userNickname = "";
                    }
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUri(sugExtraInfo.getUserAvatarUri());
                    urlModel.setUrlList(C47261Igj.LJJIJIIJI(sugExtraInfo.getUserAvatarUri(), sugExtraInfo.getUserAvatarUri()));
                    String username = sugExtraInfo.getUsername();
                    if (username == null) {
                        username = "";
                    }
                    if (!sugExtraInfo.isVerifiedUser()) {
                        str = "";
                    } else {
                        str = "verified";
                    }
                    String secUserId = sugExtraInfo.getSecUserId();
                    if (secUserId == null) {
                        secUserId = "";
                    }
                    if (sugExtraInfo.getMentionBlockType() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    EnumC217828gk enumC217828gk = EnumC217828gk.ALL;
                    Word word = item.mWord;
                    String userRelationType = sugExtraInfo.getUserRelationType();
                    String str3 = response.requestId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    List list2 = item.position;
                    if (list2 == null) {
                        list2 = C61878OQg.INSTANCE;
                    }
                    List list3 = item.hignLightPositions;
                    if (list3 == null) {
                        list3 = C61878OQg.INSTANCE;
                    }
                    Y9G y9g = new Y9G(userId, followStatus, userNickname, null, urlModel, username, null, str, null, 0, null, null, 0, secUserId, new C217878gp(z, enumC217828gk, true, word, userRelationType, str3, 0, list2, list3, 64), 261780);
                    if (!o.LJ(y9g.LIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
                        arrayList.add(y9g);
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((Y9G) next).LIZ)) {
                arrayList2.add(next);
            }
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
        String str4 = response.requestId;
        if (str4 != null) {
            str2 = str4;
        }
        return new C217808gi(new C217798gh(str2, response.LIZ(), keyword, EnumC217778gf.SEARCH, null, null, 0, response.logPbBean, 225), LLJILJILJ);
    }

    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    public static C217808gi LIZ(MentionRecentContactResponse mentionRecentContactResponse, List recentLocal, List followLocal) {
        int i;
        Y9G LIZ2;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        List<User> list;
        Object obj;
        Y9G LIZ3;
        boolean z4;
        o.LJIIIZ(recentLocal, "recentLocal");
        o.LJIIIZ(followLocal, "followLocal");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : followLocal) {
            String uid = ((IMUser) obj2).getUid();
            o.LJIIIIZZ(uid, "it.uid");
            if (!o.LJ(uid, ((RBX) HG3.LJIILL()).getCurUserId())) {
                arrayList3.add(obj2);
            }
        }
        List<IMUser> LLILII = ORZ.LLILII(new Comparator() { // from class: X.8gy
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                IMUser iMUser = (IMUser) obj3;
                IMUser iMUser2 = (IMUser) obj4;
                String initialLetter = iMUser.getInitialLetter();
                String initialLetter2 = iMUser2.getInitialLetter();
                o.LJIIIIZZ(initialLetter2, "o2.initialLetter");
                if (initialLetter.compareTo(initialLetter2) < 0 && o.LJ(iMUser.getInitialLetter(), "#") && !o.LJ(iMUser2.getInitialLetter(), "#")) {
                    return 1;
                }
                String initialLetter3 = iMUser.getInitialLetter();
                String initialLetter4 = iMUser2.getInitialLetter();
                o.LJIIIIZZ(initialLetter4, "o2.initialLetter");
                if (initialLetter3.compareTo(initialLetter4) > 0 && !o.LJ(iMUser.getInitialLetter(), "#") && o.LJ(iMUser2.getInitialLetter(), "#")) {
                    return -1;
                }
                String initialLetter5 = iMUser.getInitialLetter();
                String initialLetter6 = iMUser2.getInitialLetter();
                o.LJIIIIZZ(initialLetter6, "o2.initialLetter");
                return initialLetter5.compareTo(initialLetter6);
            }
        }, arrayList3);
        if (mentionRecentContactResponse != null) {
            List<MentionCheckResult> list2 = mentionRecentContactResponse.blockResults;
            if (list2 != null) {
                for (MentionCheckResult mentionCheckResult : list2) {
                    if (((MentionCheckSingleTypeResult) ListProtector.get(mentionCheckResult.userBlockedResults, 0)).blockType == 1) {
                        linkedHashSet.add(mentionCheckResult.uid);
                    }
                }
            }
            int i3 = 10;
            if (mentionRecentContactResponse != null && (list = mentionRecentContactResponse.userList) != null) {
                for (User user : list) {
                    if (arrayList2.size() < i3) {
                        Iterator it = LLILII.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (o.LJ(((IMUser) obj).getUid(), user.getUid())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        IMUser iMUser = (IMUser) obj;
                        if (iMUser == null) {
                            LIZ3 = Y9H.LIZIZ(user);
                            LIZ3.LJIJI = new C217878gp(!linkedHashSet.contains(LIZ3.LIZ), EnumC217828gk.RECENT, false, null, null, null, 0, null, null, 508);
                        } else {
                            LIZ3 = Y9H.LIZ(iMUser);
                            if (!linkedHashSet.contains(LIZ3.LIZ) && iMUser.isMentionEnabled()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            LIZ3.LJIJI = new C217878gp(z4, EnumC217828gk.RECENT, false, null, null, null, 0, null, null, 508);
                        }
                        arrayList2.add(LIZ3);
                    }
                    i3 = 10;
                }
            }
        }
        int i4 = 10;
        if (arrayList2.size() < 10) {
            Iterator it2 = recentLocal.iterator();
            while (it2.hasNext()) {
                IMUser iMUser2 = (IMUser) it2.next();
                if (arrayList2.size() < i4) {
                    Y9G LIZ4 = Y9H.LIZ(iMUser2);
                    if (!linkedHashSet.contains(LIZ4.LIZ) && iMUser2.isMentionEnabled()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    LIZ4.LJIJI = new C217878gp(z3, EnumC217828gk.RECENT, false, null, null, null, 0, null, null, 508);
                    if (!arrayList2.contains(LIZ4) && !o.LJ(LIZ4.LIZ, ((RBX) HG3.LJIILL()).getCurUserId())) {
                        arrayList2.add(LIZ4);
                    }
                }
                i4 = 10;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (IMUser iMUser3 : LLILII) {
            if (((ISearchUserService) LIZ.getValue()).LJ() && iMUser3.getFollowStatus() == 2 && LLILII.size() >= 10) {
                LIZ2 = Y9H.LIZ(iMUser3);
                if (!linkedHashSet.contains(LIZ2.LIZ) && iMUser3.isMentionEnabled()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LIZ2.LJIJI = new C217878gp(z2, EnumC217828gk.FRIEND, false, null, null, null, 0, null, null, 508);
                if (!arrayList2.contains(LIZ2)) {
                    arrayList4.add(LIZ2);
                }
            } else {
                LIZ2 = Y9H.LIZ(iMUser3);
                if (!linkedHashSet.contains(LIZ2.LIZ) && iMUser3.isMentionEnabled()) {
                    z = true;
                } else {
                    z = false;
                }
                LIZ2.LJIJI = new C217878gp(z, EnumC217828gk.FOLLOW, false, null, null, null, 0, null, null, 508);
            }
            arrayList5.add(LIZ2);
            if (!arrayList6.isEmpty()) {
                i2 = 1;
                if (TextUtils.equals((CharSequence) AnonymousClass028.LIZIZ(arrayList6, 1, arrayList6), iMUser3.getInitialLetter())) {
                    int size = arrayList7.size() - 1;
                    ListProtector.set(arrayList7, size, Integer.valueOf(((Number) ListProtector.get(arrayList7, size)).intValue() + 1));
                }
            } else {
                i2 = 1;
            }
            String initialLetter = iMUser3.getInitialLetter();
            o.LJIIIIZZ(initialLetter, "user.initialLetter");
            arrayList6.add(initialLetter);
            arrayList7.add(Integer.valueOf(i2));
        }
        if (!arrayList4.isEmpty()) {
            i = 0;
            ListProtector.add(arrayList6, 0, "Friend");
            ListProtector.add(arrayList7, 0, Integer.valueOf(arrayList4.size()));
        } else {
            i = 0;
        }
        if (!arrayList2.isEmpty()) {
            ListProtector.add(arrayList6, i, "Recent");
            ListProtector.add(arrayList7, i, Integer.valueOf(arrayList2.size()));
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList4);
        arrayList.addAll(arrayList5);
        return new C217808gi(new C217798gh(null, i, null, EnumC217778gf.RECOMMEND, arrayList6, arrayList7, i, null, 399), arrayList);
    }
}
