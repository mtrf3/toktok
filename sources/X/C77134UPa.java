package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformAccessInfo;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import defpackage.i0;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.UPa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77134UPa implements UQ5 {
    public static final C77134UPa LIZ = new C77134UPa();
    public static final XJO LIZIZ = XJR.LIZ();

    public static Keva LJIILJJIL() {
        Keva repo = Keva.getRepo("tiktok_ufr_cache:facebook");
        o.LJIIIIZZ(repo, "getRepo(TIKTOK_UFR_CACHE + PLATFORM)");
        return repo;
    }

    @Override // X.UQ5
    public final boolean LJIIJJI() {
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        Integer LIZLLL = c77266UUc.LJIIJ().LIZLLL();
        if (LIZLLL == null) {
            return true;
        }
        int intValue = LIZLLL.intValue();
        SocialPlatformTokenStatus socialPlatformTokenStatus = SocialPlatformTokenStatus.STATUS_VALID;
        if (intValue != socialPlatformTokenStatus.getValue()) {
            c77266UUc.LJIIJ().LJIILIIL(socialPlatformTokenStatus);
            return true;
        }
        return false;
    }

    @Override // X.UQ5
    public final boolean LIZIZ() {
        List<SocialPlatformSetting> socialPlatformSettings = HG3.LJIILL().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    return socialPlatformSetting.getSyncStatus();
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.UQ5
    public final boolean LIZJ() {
        if (LIZIZ() && LJ()) {
            return true;
        }
        return false;
    }

    @Override // X.UQ5
    public final Integer LIZLLL() {
        List<SocialPlatformSetting> socialPlatformSettings = HG3.LJIILL().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings == null) {
            return null;
        }
        while (true) {
            Integer num = null;
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    SocialPlatformAccessInfo accessInfo = socialPlatformSetting.getAccessInfo();
                    if (accessInfo != null) {
                        num = accessInfo.getTokenStatus();
                    }
                }
            }
            return num;
        }
    }

    @Override // X.UQ5
    public final boolean LJ() {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        Integer LIZLLL = LIZLLL();
        int value = SocialPlatformTokenStatus.STATUS_UNKNOWN.getValue();
        if (LIZLLL == null || LIZLLL.intValue() != value) {
            SocialPlatformTokenStatus socialPlatformTokenStatus = SocialPlatformTokenStatus.STATUS_VALID;
            int value2 = socialPlatformTokenStatus.getValue();
            if (LIZLLL == null || LIZLLL.intValue() != value2) {
                int value3 = SocialPlatformTokenStatus.STATUS_INVALID.getValue();
                if (LIZLLL == null || LIZLLL.intValue() != value3) {
                    if (LJI(curUserId).length() > 0) {
                        return true;
                    }
                }
            }
            int value4 = socialPlatformTokenStatus.getValue();
            if (LIZLLL != null && LIZLLL.intValue() == value4) {
                return true;
            }
        } else {
            o.LJIIIIZZ(curUserId, "curUserId");
            if (LJI(curUserId).length() > 0 && LIZIZ()) {
                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C238519Xr(null), 2);
            }
            if (LJI(curUserId).length() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.UQ5
    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJIILJJIL().erase(str);
        Keva LJIILJJIL = LJIILJJIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("expiry_date_in_millis");
        LJIILJJIL.erase(X1D.LIZIZ(LIZ2));
    }

    @Override // X.UQ5
    public final void LJFF(boolean z) {
        IAccountUserService LJIILL = HG3.LJIILL();
        List<SocialPlatformSetting> socialPlatformSettings = LJIILL.getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    socialPlatformSetting.setSyncStatus(z);
                    LJIILL.forceSave();
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // X.UQ5
    public final String LJI(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        float currentTimeMillis = ((float) System.currentTimeMillis()) / 1000.0f;
        long LIZIZ2 = C78580Usi.LIZIZ(str, "expiry_date_in_millis", LJIILJJIL(), -1L);
        if (currentTimeMillis > 0.0f) {
            if (((float) LIZIZ2) > currentTimeMillis) {
                str2 = LJIILJJIL().getString(str, "");
            }
            o.LJIIIIZZ(str2, "{\n                if (ex…          }\n            }");
        }
        return str2;
    }

    @Override // X.UQ5
    public final long LJIIIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        return C78580Usi.LIZIZ(str, "facebook_upload_timer", LJIILJJIL(), -1L);
    }

    @Override // X.UQ5
    public final long LJIIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        return C78580Usi.LIZIZ(str, "expiry_date_in_millis", LJIILJJIL(), -1L);
    }

    @Override // X.UQ5
    public final Boolean LJIIL(String str) {
        boolean z;
        boolean z2 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        float currentTimeMillis = ((float) System.currentTimeMillis()) / 1000.0f;
        long LIZIZ2 = C78580Usi.LIZIZ(str, "expiry_date_in_millis", LJIILJJIL(), -1L);
        if (LIZIZ2 == -1) {
            return Boolean.FALSE;
        }
        if (currentTimeMillis <= 0.0f) {
            return null;
        }
        if (currentTimeMillis < ((float) LIZIZ2)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // X.UQ5
    public final void LJIILIIL(SocialPlatformTokenStatus tokenStatus) {
        o.LJIIIZ(tokenStatus, "tokenStatus");
        RBX rbx = (RBX) HG3.LJIILL();
        List<SocialPlatformSetting> socialPlatformSettings = rbx.getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    SocialPlatformAccessInfo accessInfo = socialPlatformSetting.getAccessInfo();
                    if (accessInfo != null) {
                        accessInfo.setTokenStatus(Integer.valueOf(tokenStatus.getValue()));
                    }
                    rbx.forceSave();
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // X.UQ5
    public final void LJIIIIZZ(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Keva LJIILJJIL = LJIILJJIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("facebook_upload_timer");
        LJIILJJIL.storeLong(X1D.LIZIZ(LIZ2), j);
    }

    @Override // X.UQ5
    public final void LJII(long j, String str, String token) {
        o.LJIIIZ(token, "token");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJIILJJIL().storeString(str, token);
        LJIILJJIL().storeLong(i0.LJFF(str, "expiry_date_in_millis"), j / 1000);
    }
}
