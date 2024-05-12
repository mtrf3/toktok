package X;

import Y.ARunnableS12S1100000_11;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m43.u;

/* loaded from: classes12.dex */
public class Q6Y extends Q6Z {
    public boolean LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public Q5W LJLLILLLL;
    public final String LJLLJ;
    public boolean LJLLL;
    public EnumC66451Q6d LJLLLL;
    public EnumC66449Q6b LJLLLLLL;
    public long LJLZ;
    public C81273Vv3 LJZ;
    public C66448Q6a LJZI;
    public LoginManager LJZL;
    public Float LL;
    public int LLD;
    public final String LLF;
    public Q8K LLFF;

    @Override // X.Q6Z
    public int getDefaultStyleResource() {
        return R.style.a5v;
    }

    public int getLoginButtonContinueLabel() {
        return R.string.dh7;
    }

    public String getAuthType() {
        return this.LJLLILLLL.LIZLLL;
    }

    public Q5V getDefaultAudience() {
        return this.LJLLILLLL.LIZ;
    }

    public Q5O getLoginBehavior() {
        return this.LJLLILLLL.LIZJ;
    }

    public LoginManager getLoginManager() {
        if (this.LJZL == null) {
            this.LJZL = LoginManager.LJIIIZ.LIZ();
        }
        return this.LJZL;
    }

    public Q5I getLoginTargetApp() {
        return this.LJLLILLLL.LJ;
    }

    public String getMessengerPageId() {
        return this.LJLLILLLL.LJFF;
    }

    public Q5B getNewLoginClickListener() {
        return new Q5B(this);
    }

    public List<String> getPermissions() {
        return this.LJLLILLLL.LIZIZ;
    }

    public boolean getResetMessengerState() {
        return this.LJLLILLLL.LJI;
    }

    public boolean getShouldSkipAccountDeduplication() {
        this.LJLLILLLL.getClass();
        return false;
    }

    public final void LJIIIIZZ() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (this.LL == null) {
                return;
            }
            Drawable background = getBackground();
            if (Build.VERSION.SDK_INT >= 29 && (background instanceof StateListDrawable)) {
                StateListDrawable stateListDrawable = (StateListDrawable) background;
                for (int i = 0; i < stateListDrawable.getStateCount(); i++) {
                    GradientDrawable gradientDrawable = (GradientDrawable) stateListDrawable.getStateDrawable(i);
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius(this.LL.floatValue());
                    }
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(this.LL.floatValue());
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJIIIZ() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode()) {
                AccessToken.Companion.getClass();
                if (C66382Q3m.LIZJ()) {
                    String str = this.LJLLI;
                    if (str == null) {
                        str = resources.getString(R.string.dh_);
                    }
                    setText(str);
                    return;
                }
            }
            String str2 = this.LJLL;
            if (str2 != null) {
                setText(str2);
                return;
            }
            String string = resources.getString(getLoginButtonContinueLabel());
            int width = getWidth();
            if (width != 0 && LJI(string) > width) {
                string = resources.getString(R.string.dh6);
            }
            setText(string);
        } catch (Throwable unused) {
        }
    }

    @Override // X.Q6Z
    public int getDefaultRequestCode() {
        if (C40700FyC.LIZ(this)) {
            return 0;
        }
        try {
            return Q5U.Login.toRequestCode();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // X.Q6Z, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            C66448Q6a c66448Q6a = this.LJZI;
            if (c66448Q6a != null && !c66448Q6a.LIZJ) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                c66448Q6a.LIZIZ.LIZIZ(c66448Q6a.LIZ, intentFilter);
                c66448Q6a.LIZJ = true;
                LJIIIZ();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            C66448Q6a c66448Q6a = this.LJZI;
            if (c66448Q6a != null && c66448Q6a.LIZJ) {
                c66448Q6a.LIZIZ.LIZLLL(c66448Q6a.LIZ);
                c66448Q6a.LIZJ = false;
            }
            C81273Vv3 c81273Vv3 = this.LJZ;
            if (c81273Vv3 != null) {
                c81273Vv3.LIZ();
                this.LJZ = null;
            }
        } catch (Throwable unused) {
        }
    }

    public Q8K getCallbackManager() {
        return this.LLFF;
    }

    public String getLoggerID() {
        return this.LLF;
    }

    public long getToolTipDisplayTime() {
        return this.LJLZ;
    }

    public EnumC66449Q6b getToolTipMode() {
        return this.LJLLLLLL;
    }

    public Q6Y(Context context) {
        super(context);
        this.LJLLILLLL = new Q5W();
        this.LJLLJ = "fb_login_view_usage";
        this.LJLLLL = EnumC66451Q6d.BLUE;
        this.LJLZ = 6000L;
        this.LLD = 255;
        this.LLF = UUID.randomUUID().toString();
        this.LLFF = null;
    }

    public final void LJFF(String str) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            C81273Vv3 c81273Vv3 = new C81273Vv3(this, str);
            this.LJZ = c81273Vv3;
            EnumC66451Q6d enumC66451Q6d = this.LJLLLL;
            if (!C40700FyC.LIZ(c81273Vv3)) {
                try {
                    c81273Vv3.LJFF = enumC66451Q6d;
                } catch (Throwable unused) {
                }
            }
            C81273Vv3 c81273Vv32 = this.LJZ;
            long j = this.LJLZ;
            c81273Vv32.getClass();
            if (!C40700FyC.LIZ(c81273Vv32)) {
                try {
                    c81273Vv32.LJI = j;
                } catch (Throwable unused2) {
                }
            }
            this.LJZ.LIZIZ();
        } catch (Throwable unused3) {
        }
    }

    public final int LJI(String str) {
        int ceil;
        if (C40700FyC.LIZ(this)) {
            return 0;
        }
        try {
            if (!C40700FyC.LIZ(this)) {
                try {
                    ceil = (int) Math.ceil(getPaint().measureText(str));
                } catch (Throwable unused) {
                }
                return getCompoundPaddingLeft() + getCompoundDrawablePadding() + ceil + getCompoundPaddingRight();
            }
            ceil = 0;
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + ceil + getCompoundPaddingRight();
        } catch (Throwable unused2) {
            return 0;
        }
    }

    @Override // X.Q6Z, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            super.onDraw(canvas);
            if (!this.LJLLL && !isInEditMode()) {
                this.LJLLL = true;
                if (!C40700FyC.LIZ(this)) {
                    int i = C66450Q6c.LIZ[this.LJLLLLLL.ordinal()];
                    if (i == 1) {
                        u.LJ().execute(new ARunnableS12S1100000_11(this, C66373Q3d.LJIILIIL(getContext()), 6));
                    } else if (i == 2) {
                        LJFF(getResources().getString(R.string.dhj));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setAuthType(String str) {
        this.LJLLILLLL.LIZLLL = str;
    }

    public void setDefaultAudience(Q5V q5v) {
        this.LJLLILLLL.LIZ = q5v;
    }

    public void setLoginBehavior(Q5O q5o) {
        this.LJLLILLLL.LIZJ = q5o;
    }

    public void setLoginManager(LoginManager loginManager) {
        this.LJZL = loginManager;
    }

    public void setLoginTargetApp(Q5I q5i) {
        this.LJLLILLLL.LJ = q5i;
    }

    public void setLoginText(String str) {
        this.LJLL = str;
        LJIIIZ();
    }

    public void setLogoutText(String str) {
        this.LJLLI = str;
        LJIIIZ();
    }

    public void setMessengerPageId(String str) {
        this.LJLLILLLL.LJFF = str;
    }

    public void setPermissions(String... strArr) {
        this.LJLLILLLL.LIZIZ = Arrays.asList(strArr);
    }

    public void setProperties(Q5W q5w) {
        this.LJLLILLLL = q5w;
    }

    public void setPublishPermissions(String... strArr) {
        this.LJLLILLLL.LIZIZ = Arrays.asList(strArr);
    }

    public void setReadPermissions(String... strArr) {
        this.LJLLILLLL.LIZIZ = Arrays.asList(strArr);
    }

    public void setResetMessengerState(boolean z) {
        this.LJLLILLLL.LJI = z;
    }

    public void setToolTipDisplayTime(long j) {
        this.LJLZ = j;
    }

    public void setToolTipMode(EnumC66449Q6b enumC66449Q6b) {
        this.LJLLLLLL = enumC66449Q6b;
    }

    public void setToolTipStyle(EnumC66451Q6d enumC66451Q6d) {
        this.LJLLLL = enumC66451Q6d;
    }

    public void setPermissions(List<String> list) {
        this.LJLLILLLL.LIZIZ = list;
    }

    public void setPublishPermissions(List<String> list) {
        this.LJLLILLLL.LIZIZ = list;
    }

    public void setReadPermissions(List<String> list) {
        this.LJLLILLLL.LIZIZ = list;
    }

    @Override // X.Q6Z
    public final void LIZ(Context context, int i) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            super.LIZ(context, i);
            setInternalOnClickListener(getNewLoginClickListener());
            LJII(context, i);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(R.color.gj));
                this.LJLL = "Continue with Facebook";
            } else {
                this.LJZI = new C66448Q6a(this);
            }
            LJIIIZ();
            LJIIIIZZ();
            if (!C40700FyC.LIZ(this)) {
                try {
                    getBackground().setAlpha(this.LLD);
                } catch (Throwable unused) {
                }
            }
            if (!C40700FyC.LIZ(this)) {
                setCompoundDrawablesWithIntrinsicBounds(C20110qd.LIZ(getContext(), R.drawable.aa1), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } catch (Throwable unused2) {
        }
    }

    public final void LJII(Context context, int i) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            this.LJLLLLLL = EnumC66449Q6b.DEFAULT;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.a53, R.attr.a57, R.attr.a58, R.attr.a59, R.attr.a5_, R.attr.a5e}, 0, i);
            try {
                this.LJLJLLL = obtainStyledAttributes.getBoolean(0, true);
                this.LJLL = C16880lQ.LLLZLZ(obtainStyledAttributes, 3);
                this.LJLLI = C16880lQ.LLLZLZ(obtainStyledAttributes, 4);
                this.LJLLLLLL = EnumC66449Q6b.fromInt(obtainStyledAttributes.getInt(5, EnumC66449Q6b.DEFAULT.getValue()));
                if (obtainStyledAttributes.hasValue(1)) {
                    this.LL = Float.valueOf(obtainStyledAttributes.getDimension(1, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(2, 255);
                this.LLD = integer;
                if (integer < 0) {
                    this.LLD = 0;
                }
                if (this.LLD > 255) {
                    this.LLD = 255;
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int i3 = 0;
            if (!C40700FyC.LIZ(this)) {
                try {
                    Resources resources2 = getResources();
                    String str = this.LJLL;
                    if (str == null) {
                        str = resources2.getString(R.string.dh7);
                        int LJI = LJI(str);
                        if (Button.resolveSize(LJI, i) < LJI) {
                            str = resources2.getString(R.string.dh6);
                        }
                    }
                    i3 = LJI(str);
                } catch (Throwable unused) {
                }
            }
            String str2 = this.LJLLI;
            if (str2 == null) {
                str2 = resources.getString(R.string.dh_);
            }
            setMeasuredDimension(Button.resolveSize(Math.max(i3, LJI(str2)), i), compoundPaddingTop);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C81273Vv3 c81273Vv3;
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            super.onVisibilityChanged(view, i);
            if (i != 0 && (c81273Vv3 = this.LJZ) != null) {
                c81273Vv3.LIZ();
                this.LJZ = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            LJIIIZ();
        } catch (Throwable unused) {
        }
    }
}
