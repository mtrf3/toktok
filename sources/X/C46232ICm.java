package X;

import com.ss.android.ugc.aweme.sticker.channel.download.DownloadRequest;
import com.ss.android.ugc.aweme.sticker.channel.download.DownloadResult;
import defpackage.i0;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.ICm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46232ICm extends C45419Hs7 {
    public final /* synthetic */ DownloadRequest LIZ;
    public final /* synthetic */ LinkedHashMap<DownloadRequest, DownloadResult> LIZIZ;
    public final /* synthetic */ C46231ICl LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ int LJ;

    @Override // X.C45419Hs7
    public final void LIZ() {
        if (this.LJ < this.LIZ.url.size() - 1) {
            this.LIZJ.LJFF(this.LIZLLL, this.LIZ, this.LJ + 1, this.LIZIZ);
        } else {
            this.LIZIZ.put(this.LIZ, new DownloadResult("", 0));
            this.LIZJ.LJ(this.LIZLLL, this.LIZIZ);
        }
    }

    @Override // X.C45419Hs7
    public final void LIZIZ(String str, String fullFilePath) {
        o.LJIIIZ(fullFilePath, "fullFilePath");
        DownloadRequest downloadRequest = this.LIZ;
        if (downloadRequest.needUpzip == 1) {
            LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap = this.LIZIZ;
            this.LIZJ.getClass();
            String LJFF = i0.LJFF(s.LJLLL(fullFilePath, ".zip", fullFilePath), "_unzip");
            C37247Ejb.LIZIZ.getClass();
            C37246Eja.LIZLLL(LJFF);
            C38978FRm.LIZLLL(new File(fullFilePath), new File(LJFF));
            C36871EdX.LJ(fullFilePath);
            linkedHashMap.put(downloadRequest, new DownloadResult(LJFF, 1));
        } else {
            this.LIZIZ.put(downloadRequest, new DownloadResult(fullFilePath, 1));
        }
        this.LIZJ.LJ(this.LIZLLL, this.LIZIZ);
    }

    public C46232ICm(DownloadRequest downloadRequest, LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap, C46231ICl c46231ICl, int i, int i2) {
        this.LIZ = downloadRequest;
        this.LIZIZ = linkedHashMap;
        this.LIZJ = c46231ICl;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
