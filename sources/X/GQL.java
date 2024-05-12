package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class GQL {
    public static List LIZ(String text, List list) {
        o.LJIIIZ(text, "text");
        ArrayList arrayList = new ArrayList();
        Iterator it = C73030SlO.LJII(text).iterator();
        o.LJIIIIZZ(it, "hashTagList.iterator()");
        while (it.hasNext()) {
            String hashtag = (String) it.next();
            o.LJIIIIZZ(hashtag, "hashtag");
            int LJJLIIIJL = s.LJJLIIIJL(text, hashtag, 0, false, 6);
            int length = hashtag.length() + LJJLIIIJL;
            if (LJJLIIIJL >= 0) {
                Iterator it2 = ((ArrayList) list).iterator();
                boolean z = true;
                while (it2.hasNext()) {
                    AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it2.next();
                    if (!aVTextExtraStruct.isTransient()) {
                        if (Math.max(Math.abs(aVTextExtraStruct.end - LJJLIIIJL), Math.abs(length - aVTextExtraStruct.start)) < Math.abs(aVTextExtraStruct.end - aVTextExtraStruct.start) + Math.abs(length - LJJLIIIJL)) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    AVTextExtraStruct aVTextExtraStruct2 = new AVTextExtraStruct();
                    aVTextExtraStruct2.type = 1;
                    aVTextExtraStruct2.hashTagName = ujb.o.LJJJJZ(hashtag, "#", "", false);
                    aVTextExtraStruct2.start = LJJLIIIJL;
                    aVTextExtraStruct2.end = length;
                    arrayList.add(aVTextExtraStruct2);
                }
            }
        }
        return arrayList;
    }

    public static final void LIZIZ(List list, boolean z) {
        if (z) {
            Collections.sort(list, new GQM());
        } else {
            Collections.sort(list, new GQN());
        }
    }
}
