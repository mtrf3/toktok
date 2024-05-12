package X;

import com.benchmark.strategy.nativePort.BXDataProviderPort;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.0Hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05090Hx {
    public static final C05090Hx LIZJ = new C05090Hx();
    public final BXDataProviderPort LIZ = new BXDataProviderPort();
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();

    public final <T> T LIZIZ(Class<T> cls, InterfaceC09250Xx interfaceC09250Xx) {
        T t;
        String LJLLJ = C16880lQ.LJLLJ(cls);
        if (this.LIZIZ.contains(LJLLJ) && (t = (T) this.LIZIZ.get(LJLLJ)) != null) {
            return t;
        }
        T t2 = (T) interfaceC09250Xx.create(cls);
        this.LIZIZ.put(LJLLJ, t2);
        return t2;
    }

    public final String LJ(int i, String str) {
        Object LJIIJ;
        if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
            return (String) LJIIJ;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = this.LIZ.getString(i, str);
        LJFF(i, currentTimeMillis, str);
        return string;
    }

    public static void LJFF(int i, long j, String str) {
        if (!C1FO.LJIIIIZZ("bytebench_strategy_get_operation_cost_time")) {
            C47261Igj.LJIILJJIL("AppLogOpt");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis);
            jSONObject.put("appid", i);
            jSONObject.put("request_key", str);
            C38891fp.LJJII("bytebench_strategy_get_operation_cost_time", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final boolean LIZ(int i, String str, boolean z) {
        Object LJIIJ;
        if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
            return ((Boolean) LJIIJ).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.LIZ.getBoolean(i, str, z);
        LJFF(i, currentTimeMillis, str);
        return z2;
    }

    public final float LIZJ(int i, String str, float f) {
        Object LJIIJ;
        if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
            return ((Float) LJIIJ).floatValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        float f2 = this.LIZ.getFloat(i, str, f);
        LJFF(i, currentTimeMillis, str);
        return f2;
    }

    public final int LIZLLL(int i, String str, int i2) {
        Object LJIIJ;
        if (C09590Zf.LJIILLIIL.LJIIIZ && (LJIIJ = C70657RoD.LJIIJ(str)) != null) {
            return ((Integer) LJIIJ).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = this.LIZ.getInt(i, str, i2);
        LJFF(i, currentTimeMillis, str);
        return i3;
    }
}
