package X;

import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;

/* loaded from: classes10.dex */
public final class M4A implements Runnable {
    public static final M4A LJLIL = new M4A();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            PermissionCache.LJLIL.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
