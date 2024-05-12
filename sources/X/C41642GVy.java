package X;

import Y.ACListenerS27S0100000_7;
import Y.ACListenerS42S0200000_7;
import Y.ARunnableS26S0200000_7;
import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GVy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41642GVy implements GVB {
    public final ActivityC45651qj LJLIL;
    public final C41474GPm LJLILLLLZI;
    public final boolean LJLJI;
    public boolean LJLJJI;
    public final GWE LJLJJL;
    public final AwemeDraft LJLJJLL;
    public final GW2 LJLJL;
    public C41639GVv LJLJLJ;

    public void LJFF() {
        this.LJLJJI = true;
        LIZJ(false, false);
        LIZIZ();
        GVX.LIZJ = true;
        C268713r.LIZ().LIZLLL(this.LJLIL, this.LJLJJLL, this.LJLILLLLZI.LIZIZ);
        GW2 gw2 = this.LJLJL;
        if (gw2 != null) {
            gw2.LIZLLL.execute(new ARunnableS26S0200000_7(this.LJLILLLLZI.LIZIZ, gw2, 29));
        }
    }

    @Override // X.GVB
    public final void setVisibility(boolean z) {
    }

    public void LIZ() {
        int i;
        List<SingleImageData> imageList;
        if (this.LJLJJLL.LJIIIZ()) {
            if (this.LJLJJLL.LJIIJ()) {
                ImageAlbumData imageAlbumData = this.LJLJJLL.LJJJJI.imageAlbumData;
                if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                    i = imageList.size();
                } else {
                    i = 1;
                }
                GWE gwe = this.LJLJJL;
                String quantityString = this.LJLIL.getResources().getQuantityString(R.plurals.gf, i);
                o.LJIIIIZZ(quantityString, "fragmentActivity.resourc…escription2, imagesCount)");
                gwe.setText(quantityString);
            } else {
                GWE gwe2 = this.LJLJJL;
                String string = this.LJLIL.getString(R.string.dwj);
                o.LJIIIIZZ(string, "fragmentActivity.getStri…oad_photos_after_publish)");
                gwe2.setText(string);
            }
        }
        if (C41802Gas.LJII(this.LJLJJLL)) {
            GWE gwe3 = this.LJLJJL;
            String string2 = this.LJLIL.getString(R.string.j67);
            o.LJIIIIZZ(string2, "fragmentActivity.getStri…g.now_push_upload_failed)");
            gwe3.setText(string2);
        }
    }

    public final void LIZIZ() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("action_type", "publish");
        c145995oB.LJI("creation_id", this.LJLJJLL.LIZ());
        c145995oB.LIZ(2, "is_new_style");
        c145995oB.LJI("enter_from", "toast");
        FMX.LJIIL("publish_retry", c145995oB.LIZ);
    }

    @Override // X.GVB
    public final boolean isShowing() {
        return this.LJLJJL.LJLJL;
    }

    @Override // X.GVB
    public final void LIZLLL() {
        String str;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && o.LJ(C65352Pkq.LIZ(topActivity.getClass()).LJFF(), "PublishPreviewDetailActivity")) {
            return;
        }
        GVX.LJI = true;
        LIZ();
        AwemeDraft awemeDraft = this.LJLJJLL;
        C41802Gas.LJIIIIZZ(awemeDraft, new VideoCoverConfig(C7MY.LIZIZ(45), C7MY.LIZIZ(60), null, 4, null), new GW0(awemeDraft, this));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LJLJJLL.LIZ());
        c145995oB.LIZ(2, "is_new_style");
        c145995oB.LJI("shoot_way", this.LJLJJLL.LJJJJI.shootWay);
        c145995oB.LIZ(this.LJLJJLL.LIZ.postPageModel.isDirectPublishByCC ? 1 : 0, "is_cc_direct_post");
        c145995oB.LIZ(this.LJLJJLL.LIZ.postPageModel.isFromCC, "is_from_cc");
        PublishFailureReason publishFailureReason = this.LJLILLLLZI.LIZIZ;
        if (publishFailureReason == null) {
            str = "null_cause";
        } else if (publishFailureReason.isServerException) {
            str = "api_error";
        } else {
            C41759GaB c41759GaB = publishFailureReason.cause;
            if (c41759GaB != null && c41759GaB.isCauseByNoSpaceLeft()) {
                str = "no_space_left";
            } else {
                C41759GaB c41759GaB2 = publishFailureReason.cause;
                if (c41759GaB2 != null && c41759GaB2.isUserNetworkBad()) {
                    str = "user_network_bad";
                } else {
                    str = "default";
                }
            }
        }
        c145995oB.LJI("reason", str);
        FMX.LJIIL("publish_retry_show", c145995oB.LIZ);
        if (C78685UuP.LJJJZ(this.LJLJJLL.LIZ.paidContentModel.getCollectionId())) {
            C188727au LIZJ = C78920UyC.LIZJ(0, "if_success");
            LIZJ.LJIIIZ("entry_point", this.LJLJJLL.LIZ.paidContentModel.getEntryPoint());
            LIZJ.LJIIIZ("collection_id", this.LJLJJLL.LIZ.paidContentModel.getCollectionId());
            LIZJ.LIZLLL(this.LJLJJLL.id, "item_id");
            FMX.LJIIL("show_series_video_upload_status_toast", LIZJ.LIZ);
        }
        this.LJLJJL.onShow();
    }

    @Override // X.GVB
    public final ActivityC45651qj getActivity() {
        return this.LJLIL;
    }

    @Override // X.GVB
    public final void setText(String str) {
        this.LJLJJL.setText(str);
    }

    @Override // X.GVB
    public final void LIZJ(boolean z, boolean z2) {
        this.LJLJJL.LIZ(z, z2);
    }

    public void LJ(boolean z, boolean z2) {
        String LIZJ;
        GVX.LJI = false;
        if (!this.LJLJJI && !z && !z2) {
            C268713r.LIZ().LIZ(C61878OQg.INSTANCE);
        }
        if (this.LJLJJL.LJLJL) {
            if (this.LJLJI) {
                C268713r.LIZ();
                C41958GdO.LJIILJJIL(this.LJLJJLL.LIZJ());
            } else if (!z) {
                C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZIZ();
            }
            if (!this.LJLJJI && !z2 && (LIZJ = this.LJLJJLL.LIZJ()) != null) {
                C43157Gwj.LJIIIIZZ(LIZJ);
            }
            C41732GZk.LIZ();
            H78.LJI("Publish | remove recover path by dismiss panel");
        }
        C41639GVv c41639GVv = this.LJLJLJ;
        if (c41639GVv != null) {
            C60903NvH.LJIIJJI().LJJJI().LIZ().unregisterListener(c41639GVv);
        }
        this.LJLJLJ = null;
    }

    public C41642GVy(ActivityC45651qj fragmentActivity, C41474GPm c41474GPm, boolean z) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        this.LJLIL = fragmentActivity;
        this.LJLILLLLZI = c41474GPm;
        this.LJLJI = z;
        GWE gwe = new GWE(fragmentActivity);
        FFL.LJIIIZ().getClass();
        gwe.setDurationTime(FFL.LJIIJ(31744, 10, "tool_enable_upload_recover_panel_to_push_duration", true));
        this.LJLJJL = gwe;
        AwemeDraft awemeDraft = c41474GPm.LIZ;
        this.LJLJJLL = awemeDraft;
        String LIZJ = awemeDraft.LIZJ();
        if (LIZJ != null && !z) {
            GW2 gw2 = new GW2(fragmentActivity, LIZJ);
            this.LJLJL = gw2;
            gw2.LIZJ = gw2.LIZLLL.submit(CallableC41376GLs.LJLIL);
        }
        C41639GVv c41639GVv = new C41639GVv(this);
        this.LJLJLJ = c41639GVv;
        C60903NvH.LJIIJJI().LJJJI().LIZ().registerListener(c41639GVv);
        gwe.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS42S0200000_7(gwe, new AqS157S0100000_7(this, 300), 10)));
        gwe.setDismissListener(new AqS189S0100000_7(this, 18));
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 301);
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(aqS157S0100000_7, 54), gwe.LJLILLLLZI);
    }
}
