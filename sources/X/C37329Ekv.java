package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ekv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37329Ekv {
    public final EnumC58085Mqv LIZ;

    public final C78862UxG LIZ() {
        int i;
        EnumC58085Mqv scene = this.LIZ;
        o.LJIIIZ(scene, "scene");
        Integer num = (Integer) ((LinkedHashMap) C58084Mqu.LIZ).get(scene);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        if (i != 0) {
            if (i != 1) {
                int i2 = C58086Mqw.LIZ[this.LIZ.ordinal()];
                if (i2 != 12) {
                    if (i2 != 13) {
                        if (i2 != 15) {
                            if (i2 != 16) {
                                switch (i2) {
                                    case 1:
                                        return C78857UxB.LJJIIJ(1476431889, "bpea-contact_reader_find_friends_only_read");
                                    case 2:
                                        return C78857UxB.LJJIIJ(1476431874, "bpea-contact_reader_sign_up_only_read");
                                    case 3:
                                        return C78857UxB.LJJIIJ(1476431875, "bpea-contact_reader_login_only_read");
                                    case 4:
                                        return C78857UxB.LJJIIJ(1476431885, "bpea-contact_reader_new_version_only_read");
                                    case 5:
                                        return C78857UxB.LJJIIJ(1476431878, "bpea-contact_inbox_only_read");
                                    case 6:
                                        return C78857UxB.LJJIIJ(1476431877, "bpea-contact_reader_user_profile_only_read");
                                    case 7:
                                        return C78857UxB.LJJIIJ(1476431880, "bpea-contact_reader_following_list_only_read");
                                    default:
                                        return C78857UxB.LJJIIJ(1476431889, "bpea-contact_reader_find_friends_only_read");
                                }
                            }
                            return C78857UxB.LJJIIJ(1476431879, "bpea-contact_reader_other_following_list_only_read");
                        }
                        return C78857UxB.LJJIIJ(1476431876, "bpea-contact_reader_self_profile_only_read");
                    }
                    return C78857UxB.LJJIIJ(1476431882, "bpea-contact_reader_homepage_hot_only_read");
                }
                return C78857UxB.LJJIIJ(1476431884, "bpea-contact_reader_homepage_follow_only_read");
            }
            switch (C58086Mqw.LIZ[this.LIZ.ordinal()]) {
                case 1:
                    return C78857UxB.LJJIIJ(1476431889, "bpea-contact_reader_find_friends");
                case 2:
                    return C78857UxB.LJJIIJ(1476431874, "bpea-contact_reader_sign_up");
                case 3:
                    return C78857UxB.LJJIIJ(1476431875, "bpea-contact_reader_login");
                case 4:
                    return C78857UxB.LJJIIJ(1476431885, "bpea-contact_reader_new_version");
                case 5:
                    return C78857UxB.LJJIIJ(1476431878, "bpea-contact_inbox");
                case 6:
                    return C78857UxB.LJJIIJ(1476431877, "bpea-contact_reader_user_profile");
                case 7:
                    return C78857UxB.LJJIIJ(1476431880, "bpea-contact_reader_following_list");
                case 8:
                    return C78857UxB.LJJIIJ(1476431881, "bpea-contact_reader_friends_tab");
                case 9:
                    return C78857UxB.LJJIIJ(1476431890, "bpea-contact_reader_invite_panel");
                case 10:
                    return C78857UxB.LJJIIJ(1476431887, "bpea-contact_reader_setting_privacy");
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    return C78857UxB.LJJIIJ(1476431886, "bpea-contact_reader_suggest_account");
                case 12:
                    return C78857UxB.LJJIIJ(1476431884, "bpea-contact_reader_homepage_follow");
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    return C78857UxB.LJJIIJ(1476431882, "bpea-contact_reader_homepage_hot");
                case 14:
                    return C78857UxB.LJJIIJ(1476431873, "bpea-contact_cold_start");
                case 15:
                    return C78857UxB.LJJIIJ(1476431876, "bpea-contact_reader_self_profile");
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    return C78857UxB.LJJIIJ(1476431879, "bpea-contact_reader_other_following_list");
                default:
                    return C78857UxB.LJJIIJ(1476431889, "bpea-contact_reader_find_friends");
            }
        }
        int i3 = C58086Mqw.LIZ[this.LIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 5) {
                if (i3 != 6) {
                    if (i3 != 7) {
                        if (i3 != 8) {
                            if (i3 != 15) {
                                if (i3 != 16) {
                                    return C78857UxB.LJJIIJ(1476431889, "bpea-contact_reader_find_friends_positive");
                                }
                                return C78857UxB.LJJIIJ(1476431879, "bpea-contact_reader_other_following_list_positive");
                            }
                            return C78857UxB.LJJIIJ(1476431876, "bpea-contact_reader_self_profile_positive");
                        }
                        return C78857UxB.LJJIIJ(1476431881, "bpea-contact_reader_friends_tab_positive");
                    }
                    return C78857UxB.LJJIIJ(1476431880, "bpea-contact_reader_following_list_positive");
                }
                return C78857UxB.LJJIIJ(1476431877, "bpea-contact_reader_user_profile_positive");
            }
            return C78857UxB.LJJIIJ(1476431878, "bpea-contact_inbox_positive");
        }
        return C78857UxB.LJJIIJ(1476431889, "bpea-contact_reader_find_friends_positive");
    }

    public C37329Ekv(EnumC58085Mqv scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZ = scene;
    }
}
