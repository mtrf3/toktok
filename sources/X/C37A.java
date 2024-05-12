package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import defpackage.a1;

/* renamed from: X.37A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37A extends FrameLayout {
    public boolean LJLIL;
    public Aweme LJLILLLLZI;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final Aweme getAweme() {
        return this.LJLILLLLZI;
    }

    public final boolean getTouchToGone() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AwemeRawAd awemeRawAd;
        if (this.LJLIL) {
            setVisibility(8);
            ITopViewAdEventLogger LJJIJ = TopViewAdEventLogger.LJJIJ();
            NMA.LIZ.getClass();
            C58653N0f c58653N0f = NMA.LJIJJ;
            Aweme aweme = this.LJLILLLLZI;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            LJJIJ.LJI(c58653N0f, awemeRawAd);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setAweme(Aweme aweme) {
        this.LJLILLLLZI = aweme;
    }

    public final void setTouchToGone(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = true;
    }
}
