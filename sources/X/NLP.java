package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NLP implements NQG, Observer<C207668Da> {
    public final ViewStub LJLIL;
    public final FrameLayout LJLILLLLZI;
    public FeedAdLynxMaskContainer LJLJI;
    public DataCenter LJLJJI;
    public FrameLayout LJLJJL;
    public Aweme LJLJJLL;
    public final NLW LJLJL;

    @Override // X.NQG
    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LJLJI;
        if (feedAdLynxMaskContainer != null) {
            Object context = feedAdLynxMaskContainer.LJLJI.getContext();
            if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(feedAdLynxMaskContainer);
            }
            if (C59207NLn.LIZ()) {
                EventBus.LIZJ().LJIJ(feedAdLynxMaskContainer);
                if (!feedAdLynxMaskContainer.LJLLL) {
                    FrameLayout frameLayout = feedAdLynxMaskContainer.LJLILLLLZI;
                    if ((frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) frameLayout) != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                    }
                    feedAdLynxMaskContainer.LJLLLL = false;
                    this.LJLJI = null;
                }
            }
        }
    }

    @Override // X.NQG
    public final void LIZJ() {
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        String cardUrl;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2;
        if (IEW.LJFF) {
            return;
        }
        if ((!C58062Pq.LIZ() || (feedAdLynxMaskContainer2 = this.LJLJI) == null || !feedAdLynxMaskContainer2.LJLLL) && (feedAdLynxMaskContainer = this.LJLJI) != null) {
            FrameLayout frameLayout = feedAdLynxMaskContainer.LJLILLLLZI;
            if ((frameLayout instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) frameLayout) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
                FrameLayout frameLayout2 = feedAdLynxMaskContainer.LJLILLLLZI;
                if ((frameLayout2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) frameLayout2) != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
                }
            }
            feedAdLynxMaskContainer.LJLLLL = false;
            CardStruct cardStruct = feedAdLynxMaskContainer.LJLJJLL;
            if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
                Uri.Builder buildUpon = UriProtector.parse(cardUrl).buildUpon();
                Aweme aweme = feedAdLynxMaskContainer.LJLJJL;
                JSONObject jSONObject = feedAdLynxMaskContainer.LJLJL;
                Context context = feedAdLynxMaskContainer.LJLILLLLZI.getContext();
                o.LJIIIIZZ(context, "containerView.context");
                String jVar = NGI.LIZ(context, aweme, jSONObject).toString();
                o.LJIIIIZZ(jVar, "dataObj.toString()");
                buildUpon.appendQueryParameter("initialData", jVar);
                if (C59207NLn.LIZ()) {
                    NKV nkv = feedAdLynxMaskContainer.LJLLI;
                    if (nkv != null) {
                        String builder = buildUpon.toString();
                        o.LJIIIIZZ(builder, "urlBuilder.toString()");
                        Aweme aweme2 = feedAdLynxMaskContainer.LJLJJL;
                        Context context2 = feedAdLynxMaskContainer.LJLILLLLZI.getContext();
                        o.LJIIIIZZ(context2, "containerView.context");
                        nkv.LIZ(NGI.LIZIZ(context2, aweme2), builder, C59209NLp.LIZ().enableLynxMask);
                        return;
                    }
                    return;
                }
                NLT nlt = feedAdLynxMaskContainer.LJLL;
                if (nlt == null) {
                    return;
                }
                String builder2 = buildUpon.toString();
                o.LJIIIIZZ(builder2, "urlBuilder.toString()");
                Aweme aweme3 = feedAdLynxMaskContainer.LJLJJL;
                Context context3 = feedAdLynxMaskContainer.LJLILLLLZI.getContext();
                o.LJIIIIZZ(context3, "containerView.context");
                nlt.LIZ(NGI.LIZIZ(context3, aweme3), builder2);
            }
        }
    }

    @Override // X.NQG
    public final void LIZLLL() {
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LJLJI;
        if (feedAdLynxMaskContainer != null) {
            feedAdLynxMaskContainer.LIZIZ(false);
        }
    }

    @Override // X.NQG
    public final void LJ() {
        FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LJLJI;
        if (feedAdLynxMaskContainer != null) {
            feedAdLynxMaskContainer.LIZIZ(true);
        }
    }

    @Override // X.NQG
    public final boolean show() {
        boolean z;
        String str;
        String str2;
        C59186NKs c59186NKs;
        String str3;
        String str4;
        Aweme aweme = this.LJLJJLL;
        if (aweme != null && C63081OpJ.LLJJJIL(aweme)) {
            z = true;
        } else {
            z = false;
        }
        String str5 = "";
        if (!z) {
            FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LJLJI;
            if (feedAdLynxMaskContainer != null && (str4 = feedAdLynxMaskContainer.LJLZ) != null) {
                str5 = str4;
            }
            C37149Ei1.LIZ(str5, "should not show lynx mask", C59207NLn.LIZ(), false);
            return false;
        }
        FrameLayout frameLayout = this.LJLJJL;
        if (frameLayout == null) {
            return false;
        }
        if (IEW.LJFF) {
            FeedAdLynxMaskContainer feedAdLynxMaskContainer2 = this.LJLJI;
            if (feedAdLynxMaskContainer2 != null && (str3 = feedAdLynxMaskContainer2.LJLZ) != null) {
                str5 = str3;
            }
            C37149Ei1.LIZ(str5, "show cancel: is showing", C59207NLn.LIZ(), false);
            return false;
        }
        FeedAdLynxMaskContainer feedAdLynxMaskContainer3 = this.LJLJI;
        if (feedAdLynxMaskContainer3 != null && feedAdLynxMaskContainer3.LJLLLL) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("currentPlayedIndex", Integer.valueOf(IEW.LIZIZ));
            jSONObject.putOpt("playedIndices", ORZ.LLJI(((LinkedHashMap) IEW.LIZ).keySet()).toString());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendSubVideoStatusToFE: param= ");
            LIZ.append(jSONObject);
            IE0.LIZ(X1D.LIZIZ(LIZ));
            feedAdLynxMaskContainer3.LJ("storyMaskShow", jSONObject);
            FeedAdLynxMaskContainer feedAdLynxMaskContainer4 = this.LJLJI;
            if (feedAdLynxMaskContainer4 == null || (str2 = feedAdLynxMaskContainer4.LJLZ) == null) {
                str2 = "";
            }
            C37149Ei1.LIZ(str2, null, C59207NLn.LIZ(), true);
            frameLayout.setAlpha(0.0f);
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(1.0f).setDuration(150L).start();
            FeedAdLynxMaskContainer feedAdLynxMaskContainer5 = this.LJLJI;
            if (feedAdLynxMaskContainer5 != null) {
                if (C58062Pq.LIZ() && feedAdLynxMaskContainer5.LJLLL && (c59186NKs = feedAdLynxMaskContainer5.LJLLJ) != null) {
                    c59186NKs.LJII = true;
                }
                feedAdLynxMaskContainer5.LJ("maskShow", null);
            }
            Aweme aweme2 = this.LJLJJLL;
            if (aweme2 != null) {
                str5 = ECommerceService.createIECommerceServicebyMonsterPlugin(false).generateAdLynxLogExtraAll(aweme2, ECommerceService.createIECommerceServicebyMonsterPlugin(false).generateTrackId(aweme2));
            }
            JSONObject LIZJ = C65232Piu.LIZJ("aweme_log", str5);
            FeedAdLynxMaskContainer feedAdLynxMaskContainer6 = this.LJLJI;
            if (feedAdLynxMaskContainer6 != null) {
                feedAdLynxMaskContainer6.LJ("sendAwemeLogEvent", LIZJ);
            }
            IEW.LJFF = true;
            return true;
        }
        if (feedAdLynxMaskContainer3 != null && (str = feedAdLynxMaskContainer3.LJLZ) != null) {
            str5 = str;
        }
        C37149Ei1.LIZ(str5, "show cancel: load failed", C59207NLn.LIZ(), false);
        return false;
    }

    @Override // X.NQG
    public final boolean isShowing() {
        return IEW.LJFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (X.C63081OpJ.LLJJJIL(r5) == true) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    @Override // X.NQG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L16
            boolean r1 = X.C63081OpJ.LLJJJIL(r5)
            r0 = 1
            if (r1 != r0) goto L16
        L9:
            r2 = 0
            if (r0 != 0) goto L18
            r4.LJLJJLL = r2
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r0 = r4.LJLJI
            if (r0 == 0) goto L15
            r0.LIZ(r2)
        L15:
            return
        L16:
            r0 = 0
            goto L9
        L18:
            r4.LJLJJLL = r5
            android.view.ViewStub r0 = r4.LJLIL
            if (r0 == 0) goto L41
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L41
            boolean r0 = X.C59207NLn.LIZ()
            if (r0 == 0) goto L46
            android.view.ViewStub r1 = r4.LJLIL
            r0 = 2131561432(0x7f0d0bd8, float:1.8748264E38)
            r1.setLayoutResource(r0)
            android.view.ViewStub r0 = r4.LJLIL
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkView"
            kotlin.jvm.internal.o.LJII(r1, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r4.LJLJJL = r1
        L41:
            android.widget.FrameLayout r3 = r4.LJLJJL
            if (r3 != 0) goto L5e
            return
        L46:
            android.view.ViewStub r1 = r4.LJLIL
            r0 = 2131561431(0x7f0d0bd7, float:1.8748262E38)
            r1.setLayoutResource(r0)
            android.view.ViewStub r0 = r4.LJLIL
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.BulletContainerView"
            kotlin.jvm.internal.o.LJII(r1, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r4.LJLJJL = r1
            goto L41
        L5e:
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r0 = r4.LJLJI
            if (r0 == 0) goto L7a
            boolean r0 = X.C58062Pq.LIZ()
            if (r0 == 0) goto L89
            if (r5 == 0) goto L9d
            java.lang.String r1 = r5.getAid()
        L6e:
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r0 = r4.LJLJI
            if (r0 == 0) goto L9b
            java.lang.String r0 = r0.LJLJJI
        L74:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L89
        L7a:
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r1 = new com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer
            android.widget.FrameLayout r0 = r4.LJLILLLLZI
            if (r5 == 0) goto L84
            java.lang.String r2 = r5.getAid()
        L84:
            r1.<init>(r4, r3, r0, r2)
            r4.LJLJI = r1
        L89:
            com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer r0 = r4.LJLJI
            if (r0 == 0) goto L90
            r0.LIZ(r5)
        L90:
            android.widget.FrameLayout r1 = r4.LJLJJL
            if (r1 != 0) goto L95
        L94:
            return
        L95:
            r0 = 8
            r1.setVisibility(r0)
            goto L94
        L9b:
            r0 = r2
            goto L74
        L9d:
            r1 = r2
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NLP.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.NQG
    public final void LJJIFFI(DataCenter dataCenter) {
        this.LJLJJI = dataCenter;
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
        }
    }

    @Override // X.NQG
    public final void LJJLIIIJL(boolean z) {
        DataCenter dataCenter;
        FrameLayout frameLayout = this.LJLJJL;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setAlpha(1.0f);
        frameLayout.setVisibility(8);
        frameLayout.animate().alpha(0.0f).setDuration(150L).start();
        IEW.LJFF = false;
        if (z && (dataCenter = this.LJLJJI) != null) {
            dataCenter.jv0(null, "ad_feed_resume_video");
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        long j;
        Aweme aweme;
        C207668Da c207668Da2 = c207668Da;
        Aweme aweme2 = this.LJLJJLL;
        if (aweme2 != null && C63081OpJ.LLJJJIL(aweme2) && c207668Da2 != null && (str = c207668Da2.LIZ) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != -1132409520 || !str.equals("ad_feed_on_page_selected")) {
                    return;
                }
                if (C58062Pq.LIZ() && (aweme = this.LJLJJLL) != null) {
                    C63081OpJ.LLJJJIL(aweme);
                }
                FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.LJLJI;
                if (feedAdLynxMaskContainer == null) {
                    return;
                }
                EventBus.LIZJ().LJIILJJIL(feedAdLynxMaskContainer);
                return;
            }
            if (!str.equals("ad_feed_on_page_unselected")) {
                return;
            }
            Handler handler = new Handler(C16880lQ.LLJJJJ());
            ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, LiveTryModeCountDownThresholdSetting.DEFAULT);
            if (((Boolean) C34218Dbq.LIZ.getValue()).booleanValue()) {
                j = ((Number) C34218Dbq.LIZIZ.getValue()).longValue();
            } else {
                j = 200;
            }
            handler.postDelayed(aRunnableS46S0100000_10, j);
            FrameLayout frameLayout = this.LJLJJL;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            FeedAdLynxMaskContainer feedAdLynxMaskContainer2 = this.LJLJI;
            if (feedAdLynxMaskContainer2 == null) {
                return;
            }
            EventBus.LIZJ().LJIJ(feedAdLynxMaskContainer2);
        }
    }

    public NLP(ViewStub viewStub, FrameLayout container) {
        NLW nlw;
        o.LJIIIZ(container, "container");
        this.LJLIL = viewStub;
        this.LJLILLLLZI = container;
        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(17);
        if (LIZLLL instanceof NLW) {
            nlw = (NLW) LIZLLL;
        } else {
            nlw = null;
        }
        this.LJLJL = nlw;
    }
}
