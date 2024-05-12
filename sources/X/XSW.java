package X;

import Y.ACallableS37S0110000_15;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XSW implements InterfaceC84870XSo {
    public final /* synthetic */ C84857XSb LIZ;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
        C84857XSb c84857XSb = this.LIZ;
        C84274X5q c84274X5q = c84857XSb.LJIILLIIL;
        if (c84274X5q != null) {
            String musicId = c84857XSb.LJII;
            o.LJIIIIZZ(musicId, "musicId");
            c84274X5q.LIZLLL(musicId, this.LIZ);
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        C84857XSb c84857XSb = this.LIZ;
        C84274X5q c84274X5q = c84857XSb.LJIILLIIL;
        if (c84274X5q != null) {
            String musicId = c84857XSb.LJII;
            o.LJIIIIZZ(musicId, "musicId");
            c84274X5q.LIZ(musicId, this.LIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music start, id: ");
        LIZ.append(this.LIZ.LJII);
        LIZ.append(" time: ");
        LIZ.append(System.currentTimeMillis());
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    public XSW(C84857XSb c84857XSb) {
        this.LIZ = c84857XSb;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX exception) {
        boolean z;
        o.LJIIIZ(exception, "exception");
        C84857XSb c84857XSb = this.LIZ;
        if (exception.getErrorCode() == 1006 || exception.getErrorCode() == 1007) {
            z = true;
        } else {
            z = false;
        }
        c84857XSb.getClass();
        C10K.LIZIZ(new ACallableS37S0110000_15(c84857XSb, z, 0), C10K.LJIIIIZZ, null);
        C84857XSb.LIZLLL(this.LIZ, Integer.valueOf(exception.getErrorCode()), exception.getErrorMsg(), exception.getErrorUrl(), 56);
        C84857XSb c84857XSb2 = this.LIZ;
        c84857XSb2.LIZIZ.LIZ(c84857XSb2.LIZ(Integer.valueOf(exception.getErrorCode())));
        C84857XSb c84857XSb3 = this.LIZ;
        C84274X5q c84274X5q = c84857XSb3.LJIILLIIL;
        if (c84274X5q != null) {
            String musicId = c84857XSb3.LJII;
            o.LJIIIIZZ(musicId, "musicId");
            c84274X5q.LIZLLL(musicId, this.LIZ);
        }
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        C84857XSb c84857XSb = this.LIZ;
        if (c84857XSb.LJIIJ) {
            if (i > 99) {
                c84857XSb.LIZIZ.onProgress(99);
                return;
            } else {
                c84857XSb.LIZIZ.onProgress(i);
                return;
            }
        }
        c84857XSb.LIZIZ.onProgress(i);
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        long j;
        o.LJIIIZ(musicFile, "musicFile");
        long currentTimeMillis = System.currentTimeMillis();
        C84857XSb c84857XSb = this.LIZ;
        long j2 = c84857XSb.LJIILIIL;
        if (j2 < 0) {
            j = -1;
        } else {
            j = currentTimeMillis - j2;
        }
        c84857XSb.LIZIZ().step("av_music_download", "fetch onSuccess");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Music onsuccess, id: ");
        b0.LJ(LIZ, this.LIZ.LJII, " ，duration: ", j);
        LIZ.append(", musicFile:");
        LIZ.append(musicFile);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (!C39579Fg7.LIZIZ(musicFile)) {
            C84857XSb c84857XSb2 = this.LIZ;
            c84857XSb2.getClass();
            C10K.LIZIZ(new ACallableS37S0110000_15(c84857XSb2, false, 0), C10K.LJIIIIZZ, null);
            C84857XSb.LIZLLL(this.LIZ, 1063, "file not exist", null, 60);
            C84857XSb c84857XSb3 = this.LIZ;
            c84857XSb3.LIZIZ.LIZ(c84857XSb3.LIZ(1063));
            return;
        }
        long LIZ2 = PO9.LIZ(musicFile);
        IAVInfoService infoService = ((IExternalService) this.LIZ.LJIILJJIL.getValue()).abilityService().infoService();
        C84857XSb c84857XSb4 = this.LIZ;
        infoService.audioLegal(musicFile, c84857XSb4.LJFF, new XSY(c84857XSb4, LIZ2, musicFile, j, currentTimeMillis, bool));
    }
}
