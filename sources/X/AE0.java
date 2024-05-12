package X;

import com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterSettingsFragment;
import kotlin.jvm.internal.AqS9S0010000_4;

/* loaded from: classes5.dex */
public final class AE0 implements AE6 {
    public final /* synthetic */ CreatorCenterSettingsFragment LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.AE6
    public final void onFailed() {
        C25849ACn c25849ACn = this.LIZ.LJLJJI;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LIZIZ, 42));
        }
    }

    @Override // X.AE6
    public final void onSuccess() {
        C25849ACn c25849ACn = this.LIZ.LJLJJI;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LIZIZ, 43));
        }
        C55888Lwa.LIZIZ.LJJIZ(this.LIZIZ);
    }

    public AE0(CreatorCenterSettingsFragment creatorCenterSettingsFragment, boolean z) {
        this.LIZ = creatorCenterSettingsFragment;
        this.LIZIZ = z;
    }
}
