package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.ss.android.ugc.aweme.creative.model.AutoCutAsyncRenderModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hm8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45048Hm8 implements InterfaceC45222How {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<AutoCutMediaModel> LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final AutoCutModel LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public int LJIILLIIL;
    public String LJIIZILJ;
    public int LJIJ;
    public final java.util.Map<String, Long> LJIJI;
    public NLEModel LJIJJ;
    public int LJIJJLI;
    public String LJIL;
    public long LJJ;

    @Override // X.InterfaceC45209Hoj
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC45209Hoj
    public final void onProgress(int i) {
    }

    public final boolean LJIL() {
        String str = this.LJIL;
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC45222How
    public void onCancel() {
        String str;
        int i;
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str2 = this.LIZ;
        String str3 = this.LIZIZ;
        String str4 = this.LIZJ;
        long LIZLLL = C45049Hm9.LIZLLL(this.LJII);
        String reuseMusicType = this.LJ;
        int i2 = this.LJFF;
        o.LJIIIZ(reuseMusicType, "reuseMusicType");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str2);
        c145995oB.LJI("shoot_way", str3);
        if (i2 == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        c145995oB.LJI("content_source", str);
        c145995oB.LJI("creation_id", str4);
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        c145995oB.LIZ(i, "content_cnt");
        c145995oB.LJI("content_form", C45049Hm9.LIZJ(list));
        c145995oB.LIZIZ(LIZLLL, "duration");
        c145995oB.LJI("reuse_music_type", reuseMusicType);
        FMX.LJIIL("exit_autocut_edit_page", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJII() {
        this.LJIIIIZZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC45209Hoj
    public void LIZ(NLEModel nLEModel) {
        this.LJIJJ = nLEModel;
        C45087Hml.LJJJ(this.LJI, nLEModel);
    }

    @Override // X.InterfaceC45222How
    public final void LIZIZ(int i) {
        String str;
        String str2 = this.LIZ;
        String str3 = this.LIZIZ;
        String str4 = this.LIZJ;
        int i2 = this.LJFF;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str2);
        c145995oB.LJI("shoot_way", str3);
        if (i2 == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        c145995oB.LJI("content_source", str);
        c145995oB.LJI("creation_id", str4);
        c145995oB.LIZ(i, "error_type");
        FMX.LJIIL("click_autocut_retry", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45222How
    public final void LIZJ(List<AutoCutMediaModel> list) {
        String str;
        this.LJII = System.currentTimeMillis();
        String str2 = this.LIZ;
        String str3 = this.LIZIZ;
        String str4 = this.LIZJ;
        int i = this.LJFF;
        String str5 = this.LJI.clickFrom;
        OSJ LJ = C45049Hm9.LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str2);
        c145995oB.LJI("shoot_way", str3);
        if (i == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        c145995oB.LJI("content_source", str);
        c145995oB.LJI("creation_id", str4);
        c145995oB.LIZ(intValue, "content_cnt");
        c145995oB.LJI("content_form", C45049Hm9.LIZJ(list));
        c145995oB.LIZ(intValue2, "pic_cnt");
        c145995oB.LIZ(intValue3, "video_cnt");
        c145995oB.LJI("autocut_click_from", str5);
        FMX.LJIIL("enter_autocut_edit_page", c145995oB.LIZ);
        ((LinkedHashMap) this.LJIJI).clear();
        this.LJIL = null;
        this.LJIILLIIL = EnumC43998HOo.ALGORITHM_TEMPLATE.getValue();
    }

    @Override // X.InterfaceC45209Hoj
    public final void LIZLLL(String str) {
        C45049Hm9.LJIIIIZZ(C45049Hm9.LIZLLL(this.LJIIJ), "source_auto_cut", null, str, this.LIZIZ, 0, this.LIZJ, true);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJFF(String str) {
        this.LJIJI.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIIIZZ(String str) {
        this.LJIIJ = System.currentTimeMillis();
        this.LJIIZILJ = str;
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIIZ(EnumC45211Hol status) {
        o.LJIIIZ(status, "status");
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJ(String str) {
        long j;
        Long l = (Long) ((LinkedHashMap) this.LJIJI).get(str);
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        long LIZLLL = C45049Hm9.LIZLLL(j);
        String str2 = this.LJIIL;
        String str3 = this.LJIILIIL;
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str4 = this.LIZ;
        String str5 = this.LIZIZ;
        String str6 = this.LIZJ;
        String reuseMusicType = this.LJ;
        int i = this.LJIILLIIL;
        boolean LJIL = LJIL();
        o.LJIIIZ(reuseMusicType, "reuseMusicType");
        OSJ LJ = C45049Hm9.LJ(list);
        int intValue = ((Number) LJ.getFirst()).intValue();
        int intValue2 = ((Number) LJ.getSecond()).intValue();
        int intValue3 = ((Number) LJ.getThird()).intValue();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("stage", str);
        c145995oB.LIZIZ(LIZLLL, "duration");
        c145995oB.LJI("music_id", str2);
        c145995oB.LJI("task_id", str3);
        c145995oB.LIZ(intValue, "material_count");
        c145995oB.LIZ(intValue2, "photo_count");
        c145995oB.LIZ(intValue3, "video_count");
        c145995oB.LJI("enter_from", str4);
        c145995oB.LJI("shoot_way", str5);
        c145995oB.LJI("creation_id", str6);
        c145995oB.LJI("reuse_music_type", reuseMusicType);
        c145995oB.LIZ(i, "autocut_template_type");
        c145995oB.LIZ(LJIL ? 1 : 0, "is_template_json");
        FMX.LJIIL("tool_performance_autocut_stage", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45209Hoj
    public void LJIIZILJ(C44716Hgm c44716Hgm) {
        java.util.Set<String> set;
        VecNLETrackSPtr tracks;
        NLESegment nLESegment;
        NLEStyText LJII;
        String str;
        String str2;
        String str3;
        long LIZLLL = C45049Hm9.LIZLLL(this.LJII);
        long j = this.LJJ;
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str4 = this.LIZIZ;
        String str5 = this.LIZJ;
        String str6 = this.LJ;
        int i = this.LJFF;
        String str7 = this.LIZ;
        int i2 = c44716Hgm.LIZJ;
        String str8 = this.LJI.clickFrom;
        String str9 = c44716Hgm.LJIIIZ;
        String str10 = c44716Hgm.LJIIJJI;
        String str11 = this.LJIILIIL;
        NLEModel nLEModel = c44716Hgm.LJII;
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                if (next.LJIIZILJ() == EnumC123864ta.STICKER) {
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, next.LJIILL());
                    if (nLETrackSlot != null) {
                        nLESegment = nLETrackSlot.LJI();
                    } else {
                        nLESegment = null;
                    }
                    if (NLESegmentTextSticker.LJFF(nLESegment) != null) {
                        Iterator<NLETrackSlot> it2 = next.LJIILL().iterator();
                        while (it2.hasNext()) {
                            NLETrackSlot next2 = it2.next();
                            NLESegmentTextSticker LJFF = NLESegmentTextSticker.LJFF(next2.LJI());
                            if (LJFF != null && (LJII = LJFF.LJII()) != null) {
                                NLEResourceNode LIZIZ = LJII.LIZIZ();
                                if (LIZIZ != null) {
                                    str = LIZIZ.LIZLLL();
                                } else {
                                    str = null;
                                }
                                OSZ<String, String> LIZJ = C134305Ow.LIZJ(str);
                                NLESegmentTextSticker LJFF2 = NLESegmentTextSticker.LJFF(next2.LJI());
                                if (LJFF2 == null || (str2 = LJFF2.LJI()) == null) {
                                    str2 = "";
                                }
                                if (LIZJ != null) {
                                    str3 = LIZJ.getSecond();
                                } else {
                                    str3 = null;
                                }
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append('(');
                                LIZ.append(C44384HbQ.LLILZIL(next2.getTransformX()));
                                LIZ.append(", ");
                                LIZ.append(C44384HbQ.LLILZLL(next2.getTransformX()));
                                LIZ.append(')');
                                arrayList.add(new AutoCutTitle(str2, str3, X1D.LIZIZ(LIZ), null, 8, null));
                            }
                        }
                    }
                }
            }
        }
        List LLJI = ORZ.LLJI(arrayList);
        AutoCutModel autoCutModel = this.LJI;
        int i3 = this.LJIJJLI;
        boolean LJIL = LJIL();
        String str12 = this.LJIIL;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLLL(this.LJI.templateList);
        if (autoCutThemeData != null && (set = autoCutThemeData.preloadUrsSet) != null) {
            num = Integer.valueOf(set.size());
        }
        C45049Hm9.LJIILJJIL(true, 0, Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT), null, LIZLLL, j, list, str4, str5, str6, i, str7, i2, str8, str9, str11, LLJI, autoCutModel, i3, LJIL, str10, str12, num);
    }

    @Override // X.InterfaceC45209Hoj
    public void LJIJ(int i) {
        this.LJIJ = i;
        this.LJIIJJI = System.currentTimeMillis();
    }

    @Override // X.InterfaceC45209Hoj
    public void LJIILJJIL(String taskId, List templateList) {
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        C45049Hm9.LJIILLIIL(true, 0, null, C45049Hm9.LIZLLL(this.LJIIIIZZ), this.LIZLLL, this.LIZIZ, this.LIZJ, this.LJIILLIIL, LJIL());
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIJI(int i, String str) {
        this.LJIILLIIL = i;
        this.LJIL = str;
    }

    public final void LJIJJ(String str, AutoCutModel autoCutModel) {
        Integer num;
        long j;
        o.LJIIIZ(autoCutModel, "autoCutModel");
        if (this.LJIJJ != null && C133625Mg.LIZ() && autoCutModel.curTemplateType != EnumC43998HOo.CUT_SAME.getValue()) {
            autoCutModel.asyncRenderModel.costDuration = C45049Hm9.LIZLLL(this.LJII);
            NLEModel nLEModel = this.LJIJJ;
            java.util.Set<String> LLJJ = ORZ.LLJJ(new VecString(NLEMediaPublicJniJNI.NLERenderResourceUtil_getUnpreparedUnnecessaryResources(NLEModel.getCPtr(nLEModel), nLEModel), true));
            autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet = LLJJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ASYNC_RENDER: Unnecessary Count=");
            java.util.Set<String> set = autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet;
            if (set != null) {
                num = Integer.valueOf(set.size());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(", List=");
            LIZ.append(LLJJ);
            X1D.LIZIZ(LIZ);
            java.util.Set<String> set2 = autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet;
            if (set2 != null && set2.size() == 0) {
                NLEModel nLEModel2 = this.LJIJJ;
                if (nLEModel2 != null) {
                    j = nLEModel2.getDuration();
                } else {
                    j = 0;
                }
                AutoCutAsyncRenderModel autoCutAsyncRenderModel = autoCutModel.asyncRenderModel;
                C45049Hm9.LJII("completed", j, autoCutAsyncRenderModel.costDuration, 0L, 0L, autoCutAsyncRenderModel.asyncRenderNecessaryDownloadCount, autoCutAsyncRenderModel.asyncRenderNecessaryTotalCount, 0, autoCutAsyncRenderModel.asyncRenderUnnecessaryTotalCount, 0, 0, 0, 0, this.LIZLLL);
            }
        }
    }

    public final void LJIJJLI(String str, AutoCutModel autoCutModel) {
        o.LJIIIZ(autoCutModel, "autoCutModel");
        if (this.LJIJJ != null && C133625Mg.LIZ() && autoCutModel.curTemplateType != EnumC43998HOo.CUT_SAME.getValue()) {
            NLEModel nLEModel = this.LJIJJ;
            VecString vecString = new VecString(NLEMediaPublicJniJNI.NLERenderResourceUtil_getUnpreparedNecessaryResources(NLEModel.getCPtr(nLEModel), nLEModel), true);
            autoCutModel.asyncRenderModel.asyncRenderNecessaryTotalCount = vecString.size();
            NLEModel nLEModel2 = this.LJIJJ;
            VecString vecString2 = new VecString(NLEMediaPublicJniJNI.NLERenderResourceUtil_getUnpreparedUnnecessaryResources(NLEModel.getCPtr(nLEModel2), nLEModel2), true);
            autoCutModel.asyncRenderModel.asyncRenderUnnecessaryTotalCount = vecString2.size();
        }
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILL(int i, Integer num, String str, EnumC45211Hol errStatus) {
        String str2;
        Integer num2;
        java.util.Set<String> set;
        o.LJIIIZ(errStatus, "errStatus");
        String str3 = this.LIZ;
        String str4 = this.LIZIZ;
        String str5 = this.LIZJ;
        int i2 = this.LJFF;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", str3);
        c145995oB.LJI("shoot_way", str4);
        if (i2 == 0) {
            str2 = "upload";
        } else {
            str2 = "shoot";
        }
        c145995oB.LJI("content_source", str2);
        c145995oB.LJI("creation_id", str5);
        c145995oB.LIZ(i, "error_type");
        FMX.LJIIL("enter_autocut_retry_page", c145995oB.LIZ);
        long LIZLLL = C45049Hm9.LIZLLL(this.LJII);
        long LIZLLL2 = C45049Hm9.LIZLLL(this.LJII);
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str6 = this.LIZIZ;
        String str7 = this.LIZJ;
        String str8 = this.LJ;
        int i3 = this.LJFF;
        String str9 = this.LIZ;
        int i4 = this.LJIILLIIL;
        AutoCutModel autoCutModel = this.LJI;
        String str10 = autoCutModel.clickFrom;
        String str11 = this.LJIILJJIL;
        String str12 = this.LJIILL;
        String str13 = this.LJIILIIL;
        int i5 = this.LJIJJLI;
        boolean LJIL = LJIL();
        String str14 = this.LJIIL;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLLL(this.LJI.templateList);
        if (autoCutThemeData != null && (set = autoCutThemeData.preloadUrsSet) != null) {
            num2 = Integer.valueOf(set.size());
        } else {
            num2 = null;
        }
        C45049Hm9.LJIILJJIL(false, i, num, str, LIZLLL, LIZLLL2, list, str6, str7, str8, i3, str9, i4, str10, str11, str13, null, autoCutModel, i5, LJIL, str12, str14, num2);
        if (i == SmartMovieErrorCode.ZIP_EMPTY.swigValue() || i == SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue() || i == SmartMovieErrorCode.MUSIC_REQUEST_FAILURE.swigValue() || i == 1004 || i == 1005 || i == 1006) {
            C45049Hm9.LJIILLIIL(false, i, str, C45049Hm9.LIZLLL(this.LJIIIIZZ), this.LIZLLL, this.LIZIZ, this.LIZJ, this.LJIILLIIL, LJIL());
            return;
        }
        if (i == SmartMovieErrorCode.COMPRESS_FAILURE.swigValue() || i == SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue() || i == SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue() || i == SmartMovieErrorCode.HANDLE_TEMPLATE_FAILURE.swigValue() || i == SmartMovieErrorCode.INPUT_RESOURCE_EXCEPTION.swigValue()) {
            C45049Hm9.LJIIZILJ("source_auto_cut", false, i, num, str, C45049Hm9.LIZLLL(this.LJIIIZ), this.LJIIL, this.LJIILIIL, this.LIZLLL, this.LIZ, this.LIZIZ, this.LIZJ, this.LJ, this.LJIILJJIL, this.LJIILLIIL, LJIL(), this.LJIILL);
            return;
        }
        switch (i) {
            case 1001:
            case 1002:
            case 1003:
                break;
            default:
                if (i != 1007) {
                    return;
                }
                break;
        }
        C45049Hm9.LJIIIIZZ(C45049Hm9.LIZLLL(this.LJIIJ), "source_auto_cut", str, this.LJIIZILJ, this.LIZIZ, i, this.LIZJ, false);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIL(int i, int i2, String str, String str2, String str3) {
        int i3 = this.LJIJ;
        C45049Hm9.LJIILIIL("source_auto_cut", i3 - i, i3, C45049Hm9.LIZLLL(this.LJIIJJI), this.LIZIZ, this.LIZJ, str, str2, i2, str3);
    }

    public /* synthetic */ AbstractC45048Hm8(String str, String str2, String str3, List list, String str4, AutoCutModel autoCutModel) {
        this(str, str2, str3, list, str4, 0, autoCutModel);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJ(String str, String str2, int i, int i2, String str3, String str4) {
        this.LJJ = C45049Hm9.LIZLLL(this.LJII);
        this.LJIJJLI = i2;
        C45049Hm9.LJIIZILJ("source_auto_cut", true, 0, Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT), null, C45049Hm9.LIZLLL(this.LJIIIZ), str, str2, this.LIZLLL, this.LIZ, this.LIZIZ, this.LIZJ, this.LJ, str3, i, LJIL(), str4);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILIIL(int i, String str, String str2, String str3, String str4, String str5) {
        this.LJIIIZ = System.currentTimeMillis();
        this.LJIIL = str;
        this.LJIILIIL = str2;
        this.LJIILJJIL = str3;
        this.LJIILLIIL = i;
        this.LJIL = str5;
        this.LJIILL = str4;
    }

    public AbstractC45048Hm8(String str, String str2, String str3, List<AutoCutMediaModel> list, String str4, int i, AutoCutModel autoCutModel) {
        o.LJIIIZ(autoCutModel, "autoCutModel");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
        this.LJ = str4;
        this.LJFF = i;
        this.LJI = autoCutModel;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIILLIIL = EnumC43998HOo.ALGORITHM_TEMPLATE.getValue();
        this.LJIJ = -1;
        this.LJIJI = new LinkedHashMap();
    }
}
