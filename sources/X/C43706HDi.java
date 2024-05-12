package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.common.PublishSettings;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.HDi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43706HDi {
    public static final ArrayList<String> LIZ = C47261Igj.LJII("aw21fuk9tkphbycs", "awrxudrcbk09y7wi");

    public static String LIZ(C43722HDy c43722HDy) {
        InitialMobParams initialMobParams;
        String str;
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), c43722HDy.creativeInitModelJson, CreativeInitialModel.class);
        if (o.LJ(c43722HDy.mClientKey, "aw889s25wozf8s7e")) {
            if (creativeInitialModel == null || (initialMobParams = creativeInitialModel.mobParams) == null || (str = initialMobParams.enterType) == null) {
                return LIZJ(c43722HDy);
            }
            return str;
        }
        return LIZJ(c43722HDy);
    }

    public static final String LIZIZ(String str) {
        if (o.LJ(str, "aw889s25wozf8s7e") || o.LJ(str, "aw7c4z4ej0o3efzd")) {
            return "lv_sync";
        }
        return "original";
    }

    public static final String LIZJ(C43722HDy shareContext) {
        InitialMobParams initialMobParams;
        String str;
        o.LJIIIZ(shareContext, "shareContext");
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), shareContext.creativeInitModelJson, CreativeInitialModel.class);
        if (shareContext.mClientKey != null) {
            if (shareContext.mShareFormat == EnumC43698HDa.GREEN_SCREEN) {
                return "green_screen_kit";
            }
            PublishSettings publishSettings = shareContext.mPublishSettings;
            if (publishSettings != null && publishSettings.isDirectPost()) {
                return "sdk_direct_post";
            }
            if (!o.LJ(shareContext.mClientKey, "aw889s25wozf8s7e") || creativeInitialModel == null || (initialMobParams = creativeInitialModel.mobParams) == null || (str = initialMobParams.enterType) == null || str.length() == 0) {
                if (LIZ.contains(shareContext.mClientKey)) {
                    return "l8_import";
                }
                return "sdk";
            }
            return "lv_sync";
        }
        return "system_share";
    }
}
