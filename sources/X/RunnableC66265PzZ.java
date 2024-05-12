package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.PzZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66265PzZ implements Runnable {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public long LJLJI;

    public final void LIZ() {
        User user;
        String str;
        String str2 = this.LJLIL;
        String region = this.LJLILLLLZI;
        long j = this.LJLJI;
        RBY LJFF = AccountService.LJIJ().LJFF();
        String str3 = null;
        if (LJFF.isLogin()) {
            user = LJFF.getCurUser();
        } else {
            user = null;
        }
        if (user != null && (o.LJ(user.getSecUid(), str2) || (user.getUid() != null && !o.LJ(user.getUid(), C66266Pza.LJIIIIZZ)))) {
            C66266Pza.LJIIIZ = true;
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            C66266Pza.LJIIIIZZ = uid;
            String userId = C66266Pza.LJIIIIZZ;
            C66266Pza.LIZLLL.put(userId, region);
            C66266Pza.LJ.storeString(userId, region);
            o.LJIIIZ(userId, "userId");
            o.LJIIIZ(region, "region");
            U49.LJ.put(userId, region);
            ApmEvent apmEvent = new ApmEvent("app_log_isolation");
            apmEvent.LIZJ(Long.valueOf(j), "retry_times");
            C66059PwF.LIZIZ(apmEvent);
            return;
        }
        if (user == null || user.getUid() == null || o.LJ(user.getUid(), CardStruct.IStatusCode.DEFAULT)) {
            C66266Pza.LJIIIIZZ = CardStruct.IStatusCode.DEFAULT;
        }
        if (C66266Pza.LJFF) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkCurrentUser: again ");
            LIZ.append(j);
            LIZ.append(' ');
            LIZ.append(C66266Pza.LJIIIIZZ);
            LIZ.append(' ');
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(' ');
            LIZ.append(str2);
            LIZ.append(' ');
            if (user != null) {
                str3 = user.getSecUid();
            }
            LIZ.append(str3);
            X1D.LIZIZ(LIZ);
        }
        long j2 = j + 1;
        if (j2 < 100) {
            RunnableC66265PzZ runnableC66265PzZ = C66266Pza.LJIIJ;
            runnableC66265PzZ.LJLJI = j2;
            HandlerThreadC65936PuG.LIZ();
            HandlerThreadC65936PuG.LJLILLLLZI.postDelayed(runnableC66265PzZ, 100L);
            return;
        }
        ApmEvent apmEvent2 = new ApmEvent("app_log_isolation");
        apmEvent2.LIZ("max", "retry_times");
        C66059PwF.LIZIZ(apmEvent2);
        String userId2 = C66266Pza.LJIIIIZZ;
        C66266Pza.LIZLLL.put(userId2, region);
        C66266Pza.LJ.storeString(userId2, region);
        o.LJIIIZ(userId2, "userId");
        o.LJIIIZ(region, "region");
        U49.LJ.put(userId2, region);
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
