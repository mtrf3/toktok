package X;

import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.search.pages.result.common.searchrelation.core.ui.SearchRelationUserAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JlL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50095JlL implements InterfaceC57917MoD {
    public final /* synthetic */ SearchRelationUserAssem LJLIL;

    public C50095JlL(SearchRelationUserAssem searchRelationUserAssem) {
        this.LJLIL = searchRelationUserAssem;
    }

    @Override // X.InterfaceC57917MoD
    public final List LIZLLL(List data, boolean z) {
        List<? extends SearchUser> list;
        String str;
        User user;
        o.LJIIIZ(data, "data");
        SearchRelationUserAssem searchRelationUserAssem = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            Object obj2 = (InterfaceC57927MoN) obj;
            if (obj2 instanceof RecUser) {
                C49331JXr c49331JXr = searchRelationUserAssem.LLFFF;
                if (c49331JXr != null && (list = c49331JXr.LJLJI) != null && !list.isEmpty()) {
                    for (SearchUser searchUser : list) {
                        if (searchUser != null && (user = searchUser.user) != null) {
                            str = user.getUid();
                        } else {
                            str = null;
                        }
                        if (o.LJ(str, ((User) obj2).getUid())) {
                            break;
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
