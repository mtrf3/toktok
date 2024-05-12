package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;

/* renamed from: X.5fX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C140635fX extends TBS implements InterfaceC65784Pro<Boolean> {
    public C140635fX(VideoEditContainerScene videoEditContainerScene) {
        super(0, videoEditContainerScene, VideoEditContainerScene.class, "isSupportMemoryOpt", "isSupportMemoryOpt()Z", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) this.receiver;
        videoEditContainerScene.getClass();
        boolean z2 = true;
        boolean z3 = !C138395bv.LIZ();
        if (videoEditContainerScene.LLFZ && C138395bv.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = videoEditContainerScene.LLFII;
        videoEditContainerScene.LLFII = false;
        if (!videoEditContainerScene.LLFFF || (!z3 && !z && !z4)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
