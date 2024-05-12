package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import kotlin.jvm.internal.o;

/* renamed from: X.5g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140955g3 extends AbstractC143185je {
    public final VideoPublishEditModel LIZLLL;
    public int LJ;
    public int LJFF;

    @Override // X.InterfaceC147355qN
    public final int LIZIZ() {
        if (this.LIZIZ) {
            return LIZLLL();
        }
        return this.LIZLLL.videoWidth();
    }

    @Override // X.InterfaceC147355qN
    public final int LIZLLL() {
        if (this.LJ == 0) {
            LJII();
        }
        return this.LJ;
    }

    @Override // X.InterfaceC147355qN
    public final int LJ() {
        if (this.LIZIZ) {
            return LJI();
        }
        return this.LIZLLL.videoHeight();
    }

    @Override // X.InterfaceC147355qN
    public final int LJI() {
        if (this.LJFF == 0) {
            LJII();
        }
        return this.LJFF;
    }

    public final void LJII() {
        int[] LJIIIZ;
        int i;
        int i2;
        int ceil;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel.isPhotoMvMode) {
            this.LJ = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getWidth();
            this.LJFF = ((EditVideoSegment) ListProtector.get(this.LIZLLL.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getHeight();
            return;
        }
        if (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.hasStickers()) {
            VideoPublishEditModel videoPublishEditModel2 = this.LIZLLL;
            int i3 = videoPublishEditModel2.mVideoCanvasWidth;
            if (i3 <= 0) {
                i3 = videoPublishEditModel2.videoWidth();
            }
            this.LJ = i3;
            VideoPublishEditModel videoPublishEditModel3 = this.LIZLLL;
            int i4 = videoPublishEditModel3.mVideoCanvasHeight;
            if (i4 <= 0) {
                i4 = videoPublishEditModel3.videoHeight();
            }
            this.LJFF = i4;
            return;
        }
        boolean LIZ = C141525gy.LIZ(this.LIZLLL.videoWidth(), this.LIZLLL.videoHeight());
        if (LIZ) {
            i2 = this.LIZLLL.videoWidth();
        } else {
            if (this.LIZLLL.isUploadVideo()) {
                LJIIIZ = C44739Hh9.LIZLLL();
            } else {
                LJIIIZ = C44739Hh9.LJIIIZ(H7R.LJJJJI(this.LIZLLL));
            }
            if (LJIIIZ != null) {
                i = LJIIIZ[0];
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
        if (LIZ) {
            ceil = this.LIZLLL.videoHeight();
        } else {
            ceil = (int) (Math.ceil(i2 / 9.0d) * 16);
        }
        this.LJFF = ceil;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140955g3(VideoPublishEditModel editModel) {
        super(editModel);
        o.LJIIIZ(editModel, "editModel");
        this.LIZLLL = editModel;
    }
}
