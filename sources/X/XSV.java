package X;

import Y.ACallableS37S0110000_15;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import defpackage.b0;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XSV implements InterfaceC84273X5p {
    public final /* synthetic */ C84856XSa LIZ;

    @Override // X.InterfaceC84273X5p
    public final void onCancel() {
        C84856XSa c84856XSa = this.LIZ;
        C84276X5s c84276X5s = c84856XSa.LJIILLIIL;
        if (c84276X5s != null) {
            String musicId = c84856XSa.LJII;
            o.LJIIIIZZ(musicId, "musicId");
            c84276X5s.LIZIZ(musicId, this.LIZ);
        }
    }

    @Override // X.InterfaceC84273X5p
    public final void onStart() {
        C84856XSa c84856XSa = this.LIZ;
        C84276X5s c84276X5s = c84856XSa.LJIILLIIL;
        if (c84276X5s != null) {
            String musicId = c84856XSa.LJII;
            o.LJIIIIZZ(musicId, "musicId");
            c84276X5s.LIZ(musicId, this.LIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music start, id: ");
        LIZ.append(this.LIZ.LJII);
        LIZ.append(" time: ");
        LIZ.append(System.currentTimeMillis());
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    public XSV(C84856XSa c84856XSa) {
        this.LIZ = c84856XSa;
    }

    @Override // X.InterfaceC84273X5p
    public final void LIZIZ(XAL exception) {
        boolean z;
        o.LJIIIZ(exception, "exception");
        C84856XSa c84856XSa = this.LIZ;
        if (exception.getErrorCode() == 1006 || exception.getErrorCode() == 1007) {
            z = true;
        } else {
            z = false;
        }
        c84856XSa.getClass();
        C10K.LIZIZ(new ACallableS37S0110000_15(c84856XSa, z, 1), C10K.LJIIIIZZ, null);
        C84856XSa.LIZLLL(this.LIZ, Integer.valueOf(exception.getErrorCode()), exception.getErrorMsg(), exception.getErrorUrl(), 56);
        C84856XSa c84856XSa2 = this.LIZ;
        c84856XSa2.LIZIZ.LIZIZ(c84856XSa2.LIZ(Integer.valueOf(exception.getErrorCode())));
        C84856XSa c84856XSa3 = this.LIZ;
        C84276X5s c84276X5s = c84856XSa3.LJIILLIIL;
        if (c84276X5s != null) {
            String musicId = c84856XSa3.LJII;
            o.LJIIIIZZ(musicId, "musicId");
            c84276X5s.LIZIZ(musicId, this.LIZ);
        }
    }

    @Override // X.InterfaceC84273X5p
    public final void onProgress(int i) {
        C84856XSa c84856XSa = this.LIZ;
        if (c84856XSa.LJIIJ) {
            if (i > 99) {
                c84856XSa.LIZIZ.onProgress(99);
                return;
            } else {
                c84856XSa.LIZIZ.onProgress(i);
                return;
            }
        }
        c84856XSa.LIZIZ.onProgress(i);
    }

    @Override // X.InterfaceC84273X5p
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        long j;
        long j2;
        o.LJIIIZ(musicFile, "musicFile");
        long currentTimeMillis = System.currentTimeMillis();
        C84856XSa c84856XSa = this.LIZ;
        long j3 = c84856XSa.LJIILIIL;
        if (j3 < 0) {
            j = -1;
        } else {
            j = currentTimeMillis - j3;
        }
        c84856XSa.LIZIZ().step("av_music_download", "fetch onSuccess");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music onsuccess, id: ");
        b0.LJ(LIZ, this.LIZ.LJII, " ，duration: ", j);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (!C39579Fg7.LIZIZ(musicFile)) {
            C84856XSa c84856XSa2 = this.LIZ;
            c84856XSa2.getClass();
            C10K.LIZIZ(new ACallableS37S0110000_15(c84856XSa2, false, 1), C10K.LJIIIIZZ, null);
            C84856XSa.LIZLLL(this.LIZ, 1063, "file not exist", null, 60);
            C84856XSa c84856XSa3 = this.LIZ;
            c84856XSa3.LIZIZ.LIZIZ(c84856XSa3.LIZ(1063));
            return;
        }
        this.LIZ.getClass();
        try {
            j2 = new File(musicFile).length();
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Download Music, getFileSize fail ");
            LIZ2.append(e.getMessage());
            String msg = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg, "msg");
            C36922EeM.LIZLLL(6, "Music", msg);
            j2 = -1;
        }
        IAVInfoService infoService = ((IExternalService) this.LIZ.LJIILJJIL.getValue()).abilityService().infoService();
        C84856XSa c84856XSa4 = this.LIZ;
        infoService.audioLegal(musicFile, c84856XSa4.LJFF, new XSZ(c84856XSa4, j2, musicFile, j, currentTimeMillis));
    }
}
