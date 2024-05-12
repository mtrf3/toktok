package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194767ke {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C194777kf.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C194787kg.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C194797kh.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C194807ki.LJLIL);

    public static void LIZ(List list) {
        if (C00F.LIZ(31744, 0, "tt_now_avatar_preload_now_exp", true) > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Aweme aweme = (Aweme) obj;
                String authorUid = aweme.getAuthorUid();
                o.LJIIIIZZ(authorUid, "aweme.authorUid");
                if (authorUid.length() != 0 && !o.LJ(curUserId, aweme.getAuthorUid())) {
                    arrayList.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((Aweme) next).getAuthorUid())) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new C194757kd(currentTimeMillis, (Aweme) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C194757kd c194757kd = (C194757kd) it3.next();
                ((C35979EAd) LIZ.getValue()).LIZLLL(c194757kd.LIZIZ.getAuthorUid(), c194757kd);
            }
        }
    }
}
