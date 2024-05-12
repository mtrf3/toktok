package X;

import Y.ACallableS110S0100000_7;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioMatrixFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.wavepublish.story.DescriptionData;
import com.ss.android.ugc.aweme.wavepublish.story.DescriptionDataWrapper;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.H2j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43421H2j extends AbstractC43349Gzp {
    public static final C62822Ol8 LJJIIZI = C221108m2.LIZIZ(C37194Eik.LJLIL);
    public final boolean LJI;
    public final VEWatermarkParam LJII;
    public final InterfaceC65784Pro<C76800UCe> LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public C43403H1r LJIIJ;
    public PublishModel LJIIJJI;
    public C43397H1l LJIIL;
    public H2P LJIILIIL;
    public H2N LJIILJJIL;
    public XFL LJIILL;
    public C67996QmO LJIILLIIL;
    public H2S LJIIZILJ;
    public InterfaceC153045zY LJIJ;
    public volatile boolean LJIJI;
    public volatile boolean LJIJJ;
    public SynthetiseResult LJIJJLI;
    public final C44428Hc8 LJIL;
    public final List<String> LJJ;
    public volatile C76940UHo LJJI;
    public DMMediaModel LJJIFFI;
    public AIGCInfo LJJII;
    public final C62822Ol8 LJJIII;
    public final C62822Ol8 LJJIIJ;
    public final C62822Ol8 LJJIIJZLJL;
    public H37 LJJIIZ;

    public final void LJIIJJI() {
        Integer num;
        String str;
        AIGCInfo aIGCInfo;
        String str2;
        C43417H2f c43417H2f;
        C41791Gah c41791Gah;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        C122034qd LJJI;
        String str3;
        String str4;
        String str5;
        int i2;
        C122034qd LJJI2;
        NLEEditor nLEEditor;
        NLEModel LJ;
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        this.LJIJJ = false;
        this.LJIJ = null;
        this.LJIJJLI = null;
        this.LJIJI = false;
        ((ArrayList) this.LJJ).clear();
        this.LJIL.LIZJ();
        this.LJIL.LIZLLL();
        if (C43161Gwn.LIZ()) {
            C43403H1r c43403H1r = this.LJIIJ;
            if (c43403H1r != null) {
                C43157Gwj.LJI(c43403H1r.LIZ);
            } else {
                o.LJIJI("editModelContainer");
                throw null;
            }
        }
        try {
            XFL xfl = this.LJIILL;
            if (xfl != null) {
                xfl.LJI();
            }
            XFL xfl2 = this.LJIILL;
            if (xfl2 != null) {
                xfl2.LJIJJLI = false;
            }
            C60903NvH.LJIIJJI().LJJII();
            C43403H1r c43403H1r2 = this.LJIIJ;
            if (c43403H1r2 != null) {
                C150785vu.LIZ(c43403H1r2.LIZ);
                try {
                    LJII().LIZ();
                    C43403H1r c43403H1r3 = this.LJIIJ;
                    if (c43403H1r3 != null) {
                        InterfaceC153045zY LIZIZ = C152875zH.LIZIZ(c43403H1r3.LIZ, new AqS173S0100000_7(this, 325));
                        C5UF.LIZ(LIZIZ);
                        this.LJIJ = LIZIZ;
                        DMMediaModel dMMediaModel = this.LJJIFFI;
                        if (dMMediaModel != null) {
                            num = Integer.valueOf(dMMediaModel.type);
                        } else {
                            num = null;
                        }
                        InterfaceC153045zY interfaceC153045zY = this.LJIJ;
                        if (interfaceC153045zY != null) {
                            DMMediaModel dMMediaModel2 = this.LJJIFFI;
                            if (dMMediaModel2 != null) {
                                str5 = dMMediaModel2.outputCoverFile;
                            } else {
                                str5 = null;
                            }
                            if (num != null && num.intValue() == 3 && str5 != null && str5.length() != 0) {
                                C42132GgC c42132GgC = (C42132GgC) this.LJJIIJ.getValue();
                                if (c42132GgC != null) {
                                    c42132GgC.LIZIZ();
                                }
                                C43403H1r c43403H1r4 = this.LJIIJ;
                                if (c43403H1r4 != null) {
                                    int[] LIZJ = C44526Hdi.LIZJ(c43403H1r4.LIZ);
                                    Integer LJJJJ = ORY.LJJJJ(0, LIZJ);
                                    int i3 = -1;
                                    if (LJJJJ != null) {
                                        i2 = LJJJJ.intValue();
                                    } else {
                                        i2 = -1;
                                    }
                                    Integer LJJJJ2 = ORY.LJJJJ(1, LIZJ);
                                    if (LJJJJ2 != null) {
                                        i3 = LJJJJ2.intValue();
                                    }
                                    interfaceC153045zY.LLJIJIL(i2, i3);
                                    interfaceC153045zY.prepare();
                                    new C6YX(interfaceC153045zY, str5, 0, null, new H38(this), new H36(this, str5), true, true);
                                } else {
                                    o.LJIJI("editModelContainer");
                                    throw null;
                                }
                            }
                            H2S h2s = this.LJIIZILJ;
                            if (h2s != null) {
                                if (h2s.LJLIL) {
                                    C43403H1r c43403H1r5 = this.LJIIJ;
                                    if (c43403H1r5 != null) {
                                        if (H7R.LJJJJI(c43403H1r5.LIZ) && e1.LIZ(31744, "enable_new_now_download_muted_music", true, false) && (LJJI2 = C17N.LJJI(interfaceC153045zY)) != null && (nLEEditor = LJJI2.LJIIJ) != null && (LJ = nLEEditor.LJ()) != null && (tracks = LJ.getTracks()) != null) {
                                            Iterator<NLETrack> it = tracks.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    nLETrack = it.next();
                                                    if (o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                                                        break;
                                                    }
                                                } else {
                                                    nLETrack = null;
                                                    break;
                                                }
                                            }
                                            NLETrack nLETrack2 = nLETrack;
                                            if (nLETrack2 != null) {
                                                nLEEditor.LJ().removeTrack(nLETrack2);
                                                nLEEditor.LIZIZ();
                                            }
                                        }
                                    } else {
                                        o.LJIJI("editModelContainer");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("saveNow2LocalModel");
                                throw null;
                            }
                        }
                        C43403H1r c43403H1r6 = this.LJIIJ;
                        if (c43403H1r6 != null) {
                            SynthetiseResult LIZ = C43217Gxh.LIZ(c43403H1r6.LIZ);
                            this.LJIJJLI = LIZ;
                            C43403H1r c43403H1r7 = this.LJIIJ;
                            if (c43403H1r7 != null) {
                                VideoPublishEditModel videoPublishEditModel = c43403H1r7.LIZ;
                                InterfaceC153045zY interfaceC153045zY2 = this.LJIJ;
                                if (interfaceC153045zY2 != null) {
                                    if (videoPublishEditModel.isFastImport) {
                                        C44513HdV.LIZ(interfaceC153045zY2, videoPublishEditModel.getPreviewInfo().getVideoList());
                                    }
                                    CommerceToolsStickerServiceImpl.LJIIL().LIZLLL(interfaceC153045zY2, videoPublishEditModel);
                                    PublishModel publishModel = this.LJIIJJI;
                                    if (publishModel != null) {
                                        if (publishModel.isEditSave) {
                                            interfaceC153045zY2.LLILLJJLI(10);
                                        } else {
                                            interfaceC153045zY2.LLILLJJLI(0);
                                        }
                                        interfaceC153045zY2.LLJJLIIIJLLLLLLLZ();
                                        if (videoPublishEditModel.isFastImport) {
                                            str = "1";
                                        } else {
                                            str = CardStruct.IStatusCode.DEFAULT;
                                        }
                                        interfaceC153045zY2.LLILLL("te_is_fast_import", str);
                                        if (videoPublishEditModel.isMultiVideoEdit() && !TextUtils.isEmpty(videoPublishEditModel.multiEditVideoRecordData.videoMetaData)) {
                                            String str6 = videoPublishEditModel.multiEditVideoRecordData.videoMetaData;
                                            o.LJIIIIZZ(str6, "editModel.multiEditVideoRecordData.videoMetaData");
                                            interfaceC153045zY2.LLILLL("description", str6);
                                        }
                                        if (o.LJ(C38530FAg.LIZ(videoPublishEditModel), "") && C00F.LIZ(31744, 0, "add_effect_anchor_via_upload", true) == 1) {
                                            try {
                                                str2 = C75792yF.LIZJ(new DescriptionDataWrapper(new DescriptionData("aweme", videoPublishEditModel.getStickers())));
                                                o.LJIIIIZZ(str2, "toJson(\n                …          )\n            )");
                                            } catch (Throwable unused) {
                                                str2 = "";
                                            }
                                            interfaceC153045zY2.LLILLL("com.apple.quicktime.information", str2);
                                        }
                                        if (C40980G6m.LIZ() && (aIGCInfo = this.LJJII) != null && aIGCInfo.AIGCLabelType == 2) {
                                            String jSONObject = new JSONObject().put("aigc_label_type", 2).toString();
                                            o.LJIIIIZZ(jSONObject, "JSONObject().put(AIGCCon…BEL_TYPE_AUTO).toString()");
                                            interfaceC153045zY2.LLILLL("aigc_info", jSONObject);
                                        }
                                    } else {
                                        o.LJIJI("publishMode");
                                        throw null;
                                    }
                                }
                                VEWatermarkParam vEWatermarkParam = this.LJII;
                                C43403H1r c43403H1r8 = this.LJIIJ;
                                if (c43403H1r8 != null) {
                                    VideoPublishEditModel videoPublishEditModel2 = c43403H1r8.LIZ;
                                    InterfaceC153045zY interfaceC153045zY3 = this.LJIJ;
                                    if (interfaceC153045zY3 == null) {
                                        c43417H2f = null;
                                    } else {
                                        ((Keva) H31.LIZ.getValue()).erase("upload_param_key");
                                        C122034qd LJJI3 = C17N.LJJI(interfaceC153045zY3);
                                        if (LJJI3 != null) {
                                            LJJI3.LJIIJJI.P8().LJIJI(new H3B(this));
                                        }
                                        c43417H2f = new C43417H2f(this, LIZ);
                                        interfaceC153045zY3.LLILL(c43417H2f);
                                        interfaceC153045zY3.LLIIJLIL(new C43433H2v(vEWatermarkParam, this, interfaceC153045zY3, videoPublishEditModel2, LIZ));
                                    }
                                    InterfaceC153045zY interfaceC153045zY4 = this.LJIJ;
                                    if (interfaceC153045zY4 != null && !C43401H1p.LIZ()) {
                                        interfaceC153045zY4.LLLFF(new C43429H2r(this, LIZ));
                                    }
                                    C01H.LIZIZ(C0NU.TT_CONCURRENT_UPLOAD_COMPILE, 10000);
                                    VEWatermarkParam vEWatermarkParam2 = this.LJII;
                                    C43403H1r c43403H1r9 = this.LJIIJ;
                                    if (c43403H1r9 != null) {
                                        VideoPublishEditModel videoPublishEditModel3 = c43403H1r9.LIZ;
                                        InterfaceC153045zY interfaceC153045zY5 = this.LJIJ;
                                        if (interfaceC153045zY5 == null) {
                                            c41791Gah = new C41791Gah(null, new NullPointerException("VEEditor is null"), 1);
                                        } else {
                                            try {
                                                C43397H1l c43397H1l = this.LJIIL;
                                                if (c43397H1l != null) {
                                                    c41791Gah = new C41791Gah(C44546He2.LIZJ(videoPublishEditModel3, LIZ, vEWatermarkParam2, interfaceC153045zY5, c43397H1l.LJLIL), null, 2);
                                                } else {
                                                    o.LJIJI("publishId");
                                                    throw null;
                                                }
                                            } catch (Exception e) {
                                                LJII().LJIIIIZZ();
                                                C41813Gb3.LIZLLL("CompileTask", e);
                                                c41791Gah = new C41791Gah(null, e, 1);
                                            }
                                        }
                                        VEVideoEncodeSettings vEVideoEncodeSettings = c41791Gah.LIZ;
                                        if (vEVideoEncodeSettings != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        Throwable th = c41791Gah.LIZIZ;
                                        if (th != null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!(z ^ z2)) {
                                            SynthetiseResult m157clone = LIZ.m157clone();
                                            m157clone.ret = 100107;
                                            C43342Gzi c43342Gzi = new C43342Gzi();
                                            c43342Gzi.LIZJ = "compile settings is invalid, plz check business logic first, there must be something wrong";
                                            c43342Gzi.LIZ = m157clone;
                                            LJIILIIL(c43342Gzi.LIZ());
                                            return;
                                        }
                                        if (vEVideoEncodeSettings == null) {
                                            SynthetiseResult m157clone2 = LIZ.m157clone();
                                            m157clone2.ret = 100108;
                                            C43342Gzi c43342Gzi2 = new C43342Gzi();
                                            if (th != null) {
                                                c43342Gzi2.LIZLLL = th;
                                            }
                                            c43342Gzi2.LIZ = m157clone2;
                                            LJIILIIL(c43342Gzi2.LIZ());
                                            return;
                                        }
                                        boolean isEnableRemuxVideo = vEVideoEncodeSettings.isEnableRemuxVideo();
                                        InterfaceC153045zY interfaceC153045zY6 = this.LJIJ;
                                        if (interfaceC153045zY6 != null) {
                                            i = interfaceC153045zY6.LLJILJILJ(vEVideoEncodeSettings);
                                        } else {
                                            i = -2;
                                        }
                                        vEVideoEncodeSettings.setEnableRemuxVideo(isEnableRemuxVideo);
                                        C67996QmO c67996QmO = this.LJIILLIIL;
                                        if (c67996QmO != null) {
                                            C67996QmO.LIZJ(c67996QmO, new H3H(i));
                                            C67996QmO c67996QmO2 = this.LJIILLIIL;
                                            if (c67996QmO2 != null) {
                                                StringBuilder LIZ2 = X1D.LIZ();
                                                LIZ2.append("PublishDurationMonitor SynthetiseStart ");
                                                LIZ2.append(vEVideoEncodeSettings);
                                                C67996QmO.LIZJ(c67996QmO2, new C43393H1h("CompileTask", X1D.LIZIZ(LIZ2)));
                                                C67996QmO c67996QmO3 = this.LJIILLIIL;
                                                if (c67996QmO3 != null) {
                                                    StringBuilder LIZ3 = X1D.LIZ();
                                                    LIZ3.append("mVEEditor.compile source.getOutputFile() : ");
                                                    C43403H1r c43403H1r10 = this.LJIIJ;
                                                    if (c43403H1r10 != null) {
                                                        LIZ3.append(c43403H1r10.LIZ.getOutputFile());
                                                        C67996QmO.LIZJ(c67996QmO3, new C43393H1h("CompileTask", X1D.LIZIZ(LIZ3)));
                                                        InterfaceC153045zY interfaceC153045zY7 = this.LJIJ;
                                                        if (interfaceC153045zY7 != null && (LJJI = C17N.LJJI(interfaceC153045zY7)) != null) {
                                                            NLEEditor nleEditor = LJJI.LJIIJ;
                                                            C43403H1r c43403H1r11 = this.LJIIJ;
                                                            if (c43403H1r11 != null) {
                                                                VideoPublishEditModel editModel = c43403H1r11.LIZ;
                                                                o.LJIIIZ(nleEditor, "nleEditor");
                                                                o.LJIIIZ(editModel, "editModel");
                                                                C169636lD.LIZ("addOriginAndDubVideoAudioMetricsFilterNLE: add NLE filters");
                                                                C168636jb.LIZIZ(editModel);
                                                                if (C168626ja.LIZLLL() && C168626ja.LIZIZ() && C1B8.LIZJ()) {
                                                                    String LIZIZ2 = C141865hW.LIZIZ();
                                                                    if (LIZIZ2.length() == 0) {
                                                                        C169636lD.LIZ("modelPath = empty !!!");
                                                                    } else {
                                                                        ArrayList arrayList = new ArrayList();
                                                                        if (nleEditor.LJ().getTracks() != null) {
                                                                            VecNLETrackSPtr tracks2 = nleEditor.LJ().getTracks();
                                                                            o.LJIIIIZZ(tracks2, "nleEditor.model.tracks");
                                                                            arrayList.addAll(tracks2);
                                                                        }
                                                                        StringBuilder LIZ4 = X1D.LIZ();
                                                                        LIZ4.append("tracks = ");
                                                                        LIZ4.append(arrayList);
                                                                        C169636lD.LIZ(X1D.LIZIZ(LIZ4));
                                                                        StringBuilder LIZ5 = X1D.LIZ();
                                                                        LIZ5.append("modelPath = ");
                                                                        LIZ5.append(LIZIZ2);
                                                                        C169636lD.LIZ(X1D.LIZIZ(LIZ5));
                                                                        StringBuilder LIZ6 = X1D.LIZ();
                                                                        LIZ6.append("samiParam = ");
                                                                        LIZ6.append(C168626ja.LIZJ());
                                                                        C169636lD.LIZ(X1D.LIZIZ(LIZ6));
                                                                        ArrayList arrayList2 = new ArrayList();
                                                                        List LIZ7 = C168636jb.LIZ(editModel);
                                                                        if (!((ArrayList) LIZ7).isEmpty()) {
                                                                            arrayList2.addAll(LIZ7);
                                                                        }
                                                                        AudioRecorderParam audioRecorderParam = editModel.veAudioRecorderParam;
                                                                        if (audioRecorderParam == null || (str3 = audioRecorderParam.getAudioUrl()) == null) {
                                                                            str3 = "";
                                                                        }
                                                                        if (C78685UuP.LJJJZ(str3)) {
                                                                            AudioRecorderParam audioRecorderParam2 = editModel.veAudioRecorderParam;
                                                                            if (audioRecorderParam2 == null || (str4 = audioRecorderParam2.getAudioUrl()) == null) {
                                                                                str4 = "";
                                                                            }
                                                                            arrayList2.add(str4);
                                                                        }
                                                                        StringBuilder LIZ8 = X1D.LIZ();
                                                                        LIZ8.append("tracksPathList = ");
                                                                        LIZ8.append(arrayList2);
                                                                        LIZ8.append(" , size = ");
                                                                        LIZ8.append(arrayList2.size());
                                                                        C169636lD.LIZ(X1D.LIZIZ(LIZ8));
                                                                        ArrayList arrayList3 = new ArrayList();
                                                                        Iterator it2 = arrayList.iterator();
                                                                        while (it2.hasNext()) {
                                                                            Object next = it2.next();
                                                                            Iterator<NLETrackSlot> it3 = ((NLETrack) next).LJIILL().iterator();
                                                                            if (it3.hasNext()) {
                                                                                NLESegment LJI = it3.next().LJI();
                                                                                if (NLESegmentAudio.LIZLLL(LJI) != null) {
                                                                                    String LIZJ2 = LJI.LIZIZ().LIZJ();
                                                                                    o.LJIIIIZZ(LIZJ2, "segment.resource.resourceFile");
                                                                                    if (LIZJ2.length() > 0 && arrayList2.contains(LJI.LIZIZ().LIZJ())) {
                                                                                        arrayList3.add(next);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        Iterator it4 = arrayList3.iterator();
                                                                        while (it4.hasNext()) {
                                                                            NLETrack nLETrack3 = (NLETrack) it4.next();
                                                                            NLEFilter nLEFilter = new NLEFilter();
                                                                            NLESegmentAudioMatrixFilter nLESegmentAudioMatrixFilter = new NLESegmentAudioMatrixFilter();
                                                                            NLEResourceNode nLEResourceNode = new NLEResourceNode();
                                                                            nLEResourceNode.LJIIIZ(LIZIZ2);
                                                                            nLESegmentAudioMatrixFilter.LJI(nLEResourceNode);
                                                                            NLEEditorJniJNI.NLESegmentAudioMatrixFilter_setSamiParam(nLESegmentAudioMatrixFilter.LJ, nLESegmentAudioMatrixFilter, C168626ja.LIZJ());
                                                                            nLEFilter.LIZJ(nLESegmentAudioMatrixFilter);
                                                                            nLEFilter.setStartTime(0L);
                                                                            nLEFilter.setEndTime(nLETrack3.getMeasuredEndTime());
                                                                            nLETrack3.LIZ(nLEFilter);
                                                                            StringBuilder LIZ9 = X1D.LIZ();
                                                                            LIZ9.append("add filter: nleTrack = ");
                                                                            LIZ9.append(nLETrack3.LJIIIZ());
                                                                            C169636lD.LIZ(X1D.LIZIZ(LIZ9));
                                                                            nleEditor.LIZIZ();
                                                                        }
                                                                    }
                                                                }
                                                                C124424uU.LIZ.getClass();
                                                                if (C124424uU.LIZ().useCE == 1) {
                                                                    NLEEditor nleEditor2 = LJJI.LJIIJ;
                                                                    o.LJIIIZ(nleEditor2, "nleEditor");
                                                                    if (C124424uU.LIZ().enableSNR == 1) {
                                                                        VecNLETrackSPtr allTracks = nleEditor2.LJ().getTracks();
                                                                        try {
                                                                            o.LJIIIIZZ(allTracks, "allTracks");
                                                                            Iterator<NLETrack> it5 = allTracks.iterator();
                                                                            while (it5.hasNext()) {
                                                                                NLETrack next2 = it5.next();
                                                                                if (!next2.LJIIIZ().isEmpty()) {
                                                                                    Iterator<NLEFilter> it6 = next2.LJIIIZ().iterator();
                                                                                    while (it6.hasNext()) {
                                                                                        NLEFilter nleFilter = it6.next();
                                                                                        if (nleFilter != null) {
                                                                                            o.LJIIIIZZ(nleFilter, "nleFilter");
                                                                                            if (nleFilter.hasExtra("filter_segment_class") && o.LJ(nleFilter.getExtra("filter_segment_class"), "denoise_snr_filter")) {
                                                                                                C120714oV.LIZIZ(nleFilter);
                                                                                                nleEditor2.LIZIZ();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable unused2) {
                                                                        }
                                                                        nleEditor2.LIZJ();
                                                                    }
                                                                }
                                                            } else {
                                                                o.LJIJI("editModelContainer");
                                                                throw null;
                                                            }
                                                        }
                                                        C43403H1r c43403H1r12 = this.LJIIJ;
                                                        if (c43403H1r12 != null) {
                                                            VideoPublishEditModel videoPublishEditModel4 = c43403H1r12.LIZ;
                                                            boolean z4 = LIZ.needRecode;
                                                            if (this.LJII != null) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            HI5.LIZJ(videoPublishEditModel4, vEVideoEncodeSettings, z4, i, z3);
                                                            if (c43417H2f != null) {
                                                                C60903NvH.LJIIJJI().getPublishService().LJJIIJ().getClass();
                                                                C41777GaT.LIZ();
                                                            }
                                                            C43403H1r c43403H1r13 = this.LJIIJ;
                                                            if (c43403H1r13 != null) {
                                                                VideoPublishEditModel videoPublishEditModel5 = c43403H1r13.LIZ;
                                                                InterfaceC153045zY interfaceC153045zY8 = this.LJIJ;
                                                                if (interfaceC153045zY8 == null) {
                                                                    return;
                                                                }
                                                                C67996QmO c67996QmO4 = this.LJIILLIIL;
                                                                if (c67996QmO4 != null) {
                                                                    StringBuilder LIZ10 = X1D.LIZ();
                                                                    LIZ10.append("isSupportHwEnc: ");
                                                                    LIZ10.append(vEVideoEncodeSettings.isSupportHwEnc());
                                                                    LIZ10.append(", isEnableHwBufferEncode: ");
                                                                    LIZ10.append(vEVideoEncodeSettings.isEnableHwBufferEncode());
                                                                    C67996QmO.LIZJ(c67996QmO4, new C43393H1h("CompileTask", X1D.LIZIZ(LIZ10)));
                                                                    try {
                                                                        StringBuilder LIZ11 = X1D.LIZ();
                                                                        LIZ11.append("editor = ");
                                                                        LIZ11.append(interfaceC153045zY8);
                                                                        LIZ11.append(", compile begin");
                                                                        C169636lD.LIZ(X1D.LIZIZ(LIZ11));
                                                                        HIP.LIZ(videoPublishEditModel5, vEVideoEncodeSettings);
                                                                        interfaceC153045zY8.LLIILZL(videoPublishEditModel5.getOutputFile(), vEVideoEncodeSettings);
                                                                        C169636lD.LIZ("compile end");
                                                                        return;
                                                                    } catch (Exception e2) {
                                                                        C43342Gzi c43342Gzi3 = new C43342Gzi();
                                                                        c43342Gzi3.LIZ = C43217Gxh.LIZIZ(100105);
                                                                        c43342Gzi3.LIZLLL = e2;
                                                                        LJIILIIL(c43342Gzi3.LIZ());
                                                                        C67996QmO c67996QmO5 = this.LJIILLIIL;
                                                                        if (c67996QmO5 != null) {
                                                                            StringBuilder LIZ12 = X1D.LIZ();
                                                                            C67996QmO.LIZJ(c67996QmO5, new C43393H1h("CompileTask", KMP.LJFF(LIZ12, "Compile Failed ", e2, LIZ12)));
                                                                            return;
                                                                        } else {
                                                                            o.LJIJI("nodeCallback");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                }
                                                                o.LJIJI("nodeCallback");
                                                                throw null;
                                                            }
                                                            o.LJIJI("editModelContainer");
                                                            throw null;
                                                        }
                                                        o.LJIJI("editModelContainer");
                                                        throw null;
                                                    }
                                                    o.LJIJI("editModelContainer");
                                                    throw null;
                                                }
                                                o.LJIJI("nodeCallback");
                                                throw null;
                                            }
                                            o.LJIJI("nodeCallback");
                                            throw null;
                                        }
                                        o.LJIJI("nodeCallback");
                                        throw null;
                                    }
                                    o.LJIJI("editModelContainer");
                                    throw null;
                                }
                                o.LJIJI("editModelContainer");
                                throw null;
                            }
                            o.LJIJI("editModelContainer");
                            throw null;
                        }
                        o.LJIJI("editModelContainer");
                        throw null;
                    }
                    o.LJIJI("editModelContainer");
                    throw null;
                } catch (Exception e3) {
                    C43342Gzi c43342Gzi4 = new C43342Gzi();
                    c43342Gzi4.LIZ = C43217Gxh.LIZIZ(100104);
                    c43342Gzi4.LIZLLL = e3;
                    LJIILIIL(c43342Gzi4.LIZ());
                    return;
                }
            }
            o.LJIJI("editModelContainer");
            throw null;
        } catch (C41819Gb9 e4) {
            C43342Gzi c43342Gzi5 = new C43342Gzi();
            c43342Gzi5.LIZLLL = e4;
            c43342Gzi5.LIZ = C43217Gxh.LIZIZ(e4.getErrorCode());
            LJIILIIL(c43342Gzi5.LIZ());
        }
    }

    @Override // X.AbstractC43455H3r
    public final int LJIIIIZZ() {
        LJII().LJFF().getClass();
        new C42388GkK();
        return C42388GkK.LIZ();
    }

    public static final void LJIIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (e1.LIZ(31744, "studio_enable_synthesis_callback_async", true, false)) {
            C10K.LIZJ(new ACallableS110S0100000_7(interfaceC65784Pro, 44));
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZJ(Object obj) {
        super.LIZJ(obj);
        InterfaceC153045zY interfaceC153045zY = this.LJIJ;
        if (interfaceC153045zY == null || this.LJIJI || this.LJIJJ) {
            return false;
        }
        this.LJIJJ = true;
        C67996QmO c67996QmO = this.LJIILLIIL;
        if (c67996QmO != null) {
            C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileTask", "CompileTask pause"));
            interfaceC153045zY.LLII();
            C67996QmO c67996QmO2 = this.LJIILLIIL;
            if (c67996QmO2 != null) {
                C67996QmO.LIZJ(c67996QmO2, C41764GaG.LIZ);
                return true;
            }
            o.LJIJI("nodeCallback");
            throw null;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final void LIZLLL(Object obj) {
        super.LIZLLL(obj);
        InterfaceC153045zY interfaceC153045zY = this.LJIJ;
        if (interfaceC153045zY != null && this.LJIJJ) {
            C67996QmO c67996QmO = this.LJIILLIIL;
            if (c67996QmO != null) {
                C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileTask", "CompileTask resume"));
                interfaceC153045zY.LLIFFJFJJ();
                C67996QmO c67996QmO2 = this.LJIILLIIL;
                if (c67996QmO2 != null) {
                    C67996QmO.LIZJ(c67996QmO2, C41763GaF.LIZ);
                    this.LJIJJ = false;
                    return;
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    public final void LJIILIIL(C42990Gu2 c42990Gu2) {
        C42132GgC c42132GgC = (C42132GgC) this.LJJIIJZLJL.getValue();
        if (c42132GgC != null) {
            c42132GgC.LIZ();
        }
        this.LJIJI = true;
        C67996QmO c67996QmO = this.LJIILLIIL;
        if (c67996QmO != null) {
            C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileTask", "PublishDurationMonitor Synthetise end failed"));
            if (this.LJI) {
                ((RunnableC137475aR) this.LJIIIZ.getValue()).LIZ();
            }
            if (!C42991Gu3.LIZJ(c42990Gu2)) {
                int LJFF = C42991Gu3.LJFF(c42990Gu2);
                C67996QmO c67996QmO2 = this.LJIILLIIL;
                if (c67996QmO2 != null) {
                    c67996QmO2.LIZLLL(LJFF, c42990Gu2);
                } else {
                    o.LJIJI("nodeCallback");
                    throw null;
                }
            }
            C76940UHo c76940UHo = this.LJJI;
            if (c76940UHo != null) {
                c76940UHo.LIZ();
            }
            this.LJJI = null;
            H37 h37 = this.LJJIIZ;
            if (h37 != null) {
                h37.LIZJ();
                return;
            } else {
                o.LJIJI("timeoutMonitor");
                throw null;
            }
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    public C43421H2j(VEWatermarkParam vEWatermarkParam, InterfaceC65784Pro interfaceC65784Pro) {
        super(vEWatermarkParam);
        this.LJI = false;
        this.LJII = vEWatermarkParam;
        this.LJIIIIZZ = interfaceC65784Pro;
        this.LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 843));
        this.LJIL = new C44428Hc8();
        this.LJJ = new ArrayList();
        this.LJJIII = C221108m2.LIZIZ(H3K.LJLIL);
        this.LJJIIJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 597));
        this.LJJIIJZLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 596));
    }

    @Override // X.AbstractC43455H3r, X.AbstractC43456H3s
    public final boolean LIZ(AbstractC42983Gtv cause, C87623YaB c87623YaB) {
        o.LJIIIZ(cause, "cause");
        super.LIZ(cause, c87623YaB);
        C67996QmO c67996QmO = this.LJIILLIIL;
        if (c67996QmO != null) {
            C67996QmO.LIZJ(c67996QmO, new C43393H1h("CompileTask", "cancelUpload"));
            this.LJIJI = true;
            if (this.LJI) {
                ((RunnableC137475aR) this.LJIIIZ.getValue()).LIZ();
            }
            XFL xfl = this.LJIILL;
            if (xfl != null) {
                xfl.LJIJJLI = false;
                xfl.LIZIZ();
            }
            SynthetiseResult synthetiseResult = this.LJIJJLI;
            if (synthetiseResult != null && synthetiseResult.outputFile != null) {
                File file = new File(synthetiseResult.outputFile);
                if (file.exists()) {
                    C16880lQ.LLLZZIL(file);
                    C67996QmO c67996QmO2 = this.LJIILLIIL;
                    if (c67996QmO2 != null) {
                        C67996QmO.LIZJ(c67996QmO2, new C43393H1h("CompileTask", C0F0.LIZJ("incompleteFile delete incompleteFile : ", file)));
                    } else {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                }
                VEWatermarkParam vEWatermarkParam = this.LJII;
                if (vEWatermarkParam != null && vEWatermarkParam.extFile != null) {
                    File file2 = new File(this.LJII.extFile);
                    if (file2.exists()) {
                        C16880lQ.LLLZZIL(file2);
                        C67996QmO c67996QmO3 = this.LJIILLIIL;
                        if (c67996QmO3 != null) {
                            C67996QmO.LIZJ(c67996QmO3, new C43393H1h("CompileTask", C0F0.LIZJ("incompleteWatermarkFile delete incompleteWatermarkFile : ", file2)));
                        } else {
                            o.LJIJI("nodeCallback");
                            throw null;
                        }
                    }
                }
            }
            C76940UHo c76940UHo = this.LJJI;
            if (c76940UHo != null) {
                c76940UHo.LIZ();
            }
            this.LJJI = null;
            C10K.LIZJ(new ACallableS110S0100000_7(this, 45));
            c87623YaB.LIZ(null);
            H37 h37 = this.LJJIIZ;
            if (h37 != null) {
                h37.LIZJ();
                return true;
            }
            o.LJIJI("timeoutMonitor");
            throw null;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    @Override // X.AbstractC43349Gzp, X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        GU9 gu9;
        String str;
        GV6 gv6;
        GU9 gu92;
        VideoPublishEditModel videoPublishEditModel;
        GU9 gu93;
        NLENode nLENode;
        SynthetiseResult synthetiseResult;
        String str2;
        SynthetiseResult synthetiseResult2;
        String str3;
        o.LJIIIZ(args, "args");
        super.LJI(args, c67996QmO);
        C42074GfG.LIZ();
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    C43403H1r c43403H1r = (C43403H1r) next;
                    this.LJIIJ = c43403H1r;
                    this.LJJIFFI = c43403H1r.LIZ.creativeModel.dmMediaModel;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43397H1l) {
                            if (next2 != null) {
                                this.LJIIL = (C43397H1l) next2;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj = it3.next();
                                        if (obj == null || (obj instanceof H2P)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                if (!(obj instanceof H2P)) {
                                    obj = null;
                                }
                                this.LJIILIIL = (H2P) obj;
                                Iterator<Object> it4 = args.LIZ.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj2 = it4.next();
                                        if (obj2 == null || (obj2 instanceof H2N)) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                if (!(obj2 instanceof H2N)) {
                                    obj2 = null;
                                }
                                this.LJIILJJIL = (H2N) obj2;
                                this.LJIILLIIL = c67996QmO;
                                Iterator<Object> it5 = args.LIZ.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj3 = it5.next();
                                        if (obj3 == null || (obj3 instanceof XFL)) {
                                            break;
                                        }
                                    } else {
                                        obj3 = null;
                                        break;
                                    }
                                }
                                this.LJIILL = (XFL) obj3;
                                Iterator<Object> it6 = args.LIZ.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        obj4 = it6.next();
                                        if (obj4 == null || (obj4 instanceof H2S)) {
                                            break;
                                        }
                                    } else {
                                        obj4 = null;
                                        break;
                                    }
                                }
                                if (!(obj4 instanceof H2S)) {
                                    obj4 = null;
                                }
                                H2S h2s = (H2S) obj4;
                                if (h2s == null) {
                                    h2s = new H2S(false, false);
                                }
                                this.LJIIZILJ = h2s;
                                if (C40980G6m.LIZ()) {
                                    C43403H1r c43403H1r2 = this.LJIIJ;
                                    if (c43403H1r2 != null) {
                                        AIGCInfo aIGCInfo = c43403H1r2.LIZ.creativeModel.privacySettingModel.aigcInfo;
                                        aIGCInfo.AIGCSwitchStatusWhenCompile = aIGCInfo.AIGCLabelType;
                                        this.LJJII = aIGCInfo;
                                    } else {
                                        o.LJIJI("editModelContainer");
                                        throw null;
                                    }
                                }
                                DMMediaModel dMMediaModel = this.LJJIFFI;
                                if (dMMediaModel != null) {
                                    C42132GgC c42132GgC = (C42132GgC) this.LJJIIJZLJL.getValue();
                                    if (c42132GgC != null) {
                                        c42132GgC.LIZIZ();
                                    }
                                    if (dMMediaModel.isSynthesised) {
                                        LJIILJJIL(new SynthetiseResult(), false);
                                        return;
                                    }
                                }
                                Iterator<Object> it7 = args.LIZ.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        obj5 = it7.next();
                                        if (obj5 instanceof C43404H1s) {
                                            break;
                                        }
                                    } else {
                                        obj5 = null;
                                        break;
                                    }
                                }
                                if (obj5 != null) {
                                    this.LJIIJJI = ((C43404H1s) obj5).LIZ;
                                    int LJIIIIZZ = LJIIIIZZ();
                                    C67996QmO c67996QmO2 = this.LJIILLIIL;
                                    if (c67996QmO2 != null) {
                                        this.LJJIIZ = new H37(c67996QmO2, LJIIIIZZ);
                                        C60903NvH.LJIIJJI().getPublishService().LJJIIJ();
                                        C41775GaR.LIZJ(H1T.COMPILE);
                                        Iterator<Object> it8 = args.LIZ.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                obj6 = it8.next();
                                                if (obj6 instanceof AbstractC42364Gjw) {
                                                    break;
                                                }
                                            } else {
                                                obj6 = null;
                                                break;
                                            }
                                        }
                                        if (!(obj6 instanceof AbstractC42364Gjw) || obj6 == null || !(obj6 instanceof C42363Gjv)) {
                                            C43403H1r c43403H1r3 = this.LJIIJ;
                                            if (c43403H1r3 != null) {
                                                VideoPublishEditModel videoPublishEditModel2 = c43403H1r3.LIZ;
                                                PublishModel publishModel = this.LJIIJJI;
                                                if (publishModel != null) {
                                                    if (C43157Gwj.LJIIIZ(videoPublishEditModel2, publishModel.LIZIZ(), false)) {
                                                        C43403H1r c43403H1r4 = this.LJIIJ;
                                                        if (c43403H1r4 != null) {
                                                            SynthetiseResult LIZ = C43217Gxh.LIZ(c43403H1r4.LIZ);
                                                            this.LJIJJLI = LIZ;
                                                            LJIILJJIL(LIZ, true);
                                                            return;
                                                        }
                                                        o.LJIJI("editModelContainer");
                                                        throw null;
                                                    }
                                                    C43403H1r c43403H1r5 = this.LJIIJ;
                                                    if (c43403H1r5 != null) {
                                                        if (GU7.LJIIIIZZ(c43403H1r5.LIZ)) {
                                                            GU9 gu94 = GU7.LIZLLL;
                                                            if (gu94 != null) {
                                                                synthetiseResult2 = gu94.LJII;
                                                            } else {
                                                                synthetiseResult2 = null;
                                                            }
                                                            this.LJIJJLI = synthetiseResult2;
                                                            if (synthetiseResult2 != null) {
                                                                str3 = synthetiseResult2.outputFile;
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            C43403H1r c43403H1r6 = this.LJIIJ;
                                                            if (c43403H1r6 != null) {
                                                                C39579Fg7.LIZLLL(str3, c43403H1r6.LIZ.getLocalTempPath());
                                                                if (synthetiseResult2 != null) {
                                                                    LJIILJJIL(synthetiseResult2, true);
                                                                    return;
                                                                } else {
                                                                    "Required value was null.".toString();
                                                                    throw new IllegalArgumentException("Required value was null.");
                                                                }
                                                            }
                                                            o.LJIJI("editModelContainer");
                                                            throw null;
                                                        }
                                                        Iterator<Object> it9 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it9.hasNext()) {
                                                                break;
                                                            }
                                                            Object next3 = it9.next();
                                                            if (next3 instanceof C43404H1s) {
                                                                if (next3 != null) {
                                                                    if (((C43404H1s) next3).LIZ.isEditSave && (gu9 = GU7.LIZLLL) != null && gu9.LJ != null) {
                                                                        GV6 gv62 = GU7.LIZJ;
                                                                        if (gv62 != null) {
                                                                            str = gv62.LIZ;
                                                                        } else {
                                                                            str = null;
                                                                        }
                                                                        if (o.LJ(str, gu9.LIZJ) && (gv6 = GU7.LIZJ) != null && gv6.LIZIZ != null && (gu92 = GU7.LIZLLL) != null && !gu92.LJIIIIZZ && (videoPublishEditModel = gu92.LJ) != null && !C44384HbQ.LJLJI(videoPublishEditModel) && (gu93 = GU7.LIZLLL) != null) {
                                                                            NLENode nLENode2 = gu93.LJFF;
                                                                            boolean z = gu93.LJIIIZ;
                                                                            if (nLENode2 != null && (nLENode = C41571GTf.LIZJ) != null && nLENode.unorderEquals(nLENode2) && !z) {
                                                                                GV6 gv63 = GU7.LIZJ;
                                                                                if (gv63 != null) {
                                                                                    synthetiseResult = gv63.LIZIZ;
                                                                                } else {
                                                                                    synthetiseResult = null;
                                                                                }
                                                                                this.LJIJJLI = synthetiseResult;
                                                                                if (synthetiseResult != null) {
                                                                                    str2 = synthetiseResult.outputFile;
                                                                                } else {
                                                                                    str2 = null;
                                                                                }
                                                                                C43403H1r c43403H1r7 = this.LJIIJ;
                                                                                if (c43403H1r7 != null) {
                                                                                    C39579Fg7.LIZLLL(str2, c43403H1r7.LIZ.getLocalTempPath());
                                                                                    if (synthetiseResult != null) {
                                                                                        LJIILJJIL(synthetiseResult, true);
                                                                                        return;
                                                                                    } else {
                                                                                        "Required value was null.".toString();
                                                                                        throw new IllegalArgumentException("Required value was null.");
                                                                                    }
                                                                                }
                                                                                o.LJIJI("editModelContainer");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (this.LJI) {
                                                                        ((ExecutorService) LJJIIZI.getValue()).execute((RunnableC137475aR) this.LJIIIZ.getValue());
                                                                        return;
                                                                    } else {
                                                                        LJIIJJI();
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                                    }
                                                    o.LJIJI("editModelContainer");
                                                    throw null;
                                                }
                                                o.LJIJI("publishMode");
                                                throw null;
                                            }
                                            o.LJIJI("editModelContainer");
                                            throw null;
                                        }
                                        LJIILJJIL(new SynthetiseResult(), false);
                                        return;
                                    }
                                    o.LJIJI("nodeCallback");
                                    throw null;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x01d8, code lost:
    
        if (r21 != false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43421H2j.LJIILJJIL(com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, boolean):void");
    }
}
