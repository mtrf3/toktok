package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import dmt.av.video.VEPreviewParams;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.HAr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43637HAr implements InterfaceC43874HJu {
    public final /* synthetic */ C46065I6b LIZ;

    public C43637HAr(C46065I6b c46065I6b) {
        this.LIZ = c46065I6b;
    }

    @Override // X.InterfaceC43874HJu
    public final void LIZ(int i, String str, String str2, String str3) {
        String str4 = str2;
        String str5 = str;
        G8G.LIZ.step("av_video_edit", "concatEnd");
        C43840HIm c43840HIm = new C43840HIm(str5, str4, str3, i);
        MultiEditVideoStatusRecordData LJ = C43832HIe.LJ(this.LIZ.LJLLILLLL, str3);
        if (LJ != null && !this.LIZ.LJLLILLLL.LJJIJIIJI()) {
            Iterator<MultiEditVideoSegmentRecordData> it = LJ.curMultiEditVideoRecordData.segmentDataList.iterator();
            while (true) {
                if (it.hasNext()) {
                    MultiEditVideoSegmentRecordData next = it.next();
                    if (next.enable && next.libraryMaterialInfo == null && (str4 = next.audioPath) != null && (str5 = next.videoPath) != null) {
                        o.LJIIIIZZ(str4, "data.audioPath");
                        break;
                    }
                } else {
                    str4 = "";
                    str5 = "";
                    break;
                }
            }
            if (str5.length() == 0) {
                str5 = c43840HIm.LJLIL;
                o.LJIIIIZZ(str5, "event.videoPath");
            }
            if (str4.length() == 0) {
                str4 = c43840HIm.LJLILLLLZI;
                o.LJIIIIZZ(str4, "event.audioPath");
            }
        } else {
            o.LJIIIIZZ(str5, "event.videoPath");
            o.LJIIIIZZ(str4, "event.audioPath");
        }
        C46065I6b c46065I6b = this.LIZ;
        C43832HIe.LIZLLL(c46065I6b.LJLLI, c46065I6b.LJLLILLLL);
        C43598H9e c43598H9e = new C43598H9e();
        long currentTimeMillis = System.currentTimeMillis();
        C46065I6b c46065I6b2 = this.LIZ;
        C42244Gi0 c42244Gi0 = new C42244Gi0(c43598H9e, currentTimeMillis, c46065I6b2.LJLLILLLL, c46065I6b2.LJLLJ.getCameraFacing(), null, LJ, str5, str4);
        new C43542H7a("VideoRecordNewActivity");
        C46065I6b c46065I6b3 = this.LIZ;
        H9R h9r = c46065I6b3.LLFF;
        ShortVideoContext shortVideoContext = c46065I6b3.LJLLILLLL;
        h9r.getClass();
        VideoPublishEditModel LJI = C43542H7a.LJI(C16880lQ.LLJJIJI(H9R.LJIIIIZZ(c42244Gi0, shortVideoContext)));
        LJI.creativeModel.draftInfoModel.fromDraftPopup = true;
        C44384HbQ.LLJ(LJI);
        H8H.LIZIZ(LJI, "video_shoot_page", false, 60);
        VEPreviewParams LJJJJZ = C78926UyI.LJJJJZ(LJI, 0, 0, 7);
        C135235Sl c135235Sl = new C135235Sl();
        C34432DfI c34432DfI = C34432DfI.LJLIL;
        o.LJIIIZ(c34432DfI, "<set-?>");
        c135235Sl.LIZ = c34432DfI;
        c135235Sl.LIZ(C34433DfJ.LJLIL);
        NLEEditor LJII = C5K2.LIZ(LJI.getVideoEditorType(), c135235Sl).LJII(LJJJJZ);
        LJII.LIZIZ();
        LJII.LIZJ();
        LJI.nleData = LJII.LJIIIIZZ();
        XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C162336Yr(LJI, this.LIZ, null), 3);
    }
}
