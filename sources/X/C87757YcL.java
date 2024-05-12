package X;

import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;

/* renamed from: X.YcL, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87757YcL extends AbstractC87761YcP {
    @Override // X.AbstractC87761YcP
    public final String LJFF() {
        return "PreDownloadAbility";
    }

    @Override // X.AbstractC87761YcP
    public final void LJII() {
        InterfaceC87766YcU interfaceC87766YcU = this.LJI.LJ;
        if (interfaceC87766YcU != null) {
            interfaceC87766YcU.onStart();
        }
        LJI().LIZ(this.LJI.LIZIZ);
        DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol = this.LJFF;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LIZ(this.LJI);
        }
        DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol2 = this.LJFF;
        if (downloadMobProtocol2 != null) {
            downloadMobProtocol2.LJ();
        }
        LIZJ(this.LJ, "");
    }

    @Override // X.OBL
    public final void cancel() {
        LIZ(this.LJ);
    }

    public C87757YcL(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
    }
}
