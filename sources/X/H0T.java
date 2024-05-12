package X;

import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import org.json.JSONArray;
import v5.n;

/* loaded from: classes8.dex */
public final class H0T implements FUZ {
    public final /* synthetic */ AbstractImageUploader LIZ;
    public final /* synthetic */ HGA LIZIZ;
    public final /* synthetic */ n LIZJ;
    public final /* synthetic */ VideoFramesUploadService LIZLLL;

    @Override // X.FUZ
    public final void onLog(int i, int i2, String str) {
    }

    @Override // X.FUZ
    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
        long j2;
        String str;
        this.LIZ.LJ();
        if (i == 6) {
            this.LIZ.LIZJ();
            HGA hga = this.LIZIZ;
            if (imageUploadInfo != null) {
                str = imageUploadInfo.getMImageToskey();
            } else {
                str = null;
            }
            hga.LJ = str;
            this.LIZJ.LIZJ(this.LIZIZ);
            return;
        }
        this.LIZ.LJFF();
        if (i != 7) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        this.LIZ.LIZJ();
        VideoFramesUploadService videoFramesUploadService = this.LIZLLL;
        HGA hga2 = this.LIZIZ;
        long j3 = 0;
        if (imageUploadInfo != null) {
            j2 = imageUploadInfo.getMErrorCode();
        } else {
            j2 = 0;
        }
        StringBuilder LJ = C7MY.LJ("what : ", i, ", code: ");
        if (imageUploadInfo != null) {
            j3 = imageUploadInfo.getMErrorCode();
        }
        LJ.append(j3);
        LJ.append(", events: ");
        LJ.append(jSONArray);
        String LIZIZ = X1D.LIZIZ(LJ);
        videoFramesUploadService.getClass();
        VideoFramesUploadService.LJI(hga2, j2, LIZIZ);
        this.LIZJ.LIZIZ(new IllegalStateException("upload zip file failed"));
    }

    public H0T(VideoFramesUploadService videoFramesUploadService, FUX fux, HGA hga, n nVar) {
        this.LIZLLL = videoFramesUploadService;
        this.LIZ = fux;
        this.LIZIZ = hga;
        this.LIZJ = nVar;
    }
}
