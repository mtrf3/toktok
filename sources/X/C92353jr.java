package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92353jr {
    public static final C92353jr LIZ = new C92353jr();
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.NONE, C3GD.LJLIL);
    public static Keva LIZJ;

    public static String LIZJ() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
    }

    public final synchronized Keva LJFF() {
        Keva keva;
        keva = LIZJ;
        if (keva == null) {
            keva = KevaImpl.getRepo("matched_friends_repo", 1);
            LIZJ = keva;
            o.LJIIIIZZ(keva, "getRepo(KEVA_REPO, KevaC…OCESS).also { repo = it }");
        }
        return keva;
    }

    public static String LJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_maf_intro_panel_timestamp");
        LIZ2.append(LIZJ());
        return X1D.LIZIZ(LIZ2);
    }

    public final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (LIZLLL(str) != 0) {
            Keva LJFF = LJFF();
            StringBuilder LIZ2 = X1D.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("key_maf_follow_popup_timestamp");
            LIZ3.append(LIZJ());
            LIZ2.append(X1D.LIZIZ(LIZ3));
            LIZ2.append(str);
            if (currentTimeMillis <= LJFF.getLong(X1D.LIZIZ(LIZ2), currentTimeMillis)) {
                return false;
            }
        }
        return true;
    }

    public final boolean LIZIZ(String enterFrom) {
        PrivacySettingsRestrictionItem LIZJ2;
        List<PrivacySettingsRestrictionOption> values;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (((Number) C92493k5.LIZ.getValue()).intValue() == 10) {
            return true;
        }
        if (C3UE.LIZIZ() && (LIZJ2 = PrivacyServiceImpl.LJIIIIZZ().LIZJ(0, "chatsets")) != null && (values = LIZJ2.getValues()) != null) {
            Iterator<PrivacySettingsRestrictionOption> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PrivacySettingsRestrictionOption next = it.next();
                PrivacySettingsRestrictionOption privacySettingsRestrictionOption = next;
                if (privacySettingsRestrictionOption.getValue() == 4 && privacySettingsRestrictionOption.getShowType() == 0) {
                    if (next != null && !C3UE.LIZJ()) {
                        Keva LJFF = LJFF();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("key_dm_maf_setting");
                        LIZ2.append(LIZJ());
                        if (!LJFF.getBoolean(X1D.LIZIZ(LIZ2), false) && C00F.LIZ(31744, 0, "im_everyone_popup", true) <= 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = LJFF().getLong(LJ(), 0L);
                            C77266UUc c77266UUc = C77266UUc.LIZIZ;
                            if ((c77266UUc.LJIILLIIL().LIZJ() || c77266UUc.LJIIJ().LIZJ()) && currentTimeMillis > j) {
                                Keva LJFF2 = LJFF();
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("key_maf_intro_panel_show_num");
                                LIZ3.append(LIZJ());
                                return ((C71202qq) LIZIZ.getValue()).M(LJFF2.getInt(X1D.LIZIZ(LIZ3), 0), enterFrom);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int LIZLLL(String uid) {
        o.LJIIIZ(uid, "uid");
        Keva LJFF = LJFF();
        StringBuilder LIZ2 = X1D.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("key_maf_follow_popup_show_num");
        LIZ3.append(LIZJ());
        LIZ2.append(X1D.LIZIZ(LIZ3));
        LIZ2.append(uid);
        return LJFF.getInt(X1D.LIZIZ(LIZ2), 0);
    }
}
