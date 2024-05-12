package com.ss.android.ugc.aweme.user.viewmodel;

import X.AVE;
import X.RBW;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MultiProfilesViewModel extends ViewModel {
    public final RBW LJLIL;
    public final LiveData<List<SignificantUserInfo>> LJLILLLLZI;

    public MultiProfilesViewModel() {
        RBW rbw = RBW.LJLLI;
        this.LJLIL = rbw;
        rbw.getClass();
        LiveData<List<SignificantUserInfo>> map = Transformations.map(UserStore.LJII, AVE.LJLIL);
        o.LJIIIIZZ(map, "map(UserManager.inst().g…rInfoUser(it) }\n        }");
        this.LJLILLLLZI = map;
    }
}
