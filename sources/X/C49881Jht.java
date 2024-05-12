package X;

import android.os.Message;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jht, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49881Jht<T> implements InterfaceC64592gB {
    public final /* synthetic */ C49875Jhn LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C49881Jht(C49875Jhn c49875Jhn, long j) {
        this.LJLIL = c49875Jhn;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        int i;
        int i2;
        String str;
        SearchMixFeedList searchMixFeedList = (SearchMixFeedList) obj;
        if (C49856JhU.LIZ) {
            List<SearchMixFeed> list = searchMixFeedList.mItems;
            o.LJIIIIZZ(list, "result.items");
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<SearchMixFeed> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAweme());
            }
            Iterator it2 = arrayList.iterator();
            String str2 = "";
            while (it2.hasNext()) {
                Object next = it2.next();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(next);
                str2 = i0.LJFF(X1D.LIZIZ(LIZ), "\r\n");
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        C49888Ji0 c49888Ji0 = new C49888Ji0();
        C49875Jhn c49875Jhn = this.LJLIL;
        long j = this.LJLILLLLZI;
        SearchMixFeedList searchMixFeedList2 = (SearchMixFeedList) c49875Jhn.mData;
        if (searchMixFeedList2 != null) {
            i = searchMixFeedList2.cursor;
        } else {
            i = 0;
        }
        c49888Ji0.LIZJ(i, "query_cursor");
        c49888Ji0.LIZJ((int) (currentTimeMillis - j), "result_time");
        c49888Ji0.LIZJ(c49875Jhn.LJ(c49875Jhn.LLIIIJ), "global_consume");
        List<SearchMixFeed> list2 = searchMixFeedList.mItems;
        if (list2 != null) {
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        c49888Ji0.LIZJ(i2, "query_result");
        String inStreamCount = c49875Jhn.LLIIIJ;
        o.LJIIIZ(inStreamCount, "inStreamCount");
        c49888Ji0.LIZLLL("in_stream_id", inStreamCount);
        LogPbBean logPbBean = searchMixFeedList.logPb;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        } else {
            str = null;
        }
        c49888Ji0.LIZLLL("in_stream_LOG", String.valueOf(str));
        c49888Ji0.LJFF("is_new", false);
        c49888Ji0.LJIILIIL();
        C49875Jhn c49875Jhn2 = this.LJLIL;
        Message obtain = Message.obtain();
        obtain.obj = searchMixFeedList;
        c49875Jhn2.handleMsg(obtain);
    }
}
