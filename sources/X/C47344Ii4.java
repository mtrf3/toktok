package X;

import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;

/* renamed from: X.Ii4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47344Ii4 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DVideoPreloadManager LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47344Ii4(DVideoPreloadManager dVideoPreloadManager, long j, boolean z) {
        super(0);
        this.LJLIL = dVideoPreloadManager;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LIZLLL.tryToClearAndGetCachesByUsedTime(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
