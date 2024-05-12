package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47362IiM extends AbstractRunnableC47386Iik {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ VideoPreloadManager LJLILLLLZI;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLILLLLZI.LJIJJLI().removePriorityTaskByContextKey(this.LJLIL);
        return false;
    }

    public C47362IiM(VideoPreloadManager videoPreloadManager, String str) {
        this.LJLILLLLZI = videoPreloadManager;
        this.LJLIL = str;
    }
}
