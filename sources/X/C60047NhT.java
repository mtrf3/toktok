package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;

/* renamed from: X.NhT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60047NhT extends SJC {
    public final /* synthetic */ AwesomeSplashNewMask LJLIL;

    public C60047NhT(AwesomeSplashNewMask awesomeSplashNewMask) {
        this.LJLIL = awesomeSplashNewMask;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLIL.getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        AwesomeSplashNewMask awesomeSplashNewMask;
        Aweme aweme;
        String str;
        AwemeRawAd awemeRawAd;
        String openUrl;
        AwesomeSplashNewMask awesomeSplashNewMask2 = this.LJLIL;
        awesomeSplashNewMask2.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - awesomeSplashNewMask2.LJLLLLLL;
        awesomeSplashNewMask2.LJLLLLLL = currentTimeMillis;
        if ((1 > j || j >= 500) && (aweme = (awesomeSplashNewMask = this.LJLIL).LJLJJL) != null && C63081OpJ.LLIIII(aweme)) {
            Aweme aweme2 = awesomeSplashNewMask.LJLJJL;
            if (aweme2 != null && C63081OpJ.LLJJ(aweme2)) {
                C26045AKb c26045AKb = new C26045AKb(awesomeSplashNewMask);
                c26045AKb.LJIIIIZZ(R.string.b95);
                c26045AKb.LJIIJ();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("【click】clickAwesomeSplash() with:, aweme = [");
                Aweme aweme3 = awesomeSplashNewMask.LJLJJL;
                if (aweme3 != null) {
                    str = aweme3.getAid();
                } else {
                    str = null;
                }
                LIZ.append(str);
                LIZ.append(']');
                X1D.LIZIZ(LIZ);
                Aweme aweme4 = awesomeSplashNewMask.LJLJJL;
                if (aweme4 != null && (awemeRawAd = aweme4.getAwemeRawAd()) != null && (openUrl = awemeRawAd.getOpenUrl()) != null && openUrl.length() != 0 && TextUtils.equals(UriProtector.parse(awemeRawAd.getOpenUrl()).getHost(), "challenge")) {
                    C38281F0r c38281F0r = new C38281F0r(awemeRawAd.getOpenUrl());
                    c38281F0r.LIZLLL("extra_challenge_from", "awesome_splash");
                    awemeRawAd.setOpenUrl(c38281F0r.LJ());
                }
                NPU LIZ2 = NW6.LIZ();
                if (LIZ2 != null) {
                    LIZ2.LJJIII(awesomeSplashNewMask.LJLJI, awesomeSplashNewMask.LJLJJL, awesomeSplashNewMask.LJLILLLLZI);
                }
            }
        }
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        if (motionEvent != null && motionEvent2 != null && Math.abs(f) < Math.abs(f2)) {
            ViewParent parent = this.LJLIL.getParent();
            if (motionEvent2.getY() > motionEvent.getY()) {
                z = true;
            } else {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return true;
    }
}
