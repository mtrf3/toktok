package X;

import com.ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl;
import com.ss.android.vesdk.VEUtils;

/* renamed from: X.Hx9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC45731Hx9 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int[] LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ VideoCoverCacheImpl LJLJJL;

    public RunnableC45731Hx9(String str, int[] iArr, int i, int i2, VideoCoverCacheImpl videoCoverCacheImpl) {
        this.LJLIL = str;
        this.LJLILLLLZI = iArr;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = videoCoverCacheImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            VEUtils.getVideoFrames(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, false, new C45729Hx7(this.LJLJJL));
        } finally {
            if (LIZ) {
            }
        }
    }
}
