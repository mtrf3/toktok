package X;

import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS21S0010000_2;
import kotlin.jvm.internal.AqS9S0202000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143205jg {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C143215jh.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C135035Rr.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C135025Rq.LJLIL);

    public static final int LIZLLL() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static final int LJ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static final int[] LIZ(int[] iArr) {
        if (!C143225ji.LIZ()) {
            return iArr;
        }
        if (iArr.length != 2) {
            iArr = new int[]{720, 1280};
        }
        int[] iArr2 = {LJ(), C157236Fb.LIZ.LJFF()};
        new AqS149S0200000_2(iArr, iArr2, 102);
        return iArr2;
    }

    public static final int[] LIZIZ(int[] iArr) {
        int[] iArr2 = iArr;
        if (!C143225ji.LIZ()) {
            return iArr2;
        }
        if (iArr2.length != 2) {
            iArr2 = new int[]{720, 1280};
        }
        int LJIIIIZZ = C157236Fb.LIZ.LJIIIIZZ();
        int LJ = LJ();
        int i = iArr2[0];
        int i2 = iArr2[1];
        if (i > i2) {
            int[] iArr3 = {i, ((((iArr2[0] * LJIIIIZZ) / LJ) + 4) - 1) & (-4)};
            new AqS9S0202000_2(LJ, LJIIIIZZ, iArr2, iArr3, 0);
            return iArr3;
        }
        int[] iArr4 = {((((i2 * LJ) / LJIIIIZZ) + 4) - 1) & (-4), i2};
        new AqS9S0202000_2(LJ, LJIIIIZZ, iArr2, iArr4, 1);
        return iArr4;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!C143225ji.LIZ() || !videoPublishEditModel.creativeModel.draftInfoModel.isDraft || videoPublishEditModel.isUploadVideo() || videoPublishEditModel.creativeModel.draftInfoModel.isRecordFullScreen || H7R.LJJJZ(videoPublishEditModel)) {
            return false;
        }
        float previewHeight = videoPublishEditModel.getPreviewInfo().getPreviewHeight() / videoPublishEditModel.getPreviewInfo().getPreviewWidth();
        List<EditVideoSegment> videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        if (!(videoList instanceof Collection) || !videoList.isEmpty()) {
            for (EditVideoSegment editVideoSegment : videoList) {
                if (Math.abs((editVideoSegment.getVideoFileInfo().getHeight() / editVideoSegment.getVideoFileInfo().getWidth()) - previewHeight) >= 0.01d) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        new AqS21S0010000_2(z, 2);
        if (!z) {
            return false;
        }
        return true;
    }

    public static final Size LIZJ(int i, int i2) {
        if (!C143225ji.LIZ()) {
            C5Z5.LIZIZ("fullscreen adaption skip, reason: ab not enabled");
            return null;
        }
        float f = i2 / i;
        if (f < 1.7677777910232544d) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fullscreen adaption skip, reason: video ratio not meet expectation, actual video ratio: ");
            LIZ2.append(f);
            LIZ2.append(", expected ratio (16:9): ");
            LIZ2.append(1.7677777910232544d);
            LIZ2.append(", resolution: ");
            LIZ2.append(i);
            LIZ2.append('x');
            LIZ2.append(i2);
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
            return null;
        }
        C157236Fb c157236Fb = C157236Fb.LIZ;
        if (Math.abs((c157236Fb.LJIIIIZZ() / LJ()) - f) <= 0.01d) {
            return null;
        }
        return new Size(i, ((((c157236Fb.LJIIIIZZ() * i) / LJ()) + 4) - 1) & (-4));
    }
}
