package X;

import Y.ARunnableS0S1102000_5;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;

/* loaded from: classes6.dex */
public final class C25 implements InterfaceC30497By1 {
    public final /* synthetic */ TryModeBroadcastFragment LIZ;

    @Override // X.InterfaceC30497By1
    public final void onError(int i, int i2) {
    }

    public C25(TryModeBroadcastFragment tryModeBroadcastFragment) {
        this.LIZ = tryModeBroadcastFragment;
    }

    @Override // X.InterfaceC30497By1
    public final void onInfo(int i, int i2, int i3, String str) {
        if (i == 2) {
            C15610jN.LIZ().post(new ARunnableS0S1102000_5(i2, i3, str, this.LIZ, 1));
        }
    }
}
