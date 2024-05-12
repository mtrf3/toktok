package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85183Vy {
    public static List LIZ(String str, ImageComponent imageComponent, ImageComponent imageComponent2) {
        List list;
        Iterable iterable;
        if (imageComponent2 == null || (list = C79081V1x.LJIIL(imageComponent2)) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (str == null) {
            str = "";
        }
        List LJJIJ = C47261Igj.LJJIJ(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C78765Uvh.LJIILIIL(UriProtector.parse((String) obj))) {
                arrayList.add(obj);
            }
        }
        List LLIIIZ = ORZ.LLIIIZ(arrayList, LJJIJ);
        if (imageComponent == null || (iterable = C79081V1x.LJIIL(imageComponent)) == null) {
            iterable = C61878OQg.INSTANCE;
        }
        List LLIIIZ2 = ORZ.LLIIIZ(list, ORZ.LLIIIZ(iterable, LLIIIZ));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) LLIIIZ2).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
