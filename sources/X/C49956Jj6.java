package X;

import Y.ARunnableS14S0110000_8;
import Y.ARunnableS44S0100000_8;
import Y.IDrS47S0100000_8;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jj6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49956Jj6 {
    public static boolean LIZ;
    public static int LIZIZ;
    public static int LIZJ;

    public static void LIZIZ(String str) {
        if (str != null && !o.LJ(str, "")) {
            W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
            OF7 of7 = new OF7(-1, "", 0, "", true);
            C78665Uu5 c78665Uu5 = new C78665Uu5();
            c78665Uu5.LIZ = of7;
            LIZLLL.LJIILJJIL = c78665Uu5;
            W5I.LIZ().LJIIL(LIZLLL.LIZ(), null);
        }
    }

    public static void LJFF(List list) {
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse((String) it.next()));
                OF7 of7 = new OF7(-1, "", 0, "", true);
                C78665Uu5 c78665Uu5 = new C78665Uu5();
                c78665Uu5.LIZ = of7;
                LIZLLL.LJIILJJIL = c78665Uu5;
                W5I.LIZ().LJIIL(LIZLLL.LIZ(), null);
            }
        }
    }

    public static void LIZ(C49710Jf8 c49710Jf8, C8HS c8hs) {
        if (C49957Jj7.LIZ().group != 0 && c49710Jf8 != null) {
            c49710Jf8.LJIIJJI(new IDrS47S0100000_8(c8hs, 10));
            c49710Jf8.setOnFlingListener(new C49959Jj9());
        }
    }

    public static void LIZJ(C49710Jf8 c49710Jf8, C8HS c8hs) {
        DynamicPatch LJI;
        String alaSrc;
        if (C49957Jj7.LIZ().group == 0) {
            return;
        }
        LIZIZ = 0;
        LIZJ = 0;
        List data = c8hs.getData();
        if (data != null && (!data.isEmpty()) && (LJI = ((SearchMixFeed) ListProtector.get(data, 0)).LJI()) != null && (alaSrc = LJI.getAlaSrc()) != null && alaSrc.equals("tt_trendinglist")) {
            C38995FSd.LIZJ().execute(new ARunnableS44S0100000_8(data, 123));
        }
        LJ(c49710Jf8, c8hs);
    }

    public static void LIZLLL(SearchMixFeedList searchMixFeedList, boolean z) {
        int i;
        GlobalDoodleConfig globalDoodleConfig;
        boolean z2 = false;
        if (((Number) C49961JjB.LIZ.getValue()).intValue() == 0) {
            return;
        }
        if (searchMixFeedList != null) {
            i = searchMixFeedList.cursor;
        } else {
            i = 0;
        }
        C49832Jh6.LIZIZ = i;
        if (searchMixFeedList != null && (globalDoodleConfig = searchMixFeedList.globalDoodleConfig) != null) {
            z2 = o.LJ(globalDoodleConfig.getEnableImageRecord(), Boolean.TRUE);
        }
        C49832Jh6.LIZ = z2;
        if (searchMixFeedList == null) {
            return;
        }
        C38995FSd.LIZJ().execute(new ARunnableS14S0110000_8(searchMixFeedList, z, 3));
    }

    public static void LJ(RecyclerView recyclerView, C8HS c8hs) {
        List data;
        C0A2 c0a2 = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        }
        if (c0a2 instanceof LinearLayoutManager) {
            int LLILLJJLI = ((LinearLayoutManager) c0a2).LLILLJJLI();
            if (c8hs == null || (data = c8hs.getData()) == null) {
                return;
            }
            if (LLILLJJLI < 0) {
                LLILLJJLI = 0;
            }
            int i = C49957Jj7.LIZ().prefetchCount + LLILLJJLI;
            if (i >= data.size()) {
                i = data.size() - 1;
            }
            int i2 = LIZJ;
            if (i2 != 0 && i2 < data.size()) {
                LIZJ = data.size();
                i++;
            }
            int i3 = LIZIZ;
            if (i <= i3) {
                return;
            }
            if (i3 != 0) {
                LLILLJJLI = i3;
            }
            RunnableC49454Jb0 runnableC49454Jb0 = new RunnableC49454Jb0(LLILLJJLI, i, data);
            LIZIZ = i;
            C38995FSd.LIZJ().execute(runnableC49454Jb0);
        }
    }
}
