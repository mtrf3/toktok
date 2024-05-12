package X;

import Y.ARunnableS44S0100000_8;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.VtF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC81161VtF extends RelativeLayout implements View.OnClickListener {
    public final C270714l LJLIL;
    public final ViewConfiguration LJLILLLLZI;
    public final View LJLJI;
    public boolean LJLJJI;
    public final WeakHandler LJLJJL;
    public final Intent LJLJJLL;
    public final long LJLJL;
    public final int LJLJLJ;
    public final long LJLJLLL;
    public final boolean LJLL;
    public final ImageView LJLLI;
    public final boolean LJLLILLLL;
    public final int LJLLJ;
    public final JSONObject LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public RunnableC81163VtH LJLZ;
    public final ARunnableS50S0100000_14 LJZ;
    public final ARunnableS44S0100000_8 LJZI;

    public void setDismissListener(InterfaceC81165VtJ interfaceC81165VtJ) {
    }

    public final void LIZ() {
        View view = this.LJLJI;
        if (view != null) {
            view.animate().translationY(-this.LJLJI.getHeight()).setDuration(300L).start();
        }
        this.LJLJJL.postDelayed(this.LJZI, 300L);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LJLIL.LJIIIIZZ()) {
            postInvalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            this.LJLIL.LIZ();
        } catch (Throwable unused) {
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LJLJJI) {
            this.LJLJJL.post(new ARunnableS50S0100000_14(this, 160));
            this.LJLJJI = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C16880lQ.LIZJ(getContext(), this.LJLJJLL);
        new AnonymousClass078(getContext()).LIZJ(C67230Qa2.getShortMsgID(this.LJLJL), "app_notify_ame");
        this.LJLJJL.removeCallbacks(this.LJZ);
        LIZ();
        QSN.LIZIZ(getContext(), "news_notify_anim_push_click", this.LJLJL, this.LJLJLJ, this.LJLLL);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.LJLIL.LJIJJ(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LJLJJL.removeCallbacks(this.LJZ);
        this.LJLIL.LJIILIIL(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.LJLZ = null;
                    }
                } else if (Math.abs(x - this.LJLLLL) >= this.LJLILLLLZI.getScaledTouchSlop() || Math.abs(y - this.LJLLLLLL) >= this.LJLILLLLZI.getScaledTouchSlop()) {
                    this.LJLZ = null;
                }
            } else {
                if (Math.abs(x - this.LJLLLL) >= this.LJLILLLLZI.getScaledTouchSlop() || Math.abs(y - this.LJLLLLLL) >= this.LJLILLLLZI.getScaledTouchSlop()) {
                    this.LJLZ = null;
                } else {
                    RunnableC81163VtH runnableC81163VtH = this.LJLZ;
                    if (runnableC81163VtH != null) {
                        runnableC81163VtH.run();
                    }
                }
                this.LJLZ = null;
            }
        } else {
            this.LJLLLL = x;
            this.LJLLLLLL = y;
            this.LJLZ = new RunnableC81163VtH(this);
        }
        return true;
    }

    public ViewOnClickListenerC81161VtF(int i, int i2, long j, Context context, Intent intent, Bitmap bitmap, C67230Qa2 c67230Qa2) {
        super(context);
        int i3;
        String LJ;
        String LJ2;
        int i4;
        int i5;
        this.LJLJJI = true;
        this.LJLJJL = new WeakHandler(C16880lQ.LLJJJJ(), new C81164VtI());
        this.LJZ = new ARunnableS50S0100000_14(this, 161);
        this.LJZI = new ARunnableS44S0100000_8(this, 87);
        this.LJLJJLL = intent;
        this.LJLJLJ = i;
        this.LJLLJ = i2;
        this.LJLJL = c67230Qa2.id;
        this.LJLJLLL = j <= 0 ? 5000L : j;
        this.LJLL = "oppo".equalsIgnoreCase(Build.BRAND);
        this.LJLLILLLL = true;
        try {
            JSONObject jSONObject = new JSONObject();
            this.LJLLL = jSONObject;
            jSONObject.put("isWindowMode", 1);
            if (intent.getBooleanExtra("message_with_pic", false)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            jSONObject.put("with_pic", i4);
            if (intent.getBooleanExtra("message_download_pic", false)) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject.put("download_pic", i5);
        } catch (Throwable unused) {
        }
        String str = c67230Qa2.title;
        str = TextUtils.isEmpty(str) ? context.getString(R.string.bri) : str;
        if (!this.LJLL || C67003QRj.LJFF().LJIIL > 0) {
            int i6 = this.LJLLJ;
            if ((i6 == 11 || i6 == 21) && bitmap != null && !c67230Qa2.functionalPush) {
                Calendar calendar = Calendar.getInstance();
                LayoutInflater LLZIL = C16880lQ.LLZIL(context);
                if (this.LJLLJ == 11) {
                    i3 = R.layout.c9f;
                } else {
                    i3 = R.layout.c9g;
                }
                View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, i3, this, false);
                this.LJLJI = LLLLIILL;
                if (this.LJLLJ == 21) {
                    ((TextView) LLLLIILL.findViewById(R.id.title)).setText(str);
                }
                TextView textView = (TextView) LLLLIILL.findViewById(R.id.time);
                StringBuilder LIZ = X1D.LIZ();
                int i7 = calendar.get(11);
                if (i7 > 9) {
                    LJ = String.valueOf(i7);
                } else {
                    LJ = KMP.LJ(CardStruct.IStatusCode.DEFAULT, i7);
                }
                LIZ.append(LJ);
                LIZ.append(":");
                int i8 = calendar.get(12);
                if (i8 > 9) {
                    LJ2 = String.valueOf(i8);
                } else {
                    LJ2 = KMP.LJ(CardStruct.IStatusCode.DEFAULT, i8);
                }
                LIZ.append(LJ2);
                textView.setText(X1D.LIZIZ(LIZ));
                ((TextView) LLLLIILL.findViewById(R.id.mrl)).setText(c67230Qa2.text);
                ((TextView) LLLLIILL.findViewById(R.id.title)).setText(str);
            } else {
                View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bwy, this, false);
                this.LJLJI = LLLLIILL2;
                ((TextView) LLLLIILL2.findViewById(R.id.title)).setText(str);
                ((TextView) LLLLIILL2.findViewById(R.id.desc)).setText(c67230Qa2.text);
            }
        } else {
            View LLLLIILL3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bz0, this, false);
            this.LJLJI = LLLLIILL3;
            ((TextView) LLLLIILL3.findViewById(R.id.time)).setText(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date()));
            ((TextView) LLLLIILL3.findViewById(R.id.title)).setText(str);
            ((TextView) LLLLIILL3.findViewById(R.id.desc)).setText(c67230Qa2.text);
        }
        addView(this.LJLJI);
        ImageView imageView = (ImageView) findViewById(R.id.eiq);
        this.LJLLI = imageView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.b8a);
        }
        this.LJLIL = C270714l.LJIIIZ(this, new C81162VtG(this));
        this.LJLILLLLZI = ViewConfiguration.get(context);
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
    }
}
