package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HoG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45180HoG {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C45181HoH.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 540));

    public final ConcurrentHashMap<String, String> LIZIZ() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    public final String LIZ(String originalPath) {
        o.LJIIIZ(originalPath, "originalPath");
        String str = LIZIZ().get(originalPath);
        if (str == null) {
            str = "";
        }
        if (C1B6.LIZIZ(str)) {
            return str;
        }
        return null;
    }

    public final void LIZLLL(String key) {
        o.LJIIIZ(key, "key");
        LIZIZ().remove(key);
        Keva keva = (Keva) this.LIZ.getValue();
        String LIZJ = C75792yF.LIZJ(LIZIZ());
        LIZJ.toString();
        keva.storeString("cahce_resource", LIZJ);
    }

    public final void LIZJ(String originalPath, String result) {
        o.LJIIIZ(originalPath, "originalPath");
        o.LJIIIZ(result, "result");
        LIZIZ().put(originalPath, result);
        Keva keva = (Keva) this.LIZ.getValue();
        String LIZJ = C75792yF.LIZJ(LIZIZ());
        LIZJ.toString();
        keva.storeString("cahce_resource", LIZJ);
    }
}
