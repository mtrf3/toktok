package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileHeaderCell;
import kotlin.jvm.internal.o;

/* renamed from: X.BiC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29516BiC implements InterfaceC29521BiH {
    public final /* synthetic */ LiveProfileHeaderCell LIZ;

    public C29516BiC(LiveProfileHeaderCell liveProfileHeaderCell) {
        this.LIZ = liveProfileHeaderCell;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC29521BiH
    public final void LIZ(AbstractC31462CWk<? extends AbstractC31467CWp> abstractC31462CWk) {
        BadgeStruct LIZ;
        if ((abstractC31462CWk instanceof InterfaceC29517BiD) && (LIZ = ((InterfaceC29517BiD) abstractC31462CWk).LIZ()) != null) {
            C29518BiE c29518BiE = this.LIZ.LLIIIILZ;
            if (c29518BiE != null) {
                c29518BiE.LIZJ(LIZ);
            } else {
                o.LJIJI("badgePresenter");
                throw null;
            }
        }
    }
}
