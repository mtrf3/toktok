package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility;

/* renamed from: X.9Hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234279Hj extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C234279Hj LJLIL = new C234279Hj();

    public C234279Hj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ActivityC45651qj activityC45651qj;
        IFriendsTabRouterAbility iFriendsTabRouterAbility;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null && (iFriendsTabRouterAbility = (IFriendsTabRouterAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activityC45651qj, null), IFriendsTabRouterAbility.class, null)) != null) {
            iFriendsTabRouterAbility.Vn0();
        }
        return C76800UCe.LIZ;
    }
}
