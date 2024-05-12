package X;

import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* renamed from: X.Waj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82561Waj implements InterfaceC82564Wam {
    public final InterfaceC82564Wam LIZ;

    @Override // X.InterfaceC82564Wam
    public final boolean isPlaying() {
        InterfaceC82564Wam interfaceC82564Wam = this.LIZ;
        if (interfaceC82564Wam != null) {
            return interfaceC82564Wam.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC82564Wam
    public final void pause() {
        InterfaceC82564Wam interfaceC82564Wam = this.LIZ;
        if (interfaceC82564Wam != null) {
            interfaceC82564Wam.pause();
        }
    }

    @Override // X.InterfaceC82564Wam
    public final void stop() {
        InterfaceC82564Wam interfaceC82564Wam = this.LIZ;
        if (interfaceC82564Wam != null) {
            interfaceC82564Wam.stop();
        }
    }

    public C82561Waj(C82622Wbi c82622Wbi) {
        InterfaceC46800IYi aVVideoViewComponentFactory;
        InterfaceC82564Wam interfaceC82564Wam = null;
        if (c82622Wbi != null && (aVVideoViewComponentFactory = ((InterfaceC47196Ifg) c82622Wbi.LJ(InterfaceC47196Ifg.class, null)).getAVVideoViewComponentFactory()) != null) {
            interfaceC82564Wam = aVVideoViewComponentFactory.create();
        }
        this.LIZ = interfaceC82564Wam;
    }

    @Override // X.InterfaceC82564Wam
    public final void addPlayerListener(InterfaceC46304IFg listener) {
        o.LJIIIZ(listener, "listener");
        InterfaceC82564Wam interfaceC82564Wam = this.LIZ;
        if (interfaceC82564Wam != null) {
            interfaceC82564Wam.addPlayerListener(listener);
        }
    }

    @Override // X.InterfaceC82564Wam
    public final int getCacheSize(Video video) {
        o.LJIIIZ(video, "video");
        InterfaceC82564Wam interfaceC82564Wam = this.LIZ;
        if (interfaceC82564Wam != null) {
            return interfaceC82564Wam.getCacheSize(video);
        }
        return 0;
    }

    @Override // X.InterfaceC82564Wam
    public final void tryResume(Video video) {
        o.LJIIIZ(video, "video");
        InterfaceC82564Wam interfaceC82564Wam = this.LIZ;
        if (interfaceC82564Wam != null) {
            interfaceC82564Wam.tryResume(video);
        }
    }

    @Override // X.InterfaceC82564Wam
    public final void wrap(TextureView view) {
        o.LJIIIZ(view, "view");
        InterfaceC82564Wam interfaceC82564Wam = this.LIZ;
        if (interfaceC82564Wam != null) {
            interfaceC82564Wam.wrap(view);
        }
    }

    @Override // X.InterfaceC82564Wam
    public final void preloadVideo(Video video, int i) {
        InterfaceC82564Wam interfaceC82564Wam = this.LIZ;
        if (interfaceC82564Wam != null) {
            interfaceC82564Wam.preloadVideo(video, i);
        }
    }
}
