package X;

import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class FNQ {
    public static final Keva LIZ;
    public static boolean LIZIZ;

    static {
        Keva repo = Keva.getRepo("NewUserUtils");
        LIZ = repo;
        repo.getLong("last_open_time", -1L);
    }
}
