package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXY implements InterfaceC49318JXe<FollowStatus> {
    public final /* synthetic */ JXV LIZ;

    @Override // X.InterfaceC49318JXe
    public final Class<FollowStatus> LIZ() {
        return FollowStatus.class;
    }

    public JXY(JXV jxv) {
        this.LIZ = jxv;
    }

    @Override // X.InterfaceC49318JXe
    public final void LIZIZ(FollowStatus followStatus) {
        FollowStatus event = followStatus;
        o.LJIIIZ(event, "event");
        this.LIZ.onChanged(event);
    }
}
