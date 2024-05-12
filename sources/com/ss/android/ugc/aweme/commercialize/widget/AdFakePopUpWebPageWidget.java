package com.ss.android.ugc.aweme.commercialize.widget;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C16880lQ;
import X.C17J;
import X.C45804HyK;
import X.C59424NTw;
import X.C59427NTz;
import X.C63081OpJ;
import X.NOD;
import X.NOJ;
import X.NTH;
import X.NU0;
import X.NU3;
import X.NWF;
import X.NWW;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdFakePopUpWebPageWidget extends AbsAdProfileWidget {
    public static final /* synthetic */ int LJZI = 0;
    public NWF LJLLI;
    public String LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLLL;
    public final Handler LJLLL = new Handler(C16880lQ.LLJJJJ());
    public final NU3 LJLLLLLL = new NU3(this);
    public final C59427NTz LJLZ = new C59427NTz(this);
    public final C59424NTw LJZ = new C59424NTw(this);

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILLIIL(boolean z) {
        ActivityC45651qj activityC45651qj;
        String str;
        String str2;
        AwemeRawAd awemeRawAd;
        String str3;
        AwemeRawAd awemeRawAd2;
        Context context;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        ActivityC45651qj activityC45651qj2;
        Context context2;
        int i;
        NWF LIZIZ;
        String aid;
        AwemeRawAd awemeRawAd6;
        FakeAuthor fakeAuthor;
        ActivityC45651qj activityC45651qj3 = null;
        AwemeRawAd awemeRawAd7 = null;
        if (z) {
            Fragment fragment = this.LJLJLLL;
            if (fragment != null) {
                activityC45651qj = fragment.mo49getActivity();
            } else {
                activityC45651qj = null;
            }
            String str4 = "";
            if (activityC45651qj != null) {
                Aweme aweme = this.LJLJLJ;
                if (aweme != null && (awemeRawAd5 = aweme.getAwemeRawAd()) != null) {
                    str = awemeRawAd5.getSource();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    Aweme aweme2 = this.LJLJLJ;
                    if (aweme2 != null && (awemeRawAd4 = aweme2.getAwemeRawAd()) != null) {
                        str2 = awemeRawAd4.getSource();
                    } else {
                        str2 = null;
                    }
                } else {
                    Aweme aweme3 = this.LJLJLJ;
                    if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (str2 = awemeRawAd.getWebTitle()) == null) {
                        str2 = "";
                    }
                }
                NTH nth = new NTH();
                Aweme aweme4 = this.LJLJLJ;
                if (aweme4 == null || (awemeRawAd3 = aweme4.getAwemeRawAd()) == null || (str3 = awemeRawAd3.getWebUrl()) == null) {
                    str3 = "";
                }
                nth.LIZ = str3;
                nth.LJFF = this.LJLJLLL;
                nth.LIZIZ = C63081OpJ.LJJJJLI(activityC45651qj);
                if (str2 == null) {
                    str2 = "";
                }
                nth.LIZJ = str2;
                Aweme aweme5 = this.LJLJLJ;
                Bundle bundle = new Bundle();
                Fragment fragment2 = this.LJLJLLL;
                if (fragment2 != null && (context = fragment2.getContext()) != null && aweme5 != null && aweme5.getAwemeRawAd() != null) {
                    C17J.LJIIJJI(context, bundle, aweme5);
                    C17J.LJIIL(context, bundle, aweme5);
                    C17J.LJIILJJIL(context, bundle, aweme5);
                    C17J.LJIILIIL(context, bundle);
                }
                nth.LIZLLL = bundle;
                Aweme aweme6 = this.LJLJLJ;
                if (aweme6 != null) {
                    awemeRawAd2 = aweme6.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                nth.LJ = awemeRawAd2;
                NWW LIZ = nth.LIZ();
                C59424NTw c59424NTw = this.LJZ;
                NU3 nu3 = this.LJLLLLLL;
                NWF LIZIZ2 = NU0.LIZIZ(activityC45651qj);
                if (LIZIZ2 == null) {
                    LIZIZ2 = new NWF(activityC45651qj);
                    LIZIZ2.setId(R.id.ri);
                    LIZIZ2.setParams(LIZ);
                    LIZIZ2.setMBehaviorCallback(c59424NTw);
                    LIZIZ2.setKeyDownCallBack(nu3);
                    FrameLayout LIZJ = NU0.LIZJ(activityC45651qj);
                    if (LIZJ != null) {
                        LIZJ.addView(LIZIZ2);
                    }
                }
                this.LJLLI = LIZIZ2;
                LIZIZ2.setTitleBarCallback(this.LJLZ);
            }
            this.LJLLLL = false;
            this.LJLLJ = 0L;
            String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
            Fragment fragment3 = this.LJLJLLL;
            if (fragment3 != null) {
                activityC45651qj2 = fragment3.mo49getActivity();
            } else {
                activityC45651qj2 = null;
            }
            NOD nod = new NOD();
            Fragment fragment4 = this.LJLJLLL;
            if (fragment4 != null) {
                context2 = fragment4.getContext();
            } else {
                context2 = null;
            }
            nod.LIZ = context2;
            Aweme aweme7 = this.LJLJLJ;
            nod.LJIIIIZZ = aweme7;
            if (aweme7 != null) {
                awemeRawAd7 = aweme7.getAwemeRawAd();
            }
            nod.LIZIZ = awemeRawAd7;
            nod.LIZLLL = 8;
            nod.LJIIJJI = LIZ2;
            Aweme aweme8 = this.LJLJLJ;
            if (aweme8 != null && (awemeRawAd6 = aweme8.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd6.getFakeAuthor()) != null && o.LJ(fakeAuthor.getAutoShowWebview(), Boolean.TRUE)) {
                i = 5;
            } else {
                i = 4;
            }
            nod.LIZJ = i;
            Aweme aweme9 = this.LJLJLJ;
            if (aweme9 != null && (aid = aweme9.getAid()) != null) {
                str4 = aid;
            }
            nod.LIZ(str4);
            NOJ LIZIZ3 = nod.LIZIZ();
            Context context3 = LIZIZ3.LIZ;
            if (context3 == null || C45804HyK.LJIJJ(context3) == null || (LIZIZ = NU0.LIZIZ(activityC45651qj2)) == null || LIZIZ.LJIIJJI()) {
                return;
            }
            FrameLayout LIZJ2 = NU0.LIZJ(activityC45651qj2);
            if (LIZJ2 != null) {
                LIZJ2.setVisibility(0);
            }
            LIZIZ.getActionMode().LJIIIIZZ = LIZIZ3.LIZLLL;
            LIZIZ.LJIIIIZZ(new AqS157S0200000_10(LIZIZ3, LIZIZ, 8));
            return;
        }
        Fragment fragment5 = this.LJLJLLL;
        if (fragment5 != null) {
            activityC45651qj3 = fragment5.mo49getActivity();
        }
        NWF LIZIZ4 = NU0.LIZIZ(activityC45651qj3);
        if (LIZIZ4 == null || !LIZIZ4.LJIIJJI()) {
            return;
        }
        LIZIZ4.LIZLLL(true);
        FrameLayout LIZJ3 = NU0.LIZJ(activityC45651qj3);
        if (LIZJ3 == null) {
            return;
        }
        LIZJ3.setVisibility(8);
    }
}
