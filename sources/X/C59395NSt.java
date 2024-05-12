package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.NSt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59395NSt extends AbstractViewOnClickListenerC59394NSs {
    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZJ() {
        String str;
        String str2;
        String str3;
        Float f;
        String[] appCategory;
        Float f2;
        OmVast omVast;
        C59255NNj c59255NNj;
        OmVast omVast2;
        C59255NNj c59255NNj2;
        String str4;
        View LIZ = LIZ(R.layout.bjs, this.LJLIL);
        View findViewById = LIZ.findViewById(R.id.qr);
        o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.ad_desc)");
        T5A t5a = (T5A) findViewById;
        Float f3 = null;
        if (!TextUtils.isEmpty(this.LJLJI.getDesc())) {
            t5a.setText(this.LJLJI.getDesc());
            AwemeRawAd awemeRawAd = this.LJLJI.getAwemeRawAd();
            if (awemeRawAd != null) {
                str4 = awemeRawAd.getAdMoreTextual();
            } else {
                str4 = null;
            }
            if (!TextUtils.isEmpty(str4)) {
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
        String str5 = "";
        if (NN2.LIZ(this.LJLJI)) {
            AwemeRawAd awemeRawAd3 = this.LJLJI.getAwemeRawAd();
            if (awemeRawAd3 != null && (omVast = awemeRawAd3.getOmVast()) != null && (c59255NNj = omVast.vast) != null && c59255NNj.adTitle != null) {
                AwemeRawAd awemeRawAd4 = this.LJLJI.getAwemeRawAd();
                str5 = (awemeRawAd4 == null || (omVast2 = awemeRawAd4.getOmVast()) == null || (c59255NNj2 = omVast2.vast) == null) ? null : c59255NNj2.adTitle;
            }
            textView.setText(str5);
        } else {
            if (this.LJLJI.getAuthor() != null) {
                str5 = this.LJLJI.getAuthor().getNickname();
            }
            textView.setText(str5);
        }
        C16880lQ.LJIJI(textView, this);
        View findViewById4 = LIZ.findViewById(R.id.sn);
        o.LJIIIIZZ(findViewById4, "layout.findViewById(R.id.ad_like_layout)");
        LinearLayout linearLayout = (LinearLayout) findViewById4;
        View findViewById5 = LIZ.findViewById(R.id.tt);
        o.LJIIIIZZ(findViewById5, "layout.findViewById(R.id.ad_rating_view)");
        C227098vh c227098vh = (C227098vh) findViewById5;
        View findViewById6 = LIZ.findViewById(R.id.q6);
        o.LJIIIIZZ(findViewById6, "layout.findViewById(R.id.ad_app_use_number)");
        TextView textView2 = (TextView) findViewById6;
        View findViewById7 = LIZ.findViewById(R.id.sm);
        o.LJIIIIZZ(findViewById7, "layout.findViewById(R.id.ad_like_divide)");
        AwemeRawAd awemeRawAd5 = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd5 != null) {
            str = awemeRawAd5.getAppInstall();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            AwemeRawAd awemeRawAd6 = this.LJLJI.getAwemeRawAd();
            if (awemeRawAd6 != null) {
                f2 = Float.valueOf(awemeRawAd6.getAppLike());
            } else {
                f2 = null;
            }
            o.LJI(f2);
            if (f2.floatValue() < 4.0f) {
                linearLayout.setVisibility(8);
            }
        }
        AwemeRawAd awemeRawAd7 = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd7 != null) {
            str2 = awemeRawAd7.getAppInstall();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            textView2.setVisibility(8);
            findViewById7.setVisibility(8);
        } else {
            AwemeRawAd awemeRawAd8 = this.LJLJI.getAwemeRawAd();
            if (awemeRawAd8 != null) {
                str3 = awemeRawAd8.getAppInstall();
            } else {
                str3 = null;
            }
            textView2.setText(str3);
        }
        AwemeRawAd awemeRawAd9 = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd9 != null) {
            f = Float.valueOf(awemeRawAd9.getAppLike());
        } else {
            f = null;
        }
        o.LJI(f);
        c227098vh.setRatingProgress(f.floatValue());
        AwemeRawAd awemeRawAd10 = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd10 != null) {
            f3 = Float.valueOf(awemeRawAd10.getAppLike());
        }
        o.LJI(f3);
        if (f3.floatValue() < 4.0f) {
            c227098vh.setVisibility(8);
            findViewById7.setVisibility(8);
        }
        C16880lQ.LJIIZILJ(linearLayout, this);
        AwemeRawAd awemeRawAd11 = this.LJLJI.getAwemeRawAd();
        if (awemeRawAd11 != null && (appCategory = awemeRawAd11.getAppCategory()) != null) {
            View findViewById8 = LIZ.findViewById(R.id.uc);
            o.LJIIIIZZ(findViewById8, "layout.findViewById(R.id.ad_tag_layout)");
            C5LA c5la = (C5LA) findViewById8;
            if (appCategory.length == 0) {
                c5la.setVisibility(8);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str6 : appCategory) {
                    if (str6.length() <= 6) {
                        arrayList.add(str6);
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                o.LJIIIIZZ(array, "strings.toArray(arrayOf<String>())");
                c5la.setTagList((String[]) array);
            }
            c5la.setOnClickListener(new ViewOnClickListenerC13880ga(this));
        }
    }

    @Override // X.AbstractViewOnClickListenerC59394NSs
    public final void LIZLLL(View view) {
        Integer valueOf;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.qr) {
            this.LJLJJI.LIZ(12);
            return;
        }
        if (valueOf.intValue() == R.id.rx) {
            this.LJLJJI.LIZ(11);
            return;
        }
        if (valueOf.intValue() == R.id.sv) {
            this.LJLJJI.LIZ(14);
        } else if (valueOf.intValue() == R.id.sn) {
            this.LJLJJI.LIZ(13);
        } else {
            if (valueOf.intValue() != R.id.uc) {
                return;
            }
            this.LJLJJI.LIZ(15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59395NSt(LinearLayout feedAdLayout, NQD nqd) {
        super(feedAdLayout, nqd);
        o.LJIIIZ(feedAdLayout, "feedAdLayout");
    }
}
