package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.ZWn, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90069ZWn {
    public static final Feature LIZ;
    public static final Feature LIZIZ;
    public static final Feature LIZJ;
    public static final Feature LIZLLL;
    public static final Feature[] LJ;

    static {
        Feature feature = new Feature("client_side_logging", 1L);
        Feature feature2 = new Feature("cxless_client_minimal", 1L);
        LIZ = feature2;
        Feature feature3 = new Feature("cxless_caf_control", 1L);
        Feature feature4 = new Feature("module_flag_control", 1L);
        LIZIZ = feature4;
        Feature feature5 = new Feature("discovery_hint_supply", 1L);
        Feature feature6 = new Feature("relay_casting_set_active_account", 1L);
        Feature feature7 = new Feature("analytics_proto_enum_translation", 1L);
        LIZJ = feature7;
        Feature feature8 = new Feature("integer_to_integer_map", 1L);
        LIZLLL = feature8;
        LJ = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, new Feature("relay_casting_set_remote_casting_mode", 1L), new Feature("get_relay_access_token", 1L), new Feature("get_cast_settings", 1L), new Feature("set_bundle_setting", 1L)};
    }
}
