package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import java.util.List;

/* renamed from: X.Iib, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47377Iib extends AbstractRunnableC47386Iik {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ VideoPreloadManager LJLJJL;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLJJL.LJIJJLI().addMedias(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return false;
    }

    public C47377Iib(VideoPreloadManager videoPreloadManager, List list, boolean z, boolean z2, String str) {
        this.LJLJJL = videoPreloadManager;
        this.LJLIL = list;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = str;
    }
}
