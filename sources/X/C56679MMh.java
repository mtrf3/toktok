package X;

import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import kotlin.jvm.internal.o;

/* renamed from: X.MMh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56679MMh<T> implements InterfaceC64592gB {
    public static final C56679MMh<T> LJLIL = new C56679MMh<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        InboxEntranceResponse value = (InboxEntranceResponse) obj;
        C221018lt.LJFF("PreloadManager", "requestCache success");
        C56686MMo.LIZ(value);
        o.LJIIIIZZ(value, "value");
        MLS.LJI(value);
        ActivitiesPerfCacheManager.LIZJ(value.getEntranceCells());
        FollowerPreCacheManager.LIZJ(value.getEntranceCells());
        MMJ.ENTRANCE_LIST_NETWORK_TIME.intervalEnd();
        PreloadManager.LIZIZ.set(false);
        PreloadManager.LIZJ.set(new NoticeList(null, MLS.LIZJ(value), 0L, null, value.getGroups(), null, null, 109, null));
        C56678MMg.LJIILIIL(value.getEntranceCells());
        C56678MMg.LJIILJJIL(value.getLatestNoticeTime());
        C56683MMl.LJI.LJIIIIZZ(value);
    }
}
