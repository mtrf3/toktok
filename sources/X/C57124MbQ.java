package X;

import com.ss.android.ugc.aweme.friends.lego.MafFollowBackBootRequest;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.MbQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57124MbQ implements InterfaceC252619vl {
    public final /* synthetic */ MafFollowBackBootRequest LJLIL;

    public C57124MbQ(MafFollowBackBootRequest mafFollowBackBootRequest) {
        this.LJLIL = mafFollowBackBootRequest;
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        String str;
        StringBuilder LJ = C7MY.LJ("type = ", i, ", curUid = ");
        LJ.append(this.LJLIL.LJLIL);
        LJ.append(", oldUser = ");
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        LJ.append(str);
        LJ.append(" and new user = ");
        if (user2 != null) {
            str2 = user2.getUid();
        }
        b0.LJFF(LJ, str2, LJ, "MafFollowBackBootRequest");
        if (C78685UuP.LJJJZ(this.LJLIL.LJLIL) && user2 != null && !o.LJ(this.LJLIL.LJLIL, user2.getUid())) {
            this.LJLIL.LJLIL = user2.getUid();
            this.LJLIL.LIZLLL();
        }
    }
}
