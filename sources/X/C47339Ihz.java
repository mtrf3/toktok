package X;

import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* renamed from: X.Ihz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47339Ihz extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DVideoPreloadManager LJLIL;
    public final /* synthetic */ List<SimVideoUrlModel> LJLILLLLZI;
    public final /* synthetic */ int LJLJI = Integer.MAX_VALUE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47339Ihz(DVideoPreloadManager dVideoPreloadManager, List list) {
        super(0);
        this.LJLIL = dVideoPreloadManager;
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LIZLLL.preloadSub(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
