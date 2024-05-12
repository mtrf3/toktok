package X;

import Y.ARunnableS14S1200000_15;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YMV {
    public static final Gson LIZ = GsonHolder.LIZLLL().LIZ();
    public static final HashSet<YN9> LIZIZ = new HashSet<>();
    public static final HashSet<YMW> LIZJ = C77275UUl.LIZLLL(C87265YMr.LIZ, YMX.LIZ, C87255YMh.LIZ, C87256YMi.LIZ);
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final Object LJFF = new Object();

    public static void LIZIZ(InterfaceC88472Yns builder) {
        o.LJIIIZ(builder, "builder");
        YN9 yn9 = new YN9();
        builder.invoke(yn9);
        LIZIZ.add(yn9);
        try {
            LIZLLL.addAll(yn9.LIZ.LJLIL);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZ(String str, JSONObject jSONObject, java.util.Map map, int i) {
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        AtomicBoolean atomicBoolean = LJ;
        if (!atomicBoolean.get()) {
            synchronized (LJFF) {
                if (!atomicBoolean.get()) {
                    Iterator<YMW> it = LIZJ.iterator();
                    while (it.hasNext()) {
                        it.next().LIZ();
                    }
                    LJ.set(true);
                }
            }
        }
        if (!LIZLLL.contains(str)) {
            return;
        }
        C38995FSd.LIZLLL().execute(new ARunnableS14S1200000_15(map, str, jSONObject, 1));
    }
}
