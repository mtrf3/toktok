package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.LqL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55501LqL implements LEA {
    public static final C55501LqL LJLIL = new C55501LqL();

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String str;
        if (z && i == 1) {
            if (user == null || (str = user.getUid()) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            if (C78685UuP.LJJJZ(str) && !o.LJ(str, C55499LqJ.LIZLLL)) {
                C55499LqJ.LIZLLL = str;
                C55499LqJ.LIZJ();
            }
        }
    }
}
