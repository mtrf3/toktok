package X;

import android.content.Context;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXG implements InterfaceC49473JbJ {
    @Override // X.InterfaceC49473JbJ
    public final void LIZIZ(JW6 item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC49473JbJ
    public final String LIZ(JW6 item, Context context) {
        o.LJIIIZ(item, "item");
        AggregatedVideo aggregatedVideo = item.LIZ().aggregatedVideo;
        if (aggregatedVideo != null) {
            return aggregatedVideo.title;
        }
        return null;
    }
}
