package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M4S {
    public final String LIZ;
    public final Keva LIZIZ;

    public final void LIZ() {
        long LJFF = EF7.LJFF();
        String LIZIZ = C85999Xp5.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        long j = this.LIZIZ.getLong("version", 0L);
        String string = this.LIZIZ.getString("language", "");
        if (j <= 0 || LJFF != j || !o.LJ(LIZIZ, string)) {
            this.LIZIZ.clear();
            this.LIZIZ.storeLong("version", LJFF);
            this.LIZIZ.storeString("language", LIZIZ);
        }
    }

    public M4S(String str) {
        this.LIZ = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notice_cache_");
        LIZ.append(C46604IQu.LIZ());
        LIZ.append('_');
        LIZ.append(str);
        this.LIZIZ = Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
