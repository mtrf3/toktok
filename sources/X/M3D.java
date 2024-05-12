package X;

import com.bytedance.bpea.cert.token.TokenCert;

/* loaded from: classes10.dex */
public final class M3D {
    public static final TokenCert LIZ;
    public static final TokenCert LIZIZ;
    public static final TokenCert LIZJ;
    public static final TokenCert LIZLLL;
    public static final TokenCert LJ;
    public static final TokenCert LJFF;
    public static final TokenCert LJI;
    public static final TokenCert LJII;
    public static final TokenCert LJIIIIZZ;

    static {
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert with = companion.with("bpea-fetch_cache_location_in_discovery_phase2");
        with.auth("inti");
        LIZ = with;
        TokenCert with2 = companion.with("bpea-fetch_first_real_location_in_discovery_phase2_timeout_10000");
        with2.auth("bjnv");
        LIZIZ = with2;
        TokenCert with3 = companion.with("bpea-fetch_real_location_click_arrow_in_discovery_phase2_timeout_10000");
        with3.auth("bjnv");
        LIZJ = with3;
        TokenCert with4 = companion.with("bpea-fetch_gps_change_city_in_discovery_phase2_timeout_10000");
        with4.auth("bjnv");
        LIZLLL = with4;
        TokenCert with5 = companion.with("bpea-fetch_gps_when_change_settings_in_discovery_phase2_timeout_10000");
        with5.auth("bjnv");
        LJ = with5;
        LJFF = companion.with("bpea-fetch_inapp_convert_permission_in_discovery_phase2");
        LJI = companion.with("bpea-fetch_system_convert_permission_in_discovery_phase2");
        LJII = companion.with("bpea-fetch_fine_location_permission_in_discovery_phase2");
        TokenCert with6 = companion.with("bpea-encrypted_gps_in_discovery_phase2");
        with6.auth("mckd");
        LJIIIIZZ = with6;
    }
}
