package X;

import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ADA implements C44 {
    public final /* synthetic */ CreatorToolsActivity LIZ;

    @Override // X.C44
    public final void onFailed(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public ADA(CreatorToolsActivity creatorToolsActivity) {
        this.LIZ = creatorToolsActivity;
    }

    @Override // X.C44
    public final void LIZ(Boolean bool, C29180Bcm c29180Bcm, BUT but) {
        if (o.LJ(bool, Boolean.TRUE)) {
            CreatorToolsActivity creatorToolsActivity = this.LIZ;
            AEG aeg = creatorToolsActivity.LJZ;
            if (aeg != null) {
                aeg.LJIIJ(ADS.LJLIL);
            }
            C25860ACy c25860ACy = creatorToolsActivity.LJLLL;
            if (c25860ACy != null) {
                c25860ACy.LJIIJ(new AqS170S0100000_4(creatorToolsActivity, 1276));
            }
        }
    }
}
