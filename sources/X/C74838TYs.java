package X;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.TYs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74838TYs extends AbstractC28788BRo<Boolean> {
    public static C74838TYs LJJJIL;
    public C31612Cau LIZLLL;
    public C74840TYu LJ;
    public TUX LJFF;
    public TUW LJII;
    public C28272B7s LJIIJ;
    public String LJIILIIL;
    public volatile String LJIILJJIL;
    public String LJIILL;
    public final C74839TYt LJIILLIIL;
    public MultiLiveAnchorPanelSettings LJJI;
    public volatile boolean LJJIII;
    public volatile boolean LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public volatile boolean LJJIIZ;
    public final java.util.Set<Long> LJJJ;
    public boolean LJJJI;
    public final ConcurrentHashSet<InterfaceC74841TYv> LJI = new ConcurrentHashSet<>();
    public boolean LJIIIIZZ = false;
    public boolean LJIIIZ = false;
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public boolean LJIIZILJ = false;
    public boolean LJIJ = false;
    public boolean LJIJI = false;
    public boolean LJIJJ = false;
    public int LJIJJLI = 1;
    public final java.util.Set<Long> LJIL = new HashSet();
    public int LJJ = 0;
    public boolean LJJIFFI = false;
    public int LJJII = 2;
    public Pair<Long, C28272B7s> LJJIIZI = null;
    public boolean LJJIJ = false;
    public boolean LJJIJIIJI = false;
    public boolean LJJIJIIJIL = false;
    public boolean LJJIJIL = false;
    public boolean LJJIJL = false;
    public Long LJJIJLIJ = 0L;
    public boolean LJJIL = false;
    public String LJJIZ = "normal";

    public final void LJI() {
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = false;
    }

    public static C74838TYs LJ() {
        if (LJJJIL == null) {
            LJJJIL = new C74838TYs();
        }
        return LJJJIL;
    }

    public final String LIZLLL() {
        if (this.LJIILJJIL == null) {
            return "";
        }
        return this.LJIILJJIL;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Boolean] */
    public C74838TYs() {
        new ArrayMap();
        this.LJJJ = new HashSet();
        this.LJJJI = false;
        this.LIZIZ = Boolean.FALSE;
        this.LJIILLIIL = new C74839TYt();
    }

    public final void LJII(long j) {
        C74839TYt c74839TYt = this.LJIILLIIL;
        long currentTimeMillis = System.currentTimeMillis();
        int i = c74839TYt.LJLJI;
        if (i != 0 && j <= c74839TYt.LJLIL[i - 1]) {
            c74839TYt.LIZIZ(j, currentTimeMillis);
            return;
        }
        if (i >= c74839TYt.LJLIL.length) {
            c74839TYt.LIZ(i + 1);
        }
        c74839TYt.LJLIL[i] = j;
        c74839TYt.LJLILLLLZI[i] = currentTimeMillis;
        c74839TYt.LJLJI = i + 1;
    }

    public final void LJIIIIZZ(boolean z) {
        this.LJIIL = z;
        C74840TYu c74840TYu = this.LJ;
        if (c74840TYu != null) {
            c74840TYu.LIZ(z);
        }
    }

    public final void LJIIIZ(boolean z) {
        this.LJIIIZ = z;
        C31612Cau c31612Cau = this.LIZLLL;
        if (c31612Cau != null) {
            c31612Cau.LIZ(z);
        }
        Iterator<InterfaceC74841TYv> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(z);
        }
        C38.LIZ(z, C37.MULTI_GUEST);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
    public final void LJFF(Room room, String str) {
        C31811Ce7.LIZLLL("invite_issue_check", "rtcExtInfo reset");
        this.LJIJ = false;
        this.LJIJI = false;
        this.LJIJJ = false;
        this.LIZIZ = Boolean.FALSE;
        this.LJIILJJIL = null;
        this.LJIILIIL = null;
        this.LJIILL = "";
        this.LJIIZILJ = false;
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = false;
        this.LJIJJLI = 1;
        ((HashSet) this.LJIL).clear();
        this.LJJ = 0;
        this.LJIIIZ = false;
        this.LJIIL = false;
        this.LJJII = 2;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJJIFFI = false;
        this.LJJJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = false;
        this.LJJIL = false;
        this.LJJIJL = false;
        this.LJJIJLIJ = 0L;
        this.LJFF = null;
        this.LJII = null;
        this.LJI.clear();
        this.LJJIZ = "normal";
        if (this.LJIIJJI && TextUtils.equals(str, "onDestroy") && room != null && room.getId() != 0) {
            this.LJJIIZI = new Pair<>(Long.valueOf(room.getId()), this.LJIIJ);
        }
        if (TextUtils.equals(str, "onDestroy")) {
            this.LJIIJJI = false;
        }
        this.LJIIJ = null;
    }
}
