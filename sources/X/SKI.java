package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class SKI {
    public static final /* synthetic */ SKI LIZ = new SKI();

    public static String LIZ(List list) {
        String LLIIIILZ;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SLJ slj = (SLJ) it.next();
            if ((slj instanceof SN1) && (LLIIIILZ = ((SN1) slj).LLIIIILZ()) != null) {
                return LLIIIILZ;
            }
        }
        return null;
    }
}
