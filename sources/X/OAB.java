package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CallToActionBarInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OAB extends ViewOnClickListenerC59767Ncx {
    public final LinearLayout LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    public OAB(LinearLayout linearLayout) {
        super(linearLayout);
        this.LJLJL = linearLayout;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 486));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 485));
    }

    @Override // X.YGF
    public final void LIZ(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.LJLJL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i < 0) {
            C59894Nf0.LIZIZ(this.LJLJL, i, 60, 300).start();
        }
    }

    @Override // X.YGF
    public final void LJFF(int i) {
        ViewGroup.LayoutParams layoutParams = this.LJLJL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 >= 0) {
            LinearLayout linearLayout = this.LJLJL;
            C59894Nf0.LIZIZ(linearLayout, i2, -(linearLayout.getMeasuredHeight() + 61), i).start();
        }
    }

    @Override // X.ViewOnClickListenerC59767Ncx, X.YGF
    public final void LJII(C59771Nd1 c59771Nd1) {
        String str;
        String str2;
        UrlModel urlModel;
        W5O[] LJIIJ;
        User author;
        AwemeRawAd awemeRawAd;
        CallToActionBarInfo callToActionBarInfo;
        AwemeRawAd awemeRawAd2;
        CallToActionBarInfo callToActionBarInfo2;
        super.LJII(c59771Nd1);
        TextView textView = (TextView) this.LJLJLJ.getValue();
        Aweme aweme = this.LJLJJL;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (callToActionBarInfo2 = awemeRawAd2.getCallToActionBarInfo()) != null) {
            str = callToActionBarInfo2.getText();
        } else {
            str = null;
        }
        textView.setText(str);
        TextView LJIIJ2 = LJIIJ();
        Aweme aweme2 = this.LJLJJL;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && (callToActionBarInfo = awemeRawAd.getCallToActionBarInfo()) != null) {
            str2 = callToActionBarInfo.getButtonText();
        } else {
            str2 = null;
        }
        LJIIJ2.setText(str2);
        Context context = this.LJLJJI;
        if (context != null) {
            LJIIJ().setBackground(C04270Et.LIZIZ(context, R.drawable.bta));
        }
        VA9 va9 = (VA9) this.LJLJLLL.getValue();
        Aweme aweme3 = this.LJLJJL;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            urlModel = author.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (va9 == null || urlModel == null || va9.getContext() == null || (LJIIJ = C78765Uvh.LJIIJ(urlModel, null, W92.MEDIUM, null, Bitmap.Config.RGB_565)) == null || LJIIJ.length <= 0) {
            return;
        }
        va9.getContext();
        C81690W4g c81690W4g = new C81690W4g(null);
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LJIIL = va9.getController();
        LIZJ.LJFF(true, LJIIJ);
        LIZJ.LJII = new W4Y(c81690W4g, null);
        va9.setController(LIZJ.LIZ());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        C43659HBn c43659HBn;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.qj) {
            C43659HBn c43659HBn2 = this.LJLJJLL;
            if (c43659HBn2 != null) {
                c43659HBn2.LJJIII();
            }
            LJFF(300);
            return;
        }
        if (valueOf.intValue() != R.id.ql || (c43659HBn = this.LJLJJLL) == null) {
            return;
        }
        c43659HBn.LJJII();
    }
}
