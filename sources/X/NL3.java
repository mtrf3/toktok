package X;

import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.superlike.FeedAdLynxSuperLike;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class NL3 implements NQI, Observer<C207668Da> {
    public final ViewStub LJLIL;
    public Aweme LJLILLLLZI;
    public FeedAdLynxSuperLike LJLJI;
    public FrameLayout LJLJJI;
    public boolean LJLJJL;
    public final Handler LJLJJLL = new Handler(C16880lQ.LLJJJJ());

    @Override // X.NQI
    public final void LIZ(long j, NLD nld) {
    }

    @Override // X.NQI
    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        View view;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        FeedAdLynxSuperLike feedAdLynxSuperLike = this.LJLJI;
        if (feedAdLynxSuperLike != null) {
            Object context = feedAdLynxSuperLike.LJLILLLLZI.getContext();
            if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(feedAdLynxSuperLike);
            }
            EventBus.LIZJ().LJIILJJIL(feedAdLynxSuperLike);
            C59169NKb LIZLLL = feedAdLynxSuperLike.LIZLLL();
            if (LIZLLL != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = LIZLLL.LIZLLL;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
            }
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != feedAdLynxSuperLike.LJLJLLL) {
                C59169NKb LIZLLL2 = feedAdLynxSuperLike.LIZLLL();
                if (LIZLLL2 != null) {
                    view = LIZLLL2.LIZIZ;
                } else {
                    view = null;
                }
                if (view != feedAdLynxSuperLike.LJLJL) {
                    feedAdLynxSuperLike.LJLLILLLL = false;
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = feedAdLynxSuperLike.LJLJLLL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3);
                    }
                    View view2 = feedAdLynxSuperLike.LJLJL;
                    if ((view2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) view2) != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
                    }
                    feedAdLynxSuperLike.LJLL = null;
                    this.LJLJI = null;
                }
            }
        }
    }

    @Override // X.NQI
    public final void LIZJ() {
        FeedAdLynxSuperLike feedAdLynxSuperLike;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && C63081OpJ.LLJJJJLIIL(aweme) && !C58562Ro.LIZ() && !this.LJLJJL && (feedAdLynxSuperLike = this.LJLJI) != null) {
            feedAdLynxSuperLike.LJLLL = -1;
            feedAdLynxSuperLike.LJLLILLLL = false;
            feedAdLynxSuperLike.LJLLJ = false;
            String str = feedAdLynxSuperLike.LJLJJL;
            if (str != null) {
                Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
                Context context = feedAdLynxSuperLike.LJLILLLLZI.getContext();
                o.LJIIIIZZ(context, "container.context");
                buildUpon.appendQueryParameter("initialData", NG1.LIZ(context, feedAdLynxSuperLike.LJLJI).toString());
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = feedAdLynxSuperLike.LJLJLLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = feedAdLynxSuperLike.LJLJLLL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
                    }
                    feedAdLynxSuperLike.LJLL = null;
                }
                NKV nkv = feedAdLynxSuperLike.LJLJLJ;
                if (nkv != null) {
                    String builder = buildUpon.toString();
                    o.LJIIIIZZ(builder, "urlBuilder.toString()");
                    Bundle bundle = new Bundle();
                    Context context2 = feedAdLynxSuperLike.LJLILLLLZI.getContext();
                    NLW nlw = feedAdLynxSuperLike.LJLJJLL;
                    if (nlw != null) {
                        Aweme aweme2 = feedAdLynxSuperLike.LJLJI;
                        o.LJIIIIZZ(context2, "context");
                        nlw.LJIIIIZZ(context2, bundle, aweme2);
                    }
                    nkv.LIZ(bundle, builder, C59209NLp.LIZ().enableLynxSuperLike);
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
        this.LJLJJL = false;
        this.LJLJJLL.removeCallbacksAndMessages(null);
    }

    @Override // X.NQI
    public final boolean isShowing() {
        return this.LJLJJL;
    }

    public NL3(ViewStub viewStub) {
        this.LJLIL = viewStub;
    }

    @Override // X.NQI
    public final void LIZLLL(Aweme aweme) {
        boolean z;
        AwemeRawAd awemeRawAd;
        if (aweme != null && C63081OpJ.LLJJJJLIIL(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LJLILLLLZI = null;
            FeedAdLynxSuperLike feedAdLynxSuperLike = this.LJLJI;
            if (feedAdLynxSuperLike != null) {
                feedAdLynxSuperLike.LIZ(null);
                return;
            }
            return;
        }
        if (aweme != null && C63081OpJ.LJLLL(aweme)) {
            this.LJLILLLLZI = aweme;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                awemeRawAd.getLynxEntryData();
            }
            if (this.LJLIL.getParent() != null) {
                this.LJLIL.setLayoutResource(R.layout.bjp);
                View inflate = this.LJLIL.inflate();
                o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                this.LJLJJI = (FrameLayout) inflate;
            }
            FrameLayout frameLayout = this.LJLJJI;
            if (frameLayout == null) {
                return;
            }
            if (this.LJLJI == null) {
                this.LJLJI = new FeedAdLynxSuperLike(this, frameLayout);
            }
            FeedAdLynxSuperLike feedAdLynxSuperLike2 = this.LJLJI;
            if (feedAdLynxSuperLike2 != null) {
                feedAdLynxSuperLike2.LIZ(aweme);
            }
            hide();
            return;
        }
        this.LJLILLLLZI = null;
        FeedAdLynxSuperLike feedAdLynxSuperLike3 = this.LJLJI;
        if (feedAdLynxSuperLike3 != null) {
            feedAdLynxSuperLike3.LIZ(null);
        }
    }

    @Override // X.NQI
    public final void LJ(long j) {
        FrameLayout frameLayout;
        Aweme aweme;
        C59169NKb LIZLLL;
        View view;
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 == null || !C63081OpJ.LLJJJJLIIL(aweme2) || this.LJLJJL || (frameLayout = this.LJLJJI) == null) {
            return;
        }
        FeedAdLynxSuperLike feedAdLynxSuperLike = this.LJLJI;
        if (feedAdLynxSuperLike != null) {
            if (C58562Ro.LIZ() && (aweme = feedAdLynxSuperLike.LJLJI) != null && aweme.getAid() != null && feedAdLynxSuperLike.LIZLLL() != null && (LIZLLL = feedAdLynxSuperLike.LIZLLL()) != null && (view = LIZLLL.LIZIZ) != null) {
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ViewParent parent = view.getParent();
                    o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    C16880lQ.LJLLL(view, (ViewGroup) parent);
                }
                feedAdLynxSuperLike.LJLJL = view;
                feedAdLynxSuperLike.LJLLJ = LIZLLL.LJI;
                feedAdLynxSuperLike.LJLJLLL = LIZLLL.LIZLLL;
                feedAdLynxSuperLike.LJLL = LIZLLL.LJ;
            }
            frameLayout.removeAllViews();
            frameLayout.addView(feedAdLynxSuperLike.LJLJL);
        }
        this.LJLJJLL.postDelayed(new ARunnableS29S0200000_10(this, frameLayout, 28), j);
    }

    @Override // X.NQI
    public final void LJJIFFI(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        FeedAdLynxSuperLike feedAdLynxSuperLike;
        C207668Da c207668Da2 = c207668Da;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && C63081OpJ.LLJJJJLIIL(aweme) && c207668Da2 != null && (str = c207668Da2.LIZ) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != -1132409520 || !str.equals("ad_feed_on_page_selected") || (feedAdLynxSuperLike = this.LJLJI) == null) {
                    return;
                }
                EventBus.LIZJ().LJIILJJIL(feedAdLynxSuperLike);
                return;
            }
            if (!str.equals("ad_feed_on_page_unselected")) {
                return;
            }
            FeedAdLynxSuperLike feedAdLynxSuperLike2 = this.LJLJI;
            if (feedAdLynxSuperLike2 != null) {
                EventBus.LIZJ().LJIILJJIL(feedAdLynxSuperLike2);
            }
            hide();
        }
    }
}
