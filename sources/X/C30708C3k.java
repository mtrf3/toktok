package X;

import Y.AfS19S0001000_11;
import Y.AfS36S0101000_5;
import com.bytedance.android.livesdk.broadcast.preview.virtual.StartLivePreviewFragment;

/* renamed from: X.C3k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30708C3k implements InterfaceC30497By1 {
    public final /* synthetic */ StartLivePreviewFragment LIZ;

    @Override // X.InterfaceC30497By1
    public final void onError(int i, int i2) {
    }

    public C30708C3k(StartLivePreviewFragment startLivePreviewFragment) {
        this.LIZ = startLivePreviewFragment;
    }

    @Override // X.InterfaceC30497By1
    public final void onInfo(int i, int i2, int i3, String str) {
        if (i == 1) {
            StartLivePreviewFragment startLivePreviewFragment = this.LIZ;
            if (!startLivePreviewFragment.mInitializedEffect) {
                startLivePreviewFragment.mSubscribe = AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(0, this, 38), new AfS19S0001000_11(0, 1));
            }
        }
    }
}
