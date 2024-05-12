package X;

import android.view.KeyEvent;
import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi;

/* renamed from: X.HWl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44203HWl implements IVolumeKeyUnmuteRunnerSpi {
    public static final C44203HWl LIZIZ = new C44203HWl();
    public final /* synthetic */ IVolumeKeyUnmuteRunnerSpi LIZ;

    @Override // com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi
    public final void LJI(int i, KeyEvent keyEvent, Object obj) {
        this.LIZ.LJI(i, keyEvent, obj);
    }

    public C44203HWl() {
        IVolumeKeyUnmuteRunnerSpi iVolumeKeyUnmuteRunnerSpi;
        Object LIZ = C58096Mr6.LIZ(IVolumeKeyUnmuteRunnerSpi.class, false);
        if (LIZ != null) {
            iVolumeKeyUnmuteRunnerSpi = (IVolumeKeyUnmuteRunnerSpi) LIZ;
        } else {
            if (C58096Mr6.B0 == null) {
                synchronized (IVolumeKeyUnmuteRunnerSpi.class) {
                    if (C58096Mr6.B0 == null) {
                        C58096Mr6.B0 = new OpenOnMuteImpl();
                    }
                }
            }
            iVolumeKeyUnmuteRunnerSpi = C58096Mr6.B0;
        }
        this.LIZ = iVolumeKeyUnmuteRunnerSpi;
    }
}
