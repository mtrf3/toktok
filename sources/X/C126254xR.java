package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioSamiFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.gamora.editor.audioservice.service.audioenhance.AudioEnhanceSnrModelConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4xR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126254xR extends AbstractC126304xW {
    public final AudioEnhanceSnrModelConfig LIZLLL;
    public String LJ;
    public final List<C121634pz> LJFF;

    @Override // X.AbstractC126304xW
    public final String LJ() {
        return "";
    }

    @Override // X.InterfaceC126544xu
    public final void LIZ() {
        if (this.LIZIZ == null || ((ArrayList) this.LJFF).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) this.LJFF).iterator();
        while (it.hasNext()) {
            LJIIIIZZ((C121634pz) it.next());
        }
        ((ArrayList) this.LJFF).clear();
    }

    @Override // X.InterfaceC126544xu
    public final void LIZJ() {
        String path = this.LJ;
        o.LJIIIZ(path, "path");
        if (C44687HgJ.LIZIZ(path)) {
            C43045Guv.LIZLLL(new AqS152S0100000_2(this, 941), 0L);
            return;
        }
        String str = this.LIZLLL.snrModelName;
        if (str == null) {
            str = "flow_snr_mobile";
        }
        C140485fI.LIZ("", str, new InterfaceC126374xd() { // from class: X.4xT
            @Override // X.InterfaceC126374xd
            public final void onFailure() {
                C126254xR c126254xR = C126254xR.this;
                c126254xR.LJ = "";
                C43045Guv.LIZLLL(new AqS152S0100000_2(c126254xR, 942), 0L);
            }

            @Override // X.InterfaceC126374xd
            public final void onSuccess(String str2) {
                C126254xR c126254xR = C126254xR.this;
                c126254xR.LJ = str2;
                C43045Guv.LIZLLL(new AqS152S0100000_2(c126254xR, 943), 0L);
            }
        });
    }

    @Override // X.AbstractC126304xW
    public final String LIZLLL() {
        String str = this.LIZLLL.modelName;
        if (str == null) {
            return "tcnunet_denoise_espresso_44k_music_middle";
        }
        return str;
    }

    public final void LJFF() {
        boolean z;
        if (this.LIZIZ == null) {
            return;
        }
        LIZ();
        if (this.LIZLLL.enableSNR == 1) {
            z = true;
        } else {
            z = false;
        }
        String str = this.LIZJ;
        EnumC123874tb enumC123874tb = EnumC123874tb.FILTER;
        String NLEFilterName_getAUDIO_SAMI_FILTER = NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER();
        o.LJIIIIZZ(NLEFilterName_getAUDIO_SAMI_FILTER, "getAUDIO_SAMI_FILTER()");
        int NLESegmentAudioSamiFilter_TYPE_CE_DENOISE_get = NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_CE_DENOISE_get();
        AudioEnhanceSnrModelConfig audioEnhanceSnrModelConfig = this.LIZLLL;
        String str2 = audioEnhanceSnrModelConfig.samiDenoiseLevel;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = audioEnhanceSnrModelConfig.samiConfigInfo;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = audioEnhanceSnrModelConfig.samiSnr;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str2;
        C126264xS c126264xS = new C126264xS(z, str, enumC123874tb, NLEFilterName_getAUDIO_SAMI_FILTER, NLESegmentAudioSamiFilter_TYPE_CE_DENOISE_get, str6, str4, str5, this.LJ);
        C122034qd LJJI = C17N.LJJI(this.LIZIZ);
        if (LJJI != null) {
            NLEModel LJ = LJJI.LJIIJ.LJ();
            if (this.LIZ.audioEnhanceParam.getEnableOriginEnhance()) {
                if (this.LIZ.isFastImport) {
                    String uuid = LJ.getMainTrack().getUUID();
                    o.LJIIIIZZ(uuid, "nleModel.mainTrack.uuid");
                    LJI(uuid, c126264xS);
                } else {
                    Iterator<NLETrack> it = LJ.getTracks().iterator();
                    String str7 = "";
                    while (it.hasNext()) {
                        NLETrack next = it.next();
                        if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name())) {
                            str7 = next.getUUID();
                            o.LJIIIIZZ(str7, "track.uuid");
                        }
                    }
                    if (str7.length() > 0) {
                        LJI(str7, c126264xS);
                    }
                }
            }
            if (this.LIZ.audioEnhanceParam.getEnableMusicEnhance()) {
                Iterator<NLETrack> it2 = LJ.getTracks().iterator();
                while (it2.hasNext()) {
                    NLETrack next2 = it2.next();
                    if (o.LJ(next2.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                        str3 = next2.getUUID();
                        o.LJIIIIZZ(str3, "track.uuid");
                    }
                }
                if (str3.length() > 0) {
                    LJI(str3, c126264xS);
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJII() {
        InterfaceC153045zY interfaceC153045zY = this.LIZIZ;
        if (interfaceC153045zY == null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
        if (LJJI != null) {
            VecNLETrackSPtr allTracks = LJJI.LJIIJ.LJ().getTracks();
            try {
                o.LJIIIIZZ(allTracks, "allTracks");
                Iterator<NLETrack> it = allTracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    if (!next.LJIIIZ().isEmpty()) {
                        Iterator<NLEFilter> it2 = next.LJIIIZ().iterator();
                        while (it2.hasNext()) {
                            NLEFilter nleFilter = it2.next();
                            if (nleFilter != null) {
                                o.LJIIIIZZ(nleFilter, "nleFilter");
                                if (nleFilter.hasExtra("filter_segment_class") && o.LJ(nleFilter.getExtra("filter_segment_class"), "denoise_snr_filter")) {
                                    List<C121634pz> list = this.LJFF;
                                    C121634pz c121634pz = new C121634pz(null);
                                    c121634pz.LIZ = next.getUUID();
                                    c121634pz.LIZIZ = nleFilter.getUUID();
                                    ((ArrayList) list).add(c121634pz);
                                }
                            }
                        }
                    }
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC126544xu
    public final void P6() {
        AudioEnhanceParam audioEnhanceParam = this.LIZ.audioEnhanceParam;
        o.LJIIIIZZ(audioEnhanceParam, "model.audioEnhanceParam");
        if (C78685UuP.LJJIFFI(audioEnhanceParam)) {
            if (this.LIZIZ != null) {
                if (!this.LIZ.mIsFromDraft) {
                    LIZIZ(null);
                    return;
                } else {
                    C43045Guv.LIZLLL(new AqS152S0100000_2(this, 944), 0L);
                    return;
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (this.LIZIZ != null) {
            if (!this.LIZ.mIsFromDraft) {
                return;
            }
            C43045Guv.LIZLLL(new AqS152S0100000_2(this, 945), 0L);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126254xR(C126314xX params) {
        super(params);
        o.LJIIIZ(params, "params");
        C124424uU.LIZ.getClass();
        this.LIZLLL = C124424uU.LIZ();
        this.LJ = "";
        this.LJFF = new ArrayList();
    }

    public final void LJIIIIZZ(C121634pz c121634pz) {
        NLEFilter nLEFilter;
        Object obj;
        InterfaceC153045zY interfaceC153045zY = this.LIZIZ;
        if (interfaceC153045zY == null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
        if (LJJI != null) {
            NLEEditor nLEEditor = LJJI.LJIIJ;
            if (C78685UuP.LJJJZ(c121634pz.LIZIZ) && C78685UuP.LJJJZ(c121634pz.LIZ)) {
                Iterator LIZJ = C141415gn.LIZJ(nLEEditor, "nleEditor.model.tracks");
                while (true) {
                    nLEFilter = null;
                    if (LIZJ.hasNext()) {
                        obj = LIZJ.next();
                        if (o.LJ(((NLENode) obj).getUUID(), c121634pz.LIZ)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NLETrack nLETrack = (NLETrack) obj;
                if (nLETrack != null) {
                    Iterator<NLEFilter> it = nLETrack.LJIIIZ().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        NLEFilter next = it.next();
                        if (o.LJ(next.getUUID(), c121634pz.LIZIZ)) {
                            nLEFilter = next;
                            break;
                        }
                    }
                    NLEFilter nLEFilter2 = nLEFilter;
                    if (nLEFilter2 != null) {
                        nLETrack.LJIJI(nLEFilter2);
                        this.LIZ.creativeModel.audioAlgorithmModel.isDenoiseOn = false;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJI(String str, C126264xS c126264xS) {
        NLETrack nLETrack;
        String uuid;
        InterfaceC153045zY interfaceC153045zY = this.LIZIZ;
        if (interfaceC153045zY == null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
        if (LJJI != null) {
            NLEEditor nleEditor = LJJI.LJIIJ;
            o.LJIIIZ(nleEditor, "nleEditor");
            VecNLETrackSPtr tracks = nleEditor.LJ().getTracks();
            o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
            Iterator<NLETrack> it = tracks.iterator();
            while (true) {
                if (it.hasNext()) {
                    nLETrack = it.next();
                    if (o.LJ(nLETrack.getUUID(), str)) {
                        break;
                    }
                } else {
                    nLETrack = null;
                    break;
                }
            }
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2 == null) {
                uuid = "";
            } else {
                NLEFilter nLEFilter = new NLEFilter();
                NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter();
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.LJIIIZ(c126264xS.LJLILLLLZI);
                nLEResourceNode.LJIILIIL(c126264xS.LJLJI);
                nLEResourceNode.LJIIJJI(c126264xS.LJLJJI);
                nLESegmentAudioSamiFilter.LJI(nLEResourceNode);
                NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiType(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, c126264xS.LJLJJL);
                NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiParam(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, c126264xS.LJLJJLL);
                NLEEditorJniJNI.NLESegmentAudioSamiFilter_setEnableSNR(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, false);
                NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiDenoiseLevel(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, c126264xS.LJLJL);
                NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiCreateConfigInfo(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, c126264xS.LJLJLJ);
                NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiSnrThreshold(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, c126264xS.LJLJLLL);
                NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiSnrFilePath(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, c126264xS.LJLL);
                nLEFilter.LIZJ(nLESegmentAudioSamiFilter);
                nLEFilter.setStartTime(0L);
                nLEFilter.setEndTime(nleEditor.LJ().getDuration());
                nLEFilter.setExtra("filter_segment_class", "denoise_snr_filter");
                nLEFilter.setExtra("snr_model_path", c126264xS.LJLL);
                try {
                    nLETrack2.LIZ(nLEFilter);
                } catch (Throwable unused) {
                }
                nleEditor.LIZIZ();
                nleEditor.LIZJ();
                uuid = nLEFilter.getUUID();
                o.LJIIIIZZ(uuid, "nleFilter.uuid");
            }
            if (uuid.length() > 0) {
                this.LIZ.creativeModel.audioAlgorithmModel.isDenoiseOn = true;
                List<C121634pz> list = this.LJFF;
                C121634pz c121634pz = new C121634pz(null);
                c121634pz.LIZ = str;
                c121634pz.LIZIZ = uuid;
                ((ArrayList) list).add(c121634pz);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
