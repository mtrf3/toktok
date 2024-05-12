package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebSettings;

/* loaded from: classes11.dex */
public class O5Z extends C61182Nzm {
    public boolean needCleanRadius;
    public Paint paint;
    public Path path;
    public float radius;
    public float radiusBottomLeft;
    public float radiusBottomRight;
    public float radiusTopLeft;
    public float radiusTopRight;
    public RectF rect;

    @Override // X.C61182Nzm, android.webkit.WebView
    public boolean canGoBack() {
        return com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(this);
    }

    public boolean com_bytedance_android_livesdk_browser_view_RoundRectWebView__canGoBack$___twin___() {
        return super.canGoBack();
    }

    @Override // X.C61182Nzm, android.webkit.WebView
    public void goBack() {
        com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(this);
    }

    @Override // X.C61182Nzm, android.webkit.WebView
    public void loadUrl(String str) {
        com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str);
    }

    @Override // X.C61182Nzm, android.webkit.WebView
    public void loadUrl(String str, java.util.Map map) {
        com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str, map);
    }

    private void init() {
        VMI.LJ.LJIJJLI(this);
        this.path = new Path();
        this.rect = new RectF();
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(0);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public void com_bytedance_android_livesdk_browser_view_RoundRectWebView__goBack$___twin___() {
        VMI.LJ.LJ(this);
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        VMI.LJ.LJIIL(this);
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        VMI.LJ.LJI(this);
        super.onAttachedToWindow();
    }

    @Override // X.C61182Nzm, android.webkit.WebView
    public void reload() {
        VMI.LJ.LJIILIIL(this);
        super.reload();
    }

    public O5Z(Context context) {
        super(context);
        init();
        if (C52300Kfo.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                C16880lQ.LLZL(settings, userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
    }

    public static boolean com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(O5Z o5z) {
        if (o5z.com_bytedance_android_livesdk_browser_view_RoundRectWebView__canGoBack$___twin___() && C59312NPo.LIZIZ(o5z)) {
            return true;
        }
        return false;
    }

    public static void com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(O5Z o5z) {
        if (C59312NPo.LJ(o5z)) {
            return;
        }
        o5z.com_bytedance_android_livesdk_browser_view_RoundRectWebView__goBack$___twin___();
    }

    public void com_bytedance_android_livesdk_browser_view_RoundRectWebView__loadUrl$___twin___(String str) {
        VMI.LJ.LIZLLL(this, str);
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.radius != 0.0f) {
            this.rect.set(0.0f, getScrollY(), getWidth(), getHeight() + getScrollY());
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            Path path = this.path;
            RectF rectF = this.rect;
            float f = this.radius;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
            return;
        }
        if (this.radiusTopLeft != 0.0f || this.radiusTopRight != 0.0f || this.radiusBottomRight != 0.0f || this.radiusBottomLeft != 0.0f) {
            this.rect.set(0.0f, getScrollY(), getWidth(), getHeight() + getScrollY());
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            float f2 = this.radiusTopLeft;
            float f3 = this.radiusTopRight;
            float f4 = this.radiusBottomRight;
            float f5 = this.radiusBottomLeft;
            this.path.addRoundRect(this.rect, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
            return;
        }
        if (!this.needCleanRadius) {
            return;
        }
        this.rect.set(0.0f, getScrollY(), getWidth(), getHeight() + getScrollY());
        this.path.reset();
        this.path.setFillType(Path.FillType.INVERSE_WINDING);
        this.path.addRoundRect(this.rect, 0.0f, 0.0f, Path.Direction.CW);
        canvas.drawPath(this.path, this.paint);
    }

    public void setRadius(float f) {
        this.radius = f;
        this.needCleanRadius = true;
        invalidate();
    }

    public O5Z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public static void com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(O5Z o5z, String str) {
        String LIZLLL = C59312NPo.LIZ.LIZLLL(o5z, str);
        if (!TextUtils.isEmpty(LIZLLL)) {
            str = LIZLLL;
        }
        o5z.com_bytedance_android_livesdk_browser_view_RoundRectWebView__loadUrl$___twin___(str);
    }

    public void com_bytedance_android_livesdk_browser_view_RoundRectWebView__loadUrl$___twin___(String str, java.util.Map<String, String> map) {
        VMI.LJ.LIZLLL(this, str);
        super.loadUrl(str, map);
    }

    public O5Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
        if (C52300Kfo.LIZ()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                C16880lQ.LLZL(settings, userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
    }

    public static void com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(O5Z o5z, String str, java.util.Map map) {
        String LIZLLL = C59312NPo.LIZ.LIZLLL(o5z, str);
        if (!TextUtils.isEmpty(LIZLLL)) {
            str = LIZLLL;
        }
        o5z.com_bytedance_android_livesdk_browser_view_RoundRectWebView__loadUrl$___twin___(str, map);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.radius = 0.0f;
        this.radiusTopLeft = f;
        this.radiusTopRight = f2;
        this.radiusBottomRight = f3;
        this.radiusBottomLeft = f4;
        this.needCleanRadius = true;
        invalidate();
    }
}
