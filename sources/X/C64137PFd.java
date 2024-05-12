package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;

/* renamed from: X.PFd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64137PFd extends AbstractRunnableC64070PCo {
    public final /* synthetic */ C64171PGl LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64137PFd(C64171PGl c64171PGl) {
        super(LivePreviewNetworkSpeedThresholdSetting.DEFAULT, LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
        this.LJLJJI = c64171PGl;
    }
}
