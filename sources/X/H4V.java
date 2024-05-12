package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H4V {
    public final C6BK LIZ;
    public String LIZIZ;
    public VideoPublishEditModel LIZJ;
    public H1T LIZLLL;
    public EnumC42379GkB LJ = EnumC42379GkB.VIDEO;

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003b. Please report as an issue. */
    public final void LIZ() {
        String str;
        C6BK c6bk = this.LIZ;
        EnumC48190Ivi LLJJI = C16880lQ.LLJJI(C60903NvH.LJ);
        if (LLJJI != null) {
            switch (C48194Ivm.LIZ[LLJJI.ordinal()]) {
                case -1:
                case 1:
                case 2:
                    break;
                case 0:
                default:
                    throw new C162476Zf();
                case 3:
                    str = "mobile";
                    c6bk.LIZLLL("network_type", str);
                    long j = 1024;
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZIZ() / j) / j), "storage_available_size");
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZ() / j) / j), "app_storage_size");
                case 4:
                    str = "2G";
                    c6bk.LIZLLL("network_type", str);
                    long j2 = 1024;
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZIZ() / j2) / j2), "storage_available_size");
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZ() / j2) / j2), "app_storage_size");
                case 5:
                case 6:
                case 7:
                    str = "3G";
                    c6bk.LIZLLL("network_type", str);
                    long j22 = 1024;
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZIZ() / j22) / j22), "storage_available_size");
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZ() / j22) / j22), "app_storage_size");
                case 8:
                    str = "4G";
                    c6bk.LIZLLL("network_type", str);
                    long j222 = 1024;
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZIZ() / j222) / j222), "storage_available_size");
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZ() / j222) / j222), "app_storage_size");
                case 9:
                    str = "5G";
                    c6bk.LIZLLL("network_type", str);
                    long j2222 = 1024;
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZIZ() / j2222) / j2222), "storage_available_size");
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZ() / j2222) / j2222), "app_storage_size");
                case 10:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                case 12:
                    str = "wifi";
                    c6bk.LIZLLL("network_type", str);
                    long j22222 = 1024;
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZIZ() / j22222) / j22222), "storage_available_size");
                    c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZ() / j22222) / j22222), "app_storage_size");
            }
        }
        str = "unknown";
        c6bk.LIZLLL("network_type", str);
        long j222222 = 1024;
        c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZIZ() / j222222) / j222222), "storage_available_size");
        c6bk.LIZJ(Long.valueOf((C42377Gk9.LIZ() / j222222) / j222222), "app_storage_size");
    }

    public final void LIZIZ() {
        C6BK c6bk = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel != null) {
            c6bk.LIZLLL("content_type", H7R.LJIIIZ(videoPublishEditModel));
            VideoPublishEditModel videoPublishEditModel2 = this.LIZJ;
            if (videoPublishEditModel2 != null) {
                c6bk.LIZLLL("content_source", H7R.LJJIFFI(videoPublishEditModel2));
                VideoPublishEditModel videoPublishEditModel3 = this.LIZJ;
                if (videoPublishEditModel3 != null) {
                    c6bk.LIZLLL("shoot_way", videoPublishEditModel3.mShootWay);
                    c6bk.LIZ(Boolean.valueOf(C43464H4a.LIZ()), "is_long_video_allowed");
                    c6bk.LIZJ(Long.valueOf(C152345yQ.LIZ()), "long_video_threshold");
                    VideoPublishEditModel videoPublishEditModel4 = this.LIZJ;
                    if (videoPublishEditModel4 != null) {
                        c6bk.LIZIZ(Integer.valueOf(videoPublishEditModel4.getVideoLength()), "videoLength");
                        VideoPublishEditModel videoPublishEditModel5 = this.LIZJ;
                        if (videoPublishEditModel5 != null) {
                            c6bk.LIZJ(Long.valueOf(C78929UyL.LIZLLL(videoPublishEditModel5.getPreviewInfo())), "duration");
                            VideoPublishEditModel videoPublishEditModel6 = this.LIZJ;
                            if (videoPublishEditModel6 != null) {
                                if (videoPublishEditModel6.isMvThemeVideoType()) {
                                    VideoPublishEditModel videoPublishEditModel7 = this.LIZJ;
                                    if (videoPublishEditModel7 != null) {
                                        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = videoPublishEditModel7.uploadMiscInfoStruct;
                                        if (aVUploadMiscInfoStruct != null) {
                                            c6bk.LIZLLL("mv_id", aVUploadMiscInfoStruct.mvThemeId);
                                        }
                                    } else {
                                        o.LJIJI("editModel");
                                        throw null;
                                    }
                                }
                                VideoPublishEditModel videoPublishEditModel8 = this.LIZJ;
                                if (videoPublishEditModel8 != null) {
                                    c6bk.LIZ(Boolean.valueOf(H7R.LJJJJ(videoPublishEditModel8)), "is_fast_import");
                                    VideoPublishEditModel videoPublishEditModel9 = this.LIZJ;
                                    if (videoPublishEditModel9 != null) {
                                        c6bk.LIZ(Boolean.valueOf(videoPublishEditModel9.getEditorProModel().isAdvancedEdit()), "is_advance_edit");
                                        VideoPublishEditModel videoPublishEditModel10 = this.LIZJ;
                                        if (videoPublishEditModel10 != null) {
                                            c6bk.LIZ(Boolean.valueOf(videoPublishEditModel10.getEditorProModel().isAdvancedEditDraft()), "is_advance_edit_draft");
                                            VideoPublishEditModel videoPublishEditModel11 = this.LIZJ;
                                            if (videoPublishEditModel11 != null) {
                                                c6bk.LIZ(Boolean.valueOf(videoPublishEditModel11.hasSubtitle()), "has_subtitle");
                                                VideoPublishEditModel videoPublishEditModel12 = this.LIZJ;
                                                if (videoPublishEditModel12 != null) {
                                                    c6bk.LIZIZ(Integer.valueOf(videoPublishEditModel12.segmentCounts()), "segment_count");
                                                    VideoPublishEditModel videoPublishEditModel13 = this.LIZJ;
                                                    if (videoPublishEditModel13 != null) {
                                                        if (H7R.LJJJJL(videoPublishEditModel13)) {
                                                            VideoPublishEditModel videoPublishEditModel14 = this.LIZJ;
                                                            if (videoPublishEditModel14 != null) {
                                                                c6bk.LIZIZ(Integer.valueOf(videoPublishEditModel14.getImageAlbumData().getImageList().size()), "image_count");
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

    public final void LJ() {
        int i;
        String str;
        C6BK c6bk = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.ttStoryUploadModel != null) {
                i = 1;
            } else {
                i = 0;
            }
            c6bk.LIZIZ(Integer.valueOf(i), "is_story");
            VideoPublishEditModel videoPublishEditModel2 = this.LIZJ;
            if (videoPublishEditModel2 != null) {
                if (videoPublishEditModel2.isStoryEditMode) {
                    str = "story_shoot_page";
                } else {
                    str = "video_shoot_page";
                }
                c6bk.LIZLLL("shoot_page", str);
                VideoPublishEditModel videoPublishEditModel3 = this.LIZJ;
                if (videoPublishEditModel3 != null) {
                    TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel3.ttStoryUploadModel;
                    if (tTStoryUploadModel != null) {
                        c6bk.LIZIZ(Integer.valueOf(tTStoryUploadModel.getIndex()), "clip_index");
                        c6bk.LIZIZ(Integer.valueOf(tTStoryUploadModel.getTotalCount()), "clips_cnt");
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

    public H4V(C6BK c6bk) {
        this.LIZ = c6bk;
    }

    public final void LIZJ(AbstractC43460H3w abstractC43460H3w) {
        C6BK c6bk = this.LIZ;
        c6bk.LIZIZ(Integer.valueOf(abstractC43460H3w.LIZJ()), "error_code");
        c6bk.LIZLLL("error_source", abstractC43460H3w.LIZLLL().getDesc());
        String LJII = J7I.LJII(abstractC43460H3w.LIZ);
        o.LJIIIIZZ(LJII, "getStackTraceAsString(error)");
        c6bk.LIZLLL("exception", LJII);
        String LJ = C42991Gu3.LJ(abstractC43460H3w.LIZ());
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("publish node: ");
        H1T h1t = this.LIZLLL;
        if (h1t != null) {
            LIZ.append(h1t.getDesc());
            LIZ.append(", log_id: ");
            LIZ.append(LJ);
            LIZIZ.LIZJ("publish_failed_log_id", X1D.LIZIZ(LIZ));
            c6bk.LIZLLL("server_log_id", LJ);
            String LIZIZ2 = abstractC43460H3w.LIZIZ();
            if (LIZIZ2.length() > 0) {
                c6bk.LIZLLL("error_cause", LIZIZ2);
                return;
            }
            return;
        }
        o.LJIJI("publishNode");
        throw null;
    }

    public final void LIZLLL(boolean z) {
        C6BK c6bk = this.LIZ;
        String str = this.LIZIZ;
        if (str != null) {
            c6bk.LIZLLL("publish_id", str);
            c6bk.LIZLLL("publish_scene", this.LJ.getDesc());
            H1T h1t = this.LIZLLL;
            if (h1t != null) {
                c6bk.LIZLLL("publish_node", h1t.getDesc());
                c6bk.LIZ(Boolean.valueOf(z), "retry_publish");
                return;
            } else {
                o.LJIJI("publishNode");
                throw null;
            }
        }
        o.LJIJI("publishId");
        throw null;
    }

    public final C6BK LJFF(EnumC42980Gts eventType) {
        o.LJIIIZ(eventType, "eventType");
        C6BK c6bk = this.LIZ;
        c6bk.LIZLLL("event_type", eventType.getDesc());
        C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Publish Node: ");
        H1T h1t = this.LIZLLL;
        if (h1t != null) {
            LIZ.append(h1t.getDesc());
            LIZ.append(", event: ");
            LIZ.append(eventType.getDesc());
            LJJ.LJ("build_publish_monitor_metrics", X1D.LIZIZ(LIZ));
            return c6bk;
        }
        o.LJIJI("publishNode");
        throw null;
    }

    public final void LJI(String publishId) {
        o.LJIIIZ(publishId, "publishId");
        this.LIZIZ = publishId;
    }

    public final void LJII(H1T publishNode) {
        o.LJIIIZ(publishNode, "publishNode");
        this.LIZLLL = publishNode;
    }

    public final void LJIIIIZZ(EnumC42379GkB publishScene) {
        o.LJIIIZ(publishScene, "publishScene");
        this.LJ = publishScene;
    }
}
