package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.LqK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55500LqK implements InterfaceC252619vl {
    public static final C55500LqK LJLIL = new C55500LqK();

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        String str;
        if (i != 1 && i != 2 && i != 3) {
            return;
        }
        if (user2 == null || (str = user2.getUid()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (!C78685UuP.LJJJZ(str) || o.LJ(str, C55499LqJ.LIZLLL)) {
            return;
        }
        C55499LqJ.LIZLLL = str;
        C55499LqJ.LIZJ();
    }
}
