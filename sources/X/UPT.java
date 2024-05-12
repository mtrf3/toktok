package X;

import Y.IDuS316S0100000_4;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UPT {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        return curUser.getSocialData().getEnablePermissionPopup();
    }

    public static InterfaceC58710N2k LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new C58435MwZ();
                }
                return new C77139UPf();
            }
            return new UPY();
        }
        return new UPX();
    }

    public static C73454SsE LIZJ(EnumC58085Mqv apiScene) {
        o.LJIIIZ(apiScene, "apiScene");
        return AbstractC73672Svk.LJIIJ(new IDuS316S0100000_4(apiScene, 1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    public static int LIZLLL(int i) {
        List<SocialPlatformSetting> socialPlatformSettings;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        SocialDataStruct socialData = curUser.getSocialData();
        if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == i) {
                    return socialPlatformSetting.getOnBoardingRecStrategy();
                }
            }
        }
        return 0;
    }

    public static boolean LJFF(int i) {
        boolean z = C53814LAc.LIZ().LIZ.getBoolean(KMP.LJ("go_through_social_recommend_flow", i), false);
        long j = C53814LAc.LIZ().LIZ.getLong(KMP.LJ("go_through_time_ms", i), -1L);
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = 30;
            try {
                SettingsManager.LIZLLL().getClass();
                i2 = SettingsManager.LJ("period_social_recommend_flow", 30);
            } catch (Throwable unused) {
            }
            if (currentTimeMillis <= (i2 * 86400000) + j) {
                return false;
            }
        }
        return true;
    }

    public static C73454SsE LJII(boolean z) {
        int i;
        C77134UPa c77134UPa = C77134UPa.LIZ;
        UQ4.LIZLLL("login_onboarding", "user", "facebook", "login", "uid", "auto", c77134UPa.LIZLLL(), null, 320);
        if (((RBX) HG3.LJIILL()).isNewUser()) {
            i = 2;
        } else {
            i = 3;
        }
        c77134UPa.LJFF(true);
        FriendApi.LIZ.getClass();
        return C57126MbS.LIZ().syncSocialRelationStatusInRx(2, Boolean.TRUE, Boolean.FALSE, false).LJJIII(new UPV(i), false).LJIJJLI(new C63801P2f(z)).LJIJJ(UPU.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    public static C73454SsE LJIIIIZZ(final int i) {
        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.9Ts
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<List<Integer>> interfaceC73573Su9) {
                XKX.LJ(MBB.INSTANCE, new C237479Tr(i, interfaceC73573Su9, null));
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    public static AbstractC73672Svk LJIIIZ(boolean z) {
        C73454SsE LJII;
        EnumC58085Mqv enumC58085Mqv;
        int i;
        if (z) {
            if (((RBX) HG3.LJIILL()).isNewUser()) {
                i = 2;
            } else {
                i = 3;
            }
            LJII = LJIIIIZZ(i);
        } else {
            LJII = LJII(false);
        }
        if (((RBX) HG3.LJIILL()).isNewUser()) {
            enumC58085Mqv = EnumC58085Mqv.SIGN_UP;
        } else {
            enumC58085Mqv = EnumC58085Mqv.LOGIN;
        }
        return AbstractC73672Svk.LJJLL(LJII, LIZJ(enumC58085Mqv), C77131UOx.LJLIL);
    }

    public static void LJ(int i, int i2) {
        C53814LAc.LIZ().LIZ(i, i2);
    }

    public static AbstractC73672Svk LJI(List socialPlatformList, boolean z) {
        EnumC58085Mqv enumC58085Mqv;
        o.LJIIIZ(socialPlatformList, "socialPlatformList");
        int i = 2;
        if (z) {
            if (socialPlatformList.size() > 1) {
                return LJIIIZ(true);
            }
            int intValue = ((Number) ORZ.LJLLJ(socialPlatformList)).intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.8cR
                        @Override // X.InterfaceC86003Zc
                        public final void subscribe(InterfaceC73573Su9<List<Integer>> interfaceC73573Su9) {
                            interfaceC73573Su9.onError(new Exception("social platform not support!"));
                        }
                    });
                }
                if (!((RBX) HG3.LJIILL()).isNewUser()) {
                    i = 3;
                }
                return LJIIIIZZ(i);
            }
            if (((RBX) HG3.LJIILL()).isNewUser()) {
                enumC58085Mqv = EnumC58085Mqv.SIGN_UP;
            } else {
                enumC58085Mqv = EnumC58085Mqv.LOGIN;
            }
            return LIZJ(enumC58085Mqv);
        }
        if (socialPlatformList.size() > 1) {
            return LJIIIZ(false);
        }
        int intValue2 = ((Number) ORZ.LJLLJ(socialPlatformList)).intValue();
        if (intValue2 != 1) {
            if (intValue2 != 2) {
                return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.8cS
                    @Override // X.InterfaceC86003Zc
                    public final void subscribe(InterfaceC73573Su9<List<Integer>> interfaceC73573Su9) {
                        interfaceC73573Su9.onError(new Exception("social platform not support!"));
                    }
                });
            }
            return LJII(true);
        }
        UPZ.LIZ.LJFF(true);
        FriendApi.LIZ.getClass();
        return C57126MbS.LIZ().syncSocialRelationStatusInRx(1, Boolean.TRUE, Boolean.FALSE, false).LJJIII(AYU.LJLIL, false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }
}
