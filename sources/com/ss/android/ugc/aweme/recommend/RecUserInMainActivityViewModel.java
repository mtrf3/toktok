package com.ss.android.ugc.aweme.recommend;

import X.C00F;
import X.C221108m2;
import X.C62822Ol8;
import X.C77266UUc;
import X.C78635Utb;
import X.C78636Utc;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;

/* loaded from: classes14.dex */
public final class RecUserInMainActivityViewModel extends ViewModel {
    public boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C78635Utb.LJLIL);
    public boolean LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final MutableLiveData<Boolean> LJLJJLL;
    public final MutableLiveData<Boolean> LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean iv0() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel.iv0():boolean");
    }

    public final C78636Utc gv0() {
        return (C78636Utc) this.LJLILLLLZI.getValue();
    }

    public RecUserInMainActivityViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LJLJJI = new MutableLiveData<>(bool);
        this.LJLJJL = new MutableLiveData<>(bool);
        this.LJLJJLL = new MutableLiveData<>(bool);
        this.LJLJL = new MutableLiveData<>(bool);
        this.LJLJLJ = "";
    }

    public static boolean hv0(int i) {
        OSZ<Boolean, Long> LIZ;
        ISocialFriendsService LJJIL = C77266UUc.LIZIZ.LJJIL();
        if (LJJIL != null && (LIZ = LJJIL.LIZ(i)) != null && LIZ.getFirst().booleanValue()) {
            if (System.currentTimeMillis() < (C00F.LIZ(31744, 3, "popup_alert_recommend_user_journey_day_interval", true) * 86400000) + LIZ.getSecond().longValue()) {
                return true;
            }
        }
        return false;
    }
}
