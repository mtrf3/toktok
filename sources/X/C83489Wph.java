package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.Wph, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83489Wph {
    public String LIZ;
    public String LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public EffectSdkExtra LJ;
    public final long LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;

    public final String LIZ() {
        return this.LJ.getPl().getImgK();
    }

    public final MediaModel LIZJ() {
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.fileLocalUriPath = this.LIZIZ;
        mediaModel.fileName = this.LJIIL;
        mediaModel.width = this.LJIIJ;
        mediaModel.height = this.LJIIJJI;
        mediaModel.duration = this.LJFF;
        mediaModel.mimeType = this.LJIILIIL;
        return mediaModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83489Wph() {
        this.LJ = new EffectSdkExtra(null, 1, 0 == true ? 1 : 0);
        this.LJI = 1;
        this.LJIIIIZZ = "unknown";
        this.LJIIIZ = -1;
    }

    public final void LIZIZ(String sdkExtra) {
        o.LJIIIZ(sdkExtra, "sdkExtra");
        if (TextUtils.isEmpty(sdkExtra)) {
            return;
        }
        try {
            Object LJI = C82891Wg3.LIZJ().LJI(sdkExtra, EffectSdkExtra.class);
            o.LJIIIIZZ(LJI, "CukaieManifest.gson.from…fectSdkExtra::class.java)");
            this.LJ = (EffectSdkExtra) LJI;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83489Wph(String imgPath, String algorithmName) {
        o.LJIIIZ(imgPath, "imgPath");
        o.LJIIIZ(algorithmName, "algorithmName");
        this.LJ = new EffectSdkExtra(null, 1, 0 == true ? 1 : 0);
        this.LJI = 1;
        this.LJIIIIZZ = "unknown";
        this.LJIIIZ = -1;
        this.LIZIZ = imgPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83489Wph(String str, long j) {
        this.LJ = new EffectSdkExtra(null, 1, 0 == true ? 1 : 0);
        this.LJI = 1;
        this.LJIIIIZZ = "unknown";
        this.LJIIIZ = -1;
        this.LIZIZ = str;
        this.LJFF = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83489Wph(String imgPath, String algorithmName, int i) {
        o.LJIIIZ(imgPath, "imgPath");
        o.LJIIIZ(algorithmName, "algorithmName");
        this.LJ = new EffectSdkExtra(null, 1, 0 == true ? 1 : 0);
        this.LJI = 1;
        this.LJIIIIZZ = "unknown";
        this.LJIIIZ = -1;
        this.LIZIZ = imgPath;
        this.LIZJ = i;
    }
}
