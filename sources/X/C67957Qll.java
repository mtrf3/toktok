package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.Qll, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67957Qll {
    public static final Feature LIZ;
    public static final Feature LIZIZ;

    static {
        new Feature("cancel_target_direct_transfer", 1L);
        new Feature("delete_credential", 1L);
        new Feature("delete_device_public_key", 1L);
        new Feature("get_or_generate_device_public_key", 1L);
        new Feature("get_passkeys", 1L);
        new Feature("update_passkey", 1L);
        LIZ = new Feature("is_user_verifying_platform_authenticator_available_for_credential", 1L);
        LIZIZ = new Feature("is_user_verifying_platform_authenticator_available", 1L);
        new Feature("privileged_api_list_credentials", 2L);
        new Feature("start_target_direct_transfer", 1L);
        new Feature("zero_party_api_register", 3L);
        new Feature("zero_party_api_sign", 3L);
        new Feature("zero_party_api_list_discoverable_credentials", 2L);
        new Feature("zero_party_api_authenticate_passkey", 1L);
        new Feature("zero_party_api_register_passkey", 1L);
        new Feature("zero_party_api_get_hybrid_client_registration_pending_intent", 1L);
        new Feature("zero_party_api_get_hybrid_client_sign_pending_intent", 1L);
        new Feature("get_browser_hybrid_client_sign_pending_intent", 1L);
        new Feature("get_browser_hybrid_client_registration_pending_intent", 1L);
    }
}
