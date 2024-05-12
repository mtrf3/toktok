package X;

import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.AVAweme;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HFd */
/* loaded from: classes8.dex */
public final class C43753HFd {
    public static HFB LIZ;

    public static String LIZLLL() {
        List<HFD> uploadFrameInfoList;
        StringBuilder sb = new StringBuilder("{");
        HFB hfb = LIZ;
        if (hfb != null && (uploadFrameInfoList = hfb.getUploadFrameInfoList()) != null && (!uploadFrameInfoList.isEmpty())) {
            for (HFD hfd : uploadFrameInfoList) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("d:");
                LIZ2.append(hfd.LIZIZ);
                sb.append(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(", s:");
                LIZ3.append(hfd.LIZJ);
                sb.append(X1D.LIZIZ(LIZ3));
                sb.append(";");
            }
        }
        return C0EH.LIZJ(sb, "}", "msgBuilder.toString()");
    }

    public static final void LIZ(C43754HFe c43754HFe) {
        int i;
        Integer num = c43754HFe.LJFF;
        if (num != null && num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        C43882HKc.LIZLLL(i, "av_audio_audit", c43754HFe.LIZ(), true);
        if (c43754HFe.LJI == 0) {
            C43750HFa LIZ2 = C43752HFc.LIZ(c43754HFe);
            String LIZJ = PKW.LIZJ(new Throwable("AudioAuditError"));
            o.LJIIIIZZ(LIZJ, "getExceptionStack(Throwable(\"AudioAuditError\"))");
            PL4.LIZ(LIZ2, LIZJ, "AudioAudit", "creative_tools_audit_error");
        }
    }

    public static final void LIZJ(C43754HFe c43754HFe) {
        C43750HFa LIZ2 = C43752HFc.LIZ(c43754HFe);
        String LIZJ = PKW.LIZJ(new Throwable("AuditOutdated"));
        o.LJIIIIZZ(LIZJ, "getExceptionStack(Throwable(\"AuditOutdated\"))");
        PL4.LIZ(LIZ2, LIZJ, "AuditOutdated", "creative_tools_audit_outdated_error");
    }

    public static final void LJIIIIZZ(C43754HFe c43754HFe) {
        int i;
        Integer num = c43754HFe.LJFF;
        if (num != null && num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        C43882HKc.LIZLLL(i, "av_video_audit", c43754HFe.LIZ(), true);
        if (c43754HFe.LJI == 0) {
            C43750HFa LIZ2 = C43752HFc.LIZ(c43754HFe);
            String LIZJ = PKW.LIZJ(new Throwable("VideoAuditError"));
            o.LJIIIIZZ(LIZJ, "getExceptionStack(Throwable(\"VideoAuditError\"))");
            PL4.LIZ(LIZ2, LIZJ, "VideoAudit", "creative_tools_audit_error");
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, CreateBaseAwemeResponse createBaseAwemeResponse, Integer num, String description) {
        String str;
        int i;
        boolean z;
        Boolean bool = Boolean.FALSE;
        o.LJIIIZ(description, "description");
        int i2 = 0;
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getAVConverter().getClass();
        AVAweme lambda$getAVConverter$1 = AVServiceProxyImpl.lambda$getAVConverter$1(createBaseAwemeResponse);
        C43754HFe c43754HFe = new C43754HFe();
        if (lambda$getAVConverter$1 != null) {
            str = lambda$getAVConverter$1.aid;
        } else {
            str = null;
        }
        c43754HFe.LIZ = str;
        c43754HFe.LIZIZ = C43811HHj.LIZ(videoPublishEditModel).LIZ;
        String cameraIds = videoPublishEditModel.getCameraIds();
        if (cameraIds == null || cameraIds.length() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        c43754HFe.LIZJ = i;
        c43754HFe.LIZLLL = Boolean.valueOf(videoPublishEditModel.mIsFromDraft);
        if (videoPublishEditModel.mRestoreType == 2) {
            z = true;
        } else {
            z = false;
        }
        c43754HFe.LJ = Boolean.valueOf(z);
        c43754HFe.LJFF = num;
        if (num == null || num.intValue() == 0) {
            i2 = 1;
        }
        c43754HFe.LJI = i2;
        c43754HFe.LJII = bool;
        c43754HFe.LJIIIZ = description;
        LIZ(c43754HFe);
    }

    public static final void LJI(Object obj, int i, int i2, String str) {
        if (str == null) {
            str = "";
        }
        String str2 = str + ", " + LIZLLL();
        o.LJIIIIZZ(str2, "StringBuilder(extraMsg ?…)\n            .toString()");
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("frame_type", Integer.valueOf(i));
        c6bk.LIZ.put("extra_msg", str2);
        c6bk.LIZ.put("status_code", Integer.valueOf(i2));
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            c6bk.LIZ.put("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c6bk.LIZ.put("aweme_type", Integer.valueOf(H7R.LJI(videoPublishEditModel)));
            c6bk.LIZLLL("enter_from", videoPublishEditModel.enterFrom);
        }
        if (i2 == 0) {
            C43882HKc.LIZLLL(0, "av_extra_video_frame", c6bk.LJ(), true);
            FMX.LJIILJJIL("av_extra_video_frame", c6bk.LJ());
        } else {
            C43882HKc.LIZLLL(i2, "av_extra_video_frame", c6bk.LJ(), true);
            FMX.LJIILJJIL("av_extra_video_frame", c6bk.LJ());
            H78.LIZIZ("saveVideoFrames", str2);
        }
    }

    public static /* synthetic */ void LJFF(Object obj, InterfaceC43755HFf interfaceC43755HFf, boolean z, int i, String str) {
        LJ(obj, interfaceC43755HFf, z, i, str, true);
    }

    public static final void LJII(CreateBaseAwemeResponse response, VideoPublishEditModel model, Boolean bool, Integer num, String description) {
        String str;
        int i;
        boolean z;
        o.LJIIIZ(response, "response");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(description, "description");
        int i2 = 0;
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getAVConverter().getClass();
        AVAweme lambda$getAVConverter$1 = AVServiceProxyImpl.lambda$getAVConverter$1(response);
        C43754HFe c43754HFe = new C43754HFe();
        if (lambda$getAVConverter$1 != null) {
            str = lambda$getAVConverter$1.aid;
        } else {
            str = null;
        }
        c43754HFe.LIZ = str;
        c43754HFe.LIZIZ = HGU.LIZ(model).LIZ;
        String cameraIds = model.getCameraIds();
        if (cameraIds == null || cameraIds.length() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        c43754HFe.LIZJ = i;
        c43754HFe.LIZLLL = Boolean.valueOf(model.mIsFromDraft);
        if (model.mRestoreType == 2) {
            z = true;
        } else {
            z = false;
        }
        c43754HFe.LJ = Boolean.valueOf(z);
        c43754HFe.LJFF = num;
        if (num == null || num.intValue() == 0) {
            i2 = 1;
        }
        c43754HFe.LJI = i2;
        c43754HFe.LJII = bool;
        c43754HFe.LJIIIZ = description;
        LJIIIIZZ(c43754HFe);
    }

    public static void LJ(Object obj, InterfaceC43755HFf interfaceC43755HFf, boolean z, int i, String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        HFB hfb = LIZ;
        if (hfb != null) {
            sb.append("video_type:");
            sb.append(hfb.getVideoType());
            sb.append(",video_origin:");
            sb.append(hfb.getVideoOrigin());
            sb.append(",");
            sb.append(str);
            if (z2) {
                LJI(obj, hfb.getVideoType(), i, sb.toString());
            } else {
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                String sb2 = sb.toString();
                if (sb2 == null) {
                    sb2 = "";
                }
                String str2 = sb2 + ", " + LIZLLL();
                o.LJIIIIZZ(str2, "StringBuilder(extraMsg ?…SegmentInfo()).toString()");
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("extra_msg", str2);
                c6bk.LIZ.put("content_type", H7R.LJIIIZ(videoPublishEditModel));
                c6bk.LIZ.put("aweme_type", Integer.valueOf(H7R.LJI(videoPublishEditModel)));
                c6bk.LIZ.put("enter_from", videoPublishEditModel.enterFrom);
                c6bk.LIZ.put("status_code", Integer.valueOf(i));
                C43882HKc.LIZLLL(i, "av_extra_audio_frame", c6bk.LJ(), true);
                FMX.LJIILJJIL("av_extra_audio_frame", c6bk.LJ());
            }
        }
        if (z && interfaceC43755HFf != null) {
            interfaceC43755HFf.LIZ(i, sb.toString(), z2);
        }
    }
}
