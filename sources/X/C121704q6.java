package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4q6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121704q6 extends AbstractC121974qX {
    public final C121914qR LIZIZ;

    public C121704q6(C121914qR params) {
        o.LJIIIZ(params, "params");
        this.LIZIZ = params;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" 0.init ");
        LIZ.append(params);
        LJFF(X1D.LIZIZ(LIZ));
        if (params.LIZ != null) {
            if (params.LJIILJJIL == null) {
                LJI(" 0.init MusicBgmParams expected has musicId");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("MusicBgmOperation.filePath can not be null");
    }

    @Override // X.AbstractC121974qX
    public final void LIZJ(NLEEditor nleEditor) {
        String str;
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        String str2;
        String str3;
        NLETrackSlot nLETrackSlot2;
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel LJ = nleEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                nLETrack = it.next();
                NLETrack it2 = nLETrack;
                o.LJIIIIZZ(it2, "it");
                if (o.LJ(C77357UXp.LJIILIIL(it2), this.LIZIZ.LJIILIIL.name())) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 != null) {
            Iterator<NLETrackSlot> it3 = nLETrack2.LJIILL().iterator();
            while (true) {
                if (it3.hasNext()) {
                    nLETrackSlot2 = it3.next();
                    if (C62850Ola.LIZLLL(nLETrackSlot2, "it") != null) {
                        break;
                    }
                } else {
                    nLETrackSlot2 = null;
                    break;
                }
            }
            nLETrackSlot = nLETrackSlot2;
            if (nLETrackSlot == null) {
                nLETrackSlot = null;
            }
        } else {
            nLETrack2 = null;
            nLETrackSlot = null;
        }
        StringBuilder sb = new StringBuilder(" 1.find track ");
        if (nLETrack2 != null) {
            str2 = nLETrack2.getUUID();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(" slot ");
        if (nLETrackSlot != null) {
            str3 = nLETrackSlot.getUUID();
        } else {
            str3 = null;
        }
        sb.append(str3);
        LJFF(sb.toString());
        if (nLETrackSlot != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" 2.update ");
            if (nLETrack2 != null) {
                str = nLETrack2.getUUID();
            }
            LIZ.append(str);
            LIZ.append(" slot ");
            LIZ.append(nLETrackSlot.getUUID());
            LIZ.append(' ');
            LJFF(X1D.LIZIZ(LIZ));
            LJII(nLETrackSlot);
        }
    }

    public final void LJII(NLETrackSlot nLETrackSlot) {
        int NLESegmentAudio_REPEAT_NORMAL_get;
        EnumC123874tb enumC123874tb;
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
        if (LIZLLL != null) {
            if (this.LIZIZ.LJIILLIIL) {
                NLESegmentAudio_REPEAT_NORMAL_get = NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get();
            } else {
                NLESegmentAudio_REPEAT_NORMAL_get = NLEEditorJniJNI.NLESegmentAudio_REPEAT_NORMAL_get();
            }
            NLEEditorJniJNI.NLESegmentAudio_setRepeatCount(LIZLLL.LIZJ, LIZLLL, NLESegmentAudio_REPEAT_NORMAL_get);
            NLEResourceAV LJ = LIZLLL.LJ();
            if (LJ != null) {
                EnumC121684q4 enumC121684q4 = this.LIZIZ.LJIIZILJ;
                if (enumC121684q4 != null) {
                    int i = C121694q5.LIZ[enumC121684q4.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                enumC123874tb = EnumC123874tb.MUSIC_MV_AUDIO;
                            }
                        } else {
                            enumC123874tb = EnumC123874tb.ALGORITHM_MV_AUDIO;
                        }
                    } else {
                        enumC123874tb = EnumC123874tb.NORMAL_MV_AUDIO;
                    }
                    LJ.LJIILIIL(enumC123874tb);
                }
                enumC123874tb = EnumC123874tb.AUDIO;
                LJ.LJIILIIL(enumC123874tb);
            }
        }
        String str = this.LIZIZ.LJIILJJIL;
        if (str != null) {
            nLETrackSlot.setExtra("d_bgmId", str);
            if (C5MK.LJI) {
                NLESegment LJI = nLETrackSlot.LJI();
                o.LJIIIIZZ(LJI, "slot.mainSegment");
                if (true ^ o.LJ(str, LJI.LIZIZ().getExtra("biz_res_id"))) {
                    NLESegment LJI2 = nLETrackSlot.LJI();
                    o.LJIIIIZZ(LJI2, "slot.mainSegment");
                    LJI2.LIZIZ().setExtra("biz_res_id", C134305Ow.LIZIZ(str));
                }
            }
        }
        String str2 = this.LIZIZ.LJIILL;
        if (str2 != null) {
            nLETrackSlot.setExtra("d_bgmName", str2);
        }
        new C121354pX(this.LIZIZ);
        C121354pX.LJII(nLETrackSlot, this.LIZIZ);
    }
}
