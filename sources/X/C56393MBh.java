package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.trending.ui.detailpage.ContentAssem;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS4S1102000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MBh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56393MBh implements C0C3 {
    public int LJLIL = -1;
    public final /* synthetic */ ContentAssem LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C56393MBh(ContentAssem contentAssem) {
        this.LJLILLLLZI = contentAssem;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        int i2;
        int i3;
        List list;
        List list2;
        if (i != this.LJLIL) {
            TrendingDetailOperatorWrapper v3 = this.LJLILLLLZI.v3();
            Aweme aweme = ((MBM) this.LJLILLLLZI.LJLILLLLZI.getValue()).getAweme();
            String str2 = null;
            if (aweme != null) {
                str = aweme.getTrendingId();
            } else {
                str = null;
            }
            Aweme aweme2 = ((MBM) this.LJLILLLLZI.LJLILLLLZI.getValue()).getAweme();
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            }
            java.util.Map<String, List<String>> map = v3.LJLJJL;
            int i4 = 0;
            if (map != null && (list2 = (List) ((LinkedHashMap) map).get(str)) != null) {
                i2 = list2.indexOf(str2);
            } else {
                i2 = 0;
            }
            int i5 = i2 + 1;
            java.util.Map<String, List<String>> map2 = v3.LJLJJL;
            if (map2 != null && (list = (List) ((LinkedHashMap) map2).get(str)) != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
            if (C56424MCm.LIZ()) {
                List<TrendingEventModel> list3 = v3.LJLZ;
                if (list3 != null) {
                    Iterator<TrendingEventModel> it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        TrendingEventModel next = it.next();
                        if (o.LJ(next.getEventId(), str)) {
                            if (next != null) {
                                v3.LJZ.add(next);
                            }
                        }
                    }
                }
                int size = v3.LJZ.size();
                List<TrendingEventModel> list4 = v3.LJLZ;
                if (list4 != null) {
                    i4 = list4.size();
                }
                if (size >= i4) {
                    v3.LJZ.clear();
                }
            }
            v3.withState(new AqS4S1102000_9(v3, str, i3, i5, 1));
            this.LJLIL = i;
        }
    }
}
