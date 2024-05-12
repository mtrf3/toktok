package X;

import com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import com.ss.android.ugc.aweme.music.model.RelatedAweme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8B8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8B8 {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, C8BC.LJLIL);
    public static volatile boolean LIZIZ;

    public static HashMap LIZ() {
        return (HashMap) LIZ.getValue();
    }

    public static void LIZIZ(List list) {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C8B3.LIZ.LIZIZ(1, 1, list).LJJL(T16.LIZ()).LJJJ(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.8B7
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                List<? extends RelatedAweme> list2;
                ExploreRelatedAwemeList exploreRelatedAwemeList = (ExploreRelatedAwemeList) obj;
                C8B8.LIZIZ = false;
                if (exploreRelatedAwemeList != null && (list2 = exploreRelatedAwemeList.relatedAwemes) != null) {
                    for (RelatedAweme relatedAweme : list2) {
                        List<Aweme> list3 = relatedAweme.awemeList;
                        if (list3 != null) {
                            Iterator<Aweme> it = list3.iterator();
                            while (it.hasNext()) {
                                it.next().setExploreClientExtra(new ExploreClientExtra(1, null, 2, null));
                            }
                            HashMap LIZ2 = C8B8.LIZ();
                            String str = relatedAweme.relatedAid;
                            o.LJIIIIZZ(str, "relatedAweme.relatedAid");
                            LIZ2.put(str, list3);
                        }
                    }
                }
            }
        }, new InterfaceC64592gB() { // from class: X.8BA
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C8B8.LIZIZ = false;
            }
        });
    }
}
