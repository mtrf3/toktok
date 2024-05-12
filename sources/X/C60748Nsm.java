package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.Nsm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60748Nsm {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static final ConcurrentHashMap<String, EnumC60750Nso> LIZIZ = new ConcurrentHashMap<>();
    public static boolean LIZJ;

    public static void LIZ(C60737Nsb c60737Nsb) {
        String str;
        if (c60737Nsb != null && (str = c60737Nsb.containerId) != null) {
            LIZIZ.put(str, EnumC60750Nso.DESTROYED);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "destroy");
            c60737Nsb.LJIIJJI(jSONObject, "viewDisappearedWithType");
        }
    }

    public static void LIZIZ(C60737Nsb c60737Nsb) {
        String str;
        if (c60737Nsb != null && (str = c60737Nsb.containerId) != null) {
            c60737Nsb.LJIIJJI(null, "viewDisappeared");
            ConcurrentHashMap<String, EnumC60750Nso> concurrentHashMap = LIZIZ;
            EnumC60750Nso enumC60750Nso = concurrentHashMap.get(str);
            if (enumC60750Nso != null) {
                int ordinal = enumC60750Nso.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        concurrentHashMap.put(str, EnumC60750Nso.PAUSED);
                        return;
                    }
                } else {
                    return;
                }
            }
            concurrentHashMap.put(str, EnumC60750Nso.PAUSED);
            LIZ.postDelayed(new RunnableC60749Nsn(str, c60737Nsb, LIZJ), 500L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r1 != 2) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C60737Nsb r4) {
        /*
            if (r4 == 0) goto L16
            java.lang.String r3 = r4.containerId
            if (r3 == 0) goto L16
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.Nso> r2 = X.C60748Nsm.LIZIZ
            java.lang.Object r0 = r2.get(r3)
            X.Nso r0 = (X.EnumC60750Nso) r0
            if (r0 != 0) goto L17
        L10:
            java.lang.String r1 = "viewAppeared"
            r0 = 0
            r4.LJIIJJI(r0, r1)
        L16:
            return
        L17:
            int r1 = r0.ordinal()
            if (r1 == 0) goto L24
            r0 = 1
            if (r1 == r0) goto L2a
            r0 = 2
            if (r1 == r0) goto L24
            goto L10
        L24:
            X.Nso r0 = X.EnumC60750Nso.RESUMED
            r2.put(r3, r0)
            goto L16
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60748Nsm.LIZJ(X.Nsb):void");
    }
}
