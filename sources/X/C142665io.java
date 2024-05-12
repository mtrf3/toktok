package X;

import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142665io {
    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
        if (mission == null || mission.isMusicToasted()) {
            return null;
        }
        return mission.getMusicId();
    }
}
