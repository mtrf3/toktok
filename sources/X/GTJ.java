package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GTJ implements GTK {
    @Override // X.GTK
    public final void LIZIZ(BaseShortVideoContext baseShortVideoContext, List<CreateAnchorInfo> list) {
    }

    @Override // X.GTK
    public final void LIZ(BaseShortVideoContext videoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        o.LJIIIZ(videoContext, "videoContext");
        String str = videoContext.playlist_id;
        if (str != null && videoContext.playlist_name != null) {
            linkedHashMap.put("playlist_id", str);
            String str2 = videoContext.playlist_name;
            o.LJIIIIZZ(str2, "videoContext.playlist_name");
            linkedHashMap.put("playlist_name", str2);
        }
    }
}
