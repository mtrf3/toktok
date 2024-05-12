package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.AdQuestionnaire;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NLY implements InterfaceC59346NQw, Observer<C207668Da> {
    public final ViewStub LJLIL;
    public FeedAdLynxSurvey LJLILLLLZI;
    public DataCenter LJLJI;
    public FrameLayout LJLJJI;
    public Aweme LJLJJL;
    public Long LJLJJLL;
    public final Keva LJLJL;
    public boolean LJLJLJ;
    public C59197NLd LJLJLLL;
    public final NLW LJLL;

    public final void LIZ() {
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.LJLJLJ = false;
        this.LJLJLLL = null;
    }

    @Override // X.InterfaceC59346NQw
    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        FeedAdLynxSurvey feedAdLynxSurvey = this.LJLILLLLZI;
        if (feedAdLynxSurvey != null) {
            Object context = feedAdLynxSurvey.LJLILLLLZI.getContext();
            if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(feedAdLynxSurvey);
            }
            feedAdLynxSurvey.LIZIZ();
            feedAdLynxSurvey.LJLLJ = false;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = feedAdLynxSurvey.LJLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
            }
            View view = feedAdLynxSurvey.LJLJLJ;
            if ((view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) view) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            }
            this.LJLILLLLZI = null;
        }
    }

    @Override // X.InterfaceC59346NQw
    public final void LIZJ() {
        FeedAdLynxSurvey feedAdLynxSurvey;
        String schema;
        String str;
        String str2;
        String str3;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        NLW nlw = this.LJLL;
        if (nlw != null && nlw.LJIILLIIL(this.LJLJJL) && LIZLLL() && !this.LJLJLJ && (feedAdLynxSurvey = this.LJLILLLLZI) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = feedAdLynxSurvey.LJLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView() != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = feedAdLynxSurvey.LJLL) != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            }
            feedAdLynxSurvey.LJLLJ = false;
            AdQuestionnaire adQuestionnaire = feedAdLynxSurvey.LJLJJL;
            if (adQuestionnaire != null && (schema = adQuestionnaire.getSchema()) != null) {
                Uri.Builder buildUpon = UriProtector.parse(schema).buildUpon();
                m mVar = new m();
                AwemeRawAd awemeRawAd = feedAdLynxSurvey.LJLJJI;
                String str4 = null;
                if (awemeRawAd != null) {
                    Long adId = awemeRawAd.getAdId();
                    if (adId != null) {
                        str = String.valueOf(adId);
                    } else {
                        str = null;
                    }
                    mVar.LJJIIZ("adId", str);
                    mVar.LJJIIZ("creativeId", awemeRawAd.getCreativeIdStr());
                    mVar.LJJIIZ("logExtra", awemeRawAd.getLogExtra());
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId != null) {
                        str2 = String.valueOf(groupId);
                    } else {
                        str2 = null;
                    }
                    mVar.LJJIIZ("groupId", str2);
                    AdQuestionnaire adQuestionnaire2 = awemeRawAd.getAdQuestionnaire();
                    if (adQuestionnaire2 != null) {
                        str3 = adQuestionnaire2.getContent();
                    } else {
                        str3 = null;
                    }
                    mVar.LJJIIZ("content", str3);
                }
                mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(feedAdLynxSurvey.LJLILLLLZI.getContext()) ? 1 : 0));
                String jVar = mVar.toString();
                o.LJIIIIZZ(jVar, "dataObj.toString()");
                buildUpon.appendQueryParameter("initialData", jVar);
                NKV nkv = feedAdLynxSurvey.LJLJLLL;
                if (nkv != null) {
                    String builder = buildUpon.toString();
                    o.LJIIIIZZ(builder, "urlBuilder.toString()");
                    Bundle bundle = new Bundle();
                    Context context = feedAdLynxSurvey.LJLILLLLZI.getContext();
                    NLW nlw2 = (NLW) feedAdLynxSurvey.LJLJL.getValue();
                    if (nlw2 != null) {
                        Aweme aweme = feedAdLynxSurvey.LJLJI;
                        o.LJIIIIZZ(context, "context");
                        nlw2.LJIIIIZZ(context, bundle, aweme);
                    }
                    AwemeRawAd awemeRawAd2 = feedAdLynxSurvey.LJLJJI;
                    if (awemeRawAd2 != null) {
                        str4 = awemeRawAd2.getNativeSiteCustomData();
                    }
                    bundle.putString("bundle_native_site_custom_data", str4);
                    nkv.LIZ(bundle, builder, C59209NLp.LIZ().enableLynxSurvey);
                }
            }
        }
    }

    public final boolean LIZLLL() {
        Long l;
        int i;
        AwemeRawAd awemeRawAd;
        AdQuestionnaire adQuestionnaire;
        Integer showInterval;
        if (this.LJLJJLL == null) {
            try {
                this.LJLJJLL = Long.valueOf(this.LJLJL.getLong("feed_ad_survey_last_show_time", -1L));
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                C36922EeM.LJFF(e);
            }
        }
        Long l2 = this.LJLJJLL;
        if ((l2 != null && l2.longValue() == -1) || (l = this.LJLJJLL) == null) {
            return true;
        }
        long longValue = l.longValue();
        Aweme aweme = this.LJLJJL;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adQuestionnaire = awemeRawAd.getAdQuestionnaire()) != null && (showInterval = adQuestionnaire.getShowInterval()) != null) {
            i = showInterval.intValue();
        } else {
            i = 259200;
        }
        if (System.currentTimeMillis() - longValue > i * 1000) {
            return true;
        }
        return false;
    }

    public NLY(ViewStub viewStub) {
        NLW nlw;
        this.LJLIL = viewStub;
        Keva repo = Keva.getRepo("feed_ad_survey_repo");
        o.LJIIIIZZ(repo, "getRepo(SURVEY_REPO)");
        this.LJLJL = repo;
        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(17);
        if (LIZLLL instanceof NLW) {
            nlw = (NLW) LIZLLL;
        } else {
            nlw = null;
        }
        this.LJLL = nlw;
    }

    @Override // X.InterfaceC59346NQw
    public final void LJJIFFI(DataCenter dataCenter) {
        this.LJLJI = dataCenter;
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
            dataCenter.iv0("ad_video_on_resume_play", this, false);
            dataCenter.iv0("ad_video_on_render_ready", this, false);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        DataCenter dataCenter;
        FeedAdLynxSurvey feedAdLynxSurvey;
        DataCenter dataCenter2;
        C207668Da c207668Da2 = c207668Da;
        NLW nlw = this.LJLL;
        if (nlw == null || !nlw.LJIILLIIL(this.LJLJJL) || c207668Da2 == null || (str = c207668Da2.LIZ) == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1929582278:
                if (!str.equals("ad_video_on_render_ready") || !this.LJLJLJ || (dataCenter2 = this.LJLJI) == null) {
                    return;
                }
                dataCenter2.jv0(null, "action_ad_pop_up_web_pause_video");
                return;
            case -1540531799:
                if (!str.equals("ad_feed_on_page_unselected")) {
                    return;
                }
                FeedAdLynxSurvey feedAdLynxSurvey2 = this.LJLILLLLZI;
                if (feedAdLynxSurvey2 != null) {
                    feedAdLynxSurvey2.LIZIZ();
                }
                LIZ();
                return;
            case -1132409520:
                if (!str.equals("ad_feed_on_page_selected") || (feedAdLynxSurvey = this.LJLILLLLZI) == null) {
                    return;
                }
                EventBus.LIZJ().LJIILJJIL(feedAdLynxSurvey);
                return;
            case 2040441990:
                if (!str.equals("ad_video_on_resume_play") || !this.LJLJLJ || (dataCenter = this.LJLJI) == null) {
                    return;
                }
                dataCenter.jv0(null, "action_ad_pop_up_web_pause_video");
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC59346NQw
    public final void LLLZ(int i, Aweme aweme) {
        NLW nlw = this.LJLL;
        if (nlw != null && nlw.LJIILLIIL(aweme)) {
            this.LJLJJL = aweme;
            if (this.LJLIL.getParent() != null) {
                this.LJLIL.setLayoutResource(R.layout.bjq);
                View inflate = this.LJLIL.inflate();
                o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                this.LJLJJI = (FrameLayout) inflate;
            }
            FrameLayout frameLayout = this.LJLJJI;
            if (frameLayout == null) {
                return;
            }
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = new FeedAdLynxSurvey(this, frameLayout);
            }
            FeedAdLynxSurvey feedAdLynxSurvey = this.LJLILLLLZI;
            if (feedAdLynxSurvey != null) {
                feedAdLynxSurvey.LIZ(i, aweme);
            }
            LIZ();
            return;
        }
        this.LJLJJL = null;
        FeedAdLynxSurvey feedAdLynxSurvey2 = this.LJLILLLLZI;
        if (feedAdLynxSurvey2 != null) {
            feedAdLynxSurvey2.LIZ(0, null);
        }
    }

    @Override // X.InterfaceC59346NQw
    public final boolean LLLZI(int i, int i2, int i3) {
        FrameLayout frameLayout;
        boolean z;
        String str;
        AdQuestionnaire adQuestionnaire;
        Long l;
        int i4;
        InterfaceC60761Nsz kitView;
        AwemeRawAd awemeRawAd;
        int i5;
        String str2;
        AdQuestionnaire adQuestionnaire2;
        AwemeRawAd awemeRawAd2;
        AdQuestionnaire adQuestionnaire3;
        NLW nlw = this.LJLL;
        if (nlw == null || !nlw.LJIILLIIL(this.LJLJJL) || (frameLayout = this.LJLJJI) == null || this.LJLJLJ || !LIZLLL()) {
            return false;
        }
        FeedAdLynxSurvey feedAdLynxSurvey = this.LJLILLLLZI;
        if (feedAdLynxSurvey != null && feedAdLynxSurvey.LJLLJ) {
            z = true;
        } else {
            z = false;
        }
        Long l2 = null;
        if (!z) {
            Aweme aweme = this.LJLJJL;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "show_failed", awemeRawAd);
            Aweme aweme2 = this.LJLJJL;
            if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (adQuestionnaire3 = awemeRawAd2.getAdQuestionnaire()) != null) {
                i5 = adQuestionnaire3.getId();
            } else {
                i5 = 0;
            }
            C0JU.LIZJ(i5, LIZLLL, "five_star_survey_id");
            Aweme aweme3 = this.LJLJJL;
            if (aweme3 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    AwemeRawAd awemeRawAd3 = aweme3.getAwemeRawAd();
                    if (awemeRawAd3 != null && (adQuestionnaire2 = awemeRawAd3.getAdQuestionnaire()) != null) {
                        str2 = adQuestionnaire2.getSchema();
                    } else {
                        str2 = null;
                    }
                    jSONObject.put("feed_ad_survey_url", str2);
                    AwemeRawAd awemeRawAd4 = aweme3.getAwemeRawAd();
                    if (awemeRawAd4 != null) {
                        l2 = awemeRawAd4.getCreativeId();
                    }
                    jSONObject.put("feed_ad_survey_creative_id", l2);
                } catch (Exception e) {
                    C78983UzD.LJIIZILJ(e);
                }
                C09900aA.LJIIJJI("aweme_feed_ad_lynx_survey_show_error_rate", 1, jSONObject);
            }
            return false;
        }
        frameLayout.setVisibility(0);
        long currentTimeMillis = System.currentTimeMillis();
        FeedAdLynxSurvey feedAdLynxSurvey2 = this.LJLILLLLZI;
        if (feedAdLynxSurvey2 != null) {
            JSONObject LIZLLL2 = Q7K.LIZLLL("time", currentTimeMillis);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = feedAdLynxSurvey2.LJLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.LJIIIZ("ad_survey_show", LIZLLL2);
            }
            feedAdLynxSurvey2.LJLJJLL = currentTimeMillis;
            feedAdLynxSurvey2.LJLLILLLL = "";
            DataCenter dataCenter = feedAdLynxSurvey2.LJLIL.LJLJI;
            if (dataCenter != null) {
                dataCenter.jv0(null, "action_ad_pop_up_web_pause_video");
            }
            C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "othershow", feedAdLynxSurvey2.LJLJJI);
            AwemeRawAd awemeRawAd5 = feedAdLynxSurvey2.LJLJJI;
            if (awemeRawAd5 != null) {
                l = awemeRawAd5.getAdId();
            } else {
                l = null;
            }
            LIZLLL3.LIZJ(l, "ad_id");
            AdQuestionnaire adQuestionnaire4 = feedAdLynxSurvey2.LJLJJL;
            if (adQuestionnaire4 != null) {
                i4 = adQuestionnaire4.getId();
            } else {
                i4 = 0;
            }
            C0JU.LIZJ(i4, LIZLLL3, "five_star_survey_id");
        }
        this.LJLJJLL = Long.valueOf(currentTimeMillis);
        try {
            this.LJLJL.storeLong("feed_ad_survey_last_show_time", currentTimeMillis);
        } catch (Exception e2) {
            C78983UzD.LJIIZILJ(e2);
            C36922EeM.LJFF(e2);
        }
        this.LJLJLJ = true;
        this.LJLJLLL = new C59197NLd(i, i2, i3);
        Aweme aweme4 = this.LJLJJL;
        if (aweme4 != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                AwemeRawAd awemeRawAd6 = aweme4.getAwemeRawAd();
                if (awemeRawAd6 != null && (adQuestionnaire = awemeRawAd6.getAdQuestionnaire()) != null) {
                    str = adQuestionnaire.getSchema();
                } else {
                    str = null;
                }
                jSONObject2.put("feed_ad_survey_url", str);
                AwemeRawAd awemeRawAd7 = aweme4.getAwemeRawAd();
                if (awemeRawAd7 != null) {
                    l2 = awemeRawAd7.getCreativeId();
                }
                jSONObject2.put("feed_ad_survey_creative_id", l2);
            } catch (Exception e3) {
                C78983UzD.LJIIZILJ(e3);
            }
            C09900aA.LJIIJJI("aweme_feed_ad_lynx_survey_show_error_rate", 0, jSONObject2);
        }
        return true;
    }
}
