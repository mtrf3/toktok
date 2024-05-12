package com.ss.android.ugc.aweme.commercialize.profile;

import X.C59425NTx;
import X.C59426NTy;
import X.C78977Uz7;
import X.NU2;
import X.NWF;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdNewFakePopUpWebPageWidget extends AbsAdProfileWidget {
    public NWF LJLLI;
    public String LJLLILLLL;
    public long LJLLJ;
    public final NU2 LJLLL = new NU2(this);
    public final C59426NTy LJLLLL = new C59426NTy(this);
    public final C59425NTx LJLLLLLL = new C59425NTx(this);

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LJIIZILJ() {
        String str;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        Aweme aweme2 = this.LJLJLJ;
        if (aweme2 == null || (awemeRawAd3 = aweme2.getAwemeRawAd()) == null || !C78977Uz7.LJJJJL(awemeRawAd3)) {
            Aweme aweme3 = this.LJLJLJ;
            if (aweme3 != null && (awemeRawAd2 = aweme3.getAwemeRawAd()) != null) {
                str = awemeRawAd2.getOpenUrl();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) && (aweme = this.LJLJLJ) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd.getFakeAuthor()) != null && o.LJ(fakeAuthor.getAutoShowWebview(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r4, "app") != false) goto L27;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(boolean r12) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget.LJIILLIIL(boolean):void");
    }
}
