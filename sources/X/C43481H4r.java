package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import defpackage.g0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.H4r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43481H4r extends AbstractC41873Gc1 {
    public VideoPublishEditModel LJ;
    public C43458H3u LJFF;
    public C43397H1l LJI;
    public PublishModel LJII;
    public UploadAuthKeyConfig LJIIIIZZ;
    public C58672Rz LJIIIZ;
    public InterfaceC43387H1b LJIIJ;
    public int LJIIJJI;
    public C44428Hc8 LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public long LJIILL;
    public C42979Gtr LJIILLIIL;

    public C43481H4r() {
        super(H1U.UPLOAD, (List<? extends Object>) C47261Igj.LJJIJ(H1U.COMPILE));
        this.LJIILIIL = -2;
    }

    public final SynthetiseResult LJI() {
        Object obj = ((LinkedHashMap) this.LIZIZ).get(H1U.COMPILE);
        if (obj instanceof SynthetiseResult) {
            return (SynthetiseResult) obj;
        }
        return null;
    }

    public final C145995oB LJIIIIZZ() {
        C43397H1l c43397H1l = this.LJI;
        if (c43397H1l != null) {
            C60016Ngy c60016Ngy = new C60016Ngy(c43397H1l.LJLIL);
            VideoPublishEditModel videoPublishEditModel = this.LJ;
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

    @Override // X.AbstractC41873Gc1, X.InterfaceC36938Eec
    public void onEvent(AbstractC41872Gc0 event) {
        o.LJIIIZ(event, "event");
        super.onEvent(event);
        if (event.LIZ == H1U.COMPILE && (event instanceof C41870Gby)) {
            this.LJIILL = C42377Gk9.LIZ();
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        Object obj;
        String str;
        String str2;
        String str3;
        String str4;
        NowsExtra nowsExtra;
        String str5;
        String str6;
        String str7;
        float f;
        int i;
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
                    this.LJ = ((C43403H1r) next).LIZ;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43404H1s) {
                            if (next2 != null) {
                                this.LJII = ((C43404H1s) next2).LIZ;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof C43458H3u) {
                                        if (next3 != null) {
                                            this.LJFF = (C43458H3u) next3;
                                            Iterator<Object> it4 = args.LIZ.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it4.next();
                                                if (next4 instanceof C43397H1l) {
                                                    if (next4 != null) {
                                                        this.LJI = (C43397H1l) next4;
                                                        Iterator<Object> it5 = args.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it5.next();
                                                            if (next5 instanceof ERL) {
                                                                if (next5 != null) {
                                                                    VideoCreation videoCreation = ((ERL) next5).LJLIL;
                                                                    o.LJII(videoCreation, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                                                                    this.LJIIIIZZ = (UploadAuthKeyConfig) videoCreation;
                                                                    Iterator<Object> it6 = args.LIZ.iterator();
                                                                    while (true) {
                                                                        if (!it6.hasNext()) {
                                                                            break;
                                                                        }
                                                                        Object next6 = it6.next();
                                                                        if (next6 instanceof C58672Rz) {
                                                                            if (next6 != null) {
                                                                                this.LJIIIZ = (C58672Rz) next6;
                                                                                Iterator<Object> it7 = args.LIZ.iterator();
                                                                                while (true) {
                                                                                    if (!it7.hasNext()) {
                                                                                        break;
                                                                                    }
                                                                                    Object next7 = it7.next();
                                                                                    if (next7 instanceof InterfaceC43387H1b) {
                                                                                        if (next7 != null) {
                                                                                            this.LJIIJ = (InterfaceC43387H1b) next7;
                                                                                            Iterator<Object> it8 = args.LIZ.iterator();
                                                                                            while (true) {
                                                                                                if (it8.hasNext()) {
                                                                                                    obj = it8.next();
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
                                                                                            this.LJIILLIIL = (C42979Gtr) obj;
                                                                                            VideoPublishEditModel videoPublishEditModel = this.LJ;
                                                                                            if (videoPublishEditModel != null) {
                                                                                                if (H7R.LJJJJL(videoPublishEditModel)) {
                                                                                                    this.LJIIJJI = 11;
                                                                                                }
                                                                                                C44428Hc8 c44428Hc8 = new C44428Hc8(H6A.LIZIZ);
                                                                                                c44428Hc8.LIZLLL();
                                                                                                this.LJIIL = c44428Hc8;
                                                                                                C145995oB LJIIIIZZ = LJIIIIZZ();
                                                                                                VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                                                                                                if (videoPublishEditModel2 != null) {
                                                                                                    LJIIIIZZ.LJI("resolution", videoPublishEditModel2.getVideoResolution());
                                                                                                    String str8 = "1";
                                                                                                    if (C44739Hh9.LIZ()) {
                                                                                                        str = "1";
                                                                                                    } else {
                                                                                                        str = CardStruct.IStatusCode.DEFAULT;
                                                                                                    }
                                                                                                    LJIIIIZZ.LJI("is_hardcode", str);
                                                                                                    StringBuilder LIZ = X1D.LIZ();
                                                                                                    VideoPublishEditModel videoPublishEditModel3 = this.LJ;
                                                                                                    if (videoPublishEditModel3 != null) {
                                                                                                        LIZ.append(C44739Hh9.LJI(H7R.LJJJJI(videoPublishEditModel3)));
                                                                                                        LIZ.append("");
                                                                                                        LJIIIIZZ.LJI("bite_rate", X1D.LIZIZ(LIZ));
                                                                                                        StringBuilder LIZ2 = X1D.LIZ();
                                                                                                        LIZ2.append(C44739Hh9.LJII());
                                                                                                        LIZ2.append("");
                                                                                                        LJIIIIZZ.LJI("video_quality", X1D.LIZIZ(LIZ2));
                                                                                                        LJIIIIZZ.LJI("_perf_monitor", "1");
                                                                                                        PublishModel publishModel = this.LJII;
                                                                                                        if (publishModel != null) {
                                                                                                            LJIIIIZZ.LIZ(publishModel.publishType, "publish_type");
                                                                                                            C43458H3u c43458H3u = this.LJFF;
                                                                                                            if (c43458H3u != null) {
                                                                                                                if (c43458H3u.LIZIZ) {
                                                                                                                    str2 = "1";
                                                                                                                } else {
                                                                                                                    str2 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                }
                                                                                                                LJIIIIZZ.LJI("is_click_publish", str2);
                                                                                                                VideoPublishEditModel videoPublishEditModel4 = this.LJ;
                                                                                                                if (videoPublishEditModel4 != null) {
                                                                                                                    LJIIIIZZ.LIZ(videoPublishEditModel4.videoFps(false), "fps");
                                                                                                                    int i2 = this.LJIIJJI;
                                                                                                                    if (i2 == 0) {
                                                                                                                        VideoPublishEditModel videoPublishEditModel5 = this.LJ;
                                                                                                                        if (videoPublishEditModel5 != null) {
                                                                                                                            LJIIIIZZ.LIZLLL("creation_id", videoPublishEditModel5.getCreationId());
                                                                                                                            VideoPublishEditModel videoPublishEditModel6 = this.LJ;
                                                                                                                            if (videoPublishEditModel6 != null) {
                                                                                                                                LJIIIIZZ.LIZIZ(videoPublishEditModel6.uploadSpeedInfo.getSpeed(), "upload_probe_speed");
                                                                                                                                VideoPublishEditModel videoPublishEditModel7 = this.LJ;
                                                                                                                                if (videoPublishEditModel7 != null) {
                                                                                                                                    LJIIIIZZ.LIZ(videoPublishEditModel7.getPreviewInfo().getPreviewVideoLength(), "source_duration");
                                                                                                                                    VideoPublishEditModel videoPublishEditModel8 = this.LJ;
                                                                                                                                    if (videoPublishEditModel8 != null) {
                                                                                                                                        LJIIIIZZ.LIZ(videoPublishEditModel8.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
                                                                                                                                        VideoPublishEditModel videoPublishEditModel9 = this.LJ;
                                                                                                                                        if (videoPublishEditModel9 != null) {
                                                                                                                                            LJIIIIZZ.LIZ(C44384HbQ.LJJLIIIJJIZ(videoPublishEditModel9), "source_file_bitrate");
                                                                                                                                            VideoPublishEditModel videoPublishEditModel10 = this.LJ;
                                                                                                                                            if (videoPublishEditModel10 != null) {
                                                                                                                                                if (TextUtils.equals(H7R.LJIIIIZZ(videoPublishEditModel10), "upload")) {
                                                                                                                                                    VideoPublishEditModel videoPublishEditModel11 = this.LJ;
                                                                                                                                                    if (videoPublishEditModel11 != null) {
                                                                                                                                                        LJIIIIZZ.LIZ(H7R.LJJJJ(videoPublishEditModel11) ? 1 : 0, "is_fast_import");
                                                                                                                                                    } else {
                                                                                                                                                        o.LJIJI("editModel");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                VideoPublishEditModel videoPublishEditModel12 = this.LJ;
                                                                                                                                                if (videoPublishEditModel12 != null) {
                                                                                                                                                    LJIIIIZZ.LIZLLL("creation_id", videoPublishEditModel12.getCreationId());
                                                                                                                                                    VideoPublishEditModel videoPublishEditModel13 = this.LJ;
                                                                                                                                                    if (videoPublishEditModel13 != null) {
                                                                                                                                                        LJIIIIZZ.LIZLLL("content_source", H7R.LJIIIIZZ(videoPublishEditModel13));
                                                                                                                                                        VideoPublishEditModel videoPublishEditModel14 = this.LJ;
                                                                                                                                                        if (videoPublishEditModel14 != null) {
                                                                                                                                                            LJIIIIZZ.LIZLLL("content_type", H7R.LJIIIZ(videoPublishEditModel14));
                                                                                                                                                            C43397H1l c43397H1l = this.LJI;
                                                                                                                                                            if (c43397H1l != null) {
                                                                                                                                                                String publishId = c43397H1l.LJLIL;
                                                                                                                                                                VideoPublishEditModel videoPublishEditModel15 = this.LJ;
                                                                                                                                                                if (videoPublishEditModel15 != null) {
                                                                                                                                                                    C58672Rz c58672Rz = this.LJIIIZ;
                                                                                                                                                                    if (c58672Rz != null) {
                                                                                                                                                                        List<C43394H1i> list = c58672Rz.LIZ;
                                                                                                                                                                        o.LJIIIZ(publishId, "publishId");
                                                                                                                                                                        if (list != null) {
                                                                                                                                                                            long currentTimeMillis = System.currentTimeMillis();
                                                                                                                                                                            C62822Ol8 c62822Ol8 = H2X.LIZ;
                                                                                                                                                                            long j = -1;
                                                                                                                                                                            long j2 = ((Keva) c62822Ol8.getValue()).getLong("upload_finish_timestamp", -1L);
                                                                                                                                                                            if (j2 != -1) {
                                                                                                                                                                                j = (currentTimeMillis - j2) / 1000;
                                                                                                                                                                            }
                                                                                                                                                                            LJIIIIZZ.LJI("publish_id", publishId);
                                                                                                                                                                            UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel15.uploadSpeedInfo;
                                                                                                                                                                            if (uploadSpeedInfo != null) {
                                                                                                                                                                                f = (float) uploadSpeedInfo.getSpeed();
                                                                                                                                                                            } else {
                                                                                                                                                                                f = -1.0f;
                                                                                                                                                                            }
                                                                                                                                                                            LJIIIIZZ.LIZJ(Float.valueOf(f), "upload_probe_speed");
                                                                                                                                                                            C44172HVg.LJIILL.getClass();
                                                                                                                                                                            LJIIIIZZ.LIZ(C47497IkX.LIZJ(), "internet_speed");
                                                                                                                                                                            LJIIIIZZ.LIZIZ(((Keva) c62822Ol8.getValue()).getLong("upload_speed", -1024L) / 1024, "last_upload_speed");
                                                                                                                                                                            LJIIIIZZ.LIZIZ(j, "last_time_diff");
                                                                                                                                                                            C43394H1i c43394H1i = (C43394H1i) ORZ.LJLLLL(list);
                                                                                                                                                                            if (c43394H1i != null) {
                                                                                                                                                                                i = c43394H1i.LJLIL * 1024;
                                                                                                                                                                            } else {
                                                                                                                                                                                i = 0;
                                                                                                                                                                            }
                                                                                                                                                                            LJIIIIZZ.LIZ(i, "adapt_chunk_size");
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        o.LJIJI("smartSliceConfig");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                o.LJIJI("publishId");
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
                                                                                                                        } else {
                                                                                                                            o.LJIJI("editModel");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else if (i2 == 11) {
                                                                                                                        VideoPublishEditModel videoPublishEditModel16 = this.LJ;
                                                                                                                        if (videoPublishEditModel16 != null) {
                                                                                                                            LJIIIIZZ.LIZLLL("creation_id", videoPublishEditModel16.getCreationId());
                                                                                                                            VideoPublishEditModel videoPublishEditModel17 = this.LJ;
                                                                                                                            if (videoPublishEditModel17 != null) {
                                                                                                                                LJIIIIZZ.LIZLLL("content_source", H7R.LJIIIIZZ(videoPublishEditModel17));
                                                                                                                                VideoPublishEditModel videoPublishEditModel18 = this.LJ;
                                                                                                                                if (videoPublishEditModel18 != null) {
                                                                                                                                    LJIIIIZZ.LIZLLL("content_type", H7R.LJIIIZ(videoPublishEditModel18));
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
                                                                                                                    int i3 = this.LJIILIIL;
                                                                                                                    if (i3 != 0) {
                                                                                                                        LJIIIIZZ.LIZ(i3, "notRemuxErrorcode");
                                                                                                                    }
                                                                                                                    C43458H3u c43458H3u2 = this.LJFF;
                                                                                                                    if (c43458H3u2 != null) {
                                                                                                                        LJIIIIZZ.LIZ(c43458H3u2.LIZIZ ? 1 : 0, "is_click_publish");
                                                                                                                        if (!C60903NvH.LJIIJJI().getAccountService().isChildrenMode()) {
                                                                                                                            str3 = "1";
                                                                                                                        } else {
                                                                                                                            str3 = "2";
                                                                                                                        }
                                                                                                                        LJIIIIZZ.LIZLLL("is_child_mode", str3);
                                                                                                                        VideoPublishEditModel videoPublishEditModel19 = this.LJ;
                                                                                                                        if (videoPublishEditModel19 != null) {
                                                                                                                            if (videoPublishEditModel19.creativeFlowData.getEditorProModel() != null) {
                                                                                                                                VideoPublishEditModel videoPublishEditModel20 = this.LJ;
                                                                                                                                if (videoPublishEditModel20 != null) {
                                                                                                                                    if (videoPublishEditModel20.getEditorProModel().isAdvancedEdit()) {
                                                                                                                                        str7 = "1";
                                                                                                                                    } else {
                                                                                                                                        str7 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                    }
                                                                                                                                    LJIIIIZZ.LJI("is_use_editor_pro", str7);
                                                                                                                                    VideoPublishEditModel videoPublishEditModel21 = this.LJ;
                                                                                                                                    if (videoPublishEditModel21 != null) {
                                                                                                                                        if (!videoPublishEditModel21.getEditorProModel().isPipUsed()) {
                                                                                                                                            str8 = CardStruct.IStatusCode.DEFAULT;
                                                                                                                                        }
                                                                                                                                        LJIIIIZZ.LJI("is_use_pip", str8);
                                                                                                                                        C1292755n c1292755n = C1292755n.LIZ;
                                                                                                                                        VideoPublishEditModel videoPublishEditModel22 = this.LJ;
                                                                                                                                        if (videoPublishEditModel22 != null) {
                                                                                                                                            c1292755n.getClass();
                                                                                                                                            LJIIIIZZ.LIZLLL("all_editor_pro_used_functions", C1292755n.LIZIZ(videoPublishEditModel22));
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
                                                                                                                            VideoPublishEditModel videoPublishEditModel23 = this.LJ;
                                                                                                                            if (videoPublishEditModel23 != null) {
                                                                                                                                NowsShootModel nowsShootModel = videoPublishEditModel23.creativeModel.nowsShootModel;
                                                                                                                                if (nowsShootModel != null && (str6 = nowsShootModel.multiCameraMode) != null) {
                                                                                                                                    LJIIIIZZ.LIZLLL("multi_camera_mode", str6);
                                                                                                                                }
                                                                                                                                VideoPublishEditModel videoPublishEditModel24 = this.LJ;
                                                                                                                                if (videoPublishEditModel24 != null) {
                                                                                                                                    NowsShootModel nowsShootModel2 = videoPublishEditModel24.creativeModel.nowsShootModel;
                                                                                                                                    if (nowsShootModel2 != null && (nowsExtra = nowsShootModel2.nowsExtra) != null && (str5 = nowsExtra.dualType) != null) {
                                                                                                                                        LJIIIIZZ.LIZLLL("dual_type", str5);
                                                                                                                                    }
                                                                                                                                    VideoPublishEditModel videoPublishEditModel25 = this.LJ;
                                                                                                                                    if (videoPublishEditModel25 != null) {
                                                                                                                                        if (H7R.LJJJJL(videoPublishEditModel25)) {
                                                                                                                                            str4 = "photo_publish_start";
                                                                                                                                        } else {
                                                                                                                                            str4 = "video_publish_start";
                                                                                                                                        }
                                                                                                                                        java.util.Map<String, String> map = LJIIIIZZ.LIZ;
                                                                                                                                        o.LJIIIIZZ(map, "eventMapBuilder.builder()");
                                                                                                                                        LJIIIZ(str4, map);
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
                                                                                                                    o.LJIJI("clickPublishWaiter");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                o.LJIJI("editModel");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("clickPublishWaiter");
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
                                                                                    }
                                                                                }
                                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.SmartSliceConfig");
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
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

    public final void LJIIIZ(String str, java.util.Map<String, String> map) {
        InterfaceC43387H1b interfaceC43387H1b = this.LJIIJ;
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
            this.LJIILIIL = ((H3H) info).LJLIL;
        } else {
            if (!(info instanceof H3G)) {
                return;
            }
            this.LJIILJJIL = ((H3G) info).LJLILLLLZI;
        }
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        C42360Gjs c42360Gjs;
        Integer num;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        if (cause instanceof C42984Gtw) {
            c42360Gjs = ((C42984Gtw) cause).LIZ;
        } else {
            c42360Gjs = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errorCode:");
        if (c42360Gjs != null) {
            num = Integer.valueOf(c42360Gjs.getCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C43458H3u c43458H3u = this.LJFF;
        if (c43458H3u != null) {
            boolean z = c43458H3u.LIZIZ;
            UploadAuthKeyConfig uploadAuthKeyConfig = this.LJIIIIZZ;
            if (uploadAuthKeyConfig != null) {
                LJII(false, LIZIZ, "-39993", z, uploadAuthKeyConfig, i, null, null);
                return;
            } else {
                o.LJIJI("authKeyConfig");
                throw null;
            }
        }
        o.LJIJI("clickPublishWaiter");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        int LJII = C42991Gu3.LJII(error);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errorCode:");
        LIZ.append(error.getCode());
        String LIZIZ = X1D.LIZIZ(LIZ);
        String valueOf = String.valueOf(LJII);
        C43458H3u c43458H3u = this.LJFF;
        if (c43458H3u != null) {
            boolean z = c43458H3u.LIZIZ;
            UploadAuthKeyConfig uploadAuthKeyConfig = this.LJIIIIZZ;
            if (uploadAuthKeyConfig != null) {
                LJII(false, LIZIZ, valueOf, z, uploadAuthKeyConfig, i, null, LJI());
                return;
            } else {
                o.LJIJI("authKeyConfig");
                throw null;
            }
        }
        o.LJIJI("clickPublishWaiter");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        SynthetiseResult LJI = LJI();
        C43458H3u c43458H3u = this.LJFF;
        if (c43458H3u != null) {
            boolean z2 = c43458H3u.LIZIZ;
            UploadAuthKeyConfig uploadAuthKeyConfig = this.LJIIIIZZ;
            if (uploadAuthKeyConfig != null) {
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.UploadResult");
                LJII(true, "", "", z2, uploadAuthKeyConfig, i, ((C43335Gzb) obj).LJLILLLLZI, LJI);
                return;
            } else {
                o.LJIJI("authKeyConfig");
                throw null;
            }
        }
        o.LJIJI("clickPublishWaiter");
        throw null;
    }

    public final void LJII(boolean z, String str, String str2, boolean z2, UploadAuthKeyConfig uploadAuthKeyConfig, int i, C43336Gzc c43336Gzc, SynthetiseResult synthetiseResult) {
        String str3;
        String str4;
        String str5;
        long j;
        int i2;
        long j2;
        String str6;
        NowsExtra nowsExtra;
        String str7;
        String str8;
        String str9;
        int i3;
        C43394H1i c43394H1i;
        List<PublishImageModel> LLJILJILJ;
        int i4;
        int i5;
        int i6;
        int i7;
        String str10;
        String str11;
        String str12;
        int i8;
        String str13;
        String str14;
        int i9;
        int i10;
        long j3;
        long j4;
        String resolution;
        C42979Gtr c42979Gtr;
        C145995oB LJIIIIZZ = LJIIIIZZ();
        String str15 = "1";
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIIZZ.LJI("status", str3);
        LJIIIIZZ.LJI("fail_info", str);
        if (C44739Hh9.LIZ()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIIZZ.LJI("record_code_type", str4);
        if (GAD.LIZ()) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIIZZ.LJI("compose_code_type", str5);
        StringBuilder LIZ = X1D.LIZ();
        VideoPublishEditModel videoPublishEditModel = this.LJ;
        if (videoPublishEditModel != null) {
            LIZ.append(C44739Hh9.LJI(H7R.LJJJJI(videoPublishEditModel)));
            String str16 = "";
            LIZ.append("");
            LJIIIIZZ.LJI("bite_rate", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C44739Hh9.LJII());
            LIZ2.append("");
            LJIIIIZZ.LJI("video_quality", X1D.LIZIZ(LIZ2));
            LJIIIIZZ.LJI("_perf_monitor", "1");
            PublishModel publishModel = this.LJII;
            if (publishModel != null) {
                LJIIIIZZ.LIZ(publishModel.publishType, "publish_type");
                VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                if (videoPublishEditModel2 != null) {
                    LJIIIIZZ.LIZ(videoPublishEditModel2.videoFps(false), "fps");
                    VideoPublishEditModel videoPublishEditModel3 = this.LJ;
                    if (videoPublishEditModel3 != null) {
                        LJIIIIZZ.LIZ(C44546He2.LJ(videoPublishEditModel3) ? 1 : 0, "is_hd_setting");
                        VideoPublishEditModel videoPublishEditModel4 = this.LJ;
                        if (videoPublishEditModel4 != null) {
                            LJIIIIZZ.LJI("content_source", GTX.LIZ(videoPublishEditModel4));
                            VideoPublishEditModel videoPublishEditModel5 = this.LJ;
                            if (videoPublishEditModel5 != null) {
                                LJIIIIZZ.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel5));
                                UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
                                if (uploadVideoConfig != null) {
                                    LJIIIIZZ.LIZ(uploadVideoConfig.enableHttps, "video_https_type");
                                }
                                UploadImageConfig uploadImageConfig = uploadAuthKeyConfig.imgConfig;
                                if (uploadImageConfig != null) {
                                    LJIIIIZZ.LIZ(uploadImageConfig.enableHttps, "image_https_type");
                                }
                                UploadImageConfig uploadImageConfig2 = uploadAuthKeyConfig.frameUploadConfig;
                                if (uploadImageConfig2 != null) {
                                    LJIIIIZZ.LIZ(uploadImageConfig2.enableHttps, "frame_https_type");
                                }
                                if (this.LJIILL != 0 && (c42979Gtr = this.LJIILLIIL) != null) {
                                    long LIZ3 = c42979Gtr.LIZ();
                                    if (LIZ3 > 0) {
                                        LJIIIIZZ.LIZIZ((LIZ3 - this.LJIILL) / 1024, "content_storage_size");
                                    }
                                }
                                C44428Hc8 c44428Hc8 = this.LJIIL;
                                o.LJI(c44428Hc8);
                                if (c44428Hc8.LIZIZ) {
                                    C44428Hc8 c44428Hc82 = this.LJIIL;
                                    o.LJI(c44428Hc82);
                                    c44428Hc82.LJ();
                                }
                                LJIIIIZZ.LIZ(i, "origin_upload_dur_ms");
                                C44172HVg.LJIILL.getClass();
                                LJIIIIZZ.LIZ(C47497IkX.LIZJ(), "download_internet_speed_kbps");
                                if (synthetiseResult != null) {
                                    LJIIIIZZ.LIZIZ(synthetiseResult.getSyntheticEndTime().LJLIL - synthetiseResult.getSyntheticStartTime().LJLIL, "synthetic_dur_ms");
                                }
                                if (c43336Gzc != null) {
                                    j = c43336Gzc.LIZIZ;
                                } else {
                                    j = -1;
                                }
                                LJIIIIZZ.LIZIZ(j, "upload_wait_time_ms");
                                if (c43336Gzc != null) {
                                    i2 = (int) c43336Gzc.LIZ;
                                } else {
                                    i2 = 0;
                                }
                                int i11 = i - i2;
                                LJIIIIZZ.LIZ(i11, "duration");
                                if (i11 > 0) {
                                    VideoPublishEditModel videoPublishEditModel6 = this.LJ;
                                    if (videoPublishEditModel6 != null) {
                                        j2 = (C42000Ge4.LJIIIZ(videoPublishEditModel6) * 1000) / i11;
                                    } else {
                                        o.LJIJI("editModel");
                                        throw null;
                                    }
                                } else {
                                    j2 = 0;
                                }
                                Locale locale = Locale.US;
                                String LLLZI = C16880lQ.LLLZI(locale, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j2) / 1024.0f)}, 1));
                                o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                                LJIIIIZZ.LIZLLL("upload_speed", LLLZI);
                                if (!z) {
                                    LJIIIIZZ.LIZLLL("error_code", str2);
                                }
                                if (this.LJIIJJI == 0) {
                                    VideoPublishEditModel videoPublishEditModel7 = this.LJ;
                                    if (videoPublishEditModel7 != null) {
                                        VideoFileInfo LIZJ = C43495H5f.LIZJ(videoPublishEditModel7.mOutputFile);
                                        if (LIZJ != null) {
                                            i5 = LIZJ.getCodecType();
                                        } else {
                                            i5 = -1;
                                        }
                                        VideoPublishEditModel videoPublishEditModel8 = this.LJ;
                                        if (videoPublishEditModel8 != null) {
                                            int[] LJIJI = C78963Uyt.LJIJI(videoPublishEditModel8.getPreviewInfo());
                                            if (LJIJI != null) {
                                                i6 = LJIJI[8];
                                            } else {
                                                i6 = -1;
                                            }
                                            VideoPublishEditModel videoPublishEditModel9 = this.LJ;
                                            if (videoPublishEditModel9 != null) {
                                                OSZ LJJIIJ = g0.LJJIIJ(videoPublishEditModel9);
                                                int intValue = ((Number) LJJIIJ.getSecond()).intValue() + ((Number) LJJIIJ.getFirst()).intValue();
                                                if (intValue > 1) {
                                                    i7 = 1;
                                                } else if (intValue == 1) {
                                                    i7 = 0;
                                                } else {
                                                    i7 = -1;
                                                }
                                                VideoPublishEditModel videoPublishEditModel10 = this.LJ;
                                                if (videoPublishEditModel10 != null) {
                                                    if (C44687HgJ.LIZIZ(videoPublishEditModel10.mParallelUploadOutputFile)) {
                                                        Object[] objArr = new Object[1];
                                                        VideoPublishEditModel videoPublishEditModel11 = this.LJ;
                                                        if (videoPublishEditModel11 != null) {
                                                            objArr[0] = Long.valueOf(C44694HgQ.LJFF(videoPublishEditModel11.mParallelUploadOutputFile) / 1024);
                                                            str10 = C63144OqK.LIZIZ(objArr, 1, locale, "%d", "format(locale, format, *args)");
                                                        } else {
                                                            o.LJIJI("editModel");
                                                            throw null;
                                                        }
                                                    } else {
                                                        VideoPublishEditModel videoPublishEditModel12 = this.LJ;
                                                        if (videoPublishEditModel12 != null) {
                                                            if (C44687HgJ.LIZIZ(videoPublishEditModel12.mOutputFile)) {
                                                                Object[] objArr2 = new Object[1];
                                                                VideoPublishEditModel videoPublishEditModel13 = this.LJ;
                                                                if (videoPublishEditModel13 != null) {
                                                                    objArr2[0] = Long.valueOf(C44694HgQ.LJFF(videoPublishEditModel13.mOutputFile) / 1024);
                                                                    str10 = C63144OqK.LIZIZ(objArr2, 1, locale, "%d", "format(locale, format, *args)");
                                                                } else {
                                                                    o.LJIJI("editModel");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                str10 = null;
                                                            }
                                                        } else {
                                                            o.LJIJI("editModel");
                                                            throw null;
                                                        }
                                                    }
                                                    VideoPublishEditModel videoPublishEditModel14 = this.LJ;
                                                    if (videoPublishEditModel14 != null) {
                                                        if (!TextUtils.isEmpty(videoPublishEditModel14.mShootWay)) {
                                                            VideoPublishEditModel videoPublishEditModel15 = this.LJ;
                                                            if (videoPublishEditModel15 != null) {
                                                                LJIIIIZZ.LIZLLL("shoot_way", videoPublishEditModel15.mShootWay);
                                                            } else {
                                                                o.LJIJI("editModel");
                                                                throw null;
                                                            }
                                                        }
                                                        VideoPublishEditModel videoPublishEditModel16 = this.LJ;
                                                        if (videoPublishEditModel16 != null) {
                                                            if (!TextUtils.isEmpty(videoPublishEditModel16.clientId)) {
                                                                VideoPublishEditModel videoPublishEditModel17 = this.LJ;
                                                                if (videoPublishEditModel17 != null) {
                                                                    LJIIIIZZ.LIZLLL("channel", videoPublishEditModel17.clientId);
                                                                } else {
                                                                    o.LJIJI("editModel");
                                                                    throw null;
                                                                }
                                                            }
                                                            VideoPublishEditModel videoPublishEditModel18 = this.LJ;
                                                            if (videoPublishEditModel18 != null) {
                                                                if (!TextUtils.isEmpty(videoPublishEditModel18.shareId)) {
                                                                    VideoPublishEditModel videoPublishEditModel19 = this.LJ;
                                                                    if (videoPublishEditModel19 != null) {
                                                                        LJIIIIZZ.LIZLLL("open_platform_share_id", videoPublishEditModel19.shareId);
                                                                    } else {
                                                                        o.LJIJI("editModel");
                                                                        throw null;
                                                                    }
                                                                }
                                                                VideoPublishEditModel videoPublishEditModel20 = this.LJ;
                                                                if (videoPublishEditModel20 != null) {
                                                                    LJIIIIZZ.LJI("creation_id", videoPublishEditModel20.getCreationId());
                                                                    VideoPublishEditModel videoPublishEditModel21 = this.LJ;
                                                                    if (videoPublishEditModel21 != null) {
                                                                        LJIIIIZZ.LJI("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel21.mCurFilterIds));
                                                                        VideoPublishEditModel videoPublishEditModel22 = this.LJ;
                                                                        if (videoPublishEditModel22 != null) {
                                                                            LJIIIIZZ.LJI("prop_list", videoPublishEditModel22.mStickerID);
                                                                            if (z2) {
                                                                                str11 = "1";
                                                                            } else {
                                                                                str11 = CardStruct.IStatusCode.DEFAULT;
                                                                            }
                                                                            LJIIIIZZ.LJI("is_click_publish", str11);
                                                                            VideoPublishEditModel videoPublishEditModel23 = this.LJ;
                                                                            if (videoPublishEditModel23 != null) {
                                                                                LJIIIIZZ.LJI("effect_list", videoPublishEditModel23.getEditEffectListStr());
                                                                                VideoPublishEditModel videoPublishEditModel24 = this.LJ;
                                                                                if (videoPublishEditModel24 != null) {
                                                                                    LJIIIIZZ.LJI("original_resolution", C44384HbQ.LJJLIIIJLJLI(videoPublishEditModel24));
                                                                                    VideoPublishEditModel videoPublishEditModel25 = this.LJ;
                                                                                    if (videoPublishEditModel25 != null) {
                                                                                        LJIIIIZZ.LJI("info_sticker_list", videoPublishEditModel25.getInfoStickerList());
                                                                                        VideoPublishEditModel videoPublishEditModel26 = this.LJ;
                                                                                        if (videoPublishEditModel26 != null) {
                                                                                            if (videoPublishEditModel26.mSelectedId != 0) {
                                                                                                str12 = "1";
                                                                                            } else {
                                                                                                str12 = CardStruct.IStatusCode.DEFAULT;
                                                                                            }
                                                                                            LJIIIIZZ.LJI("video_edit_page_filter", str12);
                                                                                            if (LIZJ != null) {
                                                                                                i8 = LIZJ.getBitrate();
                                                                                            } else {
                                                                                                i8 = 0;
                                                                                            }
                                                                                            LJIIIIZZ.LIZ(i8, "file_bitrate");
                                                                                            VideoPublishEditModel videoPublishEditModel27 = this.LJ;
                                                                                            if (videoPublishEditModel27 != null) {
                                                                                                if (videoPublishEditModel27.isSyntheticHardEncode) {
                                                                                                    str13 = "hardcoding";
                                                                                                } else {
                                                                                                    str13 = "softcoding";
                                                                                                }
                                                                                                LJIIIIZZ.LJI("compose_coding", str13);
                                                                                                VideoPublishEditModel videoPublishEditModel28 = this.LJ;
                                                                                                if (videoPublishEditModel28 != null) {
                                                                                                    if (C44526Hdi.LJFF(videoPublishEditModel28)) {
                                                                                                        str14 = "1";
                                                                                                    } else {
                                                                                                        str14 = CardStruct.IStatusCode.DEFAULT;
                                                                                                    }
                                                                                                    LJIIIIZZ.LJI("is_reencode", str14);
                                                                                                    VideoPublishEditModel videoPublishEditModel29 = this.LJ;
                                                                                                    if (videoPublishEditModel29 != null) {
                                                                                                        LJIIIIZZ.LIZ(videoPublishEditModel29.isOpenForegroundPublish ? 1 : 0, "is_open_foreground");
                                                                                                        VideoPublishEditModel videoPublishEditModel30 = this.LJ;
                                                                                                        if (videoPublishEditModel30 != null) {
                                                                                                            LJIIIIZZ.LIZ(videoPublishEditModel30.isBackgroundPublish ? 1 : 0, "is_background_publish");
                                                                                                            LJIIIIZZ.LJI("file_size", str10);
                                                                                                            LJIIIIZZ.LIZ(i5, "codec_type");
                                                                                                            LJIIIIZZ.LIZ(i6, "source_codec_type");
                                                                                                            LJIIIIZZ.LIZ(i7, "is_multi_content");
                                                                                                            if (LIZJ != null && (resolution = LIZJ.getResolution()) != null) {
                                                                                                                str16 = resolution;
                                                                                                            }
                                                                                                            LJIIIIZZ.LJI("resolution", str16);
                                                                                                            VideoPublishEditModel videoPublishEditModel31 = this.LJ;
                                                                                                            if (videoPublishEditModel31 != null) {
                                                                                                                LJIIIIZZ.LJ("beautify_used", videoPublishEditModel31.faceBeautyOpen);
                                                                                                                LJIIIIZZ.LJI("beautify_info", C44228HXk.LIZ);
                                                                                                                VideoPublishEditModel videoPublishEditModel32 = this.LJ;
                                                                                                                if (videoPublishEditModel32 != null) {
                                                                                                                    LJIIIIZZ.LIZIZ(videoPublishEditModel32.uploadSpeedInfo.getSpeed(), "upload_probe_speed");
                                                                                                                    if (LIZJ != null) {
                                                                                                                        i9 = LIZJ.getFps();
                                                                                                                    } else {
                                                                                                                        i9 = 0;
                                                                                                                    }
                                                                                                                    LJIIIIZZ.LIZ(i9, "file_fps");
                                                                                                                    VideoPublishEditModel videoPublishEditModel33 = this.LJ;
                                                                                                                    if (videoPublishEditModel33 != null) {
                                                                                                                        if (videoPublishEditModel33.hasStickers() || videoPublishEditModel33.getTimeEffect() != null || C32151Nz.LJJIIZI(videoPublishEditModel33.getEffectList()) || videoPublishEditModel33.mSelectedId != 0) {
                                                                                                                            i10 = 1;
                                                                                                                        } else {
                                                                                                                            i10 = 0;
                                                                                                                        }
                                                                                                                        LJIIIIZZ.LIZ(i10, "is_filter");
                                                                                                                        VideoPublishEditModel videoPublishEditModel34 = this.LJ;
                                                                                                                        if (videoPublishEditModel34 != null) {
                                                                                                                            LJIIIIZZ.LIZ(!H7R.LJJLIIIJ(videoPublishEditModel34) ? 1 : 0, "is_multi_video");
                                                                                                                            LJIIIIZZ.LIZ(-1, "sw_conf_preset");
                                                                                                                            VideoPublishEditModel videoPublishEditModel35 = this.LJ;
                                                                                                                            if (videoPublishEditModel35 != null) {
                                                                                                                                LJIIIIZZ.LIZ(C44546He2.LIZLLL(videoPublishEditModel35) ? 1 : 0, "is_hd_video");
                                                                                                                                LJIIIIZZ.LIZ(-1, "sw_conf_crf");
                                                                                                                                if (LIZJ != null) {
                                                                                                                                    j3 = LIZJ.getDuration();
                                                                                                                                } else {
                                                                                                                                    j3 = -1;
                                                                                                                                }
                                                                                                                                LJIIIIZZ.LIZIZ(j3, "source_duration");
                                                                                                                                if (LIZJ != null) {
                                                                                                                                    j4 = LIZJ.getDuration();
                                                                                                                                } else {
                                                                                                                                    j4 = -1;
                                                                                                                                }
                                                                                                                                LJIIIIZZ.LIZIZ(j4, "creation_duration");
                                                                                                                                VideoPublishEditModel videoPublishEditModel36 = this.LJ;
                                                                                                                                if (videoPublishEditModel36 != null) {
                                                                                                                                    C44546He2.LIZIZ(videoPublishEditModel36, LJIIIIZZ);
                                                                                                                                    VideoPublishEditModel videoPublishEditModel37 = this.LJ;
                                                                                                                                    if (videoPublishEditModel37 != null) {
                                                                                                                                        C44546He2.LIZ(videoPublishEditModel37, LJIIIIZZ);
                                                                                                                                        VideoPublishEditModel videoPublishEditModel38 = this.LJ;
                                                                                                                                        if (videoPublishEditModel38 != null) {
                                                                                                                                            if (videoPublishEditModel38.getHardcodeAdaptiveResult() != null) {
                                                                                                                                                VideoPublishEditModel videoPublishEditModel39 = this.LJ;
                                                                                                                                                if (videoPublishEditModel39 != null) {
                                                                                                                                                    H57 hardcodeAdaptiveResult = videoPublishEditModel39.getHardcodeAdaptiveResult();
                                                                                                                                                    if (hardcodeAdaptiveResult != null) {
                                                                                                                                                        LJIIIIZZ.LIZJ(Float.valueOf(hardcodeAdaptiveResult.LIZ), "hw_opt_bitrate_set_result");
                                                                                                                                                        VideoPublishEditModel videoPublishEditModel40 = this.LJ;
                                                                                                                                                        if (videoPublishEditModel40 != null) {
                                                                                                                                                            H57 hardcodeAdaptiveResult2 = videoPublishEditModel40.getHardcodeAdaptiveResult();
                                                                                                                                                            if (hardcodeAdaptiveResult2 != null) {
                                                                                                                                                                LJIIIIZZ.LIZJ(Float.valueOf(hardcodeAdaptiveResult2.LIZIZ), "pre_bitrate_status");
                                                                                                                                                            } else {
                                                                                                                                                                "Required value was null.".toString();
                                                                                                                                                                throw new IllegalArgumentException("Required value was null.");
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        "Required value was null.".toString();
                                                                                                                                                        throw new IllegalArgumentException("Required value was null.");
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            VideoPublishEditModel videoPublishEditModel41 = this.LJ;
                                                                                                                                            if (videoPublishEditModel41 != null) {
                                                                                                                                                LJIIIIZZ.LIZJ(videoPublishEditModel41.getUploadSpeedSettingsIndex(), "select_gear_by_upload_speed");
                                                                                                                                                VideoPublishEditModel videoPublishEditModel42 = this.LJ;
                                                                                                                                                if (videoPublishEditModel42 != null) {
                                                                                                                                                    if (videoPublishEditModel42.getPreviewInfo() != null) {
                                                                                                                                                        if (this.LJ != null) {
                                                                                                                                                            if (!r2.getPreviewInfo().getVideoList().isEmpty()) {
                                                                                                                                                                VideoPublishEditModel videoPublishEditModel43 = this.LJ;
                                                                                                                                                                if (videoPublishEditModel43 != null) {
                                                                                                                                                                    EditVideoSegment editVideoSegment = (EditVideoSegment) ListProtector.get(videoPublishEditModel43.getPreviewInfo().getVideoList(), 0);
                                                                                                                                                                    VideoFileInfo videoFileInfo = editVideoSegment.getVideoFileInfo();
                                                                                                                                                                    StringBuilder LIZ4 = X1D.LIZ();
                                                                                                                                                                    LIZ4.append(videoFileInfo.getWidth());
                                                                                                                                                                    LIZ4.append('*');
                                                                                                                                                                    LIZ4.append(videoFileInfo.getHeight());
                                                                                                                                                                    LJIIIIZZ.LIZLLL("src_resolution", X1D.LIZIZ(LIZ4));
                                                                                                                                                                    StringBuilder LIZ5 = X1D.LIZ();
                                                                                                                                                                    LIZ5.append(videoFileInfo.getWidth());
                                                                                                                                                                    LIZ5.append('*');
                                                                                                                                                                    LIZ5.append(videoFileInfo.getHeight());
                                                                                                                                                                    LJIIIIZZ.LIZLLL("pre_resolution", X1D.LIZIZ(LIZ5));
                                                                                                                                                                    LJIIIIZZ.LIZ(videoFileInfo.getFps(), "src_fps");
                                                                                                                                                                    LJIIIIZZ.LIZ(videoFileInfo.getFps(), "pre_fps");
                                                                                                                                                                    LJIIIIZZ.LIZ(videoFileInfo.getBitrate(), "src_bitrate");
                                                                                                                                                                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                                                                                                                                                                    if (videoCutInfo != null) {
                                                                                                                                                                        LJIIIIZZ.LIZIZ(videoCutInfo.getEnd() - videoCutInfo.getStart(), "src_duration");
                                                                                                                                                                    } else {
                                                                                                                                                                        LJIIIIZZ.LIZIZ(videoFileInfo.getDuration(), "src_duration");
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    o.LJIJI("editModel");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            o.LJIJI("editModel");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    VideoPublishEditModel videoPublishEditModel44 = this.LJ;
                                                                                                                                                    if (videoPublishEditModel44 != null) {
                                                                                                                                                        if (TextUtils.equals(H7R.LJIIIIZZ(videoPublishEditModel44), "upload")) {
                                                                                                                                                            VideoPublishEditModel videoPublishEditModel45 = this.LJ;
                                                                                                                                                            if (videoPublishEditModel45 != null) {
                                                                                                                                                                LJIIIIZZ.LIZ(H7R.LJJJJ(videoPublishEditModel45) ? 1 : 0, "is_fast_import");
                                                                                                                                                            } else {
                                                                                                                                                                o.LJIJI("editModel");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        VideoPublishEditModel videoPublishEditModel46 = this.LJ;
                                                                                                                                                        if (videoPublishEditModel46 != null) {
                                                                                                                                                            LJIIIIZZ.LIZLLL("creation_id", videoPublishEditModel46.getCreationId());
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
                                if (synthetiseResult != null && (i4 = synthetiseResult.unableRemuxCode) != 0) {
                                    LJIIIIZZ.LIZ(i4, "notRemuxErrorcode");
                                } else {
                                    int i12 = this.LJIILIIL;
                                    if (i12 != 0) {
                                        LJIIIIZZ.LIZ(i12, "notRemuxErrorcode");
                                    }
                                }
                                if (synthetiseResult != null) {
                                    LJIIIIZZ.LIZ(synthetiseResult.synthetiseCPUEncode, "synthetise_cpu_encode");
                                } else {
                                    LJIIIIZZ.LIZ(this.LJIILJJIL, "synthetise_cpu_encode");
                                }
                                LJIIIIZZ.LIZ(C60903NvH.LJIIJJI().getPublishService().LJIIL(), "publish_cnt");
                                VideoPublishEditModel videoPublishEditModel47 = this.LJ;
                                if (videoPublishEditModel47 != null) {
                                    SynthetiseResult LJI = LJI();
                                    if (H7R.LJJJJL(videoPublishEditModel47) && LJI != null && LJI.imageSynthesisResult != null) {
                                        StrArray strArray = new StrArray();
                                        StrArray strArray2 = new StrArray();
                                        if (H7R.LJJJJL(videoPublishEditModel47)) {
                                            if (LJI == null || (LLJILJILJ = LJI.imageSynthesisResult) == null) {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        } else {
                                            NowsShootModel nowsShootModel = videoPublishEditModel47.creativeModel.nowsShootModel;
                                            if (nowsShootModel != null) {
                                                List LJLL = ORZ.LJLL(C47261Igj.LJJIJIL(nowsShootModel.ltrCompileImage, nowsShootModel.rtlCompileImage));
                                                ArrayList arrayList = new ArrayList(C32I.LJJL(LJLL, 10));
                                                Iterator it = ((ArrayList) LJLL).iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(new PublishImageModel((String) it.next(), C44317HaL.LIZ, C44317HaL.LIZIZ, null, 8, null));
                                                }
                                                LLJILJILJ = ORZ.LLJILJILJ(arrayList);
                                                String str17 = nowsShootModel.frontImagePath;
                                                if (str17 != null) {
                                                    ((ArrayList) LLJILJILJ).add(new PublishImageModel(str17, C44317HaL.LIZ(), C44317HaL.LIZLLL, null, 8, null));
                                                }
                                                String str18 = nowsShootModel.backImagePath;
                                                if (str18 != null) {
                                                    ((ArrayList) LLJILJILJ).add(new PublishImageModel(str18, C44317HaL.LIZ(), C44317HaL.LIZLLL, null, 8, null));
                                                }
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        }
                                        long j5 = 0;
                                        for (PublishImageModel publishImageModel : LLJILJILJ) {
                                            long length = new File(publishImageModel.path).length();
                                            strArray.add(String.valueOf(length));
                                            StringBuilder LIZ6 = X1D.LIZ();
                                            LIZ6.append(publishImageModel.width);
                                            LIZ6.append('*');
                                            LIZ6.append(publishImageModel.height);
                                            strArray2.add(X1D.LIZIZ(LIZ6));
                                            j5 += length;
                                        }
                                        LJIIIIZZ.LIZ(LLJILJILJ.size(), "image_count");
                                        LJIIIIZZ.LIZIZ(j5, "total_size");
                                        LJIIIIZZ.LJI("upload_type", "content");
                                        LJIIIIZZ.LJI("image_size_arr", strArray.toString());
                                        LJIIIIZZ.LIZLLL("image_resolution_arr", strArray2.toString());
                                    }
                                    C58672Rz c58672Rz = this.LJIIIZ;
                                    if (c58672Rz != null) {
                                        List<C43394H1i> list = c58672Rz.LIZ;
                                        if (list != null && (c43394H1i = (C43394H1i) ORZ.LJLLLL(list)) != null) {
                                            i3 = c43394H1i.LJLIL * 1024;
                                        } else {
                                            i3 = 0;
                                        }
                                        LJIIIIZZ.LIZ(i3, "adapt_chunk_size");
                                    }
                                    VideoPublishEditModel videoPublishEditModel48 = this.LJ;
                                    if (videoPublishEditModel48 != null) {
                                        C5V5.LIZIZ(LJIIIIZZ, videoPublishEditModel48);
                                        VideoPublishEditModel videoPublishEditModel49 = this.LJ;
                                        if (videoPublishEditModel49 != null) {
                                            ShareKitPanel shareKitPanel = videoPublishEditModel49.creativeFlowData.getShareKitPanel();
                                            if (shareKitPanel != null) {
                                                LJIIIIZZ.LIZLLL("effect_resource_id", shareKitPanel.getEffectResourceId());
                                                LJIIIIZZ.LIZLLL("channel", shareKitPanel.getClientKey());
                                                LJIIIIZZ.LIZLLL("share_panel_option", shareKitPanel.getSharePanelOption());
                                                LJIIIIZZ.LIZJ(shareKitPanel.getShareMediaType(), "share_media_type");
                                            }
                                            VideoPublishEditModel videoPublishEditModel50 = this.LJ;
                                            if (videoPublishEditModel50 != null) {
                                                C43722HDy LIZJ2 = C43723HDz.LIZJ(videoPublishEditModel50);
                                                if (LIZJ2 != null) {
                                                    LJIIIIZZ.LIZLLL("channel", LIZJ2.mClientKey);
                                                    LJIIIIZZ.LIZLLL("sdk_name", LIZJ2.getSdkNameForServer());
                                                    LJIIIIZZ.LIZLLL("sdk_version", LIZJ2.mSdkVersion);
                                                }
                                                VideoPublishEditModel videoPublishEditModel51 = this.LJ;
                                                if (videoPublishEditModel51 != null) {
                                                    String str19 = videoPublishEditModel51.mShootWay;
                                                    if (str19 != null) {
                                                        LJIIIIZZ.LIZLLL("shoot_way", str19);
                                                    }
                                                    VideoPublishEditModel videoPublishEditModel52 = this.LJ;
                                                    if (videoPublishEditModel52 != null) {
                                                        if (videoPublishEditModel52.creativeFlowData.getEditorProModel() != null) {
                                                            VideoPublishEditModel videoPublishEditModel53 = this.LJ;
                                                            if (videoPublishEditModel53 != null) {
                                                                if (videoPublishEditModel53.getEditorProModel().isAdvancedEdit()) {
                                                                    str9 = "1";
                                                                } else {
                                                                    str9 = CardStruct.IStatusCode.DEFAULT;
                                                                }
                                                                LJIIIIZZ.LJI("is_use_editor_pro", str9);
                                                                VideoPublishEditModel videoPublishEditModel54 = this.LJ;
                                                                if (videoPublishEditModel54 != null) {
                                                                    if (!videoPublishEditModel54.getEditorProModel().isPipUsed()) {
                                                                        str15 = CardStruct.IStatusCode.DEFAULT;
                                                                    }
                                                                    LJIIIIZZ.LJI("is_use_pip", str15);
                                                                    C1292755n c1292755n = C1292755n.LIZ;
                                                                    VideoPublishEditModel videoPublishEditModel55 = this.LJ;
                                                                    if (videoPublishEditModel55 != null) {
                                                                        c1292755n.getClass();
                                                                        LJIIIIZZ.LIZLLL("all_editor_pro_used_functions", C1292755n.LIZIZ(videoPublishEditModel55));
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
                                                        VideoPublishEditModel videoPublishEditModel56 = this.LJ;
                                                        if (videoPublishEditModel56 != null) {
                                                            NowsShootModel nowsShootModel2 = videoPublishEditModel56.creativeModel.nowsShootModel;
                                                            if (nowsShootModel2 != null && (str8 = nowsShootModel2.multiCameraMode) != null) {
                                                                LJIIIIZZ.LIZLLL("multi_camera_mode", str8);
                                                            }
                                                            VideoPublishEditModel videoPublishEditModel57 = this.LJ;
                                                            if (videoPublishEditModel57 != null) {
                                                                LJIIIIZZ.LIZLLL("scenes_tag", String.valueOf(H7R.LJI(videoPublishEditModel57)));
                                                                VideoPublishEditModel videoPublishEditModel58 = this.LJ;
                                                                if (videoPublishEditModel58 != null) {
                                                                    NowsShootModel nowsShootModel3 = videoPublishEditModel58.creativeModel.nowsShootModel;
                                                                    if (nowsShootModel3 != null && (nowsExtra = nowsShootModel3.nowsExtra) != null && (str7 = nowsExtra.dualType) != null) {
                                                                        LJIIIIZZ.LIZLLL("dual_type", str7);
                                                                    }
                                                                    VideoPublishEditModel videoPublishEditModel59 = this.LJ;
                                                                    if (videoPublishEditModel59 != null) {
                                                                        if (H7R.LJJJJL(videoPublishEditModel59)) {
                                                                            str6 = "photo_publish_end";
                                                                        } else {
                                                                            str6 = "video_publish_end";
                                                                        }
                                                                        java.util.Map<String, String> map = LJIIIIZZ.LIZ;
                                                                        o.LJIIIIZZ(map, "builder.builder()");
                                                                        LJIIIZ(str6, map);
                                                                        VideoPublishEditModel videoPublishEditModel60 = this.LJ;
                                                                        if (videoPublishEditModel60 != null) {
                                                                            if (H7R.LJJJJL(videoPublishEditModel60)) {
                                                                                VideoPublishEditModel videoPublishEditModel61 = this.LJ;
                                                                                if (videoPublishEditModel61 != null) {
                                                                                    C43821HHt.LJ(videoPublishEditModel61);
                                                                                    return;
                                                                                } else {
                                                                                    o.LJIJI("editModel");
                                                                                    throw null;
                                                                                }
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
}
