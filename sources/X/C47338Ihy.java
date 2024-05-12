package X;

import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* renamed from: X.Ihy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47338Ihy extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DVideoPreloadManager LJLIL;
    public final /* synthetic */ List<SimVideoUrlModel> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47338Ihy(DVideoPreloadManager dVideoPreloadManager, List<SimVideoUrlModel> list, boolean z, boolean z2, String str) {
        super(0);
        this.LJLIL = dVideoPreloadManager;
        this.LJLILLLLZI = list;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LIZLLL.addMedias(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
