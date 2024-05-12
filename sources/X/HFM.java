package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFM implements HFZ {
    @Override // X.HFZ
    public final OSZ LIZ(int i, VideoPublishEditModel editModel) {
        int i2;
        int i3;
        int i4;
        List<HFD> list;
        int i5;
        int i6;
        List<Integer> photoDurationList;
        List<Integer> photoDurationList2;
        List<Integer> photoDurationList3;
        o.LJIIIZ(editModel, "editModel");
        VideoFileInfo LIZJ = C43495H5f.LIZJ(editModel.mOutputFile);
        if (LIZJ != null) {
            long duration = LIZJ.getDuration();
            if (duration != 0) {
                HFB hfb = C43753HFd.LIZ;
                if (hfb != null && (photoDurationList3 = hfb.getPhotoDurationList()) != null) {
                    i2 = photoDurationList3.size();
                } else {
                    i2 = 0;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("photoDurationList.size = ");
                HFB hfb2 = C43753HFd.LIZ;
                if (hfb2 != null && (photoDurationList2 = hfb2.getPhotoDurationList()) != null) {
                    i3 = photoDurationList2.size();
                } else {
                    i3 = 0;
                }
                LIZ.append(i3);
                X1D.LIZIZ(LIZ);
                HFB hfb3 = C43753HFd.LIZ;
                if (hfb3 != null && (photoDurationList = hfb3.getPhotoDurationList()) != null) {
                    Iterator<Integer> it = photoDurationList.iterator();
                    i4 = 0;
                    while (it.hasNext()) {
                        i4 += it.next().intValue();
                    }
                } else {
                    i4 = 0;
                }
                HFB hfb4 = C43753HFd.LIZ;
                if (hfb4 != null) {
                    list = hfb4.getUploadFrameInfoList();
                } else {
                    list = null;
                }
                if (list != null && (!list.isEmpty()) && !editModel.isStoryEditMode) {
                    i5 = 0;
                    for (HFD hfd : list) {
                        String str = hfd.LIZ;
                        C43117Gw5.LIZ.getClass();
                        if (!C43117Gw5.LJIIIZ(str) && !C44694HgQ.LJIJI(str, false)) {
                            HFB hfb5 = C43753HFd.LIZ;
                            if (hfb5 != null && hfb5.getVideoOrigin() == 0) {
                                i6 = (((int) hfd.LIZIZ) / HFU.LIZ) + 1;
                            } else if (hfd.LJ) {
                                i6 = (((int) (((float) hfd.LIZIZ) * hfd.LIZJ)) / LiveNetAdaptiveHurryTimeSetting.DEFAULT) + 1;
                            } else {
                                i6 = 0;
                            }
                            i5 += i6;
                        }
                    }
                } else {
                    HFB hfb6 = C43753HFd.LIZ;
                    if (hfb6 != null && hfb6.getVideoOrigin() == 0) {
                        i5 = ((int) duration) / HFU.LIZ;
                    } else if (editModel.isLibraryMaterialOnly()) {
                        i5 = 0;
                    } else {
                        i5 = ((int) duration) / LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                    }
                }
                int i7 = i2 + i5;
                if (i < 0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("concat duration:");
                    LIZ2.append(duration);
                    LIZ2.append(", photo duration:");
                    LIZ2.append(i4);
                    LIZ2.append(", cal count:");
                    LIZ2.append(i7);
                    return new OSZ(9, X1D.LIZIZ(LIZ2));
                }
                if (Math.abs(i - i7) > 3) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("concat duration:");
                    LIZ3.append(duration);
                    LIZ3.append(", photo duration:");
                    LIZ3.append(i4);
                    C1EU.LIZJ(LIZ3, ", cal count:", i7, ", frame count:", i);
                    return new OSZ(7, X1D.LIZIZ(LIZ3));
                }
                return new OSZ(-1, "");
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("concat file path:");
        LIZ4.append(editModel.mOutputFile);
        return new OSZ(5, X1D.LIZIZ(LIZ4));
    }
}
