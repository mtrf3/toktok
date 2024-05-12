package X;

import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JjK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49970JjK implements InterfaceC49992Jjg {
    public final JVO LIZ;

    public C49970JjK(JVS jvs) {
        this.LIZ = jvs;
    }

    @Override // X.InterfaceC49295JWh
    public final AbstractC49294JWg LJ(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return C49990Jje.LIZ(this, videoEvent);
    }

    @Override // X.InterfaceC49992Jjg
    public final AbstractC49294JWg LIZ(int i, Aweme aweme) {
        return C49989Jjd.LIZ(i, aweme);
    }

    @Override // X.InterfaceC49991Jjf
    public final boolean LIZIZ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return true;
    }

    @Override // X.InterfaceC49992Jjg
    public final int LIZJ(C50420Jqa videoEvent, Aweme aweme) {
        JVO jvo;
        List<T> list;
        List<T> list2;
        SearchMixFeed searchMixFeed;
        List<SearchUser> list3;
        List<Aweme> fullAwemeList;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(videoEvent, "videoEvent");
        if (videoEvent.LJLJLJ != 65458 || (list = (jvo = this.LIZ).mmItems) == 0) {
            return -1;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((AbstractC49325JXl) it.next()).getFeedType() == 65458) {
                if (i < 0 || (list2 = jvo.mmItems) == 0 || (searchMixFeed = (SearchMixFeed) ORZ.LJLLLLLL(i, list2)) == null || (list3 = searchMixFeed.users) == null) {
                    return -1;
                }
                for (SearchUser searchUser : list3) {
                    if (searchUser != null && (fullAwemeList = searchUser.getFullAwemeList()) != null) {
                        for (Aweme aweme2 : fullAwemeList) {
                            if (aweme2 != null && o.LJ(aweme2.getAid(), aweme.getAid())) {
                                return i;
                            }
                        }
                    }
                }
                return -1;
            }
            i++;
        }
        return -1;
    }

    @Override // X.InterfaceC49991Jjf
    public final AbstractC49294JWg LIZLLL(C50420Jqa c50420Jqa, Aweme aweme) {
        return C49989Jjd.LIZIZ(c50420Jqa, aweme, this);
    }
}
