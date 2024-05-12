package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EjR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37237EjR implements Runnable {
    public static final RunnableC37237EjR LJLIL = new RunnableC37237EjR();

    public static void LIZ() {
        Object LIZ;
        Object value;
        Keva indexRepo = C37236EjQ.LIZ;
        o.LJFF(indexRepo, "indexRepo");
        java.util.Map<String, ?> all = indexRepo.getAll();
        o.LJFF(all, "indexRepo.all");
        long currentTimeMillis = System.currentTimeMillis();
        loop0: for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            o.LJFF(key, "entity.key");
            if (!ujb.o.LJJJJ(key, "_detail_id", false)) {
                String path = entry.getKey();
                o.LJFF(path, "path");
                Keva LIZJ = C37236EjQ.LIZJ(path);
                if (LIZJ != null) {
                    java.util.Map<String, ?> all2 = LIZJ.getAll();
                    o.LJFF(all2, "detailRepo.all");
                    for (Map.Entry<String, ?> entry2 : all2.entrySet()) {
                        try {
                            value = entry2.getValue();
                        } catch (Throwable th) {
                            LIZ = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ);
                        }
                        if (value != null) {
                            LIZ = new JSONObject((String) value);
                            C3C5.m7constructorimpl(LIZ);
                            if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                                LIZJ.erase(entry2.getKey());
                            }
                            if (C3C5.m13isSuccessimpl(LIZ)) {
                                JSONObject jSONObject = (JSONObject) LIZ;
                                if (JSONObjectProtectorUtils.getLong(jSONObject, "expire_time") <= currentTimeMillis) {
                                    C37236EjQ.LIZIZ.erase(JSONObjectProtectorUtils.getString(jSONObject, "content_UUID"));
                                    LIZJ.erase(entry2.getKey());
                                }
                            }
                        } else {
                            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
                            break loop0;
                        }
                    }
                    if (LIZJ.count() == 0) {
                        C37236EjQ.LIZIZ(path);
                    }
                } else {
                    C37236EjQ.LIZIZ(path);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
