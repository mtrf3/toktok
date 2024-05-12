package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.tiktok.tpsc.data.restriction.PrivacyRestrictionResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import defpackage.i0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* renamed from: X.SPb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72039SPb {
    public static final Keva LIZ;
    public static String LIZIZ;
    public static PrivacyRestrictionResponse LIZJ;

    static {
        Keva repo = Keva.getRepo("privacy_setting");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        LIZ = repo;
    }

    public static PrivacyRestrictionResponse LIZ() {
        String LIZ2 = C72052SPo.LIZ();
        String str = LIZIZ;
        if (str == null || !ujb.o.LJJJJIZL(str, LIZ2, false)) {
            LIZJ = null;
        }
        if (LIZJ == null) {
            try {
                LIZJ = (PrivacyRestrictionResponse) C79146V4k.LJJIIZ().LJI(LIZ.getString(LJ(), ""), PrivacyRestrictionResponse.class);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            } catch (Exception e2) {
                C78983UzD.LJIIZILJ(e2);
            }
            LIZIZ = LIZ2;
        }
        return LIZJ;
    }

    public static java.util.Map LIZIZ() {
        java.util.Map<String, PrivacySettingsAgreementRecord> popupAgreement;
        PrivacyRestrictionResponse LIZ2 = LIZ();
        if (LIZ2 == null || (popupAgreement = LIZ2.getPopupAgreement()) == null) {
            String LIZ3 = C72052SPo.LIZ();
            String str = C72047SPj.LIZJ;
            if (str == null || !ujb.o.LJJJJIZL(str, LIZ3, false)) {
                C72047SPj.LIZLLL = null;
            }
            if (C72047SPj.LIZLLL == null) {
                try {
                    C72047SPj.LIZLLL = (java.util.Map) GsonProtectorUtils.fromJson(C79146V4k.LJJIIZ(), C72047SPj.LIZ.getString(C72047SPj.LIZ("popup_agreement"), ""), new C72056SPs().getType());
                } catch (JSONException unused) {
                }
                C72047SPj.LIZJ = LIZ3;
            }
            return C72047SPj.LIZLLL;
        }
        return popupAgreement;
    }

    public static java.util.Map LIZJ() {
        java.util.Map<String, PrivacySettingsAgreementRecord> postRecord;
        PrivacyRestrictionResponse LIZ2 = LIZ();
        if (LIZ2 == null || (postRecord = LIZ2.getPostRecord()) == null) {
            String LIZ3 = C72052SPo.LIZ();
            String str = C72047SPj.LJ;
            if (str == null || !ujb.o.LJJJJIZL(str, LIZ3, false)) {
                C72047SPj.LJFF = null;
            }
            if (C72047SPj.LJFF == null) {
                try {
                    C72047SPj.LJFF = (java.util.Map) GsonProtectorUtils.fromJson(C79146V4k.LJJIIZ(), C72047SPj.LIZ.getString(C72047SPj.LIZ("post_record"), ""), new C72057SPt().getType());
                } catch (JSONException unused) {
                }
                C72047SPj.LJ = LIZ3;
            }
            return C72047SPj.LJFF;
        }
        return postRecord;
    }

    public static PrivacySettingsRestriction LIZLLL() {
        PrivacySettingsRestriction privacySettingsRestriction;
        PrivacyRestrictionResponse LIZ2 = LIZ();
        if (LIZ2 == null || (privacySettingsRestriction = LIZ2.getPrivacySettingsRestriction()) == null) {
            if (C72047SPj.LIZIZ == null) {
                try {
                    C72047SPj.LIZIZ = (PrivacySettingsRestriction) GsonProtectorUtils.fromJson(C79146V4k.LJJIIZ(), C72047SPj.LIZ.getString("private_settings", ""), PrivacySettingsRestriction.class);
                } catch (JSONException unused) {
                }
            }
            return C72047SPj.LIZIZ;
        }
        return privacySettingsRestriction;
    }

    public static String LJ() {
        boolean z;
        String LIZ2 = C72052SPo.LIZ();
        if (LIZ2 == null || LIZ2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "privacy_data";
        }
        return i0.LJFF("privacy_data", LIZ2);
    }

    public static void LJII(PrivacyRestrictionResponse privacyRestrictionResponse) {
        if (o.LJ(privacyRestrictionResponse, LIZJ)) {
            return;
        }
        LIZJ = privacyRestrictionResponse;
        if (privacyRestrictionResponse == null) {
            LIZ.erase(LJ());
        } else {
            LIZ.storeString(LJ(), GsonProtectorUtils.toJson(C79146V4k.LJJIIZ(), privacyRestrictionResponse));
        }
        C72047SPj.LIZIZ = null;
        Keva keva = C72047SPj.LIZ;
        keva.erase("private_settings");
        C72047SPj.LIZLLL = null;
        keva.erase(C72047SPj.LIZ("popup_agreement"));
        C72047SPj.LJFF = null;
        keva.erase(C72047SPj.LIZ("post_record"));
    }

    public static void LJFF(int i, String str) {
        boolean z;
        PrivacyRestrictionResponse privacyRestrictionResponse;
        java.util.Map LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null && LIZIZ2.containsKey(str)) {
            z = true;
        } else {
            z = false;
        }
        PrivacyRestrictionResponse privacyRestrictionResponse2 = null;
        if (z) {
            PrivacyRestrictionResponse LIZ2 = LIZ();
            if (LIZ2 != null) {
                java.util.Map LIZIZ3 = LIZIZ();
                o.LJI(LIZIZ3);
                privacyRestrictionResponse = PrivacyRestrictionResponse.copy$default(LIZ2, null, LJI(i, str, LIZIZ3), null, null, 13, null);
            } else {
                privacyRestrictionResponse = null;
            }
            LJII(privacyRestrictionResponse);
        }
        java.util.Map LIZJ2 = LIZJ();
        if (LIZJ2 != null && LIZJ2.containsKey(str)) {
            PrivacyRestrictionResponse LIZ3 = LIZ();
            if (LIZ3 != null) {
                java.util.Map LIZJ3 = LIZJ();
                o.LJI(LIZJ3);
                privacyRestrictionResponse2 = PrivacyRestrictionResponse.copy$default(LIZ3, null, null, LJI(i, str, LIZJ3), null, 11, null);
            }
            LJII(privacyRestrictionResponse2);
        }
    }

    public static final java.util.Map LJI(int i, String str, java.util.Map map) {
        PrivacySettingsAgreementRecord privacySettingsAgreementRecord;
        java.util.Map LJJLIL = C113554cx.LJJLIL(map);
        if (((LinkedHashMap) LJJLIL).get(str) != null) {
            privacySettingsAgreementRecord = new PrivacySettingsAgreementRecord(i);
        } else {
            privacySettingsAgreementRecord = new PrivacySettingsAgreementRecord(i);
        }
        LJJLIL.put(str, privacySettingsAgreementRecord);
        return LJJLIL;
    }
}
