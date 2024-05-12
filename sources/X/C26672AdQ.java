package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AdQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26672AdQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((ExposeUserRight) it.next()).nameEn;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        return LIZ(",", arrayList);
    }

    public static String LIZ(String str, List list) {
        boolean z = false;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        String str2 = "";
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (z) {
                str3 = i0.LJFF(str, str3);
            }
            str2 = i0.LJFF(str2, str3);
            z = true;
        }
        return str2;
    }
}
