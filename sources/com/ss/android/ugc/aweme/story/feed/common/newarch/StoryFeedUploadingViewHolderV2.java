package com.ss.android.ugc.aweme.story.feed.common.newarch;

import X.C222588oQ;
import X.C41825GbF;
import X.C43921HLp;
import android.graphics.Bitmap;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryFeedUploadingViewHolderV2 extends StoryVideoViewHolderV2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryFeedUploadingViewHolderV2(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.StoryVideoViewHolderV2, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public final void ug(Video video) {
        String scheduleId;
        super.ug(video);
        Aweme aweme = this.LJLLL;
        if (aweme != null && (scheduleId = aweme.getScheduleId()) != null) {
            C43921HLp.LIZ.getClass();
            Bitmap bitmap = (Bitmap) ((LinkedHashMap) C43921HLp.LJIIIZ).get(scheduleId);
            if (bitmap != null) {
                this.LLFII.setImageBitmap(bitmap);
                return;
            }
            SmartImageView mCoverView = this.LLFII;
            o.LJIIIIZZ(mCoverView, "mCoverView");
            C41825GbF.LIZIZ(mCoverView, scheduleId);
        }
    }
}
