package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5XJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XJ extends AbstractC143275jn {
    private final C5MG WS() {
        C5MG WS = LLIIZ().WS();
        if (WS != null) {
            return WS;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC143275jn
    public boolean LJLZ() {
        C122034qd LJJI;
        InterfaceC153045zY value = LLIIZ().Kh().getValue();
        if (value == null || (LJJI = C17N.LJJI(value)) == null) {
            return false;
        }
        VecNLETrackSPtr tracks = LJJI.LJIIJ.LJ().getTracks();
        o.LJIIIIZZ(tracks, "nlePro.editor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC143275jn
    public boolean LJZI() {
        boolean z;
        boolean z2;
        AudioRecorderParam audioRecorderParam;
        if (LLIZ().realHasOriginalSound() || ((audioRecorderParam = LLIZ().veAudioRecorderParam) != null && audioRecorderParam.getHasOriginalSound())) {
            z = true;
        } else {
            z = false;
        }
        StitchParams stitchParams = LLIZ().stitchParams;
        if ((((stitchParams != null && stitchParams.getEnableMic()) || LLIZ().isFastImport || LLIZ().isCutSameVideoType() || z || LLIZ().isUploadDuetMode() || (LLIZ().isCurrentAutoCutMode() && HRX.LIZLLL())) && !LLIZ().isMuted) || C44384HbQ.LJLL(LLIZ())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LLIZ().isMuted && LLIZ().creativeModel.micDataModel.isUseAudioGraphWithBgm && WJR.LIZ().enableMicButton) {
            z2 = LLIZ().creativeModel.micDataModel.isUseAudioGraphWithBgm;
        }
        if (LLIZ().isLibraryMaterialUsed() && !LLIZ().isCurrentAutoCutMode()) {
            z2 = !LLIZ().isLibraryPhotoOnly();
        }
        if (!z2 || LLIZ().isGifMaterialOnly()) {
            return false;
        }
        AudioRecorderParam audioRecorderParam2 = LLIZ().veAudioRecorderParam;
        if (audioRecorderParam2 != null && !audioRecorderParam2.getNeedOriginalSound()) {
            return false;
        }
        VideoPublishEditModel LLIZ = LLIZ();
        o.LJIIIZ(LLIZ, "<this>");
        if (LLIZ.creativeModel.musicBuzModel.isStsMuteOriginalSound) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC143275jn
    public void LLJJI() {
        InterfaceC143855kj LLILL;
        InterfaceC143855kj LLILL2;
        C133765Mu c133765Mu;
        C122034qd LJI;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData;
        boolean z;
        NLEModel nLEModel = null;
        if (LLIZ().getEditorProModel().isAdvancedEditDraft()) {
            InterfaceC153045zY value = LLIIZ().Kh().getValue();
            if ((value instanceof C133765Mu) && (c133765Mu = (C133765Mu) value) != null && (LJI = c133765Mu.LJI()) != null) {
                EditorProModel editorProModel = LLIZ().getEditorProModel();
                NLEModel LJ = LJI.LJIIJ.LJ();
                o.LJIIIIZZ(LJ, "editorPro.editor.model");
                editorProModel.setHasAudioInAdvanceEdit(C132385Hm.LJFF(LJ));
                Iterator<NLETrackSlot> it = LJI.LJIIJ.LJ().getMainTrack().LJIILLIIL().iterator();
                int i = 0;
                while (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        NLETrackSlot nLETrackSlot = next;
                        MultiEditVideoRecordData curMultiEditVideoRecordData = LLIZ().getCurMultiEditVideoRecordData();
                        if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null && (multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ORZ.LJLLLLLL(i, list)) != null) {
                            NLESegment LJI2 = nLETrackSlot.LJI();
                            o.LJIIIIZZ(LJI2, "nleTrackSlot.mainSegment");
                            if (C124574uj.LJJIIZI(LJI2) == 0.0f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            multiEditVideoSegmentRecordData.isMute = z;
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        if (C5TH.LIZ(LLIZ()) && (LLILL = LLILL()) != null && LLILL.Xg() && (LLILL2 = LLILL()) != null) {
            LLILL2.LE();
            InterfaceC153045zY value2 = LLIIZ().Kh().getValue();
            if (value2 != null) {
                nLEModel = C17N.LJJ(value2);
            }
            LLILL2.Jp(nLEModel);
        }
        super.LLJJI();
    }

    @Override // X.AbstractC143275jn
    public void LLF(VEVolumeChangeOp volumeChangeOp) {
        o.LJIIIZ(volumeChangeOp, "volumeChangeOp");
        WS().LJIIL(volumeChangeOp);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5XJ(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene, diContainer);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
    }
}
