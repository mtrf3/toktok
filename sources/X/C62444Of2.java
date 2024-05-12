package X;

import Y.IDComparatorS38S0000000_10;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Of2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62444Of2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<com.ss.android.ugc.aweme.setting.ShareItemOrderBean>] */
    public static List LIZ() {
        ?? arrayList;
        List<ShareItemOrderBean> list = C62397OeH.LIZJ().LIZIZ;
        if (list == null || list.isEmpty()) {
            ArrayList<String> arrayList2 = C62438Oew.LIZIZ;
            arrayList = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator<String> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new ShareItemOrderBean(it.next()));
            }
        } else {
            arrayList = C62397OeH.LIZJ().LIZIZ;
            if (arrayList == 0) {
                return null;
            }
        }
        return ORZ.LLILII(new IDComparatorS38S0000000_10(16), arrayList);
    }
}
