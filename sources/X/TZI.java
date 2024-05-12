package X;

import Y.AfS33S0201000_13;
import Y.AfS62S0200000_13;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZI {
    public final Context LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final C73318Sq2 LIZLLL;

    public final void LIZ(int i, User user) {
        C78999UzT.LJFF(C1EW.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).anchorMuteGuest(this.LIZJ, this.LIZIZ, C78886Uxe.LJJJLIIL(C8E.LJ()), Long.valueOf(user.getId()), i, null)).LJJJLIIL(new AfS33S0201000_13(i, this, user, 4), new AfS62S0200000_13(this, user, 73)), this.LIZLLL);
    }

    public TZI(Context context, long j, long j2, C73318Sq2 compositeDisposable) {
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        this.LIZ = context;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = compositeDisposable;
    }
}
