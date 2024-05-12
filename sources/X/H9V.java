package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import dmt.av.video.SingleImageCoverBitmapData;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9V {
    public final H9W LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final MediaModel LIZLLL;
    public final SingleImageCoverBitmapData LJ;
    public final CanvasVideoData LJFF;
    public final boolean LJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H9V)) {
            return false;
        }
        H9V h9v = (H9V) obj;
        return o.LJ(this.LIZ, h9v.LIZ) && o.LJ(this.LIZIZ, h9v.LIZIZ) && this.LIZJ == h9v.LIZJ && o.LJ(this.LIZLLL, h9v.LIZLLL) && o.LJ(this.LJ, h9v.LJ) && o.LJ(this.LJFF, h9v.LJFF) && this.LJI == h9v.LJI && o.LJ(this.LJII, h9v.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        MediaModel mediaModel = this.LIZLLL;
        int i4 = 0;
        if (mediaModel == null) {
            hashCode = 0;
        } else {
            hashCode = mediaModel.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        SingleImageCoverBitmapData singleImageCoverBitmapData = this.LJ;
        if (singleImageCoverBitmapData == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = singleImageCoverBitmapData.hashCode();
        }
        int hashCode3 = (this.LJFF.hashCode() + ((i5 + hashCode2) * 31)) * 31;
        if (!this.LJI) {
            i = 0;
        }
        int i6 = (hashCode3 + i) * 31;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJII;
        if (interfaceC88472Yns != null) {
            i4 = interfaceC88472Yns.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoCanvasEnterEditParam(coreParam=");
        LIZ.append(this.LIZ);
        LIZ.append(", filePath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", needWaitMusic=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mediaModel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", singleImageCoverBitmapData=");
        LIZ.append(this.LJ);
        LIZ.append(", canvasVideoData=");
        LIZ.append(this.LJFF);
        LIZ.append(", isFromUpload=");
        LIZ.append(this.LJI);
        LIZ.append(", finishListener=");
        return C249109q6.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public H9V(H9W h9w, String filePath, MediaModel mediaModel, SingleImageCoverBitmapData singleImageCoverBitmapData, CanvasVideoData canvasVideoData, boolean z, AqS173S0100000_7 aqS173S0100000_7) {
        o.LJIIIZ(filePath, "filePath");
        o.LJIIIZ(canvasVideoData, "canvasVideoData");
        this.LIZ = h9w;
        this.LIZIZ = filePath;
        this.LIZJ = false;
        this.LIZLLL = mediaModel;
        this.LJ = singleImageCoverBitmapData;
        this.LJFF = canvasVideoData;
        this.LJI = z;
        this.LJII = aqS173S0100000_7;
    }
}
