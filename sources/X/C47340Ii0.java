package X;

import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.Ii0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47340Ii0 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DVideoPreloadManager LJLIL;
    public final /* synthetic */ SimVideoUrlModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL = false;
    public final /* synthetic */ InterfaceC47084Ids LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47340Ii0(DVideoPreloadManager dVideoPreloadManager, SimVideoUrlModel simVideoUrlModel, String str, boolean z, InterfaceC47084Ids interfaceC47084Ids) {
        super(0);
        this.LJLIL = dVideoPreloadManager;
        this.LJLILLLLZI = simVideoUrlModel;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJLL = interfaceC47084Ids;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LIZLLL.copyCache(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
