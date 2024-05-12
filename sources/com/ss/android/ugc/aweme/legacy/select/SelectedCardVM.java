package com.ss.android.ugc.aweme.legacy.select;

import X.C36636EZk;
import X.C48841JEv;
import X.C60741Nsf;
import X.C64962gm;
import X.C80663Eo;
import X.T2R;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SelectedCardVM extends ViewModel {
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public boolean LJLJI;
    public final C60741Nsf LJLJJI;
    public final C64962gm LJLJJL;
    public final IUserService LJLJJLL;
    public final NextLiveData<List<C80663Eo>> LJLJL;
    public final NextLiveData LJLJLJ;
    public final NextLiveData<Integer> LJLJLLL;
    public final NextLiveData LJLL;
    public final NextLiveData<List<IMUser>> LJLLI;
    public final NextLiveData LJLLILLLL;
    public final NextLiveData<Boolean> LJLLJ;
    public final NextLiveData LJLLL;
    public final Set<String> LJLLLL;

    public SelectedCardVM() {
        C60741Nsf LJIIJJI = T2R.LJIIJJI();
        this.LJLJJI = LJIIJJI;
        this.LJLJJL = C48841JEv.LIZ(C36636EZk.LIZ.plus(LJIIJJI));
        this.LJLJJLL = UserService.LIZ();
        NextLiveData<List<C80663Eo>> nextLiveData = new NextLiveData<>();
        this.LJLJL = nextLiveData;
        this.LJLJLJ = nextLiveData;
        NextLiveData<Integer> nextLiveData2 = new NextLiveData<>();
        this.LJLJLLL = nextLiveData2;
        this.LJLL = nextLiveData2;
        NextLiveData<List<IMUser>> nextLiveData3 = new NextLiveData<>();
        this.LJLLI = nextLiveData3;
        this.LJLLILLLL = nextLiveData3;
        NextLiveData<Boolean> nextLiveData4 = new NextLiveData<>();
        this.LJLLJ = nextLiveData4;
        this.LJLLL = nextLiveData4;
        this.LJLLLL = new LinkedHashSet();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJJI.LIZIZ(null);
    }

    public final void gv0(User user) {
        IUserService iUserService = this.LJLJJLL;
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        int i = 1;
        if (user.getFollowStatus() >= 1) {
            i = 0;
        }
        String secUid = user.getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        FollowStatus LJIIIIZZ = iUserService.LJIIIIZZ(i, uid, secUid);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.checkValid();
            return;
        }
        throw new IllegalStateException("follow result is illegal");
    }
}
