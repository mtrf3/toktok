package X;

import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;

/* renamed from: X.Wam, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC82564Wam {
    void addPlayerListener(InterfaceC46304IFg interfaceC46304IFg);

    int getCacheSize(Video video);

    boolean isPlaying();

    void pause();

    void preloadVideo(Video video, int i);

    void stop();

    void tryResume(Video video);

    void wrap(TextureView textureView);
}
