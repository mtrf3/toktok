package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WRZ implements InterfaceC82293WRl {
    public final Keva LIZ;

    public WRZ(String repoName) {
        o.LJIIIZ(repoName, "repoName");
        this.LIZ = KevaImpl.getRepo(repoName, 1);
    }

    @Override // X.InterfaceC82293WRl
    public final int LIZIZ(String key, String str) {
        o.LJIIIZ(key, "key");
        if (str != null) {
            return this.LIZ.getInt(str, -1);
        }
        return this.LIZ.getInt(key, -1);
    }

    @Override // X.InterfaceC82293WRl
    public final void LIZ(int i, String key, String str) {
        o.LJIIIZ(key, "key");
        if (str != null) {
            this.LIZ.storeInt(str, i);
        } else {
            this.LIZ.storeInt(key, i);
        }
    }
}
