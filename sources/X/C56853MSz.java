package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MSz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56853MSz {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZIZ(MT1 mt1) {
        MusNotice musNotice;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (NoticeItems noticeItems : mt1.LIZJ.values()) {
            List<MusNotice> items = noticeItems.getItems();
            if (items != null && (musNotice = (MusNotice) ORZ.LJLLLL(items)) != null) {
                if (musNotice.createTime <= 0 || (str = musNotice.nid) == null || str.length() == 0 || o.LJ(CardStruct.IStatusCode.DEFAULT, musNotice.nid)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("InsertExtra but notice invalid: item.group:");
                    LIZ2.append(noticeItems.getGroup());
                    LIZ2.append(", nid:");
                    LIZ2.append(musNotice.nid);
                    LIZ2.append(", noticeType:");
                    LIZ2.append(musNotice.type);
                    C221018lt.LJFF("Creators_Inbox:DataProcessHelper", X1D.LIZIZ(LIZ2));
                    String str2 = musNotice.nid;
                    if (str2 == null || str2.length() == 0) {
                        musNotice.nid = String.valueOf(musNotice.hashCode());
                    }
                }
                if (!mt1.LIZ(musNotice)) {
                    musNotice.noticeListType = noticeItems.getListType();
                    if (musNotice.hasRead) {
                        arrayList2.add(musNotice);
                    } else {
                        musNotice.priority = 1;
                        arrayList.add(musNotice);
                    }
                }
            }
        }
        Comparator comparator = C56865MTl.LJLIL;
        C40675Fxn.LJJLIIIJ(arrayList2, comparator);
        C40675Fxn.LJJLIIIJ(arrayList, comparator);
        return new OSZ(arrayList, arrayList2);
    }

    public static void LIZ(List list, List list2, MT1 mt1, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MusNotice musNotice = (MusNotice) it.next();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                BaseNotice baseNotice = (BaseNotice) ListProtector.get(list2, i);
                int i2 = musNotice.priority;
                int i3 = baseNotice.priority;
                int i4 = i2 - i3;
                if (i2 == i3) {
                    if (musNotice.createTime - baseNotice.createTime > 0) {
                        mt1.LIZIZ(i, musNotice);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Insert ");
                        LIZ2.append(str);
                        C221018lt.LJFF("Creators_Inbox:DataProcessHelper", X1D.LIZIZ(LIZ2));
                        break;
                    }
                } else {
                    if (i4 > 0) {
                        mt1.LIZIZ(i, musNotice);
                        StringBuilder LIZ22 = X1D.LIZ();
                        LIZ22.append("Insert ");
                        LIZ22.append(str);
                        C221018lt.LJFF("Creators_Inbox:DataProcessHelper", X1D.LIZIZ(LIZ22));
                        break;
                        break;
                    }
                }
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MusNotice musNotice2 = (MusNotice) it2.next();
            if (!mt1.LIZ(musNotice2) && !mt1.LJ) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Insert ");
                LIZ3.append(str);
                LIZ3.append(" to the end");
                C221018lt.LJFF("Creators_Inbox:DataProcessHelper", X1D.LIZIZ(LIZ3));
                mt1.LIZIZ(-1, musNotice2);
            }
        }
    }
}
