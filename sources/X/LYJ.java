package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.SkylightStoryUser;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LYJ {
    public static int LIZLLL;
    public static final List<Aweme> LIZ = new ArrayList();
    public static final List<SkylightStoryUser> LIZIZ = new ArrayList();
    public static final java.util.Set<String> LIZJ = new LinkedHashSet();
    public static int LJ = -1;

    public static int LIZ() {
        String str;
        ArrayList arrayList = (ArrayList) LIZ;
        if (arrayList.isEmpty()) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Aweme aweme = (Aweme) next;
            UserStory userStory = aweme.getUserStory();
            if (userStory == null || !userStory.getAllViewed()) {
                User author = aweme.getAuthor();
                if (author != null) {
                    str = author.getUid();
                } else {
                    str = null;
                }
                if (!C54838Lfe.LJIIJJI(str)) {
                    arrayList2.add(next);
                }
            }
        }
        return arrayList2.size();
    }

    public static int LIZIZ() {
        String str;
        Object obj;
        String str2;
        int i = 0;
        if (!((ArrayList) LIZ).isEmpty()) {
            ArrayList arrayList = (ArrayList) LIZIZ;
            if (!arrayList.isEmpty()) {
                int i2 = LJ;
                if (i2 != -1) {
                    return i2;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SkylightStoryUser skylightStoryUser = (SkylightStoryUser) it.next();
                    Iterator it2 = ((ArrayList) LIZ).iterator();
                    while (true) {
                        str = null;
                        if (it2.hasNext()) {
                            obj = it2.next();
                            User author = ((Aweme) obj).getAuthor();
                            if (author != null) {
                                str2 = author.getUid();
                            } else {
                                str2 = null;
                            }
                            if (o.LJ(str2, String.valueOf(skylightStoryUser.getUserId()))) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    Aweme aweme = (Aweme) obj;
                    if (aweme != null) {
                        User author2 = aweme.getAuthor();
                        if (author2 != null) {
                            str = author2.getUid();
                        }
                        if (!C54838Lfe.LJIIJJI(str) && !C54838Lfe.LJIJI(aweme) && !skylightStoryUser.getAllViewed()) {
                            i++;
                        }
                    }
                }
                LJ = i;
            }
        }
        return i;
    }

    public static boolean LIZJ() {
        if (((ArrayList) LIZ).isEmpty()) {
            return false;
        }
        return !C54838Lfe.LJIJI(C55723Ltv.LIZIZ.LJIL().LJI());
    }

    public static List LIZLLL(boolean z, StoryGetFeedByPageResponse storyGetFeedByPageResponse) {
        boolean z2;
        List<Aweme> awemes;
        ArrayList arrayList = new ArrayList();
        if (z && (((awemes = storyGetFeedByPageResponse.getAwemes()) == null || awemes.isEmpty() || !C54838Lfe.LJIIJJI(((Aweme) ListProtector.get(awemes, 0)).getAuthorUid())) && L7K.LJFF)) {
            ListProtector.add(arrayList, 0, new LYK(true, C55723Ltv.LIZIZ.LJIL().LJI()));
        }
        List<Aweme> awemes2 = storyGetFeedByPageResponse.getAwemes();
        if (awemes2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Aweme aweme : awemes2) {
                Aweme aweme2 = aweme;
                if (C54838Lfe.LJIIJJI(C54838Lfe.LJIIIIZZ(aweme2)) && L7K.LJFF) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z3 = !C54838Lfe.LJIJI(aweme2);
                if (z2 || z3) {
                    arrayList2.add(aweme);
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Aweme aweme3 = (Aweme) it.next();
                arrayList3.add(new LYK(C54838Lfe.LJIIJJI(aweme3.getAuthorUid()), aweme3));
            }
            arrayList.addAll(ORZ.LLJILJILJ(arrayList3));
        }
        return arrayList;
    }

    public static void LJ(boolean z, StoryGetFeedByPageResponse storyGetFeedByPageResponse) {
        if (z) {
            ((ArrayList) LIZ).clear();
            ((ArrayList) LIZIZ).clear();
            LIZJ.clear();
            LJ = -1;
        }
        List<Aweme> awemes = storyGetFeedByPageResponse.getAwemes();
        if (awemes != null) {
            ((ArrayList) LIZ).addAll(awemes);
        }
        List<SkylightStoryUser> skylightStoryUsers = storyGetFeedByPageResponse.getSkylightStoryUsers();
        if (skylightStoryUsers != null) {
            ((ArrayList) LIZIZ).addAll(skylightStoryUsers);
        }
        LIZLLL = (int) storyGetFeedByPageResponse.getTotalCnt();
        if (LIZJ() && z) {
            LIZLLL--;
        }
    }
}
