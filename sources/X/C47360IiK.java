package X;

import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.IiK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47360IiK extends AbstractRunnableC47386Iik {
    public final /* synthetic */ SimVideoUrlModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI = false;
    public final /* synthetic */ InterfaceC47084Ids LJLJJL;
    public final /* synthetic */ VideoPreloadManager LJLJJLL;

    @Override // X.AbstractRunnableC47386Iik
    public final boolean LIZ() {
        this.LJLJJLL.LJIJJLI().copyCache(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return false;
    }

    public C47360IiK(VideoPreloadManager videoPreloadManager, SimVideoUrlModel simVideoUrlModel, String str, boolean z, InterfaceC47084Ids interfaceC47084Ids) {
        this.LJLJJLL = videoPreloadManager;
        this.LJLIL = simVideoUrlModel;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJL = interfaceC47084Ids;
    }
}
