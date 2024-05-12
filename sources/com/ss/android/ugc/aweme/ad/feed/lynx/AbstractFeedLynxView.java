package com.ss.android.ugc.aweme.ad.feed.lynx;

import X.AbstractC59184NKq;
import X.C16880lQ;
import X.C58112Pv;
import X.InterfaceC1803976d;
import X.NLW;
import X.NQI;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class AbstractFeedLynxView implements GenericLifecycleObserver {
    public final ViewGroup LJLIL;
    public final NQI LJLILLLLZI;
    public final String LJLJI;
    public Aweme LJLJJI;
    public AwemeRawAd LJLJJL;
    public boolean LJLJJLL;
    public AbstractC59184NKq LJLJL;
    public final NLW LJLJLJ;
    public boolean LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLLILLLL;

    public AbstractC59184NKq LIZ(String str) {
        return null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final View LIZIZ() {
        View view = this.LJLL;
        if (view != null) {
            return view;
        }
        o.LJIJI("contentView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.spark.IAdSparkUtils r4 = com.ss.android.ugc.aweme.spark.AdSparkUtils.LJFF()
            java.lang.String r3 = "container.context"
            if (r4 == 0) goto L33
            android.view.ViewGroup r0 = r10.LJLIL
            android.content.Context r5 = r0.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r3)
            r6 = 0
            r8 = 0
            r9 = 30
            r7 = r6
            com.ss.android.ugc.aweme.spark.AdSparkContext r2 = X.NGQ.LIZ(r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L33
        L1c:
            X.FsQ r1 = X.C40343FsR.LJIILJJIL
            android.view.ViewGroup r0 = r10.LJLIL
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            r1.getClass()
            X.FsR r0 = X.C40342FsQ.LIZ(r0, r2)
            X.NtS r0 = X.C40343FsR.LIZ(r0)
            return r0
        L33:
            com.bytedance.hybrid.spark.SparkContext r2 = new com.bytedance.hybrid.spark.SparkContext
            r2.<init>()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.lynx.AbstractFeedLynxView.LIZJ():X.NtS");
    }

    public AbstractFeedLynxView(ViewGroup viewGroup, NQI feedLynxViewDelegate, String str) {
        NLW nlw;
        ViewGroup viewGroup2;
        AbstractC59184NKq LIZ;
        View view;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(feedLynxViewDelegate, "feedLynxViewDelegate");
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = feedLynxViewDelegate;
        this.LJLJI = str;
        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(17);
        if (LIZLLL instanceof NLW) {
            nlw = (NLW) LIZLLL;
        } else {
            nlw = null;
        }
        this.LJLJLJ = nlw;
        if (C58112Pv.LIZ() && (LIZ = LIZ(str)) != null && (view = LIZ.LIZIZ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = LIZ.LIZLLL) != null && LIZ.LIZ == 3) {
            this.LJLJL = LIZ;
            this.LJLL = view;
            this.LJLJJLL = true;
            this.LJLJLLL = LIZ.LJI;
            this.LJLLI = LIZ.LJ;
            this.LJLLILLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
            ((FeedAdLynxSticker) this).LJLZ = true;
        }
        if (!this.LJLJJLL) {
            View inflate = View.inflate(viewGroup.getContext(), R.layout.bjo, null);
            o.LJIIIIZZ(inflate, "inflate(container.context, getLayoutId(), null)");
            this.LJLL = inflate;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZIZ().findViewById(R.id.spark_ad_sticker_view);
            this.LJLLILLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 == null ? LIZJ() : sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        } else if (this.LJLLILLLL == null) {
            this.LJLLILLLL = LIZJ();
        }
        viewGroup.removeAllViews();
        if (this.LJLJJLL) {
            ViewParent parent = LIZIZ().getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(LIZIZ(), viewGroup2);
            }
        }
        viewGroup.addView(LIZIZ());
    }
}
