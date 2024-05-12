package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GTL implements GTK {
    @Override // X.GTK
    public final void LIZIZ(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
    }

    @Override // X.GTK
    public final void LIZ(BaseShortVideoContext videoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        o.LJIIIZ(videoContext, "videoContext");
        C43722HDy LIZJ = C43723HDz.LIZJ(videoContext);
        if (LIZJ != null) {
            if (LIZJ.mClientKey != null && !linkedHashMap.containsKey("open_platform_key")) {
                String str = LIZJ.mClientKey;
                o.LJIIIIZZ(str, "shareContext.mClientKey");
                linkedHashMap.put("open_platform_key", str);
            }
            if (LIZJ.mOpenPlatformExtra != null && !linkedHashMap.containsKey("open_platform_extra")) {
                String str2 = LIZJ.mOpenPlatformExtra;
                o.LJIIIIZZ(str2, "shareContext.mOpenPlatformExtra");
                linkedHashMap.put("open_platform_extra", str2);
            }
            String str3 = LIZJ.mState;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("open_platform_share_id", str3);
        }
    }
}
