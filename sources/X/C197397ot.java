package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7ot, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197397ot implements LLE {
    public static long LJLIL = -1;
    public static final /* synthetic */ int LJLILLLLZI = 0;

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        StateOwner stateOwner;
        ActivityC45651qj LIZLLL;
        IFriendsTabLayoutAbility LIZJ;
        ActivityC45651qj LIZLLL2;
        if (!o.LJ(str, "FRIENDS_TAB") || (LIZLLL = (stateOwner = StateOwner.LJLIL).LIZLLL()) == null || (LIZJ = C53976LGi.LIZJ(LIZLLL)) == null || !LIZJ.ma("SOCIAL_EXPLORE") || (LIZLLL2 = stateOwner.LIZLLL()) == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        C7MK.LJII("enter_now_explore_page", new AqS28S1000000_3(C54024LIe.LJ(LIZLLL2, str2, null), 16));
    }
}
