package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes12.dex */
public final class PNF implements Observer {
    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        HashMap hashMap;
        String str;
        Long l;
        long j;
        long j2;
        Long l2;
        if ((observable instanceof PNJ) && (obj instanceof HashMap) && (hashMap = (HashMap) obj) != null) {
            Object obj2 = hashMap.get("url");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            Object obj3 = hashMap.get("sent_bytes");
            if (obj3 instanceof Long) {
                l = (Long) obj3;
            } else {
                l = null;
            }
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Object obj4 = hashMap.get("received_bytes");
            if ((obj4 instanceof Long) && (l2 = (Long) obj4) != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            long j3 = j + j2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                try {
                    str = UriProtector.parse(str).buildUpon().clearQuery().toString();
                } catch (Exception unused) {
                }
            }
            C09900aA.LJIIZILJ(j3, str, "websocket", "");
            if (EB7.LIZ() && j3 >= 0) {
                PN9.LJJII += j3;
            }
        }
    }
}
