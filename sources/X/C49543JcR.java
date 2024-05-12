package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.search.model.PollingInfo;
import com.ss.android.ugc.aweme.search.model.TakoInfoModel;
import kotlin.jvm.internal.o;

/* renamed from: X.JcR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49543JcR {
    public static final TakoInfoModel LIZ = new TakoInfoModel(null, null, null, null, null, null, null, null, null, 511, null);

    public static final boolean LIZ() {
        if (o.LJ(LIZLLL().getEnableFeedEntrance(), Boolean.TRUE) && C78685UuP.LJJJZ(LIZJ())) {
            return true;
        }
        return false;
    }

    public static final int LIZIZ() {
        Integer limit;
        PollingInfo pollingConfig = LIZLLL().getPollingConfig();
        if (pollingConfig != null && (limit = pollingConfig.getLimit()) != null) {
            return limit.intValue();
        }
        return 30;
    }

    public static final String LIZJ() {
        return LIZLLL().getBotId();
    }

    public static TakoInfoModel LIZLLL() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TakoInfoModel takoInfoModel = LIZ;
        TakoInfoModel takoInfoModel2 = (TakoInfoModel) LIZLLL.LJIIIIZZ("search_chat_bot_info", TakoInfoModel.class, takoInfoModel);
        if (takoInfoModel2 != null) {
            takoInfoModel = takoInfoModel2;
        }
        o.LJIIIIZZ(takoInfoModel, "SettingsManager.getInsta…         ?: DEFAULT_GROUP");
        return takoInfoModel;
    }
}
