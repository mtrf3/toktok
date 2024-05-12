package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JT6 implements InterfaceC49318JXe<FollowStatus> {
    public static final WeakHashMap<Object, ContinuousLoadingAwemeList> LIZIZ = new WeakHashMap<>();
    public final JT7 LIZ;

    @Override // X.InterfaceC49318JXe
    public final Class<FollowStatus> LIZ() {
        return FollowStatus.class;
    }

    public final ContinuousLoadingAwemeList LIZJ() {
        List<Aweme> arrayList;
        Object LJJIII = this.LIZ.LJJIII();
        if (LJJIII == null) {
            return null;
        }
        WeakHashMap<Object, ContinuousLoadingAwemeList> weakHashMap = LIZIZ;
        ContinuousLoadingAwemeList continuousLoadingAwemeList = weakHashMap.get(LJJIII);
        if (continuousLoadingAwemeList == null) {
            List<Aweme> awemeList = this.LIZ.getAwemeList();
            if (awemeList != null) {
                arrayList = ORZ.LLJILJILJ(awemeList);
            } else {
                arrayList = new ArrayList<>();
            }
            ContinuousLoadingAwemeList continuousLoadingAwemeList2 = new ContinuousLoadingAwemeList();
            continuousLoadingAwemeList2.awemeList = arrayList;
            continuousLoadingAwemeList2.cursor = arrayList.size();
            continuousLoadingAwemeList2.hasMore = 1;
            weakHashMap.put(LJJIII, continuousLoadingAwemeList2);
            return continuousLoadingAwemeList2;
        }
        return continuousLoadingAwemeList;
    }

    public JT6(JT7 instanceHolder) {
        o.LJIIIZ(instanceHolder, "instanceHolder");
        this.LIZ = instanceHolder;
        C49314JXa.LIZJ.LIZ(this);
    }

    @Override // X.InterfaceC49318JXe
    public final void LIZIZ(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        o.LJIIIZ(followStatus2, "followStatus");
        Iterator<Map.Entry<Object, ContinuousLoadingAwemeList>> it = LIZIZ.entrySet().iterator();
        while (it.hasNext()) {
            List<Aweme> list = it.next().getValue().awemeList;
            if (list != null) {
                Iterator<Aweme> it2 = list.iterator();
                while (it2.hasNext()) {
                    User author = it2.next().getAuthor();
                    if (author != null && o.LJ(followStatus2.userId, author.getUid())) {
                        author.setFollowStatus(followStatus2.followStatus);
                    }
                }
            }
        }
    }

    public final List LIZLLL(Aweme aweme, List list) {
        int i;
        int i2;
        Iterator it = list.iterator();
        int i3 = -1;
        int i4 = 0;
        while (true) {
            List<Aweme> list2 = null;
            if (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    if (o.LJ(aweme.getAid(), ((Aweme) next).getAid())) {
                        i3 = i4;
                    }
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                int i6 = i3 + 1;
                JT7 jt7 = this.LIZ;
                if (jt7 != null) {
                    i = jt7.LJFF();
                } else {
                    i = 10;
                }
                if (i6 >= i) {
                    i2 = i6 - i;
                } else {
                    if (list.size() < i) {
                        i = list.size();
                    }
                    i6 = i;
                    i2 = 0;
                }
                JT7 jt72 = this.LIZ;
                if (jt72 != null) {
                    list2 = jt72.LJI();
                }
                List LLJILJILJ = ORZ.LLJILJILJ(list.subList(i2, i6));
                if (list2 != null && list2.size() > 0) {
                    ((ArrayList) LLJILJILJ).addAll(0, list2);
                }
                return LLJILJILJ;
            }
        }
    }

    public final void LJFF(C50420Jqa event, Aweme aweme, InterfaceC88471Ynr<? super Aweme, ? super List<Aweme>, C76800UCe> interfaceC88471Ynr) {
        ContinuousLoadingAwemeList LIZJ;
        List<Aweme> list;
        List LIZLLL;
        o.LJIIIZ(event, "event");
        if ((o.LJ(event.LJLJJI, "from_search_continuous_loading_card") || o.LJ(event.LJLJJI, "from_search_continuous_play_card")) && (LIZJ = LIZJ()) != null && (list = LIZJ.awemeList) != null) {
            if (this.LIZ.LIZ(aweme)) {
                LIZLLL = null;
            } else {
                LIZLLL = LIZLLL(aweme, list);
            }
            interfaceC88471Ynr.invoke(aweme, LIZLLL);
        }
    }

    public final void LJ(Context context, Bundle bundle, C49183JRz c49183JRz, View view) {
        int i;
        long j;
        JIB LJIIJ;
        Fragment LIZ;
        Aweme aweme;
        ContinuousLoadingAwemeList LIZJ = LIZJ();
        if (LIZJ == null) {
            return;
        }
        List<Aweme> list = LIZJ.awemeList;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        c49183JRz.LIZLLL = i;
        List<Aweme> list2 = LIZJ.awemeList;
        if (list2 != null && (aweme = (Aweme) ORZ.LLFII(list2)) != null) {
            j = aweme.getCreateTime();
        } else {
            j = 0;
        }
        c49183JRz.LJFF = j;
        JT1 jt1 = new JT1();
        if (view != null && (LJIIJ = C1DF.LJIIJ(view)) != null && (LIZ = LJIIJ.LIZ()) != null) {
            String LJFF = C49603JdP.LJFF(LIZ);
            if (LJFF == null) {
                LJFF = CardStruct.IStatusCode.DEFAULT;
            }
            String string = bundle.getString("id");
            jt1.LJLJI = LJFF;
            jt1.LJLJJI = string;
        }
        jt1.LJIILJJIL(LIZJ);
        jt1.LJIIL().LIZ(c49183JRz);
        C55457Lpd.LJLJJLL = jt1;
        if (c49183JRz.LJI) {
            bundle.putString("video_from", "from_search_continuous_play_card");
        } else {
            bundle.putString("video_from", "from_search_continuous_loading_card");
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//aweme/detail");
        buildRoute.withParam(bundle);
        buildRoute.open();
    }
}
