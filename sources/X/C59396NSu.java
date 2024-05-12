package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NSu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59396NSu extends AbstractViewOnClickListenerC59394NSs {
    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZJ() {
        String str;
        OmVast omVast;
        C59255NNj c59255NNj;
        AwemeSplashInfo splashInfo;
        String str2;
        View LIZ = LIZ(R.layout.bjt, this.LJLIL);
        View findViewById = LIZ.findViewById(R.id.qr);
        o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.ad_desc)");
        T5A t5a = (T5A) findViewById;
        if (!TextUtils.isEmpty(this.LJLJI.getDesc())) {
            t5a.setText(this.LJLJI.getDesc());
            AwemeRawAd awemeRawAd = this.LJLJI.getAwemeRawAd();
            if (awemeRawAd != null) {
                str2 = awemeRawAd.getAdMoreTextual();
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                AwemeRawAd awemeRawAd2 = this.LJLJI.getAwemeRawAd();
                o.LJI(awemeRawAd2);
                String adMoreTextual = awemeRawAd2.getAdMoreTextual();
                o.LJI(adMoreTextual);
                t5a.setMoreString(adMoreTextual);
            }
        }
        t5a.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        View findViewById2 = LIZ.findViewById(R.id.rx);
        o.LJIIIIZZ(findViewById2, "layout.findViewById(R.id.ad_icon)");
        C62846OlW c62846OlW = (C62846OlW) findViewById2;
        AwemeRawAd awemeRawAd3 = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd3 != null && (splashInfo = awemeRawAd3.getSplashInfo()) != null && splashInfo.getSplashFeedType() == 2) {
            V92 hierarchy = c62846OlW.getHierarchy();
            V8L v8l = new V8L();
            v8l.LIZIZ = true;
            hierarchy.LJIL(v8l);
        }
        if (this.LJLJI.getAuthor() == null || this.LJLJI.getAuthor().getAvatarMedium() == null) {
            C78765Uvh.LJIIIIZZ(c62846OlW, C78769Uvl.LIZ(R.drawable.b0p));
        } else {
            C78765Uvh.LJFF(c62846OlW, this.LJLJI.getAuthor().getAvatarMedium());
        }
        C16880lQ.LJJJJJL(c62846OlW, this);
        if (this.LJLJI.getAwemeRawAd() == null) {
            return;
        }
        View findViewById3 = LIZ.findViewById(R.id.sv);
        o.LJIIIIZZ(findViewById3, "layout.findViewById(R.id.ad_name)");
        TextView textView = (TextView) findViewById3;
        if (NN2.LIZ(this.LJLJI)) {
            AwemeRawAd awemeRawAd4 = this.LJLJI.getAwemeRawAd();
            if (awemeRawAd4 == null || (omVast = awemeRawAd4.getOmVast()) == null || (c59255NNj = omVast.vast) == null || (str = c59255NNj.adTitle) == null) {
                str = "";
            }
            textView.setText(str);
        } else {
            textView.setText(this.LJLJI.getAuthor().getNickname());
        }
        C16880lQ.LJIJI(textView, this);
    }

    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZLLL(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.qr) {
            this.LJLJJI.LIZ(12);
        } else if (valueOf.intValue() == R.id.rx) {
            this.LJLJJI.LIZ(11);
        } else {
            if (valueOf.intValue() != R.id.sv) {
                return;
            }
            this.LJLJJI.LIZ(14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59396NSu(LinearLayout feedAdLayout, NQD nqd) {
        super(feedAdLayout, nqd);
        o.LJIIIZ(feedAdLayout, "feedAdLayout");
    }
}
