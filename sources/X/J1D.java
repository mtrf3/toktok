package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes9.dex */
public final class J1D {
    public static final J1D LIZIZ = new J1D();
    public final Keva LIZ;

    public J1D() {
        System.nanoTime();
        this.LIZ = KevaImpl.getRepoSync("search_local_repo", 0);
    }
}
