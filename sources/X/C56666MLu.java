package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notification.bean.LiveMessage;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MLu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56666MLu<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C56745MOv LJLILLLLZI;

    public C56666MLu(long j, C56745MOv c56745MOv) {
        this.LJLIL = j;
        this.LJLILLLLZI = c56745MOv;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        List<CombineLiveNotice> list;
        boolean z;
        LiveNoticeMessageResponse resp = (LiveNoticeMessageResponse) obj;
        o.LJIIIZ(resp, "resp");
        C56760MPk.LJI(resp, SystemClock.elapsedRealtime() - this.LJLIL);
        LiveMessage liveMessage = resp.liveMessage;
        if (liveMessage != null) {
            list = liveMessage.liveNotice;
        } else {
            list = null;
        }
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C56745MOv c56745MOv = this.LJLILLLLZI;
            synchronized (c56745MOv) {
                c56745MOv.LJ().clear();
                List<C56767MPr> LJ = c56745MOv.LJ();
                LiveMessage liveMessage2 = resp.liveMessage;
                o.LJI(liveMessage2);
                List<CombineLiveNotice> list2 = liveMessage2.liveNotice;
                o.LJI(list2);
                ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<CombineLiveNotice> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C78963Uyt.LJ(it.next()));
                }
                LJ.addAll(arrayList);
            }
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
