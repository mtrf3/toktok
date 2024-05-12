package com.ss.android.ugc.aweme.services.mvtemplate;

import X.C47242IgQ;
import X.C47689Ind;
import X.InterfaceC46304IFg;
import X.InterfaceC46800IYi;
import X.InterfaceC82564Wam;
import android.view.TextureView;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AVVideoViewComponentFactoryImpl implements InterfaceC46800IYi {
    @Override // X.InterfaceC46800IYi
    public InterfaceC82564Wam create() {
        final VideoViewComponent videoViewComponent = new VideoViewComponent();
        return new InterfaceC82564Wam() { // from class: com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImpl$create$1
            public OnUIPlayListener aVOnUIPlayListener;

            @Override // X.InterfaceC82564Wam
            public boolean isPlaying() {
                return VideoViewComponent.this.LJFF();
            }

            @Override // X.InterfaceC82564Wam
            public void pause() {
                VideoViewComponent.this.pause();
            }

            @Override // X.InterfaceC82564Wam
            public void stop() {
                VideoViewComponent.this.LJIIJJI();
            }

            @Override // X.InterfaceC82564Wam
            public void addPlayerListener(InterfaceC46304IFg listener) {
                o.LJIIIZ(listener, "listener");
                VideoViewComponent videoViewComponent2 = VideoViewComponent.this;
                OnUIPlayListener onUIPlayListener = AVVideoViewComponentFactoryImplKt.toOnUIPlayListener(listener);
                this.aVOnUIPlayListener = onUIPlayListener;
                videoViewComponent2.LIZ(onUIPlayListener);
            }

            @Override // X.InterfaceC82564Wam
            public int getCacheSize(Video video) {
                o.LJIIIZ(video, "video");
                return C47242IgQ.LIZ().LIZLLL(b.LJJIL(video.getProperPlayAddr()));
            }

            @Override // X.InterfaceC82564Wam
            public void tryResume(Video video) {
                o.LJIIIZ(video, "video");
                VideoViewComponent.this.LJIIL(video);
            }

            @Override // X.InterfaceC82564Wam
            public void wrap(TextureView view) {
                o.LJIIIZ(view, "view");
                VideoViewComponent.this.LJIILJJIL((C47689Ind) view);
            }

            @Override // X.InterfaceC82564Wam
            public void preloadVideo(Video video, int i) {
                o.LJIIIZ(video, "video");
                C47242IgQ.LIZ().preload(b.LJJIL(video.getProperPlayAddr()), i);
            }
        };
    }
}
