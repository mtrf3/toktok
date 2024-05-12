package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioLoudnessBalanceFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioSamiFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121624py extends AbstractC121974qX {
    public final String LIZIZ;
    public final C121634pz LIZJ;

    @Override // X.AbstractC121974qX
    public final void LIZJ(NLEEditor nleEditor) {
        String str;
        NLETrack nLETrack;
        NLEFilter nLEFilter;
        String str2;
        float f;
        long j;
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
                if (o.LJ(it2.getUUID(), this.LIZIZ)) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" 1.find track ");
        if (nLETrack2 != null) {
            str = nLETrack2.getUUID();
        }
        LIZ.append(str);
        LJFF(X1D.LIZIZ(LIZ));
        if (nLETrack2 == null) {
            LJFF(" 1.find track null ");
            return;
        }
        C121634pz c121634pz = this.LIZJ;
        AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(this, nLETrack2, 104);
        String str3 = c121634pz.LJIILL;
        o.LJI(str3);
        if (o.LJ(str3, NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER())) {
            LJFF(" 2.add filter AUDIO_LOUDNESS_BALANCE_FILTER ");
            nLEFilter = new NLEFilter();
            NLESegmentAudioLoudnessBalanceFilter nLESegmentAudioLoudnessBalanceFilter = new NLESegmentAudioLoudnessBalanceFilter();
            nLESegmentAudioLoudnessBalanceFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER());
            Double d = c121634pz.LJIIIIZZ;
            o.LJI(d);
            NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setAvgLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter, d.doubleValue());
            Double d2 = c121634pz.LJIIIZ;
            o.LJI(d2);
            NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setPeakLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter, d2.doubleValue());
            Double d3 = c121634pz.LJIIJ;
            o.LJI(d3);
            NLEEditorJniJNI.NLESegmentAudioLoudnessBalanceFilter_setTargetLoudness(nLESegmentAudioLoudnessBalanceFilter.LJ, nLESegmentAudioLoudnessBalanceFilter, d3.doubleValue());
            nLEFilter.LIZJ(nLESegmentAudioLoudnessBalanceFilter);
        } else if (o.LJ(str3, NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER())) {
            LJFF(" 2.add filter AUDIO_SAMI_FILTER ");
            nLEFilter = new NLEFilter();
            NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter();
            nLESegmentAudioSamiFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
            NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiParam(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, c121634pz.LJIILJJIL);
            Integer num = c121634pz.LJIIL;
            o.LJI(num);
            NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiType(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, num.intValue());
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.LJIILIIL(EnumC123874tb.FILTER);
            nLEResourceNode.LJIIIZ(c121634pz.LJIILIIL);
            nLESegmentAudioSamiFilter.LJI(nLEResourceNode);
            nLEFilter.LIZJ(nLESegmentAudioSamiFilter);
        } else if (o.LJ(str3, NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER())) {
            LJFF(" 2.add filter AUDIO_DSP_FILTER ");
            nLEFilter = new NLEFilter();
            NLESegmentFilter nLESegmentFilter = new NLESegmentFilter();
            nLESegmentFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER());
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.LJIILIIL(EnumC123874tb.FILTER);
            nLEResourceNode2.LJIIIZ(c121634pz.LJIIJJI);
            nLESegmentFilter.LJI(nLEResourceNode2);
            nLEFilter.LIZJ(nLESegmentFilter);
        } else if (o.LJ(str3, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER())) {
            nLEFilter = new NLEFilter();
            NLESegmentAudioVolumeFilter nLESegmentAudioVolumeFilter = new NLESegmentAudioVolumeFilter();
            nLESegmentAudioVolumeFilter.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER());
            NLEResourceNode nLEResourceNode3 = new NLEResourceNode();
            nLEResourceNode3.LJIILIIL(EnumC123874tb.FILTER);
            nLESegmentAudioVolumeFilter.LJI(nLEResourceNode3);
            Float f2 = c121634pz.LJII;
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = 0.0f;
            }
            nLESegmentAudioVolumeFilter.LJIIIIZZ(f);
            nLEFilter.LIZJ(nLESegmentAudioVolumeFilter);
        } else {
            LJFF(" 2.add filter AUDIO_COMMON_FILTER ");
            nLEFilter = new NLEFilter();
            NLESegmentFilter nLESegmentFilter2 = new NLESegmentFilter();
            nLESegmentFilter2.LJII(NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER());
            NLEResourceNode nLEResourceNode4 = new NLEResourceNode();
            if (C5MK.LJI) {
                try {
                    str2 = C134305Ow.LIZ(c121634pz.LJFF, c121634pz.LJI);
                } catch (Throwable th) {
                    C82891Wg3.LIZLLL().LIZIZ(th);
                    str2 = "";
                }
                nLEResourceNode4.setExtra("biz_res_id", str2);
            }
            nLEResourceNode4.LJIILIIL(EnumC123874tb.FILTER);
            nLEResourceNode4.LJIIIZ(c121634pz.LIZJ);
            nLESegmentFilter2.LJI(nLEResourceNode4);
            nLEFilter.LIZJ(nLESegmentFilter2);
        }
        Long l = c121634pz.LIZLLL;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        nLEFilter.setStartTime(j * 1000);
        Long l2 = c121634pz.LJ;
        long j2 = -2;
        if (l2 != null && l2.longValue() != -2) {
            Long l3 = c121634pz.LJ;
            o.LJI(l3);
            j2 = l3.longValue() * 1000;
        }
        nLEFilter.setEndTime(j2);
        LJFF(" 3.add filter startTime:" + j + " endTime:" + j2 + ' ');
        nLETrack2.LIZ(nLEFilter);
        aqS133S0200000_2.invoke(nLEFilter);
    }

    public C121624py(String trackUuid, C121634pz c121634pz) {
        o.LJIIIZ(trackUuid, "trackUuid");
        this.LIZIZ = trackUuid;
        this.LIZJ = c121634pz;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" 0.init ");
        LIZ.append(c121634pz);
        LJFF(X1D.LIZIZ(LIZ));
    }
}
