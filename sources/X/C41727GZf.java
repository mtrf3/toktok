package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GZf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41727GZf {
    public static final /* synthetic */ int LIZ = 0;

    public static Workspace LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (model.isFastImport) {
            CreativeInfo creativeInfo = model.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
            String mMusicPath = model.getMMusicPath();
            model.reverseVideoPath();
            return HU5.LIZIZ(creativeInfo, mMusicPath);
        }
        String str = model.mShootWay;
        if (str != null && ujb.o.LJJJLIIL(str, "miracle_game", false)) {
            CreativeInfo creativeInfo2 = model.creativeInfo;
            o.LJIIIIZZ(creativeInfo2, "model.creativeInfo");
            String mMusicPath2 = model.getMMusicPath();
            model.reverseVideoPath();
            return HU5.LIZIZ(creativeInfo2, mMusicPath2);
        }
        CreativeInfo creativeInfo3 = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo3, "model.creativeInfo");
        String mMusicPath3 = model.getMMusicPath();
        model.reverseVideoPath();
        return HU5.LIZIZ(creativeInfo3, mMusicPath3);
    }
}
