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

/* renamed from: X.Jhs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49880Jhs<T> implements InterfaceC64592gB {
    public final /* synthetic */ C49877Jhp LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Message, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C49880Jhs(C49877Jhp c49877Jhp, InterfaceC88472Yns<? super Message, C76800UCe> interfaceC88472Yns, long j, int i) {
        this.LJLIL = c49877Jhp;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = j;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        int i;
        int i2;
        SearchMixFeedList searchMixFeedList = (SearchMixFeedList) obj;
        C49877Jhp c49877Jhp = this.LJLIL;
        c49877Jhp.LJLJLJ = searchMixFeedList;
        String str2 = null;
        if (searchMixFeedList != null) {
            str = C78949Uyf.LJIJI(searchMixFeedList);
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        c49877Jhp.LJLJLLL = str;
        if (C49856JhU.LIZ) {
            List<SearchMixFeed> list = searchMixFeedList.mItems;
            o.LJIIIIZZ(list, "result.items");
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<SearchMixFeed> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAweme());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str3);
                LIZ.append(next);
                str3 = i0.LJFF(X1D.LIZIZ(LIZ), "\r\n");
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        C49888Ji0 c49888Ji0 = new C49888Ji0();
        C49877Jhp c49877Jhp2 = this.LJLIL;
        long j = this.LJLJI;
        int i3 = this.LJLJJI;
        SearchMixFeedList searchMixFeedList2 = c49877Jhp2.LJLJLJ;
        if (searchMixFeedList2 != null) {
            i = searchMixFeedList2.cursor;
        } else {
            i = 0;
        }
        c49888Ji0.LIZJ(i, "query_cursor");
        c49888Ji0.LIZJ((int) (currentTimeMillis - j), "result_time");
        c49888Ji0.LIZJ(i3, "global_consume");
        List<SearchMixFeed> list2 = searchMixFeedList.mItems;
        if (list2 != null) {
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        c49888Ji0.LIZJ(i2, "query_result");
        String inStreamCount = c49877Jhp2.LJLJLLL;
        o.LJIIIZ(inStreamCount, "inStreamCount");
        c49888Ji0.LIZLLL("in_stream_id", inStreamCount);
        LogPbBean logPbBean = searchMixFeedList.logPb;
        if (logPbBean != null) {
            str2 = logPbBean.getImprId();
        }
        c49888Ji0.LIZLLL("in_stream_LOG", String.valueOf(str2));
        c49888Ji0.LJFF("is_new", false);
        c49888Ji0.LJIILIIL();
        InterfaceC88472Yns<Message, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        Message obtain = Message.obtain();
        obtain.obj = searchMixFeedList;
        interfaceC88472Yns.invoke(obtain);
    }
}
