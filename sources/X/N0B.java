package X;

import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class N0B {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final java.util.Map<String, Object> LJFF;
    public final java.util.Map<String, Object> LJI;

    public final void LJ() {
        ExecutorService logThreadPool;
        if (TextUtils.isEmpty(this.LIZ) || TextUtils.isEmpty(this.LIZIZ) || TextUtils.isEmpty(this.LIZJ)) {
            return;
        }
        Callable callable = new Callable() { // from class: X.N0g
            /* JADX WARN: Removed duplicated region for block: B:21:0x0146  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0248  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 774
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC58654N0g.call():java.lang.Object");
            }
        };
        IAppLogDepend LIZ = C59835Ne3.LIZ();
        if (LIZ == null) {
            logThreadPool = null;
        } else {
            logThreadPool = LIZ.getLogThreadPool();
        }
        C10K.LIZIZ(callable, logThreadPool, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                this.LJI.put(entry.getKey(), value);
            }
        }
    }

    public final void LIZJ(Object obj) {
        if ("refer".length() != 0 && obj != null) {
            if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
                return;
            }
            this.LJFF.put("refer", obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                this.LJFF.put(entry.getKey(), value);
            }
        }
    }

    public final void LIZIZ(Object obj, String str) {
        if (str.length() != 0 && obj != null) {
            if ((obj instanceof String) && ((CharSequence) obj).length() == 0) {
                return;
            }
            this.LJI.put(str, obj);
        }
    }

    public N0B(String str, String label, String creativeId, String str2, String str3) {
        o.LJIIIZ(label, "label");
        o.LJIIIZ(creativeId, "creativeId");
        this.LIZ = str;
        this.LIZIZ = label;
        this.LIZJ = creativeId;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
    }
}
