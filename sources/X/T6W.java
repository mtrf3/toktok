package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.api.AnswerStruct;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.InviteInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T6W {
    public static String LIZLLL(User user) {
        if (user != null) {
            String LIZ = AV1.LIZ(user, false);
            o.LJIIIIZZ(LIZ, "getCommentDisplayName(it)");
            return LIZ;
        }
        return "";
    }

    public static String LJ(User user) {
        UrlModel avatarThumb;
        List<String> urlList;
        if (user == null || (avatarThumb = user.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || !(!urlList.isEmpty())) {
            return null;
        }
        return (String) ListProtector.get(urlList, 0);
    }

    public static C69603RTj LJFF(User user, Long l) {
        String str;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
            str2 = user.getSecUid();
        } else {
            str = null;
        }
        return new C69603RTj(str, str2, l);
    }

    public static String LJII(Integer num, boolean z) {
        if (num == null) {
            return null;
        }
        if (num.intValue() == 0 && z) {
            if (C34443DfT.LIZIZ) {
                return EF7.LIZIZ().getResources().getString(R.string.pnc);
            }
            return "";
        }
        int intValue = num.intValue();
        return EF7.LIZIZ().getResources().getQuantityString(R.plurals.r4, intValue, C77123UOp.LJJIIJ(intValue));
    }

    public static T86 LIZ(AnswerStruct answerStruct, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        boolean z2;
        User user = answerStruct.questionCreator;
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        boolean equals = TextUtils.equals(str2, ((RBX) HG3.LJIILL()).getCurUserId());
        String valueOf = String.valueOf(answerStruct.questionId);
        C69603RTj LJFF = LJFF(answerStruct.questionCreator, null);
        String LIZLLL = LIZLLL(answerStruct.questionCreator);
        if (str == null) {
            str3 = answerStruct.content;
        } else {
            str3 = str;
        }
        String LJ = LJ(answerStruct.questionCreator);
        String LJ2 = LJ(answerStruct.answerCreator);
        String LIZLLL2 = LIZLLL(answerStruct.answerCreator);
        List<Aweme> list = answerStruct.answers;
        if (list != null && (!list.isEmpty())) {
            long createTime = ((Aweme) ListProtector.get(list, 0)).getCreateTime();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" · ");
            LIZ.append(C57105Mb7.LIZJ(createTime * 1000, EF7.LIZIZ()));
            str4 = X1D.LIZIZ(LIZ);
        } else {
            str4 = null;
        }
        C69603RTj LJFF2 = LJFF(answerStruct.answerCreator, null);
        String valueOf2 = String.valueOf(answerStruct.questionId);
        List<Aweme> list2 = answerStruct.answers;
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            Iterator<Aweme> it = list2.iterator();
            while (it.hasNext()) {
                C71830SHa LJI = LJI("", it.next(), valueOf2);
                if (LJI != null) {
                    arrayList.add(LJI);
                }
            }
        }
        C69604RTk c69604RTk = new C69604RTk(LJ2, LIZLLL2, str4, LJFF2, arrayList);
        if (str != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new T86(valueOf, LJFF, LIZLLL, str3, LJ, c69604RTk, new C74143T7z(z2, z, !equals));
    }

    public static T8C LIZIZ(ForumStruct forumStruct, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        User creator = forumStruct.getCreator();
        String str5 = null;
        if (creator != null) {
            str2 = creator.getUid();
        } else {
            str2 = null;
        }
        boolean equals = TextUtils.equals(str2, ((RBX) HG3.LJIILL()).getCurUserId());
        Long id = forumStruct.getId();
        if (id != null) {
            str3 = id.toString();
        } else {
            str3 = null;
        }
        LJFF(forumStruct.getCreator(), null);
        C71830SHa LJI = LJI("", forumStruct.getVideo(), String.valueOf(forumStruct.getId()));
        String LIZLLL = LIZLLL(forumStruct.getCreator());
        if (str == null) {
            str4 = forumStruct.getContent();
        } else {
            str4 = str;
        }
        boolean z2 = false;
        String LJII = LJII(forumStruct.getAnswerCount(), false);
        String LJ = LJ(forumStruct.getCreator());
        if (str != null) {
            z2 = true;
        }
        C74143T7z c74143T7z = new C74143T7z(z2, z, !equals);
        String questionType = forumStruct.getQuestionType();
        Long createTime = forumStruct.getCreateTime();
        if (createTime != null) {
            long longValue = createTime.longValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" · ");
            LIZ.append(C57105Mb7.LIZJ(longValue * 1000, EF7.LIZIZ()));
            str5 = X1D.LIZIZ(LIZ);
        }
        return new T8C(str3, LJI, LIZLLL, str4, LJII, LJ, c74143T7z, questionType, str5);
    }

    public static C74141T7x LIZJ(ForumStruct forumStruct, boolean z, boolean z2) {
        String string;
        String str;
        List LJJIJ;
        List<User> inviterList;
        Integer totalInviterCount;
        o.LJIIIZ(forumStruct, "forumStruct");
        Context LIZIZ = EF7.LIZIZ();
        String LIZLLL = LIZLLL(forumStruct.getCreator());
        boolean z3 = false;
        if (z) {
            if (z2) {
                string = LIZIZ.getString(R.string.pos);
            } else {
                string = LIZIZ.getString(R.string.pog);
            }
        } else {
            string = LIZIZ.getString(R.string.ppy, LIZLLL);
        }
        o.LJIIIIZZ(string, "when {\n                i…          }\n            }");
        Long id = forumStruct.getId();
        ArrayList arrayList = null;
        if (id != null) {
            str = id.toString();
        } else {
            str = null;
        }
        LJFF(forumStruct.getCreator(), forumStruct.getId());
        C71830SHa LJI = LJI(forumStruct.getContent(), forumStruct.getVideo(), String.valueOf(forumStruct.getId()));
        String content = forumStruct.getContent();
        String LJII = LJII(forumStruct.getAnswerCount(), false);
        if (z) {
            InviteInfo inviteInfo = forumStruct.getInviteInfo();
            if (inviteInfo != null && (totalInviterCount = inviteInfo.getTotalInviterCount()) != null) {
                int intValue = totalInviterCount.intValue();
                List<User> inviterList2 = inviteInfo.getInviterList();
                if (inviterList2 != null) {
                    int size = intValue - inviterList2.size();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < size; i++) {
                        User user = new User();
                        user.setAvatarThumb(new UrlModel());
                        arrayList2.add(user);
                    }
                    LJJIJ = ORZ.LLIIIZ(arrayList2, inviterList2);
                }
            }
            LJJIJ = null;
        } else {
            User creator = forumStruct.getCreator();
            if (creator != null) {
                LJJIJ = C47261Igj.LJJIJ(creator);
            }
            LJJIJ = null;
        }
        Integer collectStatus = forumStruct.getCollectStatus();
        if (collectStatus != null && collectStatus.intValue() == 1) {
            z3 = true;
        }
        Boolean valueOf = Boolean.valueOf(z3);
        InviteInfo inviteInfo2 = forumStruct.getInviteInfo();
        if (inviteInfo2 != null && (inviterList = inviteInfo2.getInviterList()) != null) {
            arrayList = new ArrayList();
            Iterator<User> it = inviterList.iterator();
            while (it.hasNext()) {
                String uid = it.next().getUid();
                if (uid != null) {
                    arrayList.add(uid);
                }
            }
        }
        return new C74141T7x(2, str, LJI, string, content, LJII, LJJIJ, null, valueOf, z, arrayList, 2048);
    }

    public static C71830SHa LJI(String str, Aweme aweme, String str2) {
        List<String> list;
        String str3;
        Video video;
        UrlModel cover;
        if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
            list = cover.getUrlList();
        } else {
            list = null;
        }
        StringBuilder LJFF = C72972SkS.LJFF(str, '_');
        if (list != null) {
            str3 = (String) ListProtector.get(list, 0);
        } else {
            str3 = null;
        }
        LJFF.append(str3);
        X1D.LIZIZ(LJFF);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return new C71830SHa(str2, aweme.getAid(), (String) ListProtector.get(list, 0), aweme.getGroupId());
    }
}
