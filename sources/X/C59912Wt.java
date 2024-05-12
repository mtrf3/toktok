package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59912Wt extends AbstractC59922Wu {
    public final List<String> LIZ;

    @Override // X.AbstractC59922Wu
    public final List<android.net.Uri> LIZ() {
        List<String> list = this.LIZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(UriProtector.parse(it.next()));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public C59912Wt(List<String> list) {
        this.LIZ = list;
    }
}
