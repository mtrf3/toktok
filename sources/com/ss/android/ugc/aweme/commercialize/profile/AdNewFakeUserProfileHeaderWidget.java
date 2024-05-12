package com.ss.android.ugc.aweme.commercialize.profile;

import X.C16880lQ;
import X.C221108m2;
import X.C59672NbQ;
import X.C59737NcT;
import X.C62562cu;
import X.C62822Ol8;
import X.W5F;
import X.W5U;
import Y.IDLListenerS197S0100000_10;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class AdNewFakeUserProfileHeaderWidget extends AbsAdProfileWidget {
    public static final /* synthetic */ int LJLLLL = 0;
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 108));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 110));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 109));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 111));

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TextView LJIJ() {
        return (TextView) this.LJLLJ.getValue();
    }

    public final void LJIIZILJ() {
        String str;
        User author;
        User author2;
        ViewTreeObserver viewTreeObserver;
        TextView LJIJ = LJIJ();
        if (LJIJ != null && (viewTreeObserver = LJIJ.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS197S0100000_10(this, 2));
        }
        Aweme aweme = this.LJLJLJ;
        String str2 = null;
        if (aweme != null && (author2 = aweme.getAuthor()) != null) {
            str = author2.getAdAuthorDesc();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView LJIJ2 = LJIJ();
            if (LJIJ2 == null) {
                return;
            }
            Aweme aweme2 = this.LJLJLJ;
            if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                str2 = author.getAdAuthorDesc();
            }
            LJIJ2.setText(str2);
            return;
        }
        TextView LJIJ3 = LJIJ();
        if (LJIJ3 == null) {
            return;
        }
        Aweme aweme3 = this.LJLJLJ;
        if (aweme3 != null) {
            str2 = aweme3.getDesc();
        }
        LJIJ3.setText(str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILJJIL(C59672NbQ c59672NbQ) {
        String str;
        User author;
        super.LJIILJJIL(c59672NbQ);
        TextView textView = (TextView) this.LJLLILLLL.getValue();
        User user = null;
        if (textView != null) {
            Aweme aweme = this.LJLJLJ;
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                str = author.getNickname();
            } else {
                str = null;
            }
            textView.setText(str);
        }
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 != null) {
            user = aweme2.getAuthor();
        }
        C62562cu LIZ = C59737NcT.LIZ(user);
        if (LIZ != null) {
            W5F LJIIIZ = W5U.LJIIIZ(LIZ);
            LJIIIZ.LJJIIJ = (SmartImageView) this.LJLLI.getValue();
            C16880lQ.LLJJJ(LJIIIZ);
        }
        LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILLIIL(boolean z) {
        if (!z) {
            TextView LJIJ = LJIJ();
            if (LJIJ != null) {
                LJIJ.setGravity(8388627);
            }
            LJIIZILJ();
        }
    }
}
