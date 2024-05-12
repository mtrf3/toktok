package X;

import Y.IDComparatorS35S0000000_7;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFN implements HFZ {
    @Override // X.HFZ
    public final OSZ LIZ(int i, VideoPublishEditModel editModel) {
        int i2;
        long j;
        long j2;
        long j3;
        o.LJIIIZ(editModel, "editModel");
        VideoFileInfo LIZJ = C43495H5f.LIZJ(editModel.mOutputFile);
        if (LIZJ != null) {
            long duration = LIZJ.getDuration();
            if (duration != 0) {
                HashMap<Integer, ArrayList<FrameItem>> framesV1 = editModel.extractFramesModel.getFramesV1();
                if (framesV1 != null) {
                    Iterator<Map.Entry<Integer, ArrayList<FrameItem>>> it = framesV1.entrySet().iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        String str = editModel.extractFramesModel.getSegmentFrameKeys().get(it.next().getKey());
                        if (str != null && str.length() != 0) {
                            List LLILII = ORZ.LLILII(new IDComparatorS35S0000000_7(19), C45804HyK.LJJJZ(editModel, str));
                            long j4 = 0;
                            int i3 = 0;
                            for (Object obj : LLILII) {
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    HFO hfo = (HFO) obj;
                                    if (i3 > 0) {
                                        HFO hfo2 = (HFO) ListProtector.get(LLILII, i3 - 1);
                                        j = hfo.LJLILLLLZI;
                                        j2 = hfo2.LJLILLLLZI;
                                        if (j <= j2) {
                                            i3 = i4;
                                        } else {
                                            long j5 = hfo.LJLIL;
                                            if (j5 > j2) {
                                                j3 = j - j5;
                                                j4 = (long) ((j3 + j4) * hfo.LJLJI);
                                                i3 = i4;
                                            }
                                        }
                                    } else {
                                        j = hfo.LJLILLLLZI;
                                        j2 = hfo.LJLIL;
                                    }
                                    j3 = j - j2;
                                    j4 = (long) ((j3 + j4) * hfo.LJLJI);
                                    i3 = i4;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                            i2 += (((int) j4) / LiveNetAdaptiveHurryTimeSetting.DEFAULT) + 1;
                        }
                    }
                } else {
                    i2 = 0;
                }
                ArrayList<LibraryMaterialInfoSv> arrayList = editModel.libraryMaterialList;
                o.LJIIIIZZ(arrayList, "editModel.libraryMaterialList");
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator<LibraryMaterialInfoSv> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getRawFilePath());
                }
                List<EditVideoSegment> albumUploadVideoSegments = editModel.getEditorProModel().getAlbumUploadVideoSegments();
                ArrayList arrayList3 = new ArrayList();
                for (EditVideoSegment editVideoSegment : albumUploadVideoSegments) {
                    if (!arrayList2.contains(editVideoSegment.getVideoPath())) {
                        arrayList3.add(editVideoSegment);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(C79057V0z.LJJJLIIL((EditVideoSegment) it3.next()));
                }
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList4);
                arrayList5.addAll(C60903NvH.LJIIJJI().LJJIIZ().LIZIZ(editModel.nleData));
                List<EditVideoSegment> canvasShootImageSegments = editModel.getEditorProModel().getCanvasShootImageSegments();
                if (canvasShootImageSegments != null) {
                    ArrayList arrayList6 = new ArrayList(C32I.LJJL(canvasShootImageSegments, 10));
                    Iterator<EditVideoSegment> it4 = canvasShootImageSegments.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(C79057V0z.LJJJLIIL(it4.next()));
                    }
                    arrayList5.addAll(arrayList6);
                }
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    HFP hfp = (HFP) it5.next();
                    C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                    String str2 = hfp.LIZ;
                    c43117Gw5.getClass();
                    if (C43117Gw5.LJIIIZ(str2)) {
                        i2++;
                    } else {
                        i2 += ((int) hfp.LIZJ) / HFU.LIZ;
                    }
                }
                if (i2 == 0) {
                    return new OSZ(9, "concat duration:" + duration);
                }
                if (i < 0) {
                    return new OSZ(9, "concat duration:" + duration + ", cal count:" + i2);
                }
                if (Math.abs(i - i2) > 3) {
                    return new OSZ(7, "concat duration:" + duration + ", cal count:" + i2 + ", frame count:" + i);
                }
                return new OSZ(-1, "");
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("concat file path:");
        LIZ.append(editModel.mOutputFile);
        return new OSZ(5, X1D.LIZIZ(LIZ));
    }
}
