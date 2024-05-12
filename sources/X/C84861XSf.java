package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XSf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84861XSf implements IAVInfoService.IGetInfoCallback<Integer> {
    public final /* synthetic */ C84860XSe LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ MusicModel LJ;
    public final /* synthetic */ boolean LJFF;
    public final /* synthetic */ InterfaceC84870XSo LJI;
    public final /* synthetic */ long LJII;
    public final /* synthetic */ XTH LJIIIIZZ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Integer num) {
        Boolean bool;
        int intValue = num.intValue();
        if (intValue < 0) {
            Context appContext = this.LIZ.LJI;
            o.LJIIIIZZ(appContext, "appContext");
            C84860XSe c84860XSe = this.LIZ;
            String str = this.LIZIZ;
            long j = this.LIZJ;
            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
            String str2 = this.LIZLLL;
            c37246Eja.getClass();
            String LJI = C37246Eja.LJI(str2);
            String musicId = this.LJ.getMusicId();
            o.LJIIIIZZ(musicId, "musicModel.musicId");
            C84860XSe c84860XSe2 = this.LIZ;
            MusicModel musicModel = this.LJ;
            c84860XSe2.getClass();
            c84860XSe.LJFF(-2, "", str, intValue, j, LJI, musicId, C84860XSe.LJ(musicModel), this.LJ.isNeedSetCookie(), this.LJFF);
            this.LJI.LIZ(new XSX(-13, "reuse simplayer audition cache failed"));
            return;
        }
        C84860XSe c84860XSe3 = this.LIZ;
        long j2 = this.LJII;
        long j3 = this.LIZJ;
        String musicId2 = this.LJ.getMusicId();
        o.LJIIIIZZ(musicId2, "musicModel.musicId");
        C84860XSe c84860XSe4 = this.LIZ;
        MusicModel musicModel2 = this.LJ;
        c84860XSe4.getClass();
        String LJ = C84860XSe.LJ(musicModel2);
        boolean isNeedSetCookie = this.LJ.isNeedSetCookie();
        C78886Uxe.LJJJJI(j2, j3, LJ, c84860XSe3.LIZLLL, isNeedSetCookie, this.LJFF);
        C48137Iur.LIZJ(musicId2, Long.valueOf(j2), Long.valueOf(j3), c84860XSe3.LIZLLL, LJ);
        StringBuilder LIZ = X1D.LIZ();
        YE1.LIZLLL(LIZ, c84860XSe3.LIZLLL, ", MusicDownloadSuccess: musicId=", musicId2, ", url=");
        YE1.LIZLLL(LIZ, LJ, ", curUrl=", "", " isPrivate=");
        LIZ.append(isNeedSetCookie);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SimPlayerMusicFetcher: download success, duration = ");
        LIZ2.append(this.LJII);
        LIZ2.append(", isHitCache = ");
        LIZ2.append(this.LJFF);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        XTH xth = this.LJIIIIZZ;
        String str3 = this.LIZLLL;
        if (!this.LJFF) {
            bool = null;
        } else {
            bool = Boolean.TRUE;
        }
        xth.LIZIZ(str3, null, bool);
    }

    public C84861XSf(long j, long j2, XTH xth, C84860XSe c84860XSe, InterfaceC84870XSo interfaceC84870XSo, MusicModel musicModel, String str, String str2, boolean z) {
        this.LIZ = c84860XSe;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJ = musicModel;
        this.LJFF = z;
        this.LJI = interfaceC84870XSo;
        this.LJII = j2;
        this.LJIIIIZZ = xth;
    }
}
