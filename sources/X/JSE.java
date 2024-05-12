package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JSE {
    public final DynamicPatch LIZ;
    public WeakReference<InterfaceC48908JHk> LIZIZ;
    public List<SearchLiveStruct> LJ;
    public C46589IQf LJFF;
    public boolean LJI;
    public java.util.Map<Integer, List<Aweme>> LJIIIIZZ;
    public java.util.Map<Integer, List<java.util.Map<?, ?>>> LJIIIZ;
    public List<DynamicPatch.SearchMultiTabListData> LJIIJ;
    public final List<Integer> LIZJ = new ArrayList();
    public final int LIZLLL = -1;
    public String LJII = "";

    public JSE(DynamicPatch dynamicPatch) {
        this.LIZ = dynamicPatch;
    }

    public final List<Aweme> LIZ(int i) {
        java.util.Map<Integer, List<Aweme>> map = this.LJIIIIZZ;
        if (map != null) {
            return (List) ((HashMap) map).get(Integer.valueOf(i));
        }
        return null;
    }

    public final List<java.util.Map<?, ?>> LIZIZ(int i) {
        java.util.Map<Integer, List<java.util.Map<?, ?>>> map = this.LJIIIZ;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void LIZJ(int i, List<? extends Aweme> list, List<? extends java.util.Map<?, ?>> list2) {
        List<java.util.Map<?, ?>> list3;
        List<Aweme> list4;
        if (list == null || i < 0) {
            return;
        }
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = new HashMap();
        }
        java.util.Map<Integer, List<Aweme>> map = this.LJIIIIZZ;
        if (map != null && (list4 = map.get(Integer.valueOf(i))) != null && !list4.isEmpty()) {
            java.util.Map<Integer, List<Aweme>> map2 = this.LJIIIIZZ;
            o.LJI(map2);
            List<Aweme> list5 = map2.get(Integer.valueOf(i));
            o.LJI(list5);
            list5.addAll(list);
        } else {
            Integer valueOf = Integer.valueOf(i);
            java.util.Map<Integer, List<Aweme>> map3 = this.LJIIIIZZ;
            o.LJI(map3);
            map3.put(valueOf, C65777Prh.LIZIZ(list));
        }
        if (list2 == null) {
            return;
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        java.util.Map<Integer, List<java.util.Map<?, ?>>> map4 = this.LJIIIZ;
        if (map4 != null && (list3 = map4.get(Integer.valueOf(i))) != null && !list3.isEmpty()) {
            java.util.Map<Integer, List<java.util.Map<?, ?>>> map5 = this.LJIIIZ;
            o.LJI(map5);
            List<java.util.Map<?, ?>> list6 = map5.get(Integer.valueOf(i));
            o.LJI(list6);
            list6.addAll(list2);
            return;
        }
        Integer valueOf2 = Integer.valueOf(i);
        java.util.Map<Integer, List<java.util.Map<?, ?>>> map6 = this.LJIIIZ;
        o.LJI(map6);
        map6.put(valueOf2, C65777Prh.LIZIZ(list2));
    }
}
