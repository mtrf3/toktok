package X;

import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.viewmodel.MultiProfilesViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AVD<I, O> implements C14Q {
    public final /* synthetic */ MultiProfilesViewModel LJLIL;

    public AVD(MultiProfilesViewModel multiProfilesViewModel) {
        this.LJLIL = multiProfilesViewModel;
    }

    @Override // X.C14Q
    public final Object apply(Object obj) {
        List profiles = (List) obj;
        MultiProfilesViewModel multiProfilesViewModel = this.LJLIL;
        o.LJIIIIZZ(profiles, "profiles");
        String LIZJ = this.LJLIL.LJLIL.LIZJ();
        multiProfilesViewModel.getClass();
        if (!profiles.isEmpty()) {
            Iterator it = profiles.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (o.LJ(((SignificantUserInfo) next).uid, LIZJ)) {
                    if (next != null) {
                        List LJJIJ = C47261Igj.LJJIJ(next);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : profiles) {
                            if (!o.LJ(((SignificantUserInfo) obj2).uid, LIZJ)) {
                                arrayList.add(obj2);
                            }
                        }
                        profiles = ORZ.LLIIIZ(arrayList, LJJIJ);
                    }
                }
            }
        }
        MultiAccountService.LJ().LIZ();
        if (profiles.size() < 8) {
            return ORZ.LLIIIZ(C47261Igj.LJJIJ(new SignificantUserInfo("-1", null, null, null, null, null, 0L, 126, null)), profiles);
        }
        return profiles;
    }
}
