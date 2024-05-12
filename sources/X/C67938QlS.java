package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.QlS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67938QlS {
    public static final Feature LIZ;
    public static final Feature[] LIZIZ;

    static {
        Feature feature = new Feature("wallet", 1L);
        Feature feature2 = new Feature("wallet_biometric_auth_keys", 1L);
        Feature feature3 = new Feature("wallet_payment_dynamic_update", 2L);
        LIZ = feature3;
        LIZIZ = new Feature[]{feature, feature2, feature3, new Feature("wallet_1p_initialize_buyflow", 1L), new Feature("wallet_warm_up_ui_process", 1L), new Feature("wallet_get_setup_wizard_intent", 4L), new Feature("wallet_get_payment_card_recognition_intent", 1L)};
    }
}
