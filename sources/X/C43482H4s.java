package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.publish.SmartCodecMobDataModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import defpackage.g0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AqS37S0100100_7;
import kotlin.jvm.internal.o;

/* renamed from: X.H4s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43482H4s extends AbstractC41873Gc1 {
    public final InterfaceC65784Pro<Boolean> LJ;
    public VideoPublishEditModel LJFF;
    public C43458H3u LJI;
    public C43397H1l LJII;
    public PublishModel LJIIIIZZ;
    public InterfaceC43387H1b LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public long LJIILIIL;
    public C42979Gtr LJIILJJIL;

    public final C145995oB LJII() {
        C43397H1l c43397H1l = this.LJII;
        if (c43397H1l != null) {
            C60016Ngy c60016Ngy = new C60016Ngy(c43397H1l.LJLIL);
            VideoPublishEditModel videoPublishEditModel = this.LJFF;
            if (videoPublishEditModel != null) {
                C145995oB LJI = C5V5.LJI(videoPublishEditModel);
                c60016Ngy.LIZ(videoPublishEditModel, LJI);
                return LJI;
            }
            o.LJIJI("editModel");
            throw null;
        }
        o.LJIJI("publishId");
        throw null;
    }

    public C43482H4s(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        super(H1U.COMPILE, 2);
        this.LJ = interfaceC65784Pro;
        this.LJIIJJI = -2;
    }

    @Override // X.AbstractC41873Gc1, X.InterfaceC36938Eec
    public void onEvent(AbstractC41872Gc0 event) {
        o.LJIIIZ(event, "event");
        super.onEvent(event);
        if (event.LIZ == H1U.COMPILE && (event instanceof C41870Gby)) {
            this.LJIILIIL = C42377Gk9.LIZ();
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        Object obj;
        String str;
        String str2;
        String str3;
        float f;
        String str4;
        String str5;
        String str6;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJFF = ((C43403H1r) next).LIZ;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43404H1s) {
                            if (next2 != null) {
                                this.LJIIIIZZ = ((C43404H1s) next2).LIZ;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43458H3u) {
                                        if (next3 != null) {
                                            this.LJI = (C43458H3u) next3;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        this.LJII = (C43397H1l) next4;
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof InterfaceC43387H1b) {
                                                                if (next5 != null) {
                                                                    this.LJIIIZ = (InterfaceC43387H1b) next5;
                                                                    Iterator<Object> it6 = args.LIZ.iterator();
                                                                    while (true) {
                                                                        if (it6.hasNext()) {
                                                                            obj = it6.next();
                                                                            if (obj == null || (obj instanceof C42979Gtr)) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            obj = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!(obj instanceof C42979Gtr)) {
                                                                        obj = null;
                                                                    }
                                                                    this.LJIILJJIL = (C42979Gtr) obj;
                                                                    VideoPublishEditModel videoPublishEditModel = this.LJFF;
                                                                    if (videoPublishEditModel != null) {
                                                                        videoPublishEditModel.setPrePublishStarted(true);
                                                                        SystemClock.uptimeMillis();
                                                                        long j = 1024;
                                                                        int LIZ = (int) ((C48340Iy8.LIZ(C5L7.LIZ()) / j) / j);
                                                                        C145995oB LJII = LJII();
                                                                        VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
                                                                        if (videoPublishEditModel2 != null) {
                                                                            LJII.LJI("resolution", videoPublishEditModel2.getVideoResolution());
                                                                            boolean LIZ2 = C44739Hh9.LIZ();
                                                                            String str7 = CardStruct.IStatusCode.DEFAULT;
                                                                            if (LIZ2) {
                                                                                str = "1";
                                                                            } else {
                                                                                str = CardStruct.IStatusCode.DEFAULT;
                                                                            }
                                                                            LJII.LJI("is_hardcode", str);
                                                                            StringBuilder LIZ3 = X1D.LIZ();
                                                                            VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
                                                                            if (videoPublishEditModel3 != null) {
                                                                                LIZ3.append(C44739Hh9.LJI(H7R.LJJJJI(videoPublishEditModel3)));
                                                                                LIZ3.append("");
                                                                                LJII.LJI("bite_rate", X1D.LIZIZ(LIZ3));
                                                                                StringBuilder LIZ4 = X1D.LIZ();
                                                                                LIZ4.append(C44739Hh9.LJII());
                                                                                LIZ4.append("");
                                                                                LJII.LJI("video_quality", X1D.LIZIZ(LIZ4));
                                                                                LJII.LJI("_perf_monitor", "1");
                                                                                C43397H1l c43397H1l = this.LJII;
                                                                                if (c43397H1l != null) {
                                                                                    LJII.LIZJ(c43397H1l, "publish_id");
                                                                                    PublishModel publishModel = this.LJIIIIZZ;
                                                                                    if (publishModel != null) {
                                                                                        LJII.LIZ(publishModel.publishType, "pre_publish_type");
                                                                                        PublishModel publishModel2 = this.LJIIIIZZ;
                                                                                        if (publishModel2 != null) {
                                                                                            LJII.LIZ(publishModel2.publishType, "publish_type");
                                                                                            if (C19N.LJ("tool_enable_privacy_preupload_switch", false)) {
                                                                                                str2 = "1";
                                                                                            } else {
                                                                                                str2 = CardStruct.IStatusCode.DEFAULT;
                                                                                            }
                                                                                            LJII.LJI("user_enable_pre_publish", str2);
                                                                                            if (C60903NvH.LJIIJJI().LJJIL().getEnablePreUploadByUser(false)) {
                                                                                                str3 = "1";
                                                                                            } else {
                                                                                                str3 = CardStruct.IStatusCode.DEFAULT;
                                                                                            }
                                                                                            LJII.LJI("feature_enable_pre_publish", str3);
                                                                                            HTP htp = HTP.LJLJL;
                                                                                            htp.getClass();
                                                                                            int i = (int) (0 / j);
                                                                                            LJII.LIZ(LIZ - i, "total_available_memory_mb");
                                                                                            if (LIZ <= 0) {
                                                                                                f = 1.0f;
                                                                                            } else {
                                                                                                htp.getClass();
                                                                                                float f2 = LIZ;
                                                                                                f = (f2 - i) / f2;
                                                                                            }
                                                                                            LJII.LIZJ(Float.valueOf(f), "total_available_memory_percentage");
                                                                                            LJII.LIZ(LIZ, "total_memory_mb");
                                                                                            LJII.LIZ((int) ((Runtime.getRuntime().maxMemory() / j) / j), "jvm_allow_memory_mb");
                                                                                            LJII.LIZ(((int) ((Runtime.getRuntime().maxMemory() / j) / j)) - ((int) (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / j) / j)), "jvm_available_memory_mb");
                                                                                            LJII.LIZJ(Float.valueOf(((int) (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / j) / j)) / ((int) ((Runtime.getRuntime().maxMemory() / j) / j))), "jvm_available_memory_percentage");
                                                                                            VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
                                                                                            if (videoPublishEditModel4 != null) {
                                                                                                LJII.LIZ(videoPublishEditModel4.videoFps(false), "fps");
                                                                                                PublishModel publishModel3 = this.LJIIIIZZ;
                                                                                                if (publishModel3 != null) {
                                                                                                    LJII.LIZ(publishModel3.isEditSave ? 1 : 0, "is_save_local");
                                                                                                    VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
                                                                                                    if (videoPublishEditModel5 != null) {
                                                                                                        LJII.LIZ(videoPublishEditModel5.getPreviewInfo().getPreviewVideoLength(), "source_duration");
                                                                                                        VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
                                                                                                        if (videoPublishEditModel6 != null) {
                                                                                                            LJII.LIZ(videoPublishEditModel6.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
                                                                                                            VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
                                                                                                            if (videoPublishEditModel7 != null) {
                                                                                                                if (!TextUtils.isEmpty(videoPublishEditModel7.mShootWay)) {
                                                                                                                    VideoPublishEditModel videoPublishEditModel8 = this.LJFF;
                                                                                                                    if (videoPublishEditModel8 != null) {
                                                                                                                        LJII.LIZLLL("shoot_way", videoPublishEditModel8.mShootWay);
                                                                                                                    } else {
                                                                                                                        o.LJIJI("editModel");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                VideoPublishEditModel videoPublishEditModel9 = this.LJFF;
                                                                                                                if (videoPublishEditModel9 != null) {
                                                                                                                    if (!TextUtils.isEmpty(videoPublishEditModel9.clientId)) {
                                                                                                                        VideoPublishEditModel videoPublishEditModel10 = this.LJFF;
                                                                                                                        if (videoPublishEditModel10 != null) {
                                                                                                                            LJII.LIZLLL("channel", videoPublishEditModel10.clientId);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("editModel");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    VideoPublishEditModel videoPublishEditModel11 = this.LJFF;
                                                                                                                    if (videoPublishEditModel11 != null) {
                                                                                                                        if (!TextUtils.isEmpty(videoPublishEditModel11.shareId)) {
                                                                                                                            VideoPublishEditModel videoPublishEditModel12 = this.LJFF;
                                                                                                                            if (videoPublishEditModel12 != null) {
                                                                                                                                LJII.LIZLLL("open_platform_share_id", videoPublishEditModel12.shareId);
                                                                                                                            } else {
                                                                                                                                o.LJIJI("editModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        VideoPublishEditModel videoPublishEditModel13 = this.LJFF;
                                                                                                                        if (videoPublishEditModel13 != null) {
                                                                                                                            H57 hardcodeAdaptiveResult = videoPublishEditModel13.getHardcodeAdaptiveResult();
                                                                                                                            if (hardcodeAdaptiveResult != null) {
                                                                                                                                LJII.LIZJ(Float.valueOf(hardcodeAdaptiveResult.LIZ), "hw_opt_bitrate_set_result");
                                                                                                                                LJII.LIZJ(Float.valueOf(hardcodeAdaptiveResult.LIZIZ), "pre_bitrate_status");
                                                                                                                            }
                                                                                                                            VideoPublishEditModel videoPublishEditModel14 = this.LJFF;
                                                                                                                            if (videoPublishEditModel14 != null) {
                                                                                                                                if (TextUtils.equals(H7R.LJIIIIZZ(videoPublishEditModel14), "upload")) {
                                                                                                                                    VideoPublishEditModel videoPublishEditModel15 = this.LJFF;
                                                                                                                                    if (videoPublishEditModel15 != null) {
                                                                                                                                        LJII.LIZ(H7R.LJJJJ(videoPublishEditModel15) ? 1 : 0, "is_fast_import");
                                                                                                                                    } else {
                                                                                                                                        o.LJIJI("editModel");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                VideoPublishEditModel videoPublishEditModel16 = this.LJFF;
                                                                                                                                if (videoPublishEditModel16 != null) {
                                                                                                                                    LJII.LIZLLL("creation_id", videoPublishEditModel16.getCreationId());
                                                                                                                                    VideoPublishEditModel videoPublishEditModel17 = this.LJFF;
                                                                                                                                    if (videoPublishEditModel17 != null) {
                                                                                                                                        LJII.LIZLLL("content_source", H7R.LJIIIIZZ(videoPublishEditModel17));
                                                                                                                                        VideoPublishEditModel videoPublishEditModel18 = this.LJFF;
                                                                                                                                        if (videoPublishEditModel18 != null) {
                                                                                                                                            LJII.LIZLLL("content_type", H7R.LJIIIZ(videoPublishEditModel18));
                                                                                                                                            int i2 = this.LJIIJJI;
                                                                                                                                            if (i2 != 0) {
                                                                                                                                                LJII.LIZ(i2, "notRemuxErrorcode");
                                                                                                                                            }
                                                                                                                                            C43458H3u c43458H3u = this.LJI;
                                                                                                                                            if (c43458H3u != null) {
                                                                                                                                                LJII.LIZ(c43458H3u.LIZIZ ? 1 : 0, "is_click_publish");
                                                                                                                                                VideoPublishEditModel videoPublishEditModel19 = this.LJFF;
                                                                                                                                                if (videoPublishEditModel19 != null) {
                                                                                                                                                    ShareKitPanel shareKitPanel = videoPublishEditModel19.creativeFlowData.getShareKitPanel();
                                                                                                                                                    if (shareKitPanel != null) {
                                                                                                                                                        LJII.LIZLLL("effect_resource_id", shareKitPanel.getEffectResourceId());
                                                                                                                                                        LJII.LIZLLL("channel", shareKitPanel.getClientKey());
                                                                                                                                                        LJII.LIZLLL("share_panel_option", shareKitPanel.getSharePanelOption());
                                                                                                                                                        LJII.LIZJ(shareKitPanel.getShareMediaType(), "share_media_type");
                                                                                                                                                    }
                                                                                                                                                    VideoPublishEditModel videoPublishEditModel20 = this.LJFF;
                                                                                                                                                    if (videoPublishEditModel20 != null) {
                                                                                                                                                        C43722HDy LIZJ = C43723HDz.LIZJ(videoPublishEditModel20);
                                                                                                                                                        if (LIZJ != null) {
                                                                                                                                                            LJII.LIZLLL("channel", LIZJ.mClientKey);
                                                                                                                                                            LJII.LIZLLL("sdk_name", LIZJ.getSdkNameForServer());
                                                                                                                                                            LJII.LIZLLL("sdk_version", LIZJ.mSdkVersion);
                                                                                                                                                        }
                                                                                                                                                        VideoPublishEditModel videoPublishEditModel21 = this.LJFF;
                                                                                                                                                        if (videoPublishEditModel21 != null) {
                                                                                                                                                            if (videoPublishEditModel21.creativeFlowData.getEditorProModel() != null) {
                                                                                                                                                                VideoPublishEditModel videoPublishEditModel22 = this.LJFF;
                                                                                                                                                                if (videoPublishEditModel22 != null) {
                                                                                                                                                                    if (videoPublishEditModel22.getEditorProModel().isAdvancedEdit()) {
                                                                                                                                                                        str5 = "1";
                                                                                                                                                                    } else {
                                                                                                                                                                        str5 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                                                    }
                                                                                                                                                                    LJII.LJI("is_use_editor_pro", str5);
                                                                                                                                                                    VideoPublishEditModel videoPublishEditModel23 = this.LJFF;
                                                                                                                                                                    if (videoPublishEditModel23 != null) {
                                                                                                                                                                        if (videoPublishEditModel23.getEditorProModel().isPipUsed()) {
                                                                                                                                                                            str6 = "1";
                                                                                                                                                                        } else {
                                                                                                                                                                            str6 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                                                        }
                                                                                                                                                                        LJII.LJI("is_use_pip", str6);
                                                                                                                                                                        C1292755n c1292755n = C1292755n.LIZ;
                                                                                                                                                                        VideoPublishEditModel videoPublishEditModel24 = this.LJFF;
                                                                                                                                                                        if (videoPublishEditModel24 != null) {
                                                                                                                                                                            c1292755n.getClass();
                                                                                                                                                                            LJII.LIZLLL("all_editor_pro_used_functions", C1292755n.LIZIZ(videoPublishEditModel24));
                                                                                                                                                                        } else {
                                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        o.LJIJI("editModel");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            VideoPublishEditModel videoPublishEditModel25 = this.LJFF;
                                                                                                                                                            if (videoPublishEditModel25 != null) {
                                                                                                                                                                ArrayList<EffectPointModel> effectList = videoPublishEditModel25.getEffectList();
                                                                                                                                                                o.LJIIIIZZ(effectList, "editModel.effectList");
                                                                                                                                                                if (!effectList.isEmpty()) {
                                                                                                                                                                    Iterator<EffectPointModel> it7 = effectList.iterator();
                                                                                                                                                                    while (it7.hasNext()) {
                                                                                                                                                                        Boolean isNewEngineEffect = it7.next().getIsNewEngineEffect();
                                                                                                                                                                        o.LJIIIIZZ(isNewEngineEffect, "it.isNewEngineEffect");
                                                                                                                                                                        if (isNewEngineEffect.booleanValue()) {
                                                                                                                                                                            str4 = "1";
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                str4 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                                                LJII.LIZLLL("is_use_CC_effect", str4);
                                                                                                                                                                VideoPublishEditModel videoPublishEditModel26 = this.LJFF;
                                                                                                                                                                if (videoPublishEditModel26 != null) {
                                                                                                                                                                    if (videoPublishEditModel26.hasTextSticker()) {
                                                                                                                                                                        str7 = "1";
                                                                                                                                                                    }
                                                                                                                                                                    LJII.LIZLLL("text_added", str7);
                                                                                                                                                                    java.util.Map<String, String> map = LJII.LIZ;
                                                                                                                                                                    o.LJIIIIZZ(map, "builder.builder()");
                                                                                                                                                                    LJIIIIZZ("video_compose_start", map);
                                                                                                                                                                    this.LJIIJ = H6A.LIZIZ.LIZ();
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                o.LJIJI("editModel");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        o.LJIJI("editModel");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                o.LJIJI("editModel");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            o.LJIJI("clickPublishWaiter");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        o.LJIJI("editModel");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                o.LJIJI("editModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            o.LJIJI("editModel");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        o.LJIJI("editModel");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    o.LJIJI("editModel");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                o.LJIJI("editModel");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("editModel");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        o.LJIJI("editModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("editModel");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("publishModel");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("editModel");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("publishModel");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("publishModel");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("publishId");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("editModel");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("editModel");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("editModel");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIIIIZZ(String str, java.util.Map<String, String> map) {
        InterfaceC43387H1b interfaceC43387H1b = this.LJIIIZ;
        if (interfaceC43387H1b != null) {
            interfaceC43387H1b.LIZJ().getClass();
            FMX.LJIIL(str, map);
        } else {
            o.LJIJI("dependency");
            throw null;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZIZ(C41875Gc3 happenTime, Object sourceTag, Object info) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        o.LJIIIZ(info, "info");
        if (info instanceof H3H) {
            this.LJIIJJI = ((H3H) info).LJLIL;
        } else {
            if (!(info instanceof H3G)) {
                return;
            }
            this.LJIIL = ((H3G) info).LJLILLLLZI;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        C42360Gjs c42360Gjs;
        Throwable th;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        if (cause instanceof C42984Gtw) {
            c42360Gjs = ((C42984Gtw) cause).LIZ;
        } else {
            c42360Gjs = null;
        }
        if (c42360Gjs != null) {
            th = c42360Gjs.getT();
        } else {
            th = null;
        }
        C43458H3u c43458H3u = this.LJI;
        if (c43458H3u != null) {
            LJI(false, true, th, null, i, c43458H3u.LIZIZ);
        } else {
            o.LJIJI("clickPublishWaiter");
            throw null;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        Throwable t = error.getT();
        C43458H3u c43458H3u = this.LJI;
        if (c43458H3u != null) {
            LJI(false, false, t, null, i, c43458H3u.LIZIZ);
        } else {
            o.LJIJI("clickPublishWaiter");
            throw null;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        C43458H3u c43458H3u = this.LJI;
        if (c43458H3u != null) {
            LJI(true, false, null, synthetiseResult, i, c43458H3u.LIZIZ);
        } else {
            o.LJIJI("clickPublishWaiter");
            throw null;
        }
    }

    public final void LJI(boolean z, boolean z2, Throwable th, SynthetiseResult synthetiseResult, int i, boolean z3) {
        long j;
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        int i4;
        long j2;
        int i5;
        int i6;
        String str4;
        String str5;
        String str6;
        boolean z4;
        C42979Gtr c42979Gtr;
        NowsExtra nowsExtra;
        String str7;
        String str8;
        String str9;
        String str10;
        int i7;
        VideoFileInfo videoFileInfo;
        C43485H4v c43485H4v;
        String str11;
        C42979Gtr c42979Gtr2;
        SystemClock.uptimeMillis();
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        if (videoPublishEditModel != null) {
            videoPublishEditModel.creativeModel.prePublishStatusModel.LIZ = z;
            videoPublishEditModel.setPreCompileResult(z);
            VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
            if (videoPublishEditModel2 != null) {
                videoPublishEditModel2.setPrePublishStarted(false);
                if (this.LJIIJ > 0) {
                    j = H6A.LIZIZ.LIZ() - this.LJIIJ;
                } else {
                    j = 0;
                }
                this.LJIIJ = j;
                C145995oB LJII = LJII();
                LJII.LIZ(i, "duration");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(z ? 1 : 0);
                String str12 = "";
                LIZ.append("");
                LJII.LJI("status", X1D.LIZIZ(LIZ));
                String str13 = "1";
                if (C44739Hh9.LIZ()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                LJII.LJI("is_hardcode", str);
                StringBuilder LIZ2 = X1D.LIZ();
                VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
                if (videoPublishEditModel3 != null) {
                    LIZ2.append(C44739Hh9.LJI(H7R.LJJJJI(videoPublishEditModel3)));
                    LIZ2.append("");
                    LJII.LJI("bite_rate", X1D.LIZIZ(LIZ2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(C44739Hh9.LJII());
                    LIZ3.append("");
                    LJII.LJI("video_quality", X1D.LIZIZ(LIZ3));
                    LJII.LJI("_perf_monitor", "1");
                    VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
                    if (videoPublishEditModel4 != null) {
                        LJII.LIZ(videoPublishEditModel4.videoFps(false), "fps");
                        C43397H1l c43397H1l = this.LJII;
                        if (c43397H1l != null) {
                            LJII.LIZJ(c43397H1l, "publish_id");
                            VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
                            if (videoPublishEditModel5 != null) {
                                LJII.LIZ(C44546He2.LJ(videoPublishEditModel5) ? 1 : 0, "is_hd_setting");
                                if (z3) {
                                    str2 = "homepage_follow";
                                } else {
                                    str2 = "video_post_page";
                                }
                                LJII.LJI("current_page", str2);
                                if (this.LJIILIIL != 0 && (c42979Gtr2 = this.LJIILJJIL) != null) {
                                    long LIZ4 = c42979Gtr2.LIZ();
                                    if (LIZ4 > 0) {
                                        LJII.LIZIZ((LIZ4 - this.LJIILIIL) / 1024, "content_storage_size");
                                    }
                                }
                                if (th != null) {
                                    str3 = th.toString();
                                } else {
                                    str3 = null;
                                }
                                LJII.LIZLLL("fail_info", str3);
                                if (!z) {
                                    if (z2) {
                                        LJII.LIZ(-66666, "error_code");
                                    } else {
                                        LJII.LIZ(C42991Gu3.LJFF(th), "error_code");
                                    }
                                }
                                VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
                                if (videoPublishEditModel6 != null) {
                                    long j3 = -1;
                                    if (C44687HgJ.LIZIZ(videoPublishEditModel6.mOutputFile)) {
                                        VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
                                        if (videoPublishEditModel7 != null) {
                                            j2 = C44694HgQ.LJFF(videoPublishEditModel7.mOutputFile);
                                            if (synthetiseResult != null && synthetiseResult.outputVideoFileInfo != null) {
                                                VideoFileInfo videoFileInfo2 = synthetiseResult.outputVideoFileInfo;
                                                o.LJI(videoFileInfo2);
                                                i2 = videoFileInfo2.getBitrate();
                                                VideoFileInfo videoFileInfo3 = synthetiseResult.outputVideoFileInfo;
                                                o.LJI(videoFileInfo3);
                                                str12 = videoFileInfo3.getResolution();
                                                VideoFileInfo videoFileInfo4 = synthetiseResult.outputVideoFileInfo;
                                                o.LJI(videoFileInfo4);
                                                j3 = videoFileInfo4.getDuration();
                                                VideoFileInfo videoFileInfo5 = synthetiseResult.outputVideoFileInfo;
                                                o.LJI(videoFileInfo5);
                                                i4 = videoFileInfo5.getCodecType();
                                                VideoFileInfo videoFileInfo6 = synthetiseResult.outputVideoFileInfo;
                                                o.LJI(videoFileInfo6);
                                                i3 = videoFileInfo6.getGop();
                                            } else {
                                                VideoPublishEditModel videoPublishEditModel8 = this.LJFF;
                                                if (videoPublishEditModel8 != null) {
                                                    i2 = C43495H5f.LIZ(videoPublishEditModel8.mOutputFile);
                                                    i3 = -1;
                                                    i4 = -1;
                                                } else {
                                                    o.LJIJI("editModel");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            o.LJIJI("editModel");
                                            throw null;
                                        }
                                    } else {
                                        i2 = 0;
                                        i3 = -1;
                                        i4 = -1;
                                        j2 = 0;
                                    }
                                    VideoPublishEditModel videoPublishEditModel9 = this.LJFF;
                                    if (videoPublishEditModel9 != null) {
                                        if (videoPublishEditModel9.getCompileProbeResult() != null) {
                                            VideoPublishEditModel videoPublishEditModel10 = this.LJFF;
                                            if (videoPublishEditModel10 != null) {
                                                CompileProbeResult compileProbeResult = videoPublishEditModel10.getCompileProbeResult();
                                                o.LJI(compileProbeResult);
                                                CompileProbeResult.ResultData data = compileProbeResult.getData();
                                                if (data != null) {
                                                    LJII.LIZJ(Float.valueOf(data.getPsnr()), "pre_psnr");
                                                    LJII.LIZ(data.getEncoderType(), "pre_encoder_type");
                                                    LJII.LIZ(data.getEncodeWidth(), "pre_encode_width");
                                                    LJII.LIZ(data.getEncodeHeight(), "pre_encode_height");
                                                    LJII.LIZ(data.getMaxBitrate(), "pre_max_bitrate");
                                                    LJII.LIZ(data.getPreset(), "pre_preset");
                                                    LJII.LIZ(data.getCrf(), "pre_crf");
                                                    LJII.LIZ(data.getGop(), "pre_gop");
                                                    LJII.LIZJ(Double.valueOf(data.getQpoffset()), "pre_qpoffset");
                                                    LJII.LIZ(data.getOptimizeCrf(), "pre_optimize_crf");
                                                }
                                            } else {
                                                o.LJIJI("editModel");
                                                throw null;
                                            }
                                        }
                                        VideoPublishEditModel videoPublishEditModel11 = this.LJFF;
                                        if (videoPublishEditModel11 != null) {
                                            H57 hardcodeAdaptiveResult = videoPublishEditModel11.getHardcodeAdaptiveResult();
                                            if (hardcodeAdaptiveResult != null) {
                                                LJII.LIZJ(Float.valueOf(hardcodeAdaptiveResult.LIZ), "hw_opt_bitrate_set_result");
                                                LJII.LIZJ(Float.valueOf(hardcodeAdaptiveResult.LIZIZ), "pre_bitrate_status");
                                            }
                                            VideoPublishEditModel videoPublishEditModel12 = this.LJFF;
                                            if (videoPublishEditModel12 != null) {
                                                int[] LJIJI = C78963Uyt.LJIJI(videoPublishEditModel12.getPreviewInfo());
                                                if (LJIJI != null) {
                                                    i5 = LJIJI[8];
                                                } else {
                                                    i5 = -1;
                                                }
                                                VideoPublishEditModel videoPublishEditModel13 = this.LJFF;
                                                if (videoPublishEditModel13 != null) {
                                                    OSZ LJJIIJ = g0.LJJIIJ(videoPublishEditModel13);
                                                    int intValue = ((Number) LJJIIJ.getSecond()).intValue() + ((Number) LJJIIJ.getFirst()).intValue();
                                                    if (intValue > 1) {
                                                        i6 = 1;
                                                    } else if (intValue == 1) {
                                                        i6 = 0;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    VideoPublishEditModel videoPublishEditModel14 = this.LJFF;
                                                    if (videoPublishEditModel14 != null) {
                                                        if (videoPublishEditModel14.isSyntheticHardEncode) {
                                                            str4 = "hardcoding";
                                                        } else {
                                                            str4 = "softcoding";
                                                        }
                                                        LJII.LJI("compose_coding", str4);
                                                        LJII.LIZ(i2, "file_bitrate");
                                                        LJII.LJI("resolution", str12);
                                                        LJII.LIZIZ(j3, "file_duration_ms");
                                                        LJII.LIZ(i4, "codec_type");
                                                        LJII.LIZ(i3, "gop");
                                                        LJII.LIZ(i5, "source_codec_type");
                                                        LJII.LIZ(i6, "is_multi_content");
                                                        VideoPublishEditModel videoPublishEditModel15 = this.LJFF;
                                                        if (videoPublishEditModel15 != null) {
                                                            LJII.LJI("original_resolution", C44384HbQ.LJJLIIIJLJLI(videoPublishEditModel15));
                                                            Locale locale = Locale.US;
                                                            long j4 = 1024;
                                                            String LLLZI = C16880lQ.LLLZI(locale, "%d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j4)}, 1));
                                                            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                                                            LJII.LIZLLL("file_size", LLLZI);
                                                            VideoPublishEditModel videoPublishEditModel16 = this.LJFF;
                                                            if (videoPublishEditModel16 != null) {
                                                                if (C39579Fg7.LIZIZ(videoPublishEditModel16.getLocalTempPath())) {
                                                                    VideoPublishEditModel videoPublishEditModel17 = this.LJFF;
                                                                    if (videoPublishEditModel17 != null) {
                                                                        j2 += new File(videoPublishEditModel17.getLocalTempPath()).length();
                                                                    } else {
                                                                        o.LJIJI("editModel");
                                                                        throw null;
                                                                    }
                                                                }
                                                                VideoPublishEditModel videoPublishEditModel18 = this.LJFF;
                                                                if (videoPublishEditModel18 != null) {
                                                                    if (videoPublishEditModel18.getLocalFinalPath() != null) {
                                                                        VideoPublishEditModel videoPublishEditModel19 = this.LJFF;
                                                                        if (videoPublishEditModel19 != null) {
                                                                            j2 += C44694HgQ.LJFF(videoPublishEditModel19.getLocalFinalPath());
                                                                        } else {
                                                                            o.LJIJI("editModel");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel20 = this.LJFF;
                                                                    if (videoPublishEditModel20 != null) {
                                                                        String creationId = videoPublishEditModel20.getCreationId();
                                                                        if (creationId != null && (c43485H4v = H53.LIZ) != null) {
                                                                            if (!o.LJ(creationId, c43485H4v.LIZ)) {
                                                                                C43485H4v c43485H4v2 = H53.LIZ;
                                                                                o.LJI(c43485H4v2);
                                                                                StringBuilder LIZ5 = X1D.LIZ();
                                                                                C1DI.LIZIZ(LIZ5, c43485H4v2.LJI, "onSyntheticFinish", " creationId Error, start:");
                                                                                C43485H4v c43485H4v3 = H53.LIZ;
                                                                                if (c43485H4v3 != null) {
                                                                                    str11 = c43485H4v3.LIZ;
                                                                                } else {
                                                                                    str11 = null;
                                                                                }
                                                                                LIZ5.append(str11);
                                                                                LIZ5.append(", now:");
                                                                                LIZ5.append(creationId);
                                                                                String LIZIZ = X1D.LIZIZ(LIZ5);
                                                                                o.LJIIIZ(LIZIZ, "<set-?>");
                                                                                c43485H4v2.LJI = LIZIZ;
                                                                                C43485H4v c43485H4v4 = H53.LIZ;
                                                                                if (c43485H4v4 != null) {
                                                                                    c43485H4v4.LJII = false;
                                                                                }
                                                                            }
                                                                            C43485H4v c43485H4v5 = H53.LIZ;
                                                                            if (c43485H4v5 != null) {
                                                                                c43485H4v5.LJ = H53.LIZ();
                                                                            }
                                                                            C43485H4v c43485H4v6 = H53.LIZ;
                                                                            if (c43485H4v6 != null) {
                                                                                float f = (float) 1024;
                                                                                c43485H4v6.LJFF = (((float) j2) / f) / f;
                                                                            }
                                                                        }
                                                                        C43485H4v c43485H4v7 = H53.LIZ;
                                                                        if (c43485H4v7 != null && c43485H4v7.LJII) {
                                                                            float f2 = c43485H4v7.LIZJ;
                                                                            H55 h55 = new H55(c43485H4v7.toString(), f2, f2 - c43485H4v7.LJ);
                                                                            LJII.LIZ((int) h55.LIZ, "init_available_size_mb");
                                                                            LJII.LIZ((int) h55.LIZIZ, "max_publish_usage_mb");
                                                                            LJII.LIZLLL("available_size_detail", h55.LIZJ);
                                                                        }
                                                                        VideoPublishEditModel videoPublishEditModel21 = this.LJFF;
                                                                        if (videoPublishEditModel21 != null) {
                                                                            if (!TextUtils.isEmpty(videoPublishEditModel21.mShootWay)) {
                                                                                VideoPublishEditModel videoPublishEditModel22 = this.LJFF;
                                                                                if (videoPublishEditModel22 != null) {
                                                                                    LJII.LIZLLL("shoot_way", videoPublishEditModel22.mShootWay);
                                                                                } else {
                                                                                    o.LJIJI("editModel");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            VideoPublishEditModel videoPublishEditModel23 = this.LJFF;
                                                                            if (videoPublishEditModel23 != null) {
                                                                                if (!TextUtils.isEmpty(videoPublishEditModel23.clientId)) {
                                                                                    VideoPublishEditModel videoPublishEditModel24 = this.LJFF;
                                                                                    if (videoPublishEditModel24 != null) {
                                                                                        LJII.LIZLLL("channel", videoPublishEditModel24.clientId);
                                                                                    } else {
                                                                                        o.LJIJI("editModel");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                VideoPublishEditModel videoPublishEditModel25 = this.LJFF;
                                                                                if (videoPublishEditModel25 != null) {
                                                                                    if (!TextUtils.isEmpty(videoPublishEditModel25.shareId)) {
                                                                                        VideoPublishEditModel videoPublishEditModel26 = this.LJFF;
                                                                                        if (videoPublishEditModel26 != null) {
                                                                                            LJII.LIZLLL("open_platform_share_id", videoPublishEditModel26.shareId);
                                                                                        } else {
                                                                                            o.LJIJI("editModel");
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                    VideoPublishEditModel videoPublishEditModel27 = this.LJFF;
                                                                                    if (videoPublishEditModel27 != null) {
                                                                                        LJII.LIZJ(videoPublishEditModel27.getUploadSpeedSettingsIndex(), "select_gear_by_upload_speed");
                                                                                        VideoPublishEditModel videoPublishEditModel28 = this.LJFF;
                                                                                        if (videoPublishEditModel28 != null) {
                                                                                            LJII.LJI("creation_id", videoPublishEditModel28.getCreationId());
                                                                                            VideoPublishEditModel videoPublishEditModel29 = this.LJFF;
                                                                                            if (videoPublishEditModel29 != null) {
                                                                                                LJII.LJI("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel29.mCurFilterIds));
                                                                                                VideoPublishEditModel videoPublishEditModel30 = this.LJFF;
                                                                                                if (videoPublishEditModel30 != null) {
                                                                                                    LJII.LJI("effect_list", videoPublishEditModel30.getEditEffectListStr());
                                                                                                    VideoPublishEditModel videoPublishEditModel31 = this.LJFF;
                                                                                                    if (videoPublishEditModel31 != null) {
                                                                                                        LJII.LJI("info_sticker_list", videoPublishEditModel31.getInfoStickerList());
                                                                                                        VideoPublishEditModel videoPublishEditModel32 = this.LJFF;
                                                                                                        if (videoPublishEditModel32 != null) {
                                                                                                            LJII.LJI("prop_list", videoPublishEditModel32.mStickerID);
                                                                                                            VideoPublishEditModel videoPublishEditModel33 = this.LJFF;
                                                                                                            if (videoPublishEditModel33 != null) {
                                                                                                                LJII.LJ("beautify_used", videoPublishEditModel33.faceBeautyOpen);
                                                                                                                PublishModel publishModel = this.LJIIIIZZ;
                                                                                                                if (publishModel != null) {
                                                                                                                    LJII.LIZ(publishModel.publishType, "publish_type");
                                                                                                                    LJII.LJI("beautify_info", C44228HXk.LIZ);
                                                                                                                    StringBuilder LIZ6 = X1D.LIZ();
                                                                                                                    VideoPublishEditModel videoPublishEditModel34 = this.LJFF;
                                                                                                                    if (videoPublishEditModel34 != null) {
                                                                                                                        LIZ6.append(videoPublishEditModel34.getWatermarkVideoResolution().getWidth());
                                                                                                                        LIZ6.append('*');
                                                                                                                        VideoPublishEditModel videoPublishEditModel35 = this.LJFF;
                                                                                                                        if (videoPublishEditModel35 != null) {
                                                                                                                            LIZ6.append(videoPublishEditModel35.getWatermarkVideoResolution().getHeight());
                                                                                                                            LJII.LJI("watermark_resolution", X1D.LIZIZ(LIZ6));
                                                                                                                            VideoPublishEditModel videoPublishEditModel36 = this.LJFF;
                                                                                                                            if (videoPublishEditModel36 != null) {
                                                                                                                                LJII.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel36));
                                                                                                                                VideoPublishEditModel videoPublishEditModel37 = this.LJFF;
                                                                                                                                if (videoPublishEditModel37 != null) {
                                                                                                                                    LJII.LIZ(C44546He2.LIZLLL(videoPublishEditModel37) ? 1 : 0, "is_hd_video");
                                                                                                                                    VideoPublishEditModel videoPublishEditModel38 = this.LJFF;
                                                                                                                                    if (videoPublishEditModel38 != null) {
                                                                                                                                        LJII.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel38));
                                                                                                                                        LJII.LIZIZ(j3, "source_duration");
                                                                                                                                        LJII.LIZIZ(j3, "creation_duration");
                                                                                                                                        PublishModel publishModel2 = this.LJIIIIZZ;
                                                                                                                                        if (publishModel2 != null) {
                                                                                                                                            LJII.LIZ(publishModel2.isEditSave ? 1 : 0, "is_save_local");
                                                                                                                                            VideoPublishEditModel videoPublishEditModel39 = this.LJFF;
                                                                                                                                            if (videoPublishEditModel39 != null) {
                                                                                                                                                C5V5.LIZIZ(LJII, videoPublishEditModel39);
                                                                                                                                                if (synthetiseResult != null && (videoFileInfo = synthetiseResult.outputVideoFileInfo) != null) {
                                                                                                                                                    LJII.LIZLLL("compose_fps", String.valueOf(videoFileInfo.getFps()));
                                                                                                                                                    LJII.LIZLLL("compose_resolution", videoFileInfo.getResolution());
                                                                                                                                                    LJII.LIZ(videoFileInfo.getBitrate(), "compose_file_bitrate");
                                                                                                                                                    if (C39579Fg7.LIZIZ(synthetiseResult.outputFile)) {
                                                                                                                                                        String LLLZI2 = C16880lQ.LLLZI(locale, "%d", Arrays.copyOf(new Object[]{Long.valueOf(new File(synthetiseResult.outputFile).length() / j4)}, 1));
                                                                                                                                                        o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
                                                                                                                                                        LJII.LIZLLL("compose_file_size", LLLZI2);
                                                                                                                                                    }
                                                                                                                                                    LJII.LIZLLL("compose_file_duration", String.valueOf(videoFileInfo.getDuration()));
                                                                                                                                                    LJII.LIZJ(Float.valueOf(C44677Hg9.LIZ()), "compose_bitrate");
                                                                                                                                                }
                                                                                                                                                VideoPublishEditModel videoPublishEditModel40 = this.LJFF;
                                                                                                                                                if (videoPublishEditModel40 != null) {
                                                                                                                                                    if (TextUtils.equals(H7R.LJIIIIZZ(videoPublishEditModel40), "upload")) {
                                                                                                                                                        VideoPublishEditModel videoPublishEditModel41 = this.LJFF;
                                                                                                                                                        if (videoPublishEditModel41 != null) {
                                                                                                                                                            LJII.LIZ(H7R.LJJJJ(videoPublishEditModel41) ? 1 : 0, "is_fast_import");
                                                                                                                                                        } else {
                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    VideoPublishEditModel videoPublishEditModel42 = this.LJFF;
                                                                                                                                                    if (videoPublishEditModel42 != null) {
                                                                                                                                                        LJII.LIZLLL("creation_id", videoPublishEditModel42.getCreationId());
                                                                                                                                                        if (synthetiseResult != null && (i7 = synthetiseResult.unableRemuxCode) != 0) {
                                                                                                                                                            LJII.LIZ(i7, "notRemuxErrorcode");
                                                                                                                                                        } else {
                                                                                                                                                            int i8 = this.LJIIJJI;
                                                                                                                                                            if (i8 != 0) {
                                                                                                                                                                LJII.LIZ(i8, "notRemuxErrorcode");
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (synthetiseResult != null) {
                                                                                                                                                            LJII.LIZ(synthetiseResult.synthetiseCPUEncode, "synthetise_cpu_encode");
                                                                                                                                                        } else {
                                                                                                                                                            LJII.LIZ(this.LJIIL, "synthetise_cpu_encode");
                                                                                                                                                        }
                                                                                                                                                        C43458H3u c43458H3u = this.LJI;
                                                                                                                                                        if (c43458H3u != null) {
                                                                                                                                                            LJII.LIZ(c43458H3u.LIZIZ ? 1 : 0, "is_click_publish");
                                                                                                                                                            LJII.LIZ(C60903NvH.LJIIJJI().getPublishService().LJIIL(), "publish_cnt");
                                                                                                                                                            VideoPublishEditModel videoPublishEditModel43 = this.LJFF;
                                                                                                                                                            if (videoPublishEditModel43 != null) {
                                                                                                                                                                ShareKitPanel shareKitPanel = videoPublishEditModel43.creativeFlowData.getShareKitPanel();
                                                                                                                                                                if (shareKitPanel != null) {
                                                                                                                                                                    LJII.LIZLLL("effect_resource_id", shareKitPanel.getEffectResourceId());
                                                                                                                                                                    LJII.LIZLLL("channel", shareKitPanel.getClientKey());
                                                                                                                                                                    LJII.LIZLLL("share_panel_option", shareKitPanel.getSharePanelOption());
                                                                                                                                                                    LJII.LIZJ(shareKitPanel.getShareMediaType(), "share_media_type");
                                                                                                                                                                }
                                                                                                                                                                VideoPublishEditModel videoPublishEditModel44 = this.LJFF;
                                                                                                                                                                if (videoPublishEditModel44 != null) {
                                                                                                                                                                    C43722HDy LIZJ = C43723HDz.LIZJ(videoPublishEditModel44);
                                                                                                                                                                    if (LIZJ != null) {
                                                                                                                                                                        LJII.LIZLLL("channel", LIZJ.mClientKey);
                                                                                                                                                                        LJII.LIZLLL("sdk_name", LIZJ.getSdkNameForServer());
                                                                                                                                                                        LJII.LIZLLL("sdk_version", LIZJ.mSdkVersion);
                                                                                                                                                                    }
                                                                                                                                                                    VideoPublishEditModel videoPublishEditModel45 = this.LJFF;
                                                                                                                                                                    if (videoPublishEditModel45 != null) {
                                                                                                                                                                        String str14 = videoPublishEditModel45.mShootWay;
                                                                                                                                                                        if (str14 != null) {
                                                                                                                                                                            LJII.LIZLLL("shoot_way", str14);
                                                                                                                                                                        }
                                                                                                                                                                        VideoPublishEditModel videoPublishEditModel46 = this.LJFF;
                                                                                                                                                                        if (videoPublishEditModel46 != null) {
                                                                                                                                                                            if (videoPublishEditModel46.creativeFlowData.getEditorProModel() != null) {
                                                                                                                                                                                VideoPublishEditModel videoPublishEditModel47 = this.LJFF;
                                                                                                                                                                                if (videoPublishEditModel47 != null) {
                                                                                                                                                                                    if (videoPublishEditModel47.getEditorProModel().isAdvancedEdit()) {
                                                                                                                                                                                        str9 = "1";
                                                                                                                                                                                    } else {
                                                                                                                                                                                        str9 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                                                                    }
                                                                                                                                                                                    LJII.LJI("is_use_editor_pro", str9);
                                                                                                                                                                                    VideoPublishEditModel videoPublishEditModel48 = this.LJFF;
                                                                                                                                                                                    if (videoPublishEditModel48 != null) {
                                                                                                                                                                                        if (videoPublishEditModel48.getEditorProModel().isPipUsed()) {
                                                                                                                                                                                            str10 = "1";
                                                                                                                                                                                        } else {
                                                                                                                                                                                            str10 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                                                                        }
                                                                                                                                                                                        LJII.LJI("is_use_pip", str10);
                                                                                                                                                                                        C1292755n c1292755n = C1292755n.LIZ;
                                                                                                                                                                                        VideoPublishEditModel videoPublishEditModel49 = this.LJFF;
                                                                                                                                                                                        if (videoPublishEditModel49 != null) {
                                                                                                                                                                                            c1292755n.getClass();
                                                                                                                                                                                            LJII.LIZLLL("all_editor_pro_used_functions", C1292755n.LIZIZ(videoPublishEditModel49));
                                                                                                                                                                                        } else {
                                                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        o.LJIJI("editModel");
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                                                    throw null;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            VideoPublishEditModel videoPublishEditModel50 = this.LJFF;
                                                                                                                                                                            if (videoPublishEditModel50 != null) {
                                                                                                                                                                                ArrayList<EffectPointModel> effectList = videoPublishEditModel50.getEffectList();
                                                                                                                                                                                o.LJIIIIZZ(effectList, "editModel.effectList");
                                                                                                                                                                                if (!effectList.isEmpty()) {
                                                                                                                                                                                    Iterator<EffectPointModel> it = effectList.iterator();
                                                                                                                                                                                    while (it.hasNext()) {
                                                                                                                                                                                        Boolean isNewEngineEffect = it.next().getIsNewEngineEffect();
                                                                                                                                                                                        o.LJIIIIZZ(isNewEngineEffect, "it.isNewEngineEffect");
                                                                                                                                                                                        if (isNewEngineEffect.booleanValue()) {
                                                                                                                                                                                            str5 = "1";
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                str5 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                                                                LJII.LIZLLL("is_use_CC_effect", str5);
                                                                                                                                                                                if (C41637GVt.LIZ() && this.LJ.invoke().booleanValue()) {
                                                                                                                                                                                    str6 = "1";
                                                                                                                                                                                } else {
                                                                                                                                                                                    str6 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                                                                }
                                                                                                                                                                                LJII.LIZLLL("user_enter_record_page", str6);
                                                                                                                                                                                VideoPublishEditModel videoPublishEditModel51 = this.LJFF;
                                                                                                                                                                                if (videoPublishEditModel51 != null) {
                                                                                                                                                                                    NowsShootModel nowsShootModel = videoPublishEditModel51.creativeModel.nowsShootModel;
                                                                                                                                                                                    if (nowsShootModel != null && (str8 = nowsShootModel.multiCameraMode) != null) {
                                                                                                                                                                                        LJII.LIZLLL("multi_camera_mode", str8);
                                                                                                                                                                                    }
                                                                                                                                                                                    VideoPublishEditModel videoPublishEditModel52 = this.LJFF;
                                                                                                                                                                                    if (videoPublishEditModel52 != null) {
                                                                                                                                                                                        LJII.LIZLLL("scenes_tag", String.valueOf(H7R.LJI(videoPublishEditModel52)));
                                                                                                                                                                                        VideoPublishEditModel videoPublishEditModel53 = this.LJFF;
                                                                                                                                                                                        if (videoPublishEditModel53 != null) {
                                                                                                                                                                                            NowsShootModel nowsShootModel2 = videoPublishEditModel53.creativeModel.nowsShootModel;
                                                                                                                                                                                            if (nowsShootModel2 != null && (nowsExtra = nowsShootModel2.nowsExtra) != null && (str7 = nowsExtra.dualType) != null) {
                                                                                                                                                                                                LJII.LIZLLL("dual_type", str7);
                                                                                                                                                                                            }
                                                                                                                                                                                            VideoPublishEditModel videoPublishEditModel54 = this.LJFF;
                                                                                                                                                                                            if (videoPublishEditModel54 != null) {
                                                                                                                                                                                                SmartCodecMobDataModel smartCodecMobDataModel = videoPublishEditModel54.creativeModel.commonMobModel.smartCodecMobDataModel;
                                                                                                                                                                                                if (smartCodecMobDataModel != null) {
                                                                                                                                                                                                    z4 = smartCodecMobDataModel.isUseSmartCodec;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    z4 = false;
                                                                                                                                                                                                }
                                                                                                                                                                                                LJII.LJ("is_smart_codec", z4);
                                                                                                                                                                                                VideoPublishEditModel videoPublishEditModel55 = this.LJFF;
                                                                                                                                                                                                if (videoPublishEditModel55 != null) {
                                                                                                                                                                                                    LJII.LIZLLL("not_use_smartcodec_reason", HIP.LIZIZ(videoPublishEditModel55));
                                                                                                                                                                                                    VideoPublishEditModel videoPublishEditModel56 = this.LJFF;
                                                                                                                                                                                                    if (videoPublishEditModel56 != null) {
                                                                                                                                                                                                        if (!videoPublishEditModel56.hasTextSticker()) {
                                                                                                                                                                                                            str13 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        LJII.LIZLLL("text_added", str13);
                                                                                                                                                                                                        java.util.Map<String, String> map = LJII.LIZ;
                                                                                                                                                                                                        o.LJIIIIZZ(map, "builder.builder()");
                                                                                                                                                                                                        LJIIIIZZ("video_compose_end", map);
                                                                                                                                                                                                        if (this.LJIILIIL != 0 && (c42979Gtr = this.LJIILJJIL) != null) {
                                                                                                                                                                                                            long LIZ7 = c42979Gtr.LIZ();
                                                                                                                                                                                                            if (LIZ7 > 0) {
                                                                                                                                                                                                                C268713r.LIZ().LJIILLIIL(new AqS37S0100100_7(LIZ7, this, 4));
                                                                                                                                                                                                                return;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                }
                                                                                                                                                                                                o.LJIJI("editModel");
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            }
                                                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                                                            throw null;
                                                                                                                                                                                        }
                                                                                                                                                                                        o.LJIJI("editModel");
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                                                    throw null;
                                                                                                                                                                                }
                                                                                                                                                                                o.LJIJI("editModel");
                                                                                                                                                                                throw null;
                                                                                                                                                                            }
                                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        o.LJIJI("editModel");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                o.LJIJI("editModel");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        o.LJIJI("clickPublishWaiter");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                o.LJIJI("editModel");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        o.LJIJI("publishModel");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                o.LJIJI("editModel");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            o.LJIJI("editModel");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        o.LJIJI("editModel");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    o.LJIJI("editModel");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                o.LJIJI("publishModel");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("editModel");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        o.LJIJI("editModel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("editModel");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("editModel");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("editModel");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("editModel");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("editModel");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("editModel");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("editModel");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("editModel");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("editModel");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("editModel");
                                                                throw null;
                                                            }
                                                            o.LJIJI("editModel");
                                                            throw null;
                                                        }
                                                        o.LJIJI("editModel");
                                                        throw null;
                                                    }
                                                    o.LJIJI("editModel");
                                                    throw null;
                                                }
                                                o.LJIJI("editModel");
                                                throw null;
                                            }
                                            o.LJIJI("editModel");
                                            throw null;
                                        }
                                        o.LJIJI("editModel");
                                        throw null;
                                    }
                                    o.LJIJI("editModel");
                                    throw null;
                                }
                                o.LJIJI("editModel");
                                throw null;
                            }
                            o.LJIJI("editModel");
                            throw null;
                        }
                        o.LJIJI("publishId");
                        throw null;
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("editModel");
            throw null;
        }
        o.LJIJI("editModel");
        throw null;
    }
}
