package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.XSe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84860XSe implements XUI {
    public final XU4 LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final C84868XSm LJ;
    public int LJFF;
    public final Context LJI;
    public final C84274X5q LJII;
    public final C51029K0z LJIIIIZZ;
    public C81535VzH LJIIIZ;

    @Override // X.XUI
    public final void release() {
        this.LJII.LIZJ();
        C81535VzH c81535VzH = this.LJIIIZ;
        if (c81535VzH != null) {
            c81535VzH.destroy();
        }
    }

    public static String LJ(MusicModel musicModel) {
        if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
            return V0N.LJJIZ(musicModel.getReuseAudioPlayUrl());
        }
        return V0N.LJJIZ(musicModel.getUrl());
    }

    @Override // X.XUI
    public final void LIZ(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        this.LJII.LIZIZ(musicId);
        C81535VzH c81535VzH = this.LJIIIZ;
        if (c81535VzH != null) {
            c81535VzH.destroy();
        }
    }

    @Override // X.XUI
    public final void LIZIZ(int i) {
        this.LJFF = 1;
    }

    public C84860XSe(XU2 xu2, Context context, String str) {
        o.LJIIIZ(context, "context");
        this.LIZ = xu2;
        this.LIZIZ = true;
        this.LIZJ = true;
        this.LIZLLL = str;
        this.LJ = new C84868XSm(context, str, true, true, true);
        this.LJFF = -1;
        this.LJI = C16880lQ.LLLLL(context);
        this.LJII = new C84274X5q();
        this.LJIIIIZZ = new C51029K0z();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    @Override // X.XUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r12, X.InterfaceC84870XSo r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "musicModel"
            r3 = r12
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.XSj r4 = new X.XSj
            X.XU9 r13 = (X.XU9) r13
            r5 = r11
            r4.<init>(r13, r5, r3, r15)
            java.lang.String r0 = "SimPlayerMusicFetcher: using SimPlayerMusicFetcher download music"
            X.H7B.LIZ(r0)
            long r9 = java.lang.System.currentTimeMillis()
            X.XPS r0 = X.XPS.LIZLLL()
            java.lang.String r1 = r0.LIZ()
            boolean r0 = X.C30581Hy.LJII(r1)
            if (r0 != 0) goto L28
            X.C30581Hy.LJIIJ(r1)
        L28:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r2 = r3.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.REUSE_AUDIO
            r1 = 0
            if (r2 != r0) goto L64
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.getReuseAudioPlayUrl()
            if (r0 == 0) goto L6f
            java.util.List r2 = r0.getUrlList()
        L3b:
            if (r2 == 0) goto L70
            java.lang.Object r8 = X.ORZ.LJLLLL(r2)
            java.lang.String r8 = (java.lang.String) r8
        L43:
            X.XPS r0 = X.XPS.LIZLLL()
            if (r2 == 0) goto L4f
            java.lang.Object r1 = X.ORZ.LJLLLL(r2)
            java.lang.String r1 = (java.lang.String) r1
        L4f:
            java.lang.String r6 = r0.LIZJ(r1)
            boolean r7 = X.C30581Hy.LJII(r6)
            X.K0z r1 = r5.LJIIIIZZ
            r1.getClass()
            X.VzH r0 = new X.VzH
            r0.<init>(r1)
            r5.LJIIIZ = r0
            goto L72
        L64:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.getUrl()
            if (r0 == 0) goto L6f
            java.util.List r2 = r0.getUrlList()
            goto L3b
        L6f:
            r2 = r1
        L70:
            r8 = r1
            goto L43
        L72:
            r0.LIZJ()     // Catch: java.lang.Throwable -> L7a
            boolean r0 = LJII(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7a
            return r0
        L7a:
            r1 = move-exception
            boolean r0 = r1 instanceof X.C81538VzK
            if (r0 == 0) goto L86
            X.VzK r1 = (X.C81538VzK) r1
            java.lang.Throwable r0 = r1.getRealThrowable()
            throw r0
        L86:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84860XSe.LIZJ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, X.XSo, boolean, boolean):boolean");
    }

    public static final boolean LJII(MusicModel musicModel, C84865XSj c84865XSj, C84860XSe c84860XSe, String destPath, boolean z, String str, long j) {
        XTC LIZ = C84869XSn.LIZ(musicModel, c84865XSj, c84860XSe.LIZLLL, "simplayer");
        LIZ.onStart();
        if (!XU0.LIZ(musicModel, c84860XSe.LJI, c84860XSe.LIZIZ)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SimPlayerMusicFetcher music id is invalid: ");
            LIZ2.append(musicModel.getId());
            LIZ.LIZ(new XSX(5, X1D.LIZIZ(LIZ2)));
            H7B.LIZJ("SimPlayerMusicFetcher download not online music");
            return false;
        }
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("SimPlayerMusicFetcher music id is empty error, name: ");
            String name = musicModel.getName();
            String str2 = "";
            if (name == null) {
                name = "";
            }
            LIZ3.append(name);
            LIZ.LIZ(new XSX(4, X1D.LIZIZ(LIZ3)));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("SimPlayerMusicFetcher music id is empty, name: ");
            String name2 = musicModel.getName();
            if (name2 == null) {
                name2 = "";
            }
            LIZ4.append(name2);
            LIZ4.append(", artist: ");
            String singer = musicModel.getSinger();
            if (singer != null) {
                str2 = singer;
            }
            LIZ4.append(str2);
            H7B.LIZJ(X1D.LIZIZ(LIZ4));
            return false;
        }
        if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE || musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
            String musicId = musicModel.getMusicId();
            String LJJIZ = V0N.LJJIZ(musicModel.getUrl());
            C48137Iur.LIZIZ(musicId, c84860XSe.LIZLLL, LJJIZ, V0N.LJJIZ(musicModel.getStrongBeatUrl()));
            StringBuilder LIZ5 = X1D.LIZ();
            YE1.LIZLLL(LIZ5, c84860XSe.LIZLLL, ", MusicDownloadStart: musicId=", musicId, ", url=");
            LIZ5.append(LJJIZ);
            LIZ5.append(',');
            C36922EeM.LJ(X1D.LIZIZ(LIZ5));
            if (c84860XSe.LIZJ && musicModel.getStrongBeatUrl() != null) {
                String musicDownloadPath = MusicService.LJJLIIIJJI().LIZJ(musicModel);
                UrlModel strongBeatUrl = musicModel.getStrongBeatUrl();
                o.LJIIIIZZ(strongBeatUrl, "musicModel.strongBeatUrl");
                o.LJIIIIZZ(musicDownloadPath, "musicDownloadPath");
                String musicId2 = musicModel.getMusicId();
                o.LJIIIIZZ(musicId2, "musicModel.musicId");
                C84271X5n c84271X5n = new C84271X5n(strongBeatUrl, musicDownloadPath, musicId2, new CountDownLatch(0));
                C84274X5q pool = c84860XSe.LJII;
                o.LJIIIZ(pool, "pool");
                c84271X5n.LJI = pool;
                c84271X5n.LIZ();
            }
            XTH xth = new XTH(LIZ);
            o.LJIIIIZZ(destPath, "destPath");
            long LIZ6 = PO9.LIZ(destPath);
            if (z) {
                c84860XSe.LIZLLL(musicModel, destPath, str, LIZ6, -1L, z, LIZ, xth);
                return true;
            }
            XU4 xu4 = c84860XSe.LIZ;
            String musicId3 = musicModel.getMusicId();
            o.LJIIIIZZ(musicId3, "musicModel.musicId");
            xu4.LIZ(musicId3, destPath, new C84862XSg(j, LIZ6, xth, c84860XSe, LIZ, musicModel, destPath, str, false));
            return true;
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("SimPlayerMusicFetcher music not support download: ");
        LIZ7.append(musicModel.getId());
        LIZ.LIZ(new XSX(6, X1D.LIZIZ(LIZ7)));
        H7B.LIZJ("SimPlayerMusicFetcher download not online music");
        return false;
    }

    public final void LIZLLL(MusicModel musicModel, String str, String str2, long j, long j2, boolean z, InterfaceC84870XSo interfaceC84870XSo, XTH xth) {
        AVExternalServiceImpl.LIZ().abilityService().infoService().audioLegal(str, this.LJFF, new C84861XSf(j, j2, xth, this, interfaceC84870XSo, musicModel, str2, str, z));
    }

    public final void LJFF(Integer num, String str, String str2, int i, long j, String str3, String str4, String str5, boolean z, boolean z2) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        C78886Uxe.LJJJJ(i2, str, str4, str5, this.LIZLLL, str2, j, str3, i, z, z2);
        Context appContext = this.LJI;
        o.LJIIIIZZ(appContext, "appContext");
        C48137Iur.LIZ(str4, this.LIZLLL, str5, str, appContext);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL);
        LIZ.append(", MusicDownloadError: errocode=");
        LIZ.append(num);
        LIZ.append("errorMsg=");
        YE1.LIZLLL(LIZ, str, "musicId=", str4, ", url=");
        YE1.LIZLLL(LIZ, str5, ", curUrl=", str2, " isPrivate=");
        LIZ.append(z);
        LIZ.append(" fileMagic=");
        LIZ.append(str3);
        LIZ.append(" fileSize=");
        C06510Nj.LIZIZ(LIZ, j, " veErrorCode=", i);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
    }
}
