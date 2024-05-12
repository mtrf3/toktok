package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;

/* renamed from: X.IiL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47361IiL extends AbstractRunnableC47386Iik {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = true;
    public final /* synthetic */ boolean LJLJJI = false;
    public final /* synthetic */ InterfaceC47084Ids LJLJJL;
    public final /* synthetic */ VideoPreloadManager LJLJJLL;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLJJLL.LJIJJLI().copyCache(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return false;
    }

    public C47361IiL(VideoPreloadManager videoPreloadManager, String str, String str2, C84862XSg c84862XSg) {
        this.LJLJJLL = videoPreloadManager;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJJL = c84862XSg;
    }
}
