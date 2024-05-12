package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.util.Calendar;

/* renamed from: X.LYb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54437LYb {
    public final LNP LIZ;
    public final IAVPublishService LIZIZ = AVExternalServiceImpl.LIZ().publishService();

    public C54437LYb(LNP lnp) {
        this.LIZ = lnp;
    }

    @QD3
    public void onHideUploadRecoverEvent(C41668GWy c41668GWy) {
        boolean z = c41668GWy.LJLIL;
        boolean z2 = c41668GWy.LJLILLLLZI;
        if (this.LIZ.isViewValid()) {
            this.LIZIZ.hideUploadRecoverWindow(this.LIZ.getActivity(), z, z2);
        }
    }

    @QD3(sticky = true)
    public void onPublishStatusUpdate(C43694HCw c43694HCw) {
        if (!this.LIZ.isViewValid()) {
            return;
        }
        if (c43694HCw.LJLIL == 9 && c43694HCw.LJLJJL && !c43694HCw.LJLL) {
            LIZIZ(c43694HCw, c43694HCw.LJLJL, "publish status failed", c43694HCw.LJLJJI);
        }
        if (c43694HCw.LJLIL == 10) {
            Object obj = c43694HCw.LJLJI;
            if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                if (aweme.isPaidContent) {
                    return;
                }
                try {
                    long createTime = aweme.getCreateTime() - (Calendar.getInstance().getTimeInMillis() / 1000);
                    if (createTime < -120 || createTime > 10) {
                        C198517qh c198517qh = new C198517qh();
                        c198517qh.LIZ.put("server_create_time", String.valueOf(aweme.getCreateTime()));
                        c198517qh.LIZ.put("client_insert_time", String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000));
                        c198517qh.LIZ.put("group_id", aweme.getAid());
                        C09900aA.LJ("aweme_publish_upload_create_time_error", c198517qh.LJ());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void LIZ(PublishFailureReason publishFailureReason, ActivityC45651qj activityC45651qj, PublishModel publishModel, String str) {
        if (C78596Usy.LJJIJL(DLH.LJLIL, DPB.LIZJ())) {
            try {
                this.LIZIZ.showUploadRecoverIfNeed(publishFailureReason, activityC45651qj, publishModel, str);
                return;
            } catch (Throwable th) {
                FMW.LIZLLL("AvApiFragmentObserverAttachExperiment", "AvApiFragmentObserver", "doShowUploadRecoverIfNeed", "", th);
                C57022Lq.LIZ.LJLIL.post(new RunnableC54439LYd(this, publishFailureReason, activityC45651qj, publishModel, str, 1));
                return;
            }
        }
        this.LIZIZ.showUploadRecoverIfNeed(publishFailureReason, activityC45651qj, publishModel, str);
    }

    public final void LIZIZ(C43694HCw c43694HCw, boolean z, String str, String str2) {
        String str3;
        C41759GaB c41759GaB = null;
        if (c43694HCw != null) {
            str3 = c43694HCw.LJLLI;
            c41759GaB = c43694HCw.LJLJJLL;
        } else {
            str3 = null;
        }
        PublishFailureReason publishFailureReason = new PublishFailureReason(c41759GaB, z, str, str2);
        if (c43694HCw == null) {
            this.LIZIZ.tryRestorePublish(this.LIZ.getActivity(), new C54438LYc(this, publishFailureReason, str3));
        } else {
            LIZ(publishFailureReason, this.LIZ.getActivity(), c43694HCw.LJLLILLLL, str3);
        }
    }
}
