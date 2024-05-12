package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerV2;
import java.util.List;

/* renamed from: X.IiJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47359IiJ extends AbstractRunnableC47385Iij {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ VideoPreloadManagerV2 LJLJJL;

    @Override // X.AbstractRunnableC47385Iij
    public final boolean LIZ() {
        this.LJLJJL.checkInit();
        this.LJLJJL.LJIJJ().addMedias(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return false;
    }

    public C47359IiJ(VideoPreloadManagerV2 videoPreloadManagerV2, List list, boolean z, boolean z2, String str) {
        this.LJLJJL = videoPreloadManagerV2;
        this.LJLIL = list;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = str;
    }
}
