package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class QJX {
    public InterfaceC66834QKw LIZ;
    public final InterfaceC66835QKx LIZJ;
    public int LIZIZ = 36;
    public final java.util.Map<String, String> LIZLLL = new ConcurrentHashMap();
    public final java.util.Map<String, String> LJ = new ConcurrentHashMap();

    public QJX(InterfaceC66835QKx interfaceC66835QKx) {
        this.LIZJ = interfaceC66835QKx;
    }

    public static void LIZJ(java.util.Map<String, String> map, java.util.Map<String, String> map2, boolean z) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && (!z || !map2.containsKey(key))) {
                                map2.put(key, value);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String LIZ(Context context, StringBuilder sb, QKO qko) {
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return sb2;
        }
        android.net.Uri parse = UriProtector.parse(sb2);
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(parse);
        Uri.Builder buildUpon = parse.buildUpon();
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZIZ);
        LIZIZ(context, true, linkedHashMap, qko);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!queryParameterNames.contains(str) && !TextUtils.isEmpty(str2)) {
                buildUpon.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        sb.delete(0, sb.length());
        sb.append(buildUpon.build().toString());
        this.LIZIZ = linkedHashMap.size();
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0119, code lost:
    
        if (r4 != null) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0276  */
    /* JADX WARN: Type inference failed for: r0v77, types: [X.QKZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r11, boolean r12, java.util.Map r13, X.QKO r14) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QJX.LIZIZ(android.content.Context, boolean, java.util.Map, X.QKO):void");
    }
}
