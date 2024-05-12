package X;

import Y.AfS46S0300000_7;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.LibraryVideo;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HFw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43772HFw extends AbstractC43762HFm {
    public final VideoPublishEditModel LIZLLL;
    public final String LJ;

    @Override // X.HGP
    public final String LIZ() {
        return "extract_library_gallery";
    }

    @Override // X.AbstractC43762HFm
    public final List<HFD> LIZIZ() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.OQg] */
    @Override // X.AbstractC43762HFm
    public final void LJFF(HGQ hgq) {
        ?? r2;
        List LLIIIZ;
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        Integer materialProvider;
        String str;
        ?? arrayList;
        LibraryMaterialInfoSv libraryMaterialInfoSv2;
        Integer materialProvider2;
        super.LJFF(hgq);
        int i = 0;
        if (!AbstractC43762HFm.LIZJ()) {
            hgq.onFinish(false);
            C44422Hc2.LIZJ();
            LJ();
            return;
        }
        if (!this.LIZLLL.hasUploadFrameConditionInEdit() || this.LIZLLL.isCurrentAutoCutMode()) {
            hgq.onFinish(false);
            C44422Hc2.LIZJ();
            LJ();
            return;
        }
        if (this.LIZLLL.getFinalVideoList() == null) {
            LLIIIZ = C61878OQg.INSTANCE;
        } else {
            ArrayList<TimeSpeedModelExtension> finalVideoList = this.LIZLLL.getFinalVideoList();
            o.LJIIIIZZ(finalVideoList, "videoPublishEditModel.finalVideoList");
            ArrayList arrayList2 = new ArrayList();
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (true) {
                String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                TimeSpeedModelExtension next = it.next();
                LibraryVideo libraryVideo = next.getLibraryVideo();
                if (libraryVideo != null) {
                    str2 = libraryVideo.getOriginalImageCopyPath();
                }
                if (C78685UuP.LJJJZ(str2)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                LibraryVideo libraryVideo2 = ((TimeSpeedModelExtension) it2.next()).getLibraryVideo();
                if (libraryVideo2 != null) {
                    str = libraryVideo2.getOriginalImageCopyPath();
                } else {
                    str = null;
                }
                o.LJI(str);
                arrayList3.add(str);
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = this.LIZLLL.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData != null) {
                List LJJIJ = C46104I7o.LJJIJ(curMultiEditVideoRecordData);
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = ((ArrayList) LJJIJ).iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) next2;
                    if (multiEditVideoSegmentRecordData.enable && (libraryMaterialInfoSv = multiEditVideoSegmentRecordData.libraryMaterialInfo) != null && (materialProvider = libraryMaterialInfoSv.getMaterialProvider()) != null && materialProvider.intValue() == 3) {
                        arrayList4.add(next2);
                    }
                }
                r2 = new ArrayList(C32I.LJJL(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    r2.add(((MultiEditVideoSegmentRecordData) it4.next()).videoPath);
                }
            } else {
                r2 = C61878OQg.INSTANCE;
            }
            LLIIIZ = ORZ.LLIIIZ(r2, arrayList3);
        }
        if (this.LIZLLL.getFinalVideoList() == null) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            arrayList = new ArrayList();
            MultiEditVideoRecordData curMultiEditVideoRecordData2 = this.LIZLLL.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData2 != null) {
                List LJJIJ2 = C46104I7o.LJJIJ(curMultiEditVideoRecordData2);
                int size = this.LIZLLL.getFinalVideoList().size();
                for (int i2 = 0; i2 < size; i2++) {
                    TimeSpeedModelExtension segment = (TimeSpeedModelExtension) ListProtector.get(this.LIZLLL.getFinalVideoList(), i2);
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) ListProtector.get(LJJIJ2, i2);
                    o.LJIIIIZZ(segment, "segment");
                    if (C76917UGr.LJJJIL(segment)) {
                        String str3 = multiEditVideoSegmentRecordData2.videoPath;
                        o.LJIIIIZZ(str3, "data.videoPath");
                        arrayList.add(new HG9(str3, (int) multiEditVideoSegmentRecordData2.getStartTime(), (int) multiEditVideoSegmentRecordData2.getEndTime()));
                    }
                }
                Iterator it5 = ((ArrayList) LJJIJ2).iterator();
                while (it5.hasNext()) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 = (MultiEditVideoSegmentRecordData) it5.next();
                    if (multiEditVideoSegmentRecordData3.enable && (libraryMaterialInfoSv2 = multiEditVideoSegmentRecordData3.libraryMaterialInfo) != null && (materialProvider2 = libraryMaterialInfoSv2.getMaterialProvider()) != null && materialProvider2.intValue() == 3) {
                        String str4 = multiEditVideoSegmentRecordData3.videoPath;
                        o.LJIIIIZZ(str4, "data.videoPath");
                        arrayList.add(new HG9(str4, (int) multiEditVideoSegmentRecordData3.getStartTime(), (int) multiEditVideoSegmentRecordData3.getEndTime()));
                    }
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = LLIIIZ.iterator();
        while (it6.hasNext()) {
            arrayList5.add(AbstractC73672Svk.LJIIJ(new C43775HFz((String) it6.next(), this)));
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList6.add(AbstractC73672Svk.LJIIJ(new HG0((HG9) it7.next(), this, i)));
            i++;
        }
        arrayList5.addAll(arrayList6);
        if (arrayList5.isEmpty()) {
            hgq.onFinish(true);
            C44422Hc2.LIZJ();
            LJ();
            return;
        }
        AbstractC73672Svk.LJJIJLIJ(arrayList5).LJJL(T16.LIZ()).LJJJLL(new InterfaceC64592gB() { // from class: X.9Fo
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new AfS46S0300000_7(this, LLIIIZ, hgq, 6), new HGB(this, LLIIIZ, hgq));
    }

    public final void LJI(List<String> list) {
        String str;
        String str2;
        ExtractFramesModel extractFramesModel = this.LIZLLL.extractFramesModel;
        if (extractFramesModel != null) {
            str = extractFramesModel.getExtractFramesDir();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            this.LIZLLL.extractFramesModel = this.LIZ;
        }
        ExtractFramesModel extractFramesModel2 = this.LIZLLL.extractFramesModel;
        if (extractFramesModel2 != null) {
            str2 = extractFramesModel2.getExtractFramesDir();
        } else {
            str2 = null;
        }
        if (C78685UuP.LJJJZ(str2)) {
            String extractFramesDir = this.LIZLLL.extractFramesModel.getExtractFramesDir();
            String separator = File.separator;
            o.LJIIIIZZ(separator, "separator");
            if (!ujb.o.LJJJJ(extractFramesDir, separator, false)) {
                extractFramesDir = i0.LJFF(extractFramesDir, separator);
            }
            File[] listFiles = new File(this.LJ).listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file : listFiles) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(extractFramesDir);
                    LIZ.append(file.getName());
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    C39579Fg7.LIZLLL(file.getAbsolutePath(), LIZIZ);
                    if (this.LIZLLL.extractFramesModel.getFramesV1() != null && (!r0.isEmpty())) {
                        this.LIZLLL.extractFramesModel.addFrameAtLastSegment(new FrameItem(LIZIZ, 0, 0, false, null, null, 62, null));
                    } else {
                        this.LIZLLL.extractFramesModel.addFrameSegment(new ArrayList<>(), null, new ArrayList<>());
                        this.LIZLLL.extractFramesModel.addFrameAtLastSegment(new FrameItem(LIZIZ, 0, 0, false, null, null, 62, null));
                    }
                }
            }
            C39579Fg7.LJIJJLI(this.LJ);
            C39579Fg7.LJIL(this.LJ);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                C39579Fg7.LJIJJLI(new File(it.next()).getParent());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43772HFw(HG7 frameContext, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel.creativeInfo);
        o.LJIIIZ(frameContext, "frameContext");
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        this.LIZLLL = videoPublishEditModel;
        String frameDir = this.LIZIZ.LIZIZ;
        this.LJ = frameDir;
        o.LJIIIIZZ(frameDir, "frameDir");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(frameDir, separator, false)) {
            this.LJ = i0.LJFF(frameDir, separator);
        }
        StringBuilder LIZ = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ, this.LJ, "library_gallery", LIZ);
        this.LJ = LJFF;
        String LJFF2 = i0.LJFF(LJFF, separator);
        this.LJ = LJFF2;
        C1I0.LIZJ(LJFF2);
    }
}
