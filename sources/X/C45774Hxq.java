package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hxq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45774Hxq {
    public static final C45774Hxq LIZ = new C45774Hxq();

    public static List LIZ(int i, List list) {
        int i2;
        int minSeg;
        int maxSeg;
        if (!C77413UZt.LJIILL(list)) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() > 10) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    AVMusic aVMusic = (AVMusic) it.next();
                    if (aVMusic.getStickPointMusicAlg() == null) {
                        minSeg = 0;
                    } else {
                        minSeg = aVMusic.getStickPointMusicAlg().getMinSeg();
                    }
                    if (aVMusic.getStickPointMusicAlg() == null) {
                        maxSeg = 0;
                    } else {
                        maxSeg = aVMusic.getStickPointMusicAlg().getMaxSeg();
                        if (maxSeg > 0) {
                            if (minSeg <= i && i <= maxSeg) {
                                arrayList2.add(aVMusic);
                            }
                        }
                    }
                    if (minSeg <= 0) {
                        arrayList2.add(aVMusic);
                    } else if (minSeg <= i) {
                        arrayList2.add(aVMusic);
                    }
                }
                if (arrayList2.size() <= 10) {
                    return arrayList2;
                }
                ArrayList arrayList3 = new ArrayList(10);
                do {
                    arrayList3.add(ListProtector.get(arrayList2, i2));
                    i2++;
                } while (i2 < 10);
                return arrayList3;
            }
        }
        return list;
    }
}
