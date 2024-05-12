package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;

/* renamed from: X.OOx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61843OOx implements InterfaceC61844OOy {
    @Override // X.InterfaceC61844OOy
    public final Pair LIZ(W5O w5o, Object obj) {
        HashMap hashMap = new HashMap();
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.contains("@@")) {
                String queryParameter = UriProtector.getQueryParameter(w5o.LIZIZ, "biz_tag");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = UriProtector.getQueryParameter(w5o.LIZIZ, "from");
                }
                String[] split = str.split("@@");
                if (split.length >= 2) {
                    if (TextUtils.isEmpty(queryParameter)) {
                        hashMap.put("biz_tag", split[1]);
                    }
                    hashMap.put("btm", split[1]);
                    hashMap.put("scene_tag", split[0]);
                }
            }
        }
        return new Pair(Boolean.FALSE, hashMap);
    }
}
