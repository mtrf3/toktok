package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92343jq {
    public static final C92343jq LIZ = new C92343jq();
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.NONE, C3GE.LJLIL);
    public static final boolean LIZJ = TextUtils.equals(EF7.LJIILIIL, "local_test");
    public static Keva LIZLLL;

    public final synchronized Keva LIZIZ() {
        Keva keva;
        keva = LIZLLL;
        if (keva == null) {
            keva = KevaImpl.getRepo("everyone_popup_repo", 1);
            LIZLLL = keva;
            o.LJIIIIZZ(keva, "getRepo(KEVA_REPO, KevaC…OCESS).also { repo = it }");
        }
        return keva;
    }

    public final boolean LIZ(String enterFrom) {
        PrivacySettingsRestrictionItem LIZJ2;
        List<PrivacySettingsRestrictionOption> values;
        PrivacyUserSettingsV2 privacyUserSettings;
        int i;
        int i2;
        Integer M;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C00F.LIZ(31744, 0, "im_everyone_popup", true) == 10) {
            return true;
        }
        if (C00F.LIZ(31744, 0, "im_everyone_popup", true) > 0 && (LIZJ2 = PrivacyServiceImpl.LJIIIIZZ().LIZJ(0, "chatsets")) != null && (values = LIZJ2.getValues()) != null) {
            Iterator<PrivacySettingsRestrictionOption> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PrivacySettingsRestrictionOption next = it.next();
                PrivacySettingsRestrictionOption privacySettingsRestrictionOption = next;
                if (privacySettingsRestrictionOption.getValue() == 1 && privacySettingsRestrictionOption.getShowType() == 0) {
                    if (next != null && (((privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings()) == null || (M = privacyUserSettings.M("direct_message")) == null || M.intValue() != 1) && C92363js.LIZ())) {
                        Keva LIZIZ2 = LIZIZ();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("key_last_user_set_time");
                        LIZ2.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                        if (System.currentTimeMillis() > LIZIZ2.getLong(X1D.LIZIZ(LIZ2), 0L) + 2592000000L) {
                            User LIZJ3 = C80763Ey.LIZJ();
                            if (LIZJ3 != null) {
                                i = LIZJ3.getFollowerCount();
                            } else {
                                i = 0;
                            }
                            if (LIZJ) {
                                i2 = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getPopupFollowerLimit();
                            } else {
                                i2 = 1000;
                            }
                            if (i >= i2) {
                                long currentTimeMillis = System.currentTimeMillis();
                                Keva LIZIZ3 = LIZIZ();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("key_everyone_popup_next_timestamp");
                                LIZ3.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                                if (currentTimeMillis > LIZIZ3.getLong(X1D.LIZIZ(LIZ3), 0L)) {
                                    Keva LIZIZ4 = LIZIZ();
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("key_everyone_popup_show_count");
                                    LIZ4.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
                                    return ((C71202qq) LIZIZ.getValue()).M(LIZIZ4.getInt(X1D.LIZIZ(LIZ4), 0), enterFrom);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
