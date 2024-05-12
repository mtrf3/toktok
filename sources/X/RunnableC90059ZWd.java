package X;

import com.google.android.gms.cast.CastRemoteDisplayLocalService;

/* renamed from: X.ZWd, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90059ZWd implements Runnable {
    public final /* synthetic */ CastRemoteDisplayLocalService LJLIL;

    public RunnableC90059ZWd(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.LJLIL = castRemoteDisplayLocalService;
    }

    public final void LIZ() {
        CastRemoteDisplayLocalService.LIZ();
        if (!this.LJLIL.LJLIL) {
            CastRemoteDisplayLocalService.LJLJJI.getClass();
            this.LJLIL.stopSelf();
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
