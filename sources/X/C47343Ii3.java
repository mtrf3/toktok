package X;

import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;

/* renamed from: X.Ii3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47343Ii3 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DVideoPreloadManager LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47343Ii3(DVideoPreloadManager dVideoPreloadManager, String str, String str2) {
        super(0);
        this.LJLIL = dVideoPreloadManager;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LIZLLL.createScene(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
