package X;

import Y.ARunnableS29S0200000_10;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BottomBanner;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ncv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59765Ncv extends ViewOnClickListenerC59767Ncx {
    public final LinearLayout LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public ARunnableS29S0200000_10 LJLLI;

    @Override // X.ViewOnClickListenerC59767Ncx, X.YGF
    public final void LJI() {
        C16880lQ.LJIIZILJ(this.LJLJL, this);
        C16880lQ.LJIJI(LJIIJ(), this);
    }

    public C59765Ncv(LinearLayout linearLayout) {
        super(linearLayout);
        this.LJLJL = linearLayout;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 488));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 487));
        this.LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 489));
    }

    @Override // X.YGF
    public final void LIZ(boolean z) {
        int i;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Aweme aweme;
        AwemeRawAd awemeRawAd3;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        ViewGroup.LayoutParams layoutParams = this.LJLJL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 < 0) {
            C59894Nf0.LIZIZ(this.LJLJL, i2, 0, 300).start();
        }
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(KL2.LIZJ(LJIIJ().getContext(), 2.0f));
            gradientDrawable.setColor(C78609UtB.LJJJ(R.attr.dw, LJIIJ().getContext()));
            Aweme aweme2 = this.LJLJJL;
            if (aweme2 != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null && (nativeAuthorInfo = awemeRawAd3.getNativeAuthorInfo()) != null && (bottomBanner = nativeAuthorInfo.getBottomBanner()) != null) {
                i = bottomBanner.getShowButtonColorSeconds();
            } else {
                i = 3;
            }
            if (this.LJLLI == null) {
                this.LJLLI = new ARunnableS29S0200000_10(this, gradientDrawable, 54);
            }
            LJIIJ().postDelayed(this.LJLLI, TimeUnit.SECONDS.toMillis(i) + 300);
            Aweme aweme3 = this.LJLJJL;
            AwemeRawAd awemeRawAd4 = null;
            if (aweme3 != null) {
                awemeRawAd = aweme3.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C55707Ltf c55707Ltf = new C55707Ltf();
            c55707Ltf.LIZ = awemeRawAd;
            JSONObject LIZ = c55707Ltf.LIZ();
            o.LJIIIIZZ(LIZ, "ExtraJsonBuilder()\n     …                .create()");
            if (awemeRawAd != null) {
                C58776N4y.LIZ("homepage_ad", "button_show", LIZ, awemeRawAd);
            }
            Aweme aweme4 = this.LJLJJL;
            if (aweme4 != null) {
                awemeRawAd2 = aweme4.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C58704N2e.LIZLLL("homepage_ad", "button_show", awemeRawAd2).LJII();
            Aweme aweme5 = this.LJLJJL;
            if ((aweme5 != null && C63081OpJ.LJJLJ(aweme5)) || ((aweme = this.LJLJJL) != null && C63081OpJ.LJJLJLI(aweme))) {
                Aweme aweme6 = this.LJLJJL;
                if (aweme6 != null) {
                    awemeRawAd4 = aweme6.getAwemeRawAd();
                }
                C58704N2e.LIZLLL("homepage_ad", "profile_banner_show", awemeRawAd4).LJI();
            }
        }
    }

    @Override // X.YGF
    public final void LJFF(int i) {
        ViewGroup.LayoutParams layoutParams = this.LJLJL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i2 = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i2 >= 0) {
            LinearLayout linearLayout = this.LJLJL;
            C59894Nf0.LIZIZ(linearLayout, i2, -(linearLayout.getMeasuredHeight() + 1), i).start();
        }
        if (i > 0) {
            LJIIJ().setBackgroundResource(R.drawable.bvu);
        } else {
            LJIIJ().setBackgroundResource(R.drawable.bvt);
        }
        LJIIJ().removeCallbacks(this.LJLLI);
    }

    @Override // X.ViewOnClickListenerC59767Ncx, X.YGF
    public final void LJII(C59771Nd1 c59771Nd1) {
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        String recommendText;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        User author;
        UrlModel avatarLarger;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        NativeAuthorInfo nativeAuthorInfo2;
        BottomBanner bottomBanner2;
        User author2;
        AwemeRawAd awemeRawAd6;
        this.LJLJJL = c59771Nd1.LIZIZ;
        this.LJLJJI = c59771Nd1.LIZ;
        this.LJLJJLL = c59771Nd1.LIZJ;
        LJIIJ().setText(C78926UyI.LJIIL(this.LJLJJI, this.LJLJJL, false));
        LJIIJ().setBackgroundResource(R.drawable.bvt);
        TextView textView = (TextView) this.LJLL.getValue();
        Aweme aweme = this.LJLJJL;
        String str3 = null;
        if (aweme != null && (awemeRawAd6 = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd6.getHomepageBottomTextual();
        } else {
            str = null;
        }
        textView.setText(str);
        Aweme aweme2 = this.LJLJJL;
        if (aweme2 != null && (awemeRawAd5 = aweme2.getAwemeRawAd()) != null && (nativeAuthorInfo2 = awemeRawAd5.getNativeAuthorInfo()) != null && (bottomBanner2 = nativeAuthorInfo2.getBottomBanner()) != null && bottomBanner2.getNeedUseAuthorNickName()) {
            Aweme aweme3 = this.LJLJJL;
            if (aweme3 != null && (author2 = aweme3.getAuthor()) != null) {
                recommendText = author2.getNickname();
            }
            recommendText = null;
        } else {
            Aweme aweme4 = this.LJLJJL;
            if (aweme4 != null && (awemeRawAd3 = aweme4.getAwemeRawAd()) != null) {
                str2 = awemeRawAd3.getType();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str2, "app")) {
                Aweme aweme5 = this.LJLJJL;
                if (aweme5 != null && (awemeRawAd2 = aweme5.getAwemeRawAd()) != null) {
                    recommendText = awemeRawAd2.getAppName();
                }
                recommendText = null;
            } else {
                Aweme aweme6 = this.LJLJJL;
                if (aweme6 != null && (awemeRawAd = aweme6.getAwemeRawAd()) != null && (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) != null && (bottomBanner = nativeAuthorInfo.getBottomBanner()) != null) {
                    recommendText = bottomBanner.getRecommendText();
                }
                recommendText = null;
            }
        }
        TextView textView2 = (TextView) this.LJLJLJ.getValue();
        TextView appNameTextView = (TextView) this.LJLJLJ.getValue();
        o.LJIIIIZZ(appNameTextView, "appNameTextView");
        textView2.setText(LJIIJJI(recommendText, appNameTextView, KL2.LJIIJJI(this.LJLJJI) - KL2.LIZJ(this.LJLJJI, 176.0f)));
        TextView LJIIJ = LJIIJ();
        Aweme aweme7 = this.LJLJJL;
        if (aweme7 != null && (awemeRawAd4 = aweme7.getAwemeRawAd()) != null) {
            str3 = awemeRawAd4.getButtonText();
        }
        LJIIJ.setText(LJIIJJI(str3, LJIIJ(), KL2.LIZJ(this.LJLJJI, 66.0f)));
        Aweme aweme8 = this.LJLJJL;
        if (aweme8 == null || (author = aweme8.getAuthor()) == null) {
            return;
        }
        if (author.getAvatarMedium() != null) {
            avatarLarger = author.getAvatarMedium();
        } else if (author.getAvatarThumb() != null) {
            avatarLarger = author.getAvatarThumb();
        } else if (author.getAvatarLarger() == null) {
            return;
        } else {
            avatarLarger = author.getAvatarLarger();
        }
        if (avatarLarger == null) {
            return;
        }
        W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(avatarLarger.getUrlList()));
        LJIIIZ.LJJIIJ = (SmartImageView) this.LJLJLLL.getValue();
        C16880lQ.LLJJJ(LJIIIZ);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C43659HBn c43659HBn;
        if (view != null) {
            int id = view.getId();
            if ((id == R.id.hx2 || id == R.id.hx0 || id == R.id.hx1 || id == R.id.ql || id == R.id.qk) && (c43659HBn = this.LJLJJLL) != null) {
                c43659HBn.LJJII();
            }
        }
    }

    public static String LJIIJJI(String str, TextView textView, float f) {
        if (str == null) {
            return null;
        }
        TextPaint paint = textView.getPaint();
        if (paint.measureText(str) <= f) {
            return str;
        }
        textView.setText(str);
        CharSequence localString = textView.getText();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) localString);
        LIZ.append("...");
        String LIZIZ = X1D.LIZIZ(LIZ);
        while (paint.measureText(LIZIZ) > f) {
            o.LJIIIIZZ(localString, "localString");
            if (localString.length() <= 0) {
                break;
            }
            localString = localString.subSequence(0, localString.length() - 1);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((Object) localString);
            LIZ2.append("...");
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        return LIZIZ;
    }
}
