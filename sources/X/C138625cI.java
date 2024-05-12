package X;

import Y.AfS54S0100000_2;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5cI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138625cI {
    public final VideoPublishEditModel LIZ;

    public C138625cI(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    public final void LIZ(final String avatarPath, String originPath, final InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(avatarPath, "avatarPath");
        o.LJIIIZ(originPath, "originPath");
        CreativeInfo creativeInfo = this.LIZ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
        C138895cj.LIZ(new C138895cj(creativeInfo, new GYB(0)), avatarPath, false, originPath, false, false, 52).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.5VG
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                NLESegment LJI;
                NLESegmentVideo LJJ;
                C5VH c5vh = (C5VH) obj;
                c5vh.LIZ(avatarPath);
                CanvasVideoData LJJJI = C79234V7u.LJJJI(c5vh, C47261Igj.LJJIJ(avatarPath));
                NLEEditor nLEEditor = new NLEEditor();
                nLEEditor.LJI(this.LIZ.nleData);
                NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, nLEEditor.LJ().getMainTrack().LJIILL());
                if (nLETrackSlot != null && (LJI = nLETrackSlot.LJI()) != null && (LJJ = NLESegmentVideo.LJJ(LJI)) != null) {
                    NLEResourceAV LJ = LJJ.LJ();
                    if (LJ != null) {
                        LJ.LJIIIZ(c5vh.LIZ);
                    }
                    NLEStyCanvas LJJI = LJJ.LJJI();
                    if (LJJI != null) {
                        NLEEditorJniJNI.NLEStyCanvas_setStartColor(LJJI.LIZ, LJJI, c5vh.LIZIZ.getFirst().intValue());
                    }
                    NLEStyCanvas LJJI2 = LJJ.LJJI();
                    if (LJJI2 != null) {
                        NLEEditorJniJNI.NLEStyCanvas_setEndColor(LJJI2.LIZ, LJJI2, c5vh.LIZIZ.getSecond().intValue());
                    }
                }
                nLEEditor.LIZIZ();
                nLEEditor.LIZJ();
                this.LIZ.nleData = nLEEditor.LJIIIIZZ();
                this.LIZ.canvasVideoData = LJJJI;
                interfaceC88472Yns.invoke(Boolean.TRUE);
            }
        }, new AfS54S0100000_2(interfaceC88472Yns, 35));
    }
}
