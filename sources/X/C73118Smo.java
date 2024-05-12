package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Smo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73118Smo extends UDL {
    @Override // X.UDL
    public final String LJ(Activity activity) {
        return activity.getString(R.string.t0s);
    }

    @Override // X.UDL
    public final String LIZJ(Activity activity, String... strArr) {
        Object[] objArr = new Object[1];
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            HashMap hashMap = (HashMap) C76944UHs.LIZ;
            if (hashMap.containsKey(str)) {
                Object obj = hashMap.get(str);
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(activity.getString(num.intValue()));
        }
        objArr[0] = sb.toString();
        return activity.getString(R.string.szw, objArr);
    }

    @Override // X.UDL
    public final String LIZLLL(Activity activity, String... strArr) {
        return activity.getString(R.string.szx);
    }
}
