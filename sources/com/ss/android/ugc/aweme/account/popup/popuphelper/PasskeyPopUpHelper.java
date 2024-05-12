package com.ss.android.ugc.aweme.account.popup.popuphelper;

import X.ActivityC45651qj;
import X.C243869he;
import X.C58096Mr6;
import X.InterfaceC243879hf;
import X.ORZ;
import X.R41;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IPasskeyPopUpHelper;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.PasskeyFrequencySettingsModel;
import defpackage.l1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PasskeyPopUpHelper implements IPasskeyPopUpHelper {
    @Override // com.ss.android.ugc.aweme.IPasskeyPopUpHelper
    public final synchronized void LIZ() {
        PasskeyFrequency LJFF = LJFF();
        LJFF.doesUserExist = true;
        LJI(LJFF);
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyPopUpHelper
    public final synchronized boolean LIZIZ() {
        if (!PasskeyService.LJFF().LJ()) {
            return false;
        }
        if (!R41.LIZ().isLogin()) {
            return false;
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PasskeyFrequencySettingsModel passkeyFrequencySettingsModel = l1.LIZ;
        PasskeyFrequencySettingsModel passkeyFrequencySettingsModel2 = (PasskeyFrequencySettingsModel) LIZLLL.LJIIIIZZ("passkey_frequency_settings", PasskeyFrequencySettingsModel.class, passkeyFrequencySettingsModel);
        if (passkeyFrequencySettingsModel2 != null) {
            passkeyFrequencySettingsModel = passkeyFrequencySettingsModel2;
        }
        PasskeyFrequency LJFF = LJFF();
        long currentTimeMillis = System.currentTimeMillis();
        if (LJFF.doesUserExist) {
            return false;
        }
        if (passkeyFrequencySettingsModel.coolDown == Integer.MAX_VALUE) {
            return false;
        }
        if (LJFF.showTime.isEmpty()) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit.toDays(currentTimeMillis - ((Number) ORZ.LLFF(LJFF.showTime)).longValue()) < passkeyFrequencySettingsModel.coolDown) {
            return false;
        }
        if (LJFF.showTime.size() >= passkeyFrequencySettingsModel.impressions) {
            return false;
        }
        if (timeUnit.toDays(currentTimeMillis - ((Number) ORZ.LJLLJ(LJFF.showTime)).longValue()) >= passkeyFrequencySettingsModel.timeFrame) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyPopUpHelper
    public final synchronized int LIZLLL() {
        return LJFF().showTime.size();
    }

    public final synchronized PasskeyFrequency LJFF() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        String string = Keva.getRepo("passkey_keva_repo").getString(R41.LIZLLL(), GsonProtectorUtils.toJson(LIZ, new PasskeyFrequency(null, false, 3, null)));
        if (string == null) {
            return new PasskeyFrequency(null, false, 3, null);
        }
        try {
            Object LJI = LIZ.LJI(string, PasskeyFrequency.class);
            o.LJIIIIZZ(LJI, "gson.fromJson(str, PasskeyFrequency::class.java)");
            return (PasskeyFrequency) LJI;
        } catch (Exception unused) {
            return new PasskeyFrequency(null, false, 3, null);
        }
    }

    public final synchronized void LJII() {
        PasskeyFrequency LJFF = LJFF();
        LJFF.showTime.add(Long.valueOf(System.currentTimeMillis()));
        LJI(LJFF);
    }

    public static IPasskeyPopUpHelper LJ() {
        Object LIZ = C58096Mr6.LIZ(IPasskeyPopUpHelper.class, false);
        if (LIZ != null) {
            return (IPasskeyPopUpHelper) LIZ;
        }
        if (C58096Mr6.LJLJL == null) {
            synchronized (IPasskeyPopUpHelper.class) {
                if (C58096Mr6.LJLJL == null) {
                    C58096Mr6.LJLJL = new PasskeyPopUpHelper();
                }
            }
        }
        return C58096Mr6.LJLJL;
    }

    public final synchronized void LJI(PasskeyFrequency passkeyFrequency) {
        Keva.getRepo("passkey_keva_repo").storeString(R41.LIZLLL(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), passkeyFrequency));
    }

    @Override // com.ss.android.ugc.aweme.IPasskeyPopUpHelper
    public final synchronized void LIZJ(ActivityC45651qj activityC45651qj, InterfaceC243879hf interfaceC243879hf) {
        if (!LIZIZ()) {
            return;
        }
        if (activityC45651qj == null) {
            return;
        }
        LJII();
        PasskeyService.LJFF().LIZ(activityC45651qj, new C243869he(activityC45651qj, this, interfaceC243879hf), true);
    }
}
