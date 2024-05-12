package X;

import Y.AfS20S0001000_12;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.InteractionVideoCount;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.NoPAControlSettings;
import com.ss.android.ugc.tiktok.tpsc.data.effectcount.PrivacyUserEffectCountApi;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* renamed from: X.SPd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72041SPd {
    public static final C72041SPd LIZ = new C72041SPd();
    public static InterfaceC72053SPp LIZIZ;

    public static void LIZ() {
        C63081OpJ.LJJLIIIJ(((PrivacyUserEffectCountApi) C72060SPw.LIZ.getValue()).getPrivacyUserEffectCount(), "/tiktok/privacy/user/effected_count/v1").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C72049SPl.LJLIL, new InterfaceC64592gB() { // from class: X.9Ft
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public static InterfaceC72053SPp LIZJ() {
        InterfaceC72053SPp interfaceC72053SPp = LIZIZ;
        if (interfaceC72053SPp != null) {
            return interfaceC72053SPp;
        }
        throw new C72061SPx("Not initialized");
    }

    public static InteractionVideoCount LIZLLL() {
        InteractionVideoCount interactionVideoCount;
        if (C72044SPg.LIZIZ == null) {
            try {
                Gson LJJIIZ = C79146V4k.LJJIIZ();
                Keva keva = C72044SPg.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("privacy_user_interaction_video_count_");
                LIZ2.append(C72052SPo.LIZ());
                interactionVideoCount = (InteractionVideoCount) LJJIIZ.LJI(keva.getString(X1D.LIZIZ(LIZ2), ""), InteractionVideoCount.class);
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                interactionVideoCount = null;
            }
            C72044SPg.LIZIZ = interactionVideoCount;
        }
        return C72044SPg.LIZIZ;
    }

    public static NoPAControlSettings LJ() {
        NoPAControlSettings noPAControlSettings;
        if (C72044SPg.LIZJ == null) {
            try {
                Gson LJJIIZ = C79146V4k.LJJIIZ();
                Keva keva = C72044SPg.LIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("privacy_user_no_pa_settings_");
                LIZ2.append(C72052SPo.LIZ());
                noPAControlSettings = (NoPAControlSettings) LJJIIZ.LJI(keva.getString(X1D.LIZIZ(LIZ2), ""), NoPAControlSettings.class);
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                noPAControlSettings = null;
            }
            C72044SPg.LIZJ = noPAControlSettings;
        }
        return C72044SPg.LIZJ;
    }

    public static PrivacyUserSettingsV2 LJI() {
        if (C72042SPe.LIZ == null) {
            try {
                C72048SPk c72048SPk = (C72048SPk) C79146V4k.LJJIIZ().LJI(C72042SPe.LIZJ.getString(C72042SPe.LIZIZ(), ""), C72048SPk.class);
                if (c72048SPk != null) {
                    C72042SPe.LIZ = c72048SPk.LIZ;
                    C72042SPe.LIZIZ = c72048SPk.LIZIZ;
                }
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            } catch (Exception e2) {
                C78983UzD.LJIIZILJ(e2);
            }
        }
        PrivacyUserSettingsV2 privacyUserSettingsV2 = C72042SPe.LIZ;
        if (privacyUserSettingsV2 == null) {
            return null;
        }
        return PrivacyUserSettingsV2.L(privacyUserSettingsV2);
    }

    public static PrivacySettingsAgreementRecord LIZIZ(String str) {
        PrivacySettingsAgreementRecord privacySettingsAgreementRecord;
        java.util.Map LIZIZ2 = C72039SPb.LIZIZ();
        if (LIZIZ2 == null || (privacySettingsAgreementRecord = (PrivacySettingsAgreementRecord) LIZIZ2.get(str)) == null) {
            java.util.Map LIZJ = C72039SPb.LIZJ();
            if (LIZJ != null) {
                return (PrivacySettingsAgreementRecord) LIZJ.get(str);
            }
            return null;
        }
        return privacySettingsAgreementRecord;
    }

    public static PrivacySettingsRestrictionItem LJFF(int i, String target) {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem;
        o.LJIIIZ(target, "target");
        if (i == 0 && o.LJ(target, "group_chat")) {
            String LIZ2 = C72052SPo.LIZ();
            String str = C72051SPn.LIZ;
            if (str == null || !ujb.o.LJJJJIZL(str, LIZ2, false)) {
                if (LIZ2 != null && LIZ2.length() != 0) {
                    try {
                        privacySettingsRestrictionItem = (PrivacySettingsRestrictionItem) GsonProtectorUtils.fromJson(C79146V4k.LJJIIZ(), C72051SPn.LIZIZ.getString(LIZ2, ""), PrivacySettingsRestrictionItem.class);
                        if (privacySettingsRestrictionItem == null) {
                        }
                    } catch (Exception e) {
                        C78983UzD.LJIIZILJ(e);
                    }
                    C72051SPn.LIZLLL = privacySettingsRestrictionItem;
                    C72051SPn.LIZ = LIZ2;
                }
                privacySettingsRestrictionItem = C72051SPn.LIZJ;
                C72051SPn.LIZLLL = privacySettingsRestrictionItem;
                C72051SPn.LIZ = LIZ2;
            }
            return C72051SPn.LIZLLL;
        }
        PrivacySettingsRestriction LIZLLL = C72039SPb.LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        return C78939UyV.LJJI(LIZLLL, i, target);
    }

    public static AbstractC73430Srq LJII(int i, int i2, String field) {
        o.LJIIIZ(field, "field");
        if (o.LJ(field, "direct_message")) {
            return C72045SPh.LIZIZ("direct_message", i).LJIJJLI(new AfS20S0001000_12(i, 0));
        }
        if (o.LJ(field, "private_account")) {
            return C72045SPh.LIZJ(i, i2);
        }
        return C72045SPh.LIZIZ(field, i);
    }
}
