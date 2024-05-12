package X;

import com.bytedance.android.livesdk.livesetting.other.FollowLiveBubbleConfig;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class E6F implements E67 {
    public final FollowLiveBubbleConfig LIZ;
    public final WeakReference<InterfaceC54197LOv> LIZIZ;
    public final boolean LIZJ;

    @Override // X.E67
    public final int getScene() {
        return E6G.FEED.getValue();
    }

    @Override // X.E67
    public final int getType() {
        return E69.FOLLOW_LIVE.getValue();
    }

    public E6F(FollowLiveBubbleConfig followLiveBubbleConfig, WeakReference weakReference, boolean z) {
        this.LIZ = followLiveBubbleConfig;
        this.LIZIZ = weakReference;
        this.LIZJ = z;
    }
}
