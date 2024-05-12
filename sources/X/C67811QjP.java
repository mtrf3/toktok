package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.QjP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67811QjP {
    public static final Feature LIZ;
    public static final Feature LIZIZ;
    public static final Feature LIZJ;
    public static final Feature[] LIZLLL;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 8L);
        LIZ = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        LIZIZ = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        LIZJ = feature5;
        LIZLLL = new Feature[]{feature, feature2, feature3, feature4, feature5, new Feature("auth_api_credentials_get_sign_in_intent", 6L), new Feature("auth_api_credentials_save_account_linking_token", 3L), new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
