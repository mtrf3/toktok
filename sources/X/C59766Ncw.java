package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ncw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59766Ncw extends ViewOnClickListenerC59767Ncx {
    public final LinearLayout LJLJL;
    public final C62822Ol8 LJLJLJ;

    public C59766Ncw(LinearLayout linearLayout) {
        super(linearLayout);
        this.LJLJL = linearLayout;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 490));
    }

    @Override // X.YGF
    public final void LIZ(boolean z) {
        AwemeRawAd awemeRawAd;
        ViewGroup.LayoutParams layoutParams = this.LJLJL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i = ((RelativeLayout.LayoutParams) layoutParams).bottomMargin;
        if (i < 0) {
            C59894Nf0.LIZIZ(this.LJLJL, i, 0, 300).start();
        }
        if (z) {
            Aweme aweme = this.LJLJJL;
            AwemeRawAd awemeRawAd2 = null;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
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
            Aweme aweme2 = this.LJLJJL;
            if (aweme2 != null) {
                awemeRawAd2 = aweme2.getAwemeRawAd();
            }
            C58704N2e.LIZLLL("homepage_ad", "button_show", awemeRawAd2).LJII();
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
    }

    @Override // X.ViewOnClickListenerC59767Ncx, X.YGF
    public final void LJII(C59771Nd1 c59771Nd1) {
        String str;
        AwemeRawAd awemeRawAd;
        super.LJII(c59771Nd1);
        Aweme aweme = this.LJLJJL;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getHomepageBottomTextual();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            ((TextView) this.LJLJLJ.getValue()).setText(str);
        }
        if (C90193gN.LIZ()) {
            ((TextView) this.LJLJLJ.getValue()).setGravity(21);
        }
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
        if ((valueOf.intValue() != R.id.qk && valueOf.intValue() != R.id.ql) || (c43659HBn = this.LJLJJLL) == null) {
            return;
        }
        c43659HBn.LJJII();
    }
}
