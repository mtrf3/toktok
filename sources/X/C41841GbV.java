package X;

import com.ss.android.ugc.aweme.services.story.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.GbV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41841GbV {
    public final String LIZ;
    public final ForwardMedia LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final ForwardVideoPlayerCacheProvider LJ;

    public C41841GbV(String localVideoPath, ForwardMedia forwardMedia, int i, int i2, ForwardVideoPlayerCacheProvider forwardVideoPlayerCacheProvider) {
        o.LJIIIZ(localVideoPath, "localVideoPath");
        o.LJIIIZ(forwardMedia, "forwardMedia");
        this.LIZ = localVideoPath;
        this.LIZIZ = forwardMedia;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = forwardVideoPlayerCacheProvider;
    }
}
