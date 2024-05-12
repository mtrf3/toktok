package com.ss.android.ugc.aweme.ad.feed.mask;

import X.C0RN;
import X.C16880lQ;
import X.C188727au;
import X.C39551Fff;
import X.C40479Fud;
import X.C40492Fuq;
import X.C40493Fur;
import X.C58062Pq;
import X.C59186NKs;
import X.C59207NLn;
import X.C60193Njp;
import X.FMX;
import X.IE0;
import X.IEW;
import X.IK1;
import X.IK2;
import X.InterfaceC40516FvE;
import X.InterfaceC60761Nsz;
import X.NKV;
import X.NLP;
import X.NLS;
import X.NLT;
import X.NLW;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class FeedAdLynxMaskContainer implements GenericLifecycleObserver {
    public final NLP LJLIL;
    public FrameLayout LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final String LJLJJI;
    public Aweme LJLJJL;
    public CardStruct LJLJJLL;
    public JSONObject LJLJL;
    public InterfaceC40516FvE LJLJLJ;
    public final NLW LJLJLLL;
    public final NLT LJLL;
    public final NKV LJLLI;
    public View LJLLILLLL;
    public C59186NKs LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public String LJLZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZ(Aweme aweme) {
        CardStruct cardStruct;
        String str;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        this.LJLJJL = aweme;
        JSONObject jSONObject = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (cardInfos = awemeRawAd.getCardInfos()) != null) {
            cardStruct = cardInfos.get("5");
        } else {
            cardStruct = null;
        }
        this.LJLJJLL = cardStruct;
        if (cardStruct != null) {
            jSONObject = cardStruct.getCardData();
        }
        this.LJLJL = jSONObject;
        Object context = this.LJLILLLLZI.getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        if (!C58062Pq.LIZ() || aweme == null) {
            return;
        }
        C59186NKs c59186NKs = this.LJLLJ;
        if (c59186NKs != null) {
            c59186NKs.LJ();
        }
        if (this.LJLLL) {
            return;
        }
        C188727au LIZJ = C0RN.LIZJ(0, "is_successful", 0, "is_ever_failed");
        if (C59207NLn.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LJIIIZ("is_spark", str);
        LIZJ.LIZLLL(1, "failed_reason");
        FMX.LJIIL("feed_lynx_mask_preload_usage", LIZJ.LIZ);
    }

    public final void LIZIZ(boolean z) {
        String str;
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
            o.LJII(frameLayout, "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkView");
            InterfaceC60761Nsz kitView = ((SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) frameLayout).getKitView();
            if (kitView != null) {
                if (z) {
                    kitView.onShow();
                    return;
                } else {
                    kitView.onHide();
                    return;
                }
            }
            return;
        }
        if (!(frameLayout instanceof C60193Njp)) {
            return;
        }
        if (z) {
            str = "viewAppeared";
        } else {
            str = "viewDisappeared";
        }
        LJ(str, null);
    }

    public final void LIZJ(int i) {
        IEW.LIZJ = IEW.LIZIZ;
        IEW.LIZIZ = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateStoryIndex: lastPlayIndex = ");
        LIZ.append(IEW.LIZJ);
        LIZ.append(",currentPlayIndex = ");
        LIZ.append(IEW.LIZIZ);
        IE0.LIZ(X1D.LIZIZ(LIZ));
        DataCenter dataCenter = this.LJLIL.LJLJJI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.FALSE, "action_ad_hide_lynx_mask");
        }
        DataCenter dataCenter2 = this.LJLIL.LJLJJI;
        if (dataCenter2 != null) {
            dataCenter2.jv0(null, "ad_play_story_sub_video");
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCardGetCodeButtonClickedEvent(C40479Fud event) {
        o.LJIIIZ(event, "event");
        LJ("gameCodeClicked", null);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onHideMaskLayoutEvent(C40492Fuq event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL != this.LJLILLLLZI.hashCode()) {
            return;
        }
        if (IEW.LIZIZ(this.LJLJJL)) {
            LIZJ(1);
            return;
        }
        DataCenter dataCenter = this.LJLIL.LJLJJI;
        if (dataCenter == null) {
            return;
        }
        dataCenter.jv0(Boolean.TRUE, "action_ad_hide_lynx_mask");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLynxConvert(C39551Fff event) {
        o.LJIIIZ(event, "event");
        IEW.LJ = true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPopUpPageHideResumeVideoEvent(IK1 event) {
        o.LJIIIZ(event, "event");
        DataCenter dataCenter = this.LJLIL.LJLJJI;
        if (dataCenter != null) {
            dataCenter.jv0(null, "ad_feed_resume_video");
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPopUpPageShowHideMaskLayoutEvent(IK2 event) {
        o.LJIIIZ(event, "event");
        DataCenter dataCenter = this.LJLIL.LJLJJI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.FALSE, "action_ad_hide_lynx_mask");
        }
        DataCenter dataCenter2 = this.LJLIL.LJLJJI;
        if (dataCenter2 != null) {
            dataCenter2.jv0(null, "ad_feed_pause_video");
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onStoryMaskClickEvent(C40493Fur event) {
        o.LJIIIZ(event, "event");
        LIZJ(event.LJLIL);
    }

    public static final void LIZLLL(FeedAdLynxMaskContainer feedAdLynxMaskContainer, FrameLayout frameLayout) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!o.LJ(frameLayout, feedAdLynxMaskContainer.LJLILLLLZI)) {
            ViewParent parent = frameLayout.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(frameLayout, viewGroup2);
            }
        }
        ViewParent parent2 = feedAdLynxMaskContainer.LJLILLLLZI.getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup = (ViewGroup) parent2) == null) {
            viewGroup = feedAdLynxMaskContainer.LJLJI;
        }
        int indexOfChild = viewGroup.indexOfChild(feedAdLynxMaskContainer.LJLILLLLZI);
        C16880lQ.LJLLL(feedAdLynxMaskContainer.LJLILLLLZI, viewGroup);
        viewGroup.addView(frameLayout, indexOfChild);
        feedAdLynxMaskContainer.LJLIL.LJLJJL = frameLayout;
        feedAdLynxMaskContainer.LJLILLLLZI = frameLayout;
    }

    public final void LJ(String str, JSONObject jSONObject) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        if (C59207NLn.LIZ()) {
            FrameLayout frameLayout = this.LJLILLLLZI;
            if ((frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) frameLayout) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.LJIIIZ(str, jSONObject);
                return;
            }
            return;
        }
        InterfaceC40516FvE interfaceC40516FvE = this.LJLJLJ;
        if (interfaceC40516FvE == null) {
            return;
        }
        interfaceC40516FvE.onEvent(new NLS(str, jSONObject));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeedAdLynxMaskContainer(X.NLP r10, android.widget.FrameLayout r11, android.widget.FrameLayout r12, java.lang.String r13) {
        /*
            r9 = this;
            java.lang.String r0 = "maskContainerDelegate"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "container"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r9.<init>()
            r9.LJLIL = r10
            r9.LJLILLLLZI = r11
            r9.LJLJI = r12
            r9.LJLJJI = r13
            com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService r1 = com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl.LJ()
            r0 = 17
            X.76d r4 = r1.LIZLLL(r0)
            boolean r0 = r4 instanceof X.NLW
            r3 = 0
            if (r0 == 0) goto Lcf
            X.NLW r4 = (X.NLW) r4
        L26:
            r9.LJLJLLL = r4
            X.NLR r6 = new X.NLR
            r6.<init>(r9)
            X.NLQ r2 = new X.NLQ
            r2.<init>(r9)
            boolean r0 = X.C58062Pq.LIZ()
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.ad.feed.IFeedAdService r0 = com.ss.android.ugc.aweme.ad.FeedAdServiceImpl.LJJIJLIJ()
            if (r0 == 0) goto Lcc
            r0.LJJIII()
            X.NKn r0 = X.C59181NKn.LIZ
            if (r0 == 0) goto Lcc
            X.NKq r8 = r0.LIZ(r13)
            X.NKs r8 = (X.C59186NKs) r8
        L4b:
            r9.LJLLJ = r8
            if (r8 == 0) goto L70
            boolean r0 = X.C59207NLn.LIZ()
            r7 = 3
            r5 = 1
            if (r0 == 0) goto Lb2
            X.NtS r1 = r8.LIZLLL
            if (r1 == 0) goto L70
            int r0 = r8.LIZ
            if (r0 != r7) goto L70
            LIZLLL(r9, r1)
            r9.LJLLL = r5
            boolean r0 = r8.LJI
            r9.LJLLLL = r0
            X.FvE r0 = r8.LJFF
            r9.LJLJLJ = r0
            android.view.View r0 = r8.LJ
            r9.LJLLILLLL = r0
        L70:
            boolean r0 = r9.LJLLL
            if (r0 != 0) goto La9
            android.widget.FrameLayout r7 = r9.LJLILLLLZI
            boolean r0 = r7 instanceof X.C60193Njp
            if (r0 == 0) goto Lb0
            r5 = r7
            X.Njp r5 = (X.C60193Njp) r5
        L7d:
            boolean r0 = r7 instanceof X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS
            if (r0 == 0) goto Lae
            X.NtS r7 = (X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) r7
        L83:
            java.lang.String r1 = "lynx_feed"
            if (r4 == 0) goto Lac
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r0 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            if (r0 == 0) goto Laa
            java.lang.String r0 = r0.LJIIL(r1)
        L91:
            X.NUt r0 = r4.LJI(r5, r0, r6)
        L95:
            r9.LJLL = r0
            if (r4 == 0) goto La7
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r0 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            if (r0 == 0) goto La3
            java.lang.String r3 = r0.LJIIL(r1)
        La3:
            X.NKw r3 = r4.LIZLLL(r7, r3, r2)
        La7:
            r9.LJLLI = r3
        La9:
            return
        Laa:
            r0 = r3
            goto L91
        Lac:
            r0 = r3
            goto L95
        Lae:
            r7 = r3
            goto L83
        Lb0:
            r5 = r3
            goto L7d
        Lb2:
            X.Njp r1 = r8.LIZJ
            if (r1 == 0) goto L70
            int r0 = r8.LIZ
            if (r0 != r7) goto L70
            LIZLLL(r9, r1)
            r9.LJLLL = r5
            boolean r0 = r8.LJI
            r9.LJLLLL = r0
            X.FvE r0 = r8.LJFF
            r9.LJLJLJ = r0
            android.view.View r0 = r8.LJ
            r9.LJLLILLLL = r0
            goto L70
        Lcc:
            r8 = r3
            goto L4b
        Lcf:
            r4 = r3
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer.<init>(X.NLP, android.widget.FrameLayout, android.widget.FrameLayout, java.lang.String):void");
    }
}
