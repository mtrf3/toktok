package X;

import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestParams;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovie;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.davinciresource.DavinciResource;
import defpackage.b1;
import defpackage.e1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hml, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45087Hml {
    public static C73411SrX LIZ;
    public static C45187HoN LIZIZ;
    public static volatile Keva LIZJ;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C45092Hmq.LJLIL);

    public static boolean LJIILJJIL() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }

    public static String LJIJI() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(simpleDateFormat.format(time));
        LIZ2.append(".mp4");
        return X1D.LIZIZ(LIZ2);
    }

    public static final int LJIJJ() {
        return C00F.LIZ(31744, 5, "supply_more_autocut_theme", true);
    }

    public static boolean LJJII() {
        if (e1.LIZ(31744, "autocut_no_network_interact_optimize", true, false) && !C48203Ivv.LJ(C5L7.LIZ())) {
            return true;
        }
        return false;
    }

    public static boolean LJJIII() {
        boolean z;
        if (C00F.LIZ(31744, 0, "autocut_high_light_net_type", true) != 0) {
            if (C00F.LIZ(31744, 0, "autocut_high_light_net_type", true) == 1) {
                z = true;
            } else {
                z = false;
            }
            if ((!z || TTNetInit.getEffectiveConnectionType() >= 5) && (C00F.LIZ(31744, 0, "autocut_high_light_net_type", true) != 2 || TTNetInit.getEffectiveConnectionType() < 5)) {
                return false;
            }
        }
        return true;
    }

    public static void LIZJ() {
        MessageQueue myQueue = Looper.myQueue();
        C45187HoN c45187HoN = LIZIZ;
        if (c45187HoN == null) {
            return;
        }
        myQueue.removeIdleHandler(c45187HoN);
        C73411SrX c73411SrX = LIZ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        LIZIZ = null;
        LIZ = null;
    }

    public static final boolean LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (model.isCurrentAutoCutMode() && HRX.LIZLLL() && model.voiceVolume > 0.0f) {
            List<AutoCutMediaModel> LJIIZILJ = LJIIZILJ(model);
            if (!LJIIZILJ.isEmpty()) {
                Iterator<AutoCutMediaModel> it = LJIIZILJ.iterator();
                while (it.hasNext()) {
                    if (it.next().isVideoType) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void LIZLLL(String execId) {
        o.LJIIIZ(execId, "execId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AutoCutHelper cancelTask: execId: ");
        LIZ2.append(execId);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
        C45154Hnq.LIZJ.getClass();
        C45155Hnr LIZJ2 = C45154Hnq.LIZJ();
        LIZJ2.getClass();
        SmartMovie smartMovie = LIZJ2.LIZ;
        if (smartMovie != null) {
            SmartMovieJniJNI.SmartMovie_cancel(smartMovie.LIZ, smartMovie, execId);
            Long l = LIZJ2.LIZ().get(execId);
            if (l != null) {
                Object value = LIZJ2.LIZJ.getValue();
                long longValue = l.longValue();
                value.getClass();
                C45137HnZ.LIZ(longValue);
                return;
            }
            return;
        }
        o.LJIJI("smartMovie");
        throw null;
    }

    public static void LJII(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        VecNLEResourceNodeSPtr allResources = nleModel.getAllResources();
        o.LJIIIIZZ(allResources, "nleModel.allResources");
        Iterator<NLEResourceNode> it = allResources.iterator();
        while (it.hasNext()) {
            NLEResourceNode next = it.next();
            String LIZJ2 = next.LIZJ();
            if (LIZJ2 != null && LIZJ2.length() != 0) {
                EnumC123874tb enumC123874tb = EnumC123874tb.VIDEO;
                EnumC123874tb enumC123874tb2 = EnumC123874tb.IMAGE;
                if (C47261Igj.LJJIJIIJI(enumC123874tb, enumC123874tb2).contains(next.LJFF())) {
                    String LIZJ3 = next.LIZJ();
                    o.LJIIIIZZ(LIZJ3, "it.resourceFile");
                    if (s.LJJJLZIJ(LIZJ3, EnumC43651HBf.AUTOCUT_TEMPLATE.getNameSpace(), false) && C44687HgJ.LIZIZ(next.LIZJ())) {
                        if (C44687HgJ.LJIIJJI(next.LIZJ())) {
                            next.LJIILIIL(enumC123874tb2);
                        } else {
                            next.LJIILIIL(enumC123874tb);
                        }
                    }
                }
            }
        }
    }

    public static final String LJIIIIZZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LIZLLL2 = C43073GvN.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getPathService(), creativeInfo, EnumC43649HBd.SMART_MOVIE, null, false, 12);
        if (!C1B6.LIZIZ(LIZLLL2)) {
            C1I0.LIZJ(LIZLLL2);
        }
        return LIZLLL2;
    }

    public static final long LJIIJJI(InterfaceC143655kP interfaceC143655kP) {
        InterfaceC153045zY interfaceC153045zY;
        C133765Mu c133765Mu;
        C5MG WS;
        NLEModel nLEModel = null;
        if (interfaceC143655kP != null && (WS = interfaceC143655kP.WS()) != null) {
            interfaceC153045zY = WS.LJJ();
        } else {
            interfaceC153045zY = null;
        }
        if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
            nLEModel = c133765Mu.LJFF();
        }
        return LJIILLIIL(nLEModel);
    }

    public static final List<Float> LJIILIIL(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            VecNLETrackSlotSPtr LJIILL = mainTrack.LJIILL();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIILL, 10));
            Iterator<NLETrackSlot> it = LJIILL.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().LJI());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                NLESegment nLESegment = (NLESegment) it2.next();
                if (nLESegment.LIZIZ().LJFF() == EnumC123874tb.VIDEO || nLESegment.LIZIZ().LJFF() == EnumC123874tb.IMAGE) {
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment);
                    arrayList.add(Float.valueOf(((float) (LJJ.LJIIL() - LJJ.LJIILIIL())) / 1000000));
                }
            }
        }
        return arrayList;
    }

    public static C42647GoV LJIILL(boolean z) {
        if (e1.LIZ(31744, "autocut_ignore_music_detail_call", true, false) || z) {
            return C42647GoV.LJLIL;
        }
        return null;
    }

    public static final long LJIILLIIL(NLEModel nLEModel) {
        if (nLEModel == null || nLEModel.getMainTrack() == null) {
            return 0L;
        }
        return nLEModel.getMainTrack().getMeasuredEndTime() / 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<AutoCutMediaModel> LJIIZILJ(VideoPublishEditModel model) {
        boolean z;
        o.LJIIIZ(model, "model");
        C5K0.LIZIZ();
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(model.nleData);
        nLEEditor.LIZIZ();
        nLEEditor.LIZJ();
        NLEModel LJ = nLEEditor.LJ();
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = LJ.getMainTrack();
        if (mainTrack != null) {
            VecNLETrackSlotSPtr LJIILL = mainTrack.LJIILL();
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJIILL, 10));
            Iterator<NLETrackSlot> it = LJIILL.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().LJI());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                NLESegment nLESegment = (NLESegment) it2.next();
                EnumC123874tb LJFF = nLESegment.LIZIZ().LJFF();
                EnumC123874tb enumC123874tb = EnumC123874tb.VIDEO;
                if (LJFF == enumC123874tb || nLESegment.LIZIZ().LJFF() == EnumC123874tb.IMAGE) {
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLESegment);
                    String LIZJ2 = LJJ.LIZIZ().LIZJ();
                    o.LJIIIIZZ(LIZJ2, "segment.resource.resourceFile");
                    String str = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    int i = 0;
                    if (LJJ.LIZIZ().LJFF() == enumC123874tb) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long j = 1000;
                    AutoCutMediaModel autoCutMediaModel = new AutoCutMediaModel(LIZJ2, str, i, i, z, 0L, LJJ.LJIILIIL() / j, (LJJ.LJIIL() - LJJ.LJIILIIL()) / j, 0.0f, objArr2 == true ? 1 : 0, 814, objArr == true ? 1 : 0);
                    if (nLESegment.LIZIZ().LJFF() == enumC123874tb) {
                        autoCutMediaModel.speed = LJJ.getSpeed();
                    }
                    arrayList.add(autoCutMediaModel);
                }
            }
        }
        return arrayList;
    }

    public static List LJIJ(AutoCutModel autoCutModel) {
        o.LJIIIZ(autoCutModel, "<this>");
        return AnonymousClass636.LJIIIZ(autoCutModel, LJIJJ());
    }

    public static String LJJI(java.util.Map map) {
        String str;
        if (map != null) {
            str = (String) map.get("autocut_template_group_id");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static Integer LJJIFFI(java.util.Map map) {
        String str;
        if (map != null && (str = (String) map.get("template_type")) != null) {
            return Integer.valueOf(CastIntegerProtector.parseInt(str));
        }
        return null;
    }

    public static boolean LJJIIJ(VecMeta vecMeta) {
        if (e1.LIZ(31744, "autocut_support_high_light", true, false) && vecMeta != null && vecMeta.size() == 1 && ((Meta) ORZ.LJLLJ(vecMeta)).LIZIZ() > LivePlayEnforceIntervalSetting.DEFAULT && LJJIII()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CutsameDataItem LJJIIJZLJL(Music music) {
        String str = "";
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        return new CutsameDataItem(str, EnumC43998HOo.DESIGNER_FIXED_TEMPLATE.getValue(), "", "", "", null, objArr, 0, 0L, "", "", "", "", objArr2, objArr3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, "", "", objArr4, music, 0 == true ? 1 : 0, objArr5, objArr6, 15204768, objArr7);
    }

    public static String LJJIIZ(String str) {
        try {
            j parse = GsonProtectorUtils.parse(new com.google.gson.o(), str);
            boolean z = true;
            if (!parse.LJIIZILJ().LJJIJLIJ("task_id")) {
                z = false;
            }
            if (z) {
                String jVar = parse.LJIIZILJ().LJJIJ("task_id").toString();
                o.LJIIIIZZ(jVar, "element.asJsonObject.get(\"task_id\").toString()");
                return ujb.o.LJJJJZ(jVar, "\"", "", false);
            }
            return null;
        } catch (n unused) {
            return null;
        }
    }

    public static OSZ LJJIJIIJIL(AutoCutThemeData autoCutThemeData) {
        MusicBuzModel musicBuzModel;
        String musicId;
        String str = null;
        if (autoCutThemeData != null) {
            musicBuzModel = autoCutThemeData.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (extractAVMusic == null || (musicId = extractAVMusic.getMusicId()) == null) {
            if (autoCutThemeData != null) {
                str = autoCutThemeData.musicId;
            }
        } else {
            str = musicId;
        }
        return new OSZ(extractAVMusic, str);
    }

    public static final OSJ<TemplateList, String, String> LJJIJIL(String str) {
        String str2;
        String str3;
        String str4;
        String str5 = "";
        if (!C44707Hgd.LIZ()) {
            try {
                TemplateList templateList = new TemplateList();
                ArrayList arrayList = new ArrayList();
                Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
                if (str == null) {
                    str = "";
                }
                MusicList musicList = (MusicList) LIZ2.LJI(str, MusicList.class);
                List<Music> list = musicList.musicList;
                if (list != null) {
                    for (Music it : list) {
                        o.LJIIIIZZ(it, "it");
                        arrayList.add(LJJIIJZLJL(it));
                    }
                }
                templateList.templateList = arrayList;
                String str6 = musicList.respJson;
                if (str6 == null || (str2 = LJJIIZ(str6)) == null) {
                    str2 = "";
                }
                BaseResponse.ServerTimeExtra serverTimeExtra = musicList.extra;
                if (serverTimeExtra != null && (str3 = serverTimeExtra.logid) != null) {
                    str5 = str3;
                }
                return new OSJ<>(templateList, str2, str5);
            } catch (Exception unused) {
                return new OSJ<>(null, null, null);
            }
        }
        try {
            Gson LIZ3 = GsonHolder.LIZLLL().LIZ();
            if (str == null) {
                str = "";
            }
            TemplateList templateList2 = (TemplateList) LIZ3.LJI(str, TemplateList.class);
            String str7 = templateList2.respJson;
            if (str7 == null || (str4 = LJJIIZ(str7)) == null) {
                str4 = "";
            }
            return new OSJ<>(templateList2, str4, "");
        } catch (Exception unused2) {
            return new OSJ<>(null, null, null);
        }
    }

    public static final boolean LJJIJLIJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (HRX.LIZIZ() && model.isCurrentAutoCutMode() && !model.shouldReuseAutoCutAnchor() && !H7R.LJJIJL(model)) {
            return true;
        }
        return false;
    }

    public static String LJJIL(NLEModel nLEModel) {
        if (nLEModel == null) {
            return null;
        }
        C5K0.LIZIZ();
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJII(nLEModel);
        nLEEditor.LIZIZ();
        nLEEditor.LIZJ();
        return nLEEditor.LJIIIIZZ();
    }

    public static final void LJJIZ(AutoCutMediaModel autoCutMediaModel) {
        VEUtils.VEVideoFileInfo videoFileInfo;
        int i;
        int i2;
        if (autoCutMediaModel.isVideoType) {
            if ((autoCutMediaModel.width == 0 || autoCutMediaModel.height == 0) && (videoFileInfo = VEUtils.getVideoFileInfo(autoCutMediaModel.filePath)) != null && (i = videoFileInfo.width) > 0 && (i2 = videoFileInfo.height) > 0) {
                autoCutMediaModel.width = i;
                autoCutMediaModel.height = i2;
                return;
            }
            return;
        }
        OSZ LJIJJ = C38891fp.LJIJJ(autoCutMediaModel.filePath);
        if (((Number) LJIJJ.getFirst()).intValue() <= 0 || ((Number) LJIJJ.getSecond()).intValue() <= 0) {
            return;
        }
        autoCutMediaModel.width = ((Number) LJIJJ.getFirst()).intValue();
        autoCutMediaModel.height = ((Number) LJIJJ.getSecond()).intValue();
    }

    public static final float LIZIZ(C45091Hmp c45091Hmp, C45091Hmp config) {
        o.LJIIIZ(config, "config");
        return (c45091Hmp.LJLILLLLZI * config.LJLILLLLZI) + (c45091Hmp.LJLJI * config.LJLJI) + (c45091Hmp.LJLIL * config.LJLIL);
    }

    public static final boolean LJ(boolean z, boolean z2) {
        if (((!C44084HRw.LIZ() || !HRX.LJ()) && !HRX.LIZJ()) || C1DG.LJIIIIZZ() || !C1B8.LIZJ()) {
            return false;
        }
        if ((z2 && !e1.LIZ(31744, "studio_autocut_enable_ttba", true, false)) || z) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(AVMusic aVMusic, boolean z) {
        if (aVMusic != null && aVMusic.getMusicId() != null && !z) {
            return true;
        }
        return false;
    }

    public static List LJI(List templateList, AutoCutThemeData autoCutThemeData) {
        Integer num;
        String str;
        String str2;
        int i;
        AutoCutThemeData autoCutThemeData2;
        int i2;
        Integer num2;
        String str3;
        String str4;
        Long l;
        o.LJIIIZ(templateList, "templateList");
        List LLJILJILJ = ORZ.LLJILJILJ(C61878OQg.INSTANCE);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("before fillTemplateList: presetTheme: ");
        if (autoCutThemeData != null) {
            num = Integer.valueOf(autoCutThemeData.templateType);
        } else {
            num = null;
        }
        LIZ2.append(num);
        LIZ2.append(" - ");
        if (autoCutThemeData != null) {
            str = autoCutThemeData.musicId;
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(" - ");
        if (autoCutThemeData != null) {
            str2 = autoCutThemeData.templateId;
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        LIZ2.append("\ntemplateList = ");
        LIZ2.append(ORZ.LLD(templateList, " | ", null, null, C45088Hmm.LJLIL, 30));
        X1D.LIZIZ(LIZ2);
        if (autoCutThemeData != null) {
            int i3 = autoCutThemeData.source;
            int i4 = autoCutThemeData.indexFromSource;
            String templateId = autoCutThemeData.templateId;
            int i5 = autoCutThemeData.templateType;
            String str5 = autoCutThemeData.nickName;
            String templateUrl = autoCutThemeData.templateUrl;
            String str6 = autoCutThemeData.templateData;
            String str7 = autoCutThemeData.musicId;
            String str8 = autoCutThemeData.coverUrl;
            String str9 = autoCutThemeData.name;
            MusicBuzModel musicBuzModel = autoCutThemeData.musicBuzModel;
            boolean z = autoCutThemeData.isPreset;
            String str10 = autoCutThemeData.templateGroupId;
            java.util.Set<String> set = autoCutThemeData.preloadUrsSet;
            o.LJIIIZ(templateId, "templateId");
            o.LJIIIZ(templateUrl, "templateUrl");
            autoCutThemeData2 = new AutoCutThemeData(i3, i4, templateId, i5, str5, templateUrl, str6, str7, str8, str9, musicBuzModel, z, str10, set);
            if (autoCutThemeData2.LIZ() == C63A.AUTO_CUT) {
                autoCutThemeData2.indexFromSource = 0;
                i = 1;
            } else {
                i = 0;
            }
            ((ArrayList) LLJILJILJ).add(autoCutThemeData2);
        } else {
            i = 0;
            autoCutThemeData2 = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : templateList) {
            CutsameDataItem cutsameDataItem = (CutsameDataItem) obj;
            if (autoCutThemeData2 != null) {
                int i6 = autoCutThemeData2.templateType;
                EnumC43998HOo enumC43998HOo = EnumC43998HOo.CUT_SAME;
                if (i6 == enumC43998HOo.getValue()) {
                    if (o.LJ(cutsameDataItem.templateId, autoCutThemeData2.templateId) && cutsameDataItem.templateType == enumC43998HOo.getValue()) {
                    }
                } else {
                    Music music = cutsameDataItem.music;
                    if (music != null) {
                        l = Long.valueOf(music.getId());
                    } else {
                        l = null;
                    }
                    if (o.LJ(String.valueOf(l), autoCutThemeData2.musicId) && cutsameDataItem.templateType != enumC43998HOo.getValue()) {
                    }
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C77119UOl.LJII((CutsameDataItem) it.next(), C63A.AUTO_CUT, i, LJIILL(false), false));
            i++;
        }
        int size = arrayList2.size();
        if (autoCutThemeData2 != null) {
            i2 = Math.max(templateList.size() - arrayList2.size(), 1);
        } else {
            i2 = 0;
        }
        int i7 = size - i2;
        ((ArrayList) LLJILJILJ).addAll(ORZ.LLILLL(arrayList2, i7));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("fillTemplateList: validNum = ");
        LIZ3.append(i7);
        LIZ3.append(", presetTheme: ");
        if (autoCutThemeData != null) {
            num2 = Integer.valueOf(autoCutThemeData.templateType);
        } else {
            num2 = null;
        }
        LIZ3.append(num2);
        LIZ3.append(" - ");
        if (autoCutThemeData != null) {
            str3 = autoCutThemeData.musicId;
        } else {
            str3 = null;
        }
        LIZ3.append(str3);
        LIZ3.append(" - ");
        if (autoCutThemeData != null) {
            str4 = autoCutThemeData.templateId;
        } else {
            str4 = null;
        }
        LIZ3.append(str4);
        LIZ3.append("\ntemplateList = ");
        LIZ3.append(ORZ.LLD(templateList, " | ", null, null, C45089Hmn.LJLIL, 30));
        X1D.LIZIZ(LIZ3);
        return ORZ.LLJI(LLJILJILJ);
    }

    public static int LJIIL(AutoCutModel autoCutModel, List list) {
        o.LJIIIZ(autoCutModel, "<this>");
        if (list != null) {
            return C45063HmN.LIZIZ(list, autoCutModel.curIndexFromSource, AnonymousClass636.LJJ(autoCutModel.curSource));
        }
        return AnonymousClass636.LJI(autoCutModel, LJIJJ());
    }

    public static final void LJJIJL(NLEModel nLEModel, NLEResourceDownloadCallback nLEResourceDownloadCallback) {
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutHelper restoreResource");
        C45154Hnq.LIZJ.getClass();
        C45155Hnr LIZJ2 = C45154Hnq.LIZJ();
        LIZJ2.getClass();
        C45135HnX c45135HnX = new C45135HnX(nLEResourceDownloadCallback, nLEModel);
        SmartMovie smartMovie = LIZJ2.LIZ;
        if (smartMovie != null) {
            String execId = SmartMovieJniJNI.SmartMovie_restore(smartMovie.LIZ, smartMovie, V0N.LJIJI(nLEModel), NLEResourceDownloadCallback.getCPtr(c45135HnX), c45135HnX);
            HashMap<String, Long> LIZ2 = LIZJ2.LIZ();
            o.LJFF(execId, "execId");
            LIZ2.put(execId, Long.valueOf(c45135HnX.LIZIZ));
            return;
        }
        o.LJIJI("smartMovie");
        throw null;
    }

    public static void LJJJ(AutoCutModel autoCutModel, NLEModel nLEModel) {
        String extra;
        if (autoCutModel != null) {
            autoCutModel.speedVariationType = null;
        }
        if (nLEModel == null || (extra = nLEModel.getExtra("autocut_speed_variation_type")) == null || extra.length() <= 0 || autoCutModel == null) {
            return;
        }
        autoCutModel.speedVariationType = C38350F3i.LJJIL(extra);
    }

    public static final String LJIIIZ(int i, C63A c63a, AutoCutModel autoCutModel) {
        o.LJIIIZ(autoCutModel, "autoCutModel");
        AutoCutThemeData LJIJJLI = LJIJJLI(i, c63a, autoCutModel);
        if (LJIJJLI != null) {
            return LJIJJLI.name;
        }
        return null;
    }

    public static final AutoCutThemeData LJIJJLI(int i, C63A c63a, AutoCutModel autoCutModel) {
        o.LJIIIZ(autoCutModel, "autoCutModel");
        AutoCutThemeData autoCutThemeData = null;
        if (c63a == null) {
            return null;
        }
        Iterator<AutoCutThemeData> it = autoCutModel.templateList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AutoCutThemeData next = it.next();
            AutoCutThemeData autoCutThemeData2 = next;
            if (autoCutThemeData2.LIZ() == c63a && autoCutThemeData2.indexFromSource == i) {
                autoCutThemeData = next;
                break;
            }
        }
        return autoCutThemeData;
    }

    public static final String LJIL(AutoCutModel autoCutModel, C63A c63a, Integer num) {
        int i;
        if (autoCutModel == null) {
            return "other";
        }
        if (c63a == null) {
            c63a = AnonymousClass636.LJJ(autoCutModel.curSource);
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = autoCutModel.curIndexFromSource;
        }
        if (i != 0 || c63a != C63A.AUTO_CUT) {
            return "other";
        }
        return autoCutModel.reuseMusicType;
    }

    public static final String LJJ(AVMusic aVMusic, boolean z, AutoCutModel autoCutModel) {
        if (aVMusic == null || autoCutModel == null || autoCutModel.curIndexFromSource > 0 || AnonymousClass636.LJJ(autoCutModel.curSource) != C63A.AUTO_CUT || !LJFF(aVMusic, z)) {
            return "other";
        }
        if (aVMusic.isPgc()) {
            return "pgc";
        }
        return "ugc";
    }

    public static void LJJIIZI(java.util.Set set, String str, Integer num) {
        if (!e1.LIZ(31744, "autocut_cc_effect_preload", true, false)) {
            return;
        }
        int value = EnumC43998HOo.CUT_SAME.getValue();
        if (num == null || num.intValue() != value || C78685UuP.LJJJZ(str) || set == null || set.isEmpty()) {
            return;
        }
        VecString vecString = new VecString();
        vecString.addAll(ORZ.LLILLL(set, 3));
        ((NLEModelDownloader) C45161Hnx.LJII.getValue()).fetchResourceList(vecString, 3, null);
    }

    public static String LJIIJ(String str, long j, boolean z, CreativeInfo creativeInfo) {
        String str2;
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String LJIIIIZZ = LJIIIIZZ(creativeInfo);
        if (str != null && ujb.o.LJJJLIIL(str, LJIIIIZZ, false)) {
            return str;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        if (str == null) {
            str = "";
        }
        LIZ2.append(C173376rF.LJI(str));
        LIZ2.append(j);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        if (!C44687HgJ.LIZIZ(LJIIIIZZ)) {
            C1I0.LIZJ(LJIIIIZZ);
        }
        StringBuilder LIZJ2 = b1.LIZJ(LJIIIIZZ, LIZIZ2);
        if (z) {
            str2 = ".mp4";
        } else {
            str2 = ".png";
        }
        LIZJ2.append(str2);
        return X1D.LIZIZ(LIZJ2);
    }

    public static final OSZ<String, String> LJJIJ(List<AutoCutMediaModel> mediaModelList, int i, CreativeInfo creativeInfo, boolean z, boolean z2, String str, boolean z3, MusicRequestCallback musicRequestCallback) {
        String str2;
        Object obj;
        o.LJIIIZ(mediaModelList, "mediaModelList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        StringBuilder sb = new StringBuilder("AutoCutHelper requestRecommendedMusicList: mediaModelList = ");
        ArrayList arrayList = new ArrayList(C32I.LJJL(mediaModelList, 10));
        Iterator<AutoCutMediaModel> it = mediaModelList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().filePath);
        }
        sb.append(arrayList);
        sb.append("musicCount = ");
        sb.append(i);
        sb.append(", creativeInfo: ");
        sb.append(creativeInfo);
        sb.append(", ignoreCompress=");
        sb.append(z);
        sb.append(", useCommerceMusic = ");
        sb.append(z2);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, sb.toString());
        VecMeta vecMeta = new VecMeta();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(mediaModelList, 10));
        Iterator<AutoCutMediaModel> it2 = mediaModelList.iterator();
        while (true) {
            str2 = "";
            if (!it2.hasNext()) {
                break;
            }
            AutoCutMediaModel next = it2.next();
            Meta meta = new Meta();
            if (C44687HgJ.LIZIZ(next.filePath)) {
                str2 = next.filePath;
            } else {
                String str3 = next.fileUriPath;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            SmartMovieJniJNI.Meta_setPath(meta.LIZ, meta, str2);
            meta.LJIIIIZZ(next.width);
            meta.LJII(next.height);
            SmartMovieJniJNI.Meta_setIsVideo(meta.LIZ, meta, next.isVideoType);
            meta.LJI(next.duration);
            arrayList2.add(meta);
        }
        vecMeta.addAll(arrayList2);
        C146045oG.LJ(vecMeta);
        String extraInfo = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), creativeInfo);
        MusicRequestParams musicRequestParams = new MusicRequestParams();
        SmartMovieJniJNI.MusicRequestParams_setCursor(musicRequestParams.LIZ, musicRequestParams, 0);
        SmartMovieJniJNI.MusicRequestParams_setCount(musicRequestParams.LIZ, musicRequestParams, i);
        SmartMovieJniJNI.MusicRequestParams_setCreationId(musicRequestParams.LIZ, musicRequestParams, creativeInfo.getCreationId());
        SmartMovieJniJNI.MusicRequestParams_setLabScene(musicRequestParams.LIZ, musicRequestParams, "");
        SmartMovieJniJNI.MusicRequestParams_setScene(musicRequestParams.LIZ, musicRequestParams, 1);
        SmartMovieJniJNI.MusicRequestParams_setMediaList(musicRequestParams.LIZ, musicRequestParams, VecMeta.LJFF(vecMeta), vecMeta);
        SmartMovieJniJNI.MusicRequestParams_setExtra(musicRequestParams.LIZ, musicRequestParams, extraInfo);
        SmartMovieJniJNI.MusicRequestParams_setUploadZipBinary(musicRequestParams.LIZ, musicRequestParams, C45093Hmr.LIZ());
        SmartMovieJniJNI.MusicRequestParams_setUseResourceId(musicRequestParams.LIZ, musicRequestParams, true);
        SmartMovieJniJNI.MusicRequestParams_setReturnNLEConfig(musicRequestParams.LIZ, musicRequestParams, true);
        SmartMovieJniJNI.MusicRequestParams_setReturnMovieConfig(musicRequestParams.LIZ, musicRequestParams, e1.LIZ(31744, "studio_enable_autocut_return_algorithm_config", true, false));
        SmartMovieJniJNI.MusicRequestParams_setIgnoreCompress(musicRequestParams.LIZ, musicRequestParams, z);
        SmartMovieJniJNI.MusicRequestParams_setAccountType(musicRequestParams.LIZ, musicRequestParams, z2 ? 1 : 0);
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        unorderedMapStrStr.put("source", str);
        if (!z3) {
            obj = "";
        } else {
            obj = "preload_urs";
        }
        unorderedMapStrStr.put("preload_urs", obj);
        SmartMovieJniJNI.MusicRequestParams_setExtraParams(musicRequestParams.LIZ, musicRequestParams, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
        C45154Hnq.LIZJ.getClass();
        C45155Hnr LIZJ2 = C45154Hnq.LIZJ();
        LIZJ2.getClass();
        C45136HnY c45136HnY = new C45136HnY(musicRequestCallback, musicRequestParams);
        SmartMovie smartMovie = LIZJ2.LIZ;
        if (smartMovie != null) {
            String execId = SmartMovieJniJNI.SmartMovie_getMusicListResponse(smartMovie.LIZ, smartMovie, musicRequestParams.LIZ, musicRequestParams, MusicRequestCallback.getCPtr(c45136HnY), c45136HnY);
            HashMap<String, Long> LIZ2 = LIZJ2.LIZ();
            o.LJFF(execId, "execId");
            LIZ2.put(execId, Long.valueOf(c45136HnY.LIZIZ));
            if (C44707Hgd.LIZ() && e1.LIZ(31744, "autocut_enable_cc_compress_opt", true, false)) {
                o.LJIIIIZZ(extraInfo, "extraInfo");
                str2 = C45154Hnq.LIZIZ(vecMeta, extraInfo, new C45090Hmo());
            }
            return new OSZ<>(execId, str2);
        }
        o.LJIJI("smartMovie");
        throw null;
    }

    public static final String LJJIJIIJI(String str, String musicId, String templateId, String templateUrl, String str2, EnumC45070HmU requestType, List<AutoCutMediaModel> mediaModelList, java.util.Set<String> set, CreativeInfo creativeInfo, boolean z, boolean z2, int i, String str3, C45131HnT c45131HnT) {
        boolean z3;
        Meta meta;
        NLEModelRequestParams nLEModelRequestParams;
        String str4 = str2;
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(templateUrl, "templateUrl");
        o.LJIIIZ(requestType, "requestType");
        o.LJIIIZ(mediaModelList, "mediaModelList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        StringBuilder sb = new StringBuilder("AutoCutHelper requestRecommendedNLEModel: taskId = ");
        sb.append(str);
        sb.append(", musicId: ");
        sb.append(musicId);
        sb.append(", templateId: ");
        sb.append(templateId);
        sb.append("mediaModelList: ");
        ArrayList arrayList = new ArrayList(C32I.LJJL(mediaModelList, 10));
        Iterator<AutoCutMediaModel> it = mediaModelList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().filePath);
        }
        sb.append(arrayList);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, sb.toString());
        DavinciResource.INSTANCE.setHttpClient(C45104Hn2.LIZ());
        VecMeta vecMeta = new VecMeta();
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(mediaModelList, 10));
        Iterator<AutoCutMediaModel> it2 = mediaModelList.iterator();
        while (true) {
            String str5 = "";
            if (!it2.hasNext()) {
                break;
            }
            AutoCutMediaModel next = it2.next();
            Meta meta2 = new Meta();
            if (C44687HgJ.LIZIZ(next.filePath)) {
                str5 = next.filePath;
            } else {
                String str6 = next.fileUriPath;
                if (str6 != null) {
                    str5 = str6;
                }
            }
            SmartMovieJniJNI.Meta_setPath(meta2.LIZ, meta2, str5);
            meta2.LJIIIIZZ(next.width);
            meta2.LJII(next.height);
            SmartMovieJniJNI.Meta_setIsVideo(meta2.LIZ, meta2, next.isVideoType);
            meta2.LJI(next.duration);
            arrayList2.add(meta2);
        }
        vecMeta.addAll(arrayList2);
        Iterator<Meta> it3 = vecMeta.iterator();
        while (true) {
            z3 = true;
            if (it3.hasNext()) {
                meta = it3.next();
                if (!C44687HgJ.LIZIZ(meta.LIZLLL())) {
                    break;
                }
            } else {
                meta = null;
                break;
            }
        }
        Meta meta3 = meta;
        if (meta3 != null) {
            c45131HnT.onFailure("", 1010, C45049Hm9.LJFF(meta3), new UnorderedMapStrStr());
            return "";
        }
        C146045oG.LJ(vecMeta);
        requestType.toString();
        if (str4 != null) {
            s.LJJJLZIJ(str4, "CMP", false);
        }
        if (requestType == EnumC45070HmU.TEMPLATE_CC) {
            if (str4 != null && str4.length() != 0) {
                z3 = false;
            }
            if (z3) {
                if (!o.LJ(str3, "source_auto_cut")) {
                    LJJIIZI(set, "", Integer.valueOf(i));
                }
                String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), creativeInfo);
                o.LJIIIIZZ(json, "get().gson.toJson(creativeInfo)");
                C146045oG.LIZJ(C5L7.LIZ(), new CutSource(templateUrl, CutSourceType.URL), "", vecMeta, json, c45131HnT, templateId);
            } else {
                String json2 = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), creativeInfo);
                o.LJIIIIZZ(json2, "get().gson.toJson(creativeInfo)");
                C146045oG.LIZJ(C5L7.LIZ(), new CutSource(str4, CutSourceType.JSON), "", vecMeta, json2, c45131HnT, templateId);
            }
            return "";
        }
        if (str != null) {
            VecStr vecStr = new VecStr();
            nLEModelRequestParams = new NLEModelRequestParams(SmartMovieJniJNI.new_NLEModelRequestParams__SWIG_0(str, musicId, VecMeta.LJFF(vecMeta), vecMeta, vecStr.LJLIL, vecStr, GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), creativeInfo)));
        } else {
            VecStr vecStr2 = new VecStr();
            nLEModelRequestParams = new NLEModelRequestParams(SmartMovieJniJNI.new_NLEModelRequestParams__SWIG_2(musicId, VecMeta.LJFF(vecMeta), vecMeta, vecStr2.LJLIL, vecStr2, GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), creativeInfo)));
        }
        SmartMovieJniJNI.NLEModelRequestParams_setUseResourceId(nLEModelRequestParams.LIZ, nLEModelRequestParams, true);
        if (str4 == null) {
            str4 = "";
        }
        SmartMovieJniJNI.NLEModelRequestParams_setTemplateJSON(nLEModelRequestParams.LIZ, nLEModelRequestParams, str4);
        SmartMovieJniJNI.NLEModelRequestParams_setIgnoreCompress(nLEModelRequestParams.LIZ, nLEModelRequestParams, z);
        SmartMovieJniJNI.NLEModelRequestParams_setEnableAsyncRender(nLEModelRequestParams.LIZ, nLEModelRequestParams, z2);
        SmartMovieJniJNI.NLEModelRequestParams_setEnableBatchFetch(nLEModelRequestParams.LIZ, nLEModelRequestParams, e1.LIZ(31744, "autocut_batch_fetch_effects", true, false));
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        unorderedMapStrStr.put("source", str3);
        unorderedMapStrStr.put("autocut_template_type", String.valueOf(i));
        NLEModelRequestParams nLEModelRequestParams2 = nLEModelRequestParams;
        SmartMovieJniJNI.NLEModelRequestParams_setExtraParams(nLEModelRequestParams.LIZ, nLEModelRequestParams2, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
        C45154Hnq.LIZJ.getClass();
        C45155Hnr LIZJ2 = C45154Hnq.LIZJ();
        LIZJ2.getClass();
        C45134HnW c45134HnW = new C45134HnW(c45131HnT, nLEModelRequestParams2);
        SmartMovie smartMovie = LIZJ2.LIZ;
        if (smartMovie != null) {
            String execId = SmartMovieJniJNI.SmartMovie_getNLEModel(smartMovie.LIZ, smartMovie, nLEModelRequestParams2.LIZ, nLEModelRequestParams2, NLEModelRequestProgressCallback.getCPtr(c45134HnW), c45134HnW);
            HashMap<String, Long> LIZ2 = LIZJ2.LIZ();
            o.LJFF(execId, "execId");
            LIZ2.put(execId, Long.valueOf(c45134HnW.LIZIZ));
            return execId;
        }
        o.LJIJI("smartMovie");
        throw null;
    }
}
