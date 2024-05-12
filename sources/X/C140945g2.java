package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.5g2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140945g2 extends AbstractC143185je {
    public final VideoPublishEditModel LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;

    public final void LJII() {
        int i;
        int i2;
        int ceil;
        Integer num;
        if (this.LIZJ) {
            this.LJI = 0;
            this.LJ = 0;
            C41859Gbn LIZIZ = C1I0.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("forceUpdate, canvasWidth: ");
            LIZ.append(this.LJ);
            LIZ.append(", calcTargetWidth: ");
            LIZ.append(this.LJI);
            LIZIZ.LIZJ("VideoSizeProvider", X1D.LIZIZ(LIZ));
            this.LIZJ = false;
        }
        if (this.LJI == 0 || this.LJII == 0) {
            VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
            if (!videoPublishEditModel.isFastImport) {
                this.LJI = videoPublishEditModel.videoWidth();
                this.LJII = this.LIZLLL.videoHeight();
                C41859Gbn LIZIZ2 = C1I0.LIZIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Not FastImport, calcTargetWidth: ");
                LIZ2.append(this.LIZLLL.videoWidth());
                LIZ2.append(",calTargetHeight: ");
                LIZ2.append(this.LIZLLL.videoHeight());
                LIZIZ2.LIZJ("VideoSizeProvider", X1D.LIZIZ(LIZ2));
            } else {
                VESize calcTargetRes = VEUtils.calcTargetRes(new int[]{LJFF(true)}, new int[]{LIZ(true)}, new ROTATE_DEGREE[]{ROTATE_DEGREE.ROTATE_NONE}, videoPublishEditModel.getPreviewInfo().getPreviewWidth());
                this.LJI = calcTargetRes.width;
                this.LJII = calcTargetRes.height;
                C41859Gbn LIZIZ3 = C1I0.LIZIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Not FastImport, calcTargetWidth: ");
                LIZ3.append(this.LJI);
                LIZ3.append(",calTargetHeight: ");
                LIZ3.append(this.LJII);
                LIZ3.append(", srcWidth: ");
                LIZ3.append(LJFF(true));
                LIZ3.append(", srcHeight: ");
                LIZ3.append(LIZ(true));
                LIZIZ3.LIZJ("VideoSizeProvider", X1D.LIZIZ(LIZ3));
            }
        }
        if (this.LJ == 0 || this.LJFF == 0) {
            VideoPublishEditModel videoPublishEditModel2 = this.LIZLLL;
            if (videoPublishEditModel2.mIsFromDraft && videoPublishEditModel2.hasStickers()) {
                VideoPublishEditModel videoPublishEditModel3 = this.LIZLLL;
                int i3 = videoPublishEditModel3.mVideoCanvasWidth;
                if (i3 <= 0) {
                    i3 = videoPublishEditModel3.videoWidth();
                }
                this.LJ = i3;
                VideoPublishEditModel videoPublishEditModel4 = this.LIZLLL;
                int i4 = videoPublishEditModel4.mVideoCanvasHeight;
                if (i4 <= 0) {
                    i4 = videoPublishEditModel4.videoHeight();
                }
                this.LJFF = i4;
                C1I0.LIZIZ().LIZJ("VideoSizeProvider", "fromDraft, " + this.LJ + ", videoCanvasWidth: " + this.LIZLLL.mVideoCanvasWidth + ", videoWidth: " + this.LIZLLL.videoWidth());
                C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("VideoSizeProvider", "fromDraft, " + this.LJFF + ", videoCanvasHeight: " + this.LIZLLL.mVideoCanvasHeight + ", videoWidth: " + this.LIZLLL.videoHeight());
                return;
            }
            boolean LIZ4 = C141525gy.LIZ(this.LIZLLL.videoWidth(), this.LIZLLL.videoHeight());
            if (LIZ4) {
                i2 = this.LIZLLL.videoWidth();
            } else {
                int[] LIZLLL = C44739Hh9.LIZLLL();
                if (LIZLLL != null) {
                    i = LIZLLL[0];
                } else {
                    i = 720;
                }
                int videoWidth = this.LIZLLL.videoWidth();
                if (videoWidth <= i) {
                    i = videoWidth;
                }
                i2 = ((i + 16) - 1) & (-16);
            }
            this.LJ = i2;
            if (LIZ4) {
                ceil = this.LIZLLL.videoHeight();
            } else {
                ceil = (int) (Math.ceil(i2 / 9.0d) * 16);
            }
            this.LJFF = ceil;
            C41859Gbn LIZIZ4 = C1I0.LIZIZ();
            StringBuilder sb = new StringBuilder("Not fromDraft, canvasWidth: ");
            sb.append(this.LJ);
            sb.append(", settingsWidth: ");
            int[] LIZLLL2 = C44739Hh9.LIZLLL();
            if (LIZLLL2 != null) {
                num = Integer.valueOf(LIZLLL2[0]);
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(", videoWidth: ");
            sb.append(this.LIZLLL.videoWidth());
            sb.append(", isVideoMatch: ");
            sb.append(LIZ4);
            LIZIZ4.LIZJ("VideoSizeProvider", sb.toString());
            C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("VideoSizeProvider", "Not fromDraft, canvasHeight: " + this.LJFF + ", videoWidth: " + this.LIZLLL.videoHeight() + ", isVideoMatch: " + LIZ4);
        }
    }

    @Override // X.InterfaceC147355qN
    public final int LIZIZ() {
        LJII();
        if (this.LIZIZ) {
            return this.LJ;
        }
        return this.LJI;
    }

    @Override // X.InterfaceC147355qN
    public final int LIZLLL() {
        LJII();
        return this.LJ;
    }

    @Override // X.InterfaceC147355qN
    public final int LJ() {
        LJII();
        if (this.LIZIZ) {
            return this.LJFF;
        }
        return this.LJII;
    }

    @Override // X.InterfaceC147355qN
    public final int LJI() {
        LJII();
        return this.LJFF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140945g2(VideoPublishEditModel editModel) {
        super(editModel);
        o.LJIIIZ(editModel, "editModel");
        this.LIZLLL = editModel;
    }
}
