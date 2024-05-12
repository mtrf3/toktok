package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class NT7 extends FrameLayout implements C7OY {
    public final Context LJLIL;
    public View LJLILLLLZI;
    public TextView LJLJI;
    public TextView LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public ImageView LJLJL;
    public NT8 LJLJLJ;
    public Aweme LJLJLLL;
    public AwemeRawAd LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;

    public final boolean getInDownloadMode() {
        return ORY.LJJIJIIJIL(this.LJLJLJ, new NT8[]{NT8.DOWNLOADING, NT8.INSTALL, NT8.INSTALLED});
    }

    public abstract int getLayoutId$commercialize_feed_impl_release();

    public abstract void setLabelVisibility$commercialize_feed_impl_release(int i);

    static {
        C16880lQ.LJLLJ(NT7.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r1.equals("counsel") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        r1 = getContext().getString(com.zhiliaoapp.musically.R.string.b9s);
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "context.getString(R.string.ad_web_text_default)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r1.equals("web") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r1.equals("app") == false) goto L15;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x001f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getButtonText() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.LJLL
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.getButtonText()
            if (r1 == 0) goto L11
            int r0 = r1.length()
            if (r0 <= 0) goto L11
            return r1
        L11:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.LJLL
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.getType()
            if (r1 == 0) goto L22
            int r0 = r1.hashCode()
            switch(r0) {
                case -1354573786: goto L9f;
                case 96801: goto L85;
                case 117588: goto L7c;
                case 3148996: goto L62;
                case 106642798: goto L48;
                case 957829685: goto L3f;
                case 1893962841: goto L25;
                default: goto L22;
            }
        L22:
            java.lang.String r1 = ""
        L24:
            return r1
        L25:
            java.lang.String r0 = "redpacket"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            goto L22
        L2e:
            android.content.Context r1 = r2.getContext()
            r0 = 2131823180(0x7f110a4c, float:1.9279152E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "context.getString(R.stri…_red_packet_text_default)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L24
        L3f:
            java.lang.String r0 = "counsel"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8e
            goto L22
        L48:
            java.lang.String r0 = "phone"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L51
            goto L22
        L51:
            android.content.Context r1 = r2.getContext()
            r0 = 2131823176(0x7f110a48, float:1.9279144E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "context.getString(R.string.ad_phone_title_default)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L24
        L62:
            java.lang.String r0 = "form"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6b
            goto L22
        L6b:
            android.content.Context r1 = r2.getContext()
            r0 = 2131823161(0x7f110a39, float:1.9279114E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "context.getString(R.string.ad_form_title_default)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L24
        L7c:
            java.lang.String r0 = "web"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8e
            goto L22
        L85:
            java.lang.String r0 = "app"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8e
            goto L22
        L8e:
            android.content.Context r1 = r2.getContext()
            r0 = 2131823188(0x7f110a54, float:1.9279169E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "context.getString(R.string.ad_web_text_default)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L24
        L9f:
            java.lang.String r0 = "coupon"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La9
            goto L22
        La9:
            android.content.Context r1 = r2.getContext()
            r0 = 2131823159(0x7f110a37, float:1.927911E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "context.getString(R.string.ad_coupon_text_default)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NT7.getButtonText():java.lang.String");
    }

    private final long getColorChangeSeconds() {
        AwemeRawAd awemeRawAd = this.LJLL;
        int i = 0;
        if (awemeRawAd != null && awemeRawAd.getAnimationType() == 3) {
            long showSeconds = getShowSeconds();
            AwemeRawAd awemeRawAd2 = this.LJLL;
            if (awemeRawAd2 != null) {
                i = awemeRawAd2.getShowButtonColorSeconds();
            }
            return Math.max(showSeconds, i * 1000);
        }
        return getShowSeconds();
    }

    public final void LJIIJ() {
        View view = this.LJLJJL;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            view2.clearAnimation();
        }
        View view3 = this.LJLJJL;
        if (view3 != null) {
            view3.setBackgroundDrawable(null);
        }
        View view4 = this.LJLJJLL;
        if (view4 != null) {
            view4.setBackgroundDrawable(null);
        }
    }

    public final int getBackGroundColor() {
        int i = this.LJLLILLLL;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    public final int getBgColor() {
        String learnMoreBgColor;
        AwemeRawAd awemeRawAd = this.LJLL;
        if (awemeRawAd != null && (learnMoreBgColor = awemeRawAd.getLearnMoreBgColor()) != null && learnMoreBgColor.length() > 0) {
            return ColorProtector.parseColor(learnMoreBgColor);
        }
        return C78609UtB.LJJJ(R.attr.eb, this.LJLIL);
    }

    private final long getShowSeconds() {
        int i;
        if (getInDownloadMode()) {
            return 0L;
        }
        AwemeRawAd awemeRawAd = this.LJLL;
        if (awemeRawAd != null) {
            i = awemeRawAd.getShowButtonSeconds();
        } else {
            i = 0;
        }
        return i * 1000;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AwemeRawAd awemeRawAd;
        String downloadUrl;
        LJIIJ();
        String str = null;
        removeCallbacks(null);
        removeCallbacks(null);
        AwemeRawAd awemeRawAd2 = this.LJLL;
        if (awemeRawAd2 != null) {
            str = awemeRawAd2.getType();
        }
        if (o.LJ(str, "app") && (awemeRawAd = this.LJLL) != null && (downloadUrl = awemeRawAd.getDownloadUrl()) != null) {
            downloadUrl.length();
        }
        super.onDetachedFromWindow();
    }

    public final ImageView getArrow$commercialize_feed_impl_release() {
        return this.LJLJL;
    }

    public final NT8 getCurrentStyle() {
        return this.LJLJLJ;
    }

    public final int getDefaultBackgroundColor() {
        return this.LJLLILLLL;
    }

    public final Aweme getMAweme$commercialize_feed_impl_release() {
        return this.LJLJLLL;
    }

    public final AwemeRawAd getMAwemeRawAd$commercialize_feed_impl_release() {
        return this.LJLL;
    }

    public final void setArrow$commercialize_feed_impl_release(ImageView imageView) {
        this.LJLJL = imageView;
    }

    public final void setCurrentStyle(NT8 nt8) {
        this.LJLJLJ = nt8;
    }

    public final void setDefaultBackgroundColor$commercialize_feed_impl_release(int i) {
        this.LJLLILLLL = i;
    }

    public final void setDownloadIdleUI(String text) {
        View view;
        View view2;
        TextView textView;
        TextView textView2;
        o.LJIIIZ(text, "text");
        if (!this.LJLLI) {
            View inflate = View.inflate(getContext(), getLayoutId$commercialize_feed_impl_release(), this);
            this.LJLILLLLZI = inflate;
            ImageView imageView = null;
            if (inflate != null) {
                view = inflate.findViewById(R.id.cfu);
            } else {
                view = null;
            }
            this.LJLJJL = view;
            View view3 = this.LJLILLLLZI;
            if (view3 != null) {
                view2 = view3.findViewById(R.id.cfv);
            } else {
                view2 = null;
            }
            this.LJLJJLL = view2;
            View view4 = this.LJLILLLLZI;
            if (view4 != null) {
                textView = (TextView) view4.findViewById(R.id.g8w);
            } else {
                textView = null;
            }
            this.LJLJI = textView;
            View view5 = this.LJLILLLLZI;
            if (view5 != null) {
                textView2 = (TextView) view5.findViewById(R.id.g8t);
            } else {
                textView2 = null;
            }
            this.LJLJJI = textView2;
            View view6 = this.LJLILLLLZI;
            if (view6 != null) {
                imageView = (ImageView) view6.findViewById(R.id.cft);
            }
            this.LJLJL = imageView;
            C59894Nf0.LIZ(this);
            this.LJLLI = true;
        }
        LJIIJ();
        this.LJLJLJ = NT8.DOWNLOAD_IDLE;
        View view7 = this.LJLJJL;
        if (view7 != null) {
            view7.setVisibility(8);
        }
        View view8 = this.LJLJJLL;
        if (view8 != null) {
            view8.setVisibility(8);
        }
        TextView textView3 = this.LJLJJI;
        if (textView3 != null) {
            textView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LJLIL));
        }
        TextView textView4 = this.LJLJJI;
        if (textView4 != null) {
            textView4.setText(text);
        }
        TextView textView5 = this.LJLJI;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        ImageView imageView2 = this.LJLJL;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    public final void setMAweme$commercialize_feed_impl_release(Aweme aweme) {
        this.LJLJLLL = aweme;
    }

    public final void setMAwemeRawAd$commercialize_feed_impl_release(AwemeRawAd awemeRawAd) {
        this.LJLL = awemeRawAd;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NT7(Context mContext, AttributeSet attributeSet) {
        this(mContext, attributeSet, 0);
        o.LJIIIZ(mContext, "mContext");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NT7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "mContext");
        this.LJLIL = context;
    }
}
