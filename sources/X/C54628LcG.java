package X;

import com.ss.android.ugc.aweme.base.assem.FeedSkylightMaskAssem;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsSkylightAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.LcG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54628LcG implements InterfaceC54635LcN {
    public final /* synthetic */ FeedSkylightMaskAssem LIZ;

    @Override // X.InterfaceC54635LcN
    public final boolean LIZ() {
        return this.LIZ.v3().hv0();
    }

    @Override // X.InterfaceC54635LcN
    public final void LIZIZ() {
        if (this.LIZ.v3().gv0()) {
            this.LIZ.x3(true);
        }
    }

    @Override // X.InterfaceC54635LcN
    public final void LIZJ() {
        if (this.LIZ.v3().hv0()) {
            this.LIZ.x3(false);
        }
    }

    @Override // X.InterfaceC54635LcN
    public final void LIZLLL() {
        if (this.LIZ.v3().hv0()) {
            this.LIZ.x3(false);
        }
    }

    @Override // X.InterfaceC54635LcN
    public final boolean LJ() {
        String str;
        IFriendsSkylightAbility iFriendsSkylightAbility;
        FeedSkylightMaskAssem feedSkylightMaskAssem = this.LIZ;
        C54602Lbq c54602Lbq = (C54602Lbq) feedSkylightMaskAssem.LJLILLLLZI.getValue();
        if (c54602Lbq != null) {
            str = c54602Lbq.LJLIL;
        } else {
            str = null;
        }
        if (!o.LJ(str, "homepage_friends") || (iFriendsSkylightAbility = (IFriendsSkylightAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(feedSkylightMaskAssem), IFriendsSkylightAbility.class, null)) == null || !iFriendsSkylightAbility.lb() || !this.LIZ.v3().gv0()) {
            return false;
        }
        return true;
    }

    public C54628LcG(FeedSkylightMaskAssem feedSkylightMaskAssem) {
        this.LIZ = feedSkylightMaskAssem;
    }
}
