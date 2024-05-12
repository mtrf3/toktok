package com.ss.android.ugc.aweme.commercialize.profile;

import X.C16880lQ;
import X.C17N;
import X.C221108m2;
import X.C26338AVi;
import X.C59672NbQ;
import X.C59737NcT;
import X.C62562cu;
import X.C62822Ol8;
import X.IK6;
import X.QD3;
import X.W5F;
import X.W5U;
import Y.ACListenerS30S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class AdNewFakeBottomDescBarWidget extends AbsAdProfileWidget {
    public final boolean LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;

    public AdNewFakeBottomDescBarWidget() {
        this(false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIIZILJ() {
        View view = (View) this.LJLLILLLL.getValue();
        if (view != null) {
            view.animate().translationY(C17N.LJIILL(100.0d)).setDuration(0L).start();
        }
    }

    public final void LJIJ() {
        View view = (View) this.LJLLILLLL.getValue();
        if (view != null) {
            view.animate().translationY(C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)).setDuration(300L).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public AdNewFakeBottomDescBarWidget(boolean z) {
        this.LJLLI = z;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 94));
        this.LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 96));
        this.LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 95));
        this.LJLLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 93));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        super.LJIIL(view);
        LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILJJIL(C59672NbQ c59672NbQ) {
        String str;
        AwemeRawAd awemeRawAd;
        String str2;
        String str3;
        AwemeRawAd awemeRawAd2;
        FakeAuthor fakeAuthor;
        AwemeRawAd awemeRawAd3;
        super.LJIILJJIL(c59672NbQ);
        TextView textView = (TextView) this.LJLLL.getValue();
        User user = null;
        if (textView != null) {
            Aweme aweme = this.LJLJLJ;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                str = awemeRawAd.getButtonText();
            } else {
                str = null;
            }
            textView.setText(str);
        }
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null) {
            str2 = awemeRawAd3.getOpenUrl();
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            View view = (View) this.LJLLLL.getValue();
            if (view != null) {
                view.setVisibility(0);
            }
            TextView textView2 = (TextView) this.LJLLLL.getValue();
            if (textView2 != null) {
                Aweme aweme3 = this.LJLJLJ;
                if (aweme3 != null && (awemeRawAd2 = aweme3.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd2.getFakeAuthor()) != null) {
                    str3 = fakeAuthor.getButtonText();
                } else {
                    str3 = null;
                }
                textView2.setText(str3);
            }
        } else {
            View view2 = (View) this.LJLLLL.getValue();
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = (View) this.LJLLL.getValue();
            if (view3 != null) {
                C26338AVi.LJI(view3, 0, 0, 0, 0, false, 16);
            }
        }
        Aweme aweme4 = this.LJLJLJ;
        if (aweme4 != null) {
            user = aweme4.getAuthor();
        }
        C62562cu LIZ = C59737NcT.LIZ(user);
        if (LIZ != null) {
            W5F LJIIIZ = W5U.LJIIIZ(LIZ);
            LJIIIZ.LJJIIJ = (SmartImageView) this.LJLLJ.getValue();
            C16880lQ.LLJJJ(LJIIIZ);
        }
        ViewGroup viewGroup = (ViewGroup) this.LJLLILLLL.getValue();
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS30S0100000_10(this, 25));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILLIIL(boolean z) {
        if (z && !this.LJLLI) {
            LJIJ();
        } else {
            LJIIZILJ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAdGPProfileWebViewHiddenEvent(IK6 event) {
        o.LJIIIZ(event, "event");
        LJIJ();
    }
}
