package X;

import Y.ACListenerS30S0100000_10;
import Y.ARunnableS0S0104000_3;
import Y.ARunnableS29S0200000_10;
import Y.ARunnableS46S0100000_10;
import Y.IDTListenerS119S0100000_10;
import Y.IDTListenerS91S0200000_10;
import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import defpackage.a1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import o53.IDdS476S0100000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7W extends RelativeLayout implements IW4, InterfaceC61374O6w {
    public LinearLayout LJLIL;
    public RelativeLayout LJLILLLLZI;
    public FrameLayout LJLJI;
    public Space LJLJJI;
    public ImageView LJLJJL;
    public TextView LJLJJLL;
    public ImageView LJLJL;
    public TextureViewSurfaceTextureListenerC48022It0 LJLJLJ;
    public RelativeLayout LJLJLLL;
    public RelativeLayout LJLL;
    public TextView LJLLI;
    public ImageView LJLLILLLL;
    public LinearLayout LJLLJ;
    public FrameLayout LJLLL;
    public TextView LJLLLL;
    public TextView LJLLLLLL;
    public C53952LFk LJLZ;
    public TextView LJZ;
    public View LJZI;
    public View LJZL;
    public long LL;
    public boolean LLD;
    public boolean LLF;
    public long LLFF;
    public int LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public long LLI;
    public O7E LLIFFJFJJ;
    public InterfaceC61356O6e LLII;
    public final IW3 LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public int LLIIIL;
    public PthreadTimer LLIIIZ;
    public O7H LLIIJI;
    public GestureDetector LLIIJLIL;
    public O8G LLIIL;
    public AnimatorSet LLIILII;
    public ValueAnimator LLIILZL;
    public C61386O7i LLIIZ;
    public InterfaceC61390O7m LLIL;
    public Space LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public long LLILLIZIL;
    public boolean LLILLJJLI;

    public final void LJIILIIL() {
        this.LLFII = true;
        if (C61359O6h.LJII().LJIIJ) {
            this.LLIIII.removeMessages(1);
        }
    }

    @Override // X.InterfaceC61374O6w
    public final void onAppForeground() {
    }

    public final void LIZLLL() {
        ImageView imageView = this.LJLJL;
        if (imageView != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.LJLJL.setImageBitmap(null);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        C61380O7c LIZ = C61380O7c.LIZ();
        C61385O7h c61385O7h = LIZ.LIZ;
        if (c61385O7h != null) {
            if (c61385O7h.LJ) {
                try {
                    C16880lQ.LJJLIIIJL(c61385O7h.LIZJ, c61385O7h.LIZIZ);
                    c61385O7h.LIZ = null;
                    c61385O7h.LJ = false;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            LIZ.LIZ = null;
        }
        PthreadTimer pthreadTimer = LIZ.LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
            LIZ.LIZIZ = null;
        }
        InterfaceC61390O7m interfaceC61390O7m = this.LLIL;
        if (interfaceC61390O7m != null) {
            interfaceC61390O7m.release();
            this.LLIL = null;
            this.LJLJLJ = null;
        }
        PthreadTimer pthreadTimer2 = this.LLIIIZ;
        if (pthreadTimer2 != null) {
            pthreadTimer2.cancel();
            this.LLIIIZ = null;
        }
        AnimatorSet animatorSet = this.LLIILII;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LLIILII = null;
        }
        ValueAnimator valueAnimator = this.LLIILZL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LLIILZL = null;
        }
    }

    public final void LJIIJJI() {
        this.LJZ.setVisibility(0);
        this.LJZ.setTextSize(1, 15.0f);
        this.LJZ.setTextColor(-1);
        this.LJZ.setY(this.LJLILLLLZI.getBottom());
        this.LJZ.setGravity(17);
        this.LJZ.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.LJZI.setAlpha(0.0f);
        this.LJZI.setVisibility(0);
        this.LJZI.setY(this.LJLILLLLZI.getBottom() - C61384O7g.LIZIZ(getContext(), 50.0f));
    }

    public final void LJIILJJIL() {
        C1DJ.LJIJI(this.LLIFFJFJJ.LJLL, "skip ad");
        InterfaceC61356O6e interfaceC61356O6e = this.LLII;
        O7E o7e = this.LLIFFJFJJ;
        O7F o7f = (O7F) interfaceC61356O6e;
        if (!o7f.LIZIZ) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long j = o7f.LIZJ;
                long j2 = currentTimeMillis - j;
                if (j != 0 && o7e.LLFZ == 2) {
                    jSONObject2.putOpt("duration", Long.valueOf(j2));
                }
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                if (o7e.LLFZ == 0) {
                    jSONObject.putOpt("show_time", Long.valueOf(j2));
                }
                if (!C78886Uxe.LJJIIZI(o7e.LJLZ)) {
                    jSONObject.putOpt("log_extra", o7e.LJLZ);
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", o7e.LJLILLLLZI);
            } catch (Exception unused) {
                jSONObject = null;
            }
            O79.LIZIZ().LIZLLL("splash_ad", "skip", jSONObject, o7e.LJLL);
            C61352O6a.LIZ().LIZIZ();
            o7f.LIZIZ();
            O86 o86 = o7f.LIZ;
            O8I o8i = new O8I();
            o8i.LIZ = 1;
            o86.LIZJ(o8i);
        }
        if (this.LLIL != null) {
            this.LLFFF = 2;
            LJIILL();
        }
        LJIILIIL();
        ((O7F) this.LLII).LJ();
    }

    public final void LJIILL() {
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, 107);
        if (C61359O6h.LJII().LJIIIIZZ) {
            post(aRunnableS46S0100000_10);
        } else {
            aRunnableS46S0100000_10.run();
        }
    }

    @Override // X.InterfaceC61374O6w
    public final void onAppBackground() {
        InterfaceC61390O7m interfaceC61390O7m = this.LLIL;
        if (interfaceC61390O7m != null) {
            interfaceC61390O7m.setMute(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!C61359O6h.LJII().LJIIJ && this.LLIIIZ == null) {
            PthreadTimer pthreadTimer = new PthreadTimer("DASplashView2");
            this.LLIIIZ = pthreadTimer;
            pthreadTimer.scheduleAtFixedRate(new C61393O7p(this), (this.LLFF % 1000) + 1000, 1000L);
        }
        O74 LIZIZ = O74.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        LIZIZ.LIZ = currentTimeMillis;
        if (C61359O6h.LJII().LJII) {
            O76 LJI = O76.LJI();
            LJI.LIZJ.LJFF(currentTimeMillis, "splash_ad_last_show_time");
            LJI.LIZJ();
        }
        O7F o7f = (O7F) this.LLII;
        o7f.getClass();
        o7f.LIZJ = System.currentTimeMillis();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC61383O7f(this));
        O7I.LIZIZ().LIZ(1000, this.LLIFFJFJJ.LJLL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZLLL();
        C61359O6h.LJ().LJFF();
        QXX qxx = C61359O6h.LJJJJJ;
        if (qxx != null) {
            qxx.getClass();
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public O7W(Context context) {
        super(context);
        float LIZIZ;
        this.LLFFF = -1;
        this.LLIIII = new IW3(this);
        this.LLIIIL = 0;
        this.LLILIL = false;
        this.LLILL = true;
        this.LLILLJJLI = false;
        this.LL = System.currentTimeMillis();
        if (C61359O6h.LJIL != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C61359O6h.LJIL).getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.LJLIL = linearLayout;
        addView(linearLayout);
        this.LJLILLLLZI = new RelativeLayout(context);
        this.LJLILLLLZI.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        Space space = new Space(context);
        this.LJLJJI = space;
        space.setId(com.zhiliaoapp.musically.R.id.k_w);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.LJLJJI.setLayoutParams(layoutParams);
        this.LJLJJI.setBackgroundColor(getResources().getColor(com.zhiliaoapp.musically.R.color.tk));
        this.LJLJJI.setVisibility(4);
        this.LJLJI = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, this.LJLJJI.getId());
        this.LJLJI.setLayoutParams(layoutParams2);
        this.LJLJI.setId(com.zhiliaoapp.musically.R.id.k_v);
        this.LJLJL = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        this.LJLJL.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LJLJL.setVisibility(8);
        this.LJLJL.setLayoutParams(layoutParams3);
        this.LJLJLJ = new TextureViewSurfaceTextureListenerC48022It0(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.gravity = 17;
        this.LJLJLJ.setLayoutParams(layoutParams4);
        this.LJLJLJ.setVisibility(8);
        this.LJLJLLL = new RelativeLayout(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) C61384O7g.LIZIZ(context, 60.0f));
        layoutParams5.gravity = 80;
        this.LJLJLLL.setLayoutParams(layoutParams5);
        this.LJLJLLL.setId(com.zhiliaoapp.musically.R.id.k_t);
        this.LJLJLLL.setBackgroundColor(getResources().getColor(com.zhiliaoapp.musically.R.color.te));
        this.LJLJLLL.setVisibility(8);
        this.LJLL = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        this.LJLL.setLayoutParams(layoutParams6);
        this.LJLLI = new TextView(context);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15, -1);
        this.LJLLI.setEllipsize(TextUtils.TruncateAt.END);
        this.LJLLI.setLines(1);
        this.LJLLI.setMaxWidth((int) C61384O7g.LIZIZ(context, 200.0f));
        this.LJLLI.setText(com.zhiliaoapp.musically.R.string.rig);
        this.LJLLI.setTextColor(getResources().getColor(com.zhiliaoapp.musically.R.color.tk));
        this.LJLLI.setTextSize(1, 20.0f);
        this.LJLLI.setLayoutParams(layoutParams7);
        this.LJLLI.setId(com.zhiliaoapp.musically.R.id.k_y);
        this.LJLL.addView(this.LJLLI);
        this.LJLLILLLL = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(15, -1);
        layoutParams8.addRule(1, this.LJLLI.getId());
        layoutParams8.setMargins((int) C61384O7g.LIZIZ(context, 4.0f), 0, 0, 0);
        this.LJLLILLLL.setPadding(0, (int) C61384O7g.LIZIZ(context, 1.0f), 0, 0);
        this.LJLLILLLL.setImageDrawable(getResources().getDrawable(com.zhiliaoapp.musically.R.drawable.c68));
        this.LJLLILLLL.setLayoutParams(layoutParams8);
        this.LJLL.addView(this.LJLLILLLL);
        this.LJLJLLL.addView(this.LJLL);
        this.LJLJJL = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(20, -1);
        layoutParams9.addRule(10, -1);
        int LIZIZ2 = (int) C61384O7g.LIZIZ(context, 14.0f);
        layoutParams9.setMargins(LIZIZ2, (int) C61384O7g.LIZIZ(context, 14.0f), 0, 0);
        layoutParams9.setMarginStart(LIZIZ2);
        layoutParams9.setMarginEnd(0);
        this.LJLJJL.setVisibility(4);
        this.LJLJJL.setLayoutParams(layoutParams9);
        this.LJLLJ = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        this.LJLLJ.setOrientation(0);
        this.LJLLJ.setLayoutParams(layoutParams10);
        if (!C61359O6h.LJII().LJIIL) {
            this.LJLLJ.setFitsSystemWindows(true);
        }
        this.LLILII = new Space(context);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, 1);
        layoutParams11.weight = 1.0f;
        this.LLILII.setLayoutParams(layoutParams11);
        this.LJLLL = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-2, (int) C61384O7g.LIZIZ(context, 36.0f));
        layoutParams12.addRule(21, -1);
        layoutParams12.addRule(10, -1);
        if (C61359O6h.LJII().LJFF) {
            LIZIZ = C61384O7g.LIZIZ(context, 10.0f);
        } else {
            LIZIZ = C61384O7g.LIZIZ(context, 16.0f);
        }
        int i = (int) LIZIZ;
        layoutParams12.setMargins(0, (int) C61384O7g.LIZIZ(context, 8.0f), i, 0);
        layoutParams12.setMarginStart(0);
        layoutParams12.setMarginEnd(i);
        this.LJLLL.setLayoutParams(layoutParams12);
        this.LJLLL.setVisibility(8);
        this.LJLLL.setId(com.zhiliaoapp.musically.R.id.k_z);
        this.LJLLLL = new TextView(context);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-2, (int) C61384O7g.LIZIZ(context, 24.0f));
        this.LJLLLL.setBackgroundResource(com.zhiliaoapp.musically.R.drawable.c6d);
        this.LJLLLL.setPaddingRelative((int) C61384O7g.LIZIZ(context, 10.0f), 0, (int) C61384O7g.LIZIZ(context, 10.0f), 0);
        layoutParams13.gravity = 17;
        this.LJLLLL.setGravity(17);
        this.LJLLLL.setTextSize(1, 12.0f);
        this.LJLLLL.setLayoutParams(layoutParams13);
        this.LJLLL.addView(this.LJLLLL);
        this.LJLJJLL = new TextView(context);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        int LIZIZ3 = (int) C61384O7g.LIZIZ(context, 9.0f);
        layoutParams14.setMargins(0, (int) C61384O7g.LIZIZ(context, 17.0f), LIZIZ3, 0);
        layoutParams14.setMarginStart(0);
        layoutParams14.setMarginEnd(LIZIZ3);
        this.LJLJJLL.setPaddingRelative(3, 3, 3, 3);
        this.LJLJJLL.setTextColor(ColorProtector.parseColor("#ffffff"));
        this.LJLJJLL.setShadowLayer(12.0f, 0.0f, 0.0f, ColorProtector.parseColor("#7f000000"));
        this.LJLJJLL.setTextSize(1, 12.0f);
        this.LJLJJLL.setVisibility(8);
        this.LJLJJLL.setLayoutParams(layoutParams14);
        TextView disableAccessibility = this.LJLJJLL;
        o.LJIIJ(disableAccessibility, "$this$disableAccessibility");
        disableAccessibility.setImportantForAccessibility(2);
        this.LJLZ = new C53952LFk(context);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams((int) C61384O7g.LIZIZ(context, 40.0f), (int) C61384O7g.LIZIZ(context, 40.0f));
        int LIZIZ4 = (int) C61384O7g.LIZIZ(context, 44.0f);
        layoutParams15.setMargins(0, (int) C61384O7g.LIZIZ(context, 30.0f), LIZIZ4, 0);
        layoutParams15.setMarginStart(0);
        layoutParams15.setMarginEnd(LIZIZ4);
        this.LJLZ.setLayoutParams(layoutParams15);
        this.LJLZ.setGravity(17);
        this.LJLZ.setTextSize(1, 18.0f);
        this.LJLZ.setVisibility(8);
        TextView textView = new TextView(context);
        this.LJLLLLLL = textView;
        textView.setPaddingRelative((int) C61384O7g.LIZIZ(context, 4.0f), (int) C61384O7g.LIZIZ(context, 2.0f), (int) C61384O7g.LIZIZ(context, 4.0f), (int) C61384O7g.LIZIZ(context, 2.0f));
        this.LJLLLLLL.setTextSize(1, 10.0f);
        this.LJLLLLLL.setId(com.zhiliaoapp.musically.R.id.k_s);
        this.LJLLLLLL.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.LJZ = textView2;
        textView2.setVisibility(8);
        View view = new View(context);
        this.LJZI = view;
        view.setBackgroundResource(com.zhiliaoapp.musically.R.drawable.av4);
        this.LJZI.setVisibility(8);
        this.LJZI.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) C61384O7g.LIZIZ(context, 50.0f)));
        View view2 = new View(getContext());
        this.LJZL = view2;
        view2.setBackgroundResource(com.zhiliaoapp.musically.R.drawable.c6_);
        this.LJZL.setVisibility(8);
        this.LJZL.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) C61384O7g.LIZIZ(getContext(), 105.0f)));
        this.LJLIL.addView(this.LJLILLLLZI);
        this.LJLJI.addView(this.LJLJL);
        this.LJLJI.addView(this.LJLJLJ);
        this.LJLJI.addView(this.LJLJLLL);
        this.LJLILLLLZI.addView(this.LJLJI);
        this.LJLILLLLZI.addView(this.LJLJJI);
        this.LJLILLLLZI.addView(this.LJZL);
        this.LJLLJ.addView(this.LJLJJL);
        this.LJLLJ.addView(this.LLILII);
        this.LJLILLLLZI.addView(this.LJLLJ);
        this.LJLILLLLZI.addView(this.LJZI);
        this.LJLILLLLZI.addView(this.LJZ);
        int i2 = C61359O6h.LJIJI;
        if (i2 != 0) {
            this.LJLJJLL.setText(i2);
        } else {
            this.LJLJJLL.setText(com.zhiliaoapp.musically.R.string.ril);
        }
        int i3 = C61359O6h.LJIJJ;
        if (i3 != 0) {
            this.LJLLLL.setText(i3);
        } else {
            this.LJLLLL.setText(com.zhiliaoapp.musically.R.string.rii);
        }
        if (C61359O6h.LJJIIJZLJL == 1) {
            this.LJLJL.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.LLILL = true;
    }

    public static void LJIIL(O7E o7e) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("show_expected", Integer.valueOf(o7e.LJLJLLL));
        jSONObject.putOpt("show_type", "not_real_time");
        int i = C61359O6h.LJJIJIIJI;
        if (i != -1) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
            }
            jSONObject.put("awemelaunch", i2);
        }
        jSONObject.put("ad_sequence", O76.LJI().LJII());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("ad_extra_data", jSONObject);
        jSONObject2.put("is_ad_event", "1");
        if (!C78886Uxe.LJJIIZI(o7e.LJLZ)) {
            jSONObject2.put("log_extra", o7e.LJLZ);
        }
        jSONObject2.put("ad_fetch_time", o7e.LJLILLLLZI);
        O79.LIZIZ().LIZLLL("splash_ad", "show", jSONObject2, o7e.LJLL);
        C61404O8a.LJFF().LIZ(null, o7e.LJLL, o7e.LLIIII, o7e.LJLZ, true, -1L, null);
    }

    private void setImageTouchListener(O7E o7e) {
        setOnTouchListener(new IDTListenerS91S0200000_10(this, o7e, 0));
    }

    private void setSkipClickListener(O7E o7e) {
        C16880lQ.LJIILJJIL(this.LJLLL, new ACListenerS30S0100000_10(this, 109));
    }

    private void setupAdLabelLayout(O7E o7e) {
        O8D o8d = o7e.LLIL;
        if (o8d == null) {
            return;
        }
        if (!TextUtils.isEmpty(o8d.LIZLLL)) {
            this.LJLLLLLL.setText(o8d.LIZLLL);
        }
        if (!TextUtils.isEmpty(o8d.LIZJ)) {
            this.LJLLLLLL.setTextColor(O77.LJIIL(o8d.LIZJ, "#ffffff"));
        }
        if (!TextUtils.isEmpty(o8d.LIZ)) {
            GradientDrawable LJ = LJ(2);
            LJ.setColor(O77.LJIIL(o8d.LIZ, "#32222222"));
            this.LJLLLLLL.setBackground(LJ);
        }
    }

    private void setupSkipButtonHitArea(O7E o7e) {
        O7V o7v = o7e.LLILII;
        if (o7v != null) {
            boolean z = true;
            if ((o7v.LJIIIIZZ & 1) == 0) {
                z = false;
                if (o7v == null) {
                    return;
                }
            }
            if (this.LJLLL.getVisibility() == 0 && this.LJLLL.getParent() != null) {
                if (z) {
                    int LIZIZ = (int) C61384O7g.LIZIZ(getContext(), o7v.LIZIZ);
                    int LIZIZ2 = (int) C61384O7g.LIZIZ(getContext(), o7v.LIZJ);
                    TextView textView = this.LJLLLL;
                    ((View) textView.getParent()).post(new ARunnableS0S0104000_3(textView, LIZIZ, LIZIZ, LIZIZ2, LIZIZ2, 3));
                    this.LJLLL.setOnTouchListener(new IDTListenerS119S0100000_10(this, 7));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    this.LJLLL.setPaddingRelative((int) C61384O7g.LIZIZ(getContext(), o7v.LIZJ), (int) C61384O7g.LIZIZ(getContext(), 14.0f), (int) C61384O7g.LIZIZ(getContext(), 16.0f), (int) C61384O7g.LIZIZ(getContext(), o7v.LIZIZ));
                    this.LJLLL.setLayoutParams(layoutParams);
                    C16880lQ.LJIILJJIL(this.LJLLL, new O8A());
                    C16880lQ.LJIJI(this.LJLLLL, new ACListenerS30S0100000_10(this, 108));
                    return;
                }
                FrameLayout frameLayout = this.LJLLL;
                int i = o7v.LIZIZ;
                int i2 = o7v.LIZJ;
                ((View) frameLayout.getParent()).post(new ARunnableS0S0104000_3(frameLayout, i, i, i2, i2, 3));
                this.LJLLJ.setPaddingRelative(0, 0, 0, o7v.LIZIZ);
            }
        }
    }

    private void setupSkipLayout(O7E o7e) {
        this.LLIIIL = (int) (this.LLFF / 1000);
        C53952LFk c53952LFk = this.LJLZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(this.LLIIIL);
        c53952LFk.setText(X1D.LIZIZ(LIZ));
        this.LJLZ.setDuration(this.LLFF);
        O7V o7v = o7e.LLILII;
        if (o7v != null && !TextUtils.isEmpty(o7v.LJFF)) {
            this.LJLLL.setVisibility(0);
            this.LLIIIILZ = o7v.LJFF;
            this.LLF = o7v.LJI;
            this.LLIIIJ = o7v.LIZ;
            this.LJLLLL.setText(LJI(this.LLIIIL));
            if (!TextUtils.isEmpty(o7v.LIZLLL)) {
                this.LJLLLL.setTextColor(O77.LJIIL(o7v.LIZLLL, "#ffffff"));
                this.LJLZ.setTextColor(O77.LJIIL(o7v.LIZLLL, "#ffffff"));
            }
            if (!TextUtils.isEmpty(o7v.LJ)) {
                GradientDrawable LIZIZ = T28.LIZIZ(1);
                GradientDrawable LJ = LJ(12);
                int LJIIL = O77.LJIIL(o7v.LJ, "#32222222");
                LJ.setColor(LJIIL);
                LIZIZ.setColor(LJIIL);
                this.LJLLLL.setBackground(LJ);
                this.LJLZ.setBackground(LIZIZ);
            }
            setSkipClickListener(o7e);
            return;
        }
        this.LJLLL.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10, -1);
        int LIZIZ2 = (int) C61384O7g.LIZIZ(getContext(), 16.0f);
        layoutParams.setMargins(0, (int) C61384O7g.LIZIZ(getContext(), 16.0f), LIZIZ2, 0);
        layoutParams.addRule(21, -1);
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(LIZIZ2);
        this.LJLJJLL.setLayoutParams(layoutParams);
    }

    private void setupUIWidgets(O7E o7e) {
        int i;
        int i2;
        setupSkipLayout(o7e);
        setupWifiPreloadHindLayout(o7e);
        setupAdLabelLayout(o7e);
        O8D o8d = o7e.LLIL;
        if (o8d != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("new splash style，position:");
            LIZ.append(o8d.LIZIZ);
            C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
            C61384O7g.LIZJ(this.LJLJJLL);
            C61384O7g.LIZJ(this.LJLLLLLL);
            C61384O7g.LIZJ(this.LJLLL);
            int i3 = o8d.LIZIZ;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            C61384O7g.LIZ(this.LJLJJLL, this.LJLLJ);
                            C61384O7g.LIZ(this.LJLLL, this.LJLLJ);
                            if (o8d.LIZIZ != 0) {
                                this.LJLLLLLL.setVisibility(8);
                            }
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("xigua TV style, is clickable: ");
                            LIZ2.append(o7e.LJIIJ());
                            LIZ2.append(", is skippable: ");
                            LIZ2.append(o7e.LIZLLL());
                            C1DJ.LJIJJ(X1D.LIZIZ(LIZ2));
                            if (o7e.LJIIJ() || o7e.LIZLLL()) {
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C61384O7g.LIZIZ(getContext(), 40.0f));
                                int LIZIZ = (int) C61384O7g.LIZIZ(getContext(), 44.0f);
                                layoutParams.setMargins(0, (int) C61384O7g.LIZIZ(getContext(), 30.0f), LIZIZ, 0);
                                layoutParams.setMarginStart(0);
                                layoutParams.setMarginEnd(LIZIZ);
                                this.LJLLL.setLayoutParams(layoutParams);
                                this.LJLLLL.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                                GradientDrawable LJ = LJ(20);
                                O7V o7v = o7e.LLILII;
                                if (o7v != null && !TextUtils.isEmpty(o7v.LJ)) {
                                    LJ.setColor(O77.LJIIL(o7v.LJ, "#32222222"));
                                } else {
                                    LJ.setAlpha(153);
                                    LJ.setColor(-16777216);
                                }
                                this.LJLLLL.setPaddingRelative((int) C61384O7g.LIZIZ(getContext(), 14.0f), (int) C61384O7g.LIZIZ(getContext(), 8.0f), (int) C61384O7g.LIZIZ(getContext(), 14.0f), (int) C61384O7g.LIZIZ(getContext(), 7.0f));
                                this.LJLLLL.setBackground(LJ);
                                this.LJLLLL.setTextSize(1, 18.0f);
                                C61384O7g.LIZ(this.LJLLL, this.LJLLJ);
                            } else {
                                this.LJLZ.setVisibility(0);
                                C61384O7g.LIZ(this.LJLZ, this.LJLLJ);
                            }
                            if (!TextUtils.isEmpty(o8d.LIZLLL) && (o7e.LJIIJ() || !o7e.LIZLLL())) {
                                this.LJLLLLLL.setVisibility(0);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C61384O7g.LIZIZ(getContext(), 40.0f), (int) C61384O7g.LIZIZ(getContext(), 22.0f));
                                layoutParams2.gravity = 8388691;
                                int LIZIZ2 = (int) C61384O7g.LIZIZ(getContext(), 8.0f);
                                layoutParams2.setMargins(LIZIZ2, 0, 0, (int) C61384O7g.LIZIZ(getContext(), 8.0f));
                                layoutParams2.setMarginStart(LIZIZ2);
                                layoutParams2.setMarginEnd(0);
                                this.LJLLLLLL.setGravity(17);
                                GradientDrawable LJ2 = LJ(4);
                                if (!TextUtils.isEmpty(o8d.LIZ)) {
                                    LJ2.setColor(O77.LJIIL(o8d.LIZ, "#32222222"));
                                } else {
                                    LJ2.setColor(-16777216);
                                    LJ2.setAlpha(153);
                                }
                                this.LJLLLLLL.setBackground(LJ2);
                                if (!TextUtils.isEmpty(o8d.LIZJ)) {
                                    this.LJLLLLLL.setTextColor(O77.LJIIL(o8d.LIZJ, "#ffffff"));
                                } else {
                                    this.LJLLLLLL.setTextColor(-1);
                                }
                                this.LJLLLLLL.setTextSize(1, 12.0f);
                                this.LJLLLLLL.setText(o8d.LIZLLL);
                                this.LJLLLLLL.setLayoutParams(layoutParams2);
                                C61384O7g.LIZ(this.LJLLLLLL, this.LJLJI);
                            }
                        }
                    } else {
                        if (!TextUtils.isEmpty(this.LJLLLLLL.getText())) {
                            this.LJLLLLLL.setVisibility(0);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, (int) C61384O7g.LIZIZ(getContext(), 18.0f));
                            if (this.LJLJJLL.getVisibility() != 0) {
                                i2 = (int) C61384O7g.LIZIZ(getContext(), 20.0f);
                            } else {
                                i2 = 0;
                            }
                            layoutParams3.setMargins(0, 0, i2, 0);
                            layoutParams3.setMarginStart(0);
                            layoutParams3.setMarginEnd(i2);
                            this.LJLLLLLL.setLayoutParams(layoutParams3);
                            this.LJLLLLLL.setTextSize(1, 12.0f);
                            this.LJLLLLLL.setPaddingRelative((int) C61384O7g.LIZIZ(getContext(), 4.0f), 0, (int) C61384O7g.LIZIZ(getContext(), 0.0f), 0);
                            this.LJLLLLLL.setBackgroundColor(ColorProtector.parseColor("#00222222"));
                            this.LJLLLLLL.setShadowLayer(2.0f, 0.0f, 1.0f, ColorProtector.parseColor("#66000000"));
                            C61384O7g.LIZ(this.LJLLLLLL, this.LJLLJ);
                        }
                        if (this.LJLJJLL.getVisibility() == 0) {
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) C61384O7g.LIZIZ(getContext(), 18.0f));
                            int LIZIZ3 = (int) C61384O7g.LIZIZ(getContext(), 20.0f);
                            layoutParams4.setMargins(0, 0, LIZIZ3, 0);
                            layoutParams4.setMarginStart(0);
                            layoutParams4.setMarginEnd(LIZIZ3);
                            this.LJLJJLL.setLayoutParams(layoutParams4);
                            this.LJLJJLL.setTextSize(1, 12.0f);
                            this.LJLJJLL.setShadowLayer(2.0f, 0.0f, 1.0f, ColorProtector.parseColor("#66000000"));
                            if (!TextUtils.isEmpty(o8d.LIZJ)) {
                                this.LJLJJLL.setTextColor(O77.LJIIL(o8d.LIZJ, "#ffffff"));
                            }
                            this.LJLJJLL.setPaddingRelative((int) C61384O7g.LIZIZ(getContext(), 6.0f), 0, (int) C61384O7g.LIZIZ(getContext(), 0.0f), 0);
                            TextView textView = this.LJLJJLL;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("|  ");
                            LIZ3.append((Object) this.LJLJJLL.getText());
                            textView.setText(X1D.LIZIZ(LIZ3));
                            C61384O7g.LIZ(this.LJLJJLL, this.LJLLJ);
                        }
                        if (this.LJLLL.getVisibility() == 0) {
                            if (!o7e.LLILL) {
                                this.LJLLLL.setTextSize(1, 16.0f);
                            }
                            C61384O7g.LIZ(this.LJLLL, this.LJLILLLLZI);
                            int LIZIZ4 = (int) C61384O7g.LIZIZ(C61359O6h.LJIILL, 0);
                            if (LIZIZ4 <= 0) {
                                LIZIZ4 = (O77.LJ() / 2) - C61359O6h.LJIILL.getResources().getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.a7v);
                            }
                            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, (int) C61384O7g.LIZIZ(getContext(), 30.0f));
                            layoutParams5.addRule(12, -1);
                            int LIZIZ5 = (int) C61384O7g.LIZIZ(getContext(), 15.0f);
                            if (o7e.LJIILL()) {
                                if (C61359O6h.LIZIZ() != null && "13".equals(C61359O6h.LIZIZ().LIZIZ())) {
                                    LIZIZ4 += (int) C61384O7g.LIZIZ(getContext(), 5.5f);
                                }
                                layoutParams5.setMargins(0, 0, LIZIZ5, LIZIZ4);
                            } else {
                                layoutParams5.setMargins(0, 0, LIZIZ5, (int) C61384O7g.LIZIZ(getContext(), 35.0f));
                            }
                            layoutParams5.addRule(21, -1);
                            layoutParams5.setMarginStart(0);
                            layoutParams5.setMarginEnd(LIZIZ5);
                            this.LJLLL.setLayoutParams(layoutParams5);
                            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -1);
                            this.LJLLLL.setMinimumWidth((int) C61384O7g.LIZIZ(getContext(), 64.0f));
                            this.LJLLLL.setLayoutParams(layoutParams6);
                            O7V o7v2 = o7e.LLILII;
                            if (o7v2 != null && !TextUtils.isEmpty(o7v2.LJ)) {
                                GradientDrawable LJ3 = LJ(16);
                                LJ3.setColor(O77.LJIIL(o7v2.LJ, "#32222222"));
                                if (o7e.LJIILL()) {
                                    LJ3.setStroke((int) C61384O7g.LIZIZ(getContext(), 0.5f), ColorProtector.parseColor("#66222222"));
                                } else {
                                    LJ3.setStroke((int) C61384O7g.LIZIZ(getContext(), 0.5f), ColorProtector.parseColor("#99FAFAFA"));
                                }
                                this.LJLLLL.setBackground(LJ3);
                            }
                        }
                        if (this.LJLJJL.getVisibility() == 0) {
                            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                            int LIZIZ6 = (int) C61384O7g.LIZIZ(getContext(), 14.0f);
                            layoutParams7.setMargins(LIZIZ6, 0, 0, 0);
                            layoutParams7.setMarginStart(LIZIZ6);
                            layoutParams7.setMarginEnd(0);
                            this.LJLJJL.setLayoutParams(layoutParams7);
                        }
                        if (this.LJLLJ != null) {
                            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams8.setMargins(0, (int) C61384O7g.LIZIZ(getContext(), 35.0f), 0, 0);
                            layoutParams8.setMarginStart(0);
                            layoutParams8.setMarginEnd(0);
                            this.LJLLJ.setOrientation(0);
                            this.LJLLJ.setLayoutParams(layoutParams8);
                        }
                    }
                } else {
                    C61384O7g.LIZ(this.LJLJJLL, this.LJLLJ);
                    C61384O7g.LIZ(this.LJLLL, this.LJLLJ);
                    this.LJLLLLLL.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams9.gravity = 8388693;
                    if (o7e.LLD == 3 && this.LJLJLLL.getVisibility() == 0) {
                        i = this.LJLJLLL.getLayoutParams().height;
                    } else {
                        i = 0;
                    }
                    int LIZIZ7 = (int) C61384O7g.LIZIZ(getContext(), 16.0f);
                    layoutParams9.setMargins(0, 0, LIZIZ7, ((int) C61384O7g.LIZIZ(getContext(), 20.0f)) + i);
                    layoutParams9.setMarginStart(0);
                    layoutParams9.setMarginEnd(LIZIZ7);
                    this.LJLLLLLL.setLayoutParams(layoutParams9);
                    C61384O7g.LIZ(this.LJLLLLLL, this.LJLJI);
                }
            } else if (TextUtils.isEmpty(o8d.LIZLLL)) {
                C61384O7g.LIZ(this.LJLJJLL, this.LJLLJ);
                C61384O7g.LIZ(this.LJLLL, this.LJLLJ);
            } else {
                C61384O7g.LIZLLL(true, this.LJLLLLLL);
                C61384O7g.LIZLLL(false, this.LJLLL, this.LJLJJLL);
                this.LJLLLLLL.setTextSize(1, 12.0f);
                C16880lQ.LJIJI(this.LJLLLLLL, new ACListenerS30S0100000_10(this, 110));
                float LIZIZ8 = (int) C61384O7g.LIZIZ(getContext(), 1.0f);
                this.LJLLLLLL.setShadowLayer(LIZIZ8, 0.0f, LIZIZ8, Color.argb(31, 0, 0, 0));
                C61384O7g.LIZLLL(true, this.LJZL);
                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams10.gravity = 16;
                layoutParams10.topMargin = (int) C61384O7g.LIZIZ(getContext(), 7.0f);
                layoutParams10.setMarginEnd((int) C61384O7g.LIZIZ(getContext(), 13.0f));
                TextView textView2 = this.LJLLLLLL;
                LinearLayout linearLayout = this.LJLLJ;
                if (textView2 != null) {
                    textView2.setLayoutParams(layoutParams10);
                }
                C61384O7g.LIZ(textView2, linearLayout);
            }
        }
        setupSkipButtonHitArea(o7e);
    }

    private void setupWifiPreloadHindLayout(O7E o7e) {
        String str = o7e.LLILIL;
        if (!TextUtils.isEmpty(str)) {
            this.LJLJJLL.setVisibility(0);
            this.LJLJJLL.setText(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.W5O, REQUEST] */
    public final boolean LIZ(O7E o7e) {
        String LJIILIIL;
        Bitmap decodeByteArray;
        Bitmap decodeFile;
        boolean z;
        boolean z2;
        List<View> asList;
        InterfaceC61390O7m c48404IzA;
        boolean z3;
        int i;
        QXX qxx = C61359O6h.LJIJ;
        if (qxx != null) {
            this.LJLJJL.setImageResource(qxx.LLJ(o7e.LLJIJIL));
        }
        int i2 = o7e.LLFZ;
        if (i2 != 0) {
            if (i2 == 2) {
                C1DJ.LJIJI(o7e.LJLL, "prepare to bind ad data which is a video ad");
                O7G o7g = o7e.LLI;
                if (o7g != null) {
                    this.LJLJJI.setVisibility(8);
                    this.LJLJJL.setVisibility(0);
                    String LJIIZILJ = O77.LJIIZILJ(o7g);
                    if (!C78886Uxe.LJJIIZI(LJIIZILJ)) {
                        setOnTouchListener(new IDTListenerS91S0200000_10(this, o7e, 2));
                        this.LJLJLJ.setVisibility(0);
                        TextureViewSurfaceTextureListenerC48022It0 videoView = this.LJLJLJ;
                        o.LJIIJ(videoView, "videoView");
                        if (C61359O6h.LJJIJIIJIL) {
                            c48404IzA = new C48018Isw(videoView);
                        } else {
                            c48404IzA = new C48404IzA(videoView);
                        }
                        this.LLIL = c48404IzA;
                        if (this.LLIIJI == null) {
                            this.LLI = System.currentTimeMillis();
                            this.LLIIJI = new O7H(this, o7e);
                        }
                        c48404IzA.LJFF(this.LLIIJI);
                        InterfaceC61390O7m interfaceC61390O7m = this.LLIL;
                        int i3 = C61359O6h.LJJJJZI;
                        if (o7e.LJZI == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (interfaceC61390O7m.LIZIZ(LJIIZILJ, i3, z3)) {
                            C61380O7c LIZ = C61380O7c.LIZ();
                            Context context = C61359O6h.LJIILL;
                            LIZ.getClass();
                            if (o7e.LLILLIZIL != 0) {
                                if (LIZ.LIZ == null) {
                                    LIZ.LIZ = new C61385O7h(context);
                                }
                                AudioManager audioManager = LIZ.LIZ.LIZLLL;
                                if (audioManager != null) {
                                    i = C16880lQ.LLLLLLZZ(audioManager, 3);
                                } else {
                                    i = 15;
                                }
                                int LIZ2 = LIZ.LIZ.LIZ();
                                LIZ.LIZLLL = LIZ2;
                                float f = (LIZ2 * 1.0f) / i;
                                if (f == 0.0f) {
                                    C61380O7c.LIZIZ(o7e);
                                } else {
                                    C61380O7c.LIZJ(o7e, f);
                                }
                                LIZ.LIZJ = false;
                                LIZ.LIZ.LIZ = new C61403O7z(LIZ, f, i, o7e);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("Init volume:");
                                LIZ3.append(LIZ.LIZLLL);
                                X1D.LIZIZ(LIZ3);
                                C61385O7h c61385O7h = LIZ.LIZ;
                                c61385O7h.getClass();
                                c61385O7h.LIZIZ = new C61379O7b(c61385O7h);
                                C16880lQ.LJJLIIIJILLIZJL(c61385O7h.LIZIZ, c61385O7h.LIZJ, AnonymousClass028.LIZ("android.media.VOLUME_CHANGED_ACTION"));
                                c61385O7h.LJ = true;
                            }
                            C61380O7c LIZ4 = C61380O7c.LIZ();
                            InterfaceC61390O7m interfaceC61390O7m2 = this.LLIL;
                            int i4 = o7e.LLILLIZIL;
                            long LJIIIIZZ = o7e.LJIIIIZZ();
                            if (interfaceC61390O7m2 != null) {
                                C61385O7h c61385O7h2 = LIZ4.LIZ;
                                if (c61385O7h2 == null || LJIIIIZZ <= 3000) {
                                    interfaceC61390O7m2.setMute(true);
                                } else if (i4 != 0) {
                                    if (i4 != 1) {
                                        if (i4 != 2) {
                                            if (i4 != 3) {
                                                if (i4 == 4) {
                                                    int LIZ5 = c61385O7h2.LIZ();
                                                    interfaceC61390O7m2.setMute(true);
                                                    float f2 = LIZ5 * 1.0f;
                                                    interfaceC61390O7m2.setVolume(f2, f2);
                                                }
                                                interfaceC61390O7m2.setMute(true);
                                            } else {
                                                int LIZ6 = c61385O7h2.LIZ();
                                                interfaceC61390O7m2.setMute(false);
                                                float f3 = LIZ6 * 1.0f;
                                                interfaceC61390O7m2.setVolume(f3, f3);
                                            }
                                        } else {
                                            interfaceC61390O7m2.setMute(false);
                                            LIZ4.LIZIZ = new PthreadTimer("BDASplashVolumeManager");
                                            LIZ4.LIZJ = true;
                                            float LIZ7 = (LIZ4.LIZ.LIZ() * 1.0f) / ((float) 3000);
                                            if (LIZ7 > 0.0f) {
                                                LIZ4.LIZIZ.schedule(new C61388O7k(LIZ4, LIZ7, interfaceC61390O7m2), 0L, 500L);
                                            }
                                        }
                                    } else {
                                        interfaceC61390O7m2.setMute(false);
                                        interfaceC61390O7m2.setVolume(0.0f, 0.0f);
                                    }
                                } else {
                                    interfaceC61390O7m2.setMute(true);
                                }
                            } else {
                                LIZ4.getClass();
                            }
                            this.LJLJLJ.post(new ARunnableS29S0200000_10(o7e, this, 43));
                            C61352O6a LIZ8 = C61352O6a.LIZ();
                            String str = o7g.LIZLLL;
                            LIZ8.getClass();
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.putOpt("extra", str);
                                O8O.LIZLLL().LJIIIZ("bda_splash_degradation", 3, jSONObject);
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                            this.LJLLJ.addOnLayoutChangeListener(new O7X(this));
                        }
                    }
                }
            }
            C1DJ.LJIJI(o7e.LJLL, "binding data failed, check if there are errors in splash ad json");
            return false;
        }
        C1DJ.LJIJI(o7e.LJLL, "prepare to bind ad data which is a pic ad");
        setImageTouchListener(o7e);
        if (o7e.LJIILL()) {
            ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
            layoutParams.height = O77.LJ();
            this.LJLJJI.setLayoutParams(layoutParams);
            this.LJLJJI.setVisibility(4);
            this.LJLJJL.setVisibility(4);
        } else {
            this.LJLJJI.setVisibility(8);
            this.LJLJJL.setVisibility(0);
        }
        O7J o7j = o7e.LJLIL;
        o7j.getClass();
        if (!o7j.LIZJ()) {
            LJIILIIL = null;
        } else {
            LJIILIIL = O77.LJIILIIL(o7j.LIZLLL);
        }
        if (!C78886Uxe.LJJIIZI(LJIILIIL) && C61359O6h.LIZLLL != null) {
            C61389O7l c61389O7l = new C61389O7l(this, o7e);
            if (TextUtils.isEmpty(o7j.LJ)) {
                InterfaceC61376O6y interfaceC61376O6y = C61359O6h.LIZLLL;
                ImageView imageView = this.LJLJL;
                int i5 = o7e.LL;
                interfaceC61376O6y.getClass();
                if (!C78983UzD.LJJJI(LJIILIIL)) {
                    if (i5 == 1) {
                        Context LIZIZ = EF7.LIZIZ();
                        StringBuilder LIZ9 = X1D.LIZ();
                        LIZ9.append("file://");
                        LIZ9.append(LJIILIIL);
                        ?? LIZ10 = W5P.LIZLLL(UriProtector.parse(X1D.LIZIZ(LIZ9))).LIZ();
                        C81705W4v LIZJ = W5I.LIZJ();
                        LIZJ.LIZLLL = LIZ10;
                        LIZJ.LJII = new IDdS476S0100000_10(c61389O7l, 0);
                        LIZJ.LJIIJ = false;
                        W4R LIZ11 = LIZJ.LIZ();
                        C81250Vug c81250Vug = new C81250Vug(new C79077V1t(LIZIZ.getResources()).LIZ());
                        c81250Vug.LJII(LIZ11);
                        imageView.setImageDrawable(c81250Vug.LIZJ());
                    } else {
                        Context LIZIZ2 = EF7.LIZIZ();
                        int LJIIJJI = KL2.LJIIJJI(LIZIZ2);
                        int LJIIIZ = KL2.LJIIIZ(LIZIZ2);
                        if (!TextUtils.isEmpty(LJIILIIL)) {
                            if (LJIIJJI <= 0 || LJIIIZ <= 0) {
                                decodeFile = BitmapFactory.decodeFile(LJIILIIL);
                            } else {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                decodeFile = BitmapFactory.decodeFile(LJIILIIL, options);
                                int i6 = options.outWidth / 2;
                                int i7 = options.outHeight / 2;
                                int i8 = 1;
                                while (i6 / i8 >= LJIIJJI && i7 / i8 >= LJIIIZ) {
                                    i8 *= 2;
                                }
                                options.inSampleSize = i8;
                                options.inJustDecodeBounds = false;
                                options.inPurgeable = true;
                                options.inInputShareable = true;
                                try {
                                    decodeFile = BitmapFactory.decodeFile(LJIILIIL, options);
                                } catch (Exception e2) {
                                    C78983UzD.LJIIZILJ(e2);
                                }
                            }
                            if (decodeFile != null) {
                                imageView.setImageBitmap(decodeFile);
                            }
                        }
                    }
                }
            } else {
                InterfaceC61376O6y interfaceC61376O6y2 = C61359O6h.LIZLLL;
                ImageView imageView2 = this.LJLJL;
                int i9 = o7e.LL;
                String str2 = o7j.LJ;
                interfaceC61376O6y2.getClass();
                if (!C78983UzD.LJJJI(LJIILIIL)) {
                    Context LIZIZ3 = EF7.LIZIZ();
                    if (i9 == 1) {
                        C61363O6l.LIZIZ(LIZIZ3, null);
                        byte[] LIZ12 = C61360O6i.LIZ(LJIILIIL, str2);
                        if (LIZ12 != null) {
                            StringBuilder LIZ13 = X1D.LIZ();
                            LIZ13.append("data:image/gif;base64,");
                            LIZ13.append(Base64.encodeToString(LIZ12, 2));
                            ?? LIZ14 = W5P.LIZLLL(UriProtector.parse(X1D.LIZIZ(LIZ13))).LIZ();
                            C81705W4v LIZJ2 = W5I.LIZJ();
                            LIZJ2.LIZLLL = LIZ14;
                            LIZJ2.LJII = new IDdS476S0100000_10(c61389O7l, 10);
                            LIZJ2.LJIIJ = false;
                            W4R LIZ15 = LIZJ2.LIZ();
                            C81250Vug c81250Vug2 = new C81250Vug(new C79077V1t(imageView2.getResources()).LIZ());
                            c81250Vug2.LJII(LIZ15);
                            Drawable LIZJ3 = c81250Vug2.LIZJ();
                            if (LIZJ3 != null) {
                                imageView2.setImageDrawable(LIZJ3);
                            } else {
                                c61389O7l.LIZ();
                            }
                        } else {
                            c61389O7l.LIZ();
                        }
                    } else {
                        C61363O6l.LIZIZ(LIZIZ3, null);
                        byte[] LIZ16 = C61360O6i.LIZ(LJIILIIL, str2);
                        if (LIZ16 != null) {
                            int LJIIJJI2 = KL2.LJIIJJI(LIZIZ3);
                            int LJIIIZ2 = KL2.LJIIIZ(LIZIZ3);
                            if (LJIIJJI2 <= 0 || LJIIIZ2 <= 0) {
                                decodeByteArray = BitmapFactory.decodeByteArray(LIZ16, 0, LIZ16.length);
                            } else {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                decodeByteArray = BitmapFactory.decodeByteArray(LIZ16, 0, LIZ16.length, options2);
                                int i10 = options2.outWidth / 2;
                                int i11 = options2.outHeight / 2;
                                int i12 = 1;
                                while (i10 / i12 >= LJIIJJI2 && i11 / i12 >= LJIIIZ2) {
                                    i12 *= 2;
                                }
                                options2.inSampleSize = i12;
                                options2.inJustDecodeBounds = false;
                                options2.inPurgeable = true;
                                options2.inInputShareable = true;
                                try {
                                    decodeByteArray = BitmapFactory.decodeByteArray(LIZ16, 0, LIZ16.length, options2);
                                } catch (Exception e3) {
                                    C78983UzD.LJIIZILJ(e3);
                                }
                            }
                            if (decodeByteArray == null) {
                                c61389O7l.LIZ();
                            } else {
                                imageView2.setImageBitmap(decodeByteArray);
                            }
                        } else {
                            c61389O7l.LIZ();
                        }
                    }
                }
            }
            try {
                if (o7e.LLFZ == 0) {
                    LJIIL(o7e);
                }
                this.LJLJL.setVisibility(0);
                if (o7e.LLD == 3 && o7e.LJIILL()) {
                    this.LLD = true;
                    this.LJLJLLL.setVisibility(0);
                    this.LJLJLLL.setOnTouchListener(new IDTListenerS91S0200000_10(this, o7e, 1));
                    if (!C78886Uxe.LJJIIZI(o7e.LJLLLL)) {
                        this.LJLLI.setText(o7e.LJLLLL);
                    } else {
                        int i13 = C61359O6h.LJIJJLI;
                        if (i13 != 0) {
                            this.LJLLI.setText(i13);
                        } else {
                            this.LJLLI.setText(com.zhiliaoapp.musically.R.string.rig);
                        }
                    }
                    this.LJLJLLL.post(new ARunnableS29S0200000_10(o7e, this, 44));
                }
                this.LJLLJ.addOnLayoutChangeListener(new O7X(this));
            } catch (Exception unused) {
                LJIILIIL();
                ((O7F) this.LLII).LIZJ();
            }
        }
        C1DJ.LJIJI(o7e.LJLL, "binding data failed, check if there are errors in splash ad json");
        return false;
        this.LLIFFJFJJ = o7e;
        this.LLFF = o7e.LJIIIIZZ();
        long j = o7e.LJLL;
        StringBuilder LIZ17 = X1D.LIZ();
        LIZ17.append("binding data success, total show time of ad is ");
        C1DJ.LJIJI(j, C0H1.LIZJ(LIZ17, this.LLFF, " ms", LIZ17));
        setupUIWidgets(o7e);
        int i14 = o7e.LLJILJIL;
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    if (i14 != 4) {
                        if (i14 != 5) {
                            this.LLIIL = null;
                        } else if (!o7e.LJIILL()) {
                            this.LJLILLLLZI.setBackgroundColor(-16777216);
                            this.LLIIL = new O7Y(this);
                        }
                    } else {
                        this.LLIIL = new O7Z(this);
                    }
                } else {
                    this.LLIIL = new C61392O7o(this);
                }
            } else {
                this.LLIIL = new C61381O7d(this);
            }
        } else {
            this.LLIIL = new C61391O7n(this);
        }
        if (this.LLIIL != null) {
            this.LLIIJLIL = new GestureDetector(getContext(), this.LLIIL);
        }
        if (TextUtils.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1) {
            z = true;
        } else {
            z = false;
        }
        O7V o7v = o7e.LLILII;
        O8D o8d = o7e.LLIL;
        if (o8d == null || o8d.LIZIZ == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (o7v != null && (o7v.LJIIIIZZ & 2) != 0 && z2 && z) {
            this.LJLLJ.setLayoutDirection(0);
        }
        this.LLIIZ = new C61386O7i(getContext(), o7e, this.LJLILLLLZI, new O87(this));
        C61359O6h.LJ().LIZLLL(this.LLIFFJFJJ);
        LinearLayout linearLayout = this.LLIIZ.LIZLLL;
        if (linearLayout != null) {
            asList = Arrays.asList(this.LJLJJL, this.LJLLL, this.LJLJJLL, linearLayout, this.LJZ, this.LJZI, this.LJZL);
        } else {
            asList = Arrays.asList(this.LJLJJL, this.LJLLL, this.LJLJJLL, this.LJZ, this.LJZI, this.LJZL);
        }
        C61359O6h.LJ().LJ(this, asList);
        if (o7e.LLFZ == 0 && o7e.LL != 1) {
            LJIIIZ(this.LLIFFJFJJ.LJIIIIZZ());
        }
        return true;
    }

    public final GradientDrawable LJ(int i) {
        GradientDrawable LIZIZ = T28.LIZIZ(0);
        float f = i;
        LIZIZ.setCornerRadii(new float[]{C61384O7g.LIZIZ(getContext(), f), C61384O7g.LIZIZ(getContext(), f), C61384O7g.LIZIZ(getContext(), f), C61384O7g.LIZIZ(getContext(), f), C61384O7g.LIZIZ(getContext(), f), C61384O7g.LIZIZ(getContext(), f), C61384O7g.LIZIZ(getContext(), f), C61384O7g.LIZIZ(getContext(), f)});
        return LIZIZ;
    }

    public final CharSequence LJI(int i) {
        int i2;
        if (i < 0) {
            i = 0;
        }
        O7E o7e = this.LLIFFJFJJ;
        O8D o8d = o7e.LLIL;
        if (o8d != null) {
            if (o8d.LIZIZ == 3) {
                if (o7e.LJIIJ()) {
                    return LJFF(this.LLIIIILZ, "#4DFFFFFF", 14, 18, C16880lQ.LLLZ("%02d%s", new Object[]{Integer.valueOf(i), this.LLIIIJ}));
                }
                if (this.LLIFFJFJJ.LIZLLL()) {
                    int i3 = (int) (this.LLFF / 1000);
                    O7V o7v = this.LLIFFJFJJ.LLILII;
                    if (o7v != null) {
                        i2 = o7v.LJII;
                    } else {
                        i2 = 0;
                    }
                    if (i > i3 - i2) {
                        return LJFF("Ad", "#4DFFFFFF", 14, 18, C16880lQ.LLLZ("%02d%s", new Object[]{Integer.valueOf(i), this.LLIIIJ}));
                    }
                    return LJFF(this.LLIIIILZ, "#4DFFFFFF", 14, 18, C16880lQ.LLLZ("%02d%s", new Object[]{Integer.valueOf(i), this.LLIIIJ}));
                }
                return this.LLIIIILZ;
            }
            if (o8d.LIZIZ == 2) {
                if (this.LLF) {
                    String LLLZ = C16880lQ.LLLZ("%d%s", new Object[]{Integer.valueOf(i), this.LLIIIJ});
                    if (this.LLIFFJFJJ.LJIILL()) {
                        return LJFF(LLLZ, "#66222222", 13, 16, this.LLIIIILZ);
                    }
                    return LJFF(LLLZ, "#66F8F8F8", 13, 16, this.LLIIIILZ);
                }
                return this.LLIIIILZ;
            }
        }
        if (this.LLF) {
            if (TextUtils.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1) {
                return C16880lQ.LLLZ("%s %s%s", new Object[]{this.LLIIIILZ, Integer.valueOf(i), this.LLIIIJ});
            }
            return C16880lQ.LLLZ("%s%s %s", new Object[]{Integer.valueOf(i), this.LLIIIJ, this.LLIIIILZ});
        }
        return this.LLIIIILZ;
    }

    public final void LJII(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bda_splash_render_duration", System.currentTimeMillis() - this.LL);
            O8O.LIZLLL().LJII("bda_splash_render_duration", i, jSONObject, null);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final ObjectAnimator LJIIIIZZ(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "y", view.getY(), view.getY() - C61384O7g.LIZIZ(getContext(), 30.0f));
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public final void LJIIIZ(long j) {
        if (C61359O6h.LJII().LJIIJ) {
            RunnableC61382O7e runnableC61382O7e = new RunnableC61382O7e(j, 0, this);
            if (isAttachedToWindow()) {
                runnableC61382O7e.run();
            } else {
                post(runnableC61382O7e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(boolean r13) {
        /*
            r12 = this;
            boolean r0 = r12.LLFII
            if (r0 == 0) goto L5
            return
        L5:
            r12.LJIILIIL()
            com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer r0 = r12.LLIIIZ
            if (r0 == 0) goto L12
            r0.cancel()
            r0 = 0
            r12.LLIIIZ = r0
        L12:
            X.O7N r0 = X.C61359O6h.LJII()
            boolean r0 = r0.LJIIJ
            r8 = 1
            if (r0 == 0) goto L5f
            X.O7E r0 = r12.LLIFFJFJJ
            boolean r0 = r0.LJIILJJIL()
            if (r0 == 0) goto L5f
            boolean r0 = r12.LLILLJJLI
            if (r0 != 0) goto L5f
            if (r13 != 0) goto L33
            X.O7m r0 = r12.LLIL
            if (r0 == 0) goto L5f
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L5f
        L33:
            r12.LLILLJJLI = r8
            X.O7E r1 = r12.LLIFFJFJJ
            int r0 = r1.LJZI
            r2 = 0
            if (r0 != r8) goto L75
            long r0 = r1.LJIIIIZZ()
        L40:
            int r2 = (int) r0
        L41:
            X.O7E r0 = r12.LLIFFJFJJ
            X.C1TB.LJII(r2, r0)
            X.O7E r1 = r12.LLIFFJFJJ
            X.O7G r0 = r1.LLI
            if (r0 == 0) goto L5f
            X.O8a r2 = X.C61404O8a.LJFF()
            r3 = 0
            long r4 = r1.LJLL
            X.O7G r0 = r1.LLI
            java.util.List<java.lang.String> r6 = r0.LIZIZ
            java.lang.String r7 = r1.LJLZ
            r9 = -1
            r11 = r3
            r2.LIZJ(r3, r4, r6, r7, r8, r9, r11)
        L5f:
            X.IW3 r0 = r12.LLIIII
            r0.removeMessages(r8)
            X.O6e r1 = r12.LLII
            X.O7E r0 = r12.LLIFFJFJJ
            X.O7F r1 = (X.O7F) r1
            r1.LJFF(r0)
            X.O6e r0 = r12.LLII
            X.O7F r0 = (X.O7F) r0
            r0.LJ()
            return
        L75:
            X.O7m r0 = r12.LLIL
            if (r0 == 0) goto L86
            int r0 = r0.getDuration()
            if (r0 <= 0) goto L86
            X.O7m r0 = r12.LLIL
            int r2 = r0.getDuration()
            goto L41
        L86:
            X.O7E r0 = r12.LLIFFJFJJ
            X.O7G r0 = r0.LLI
            if (r0 == 0) goto L41
            long r0 = r0.LJII
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O7W.LJIIJ(boolean):void");
    }

    @Override // X.IW4
    public final void handleMsg(Message message) {
        int i = message.what;
        if (i == 1) {
            if (!this.LLFII && C61359O6h.LJII().LJIIIZ && !C61359O6h.LJII().LJIIJ && this.LLIL != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap.put("duration", Long.toString(this.LLIL.getCurrentPosition()));
                hashMap.put("percent", Integer.valueOf(O8V.LIZ(this.LLIL.getCurrentPosition(), this.LLIL.getDuration())));
                hashMap.put("break_reason", 9);
                hashMap2.put("break_reason", 9);
                hashMap2.put("play_order", 1);
                O79.LIZIZ().LJI(this.LLIFFJFJJ, 0L, "play_break", hashMap, hashMap2);
                C61359O6h.LJ().LJII();
            }
            LJIIJ(false);
            return;
        }
        if (i != 2) {
            return;
        }
        int i2 = this.LLIIIL - 1;
        this.LLIIIL = i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("splash count down. display seconds left: ");
        LIZ.append(this.LLIIIL);
        X1D.LIZIZ(LIZ);
        if (i2 == 0) {
            PthreadTimer pthreadTimer = this.LLIIIZ;
            if (pthreadTimer != null) {
                pthreadTimer.cancel();
                this.LLIIIZ = null;
                return;
            }
            return;
        }
        if (this.LJLLLL.getVisibility() == 0 && this.LLF) {
            this.LJLLLL.setText(LJI(i2));
        }
        String str = "";
        if (this.LJLZ.getVisibility() == 0) {
            C53952LFk c53952LFk = this.LJLZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(i2);
            c53952LFk.setText(X1D.LIZIZ(LIZ2));
        }
        if (this.LJZ.getVisibility() != 0) {
            return;
        }
        O7E o7e = this.LLIFFJFJJ;
        if (o7e.LLJILJIL != 5) {
            return;
        }
        TextView textView = this.LJZ;
        String str2 = o7e.LLJILJILJ;
        String LIZLLL = C72972SkS.LIZLLL(i2, "");
        if (!TextUtils.isEmpty(str2)) {
            str = str2.replace("%", LIZLLL);
        }
        textView.setText(str);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        InterfaceC61390O7m interfaceC61390O7m;
        super.onWindowFocusChanged(z);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hasWindowFocus: ");
        LIZ.append(z);
        C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
        if (!C61359O6h.LJII().LJIIIZ || z == this.LLILL || (interfaceC61390O7m = this.LLIL) == null || this.LLFII) {
            return;
        }
        this.LLILL = z;
        if (z) {
            interfaceC61390O7m.resume();
        } else {
            interfaceC61390O7m.pause();
        }
    }

    public void setSplashAdInteraction(InterfaceC61356O6e interfaceC61356O6e) {
        this.LLII = interfaceC61356O6e;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            LIZLLL();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = 0;
        if (i != 4) {
            if (i != 66) {
                switch (i) {
                    case 24:
                        C61380O7c LIZ = C61380O7c.LIZ();
                        LIZ.LIZJ = false;
                        PthreadTimer pthreadTimer = LIZ.LIZIZ;
                        if (pthreadTimer != null) {
                            pthreadTimer.cancel();
                            LIZ.LIZIZ = null;
                            break;
                        }
                        break;
                    case 25:
                        C61380O7c LIZ2 = C61380O7c.LIZ();
                        LIZ2.LIZJ = false;
                        PthreadTimer pthreadTimer2 = LIZ2.LIZIZ;
                        if (pthreadTimer2 != null) {
                            pthreadTimer2.cancel();
                            LIZ2.LIZIZ = null;
                            break;
                        }
                        break;
                }
            }
            if (this.LLIFFJFJJ.LJIIJ()) {
                O7E o7e = this.LLIFFJFJJ;
                int i3 = o7e.LLFZ;
                if (i3 != 0 && i3 != 1) {
                    if (i3 == 2) {
                        LIZJ(o7e, 0.0f, 0.0f);
                    }
                } else {
                    LIZIZ(o7e, 0.0f, 0.0f);
                }
            }
        } else if (this.LLIFFJFJJ.LIZLLL()) {
            long j = this.LLIIIL * 1000;
            long j2 = this.LLFF;
            O7V o7v = this.LLIFFJFJJ.LLILII;
            if (o7v != null) {
                i2 = o7v.LJII;
            }
            if (j <= j2 - (i2 * 1000)) {
                LJIILJJIL();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void LIZIZ(O7E o7e, float f, float f2) {
        String str;
        C1DJ.LJIJI(o7e.LJLL, "click ad");
        if (this.LLD) {
            str = "click_normal_area";
        } else {
            str = "";
        }
        C61402O7y c61402O7y = new C61402O7y();
        c61402O7y.LIZ = 0;
        c61402O7y.LJ = new Point((int) f, (int) f2);
        c61402O7y.LIZLLL = this.LLD;
        c61402O7y.LIZJ = str;
        if (((O7F) this.LLII).LIZLLL(o7e, new C61395O7r(c61402O7y))) {
            LJIILIIL();
        }
        ((O7F) this.LLII).LJ();
    }

    public final void LIZJ(O7E o7e, float f, float f2) {
        JSONObject jSONObject;
        C1DJ.LJIJI(o7e.LJLL, "click ad");
        C61402O7y c61402O7y = new C61402O7y();
        c61402O7y.LIZIZ = true;
        c61402O7y.LJ = new Point((int) f, (int) f2);
        InterfaceC61356O6e interfaceC61356O6e = this.LLII;
        C61395O7r c61395O7r = new C61395O7r(c61402O7y);
        O7F o7f = (O7F) interfaceC61356O6e;
        o7f.getClass();
        List<C59762Ncs> LIZ = O7F.LIZ(o7e.LJLLILLLL, o7e.LJLLL, o7e.LJZ);
        if (C30591Hz.LJIJJ(LIZ)) {
            C59760Ncq LJFF = o7e.LJFF();
            LJFF.LIZLLL = LIZ;
            o7f.LIZ.LIZLLL(LJFF);
            String str = null;
            try {
                Point point = c61395O7r.LIZJ;
                jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
                jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                jSONObject.put("ad_fetch_time", o7e.LJLILLLLZI);
                if (!C78886Uxe.LJJIIZI(o7e.LJLZ)) {
                    jSONObject.put("log_extra", o7e.LJLZ);
                }
                jSONObject.putOpt("is_ad_event", "1");
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (TextUtils.isEmpty(null)) {
                if (c61395O7r.LIZIZ) {
                    str = "click";
                } else {
                    str = "banner_click";
                }
            }
            O79.LIZIZ().LIZLLL("splash_ad", str, jSONObject, o7e.LJLL);
            C61359O6h.LJ().LJIIIZ();
            if (o7e.LLI != null) {
                C61404O8a.LJFF().LIZIZ(null, o7e.LJLL, o7e.LLIIIILZ, o7e.LJLZ, true, -1L, null);
            }
            o7f.LIZIZ();
            LJIILIIL();
            this.LLFFF = 1;
            if (this.LLIL != null) {
                LJIILL();
            }
        }
        ((O7F) this.LLII).LJ();
    }

    public final SpannableString LJFF(String str, String str2, int i, int i2, String str3) {
        SpannableString spannableString = new SpannableString(a1.LJ(str, " | ", str3));
        spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, str.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i, true), str.length(), str.length() + 3, 33);
        spannableString.setSpan(new ForegroundColorSpan(ColorProtector.parseColor(str2)), str.length(), str.length() + 3, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), str.length() + 3, spannableString.length(), 33);
        int max = Math.max(18, Math.max(i, i2));
        spannableString.setSpan(new C74070T5e((int) C61384O7g.LIZIZ(getContext(), (-Math.abs(max - 18)) / 2)), 0, str.length(), 33);
        spannableString.setSpan(new C74070T5e((int) C61384O7g.LIZIZ(getContext(), (-Math.abs(max - i)) / 2)), str.length(), str.length() + 3, 33);
        spannableString.setSpan(new C74070T5e((int) C61384O7g.LIZIZ(getContext(), (-Math.abs(max - i2)) / 2)), str.length() + 3, spannableString.length(), 33);
        return spannableString;
    }
}
