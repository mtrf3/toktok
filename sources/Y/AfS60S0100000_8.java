package Y;

import X.C115724gS;
import X.C169696lJ;
import X.C188727au;
import X.C1DH;
import X.C32I;
import X.C3C5;
import X.C46416IJo;
import X.C47541IlF;
import X.C48034ItC;
import X.C48649J7l;
import X.C49875Jhn;
import X.C51029K0z;
import X.C51648KOu;
import X.C54859Lfz;
import X.C54884LgO;
import X.C55096Ljo;
import X.C5S1;
import X.C60726NsQ;
import X.C64797Pbt;
import X.C65232Piu;
import X.C73969T1h;
import X.C75792yF;
import X.C78495UrL;
import X.C78999UzT;
import X.C8BT;
import X.FMX;
import X.HandlerC50613Jth;
import X.IDR;
import X.ILE;
import X.InterfaceC48722JAg;
import X.InterfaceC51622KNu;
import X.InterfaceC55235Lm3;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.JAY;
import X.JBQ;
import X.JKB;
import X.JRJ;
import X.KHM;
import X.KIP;
import X.KR8;
import X.OSZ;
import X.T16;
import X.ViewOnAttachStateChangeListenerC48975JJz;
import X.XJL;
import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.m;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdResponse;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.ml.common.MLCommonServiceImpl;
import com.ss.android.ugc.aweme.network.channel.ISpeedModeService;
import com.ss.android.ugc.aweme.relation.ffp.ui.FFPMainFragment;
import com.ss.android.ugc.aweme.relation.ffp.vm.FFPMainFragmentVM;
import com.ss.android.ugc.aweme.search.common.ui.component.searchguide.SearchSwipeGuideUIComponent;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel.DynamicSearchMusicResultViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS13S0010000_8;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class AfS60S0100000_8 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS60S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        if (obj instanceof SearchResultActivity) {
            ((JKB) afS60S0100000_8.l0).LJLLI.LIZLLL();
        }
    }

    public static final void accept$1(AfS60S0100000_8 afS60S0100000_8, Object result) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS60S0100000_8.l0;
        o.LJIIIIZZ(result, "result");
        interfaceC88472Yns.invoke(result);
    }

    public static final void accept$10(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        ((C51648KOu) afS60S0100000_8.l0).LJLILLLLZI.LIZ(C65232Piu.LIZJ("eventName", "feeds_status_failed"));
        ((C51648KOu) afS60S0100000_8.l0).mIsLoading = false;
    }

    public static final void accept$11(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        FeedsResponse feedsResponse = (FeedsResponse) obj;
        InterfaceC51622KNu interfaceC51622KNu = ((C51648KOu) afS60S0100000_8.l0).LJLILLLLZI;
        JSONObject jSONObject = new JSONObject();
        C51648KOu c51648KOu = (C51648KOu) afS60S0100000_8.l0;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("react_id", c51648KOu.LJLIL);
        jSONObject2.put("page", c51648KOu.LJLJJLL);
        jSONObject2.put("has_more", feedsResponse.hasMore);
        jSONObject2.put("exist_list_raw", C75792yF.LIZJ(feedsResponse.list));
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "feeds_status_change");
        jSONObject.put("eventType", 1);
        interfaceC51622KNu.LIZ(jSONObject);
        ((C51648KOu) afS60S0100000_8.l0).handleData(feedsResponse);
        C51648KOu c51648KOu2 = (C51648KOu) afS60S0100000_8.l0;
        Activity activity = c51648KOu2.LJLJJI;
        if (activity != null) {
            activity.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.asv, c51648KOu2);
        }
        C51648KOu c51648KOu3 = (C51648KOu) afS60S0100000_8.l0;
        c51648KOu3.mIsLoading = false;
        List<C8BT> list = c51648KOu3.mNotifyListeners;
        if (list != null) {
            for (C8BT c8bt : list) {
                if (c8bt != null) {
                    c8bt.onSuccess();
                }
            }
        }
    }

    public static final void accept$12(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        C51648KOu c51648KOu = (C51648KOu) afS60S0100000_8.l0;
        c51648KOu.mIsLoading = false;
        List<C8BT> list = c51648KOu.mNotifyListeners;
        if (list != null) {
            for (C8BT c8bt : list) {
                if (c8bt != null) {
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = null;
                    }
                    c8bt.onFailed(exc);
                }
            }
        }
    }

    public static final void accept$13(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        Message obtainMessage = ((Handler) afS60S0100000_8.l0).obtainMessage(0);
        o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
        obtainMessage.obj = obj;
        obtainMessage.sendToTarget();
    }

    public static final void accept$14(AfS60S0100000_8 afS60S0100000_8, Object unit) {
        o.LJIIIZ(unit, "unit");
        List list = (List) afS60S0100000_8.l0;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C54859Lfz) it.next()).LJLIL);
        }
    }

    public static final void accept$15(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        List<Aweme> list;
        String str;
        boolean z;
        InterfaceC48722JAg LIZIZ;
        InterfaceC55235Lm3 LJFF;
        IMidAdAbility iMidAdAbility;
        Aweme aweme = ((MidAdResponse) obj).getAweme();
        if (aweme != null) {
            MidAdVM midAdVM = (MidAdVM) afS60S0100000_8.l0;
            midAdVM.getClass();
            Fragment fragment = midAdVM.LJLJJLL;
            String str2 = null;
            if (fragment != null && (LJFF = KR8.LJFF(fragment)) != null && (iMidAdAbility = (IMidAdAbility) C55096Ljo.LIZ(LJFF, IMidAdAbility.class, null)) != null) {
                list = iMidAdAbility.im();
            } else {
                list = null;
            }
            if (!C54884LgO.LIZ(aweme, list)) {
                z = false;
            } else {
                midAdVM.LJLL = aweme;
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    str = awemeRawAd.getCreativeIdStr();
                } else {
                    str = null;
                }
                Aweme aweme2 = midAdVM.LJLJLLL;
                if (aweme2 != null && str != null) {
                    JAY.LIZ.put(str, aweme2);
                }
                String aid = aweme.getAid();
                if (aid != null) {
                    JAY.LIZJ.put(aid, aweme);
                }
                IAdReRankServiceManagerService LIZJ = AdReRankServiceManager.LIZJ();
                if (LIZJ != null && (LIZIZ = LIZJ.LIZIZ(ILE.FEED)) != null) {
                    Aweme aweme3 = midAdVM.LJLJLLL;
                    if (aweme3 != null) {
                        str2 = aweme3.getAid();
                    }
                    LIZIZ.LJII(aweme, str2);
                }
                z = true;
            }
            midAdVM.setState(new AqS13S0010000_8(z, 2));
        }
    }

    public static final void accept$16(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        Boolean it = (Boolean) obj;
        MLCommonServiceImpl mLCommonServiceImpl = (MLCommonServiceImpl) afS60S0100000_8.l0;
        o.LJIIIIZZ(it, "it");
        it.booleanValue();
        mLCommonServiceImpl.LIZLLL("app_background", null, null);
    }

    public static final void accept$17(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        ((SearchSwipeGuideUIComponent) afS60S0100000_8.l0).dismiss();
    }

    public static final void accept$18(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        if (obj instanceof SearchResultActivity) {
            ((ViewOnAttachStateChangeListenerC48975JJz) afS60S0100000_8.l0).LJLLL.LIZLLL();
        }
    }

    public static final void accept$19(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        ((InterfaceC88472Yns) afS60S0100000_8.l0).invoke(Integer.valueOf(((JSONObject) obj).optInt("stream_type", 0)));
    }

    public static final void accept$2(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        C5S1 c5s1 = new C5S1(((CreatePasswordFragment) afS60S0100000_8.l0).getContext());
        c5s1.LIZJ(com.zhiliaoapp.musically.R.string.clq);
        c5s1.LJ();
    }

    public static final void accept$20(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        ((C60726NsQ) afS60S0100000_8.l0).updateData((TemplateData) obj);
    }

    public static final void accept$21(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        String str = null;
        if (o.LJ(obj, Boolean.TRUE)) {
            C48649J7l c48649J7l = ((BackgroundAudioBrowserService) afS60S0100000_8.l0).LJLILLLLZI;
            if (c48649J7l.LIZJ() && C46416IJo.LIZJ()) {
                Aweme LJJIIZI = c48649J7l.LIZ().LJJIIZI();
                IDR LJJJ = c48649J7l.LIZ().LJJJ();
                if (LJJJ != null) {
                    str = LJJJ.getEnterFrom(true);
                }
                if (LJJIIZI != null && str != null && C46416IJo.LIZJ() && (!o.LJ(C47541IlF.LIZ, LJJIIZI.getAid()))) {
                    C47541IlF.LJ = Long.valueOf(System.currentTimeMillis());
                    C47541IlF.LJI = true;
                    C47541IlF.LIZLLL = 0L;
                    C47541IlF.LJFF(LJJIIZI, str, "audio_play", C51029K0z.LJJIIZI(new OSZ("enter_method", "enter_background")));
                    C47541IlF.LIZ = LJJIIZI.getAid();
                }
            }
            C47541IlF.LJI = ((BackgroundAudioBrowserService) afS60S0100000_8.l0).LJLILLLLZI.LIZLLL();
            C47541IlF.LJFF = Long.valueOf(System.currentTimeMillis());
            return;
        }
        if (!o.LJ(obj, Boolean.FALSE)) {
            return;
        }
        if (((BackgroundAudioBrowserService) afS60S0100000_8.l0).LJLILLLLZI.LIZLLL()) {
            ((BackgroundAudioBrowserService) afS60S0100000_8.l0).LJLILLLLZI.LJFF();
        }
        boolean LIZLLL = ((BackgroundAudioBrowserService) afS60S0100000_8.l0).LJLILLLLZI.LIZLLL();
        if (LIZLLL) {
            C47541IlF.LJI = LIZLLL;
        }
        Long l = C47541IlF.LJFF;
        if (l == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        C47541IlF.LJFF = null;
        C188727au LJ = C169696lJ.LJ(currentTimeMillis, "duration");
        LJ.LJFF(Boolean.valueOf(C47541IlF.LJI), "has_play_audio");
        FMX.LJIIL("background_duration", LJ.LIZ);
    }

    public static final void accept$22(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        TemplateData it = (TemplateData) obj;
        SearchBaseSparkView searchBaseSparkView = (SearchBaseSparkView) afS60S0100000_8.l0;
        o.LJIIIIZZ(it, "it");
        searchBaseSparkView.LJIIJJI(it);
    }

    public static final void accept$23(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        if (obj instanceof C64797Pbt) {
            obj = ((C64797Pbt) obj).LIZIZ;
        }
        Object obj2 = null;
        if (Response.class.isAssignableFrom(SuggestWordResponse.class) || !(obj instanceof Response)) {
            XJL xjl = (XJL) afS60S0100000_8.l0;
            if (!(obj instanceof SuggestWordResponse)) {
                obj = null;
            }
            C3C5.m7constructorimpl(obj);
            xjl.resumeWith(obj);
            return;
        }
        Response response = (Response) obj;
        if (response.isCodeOK()) {
            Object obj3 = response.data;
            if (obj3 == null) {
                obj3 = Boolean.TRUE;
            }
            if (obj3 instanceof SuggestWordResponse) {
                obj2 = obj3;
            }
        }
        XJL xjl2 = (XJL) afS60S0100000_8.l0;
        C3C5.m7constructorimpl(obj2);
        xjl2.resumeWith(obj2);
    }

    public static final void accept$24(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        XJL xjl = (XJL) afS60S0100000_8.l0;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    public static final void accept$25(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        ((InterfaceC88472Yns) afS60S0100000_8.l0).invoke(obj);
    }

    public static final void accept$26(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        ArrayList it = (ArrayList) obj;
        JRJ jrj = (JRJ) afS60S0100000_8.l0;
        jrj.LJLJJI = true;
        if (jrj.LIZLLL()) {
            SearchHorizontalInnerContainer searchHorizontalInnerContainer = ((JRJ) afS60S0100000_8.l0).LJLJJLL;
            o.LJIIIIZZ(it, "it");
            searchHorizontalInnerContainer.P(it);
        } else {
            JRJ jrj2 = (JRJ) afS60S0100000_8.l0;
            o.LJIIIIZZ(it, "it");
            if (jrj2.LIZLLL()) {
                jrj2.LJLJJLL.P(it);
            } else {
                C1DH.LJJIJIIJIL(40L, new ARunnableS27S0200000_8(it, jrj2, 87));
            }
        }
    }

    public static final void accept$27(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        m mVar = (m) obj;
        KIP kip = ((DynamicSearchMusicResultViewModel) afS60S0100000_8.l0).LJLJJL;
        if (kip != null) {
            kip.Oh(mVar);
        }
    }

    public static final void accept$28(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        KIP kip = ((DynamicSearchMusicResultViewModel) afS60S0100000_8.l0).LJLJJL;
        if (kip != null) {
            kip.Oh(null);
        }
    }

    public static final void accept$29(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        OSZ osz = (OSZ) obj;
        ((KHM) afS60S0100000_8.l0).LIZIZ().setScaleType(ImageView.ScaleType.FIT_CENTER);
        ((KHM) afS60S0100000_8.l0).LIZIZ().setImageBitmap((Bitmap) osz.getFirst());
        if (osz.getSecond() != null) {
            ((KHM) afS60S0100000_8.l0).LIZIZ().setBackground(new BitmapDrawable((Bitmap) osz.getSecond()));
        }
    }

    public static final void accept$3(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        ((InterfaceC88472Yns) afS60S0100000_8.l0).invoke(null);
    }

    public static final void accept$30(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        Object value = ((KHM) afS60S0100000_8.l0).LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-imageErrorView>(...)");
        ((ImageView) value).setVisibility(0);
        ((KHM) afS60S0100000_8.l0).LIZIZ().setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static final void accept$31(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        Aweme aweme = (Aweme) obj;
        JBQ jbq = (JBQ) afS60S0100000_8.l0;
        jbq.getClass();
        if (aweme == null) {
            return;
        }
        C115724gS c115724gS = C115724gS.LJLIL;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C78999UzT.LJFF(c115724gS.LIZJ(500L, timeUnit).LJIILIIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIIJ(new InterfaceC64592gB() { // from class: X.9FT
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        }, new C48034ItC(jbq, aweme, c115724gS.LIZJ(3500L, timeUnit).LJIILIIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()))), jbq.LJLJJL);
    }

    public static final void accept$32(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        JBQ jbq = (JBQ) afS60S0100000_8.l0;
        jbq.LIZ(jbq.LJLIL, jbq.LJLJJI, false, true);
    }

    public static final void accept$4(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        ((ISpeedModeService) afS60S0100000_8.l0).LIZIZ(false);
    }

    public static final void accept$5(AfS60S0100000_8 afS60S0100000_8, Object result) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS60S0100000_8.l0;
        o.LJIIIIZZ(result, "result");
        interfaceC88472Yns.invoke(result);
    }

    public static final void accept$6(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        String it = (String) obj;
        FFPMainFragmentVM Il = ((FFPMainFragment) afS60S0100000_8.l0).Il();
        o.LJIIIIZZ(it, "it");
        Il.getClass();
        Il.setState(new AqS28S1000000_3(it, 12));
    }

    public static final void accept$7(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        long longValue;
        if (((C78495UrL) obj).LIZIZ) {
            ((HandlerC50613Jth) afS60S0100000_8.l0).removeCallbacksAndMessages(null);
            Long valueOf = Long.valueOf(((HandlerC50613Jth) afS60S0100000_8.l0).LIZJ);
            if (valueOf.longValue() > 0) {
                longValue = valueOf.longValue();
            } else {
                longValue = ((Number) ((HandlerC50613Jth) afS60S0100000_8.l0).LJ.getValue()).longValue();
            }
            ((HandlerC50613Jth) afS60S0100000_8.l0).LIZJ = longValue - (SystemClock.elapsedRealtime() - ((HandlerC50613Jth) afS60S0100000_8.l0).LIZLLL);
            return;
        }
        HandlerC50613Jth handlerC50613Jth = (HandlerC50613Jth) afS60S0100000_8.l0;
        handlerC50613Jth.LIZIZ(handlerC50613Jth.LIZJ);
    }

    public static final void accept$8(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS60S0100000_8.l0;
        Message obtain = Message.obtain();
        obtain.obj = obj;
        interfaceC88472Yns.invoke(obtain);
    }

    public static final void accept$9(AfS60S0100000_8 afS60S0100000_8, Object obj) {
        C49875Jhn c49875Jhn = (C49875Jhn) afS60S0100000_8.l0;
        Message obtain = Message.obtain();
        obtain.obj = obj;
        c49875Jhn.handleMsg(obtain);
    }
}
