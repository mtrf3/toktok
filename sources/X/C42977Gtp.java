package X;

import android.app.Application;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.wavepublish.monitor.feedback.PublisherEvent;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Gtp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42977Gtp extends AbstractC41873Gc1 {
    public VideoPublishEditModel LJ;
    public C43397H1l LJFF;
    public PublishModel LJI;

    public C42977Gtp() {
        super((Object) null, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
     */
    @Override // X.AbstractC41873Gc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.Object r19, X.ERR r20) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42977Gtp.LJ(java.lang.Object, X.ERR):void");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        C42360Gjs c42360Gjs;
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
        String str2 = null;
        if (cause instanceof C42984Gtw) {
            c42360Gjs = ((C42984Gtw) cause).LIZ;
        } else {
            c42360Gjs = null;
        }
        if (c42360Gjs == null) {
            C43397H1l c43397H1l = this.LJFF;
            if (c43397H1l != null) {
                String publishId = c43397H1l.LJLIL;
                o.LJIIIZ(publishId, "publishId");
                C43150Gwc.LJIIIIZZ(publishId, BehaviorType.CANCEL, "WT", String.valueOf(-39993), 16);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        if (sourceTag == H1U.COMPILE) {
            C43397H1l c43397H1l2 = this.LJFF;
            if (c43397H1l2 != null) {
                String str3 = c43397H1l2.LJLIL;
                int LJFF = C42991Gu3.LJFF(c42360Gjs);
                Throwable cause2 = c42360Gjs.getCause();
                if (cause2 != null) {
                    str2 = cause2.getMessage();
                }
                C43150Gwc.LJIIIZ(LJFF, str3, str2);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        if (sourceTag != H1U.UPLOAD) {
            return;
        }
        C43397H1l c43397H1l3 = this.LJFF;
        if (c43397H1l3 != null) {
            String publishId2 = c43397H1l3.LJLIL;
            int LJII = C42991Gu3.LJII(c42360Gjs);
            Throwable cause3 = c42360Gjs.getCause();
            if (cause3 == null || (str = cause3.getMessage()) == null) {
                str = "";
            }
            o.LJIIIZ(publishId2, "publishId");
            C43150Gwc.LJII(publishId2, BehaviorType.FAILED, "UP", String.valueOf(LJII), str);
            return;
        }
        o.LJIJI("publishId");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        String str;
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
        if (sourceTag == H1U.COMPILE) {
            C43397H1l c43397H1l = this.LJFF;
            if (c43397H1l != null) {
                C43150Gwc.LJIIIZ(C42991Gu3.LJFF(error), c43397H1l.LJLIL, error.getMessage());
                return;
            } else {
                o.LJIJI("publishId");
                throw null;
            }
        }
        String str2 = "";
        if (sourceTag == H1U.UPLOAD) {
            int LJII = C42991Gu3.LJII(error);
            C43397H1l c43397H1l2 = this.LJFF;
            if (c43397H1l2 != null) {
                String publishId = c43397H1l2.LJLIL;
                String message = error.getMessage();
                if (message != null) {
                    str2 = message;
                }
                o.LJIIIZ(publishId, "publishId");
                C43150Gwc.LJII(publishId, BehaviorType.FAILED, "UP", String.valueOf(LJII), str2);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        int i3 = -2;
        if (sourceTag == H1U.AUTH_KEY) {
            int LJI = C42991Gu3.LJI(11, error);
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            if (C48203Ivv.LJ(application)) {
                i3 = LJI;
            }
            C43397H1l c43397H1l3 = this.LJFF;
            if (c43397H1l3 != null) {
                String publishId2 = c43397H1l3.LJLIL;
                String serverLogId = C42991Gu3.LJ(error);
                String message2 = error.getMessage();
                o.LJIIIZ(publishId2, "publishId");
                o.LJIIIZ(serverLogId, "serverLogId");
                BehaviorType behaviorType = BehaviorType.FAILED;
                String valueOf = String.valueOf(i3);
                if (message2 != null) {
                    str2 = message2;
                }
                C43150Gwc.LJII(publishId2, behaviorType, "AK", valueOf, str2);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        if (sourceTag == H1U.COVER_TEXT_UPLOAD) {
            C43397H1l c43397H1l4 = this.LJFF;
            if (c43397H1l4 != null) {
                String publishId3 = c43397H1l4.LJLIL;
                int code = error.getCode();
                if (error.getMessage() != null) {
                    str2 = error.getMessage();
                }
                o.LJI(str2);
                o.LJIIIZ(publishId3, "publishId");
                C43150Gwc.LJII(publishId3, BehaviorType.FAILED, "CT", String.valueOf(code), str2);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        if (sourceTag != H1U.CREATE_AWEME) {
            return;
        }
        int LJI2 = C42991Gu3.LJI(13, error);
        Application application2 = C60903NvH.LJ;
        o.LJIIIIZZ(application2, "getApplication()");
        if (C48203Ivv.LJ(application2)) {
            i3 = LJI2;
        }
        C43397H1l c43397H1l5 = this.LJFF;
        if (c43397H1l5 != null) {
            String publishId4 = c43397H1l5.LJLIL;
            String serverLogId2 = C42991Gu3.LJ(error);
            o.LJIIIZ(publishId4, "publishId");
            o.LJIIIZ(serverLogId2, "serverLogId");
            BehaviorType behaviorType2 = BehaviorType.FAILED;
            if (i3 != 21) {
                if (i3 != 2158) {
                    str = String.valueOf(i3);
                } else {
                    str = "PK";
                }
            } else {
                str = "FJ";
            }
            C43150Gwc.LJIIIIZZ(publishId4, behaviorType2, "CA", str, 16);
            return;
        }
        o.LJIJI("publishId");
        throw null;
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        UploadVideoConfig uploadVideoConfig;
        String LIZIZ;
        o.LJIIIZ(sourceTag, "sourceTag");
        if (sourceTag == H1U.COMPILE) {
            C43397H1l c43397H1l = this.LJFF;
            if (c43397H1l != null) {
                String publishId = c43397H1l.LJLIL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("encode:");
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
                LIZ.append(((SynthetiseResult) obj).synthetiseCPUEncode);
                String resultInfo = X1D.LIZIZ(LIZ);
                o.LJIIIZ(publishId, "publishId");
                o.LJIIIZ(resultInfo, "resultInfo");
                C43150Gwc.LJII(publishId, BehaviorType.SUCCESS, "SN", "", resultInfo);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        if (sourceTag == H1U.UPLOAD) {
            C43397H1l c43397H1l2 = this.LJFF;
            if (c43397H1l2 != null) {
                String publishId2 = c43397H1l2.LJLIL;
                o.LJIIIZ(publishId2, "publishId");
                C43150Gwc.LJIIIIZZ(publishId2, BehaviorType.SUCCESS, "UP", null, 24);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        if (sourceTag == H1U.AUTH_KEY) {
            C43397H1l c43397H1l3 = this.LJFF;
            if (c43397H1l3 != null) {
                String publishId3 = c43397H1l3.LJLIL;
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                VideoCreation videoCreation = ((ERL) obj).LJLIL;
                if (!(videoCreation instanceof UploadAuthKeyConfig) || (uploadVideoConfig = ((UploadAuthKeyConfig) videoCreation).videoConfig) == null) {
                    LIZIZ = "";
                } else {
                    LIZIZ = C63144OqK.LIZIZ(new Object[]{Integer.valueOf(uploadVideoConfig.enableHttps), Integer.valueOf(uploadVideoConfig.ttnetConfigValue)}, 2, Locale.US, "https:%d ttnet:%d", "format(locale, format, *args)");
                }
                o.LJIIIZ(publishId3, "publishId");
                C43150Gwc.LJII(publishId3, BehaviorType.SUCCESS, "AK", "", LIZIZ);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        if (sourceTag == H1U.COVER_TEXT_UPLOAD) {
            C43397H1l c43397H1l4 = this.LJFF;
            if (c43397H1l4 != null) {
                String publishId4 = c43397H1l4.LJLIL;
                o.LJIIIZ(publishId4, "publishId");
                C43150Gwc.LJIIIIZZ(publishId4, BehaviorType.SUCCESS, "CT", null, 24);
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        if (sourceTag != H1U.CREATE_AWEME) {
            return;
        }
        C43397H1l c43397H1l5 = this.LJFF;
        if (c43397H1l5 != null) {
            String publishId5 = c43397H1l5.LJLIL;
            o.LJIIIZ(publishId5, "publishId");
            C43150Gwc.LJIIIIZZ(publishId5, BehaviorType.SUCCESS, "CA", null, 24);
            C43397H1l c43397H1l6 = this.LJFF;
            if (c43397H1l6 != null) {
                String publishId6 = c43397H1l6.LJLIL;
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel != null) {
                    String creationId = videoPublishEditModel.getCreationId();
                    o.LJIIIIZZ(creationId, "editModel.creationId");
                    C41875Gc3 c41875Gc3 = new C41875Gc3(0);
                    o.LJIIIZ(publishId6, "publishId");
                    C41859Gbn LIZIZ2 = C1I0.LIZIZ();
                    StringBuilder LIZLLL = C06540Nm.LIZLLL("publishId: ", publishId6, ", creationId: ", creationId, ", videoId: ");
                    LIZLLL.append("");
                    LIZLLL.append(", happenTime: ");
                    LIZLLL.append(c41875Gc3);
                    LIZIZ2.LIZJ("create_aweme_success", X1D.LIZIZ(LIZLLL));
                    int LIZIZ3 = C42970Gti.LIZIZ();
                    long j = c41875Gc3.LJLIL;
                    C42970Gti.LIZLLL(new PublisherEvent("create_aweme_success", publishId6, creationId, LIZIZ3, j, C42970Gti.LIZ(j)));
                    return;
                }
                o.LJIJI("editModel");
                throw null;
            }
            o.LJIJI("publishId");
            throw null;
        }
        o.LJIJI("publishId");
        throw null;
    }
}
