package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ad7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94197ad7 implements InterfaceC93654aUM {
    @Override // X.InterfaceC93654aUM
    public void LIZ() {
    }

    @Override // X.InterfaceC93654aUM
    public void onCancel() {
    }

    public static JSONObject LIZIZ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        String extra = effect.getExtra();
        if (extra == null || extra.length() == 0) {
            return null;
        }
        String extra2 = effect.getExtra();
        if (extra2 == null) {
            extra2 = "";
        }
        return new JSONObject(extra2);
    }

    public static String LIZLLL(List list) {
        o.LJIIIZ(list, "list");
        if (!list.isEmpty()) {
            return (String) ListProtector.get(list, 0);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(X.AbstractC94465ahR r1, java.lang.String r2, java.lang.String r3) {
        /*
            r1.getClass()
            java.lang.String r1 = ""
            if (r2 == 0) goto L14
            int r0 = r2.length()
            if (r0 != 0) goto L1f
            r0 = 1
        Le:
            if (r0 == 0) goto L15
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L14
            r1 = r0
        L14:
            return r1
        L15:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L10
            r0.<init>(r2)     // Catch: java.lang.Exception -> L10
            java.lang.String r0 = r0.optString(r3, r1)     // Catch: java.lang.Exception -> L10
            goto L11
        L1f:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC94197ad7.LJ(X.ahR, java.lang.String, java.lang.String):java.lang.String");
    }
}
