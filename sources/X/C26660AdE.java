package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AdE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26660AdE {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((UserRightDetail) it.next()).name;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            boolean z = false;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                String str2 = "";
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    if (z) {
                        str3 = i0.LJFF(" · ", str3);
                    }
                    str2 = i0.LJFF(str2, str3);
                    z = true;
                }
                return str2;
            }
        }
        return null;
    }
}
