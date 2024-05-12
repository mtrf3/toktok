package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4L5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4L5 {
    public static List LIZ(C4L5 c4l5, List list, int i, int i2) {
        boolean z;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 4;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4S9((IMContact) it.next()));
        }
        List LLILLL = ORZ.LLILLL(arrayList, i);
        if (z) {
            return ORZ.LLIILII(LLILLL);
        }
        return LLILLL;
    }
}
