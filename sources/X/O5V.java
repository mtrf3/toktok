package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes11.dex */
public class O5V extends WebView {
    public O5W LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public QO2 LJLJJI;
    public Activity LJLJJL;
    public final C60174NjW LJLJJLL;
    public final O5U LJLJL;

    public final void LIZ(O5W o5w) {
        this.LJLIL = o5w;
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setTextZoom(100);
        if (OIP.LIZ.LIZ.LIZ.equals("boe")) {
            settings.setMixedContentMode(0);
        }
        try {
            setOverScrollMode(2);
        } catch (Throwable unused) {
        }
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        if (C61349O5x.LIZ()) {
            setWebChromeClient(this.LJLJJLL);
        }
        O5U o5u = this.LJLJL;
        if (C52300Kfo.LIZ() && o5u != null) {
            WebSettings settings2 = getSettings();
            String userAgentString = settings2.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                settings2.setUserAgentString(userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
        setWebViewClient(C78688UuS.LJJIZ(o5u));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        QO2 qo2 = this.LJLJJI;
        if (qo2 != null) {
            qo2.LIZ(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTouchListener(QO2 qo2) {
        this.LJLJJI = qo2;
    }

    public void setParentActivity(Activity activity) {
        this.LJLJJL = activity;
    }

    public O5V(Context context, AttributeSet attributeSet) {
        super(Build.VERSION.SDK_INT <= 22 ? context.createConfigurationContext(new Configuration()) : context, attributeSet);
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        this.LJLJJLL = new C60174NjW();
        this.LJLJL = new O5U(this);
    }
}
