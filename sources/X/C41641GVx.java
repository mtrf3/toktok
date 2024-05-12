package X;

import Y.ACListenerS27S0100000_7;
import Y.ARunnableS26S0200000_7;
import Y.IDLListenerS8S0300000_7;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GVx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41641GVx implements GWH {
    public final ActivityC45651qj LJLIL;
    public final C41474GPm LJLILLLLZI;
    public final GVB LJLJI;
    public final View LJLJJI;
    public final boolean LJLJJL;
    public final PublishFailMsg LJLJJLL;
    public ImageView LJLJL;
    public ImageView LJLJLJ;
    public TuxTextView LJLJLLL;
    public ImageView LJLL;
    public C41640GVw LJLLI;
    public TextView LJLLILLLL;
    public View LJLLJ;
    public boolean LJLLL;
    public GW2 LJLLLL;
    public final boolean LJLLLLLL;
    public boolean LJLZ;
    public final AwemeDraft LJZ;

    public final void LIZIZ() {
        this.LJLZ = true;
        GVB gvb = this.LJLJI;
        o.LJII(gvb, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.UploadRecoverPopView");
        ((GWG) gvb).LJLL = true;
        this.LJLJI.LIZJ(false, false);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("action_type", "publish");
        c145995oB.LJI("creation_id", this.LJZ.LIZ());
        c145995oB.LIZ(this.LJLLLLLL ? 1 : 0, "is_new_style");
        c145995oB.LJI("enter_from", "toast");
        if (this.LJLLL) {
            c145995oB.LIZLLL("enter_method", "click_retry");
        }
        FMX.LJIIL("publish_retry", c145995oB.LIZ);
        if (this.LJLLLLLL) {
            GVX.LIZJ = true;
            C268713r.LIZ().LIZLLL(this.LJLIL, this.LJZ, this.LJLILLLLZI.LIZIZ);
            GW2 gw2 = this.LJLLLL;
            if (gw2 != null) {
                gw2.LIZLLL.execute(new ARunnableS26S0200000_7(this.LJLILLLLZI.LIZIZ, gw2, 29));
                return;
            }
            return;
        }
        GVX.LJFF = true;
        C268713r.LIZ().LIZLLL(this.LJLIL, this.LJZ, this.LJLILLLLZI.LIZIZ);
        GW2 gw22 = this.LJLLLL;
        if (gw22 == null) {
            return;
        }
        gw22.LIZLLL.execute(new ARunnableS26S0200000_7(this.LJLILLLLZI.LIZIZ, gw22, 28));
    }

    @Override // X.GWH
    public final void onShow() {
        String str;
        TextView textView;
        int i;
        List<SingleImageData> imageList;
        this.LJLLL = false;
        AwemeDraft awemeDraft = this.LJZ;
        GW3 gw3 = new GW3(this);
        o.LJIIIZ(awemeDraft, "<this>");
        C41802Gas.LJIIIIZZ(awemeDraft, null, gw3);
        if (this.LJZ.LJIIIZ() && !this.LJZ.LJIIJ()) {
            if (this.LJZ.LJIIJ()) {
                ImageAlbumData imageAlbumData = this.LJZ.LJJJJI.imageAlbumData;
                if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                    i = imageList.size();
                } else {
                    i = 1;
                }
                TextView textView2 = this.LJLLILLLL;
                if (textView2 != null) {
                    textView2.setText(this.LJLIL.getResources().getQuantityString(R.plurals.gf, i));
                }
            } else {
                TextView textView3 = this.LJLLILLLL;
                if (textView3 != null) {
                    textView3.setText(this.LJLIL.getString(R.string.dwj));
                }
            }
        }
        if (C41802Gas.LJII(this.LJZ) && (textView = this.LJLLILLLL) != null) {
            textView.setText(this.LJLIL.getString(R.string.j67));
        }
        if (!this.LJLLLLLL) {
            ImageView imageView = this.LJLL;
            o.LJI(imageView);
            C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, 161));
        }
        this.LJLLI = new C41640GVw(this);
        GNI LIZ = C60903NvH.LJIIJJI().LJJJI().LIZ();
        C41640GVw c41640GVw = this.LJLLI;
        o.LJI(c41640GVw);
        LIZ.registerListener(c41640GVw);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LJZ.LIZ());
        c145995oB.LIZ(this.LJLLLLLL ? 1 : 0, "is_new_style");
        c145995oB.LJI("shoot_way", this.LJZ.LJJJJI.shootWay);
        c145995oB.LIZ(this.LJZ.LIZ.postPageModel.isDirectPublishByCC ? 1 : 0, "is_cc_direct_post");
        c145995oB.LIZ(this.LJZ.LIZ.postPageModel.isFromCC, "is_from_cc");
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
        c145995oB.LIZ(this.LJLJJLL.ccNotAllowDirectPost ? 1 : 0, "cc_not_allow_direct_post");
        FMX.LJIIL("publish_retry_show", c145995oB.LIZ);
    }

    @Override // X.GWH
    public final void setText(String str) {
        TextView textView = this.LJLLILLLL;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // X.GWH
    public final void LIZ(boolean z, boolean z2) {
        if (this.LJLJI.isShowing()) {
            if (this.LJLJJL) {
                C268713r.LIZ();
                C41958GdO.LJIILJJIL(this.LJZ.LIZJ());
            } else if (!z) {
                C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZIZ();
            }
            if (!this.LJLZ && !z2) {
                String LIZJ = this.LJZ.LIZJ();
                o.LJI(LIZJ);
                C43157Gwj.LJIIIIZZ(LIZJ);
            }
            C41732GZk.LIZ();
            H78.LJI("Publish | remove recover path by dismiss panel");
        }
        if (this.LJLLI != null) {
            GNI LIZ = C60903NvH.LJIIJJI().LJJJI().LIZ();
            C41640GVw c41640GVw = this.LJLLI;
            o.LJI(c41640GVw);
            LIZ.unregisterListener(c41640GVw);
            this.LJLLI = null;
        }
    }

    public C41641GVx(ActivityC45651qj mFragmentActivity, C41474GPm creationBundle, GVB host, View view, boolean z, PublishFailMsg publishFailMsg) {
        boolean z2;
        TuxTextView tuxTextView;
        o.LJIIIZ(mFragmentActivity, "mFragmentActivity");
        o.LJIIIZ(creationBundle, "creationBundle");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(publishFailMsg, "publishFailMsg");
        this.LJLIL = mFragmentActivity;
        this.LJLILLLLZI = creationBundle;
        this.LJLJI = host;
        this.LJLJJI = view;
        this.LJLJJL = z;
        this.LJLJJLL = publishFailMsg;
        if ((host instanceof GWG) && ((GWG) host).LJFF()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLLLLLL = z2;
        AwemeDraft awemeDraft = creationBundle.LIZ;
        this.LJZ = awemeDraft;
        View findViewById = view.findViewById(R.id.f12);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.LJLJL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f0h);
        o.LJII(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.LJLJLJ = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mo5);
        o.LJII(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.LJLLILLLL = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mo6);
        if (findViewById4 instanceof TuxTextView) {
            tuxTextView = (TuxTextView) findViewById4;
        } else {
            tuxTextView = null;
        }
        this.LJLJLLL = tuxTextView;
        if (C78685UuP.LJJJZ(publishFailMsg.publishFailedString)) {
            TextView textView = this.LJLLILLLL;
            if (textView != null) {
                textView.setText(publishFailMsg.publishFailedString);
            }
            TuxTextView tuxTextView2 = this.LJLJLLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            TuxTextView tuxTextView3 = this.LJLJLLL;
            if (tuxTextView3 != null) {
                C1DG.LJI(view, R.string.hi_, tuxTextView3);
            }
        }
        ImageView imageView = this.LJLJLJ;
        if (imageView != null) {
            C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, 159));
        }
        if (!z2) {
            view.findViewById(R.id.ec_).setVisibility(8);
            this.LJLLJ = view.findViewById(R.id.l95);
            View findViewById5 = view.findViewById(R.id.mfm);
            o.LJII(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            findViewById5.setVisibility(8);
            View findViewById6 = view.findViewById(R.id.f9p);
            o.LJII(findViewById6, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) findViewById6;
            this.LJLL = imageView2;
            imageView2.setVisibility(0);
        }
        o.LJIIIIZZ(view.findViewById(R.id.mq8), "view.findViewById(R.id.tv_video_count)");
        if (!z) {
            String LIZJ = awemeDraft.LIZJ();
            o.LJI(LIZJ);
            GW2 gw2 = new GW2(mFragmentActivity, LIZJ);
            this.LJLLLL = gw2;
            gw2.LIZJ = gw2.LIZLLL.submit(CallableC41376GLs.LJLIL);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS8S0300000_7(relativeLayout, this, view, 1));
    }
}
