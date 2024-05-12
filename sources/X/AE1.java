package X;

import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import kotlin.jvm.internal.AqS9S0010000_4;

/* loaded from: classes5.dex */
public final class AE1 implements AE6 {
    public final /* synthetic */ CreatorToolsActivity LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.AE6
    public final void onFailed() {
        C25849ACn c25849ACn = this.LIZ.LLFFF;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LIZIZ, 53));
        }
    }

    @Override // X.AE6
    public final void onSuccess() {
        C25849ACn c25849ACn = this.LIZ.LLFFF;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(this.LIZIZ, 54));
        }
        C55888Lwa.LIZIZ.LJJIZ(this.LIZIZ);
    }

    public AE1(CreatorToolsActivity creatorToolsActivity, boolean z) {
        this.LIZ = creatorToolsActivity;
        this.LIZIZ = z;
    }
}
