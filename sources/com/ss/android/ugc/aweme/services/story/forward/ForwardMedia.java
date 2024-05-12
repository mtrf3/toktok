package com.ss.android.ugc.aweme.services.story.forward;

import com.ss.android.ugc.aweme.canvas.ForwardMusic;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import java.io.Serializable;

/* loaded from: classes8.dex */
public interface ForwardMedia extends Serializable {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static long getCreateTime(ForwardMedia forwardMedia) {
            return 0L;
        }

        public static ForwardMusic getForwardMusic(ForwardMedia forwardMedia) {
            return null;
        }

        public static int getOriginVideoAIGCLabelType(ForwardMedia forwardMedia) {
            return 0;
        }

        public static String getPastMemoryKey(ForwardMedia forwardMedia) {
            return "";
        }

        public static PhotoModeImageInfo getPhotoModeImageInfo(ForwardMedia forwardMedia) {
            return null;
        }

        public static float getTargetVolumeLoud(ForwardMedia forwardMedia) {
            return -12.0f;
        }
    }

    MediaAuthor getAuthor();

    int getAwemeType();

    long getCreateTime();

    String getEnterMethod();

    String getEventType();

    ForwardMusic getForwardMusic();

    int getOriginVideoAIGCLabelType();

    String getPastMemoryKey();

    PhotoModeImageInfo getPhotoModeImageInfo();

    String getSourceId();

    float getTargetVolumeLoud();

    ForwardVideo getVideo();
}
