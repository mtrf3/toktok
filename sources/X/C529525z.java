package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.25z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C529525z extends AbstractC65781Prl implements InterfaceC88472Yns<DownloadInfo, C76800UCe> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ C23080vQ LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C529525z(C76732zl c76732zl, C23080vQ c23080vQ, long j, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        super(1);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = c23080vQ;
        this.LJLJI = j;
        this.LJLJJI = interfaceC67352kd;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(DownloadInfo downloadInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSuccess: pre-");
        C1DD.LJFF(LIZ, this.LJLIL.element, LIZ, "KaraokeDownloader");
        C76732zl c76732zl = this.LJLIL;
        int i = c76732zl.element;
        int i2 = 100 - i;
        if (i2 > 0) {
            c76732zl.element = i + i2;
            C23050vN c23050vN = this.LJLILLLLZI.LIZLLL.get(Long.valueOf(this.LJLJI));
            if (c23050vN != null) {
                c23050vN.LIZJ += i2;
                System.currentTimeMillis();
                c23050vN.LIZIZ.invoke(Long.valueOf(c23050vN.LIZ), Integer.valueOf(Math.min(100, (c23050vN.LIZJ * 100) / c23050vN.LIZLLL)));
            }
        }
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLJJI;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
        return C76800UCe.LIZ;
    }
}
