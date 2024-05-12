package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7H2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7H2 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C7H6.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C7H5.LJLIL);
    public static final java.util.Map<String, Long> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, String> LIZLLL = new LinkedHashMap();
    public static final HashSet<String> LJ = new HashSet<>();
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C7H4.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C3IV.LJLIL);

    public static LruCache LIZIZ() {
        return (LruCache) LJI.getValue();
    }

    public static UpvoteList LIZ(String aid) {
        String str;
        o.LJIIIZ(aid, "aid");
        UpvoteList upvoteList = (UpvoteList) LIZIZ().get(aid);
        if (upvoteList == null) {
            return null;
        }
        List<UpvoteStruct> upvotes = upvoteList.getUpvotes();
        ArrayList arrayList = new ArrayList();
        for (UpvoteStruct upvoteStruct : upvotes) {
            HashSet hashSet = (HashSet) LJFF.getValue();
            User user = upvoteStruct.getUser();
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (!ORZ.LJLJJI(str, hashSet)) {
                arrayList.add(upvoteStruct);
            }
        }
        return UpvoteList.copy$default(upvoteList, arrayList, 0L, false, upvoteList.getTotal() - (upvoteList.getUpvotes().size() - arrayList.size()), null, 22, null);
    }

    public static UpvoteReason LIZJ(String str) {
        return (UpvoteReason) ((ConcurrentHashMap) LIZ.getValue()).get(str);
    }

    public static boolean LIZLLL(String str) {
        List<UpvoteStruct> upvotes;
        UpvoteList LIZ2 = LIZ(str);
        if (LIZ2 == null || LIZ2.getTotal() <= 0 || (upvotes = LIZ2.getUpvotes()) == null || upvotes.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void LJ(String aid, UpvoteList upvoteList, boolean z, int i) {
        UpvoteStruct upvoteStruct;
        String str;
        boolean z2;
        List<UpvoteStruct> upvotes;
        String str2;
        UpvoteList upvoteList2 = upvoteList;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(upvoteList2, "upvoteList");
        UpvoteList upvoteList3 = (UpvoteList) LIZIZ().get(aid);
        int i2 = 1;
        if (upvoteList3 == null || z) {
            LruCache LIZIZ2 = LIZIZ();
            UpvoteList upvoteList4 = (UpvoteList) LIZIZ().get(upvoteList2.getItemId());
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            if (upvoteList4 != null && (upvotes = upvoteList4.getUpvotes()) != null) {
                Iterator<UpvoteStruct> it = upvotes.iterator();
                while (true) {
                    if (it.hasNext()) {
                        upvoteStruct = it.next();
                        UpvoteStruct upvoteStruct2 = upvoteStruct;
                        User user = upvoteStruct2.getUser();
                        if (user != null) {
                            str2 = user.getUid();
                        } else {
                            str2 = null;
                        }
                        if (o.LJ(str2, curUserId) && upvoteStruct2.isFake()) {
                            break;
                        }
                    } else {
                        upvoteStruct = null;
                        break;
                    }
                }
            } else {
                upvoteStruct = null;
            }
            List<UpvoteStruct> upvotes2 = upvoteList2.getUpvotes();
            if (!(upvotes2 instanceof Collection) || !upvotes2.isEmpty()) {
                Iterator<UpvoteStruct> it2 = upvotes2.iterator();
                while (it2.hasNext()) {
                    User user2 = it2.next().getUser();
                    if (user2 != null) {
                        str = user2.getUid();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, curUserId)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (upvoteStruct != null && !z2) {
                List LLJILJILJ = ORZ.LLJILJILJ(upvoteList2.getUpvotes());
                UpvoteStruct upvoteStruct3 = (UpvoteStruct) ORZ.LJLLLL(LLJILJILJ);
                if (upvoteStruct3 == null || !upvoteStruct3.isAuthorPin()) {
                    i2 = 0;
                }
                ListProtector.add(LLJILJILJ, i2, upvoteStruct);
                upvoteList2 = UpvoteList.copy$default(upvoteList2, LLJILJILJ, 0L, false, upvoteList2.getTotal() + 1, null, 22, null);
            }
            LIZIZ2.put(aid, upvoteList2);
            return;
        }
        if (upvoteList2.getCursor() == upvoteList3.getCursor() + i) {
            List<UpvoteStruct> upvotes3 = upvoteList3.getUpvotes();
            ArrayList arrayList = new ArrayList(C32I.LJJL(upvotes3, 10));
            Iterator<UpvoteStruct> it3 = upvotes3.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().getCommentId());
            }
            java.util.Set LLJJ = ORZ.LLJJ(arrayList);
            List LLJILJILJ2 = ORZ.LLJILJILJ(upvoteList3.getUpvotes());
            List<UpvoteStruct> upvotes4 = upvoteList2.getUpvotes();
            ArrayList arrayList2 = new ArrayList();
            for (UpvoteStruct upvoteStruct4 : upvotes4) {
                if (!LLJJ.contains(upvoteStruct4.getCommentId())) {
                    arrayList2.add(upvoteStruct4);
                }
            }
            ((ArrayList) LLJILJILJ2).addAll(arrayList2);
            LIZIZ().put(aid, UpvoteList.copy$default(upvoteList2, LLJILJILJ2, 0L, false, 0L, null, 30, null));
        }
    }
}
