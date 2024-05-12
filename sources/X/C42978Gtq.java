package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.File;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Gtq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42978Gtq extends AbstractC41873Gc1 {
    public final String LJ;
    public VideoPublishEditModel LJFF;
    public C43458H3u LJI;
    public C43397H1l LJII;
    public PublishModel LJIIIIZZ;
    public InterfaceC43387H1b LJIIIZ;
    public long LJIIJ;
    public C42979Gtr LJIIJJI;

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

    public C42978Gtq(String str) {
        super((Object) null, 3);
        this.LJ = str;
    }

    public final String LJI(Object obj) {
        if (o.LJ(obj, this.LJ)) {
            return this.LJ;
        }
        String lowerCase = obj.toString().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x018e, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019e, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a6, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
     */
    @Override // X.AbstractC41873Gc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.Object r11, X.ERR r12) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42978Gtq.LJ(java.lang.Object, X.ERR):void");
    }

    public final int LJIIIIZZ(Object obj, boolean z) {
        if (o.LJ(obj, this.LJ)) {
            return 70;
        }
        if (obj == H1U.COMPILE) {
            if (z) {
                return 10;
            }
            return 11;
        }
        if (obj == H1U.UPLOAD) {
            if (z) {
                return 30;
            }
            return 31;
        }
        if (obj == H1U.AUTH_KEY) {
            if (z) {
                return 20;
            }
            return 21;
        }
        if (obj == H1U.COVER_TEXT_UPLOAD) {
            if (z) {
                return 60;
            }
            return 61;
        }
        if (obj == H1U.CREATE_AWEME) {
            if (z) {
                return 40;
            }
            return 41;
        }
        if (obj == H1U.CLOUD_MERGE) {
            if (z) {
                return LiveTryModeCountDownThresholdSetting.DEFAULT;
            }
            return 121;
        }
        return -1;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        InterfaceC43387H1b interfaceC43387H1b = this.LJIIIZ;
        if (interfaceC43387H1b != null) {
            C79081V1x LIZJ = interfaceC43387H1b.LIZJ();
            C145995oB LJII = LJII();
            PublishModel publishModel = this.LJIIIIZZ;
            if (publishModel != null) {
                LJII.LJI("shoot_way", publishModel.shootWay);
                VideoPublishEditModel videoPublishEditModel = this.LJFF;
                if (videoPublishEditModel != null) {
                    LJII.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
                    PublishModel publishModel2 = this.LJIIIIZZ;
                    if (publishModel2 != null) {
                        LJII.LJI("retry_publish", publishModel2.LIZ());
                        LJII.LIZ(LJIIIIZZ(sourceTag, false), "publish_step");
                        LJII.LJI("publish_step_name", LJI(sourceTag));
                        if (cause instanceof C42985Gtx) {
                            LJII.LIZ(-39993, "error_code");
                            Object obj = ((C42985Gtx) cause).LIZ;
                            if (obj instanceof C41359GLb) {
                                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.exception.CancelCause");
                                LJII.LIZLLL("error_cause", ((C41359GLb) obj).LIZ);
                            }
                            LJII.LIZLLL("event_type", EnumC42980Gts.CANCEL_EXTERNAL.getDesc());
                        } else if (cause instanceof C42984Gtw) {
                            C42984Gtw c42984Gtw = (C42984Gtw) cause;
                            LJII.LIZ(c42984Gtw.LIZ.getCode(), "error_code");
                            LJII.LIZLLL("error_node_name", c42984Gtw.LIZ.getNodeTag().toString());
                            LJII.LIZLLL("event_type", EnumC42980Gts.CANCEL_INTERNAL.getDesc());
                        }
                        LJII.LIZ(i, "duration");
                        C43458H3u c43458H3u = this.LJI;
                        if (c43458H3u != null) {
                            String str2 = "1";
                            if (c43458H3u.LIZIZ) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            LJII.LJI("click_publish", str);
                            if (!C47918IrK.LIZ(C60903NvH.LJ)) {
                                str2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            LJII.LJI("network_available", str2);
                            VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
                            if (videoPublishEditModel2 != null) {
                                LJII.LJI("creation_id", videoPublishEditModel2.getCreationId());
                                C43397H1l c43397H1l = this.LJII;
                                if (c43397H1l != null) {
                                    LJII.LJI("publish_id", c43397H1l.LJLIL);
                                    PublishModel publishModel3 = this.LJIIIIZZ;
                                    if (publishModel3 != null) {
                                        LJII.LIZ(publishModel3.isEditSave ? 1 : 0, "is_save_local");
                                        java.util.Map<String, String> map = LJII.LIZ;
                                        o.LJIIIIZZ(map, "providePerfParams()\n    …               .builder()");
                                        LIZJ.getClass();
                                        FMX.LJIIL("parallel_publish_result", map);
                                        return;
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
                        o.LJIJI("clickPublishWaiter");
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
        o.LJIJI("dependency");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        int i3;
        String str;
        String LJ;
        String str2;
        C42979Gtr c42979Gtr;
        C42990Gu2 c42990Gu2;
        Throwable cause;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        InterfaceC43387H1b interfaceC43387H1b = this.LJIIIZ;
        if (interfaceC43387H1b != null) {
            C79081V1x LIZJ = interfaceC43387H1b.LIZJ();
            C145995oB LJII = LJII();
            PublishModel publishModel = this.LJIIIIZZ;
            if (publishModel != null) {
                LJII.LJI("retry_publish", publishModel.LIZ());
                LJII.LIZ(LJIIIIZZ(sourceTag, false), "publish_step");
                LJII.LJI("publish_step_name", LJI(sourceTag));
                H1U h1u = H1U.COMPILE;
                if (sourceTag == h1u) {
                    i3 = C42991Gu3.LJFF(error);
                } else if (sourceTag == H1U.AUTH_KEY) {
                    i3 = C42991Gu3.LJI(11, error);
                } else if (sourceTag == H1U.UPLOAD) {
                    i3 = C42991Gu3.LJII(error);
                } else if (sourceTag == H1U.CREATE_AWEME) {
                    i3 = C42991Gu3.LJI(13, error);
                } else {
                    i3 = 13;
                }
                LJII.LIZ(i3, "error_code");
                if (sourceTag != h1u || (cause = error.getCause()) == null || (str = cause.getMessage()) == null) {
                    str = "";
                }
                LJII.LIZLLL("upload_error_msg", str);
                Throwable cause2 = error.getCause();
                if (!(cause2 instanceof C42990Gu2) || (c42990Gu2 = (C42990Gu2) cause2) == null || (LJ = c42990Gu2.getVESDKErrorCode()) == null) {
                    LJ = C42991Gu3.LJ(error);
                }
                LJII.LJI("server_log_id", LJ);
                if (sourceTag == h1u) {
                    VideoPublishEditModel videoPublishEditModel = this.LJFF;
                    if (videoPublishEditModel != null) {
                        LJII.LIZ(videoPublishEditModel.getVideoEditorType(), "video_editor_type");
                    } else {
                        o.LJIJI("editModel");
                        throw null;
                    }
                }
                VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
                if (videoPublishEditModel2 != null) {
                    File file = new File(videoPublishEditModel2.mOutputFile);
                    if (file.exists()) {
                        long length = file.length() / 1024;
                        LJII.LIZIZ(length, "content_storage_size");
                        LJII.LIZIZ(length, "file_size");
                    }
                    if (sourceTag == h1u && this.LJIIJ != 0 && (c42979Gtr = this.LJIIJJI) != null) {
                        long LIZ = c42979Gtr.LIZ();
                        if (LIZ > 0) {
                            LJII.LIZIZ((LIZ - this.LJIIJ) / 1024, "content_storage_size");
                        }
                    }
                    C43458H3u c43458H3u = this.LJI;
                    if (c43458H3u != null) {
                        String str3 = "1";
                        if (c43458H3u.LIZIZ) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        LJII.LJI("click_publish", str2);
                        if (!C47918IrK.LIZ(C60903NvH.LJ)) {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        LJII.LJI("network_available", str3);
                        LJII.LIZ(i, "duration");
                        VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
                        if (videoPublishEditModel3 != null) {
                            LJII.LJI("creation_id", videoPublishEditModel3.getCreationId());
                            C43397H1l c43397H1l = this.LJII;
                            if (c43397H1l != null) {
                                LJII.LIZJ(c43397H1l, "publish_id");
                                LJII.LJI("event_type", EnumC42980Gts.FAILED.getDesc());
                                PublishModel publishModel2 = this.LJIIIIZZ;
                                if (publishModel2 != null) {
                                    LJII.LIZ(publishModel2.isEditSave ? 1 : 0, "is_save_local");
                                    java.util.Map<String, String> map = LJII.LIZ;
                                    o.LJIIIIZZ(map, "providePerfParams()\n    …               .builder()");
                                    LIZJ.getClass();
                                    FMX.LJIIL("parallel_publish_result", map);
                                    return;
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
                    o.LJIJI("clickPublishWaiter");
                    throw null;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("publishModel");
            throw null;
        }
        o.LJIJI("dependency");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        UploadVideoConfig uploadVideoConfig;
        String uploadVideoConfig2;
        String str;
        C42979Gtr c42979Gtr;
        o.LJIIIZ(sourceTag, "sourceTag");
        InterfaceC43387H1b interfaceC43387H1b = this.LJIIIZ;
        if (interfaceC43387H1b != null) {
            C79081V1x LIZJ = interfaceC43387H1b.LIZJ();
            C145995oB LJII = LJII();
            PublishModel publishModel = this.LJIIIIZZ;
            if (publishModel != null) {
                LJII.LJI("retry_publish", publishModel.LIZ());
                LJII.LIZ(LJIIIIZZ(sourceTag, false), "publish_step");
                LJII.LJI("publish_step_name", LJI(sourceTag));
                H1U h1u = H1U.COMPILE;
                if (sourceTag == h1u) {
                    VideoPublishEditModel videoPublishEditModel = this.LJFF;
                    if (videoPublishEditModel != null) {
                        LJII.LIZ(videoPublishEditModel.getVideoEditorType(), "video_editor_type");
                    } else {
                        o.LJIJI("editModel");
                        throw null;
                    }
                } else if (sourceTag == H1U.AUTH_KEY) {
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                    VideoCreation videoCreation = ((ERL) obj).LJLIL;
                    if (!(videoCreation instanceof UploadAuthKeyConfig) || (uploadVideoConfig = ((UploadAuthKeyConfig) videoCreation).videoConfig) == null || (uploadVideoConfig2 = uploadVideoConfig.toString()) == null) {
                        uploadVideoConfig2 = "";
                    }
                    LJII.LIZLLL("auth_key", uploadVideoConfig2);
                } else if (sourceTag == H1U.CLOUD_MERGE) {
                    if (obj instanceof C42365Gjx) {
                        LJII.LIZLLL("upload_error_msg", ((C42365Gjx) obj).LIZ.getMessage());
                    } else {
                        LJII.LIZLLL("upload_error_msg", EnumC42980Gts.SUCCESS.getDesc());
                    }
                }
                if (sourceTag == h1u && this.LJIIJ != 0 && (c42979Gtr = this.LJIIJJI) != null) {
                    long LIZ = c42979Gtr.LIZ();
                    if (LIZ > 0) {
                        LJII.LIZIZ((LIZ - this.LJIIJ) / 1024, "content_storage_size");
                    }
                }
                C43458H3u c43458H3u = this.LJI;
                if (c43458H3u != null) {
                    String str2 = "1";
                    if (c43458H3u.LIZIZ) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    LJII.LJI("click_publish", str);
                    LJII.LIZ(i, "duration");
                    if (!C47918IrK.LIZ(C60903NvH.LJ)) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    LJII.LJI("network_available", str2);
                    VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
                    if (videoPublishEditModel2 != null) {
                        LJII.LJI("creation_id", videoPublishEditModel2.getCreationId());
                        C43397H1l c43397H1l = this.LJII;
                        if (c43397H1l != null) {
                            LJII.LIZJ(c43397H1l, "publish_id");
                            LJII.LJI("event_type", EnumC42980Gts.SUCCESS.getDesc());
                            PublishModel publishModel2 = this.LJIIIIZZ;
                            if (publishModel2 != null) {
                                LJII.LIZ(publishModel2.isEditSave ? 1 : 0, "is_save_local");
                                java.util.Map<String, String> map = LJII.LIZ;
                                o.LJIIIIZZ(map, "providePerfParams()\n    …               .builder()");
                                LIZJ.getClass();
                                FMX.LJIIL("parallel_publish_result", map);
                                return;
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
                o.LJIJI("clickPublishWaiter");
                throw null;
            }
            o.LJIJI("publishModel");
            throw null;
        }
        o.LJIJI("dependency");
        throw null;
    }
}
