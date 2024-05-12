package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.LoudnessDetectResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5XD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XD extends C5XC {
    public final InterfaceC153045zY LIZIZ;
    public final double LIZJ;

    @Override // X.C5XC
    public final List<C5XE> LIZ() {
        String videoPath;
        NLEModel LJ;
        NLETrack mainTrack;
        String uuid;
        List<String> sourceInfo;
        CanvasVideoData canvasVideoData;
        CanvasExtra extra;
        ForwardCanvasExtra forwardCanvasExtra;
        NLEModel LJ2;
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        long j;
        long j2;
        NLEModel LJ3;
        NLETrack mainTrack2;
        String uuid2;
        NLEModel LJ4;
        VecNLETrackSPtr tracks2;
        NLETrack nLETrack2;
        ArrayList arrayList = new ArrayList();
        C122034qd LJJI = C17N.LJJI(this.LIZIZ);
        if (LJJI != null) {
            C122004qa LJ5 = LJJI.LJFF().LJ(EnumC122254qz.ORIGIN_VOICE_CONVERSION);
            if (LJ5 != null) {
                C5XE c5xe = new C5XE();
                c5xe.LIZ = LJ5.LIZ;
                c5xe.LIZIZ = (int) LJ5.LJ;
                c5xe.LIZJ = (int) LJ5.LJFF;
                c5xe.LIZLLL = this.LIZJ;
                NLEEditor nLEEditor = LJJI.LJIIJ;
                if (nLEEditor != null && (LJ4 = nLEEditor.LJ()) != null && (tracks2 = LJ4.getTracks()) != null) {
                    Iterator<NLETrack> it = tracks2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            nLETrack2 = it.next();
                            if (o.LJ(nLETrack2.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                                break;
                            }
                        } else {
                            nLETrack2 = null;
                            break;
                        }
                    }
                    NLETrack nLETrack3 = nLETrack2;
                    if (nLETrack3 != null) {
                        String uuid3 = nLETrack3.getUUID();
                        o.LJIIIIZZ(uuid3, "this.uuid");
                        c5xe.LJFF = uuid3;
                    }
                }
                c5xe.LJI = 0;
                if (c5xe.LIZ != null && c5xe.LJFF.length() > 0) {
                    arrayList.add(c5xe);
                }
            } else {
                int i = 0;
                for (EditVideoSegment editVideoSegment : this.LIZ.getPreviewInfo().getVideoList()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        EditVideoSegment editVideoSegment2 = editVideoSegment;
                        C5XE c5xe2 = new C5XE();
                        String str = "";
                        if (this.LIZ.realHasOriginalSound()) {
                            c5xe2.LIZ = editVideoSegment2.getAudioPath();
                            c5xe2.LIZIZ = 0;
                            c5xe2.LIZJ = this.LIZIZ.getDuration();
                            c5xe2.LIZLLL = this.LIZJ;
                            if (this.LIZ.isStitchMode()) {
                                NLEEditor nLEEditor2 = LJJI.LJIIJ;
                                if (nLEEditor2 != null && (LJ3 = nLEEditor2.LJ()) != null && (mainTrack2 = LJ3.getMainTrack()) != null && (uuid2 = mainTrack2.getUUID()) != null) {
                                    str = uuid2;
                                }
                                c5xe2.LJFF = str;
                            } else {
                                NLEEditor nLEEditor3 = LJJI.LJIIJ;
                                if (nLEEditor3 != null && (LJ2 = nLEEditor3.LJ()) != null && (tracks = LJ2.getTracks()) != null) {
                                    Iterator<NLETrack> it2 = tracks.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            nLETrack = it2.next();
                                            if (o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name())) {
                                                break;
                                            }
                                        } else {
                                            nLETrack = null;
                                            break;
                                        }
                                    }
                                    NLETrack nLETrack4 = nLETrack;
                                    if (nLETrack4 != null) {
                                        String uuid4 = nLETrack4.getUUID();
                                        o.LJIIIIZZ(uuid4, "this.uuid");
                                        c5xe2.LJFF = uuid4;
                                        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LJLLLLLL(i, nLETrack4.LJIILL());
                                        if (nLETimeSpaceNode != null) {
                                            j = nLETimeSpaceNode.getStartTime();
                                        } else {
                                            j = 0;
                                        }
                                        c5xe2.LJIIIIZZ = j;
                                        if (nLETimeSpaceNode != null) {
                                            j2 = nLETimeSpaceNode.getEndTime();
                                        } else {
                                            j2 = 0;
                                        }
                                        c5xe2.LJIIIZ = j2;
                                    }
                                }
                            }
                        } else {
                            if (H7R.LJJIL(this.LIZ)) {
                                CanvasVideoData canvasVideoData2 = this.LIZ.canvasVideoData;
                                if (canvasVideoData2 != null && (sourceInfo = canvasVideoData2.getSourceInfo()) != null) {
                                    videoPath = (String) ORZ.LJLLLL(sourceInfo);
                                } else {
                                    videoPath = null;
                                }
                            } else {
                                videoPath = editVideoSegment2.getVideoPath();
                            }
                            c5xe2.LIZ = videoPath;
                            c5xe2.LIZIZ = 0;
                            c5xe2.LIZJ = this.LIZIZ.getDuration();
                            c5xe2.LIZLLL = this.LIZJ;
                            NLEEditor nLEEditor4 = LJJI.LJIIJ;
                            if (nLEEditor4 != null && (LJ = nLEEditor4.LJ()) != null && (mainTrack = LJ.getMainTrack()) != null && (uuid = mainTrack.getUUID()) != null) {
                                str = uuid;
                            }
                            c5xe2.LJFF = str;
                        }
                        if (C79004UzY.LJJIIJ(this.LIZ.canvasVideoData) && (canvasVideoData = this.LIZ.canvasVideoData) != null && (extra = canvasVideoData.getExtra()) != null && (forwardCanvasExtra = extra.getForwardCanvasExtra()) != null) {
                            c5xe2.LIZLLL = forwardCanvasExtra.getTargetVolumeLoud();
                        }
                        c5xe2.LJI = 0;
                        if (c5xe2.LIZ != null && c5xe2.LJFF.length() > 0) {
                            arrayList.add(c5xe2);
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            return arrayList;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C5XC
    public final LoudnessDetectResult LIZIZ(C5XE c5xe) {
        if (C79004UzY.LJIIZILJ(this.LIZ.canvasVideoData) != null) {
            return C79004UzY.LJIIZILJ(this.LIZ.canvasVideoData);
        }
        com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult loudnessDetectResult = this.LIZ.creativeModel.loudnessBalanceModel.loudnessMap.get(c5xe.LIZ);
        if (loudnessDetectResult != null && loudnessDetectResult.result == 0) {
            LoudnessDetectResult loudnessDetectResult2 = new LoudnessDetectResult();
            loudnessDetectResult2.result = 0;
            loudnessDetectResult2.avgLoudness = loudnessDetectResult.avgLoudness;
            loudnessDetectResult2.peakLoudness = loudnessDetectResult.peakLoudness;
            return loudnessDetectResult2;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5XD(InterfaceC153045zY editor, VideoPublishEditModel editModel) {
        super(editor, editModel);
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(editModel, "editModel");
        this.LIZIZ = editor;
        this.LIZJ = -12.0d;
    }
}
