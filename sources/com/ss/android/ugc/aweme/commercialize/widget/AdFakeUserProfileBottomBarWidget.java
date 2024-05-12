package com.ss.android.ugc.aweme.commercialize.widget;

import X.C16880lQ;
import X.C17N;
import X.C198747r4;
import X.C221108m2;
import X.C59672NbQ;
import X.C59745Ncb;
import X.C62562cu;
import X.C62822Ol8;
import X.W5F;
import X.W5U;
import Y.ACListenerS45S0200000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class AdFakeUserProfileBottomBarWidget extends AbsAdProfileWidget {
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 138));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, UserLevelGeckoUpdateSetting.DEFAULT));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 139));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 137));

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIIZILJ() {
        View view = (View) this.LJLLI.getValue();
        if (view != null) {
            view.animate().translationY(C17N.LJIILL(100.0d)).setDuration(0L).start();
        }
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
        AwemeRawAd awemeRawAd2;
        FakeAuthor fakeAuthor;
        AwemeRawAd awemeRawAd3;
        String learnMoreBgColor;
        super.LJIILJJIL(c59672NbQ);
        TextView textView = (TextView) this.LJLLJ.getValue();
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
        TextView textView2 = (TextView) this.LJLLL.getValue();
        if (textView2 != null) {
            Aweme aweme2 = this.LJLJLJ;
            if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd2.getFakeAuthor()) != null) {
                str2 = fakeAuthor.getButtonText();
            } else {
                str2 = null;
            }
            textView2.setText(str2);
        }
        Aweme aweme3 = this.LJLJLJ;
        if (aweme3 != null) {
            user = aweme3.getAuthor();
        }
        C62562cu LIZ = C59745Ncb.LIZ(user);
        if (LIZ != null) {
            W5F LJIIIZ = W5U.LJIIIZ(LIZ);
            LJIIIZ.LJJIIJ = (SmartImageView) this.LJLLILLLL.getValue();
            C16880lQ.LLJJJ(LJIIIZ);
        }
        Aweme aweme4 = this.LJLJLJ;
        if (aweme4 != null && (awemeRawAd3 = aweme4.getAwemeRawAd()) != null && (learnMoreBgColor = awemeRawAd3.getLearnMoreBgColor()) != null && learnMoreBgColor.length() > 0) {
            int parseColor = ColorProtector.parseColor(learnMoreBgColor);
            View view = (View) this.LJLLI.getValue();
            if (view != null) {
                view.setBackground(new C198747r4(C17N.LJIILL(4.0d), parseColor));
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.LJLLI.getValue();
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS45S0200000_10(this, c59672NbQ, 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILLIIL(boolean z) {
        if (z) {
            View view = (View) this.LJLLI.getValue();
            if (view != null) {
                view.animate().translationY(C17N.LJIILL(-16.0d)).setDuration(300L).start();
                return;
            }
            return;
        }
        LJIIZILJ();
    }
}
