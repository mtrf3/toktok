package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PND implements Observer {
    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        HashMap hashMap;
        String str;
        Long l;
        long j;
        long j2;
        String str2;
        String str3;
        String str4;
        Long l2;
        if (observable instanceof PNI) {
            String str5 = null;
            if ((obj instanceof HashMap) && (hashMap = (HashMap) obj) != null) {
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
                Object obj5 = hashMap.get("content_type");
                if (obj5 instanceof String) {
                    str2 = (String) obj5;
                } else {
                    str2 = null;
                }
                Object obj6 = hashMap.get("request_log");
                if (obj6 instanceof String) {
                    str5 = (String) obj6;
                }
                boolean z = false;
                if (!TextUtils.isEmpty(str2)) {
                    o.LJI(str2);
                    if (ujb.o.LJJJLIIL(str2, "image/", false)) {
                        z = true;
                    }
                }
                long j3 = j + j2;
                if (TextUtils.isEmpty(str)) {
                    str3 = "";
                } else {
                    try {
                        str3 = UriProtector.parse(str).buildUpon().clearQuery().toString();
                    } catch (Exception unused) {
                        str3 = str;
                    }
                }
                if (z) {
                    str4 = "ttnet-stream-image";
                } else {
                    str4 = "ttnet-stream-other";
                }
                C09900aA.LJIIZILJ(j3, str3, str4, "");
                if (EB7.LIZ()) {
                    if (z) {
                        if (j3 >= 0) {
                            PN9.LJIL += j3;
                            PN9.LIZ(j3, str);
                        }
                    } else if (j3 >= 0) {
                        PN9.LJJI += j3;
                        PN9.LIZ(j3, str);
                    }
                }
                StringBuilder LIZJ = C06490Nh.LIZJ("url : ", str, " sent bytes = ", j);
                C0MT.LIZLLL(LIZJ, " received bytes = ", j2, " content type = ");
                LIZJ.append(str2);
                LIZJ.append(" request log = ");
                LIZJ.append(str5);
                X1D.LIZIZ(LIZJ);
            }
        }
    }
}
