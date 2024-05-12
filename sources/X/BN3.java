package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class BN3 implements BMC {
    public final java.util.Map<FeedDataKey, BN5> LIZ = new ConcurrentHashMap();
    public final C73849Syb<Boolean> LIZIZ = C73849Syb.LJJZZI(Boolean.FALSE);
    public final List<BMD> LIZJ = new LinkedList();
    public final BN4 LIZLLL = new BN4();
    public boolean LJ;

    @Override // X.BMC
    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LIZIZ.onNext(Boolean.TRUE);
    }

    @Override // X.BMC
    public final void LIZJ(BMD bmd) {
        ((LinkedList) this.LIZJ).remove(bmd);
    }

    @Override // X.BMC
    public final void LIZLLL(BMF bmf) {
        this.LIZLLL.add(bmf);
    }

    @Override // X.BMC
    public final void LJI(C39301gU c39301gU) {
        this.LIZLLL.remove(c39301gU);
    }

    @Override // X.BMC
    public final void LJII(BMD bmd) {
        ((LinkedList) this.LIZJ).add(bmd);
    }

    @Override // X.BMC
    public final void LJ(FeedDataKey feedDataKey, InterfaceC28629BLl interfaceC28629BLl) {
        if (feedDataKey == null || interfaceC28629BLl == null) {
            return;
        }
        BN5 bn5 = (BN5) ((ConcurrentHashMap) this.LIZ).get(feedDataKey);
        if (bn5 == null) {
            bn5 = new BN5(interfaceC28629BLl);
            ((ConcurrentHashMap) this.LIZ).put(feedDataKey, bn5);
        }
        if (bn5.LIZ != interfaceC28629BLl) {
            bn5.LIZ = interfaceC28629BLl;
        }
        bn5.LIZIZ++;
    }

    @Override // X.BMC
    public final boolean LJFF(FeedDataKey feedDataKey, InterfaceC28629BLl interfaceC28629BLl) {
        if (feedDataKey == null || interfaceC28629BLl == null) {
            return false;
        }
        BN5 bn5 = (BN5) ((ConcurrentHashMap) this.LIZ).get(feedDataKey);
        if (bn5 != null) {
            int i = bn5.LIZIZ - 1;
            bn5.LIZIZ = i;
            if (i <= 0) {
                ((ConcurrentHashMap) this.LIZ).remove(feedDataKey);
            }
            if (bn5.LIZIZ != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // X.BMC
    public final void LIZ(String str, List<FeedItem> list, FeedExtra feedExtra, boolean z) {
        if (C32151Nz.LJJIIZI(this.LIZJ)) {
            Iterator<BMD> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(str, list, feedExtra, z);
            }
        }
    }
}
