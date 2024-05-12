package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GeA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42006GeA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel args, List anchors) {
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(args, "args");
        if (args.mPoiData == null) {
            return;
        }
        C51556KLg.LIZ.getClass();
        CreateAnchorInfo LJJJJJ = C51556KLg.LIZ().LJJJJJ(args.mPoiData);
        if (LJJJJJ == null) {
            return;
        }
        ((ArrayList) anchors).add(LJJJJJ);
    }
}
