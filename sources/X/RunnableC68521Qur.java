package X;

import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Qur, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68521Qur implements Runnable {
    public final /* synthetic */ User LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public RunnableC68521Qur(User user, long j, boolean z) {
        this.LJLIL = user;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
    }

    public final void LIZ() {
        String uid = this.LJLIL.getUid();
        if (uid == null || uid.length() == 0) {
            return;
        }
        if (this.LJLILLLLZI || this.LJLIL.isUserCancelled()) {
            C68517Qun c68517Qun = C68517Qun.LIZ;
            String uid2 = this.LJLIL.getUid();
            o.LJIIIIZZ(uid2, "currentUser.uid");
            c68517Qun.LJIJ(this.LJLJI + 2592000000L, uid2, true);
        } else {
            C68517Qun c68517Qun2 = C68517Qun.LIZ;
            String uid3 = this.LJLIL.getUid();
            o.LJIIIIZZ(uid3, "currentUser.uid");
            c68517Qun2.LJIJ(this.LJLJI, uid3, false);
        }
        ArrayList arrayList = (ArrayList) C68517Qun.LIZ.LJI(R41.LIZLLL());
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (o.LJ(((BaseLoginMethod) it.next()).isHistoryOff(), Boolean.TRUE)) {
                    C68517Qun.LIZ.LJIILL(true, true);
                    return;
                }
            }
        }
        C68517Qun c68517Qun3 = C68517Qun.LIZ;
        String uid4 = this.LJLIL.getUid();
        o.LJIIIIZZ(uid4, "currentUser.uid");
        c68517Qun3.LJIIZILJ(this.LJLJI, uid4);
        c68517Qun3.LJIJJ(this.LJLIL);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
