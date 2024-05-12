package X;

import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;

/* renamed from: X.H9w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43616H9w implements HA6 {
    public final /* synthetic */ C43617H9x LIZ;
    public final /* synthetic */ HAX LIZIZ;
    public final /* synthetic */ ShortVideoContext LIZJ;
    public final /* synthetic */ IPhotoPreDownloadMusic LIZLLL = null;
    public final /* synthetic */ List<String> LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ InterfaceC42275GiV LJI;

    @Override // X.HA6
    public final void onFailed() {
        C43617H9x.LIZJ(1, this.LIZ.LJIILIIL, this.LJ.size());
        InterfaceC42275GiV interfaceC42275GiV = this.LJI;
        if (interfaceC42275GiV != null) {
            interfaceC42275GiV.onFinish(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0219  */
    @Override // X.HA6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData r20, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r21, java.lang.String r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43616H9w.LIZ(com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, boolean, boolean):void");
    }

    public C43616H9w(C43617H9x c43617H9x, HAX hax, ShortVideoContext shortVideoContext, List list, String str, InterfaceC42275GiV interfaceC42275GiV) {
        this.LIZ = c43617H9x;
        this.LIZIZ = hax;
        this.LIZJ = shortVideoContext;
        this.LJ = list;
        this.LJFF = str;
        this.LJI = interfaceC42275GiV;
    }
}
