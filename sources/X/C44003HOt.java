package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.HOt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44003HOt extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ DownloadInfo LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC44004HOu LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44003HOt(ActivityC45651qj activityC45651qj, String str, DownloadInfo downloadInfo, String str2, HCZ hcz) {
        super(0);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
        this.LJLJI = downloadInfo;
        this.LJLJJI = str2;
        this.LJLJJL = hcz;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ExecutorC142245i8.LJLILLLLZI.execute(new RunnableC44002HOs(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL));
        return C76800UCe.LIZ;
    }
}
