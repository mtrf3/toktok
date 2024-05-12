package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui;

import X.AbstractC73946T0k;
import X.C4BK;
import X.C61878OQg;
import X.C71495S4d;
import X.C71497S4f;
import X.C71498S4g;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C77800Ug8;
import X.C80763Ey;
import X.EFJ;
import X.MDR;
import X.T16;
import Y.AfS64S0100000_12;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FavoriteVideoPickerViewModel extends ViewModel {
    public static final /* synthetic */ int LJLLJ = 0;
    public final FavoriteAwemeService LJLIL;
    public final AbstractC73946T0k LJLILLLLZI;
    public final AbstractC73946T0k LJLJI;
    public final User LJLJJI;
    public int LJLJJL;
    public final MutableLiveData<Boolean> LJLJJLL;
    public final MutableLiveData<List<Aweme>> LJLJL;
    public final MutableLiveData<C4BK> LJLJLJ;
    public final MutableLiveData<Aweme> LJLJLLL;
    public final MutableLiveData<MDR<Aweme>> LJLL;
    public final MutableLiveData<MDR<Aweme>> LJLLI;
    public final C73318Sq2 LJLLILLLL;

    public FavoriteVideoPickerViewModel() {
        FavoriteAwemeService.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        FavoriteAwemeService favoriteAwemeService = (FavoriteAwemeService) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, FavoriteAwemeService.class);
        AbstractC73946T0k LIZIZ = C73969T1h.LIZIZ();
        AbstractC73946T0k LIZ = T16.LIZ();
        o.LJIIIIZZ(LIZ, "io()");
        User LIZJ = C80763Ey.LIZJ();
        o.LJIIIZ(favoriteAwemeService, "favoriteAwemeService");
        this.LJLIL = favoriteAwemeService;
        this.LJLILLLLZI = LIZIZ;
        this.LJLJI = LIZ;
        this.LJLJJI = LIZJ;
        this.LJLJJLL = new MutableLiveData<>();
        MutableLiveData<List<Aweme>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(C61878OQg.INSTANCE);
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new MutableLiveData<>();
        this.LJLL = new MutableLiveData<>();
        this.LJLLI = new MutableLiveData<>();
        this.LJLLILLLL = new C73318Sq2();
    }

    public final void gv0() {
        String str;
        FavoriteAwemeService favoriteAwemeService = this.LJLIL;
        User user = this.LJLJJI;
        String str2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = this.LJLJJI;
        if (user2 != null) {
            str2 = user2.getSecUid();
        }
        this.LJLLILLLL.LIZ(favoriteAwemeService.getFavoriteAweme(30, str, str2, this.LJLJJL * 30).LJJIIJ(this.LJLJI).LJIJJ(this.LJLILLLLZI).LJIIL(new AfS64S0100000_12(this, 28)).LJJ(new C71497S4f(this)));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLLILLLL.LIZLLL();
    }

    public final void hv0(Aweme aweme) {
        int i;
        String str;
        String str2 = null;
        if (aweme != null) {
            this.LJLJLJ.setValue(new C4BK(aweme, C71495S4d.LIZIZ));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        FavoriteAwemeService favoriteAwemeService = this.LJLIL;
        List<Aweme> value = this.LJLJL.getValue();
        if (value != null) {
            i = value.size();
        } else {
            i = 30;
        }
        User user = this.LJLJJI;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        User user2 = this.LJLJJI;
        if (user2 != null) {
            str2 = user2.getSecUid();
        }
        this.LJLLILLLL.LIZ(favoriteAwemeService.getFavoriteAweme(i, str, str2, 0L).LJJIIJ(this.LJLJI).LJIJJ(this.LJLILLLLZI).LJJ(new C71498S4g(this)));
    }
}
