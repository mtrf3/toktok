package X;

import android.util.LruCache;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Eti, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37874Eti {
    public java.util.Map<String, List<C37878Etm>> LIZ = new LinkedHashMap();
    public final LruCache<String, C37884Ets> LIZIZ = new LruCache<>(16);
    public final String LIZJ;

    public static String LIZ(String str) {
        if (str == null) {
            return null;
        }
        Object[] array = new OJD("[.]").split(str, 0).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            if (length < 2) {
                return null;
            }
            if (length == 2) {
                return str;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(strArr[C0EH.LIZIZ(LIZ, strArr[length - 2], ".", length, -1)]);
            return X1D.LIZIZ(LIZ);
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(org.json.JSONObject r17) {
        /*
            r16 = this;
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            r1 = r17
            if (r1 == 0) goto Lcc
            java.lang.String r0 = "content"
            org.json.JSONObject r12 = r1.optJSONObject(r0)
            if (r12 == 0) goto Lcc
            java.util.Iterator r15 = r12.keys()
            if (r15 == 0) goto Lcc
        L17:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Lcc
            java.lang.Object r11 = r15.next()
            java.lang.String r11 = (java.lang.String) r11
            org.json.JSONArray r14 = r12.optJSONArray(r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r14 == 0) goto Lc2
            int r9 = r14.length()
            r8 = 0
        L33:
            if (r8 >= r9) goto Lc2
            if (r14 == 0) goto L52
            org.json.JSONObject r3 = r14.optJSONObject(r8)
            if (r3 == 0) goto L53
            java.lang.String r0 = "pattern"
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r3, r0)
            if (r0 == 0) goto L53
            java.util.regex.Pattern r7 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Throwable -> L4f
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L59
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L59
            goto L61
        L4f:
            r0 = move-exception
            r7 = 0
            goto L5a
        L52:
            r3 = 0
        L53:
            r7 = 0
            if (r3 == 0) goto L57
            goto L64
        L57:
            r0 = 0
            goto L6a
        L59:
            r0 = move-exception
        L5a:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L61:
            X.C3C5.m6boximpl(r0)
        L64:
            java.lang.String r0 = "group"
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r3, r0)
        L6a:
            X.Evn r6 = X.C38002Evm.LIZ(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r3 == 0) goto L92
            java.lang.String r0 = "included_methods"
            org.json.JSONArray r4 = r3.optJSONArray(r0)
            if (r4 == 0) goto L92
            int r2 = r4.length()
            r1 = 0
        L82:
            if (r1 >= r2) goto L92
            if (r4 == 0) goto L8f
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r4, r1)
            if (r0 == 0) goto L8f
            r5.add(r0)
        L8f:
            int r1 = r1 + 1
            goto L82
        L92:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto Lb6
            java.lang.String r0 = "excluded_methods"
            org.json.JSONArray r3 = r3.optJSONArray(r0)
            if (r3 == 0) goto Lb6
            int r2 = r3.length()
            r1 = 0
        La6:
            if (r1 >= r2) goto Lb6
            if (r3 == 0) goto Lb3
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r3, r1)
            if (r0 == 0) goto Lb3
            r4.add(r0)
        Lb3:
            int r1 = r1 + 1
            goto La6
        Lb6:
            X.Etm r0 = new X.Etm
            r0.<init>(r7, r6, r5, r4)
            r10.add(r0)
            int r8 = r8 + 1
            goto L33
        Lc2:
            java.lang.String r0 = "host"
            kotlin.jvm.internal.o.LJFF(r11, r0)
            r13.put(r11, r10)
            goto L17
        Lcc:
            r0 = r16
            r0.LIZ = r13
            android.util.LruCache<java.lang.String, X.Ets> r0 = r0.LIZIZ
            if (r0 == 0) goto Ld7
            r0.evictAll()
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37874Eti.LIZIZ(org.json.JSONObject):void");
    }

    public C37874Eti(String str, JSONObject jSONObject) {
        this.LIZJ = str;
        LIZIZ(jSONObject);
    }
}
