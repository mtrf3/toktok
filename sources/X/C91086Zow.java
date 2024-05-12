package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Zow, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91086Zow {
    public static MusicDspApi.MusicDspOperatorApi LIZ() {
        if (MusicDspApi.LIZ == null) {
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String API_URL_PREFIX_SI = EFJ.LIZJ;
            o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
            MusicDspApi.LIZ = (MusicDspApi.MusicDspOperatorApi) LIZLLL.create(API_URL_PREFIX_SI).create(MusicDspApi.MusicDspOperatorApi.class);
        }
        MusicDspApi.MusicDspOperatorApi musicDspOperatorApi = MusicDspApi.LIZ;
        o.LJI(musicDspOperatorApi);
        return musicDspOperatorApi;
    }

    public static AbstractC73672Svk LIZJ(String str, boolean z, boolean z2, String str2, int i, String playedInfos, int i2) {
        List<String> expiredPreviewFullClipIds;
        String unPlayedClipIds = str2;
        String fullClipId = str;
        boolean z3 = z2;
        String needRetrievedClipIds = "";
        if ((i2 & 1) != 0) {
            fullClipId = "";
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            unPlayedClipIds = "";
        }
        if ((i2 & 16) == 0) {
            needRetrievedClipIds = null;
        }
        o.LJIIIZ(fullClipId, "fullClipId");
        o.LJIIIZ(unPlayedClipIds, "unPlayedClipIds");
        o.LJIIIZ(needRetrievedClipIds, "needRetrievedClipIds");
        o.LJIIIZ(playedInfos, "playedInfos");
        C91432ZuW.LJLIL = true;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new EJ6("check_preload", "true"));
        }
        YBM.LIZ.getClass();
        if (YBM.LIZIZ()) {
            expiredPreviewFullClipIds = ExpiredPlayableManager.INSTANCE.getExpiredFullClipIds();
        } else {
            ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
            expiredPreviewFullClipIds = expiredPlayableManager.getExpiredPreviewFullClipIds();
            if (expiredPreviewFullClipIds.isEmpty()) {
                expiredPreviewFullClipIds = expiredPlayableManager.getExpiredFullClipIds();
            }
        }
        return LIZ().queryMusicFeed(ORZ.LLD(expiredPreviewFullClipIds, ",", null, null, null, 62), 1, fullClipId, z3, unPlayedClipIds, playedInfos, i, needRetrievedClipIds, YBM.LIZLLL(), YBM.LIZ().getDspClipShowStrategy(), arrayList);
    }

    public static AbstractC73672Svk LIZIZ(boolean z, String playedClipIds, int i, String str, int i2, String playingClipId, String unPlayedClipIds, String playedInfoJson) {
        int i3;
        o.LJIIIZ(playedClipIds, "playedClipIds");
        o.LJIIIZ(playingClipId, "playingClipId");
        o.LJIIIZ(unPlayedClipIds, "unPlayedClipIds");
        o.LJIIIZ(playedInfoJson, "playedInfoJson");
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new EJ6("check_preload", "true"));
        }
        MusicDspApi.MusicDspOperatorApi LIZ = LIZ();
        if (ActivityStack.isAppBackGround()) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        YBM.LIZ.getClass();
        return LIZ.loadShuffleCollectList(playedClipIds, str, playingClipId, 1, i, i2, unPlayedClipIds, playedInfoJson, i3, YBM.LIZLLL(), YBM.LIZ().getDspClipShowStrategy(), arrayList);
    }
}
