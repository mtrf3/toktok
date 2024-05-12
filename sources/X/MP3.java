package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MP3 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.MP4 r17) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MP3.LIZ(X.MP4):void");
    }

    public static boolean LIZJ(MusNotice musNotice) {
        String str;
        if (musNotice.createTime <= 0 || (str = musNotice.nid) == null || str.length() == 0 || o.LJ(CardStruct.IStatusCode.DEFAULT, musNotice.nid)) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(List extraLiveData, List list) {
        o.LJIIIZ(extraLiveData, "extraLiveData");
        o.LJIIIZ(list, "list");
        if (extraLiveData.isEmpty()) {
            return;
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            BaseNotice baseNotice = (BaseNotice) listIterator.next();
            int i = baseNotice.type;
            if (i == 1001 || (i == 999 && baseNotice.timeLineType == 0)) {
                listIterator.remove();
            }
        }
        list.addAll(0, extraLiveData);
        ListProtector.add(list, 0, new MPH(0, extraLiveData.size()));
    }
}
