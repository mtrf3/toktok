package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.cache.FriendsFeeRespDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YWU implements LW5 {
    public final AbstractC03300Ba LIZ;
    public final YWK LIZIZ;
    public final C77857Uh3 LIZJ = new C77857Uh3();
    public final IDd0S18S0000000_15 LIZLLL;

    public YWU(FriendsFeeRespDatabase friendsFeeRespDatabase) {
        this.LIZ = friendsFeeRespDatabase;
        this.LIZIZ = new YWK(this, friendsFeeRespDatabase);
        this.LIZLLL = new IDd0S18S0000000_15(friendsFeeRespDatabase, 25);
        new IDd0S18S0000000_15(friendsFeeRespDatabase, 26);
    }

    @Override // X.LW5
    public final List<LW0> LIZ(String str) {
        String string;
        String string2;
        Object LIZ;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM friends_feed_resp_cache where uid = ?");
        LIZJ.LJJII(1, str);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "uid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "friends_feed_resp");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "created_time_millis");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                Object obj = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                if (LIZIZ.isNull(LIZIZ3)) {
                    string2 = null;
                } else {
                    string2 = LIZIZ.getString(LIZIZ3);
                }
                this.LIZJ.getClass();
                try {
                    LIZ = (FriendsFeedResponse) C75792yF.LIZ(string2, FriendsFeedResponse.class);
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ) == null) {
                    obj = LIZ;
                }
                arrayList.add(new LW0(string, (FriendsFeedResponse) obj, LIZIZ.getLong(LIZIZ4)));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.LW5
    public final void LIZIZ(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        LIZ.LJJII(1, str);
        this.LIZ.LIZJ();
        try {
            LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }

    @Override // X.LW5
    public final void LIZJ(LW0 lw0) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            this.LIZIZ.LJFF(lw0);
            this.LIZ.LJIILLIIL();
        } finally {
            this.LIZ.LJIIJJI();
        }
    }
}
