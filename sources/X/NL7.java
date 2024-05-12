package X;

import Y.ARunnableS21S0300000_10;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class NL7 implements NQI, Observer<C207668Da> {
    public final ViewStub LJLIL;
    public Aweme LJLILLLLZI;
    public FeedAdLynxSticker LJLJI;
    public FrameLayout LJLJJI;
    public AdStickerData LJLJJL;
    public boolean LJLJJLL;
    public NL9 LJLJL;
    public final Handler LJLJLJ = new Handler(C16880lQ.LLJJJJ());
    public String LJLJLLL;
    public boolean LJLL;
    public int LJLLI;

    @Override // X.NQI
    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        FeedAdLynxSticker feedAdLynxSticker = this.LJLJI;
        if (feedAdLynxSticker != null) {
            Object context = feedAdLynxSticker.LJLIL.getContext();
            if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(feedAdLynxSticker);
            }
            EventBus.LIZJ().LJIJ(feedAdLynxSticker);
            if (!feedAdLynxSticker.LJLJJLL) {
                feedAdLynxSticker.LJLJLLL = false;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = feedAdLynxSticker.LJLLILLLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
                }
                View LIZIZ = feedAdLynxSticker.LIZIZ();
                if ((LIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZIZ) != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                }
                feedAdLynxSticker.LJLLI = null;
                this.LJLJI = null;
            }
        }
    }

    @Override // X.NQI
    public final void LIZJ() {
        FeedAdLynxSticker feedAdLynxSticker;
        FeedAdLynxSticker feedAdLynxSticker2;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null || !C63081OpJ.LLJJJJJIL(aweme) || this.LJLJJLL) {
            return;
        }
        if ((!C58112Pv.LIZ() || (feedAdLynxSticker2 = this.LJLJI) == null || !feedAdLynxSticker2.LJLJJLL) && (feedAdLynxSticker = this.LJLJI) != null) {
            feedAdLynxSticker.LJIIJ();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = feedAdLynxSticker.LJLLILLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = feedAdLynxSticker.LJLLILLLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
                }
                feedAdLynxSticker.LJLLI = null;
            }
            String str = feedAdLynxSticker.LJLLJ;
            if (str != null) {
                Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
                buildUpon.appendQueryParameter("initialData", feedAdLynxSticker.LJ().toString());
                NKV nkv = feedAdLynxSticker.LJLLLL;
                if (nkv != null) {
                    String builder = buildUpon.toString();
                    o.LJIIIIZZ(builder, "urlBuilder.toString()");
                    nkv.LIZ(feedAdLynxSticker.LJI(), builder, C59209NLp.LIZ().enableLynxSticker);
                }
            }
        }
    }

    @Override // X.NQI
    public final void hide() {
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.LJLJJLL = false;
        this.LJLJLJ.removeCallbacksAndMessages(null);
    }

    @Override // X.NQI
    public final boolean isShowing() {
        return this.LJLJJLL;
    }

    public NL7(ViewStub viewStub) {
        this.LJLIL = viewStub;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    @Override // X.NQI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            r4 = 1
            r1 = 0
            if (r6 == 0) goto L1a
            boolean r0 = X.C63081OpJ.LLJJJJJIL(r6)
            if (r0 != r4) goto L1a
            r0 = 1
        Lb:
            r3 = 0
            if (r0 != 0) goto L1c
            r5.LJLILLLLZI = r3
            r5.LJLLI = r1
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = r5.LJLJI
            if (r0 == 0) goto L19
            r0.LIZLLL(r3)
        L19:
            return
        L1a:
            r0 = 0
            goto Lb
        L1c:
            r5.LJLILLLLZI = r6
            if (r6 == 0) goto L50
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.commercialize.model.AdStickerData r0 = r0.getStickerData()
        L2a:
            r5.LJLJJL = r0
            android.view.ViewStub r0 = r5.LJLIL
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L4b
            android.view.ViewStub r1 = r5.LJLIL
            r0 = 2131561434(0x7f0d0bda, float:1.8748268E38)
            r1.setLayoutResource(r0)
            android.view.ViewStub r0 = r5.LJLIL
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            kotlin.jvm.internal.o.LJII(r1, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r5.LJLJJI = r1
        L4b:
            android.widget.FrameLayout r2 = r5.LJLJJI
            if (r2 != 0) goto L52
            return
        L50:
            r0 = r3
            goto L2a
        L52:
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = r5.LJLJI
            if (r0 == 0) goto L6e
            boolean r0 = X.C58112Pv.LIZ()
            if (r0 != r4) goto L7b
            if (r6 == 0) goto L88
            java.lang.String r1 = r6.getAid()
        L62:
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = r5.LJLJI
            if (r0 == 0) goto L86
            java.lang.String r0 = r0.LJLJI
        L68:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L7b
        L6e:
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = new com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker
            if (r6 == 0) goto L76
            java.lang.String r3 = r6.getAid()
        L76:
            r0.<init>(r2, r5, r3)
            r5.LJLJI = r0
        L7b:
            com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker r0 = r5.LJLJI
            if (r0 == 0) goto L82
            r0.LIZLLL(r6)
        L82:
            r5.hide()
            return
        L86:
            r0 = r3
            goto L68
        L88:
            r1 = r3
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NL7.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.NQI
    public final void LJ(long j) {
        LIZ(j, null);
    }

    @Override // X.NQI
    public final void LJJIFFI(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
            dataCenter.iv0("ad_feed_bind_texture_size", this, false);
            dataCenter.iv0("ad_feed_on_play_completed", this, false);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        FeedAdLynxSticker feedAdLynxSticker;
        FeedAdLynxSticker feedAdLynxSticker2;
        Aweme aweme;
        C207668Da c207668Da2 = c207668Da;
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null && C63081OpJ.LLJJJJJIL(aweme2)) {
            Object obj = null;
            if (c207668Da2 == null || (str = c207668Da2.LIZ) == null) {
                return;
            }
            switch (str.hashCode()) {
                case -1718169445:
                    if (!str.equals("ad_feed_on_play_completed")) {
                        return;
                    }
                    Object obj2 = c207668Da2.LIZIZ;
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                    this.LJLLI = ((Integer) obj).intValue();
                    return;
                case -1540531799:
                    if (!str.equals("ad_feed_on_page_unselected")) {
                        return;
                    }
                    FeedAdLynxSticker feedAdLynxSticker3 = this.LJLJI;
                    if (feedAdLynxSticker3 != null) {
                        EventBus.LIZJ().LJIJ(feedAdLynxSticker3);
                    }
                    this.LJLLI = 0;
                    if (NPC.LJIIIZ(this.LJLJJL)) {
                        hide();
                    }
                    this.LJLL = false;
                    return;
                case -1304146782:
                    if (!str.equals("ad_feed_bind_texture_size")) {
                        return;
                    }
                    Object obj3 = c207668Da2.LIZIZ;
                    if (obj3 != null) {
                        obj = obj3;
                    }
                    o.LJIIIIZZ(obj, "kvData.getData()");
                    this.LJLJL = (NL9) obj;
                    return;
                case -1132409520:
                    if (!str.equals("ad_feed_on_page_selected")) {
                        return;
                    }
                    if (C58112Pv.LIZ() && (aweme = this.LJLILLLLZI) != null) {
                        C63081OpJ.LLJJJJJIL(aweme);
                    }
                    this.LJLLI = 0;
                    FeedAdLynxSticker feedAdLynxSticker4 = this.LJLJI;
                    if (feedAdLynxSticker4 != null) {
                        EventBus.LIZJ().LJIILJJIL(feedAdLynxSticker4);
                    }
                    if (this.LJLJJLL && (feedAdLynxSticker2 = this.LJLJI) != null) {
                        feedAdLynxSticker2.LJIIIZ();
                    }
                    if (!TextUtils.isEmpty(this.LJLJLLL) && (feedAdLynxSticker = this.LJLJI) != null) {
                        feedAdLynxSticker.LJIIIIZZ(this.LJLJLLL);
                    }
                    this.LJLL = true;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // X.NQI
    public final void LIZ(long j, NLD nld) {
        FrameLayout frameLayout;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null || !C63081OpJ.LLJJJJJIL(aweme) || (frameLayout = this.LJLJJI) == null || this.LJLJJLL) {
            return;
        }
        this.LJLJLJ.postDelayed(new ARunnableS21S0300000_10(this, frameLayout, nld, 0), j);
    }
}
