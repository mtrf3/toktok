package X;

import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;

/* renamed from: X.Ii1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47341Ii1 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DVideoPreloadManager LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI = true;
    public final /* synthetic */ boolean LJLJJL = false;
    public final /* synthetic */ InterfaceC47084Ids LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47341Ii1(DVideoPreloadManager dVideoPreloadManager, String str, String str2, C84862XSg c84862XSg) {
        super(0);
        this.LJLIL = dVideoPreloadManager;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJLL = c84862XSg;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LIZLLL.copyCache(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
