package com.ss.android.ugc.aweme.account.popup.popuphelper;

import X.ActivityC45651qj;
import X.C40451FuB;
import X.C58096Mr6;
import X.C61878OQg;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.R41;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.account.api.UserSettingsApi;
import com.ss.android.ugc.aweme.account.api.UserSettingsResponse;
import com.ss.android.ugc.aweme.account.popup.SyncNicknameAndUsernamePopTask;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.SyncNicknameUsernameFrequencyControlModel;
import defpackage.y1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SyncNicknameAndUsernamePopUpHelper implements ISyncNicknameAndUsernamePopUpHelper {
    public static UserSettingsResponse.UserSettingsData LIZLLL;
    public int LIZ;
    public String LIZIZ = "";
    public final int LIZJ = 3;

    @Override // com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper
    public final synchronized void LIZ() {
        LJII(SyncNicknameAndUsernameFrequency.L(LJFF(), 0L, null, true, 3));
    }

    @Override // com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper
    public final synchronized boolean LIZIZ() {
        SyncNicknameUsernameFrequencyControlModel syncNicknameUsernameFrequencyControlModel;
        if (!R41.LIZ().isLogin()) {
            return false;
        }
        if (!o.LJ(this.LIZIZ, R41.LIZLLL())) {
            this.LIZIZ = R41.LIZLLL();
            this.LIZ = 0;
            LIZLLL = null;
        }
        try {
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            syncNicknameUsernameFrequencyControlModel = y1.LIZ;
            SyncNicknameUsernameFrequencyControlModel syncNicknameUsernameFrequencyControlModel2 = (SyncNicknameUsernameFrequencyControlModel) LIZLLL2.LJIIIIZZ("sync_nickname_username_frequency_control", SyncNicknameUsernameFrequencyControlModel.class, syncNicknameUsernameFrequencyControlModel);
            if (syncNicknameUsernameFrequencyControlModel2 != null) {
                syncNicknameUsernameFrequencyControlModel = syncNicknameUsernameFrequencyControlModel2;
            }
        } catch (Throwable unused) {
            syncNicknameUsernameFrequencyControlModel = y1.LIZ;
        }
        SyncNicknameAndUsernameFrequency LJFF = LJFF();
        long currentTimeMillis = System.currentTimeMillis();
        if (LJFF.isUpdated) {
            return false;
        }
        long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis - LJFF.lastApiTime);
        if (this.LIZ == 0 && LJFF.lastApiTime != -1 && days < syncNicknameUsernameFrequencyControlModel.apiInterval) {
            return false;
        }
        for (String key : syncNicknameUsernameFrequencyControlModel.popUpFrequency.LJJIZ()) {
            try {
                o.LJIIIIZZ(key, "key");
                int parseInt = CastIntegerProtector.parseInt(key);
                int LJIILJJIL = syncNicknameUsernameFrequencyControlModel.popUpFrequency.LJJIJ(key).LJIILJJIL();
                if (LJFF.showTime.size() >= LJIILJJIL) {
                    List<Long> list = LJFF.showTime;
                    if (TimeUnit.MILLISECONDS.toDays(currentTimeMillis - ((Number) ListProtector.get(list, list.size() - LJIILJJIL)).longValue()) < parseInt) {
                        return false;
                    }
                } else {
                    continue;
                }
            } catch (ClassCastException | NumberFormatException unused2) {
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper
    public final synchronized void LIZJ() {
        SyncNicknameAndUsernameFrequency LJFF = LJFF();
        List LLJILJILJ = ORZ.LLJILJILJ(LJFF.showTime);
        ((ArrayList) LLJILJILJ).add(Long.valueOf(System.currentTimeMillis()));
        LJII(SyncNicknameAndUsernameFrequency.L(LJFF, 0L, LLJILJILJ, false, 5));
    }

    public final synchronized SyncNicknameAndUsernameFrequency LJFF() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        Keva repo = Keva.getRepo("sync_username_nickname_keva_repo");
        String LIZLLL2 = R41.LIZLLL();
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        String string = repo.getString(LIZLLL2, GsonProtectorUtils.toJson(LIZ, new SyncNicknameAndUsernameFrequency(-1L, c61878OQg, false)));
        if (string == null) {
            return new SyncNicknameAndUsernameFrequency(-1L, c61878OQg, false);
        }
        try {
            Object LJI = LIZ.LJI(string, SyncNicknameAndUsernameFrequency.class);
            o.LJIIIIZZ(LJI, "gson.fromJson(str, SyncN…ameFrequency::class.java)");
            return (SyncNicknameAndUsernameFrequency) LJI;
        } catch (Exception unused) {
            return new SyncNicknameAndUsernameFrequency(-1L, C61878OQg.INSTANCE, false);
        }
    }

    public static ISyncNicknameAndUsernamePopUpHelper LJ() {
        Object LIZ = C58096Mr6.LIZ(ISyncNicknameAndUsernamePopUpHelper.class, false);
        if (LIZ != null) {
            return (ISyncNicknameAndUsernamePopUpHelper) LIZ;
        }
        if (C58096Mr6.LJLJLJ == null) {
            synchronized (ISyncNicknameAndUsernamePopUpHelper.class) {
                if (C58096Mr6.LJLJLJ == null) {
                    C58096Mr6.LJLJLJ = new SyncNicknameAndUsernamePopUpHelper();
                }
            }
        }
        return C58096Mr6.LJLJLJ;
    }

    public final synchronized void LJII(SyncNicknameAndUsernameFrequency syncNicknameAndUsernameFrequency) {
        Keva.getRepo("sync_username_nickname_keva_repo").storeString(R41.LIZLLL(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), syncNicknameAndUsernameFrequency));
    }

    public final synchronized void LJI(ActivityC45651qj activityC45651qj, Fragment fragment) {
        ViewGroup viewGroup;
        this.LIZ = (this.LIZ + 1) % this.LIZJ;
        View view = fragment.getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        PopupManager.LJIIL(new SyncNicknameAndUsernamePopTask(activityC45651qj, fragment, viewGroup));
    }

    @Override // com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper
    public final synchronized void LIZLLL(ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC65784Pro<C76800UCe> noShowDialog) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(noShowDialog, "noShowDialog");
        if (!LIZIZ()) {
            return;
        }
        SyncNicknameAndUsernameFrequency LJFF = LJFF();
        long currentTimeMillis = System.currentTimeMillis();
        UserSettingsResponse.UserSettingsData userSettingsData = LIZLLL;
        if (userSettingsData != null && this.LIZ != 0) {
            LJI(activityC45651qj, fragment);
            return;
        }
        if (this.LIZ == 0 || userSettingsData == null) {
            LJII(SyncNicknameAndUsernameFrequency.L(LJFF, currentTimeMillis, null, false, 6));
            UserSettingsApi.LIZ(2, null).LIZLLL(new C40451FuB(noShowDialog, this, activityC45651qj, fragment));
        }
    }
}
