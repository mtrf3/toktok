package Y;

import X.AV1;
import X.C018905p;
import X.C03880Dg;
import X.C0NB;
import X.C164086cG;
import X.C165256e9;
import X.C16880lQ;
import X.C1JI;
import X.C221138m5;
import X.C26206AQg;
import X.C39579Fg7;
import X.C46982IcE;
import X.C47069Idd;
import X.C47322Ihi;
import X.C47333Iht;
import X.C47676InQ;
import X.C47677InR;
import X.C48135Iup;
import X.C48136Iuq;
import X.C48387Iyt;
import X.C48456J0a;
import X.C48520J2m;
import X.C48841JEv;
import X.C48887JGp;
import X.C48966JJq;
import X.C49006JLe;
import X.C49124JPs;
import X.C49369JZd;
import X.C49724JfM;
import X.C49791JgR;
import X.C49818Jgs;
import X.C49915JiR;
import X.C49924Jia;
import X.C49929Jif;
import X.C49931Jih;
import X.C49944Jiu;
import X.C50086JlC;
import X.C50365Jph;
import X.C50541JsX;
import X.C50589JtJ;
import X.C50637Ju5;
import X.C50641Ju9;
import X.C50741Jvl;
import X.C51782KTy;
import X.C61328O5c;
import X.C64962gm;
import X.C65300Pk0;
import X.C68322mC;
import X.C74492w9;
import X.C76732zl;
import X.C78613UtF;
import X.C78934UyQ;
import X.C79146V4k;
import X.C84673XKz;
import X.C8W0;
import X.FMX;
import X.FUA;
import X.IDP;
import X.IPG;
import X.InterfaceC48516J2i;
import X.InterfaceC48720JAe;
import X.InterfaceC49833Jh7;
import X.InterfaceC50639Ju7;
import X.J0Z;
import X.JKG;
import X.JN8;
import X.JND;
import X.JOO;
import X.JQA;
import X.KAV;
import X.KR8;
import X.KU4;
import X.KU5;
import X.MBA;
import X.O5Y;
import X.OBS;
import X.OSZ;
import X.SIR;
import X.ViewOnAttachStateChangeListenerC49251JUp;
import X.X1D;
import X.XKX;
import X.Z9N;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ARunnableS19S0300000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static void LIZIZ$5(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "9150247863302494679")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public static void LIZIZ$7(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6787802759487469907")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            IPG ipg = (IPG) this.l0;
            if (ipg.LJI == null) {
                ipg.LJI = 1;
            }
            jSONObject.put("type", ((IPG) this.l0).LJI.toString());
            jSONObject.put("sourceId", ((IPG) this.l0).LIZ);
            jSONObject.put("errorCode", ((IPG) this.l0).LJ);
            jSONObject.put("errorExtra", ((IPG) this.l0).LJFF);
            C48387Iyt c48387Iyt = C48136Iuq.LIZ;
            jSONObject.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
            jSONObject.put("playUrl", JsonParseUtils.LIZLLL(((Video) this.l1).getProperPlayAddr()));
            jSONObject.put("playUrlIsLowBr", ((Video) this.l1).isLowBr());
            jSONObject.put("playerType", ((IDP) this.l2).LJJJJIZL().getPlayerType().toString());
            Object obj = ((IPG) this.l0).LJI;
            if (obj != null) {
                jSONObject.put("extraInfo", obj.toString());
            }
            IDP idp = (IDP) this.l2;
            if (idp.LLJLILLLLZIIL == null) {
                idp.LLJLILLLLZIIL = C39579Fg7.LJIIIZ(C39579Fg7.LJIIL());
            }
            File file = ((IDP) this.l2).LLJLILLLLZIIL;
            if (file != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(file.getPath());
                LIZ.append("/");
                C48135Iup c48135Iup = C48135Iup.LIZ;
                String uri = ((Video) this.l1).getProperPlayAddr().getUri();
                c48135Iup.getClass();
                LIZ.append(C48135Iup.LIZ(uri));
                str = new C165256e9(X1D.LIZIZ(LIZ)).toString();
            } else {
                str = "";
            }
            jSONObject.put("file", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        FUA.LIZJ("aweme_media_play_retry_on_freezing", jSONObject);
        FMX.LJIILJJIL("aweme_media_play_retry_on_freezing", jSONObject);
    }

    public final void LIZ$1() {
        for (Aweme aweme : (List) ((C68322mC) this.l0).element) {
            ((C49369JZd) this.l1).getClass();
            C49369JZd.LIZIZ.R1(aweme);
        }
        for (Aweme aweme2 : (List) ((C68322mC) this.l2).element) {
            ((C49369JZd) this.l1).getClass();
            C49369JZd.LIZIZ.R1(aweme2);
        }
    }

    public final void LIZ$10() {
        String searchFrom;
        InterfaceC49833Jh7 interfaceC49833Jh7;
        int i;
        String str;
        SearchResultParam searchResultParam;
        String prefetchId;
        String str2;
        long j;
        String keyword;
        Object LIZIZ;
        HashSet<String> hashSet;
        int i2 = C49924Jia.LIZLLL;
        if (i2 <= 0 || C49924Jia.LJ != i2 || C50086JlC.LIZ().enablePreRequestNotFirst) {
            SearchResultParam searchResultParam2 = (SearchResultParam) this.l0;
            Context context = (Context) this.l1;
            Long l = (Long) this.l2;
            o.LJIIIZ(searchResultParam2, "<this>");
            o.LJIIIZ(context, "context");
            C50637Ju5 c50637Ju5 = new C50637Ju5();
            C49929Jif c49929Jif = new C49929Jif();
            String searchEnterFromPage = searchResultParam2.getSearchEnterFromPage();
            o.LJIIIIZZ(searchEnterFromPage, "this.searchEnterFromPage");
            C49915JiR c49915JiR = c49929Jif.LIZ;
            c49915JiR.LJLLLLLL = searchEnterFromPage;
            c49915JiR.LJLIL = searchResultParam2;
            String keyword2 = searchResultParam2.getKeyword();
            o.LJIIIIZZ(keyword2, "this.keyword");
            C49915JiR c49915JiR2 = c49929Jif.LIZ;
            c49915JiR2.LJLILLLLZI = keyword2;
            c49915JiR2.LJLJI = 0;
            c49915JiR2.LJLJJI = 10;
            c49915JiR2.LJLJJL = 0;
            c49929Jif.LIZ.LJLJLJ = !o.LJ("correct_word", searchResultParam2.getSearchFrom()) ? 1 : 0;
            String enterMethod = searchResultParam2.getEnterMethod();
            if (enterMethod == null || enterMethod.length() == 0) {
                searchFrom = searchResultParam2.getSearchFrom();
            } else {
                searchFrom = searchResultParam2.getEnterMethod();
            }
            o.LJIIIIZZ(searchFrom, "if (!this.enterMethod.is…thod else this.searchFrom");
            C49915JiR c49915JiR3 = c49929Jif.LIZ;
            c49915JiR3.LJLL = searchFrom;
            c49915JiR3.LJLLI = 0;
            c49929Jif.LIZ.LL = searchResultParam2.getIsRichSug();
            c49929Jif.LIZ.LJZL = searchResultParam2.getSugHint();
            c49929Jif.LIZ.LJZ = searchResultParam2.getSugUserId();
            if (searchResultParam2.getSugIsLiveSug()) {
                c49929Jif.LIZ.LJZI = "1";
            }
            String str3 = (String) C49791JgR.LIZJ().get(null);
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            c49929Jif.LIZ.LJLZ = str3;
            c49929Jif.LIZ.LLD = searchResultParam2.getWordType();
            InterfaceC50639Ju7 interfaceC50639Ju7 = (InterfaceC50639Ju7) C50641Ju9.LIZ().get(OBS.class);
            if (interfaceC50639Ju7 != null) {
                interfaceC49833Jh7 = interfaceC50639Ju7.getData();
            } else {
                interfaceC49833Jh7 = null;
            }
            if (!(interfaceC49833Jh7 instanceof C50741Jvl)) {
                interfaceC49833Jh7 = null;
            }
            C50741Jvl c50741Jvl = (C50741Jvl) interfaceC49833Jh7;
            if (c50741Jvl != null && (hashSet = c50741Jvl.LJLIL) != null && (!hashSet.isEmpty())) {
                i = 1;
            } else {
                i = 0;
            }
            c49929Jif.LIZ.LLFFF = i;
            String keyword3 = searchResultParam2.getKeyword();
            o.LJIIIIZZ(keyword3, "this.keyword");
            c49929Jif.LIZ.LLFII = c50637Ju5.LIZ(keyword3) ? 1 : 0;
            c49929Jif.LIZ.LLI = Integer.valueOf(searchResultParam2.getGeneralSearchSortType());
            c49929Jif.LIZ.LLIFFJFJJ = C50589JtJ.LIZ(context, searchResultParam2);
            String hashtagId = searchResultParam2.getHashtagId();
            C49915JiR c49915JiR4 = c49929Jif.LIZ;
            c49915JiR4.LLII = hashtagId;
            c49915JiR4.LLIIII = l;
            c49929Jif.LIZ.LLIIIILZ = Long.valueOf(searchResultParam2.getVisibleModules());
            c49929Jif.LIZ.LLIIIJ = searchResultParam2.getSongID();
            c49929Jif.LIZ.LLIIIL = searchResultParam2.getAppTheme();
            c49929Jif.LIZ.LLIIIZ = searchResultParam2.getAppName();
            c49929Jif.LIZ.LLIIJI = Integer.valueOf(searchResultParam2.getScreenWidth());
            c49929Jif.LIZ.LLIIJLIL = Integer.valueOf(searchResultParam2.getScreenHeight());
            c49929Jif.LIZ.LLIIL = searchResultParam2.getPrefetchId();
            String prefetchType = searchResultParam2.getPrefetchType();
            C49915JiR c49915JiR5 = c49929Jif.LIZ;
            c49915JiR5.LLIILII = prefetchType;
            if (AV1.LJIIJJI()) {
                return;
            }
            if (C50541JsX.LIZ().enableAck) {
                SearchResultParam searchResultParam3 = c49915JiR5.LJLIL;
                if (searchResultParam3 != null) {
                    str = searchResultParam3.getKeyword();
                } else {
                    str = null;
                }
                SearchResultParam searchResultParam4 = c49915JiR5.LJLIL;
                if ((searchResultParam4 == null || searchResultParam4.getPrefetchId() == null) && str != null) {
                    HashMap hashMap = (HashMap) C49924Jia.LIZIZ;
                    C49931Jih c49931Jih = (C49931Jih) hashMap.get(str);
                    if (c49931Jih != null) {
                        hashMap.put(str, C49931Jih.LIZ(c49931Jih, "hit", null, 11));
                        Z9N.LIZIZ.LJIIIZ("hit", str, "");
                        return;
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis - C49924Jia.LIZJ;
            C49924Jia.LIZJ = currentTimeMillis;
            if (j2 < 1000) {
                return;
            }
            if (C50541JsX.LIZ().enableReuseLastPreRequest && ((HashMap) C49924Jia.LIZ).get(c49915JiR5) != null) {
                return;
            }
            if (C50541JsX.LIZ().enableAck && (searchResultParam = c49915JiR5.LJLIL) != null && (prefetchId = searchResultParam.getPrefetchId()) != null) {
                SearchResultParam searchResultParam5 = c49915JiR5.LJLIL;
                if (searchResultParam5 != null) {
                    str2 = searchResultParam5.getEnterMethod();
                } else {
                    str2 = null;
                }
                C49931Jih c49931Jih2 = new C49931Jih(prefetchId, str2, 12);
                SearchResultParam searchResultParam6 = c49915JiR5.LJLIL;
                if (searchResultParam6 != null && (keyword = searchResultParam6.getKeyword()) != null) {
                    str4 = keyword;
                }
                ((HashMap) C49924Jia.LIZIZ).put(str4, c49931Jih2);
                if (C49818Jgs.LIZ().enableClearCache) {
                    C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
                    C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(LJIILIIL));
                    if (C49818Jgs.LIZ().enableAheadPrefetch) {
                        j = C49818Jgs.LIZ().clearCacheDelayTime;
                    } else {
                        j = 5000;
                    }
                    XKX.LIZLLL(LIZ, null, null, new C49944Jiu(j + 3000, c49915JiR5, LJIILIIL, j, null), 3);
                }
            }
            if (C50365Jph.LIZ()) {
                LIZIZ = c49915JiR5.LIZJ();
            } else {
                LIZIZ = c49915JiR5.LIZIZ();
            }
            ((HashMap) C49924Jia.LIZ).put(c49915JiR5, new OSZ(c49915JiR5, LIZIZ));
        }
    }

    public final void LIZ$2() {
        Long l;
        String str;
        int i;
        C49006JLe c49006JLe = new C49006JLe();
        c49006JLe.LJIIZILJ("search_id", ((JQA) this.l0).LJII);
        c49006JLe.LJIIZILJ("search_keyword", ((JQA) this.l0).LJ);
        c49006JLe.LJIIZILJ("search_type", ((JQA) this.l0).LIZJ);
        c49006JLe.LJIJ("search_result_id", ((JQA) this.l0).LJIILJJIL);
        User user = (User) this.l1;
        Long l2 = null;
        if (user != null) {
            l = Long.valueOf(C78934UyQ.LJIILJJIL(user));
        } else {
            l = null;
        }
        c49006JLe.LJIIZILJ("list_item_id", String.valueOf(l));
        c49006JLe.LJIIZILJ("enter_from_merge", "general_search");
        c49006JLe.LJIIZILJ("enter_method", "live_cell");
        c49006JLe.LJIIZILJ("action_type", "click");
        User user2 = (User) this.l1;
        if (user2 != null) {
            str = user2.getUid();
        } else {
            str = null;
        }
        c49006JLe.LJIIZILJ("anchor_id", str);
        User user3 = (User) this.l1;
        if (user3 != null) {
            l2 = Long.valueOf(C78934UyQ.LJIILJJIL(user3));
        }
        c49006JLe.LJIIZILJ("room_id", String.valueOf(l2));
        c49006JLe.LJIIZILJ("request_id", ((JQA) this.l0).LJII);
        User user4 = (User) this.l1;
        if (user4 != null) {
            i = user4.getFollowStatus();
        } else {
            i = 0;
        }
        c49006JLe.LJJIII(i);
        c49006JLe.LJIIZILJ("realtime_watch_user", String.valueOf(((JKG) this.l2).LLIIIJ));
        c49006JLe.LJIILIIL();
    }

    public final void LIZ$3() {
        String str;
        String str2;
        JQA jqa = (JQA) this.l0;
        SearchGlobalViewModel M = ((C49124JPs) this.l1).M();
        String str3 = null;
        if (M != null) {
            str = M.jv0();
        } else {
            str = null;
        }
        jqa.LIZ(str);
        JN8 LIZIZ = JND.LIZIZ((JQA) this.l0);
        LIZIZ.LJIJ("search_result_id", ((JQA) this.l0).LJIILJJIL);
        SearchCardInfo searchCardInfo = ((SearchMixFeed) this.l2).searchCardInfo;
        if (searchCardInfo == null || (str2 = searchCardInfo.alasrc) == null || str2.length() == 0) {
            str3 = "live_card";
        } else {
            SearchCardInfo searchCardInfo2 = ((SearchMixFeed) this.l2).searchCardInfo;
            if (searchCardInfo2 != null) {
                str3 = searchCardInfo2.alasrc;
            }
        }
        LIZIZ.LJIIZILJ("token_type", str3);
        LIZIZ.LJIILIIL();
    }

    public final void LIZ$4() {
        try {
            String name = ((Method) this.l0).getName();
            if ("positionChanged".equals(name)) {
                Method method = C47676InQ.LJIILLIIL;
                Object obj = ((C47677InR) this.l2).LIZIZ.LIZ;
                Object[] objArr = (Object[]) this.l1;
                LIZIZ$5(obj, method, new Object[]{objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]});
            }
            if ("positionLost".equals(name)) {
                LIZIZ$5(((C47677InR) this.l2).LIZIZ.LIZ, C47676InQ.LJIIZILJ, new Object[]{((Object[]) this.l1)[0]});
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZ$6() {
        try {
            String name = ((Method) this.l0).getName();
            if ("positionChanged".equals(name)) {
                Method method = J0Z.LJIILLIIL;
                Object obj = ((C48456J0a) this.l2).LIZIZ.LIZ;
                Object[] objArr = (Object[]) this.l1;
                LIZIZ$7(obj, method, new Object[]{objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]});
            }
            if ("positionLost".equals(name)) {
                LIZIZ$7(((C48456J0a) this.l2).LIZIZ.LIZ, J0Z.LJIIZILJ, new Object[]{((Object[]) this.l1)[0]});
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invoke, e = ");
            LIZ.append(e);
            C0NB.LJ("SurfaceView", X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZ$8() {
        boolean z;
        boolean z2;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp = (ViewOnAttachStateChangeListenerC49251JUp) this.l0;
        ConstraintLayout constraintLayout = viewOnAttachStateChangeListenerC49251JUp.LJLLLLLL;
        if (constraintLayout != null) {
            C48966JJq.LIZIZ(constraintLayout, new AqS139S0200000_8((OSZ) this.l1, (OSZ<Integer, Integer>) viewOnAttachStateChangeListenerC49251JUp, (ViewOnAttachStateChangeListenerC49251JUp) 38));
            ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp2 = (ViewOnAttachStateChangeListenerC49251JUp) this.l0;
            C164086cG c164086cG = viewOnAttachStateChangeListenerC49251JUp2.LJLZ;
            if (c164086cG != null) {
                C48966JJq.LIZIZ(c164086cG, new AqS139S0200000_8((OSZ) this.l1, (OSZ<Integer, Integer>) viewOnAttachStateChangeListenerC49251JUp2, (ViewOnAttachStateChangeListenerC49251JUp) 39));
                ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp3 = (ViewOnAttachStateChangeListenerC49251JUp) this.l0;
                C48887JGp c48887JGp = viewOnAttachStateChangeListenerC49251JUp3.LJZ;
                if (c48887JGp != null) {
                    C48966JJq.LIZIZ(c48887JGp, new AqS139S0200000_8((OSZ) this.l2, (OSZ<Integer, Integer>) viewOnAttachStateChangeListenerC49251JUp3, (ViewOnAttachStateChangeListenerC49251JUp) 40));
                    Aweme aweme2 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LLILZLL;
                    if (aweme2 != null && aweme2.isAd()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp4 = (ViewOnAttachStateChangeListenerC49251JUp) this.l0;
                        ViewGroup viewGroup = viewOnAttachStateChangeListenerC49251JUp4.LLIIII;
                        if (viewGroup != null) {
                            C48966JJq.LIZIZ(viewGroup, new AqS139S0200000_8((OSZ) this.l1, (OSZ<Integer, Integer>) viewOnAttachStateChangeListenerC49251JUp4, (ViewOnAttachStateChangeListenerC49251JUp) 41));
                            ViewGroup viewGroup2 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LLIIIILZ;
                            if (viewGroup2 != null) {
                                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                C018905p c018905p = (C018905p) layoutParams;
                                ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp5 = (ViewOnAttachStateChangeListenerC49251JUp) this.l0;
                                OSZ osz = (OSZ) this.l1;
                                OSZ osz2 = (OSZ) this.l2;
                                c018905p.topToTop = R.id.lh1;
                                c018905p.startToStart = R.id.lh1;
                                Aweme aweme3 = viewOnAttachStateChangeListenerC49251JUp5.LLILZLL;
                                if (aweme3 != null && O5Y.LJIILL(aweme3)) {
                                    c018905p.bottomToBottom = R.id.lh1;
                                    ((ViewGroup.MarginLayoutParams) c018905p).height = ((Number) osz.getSecond()).intValue();
                                } else {
                                    c018905p.bottomToBottom = R.id.lgq;
                                    int intValue = ((Number) osz2.getSecond()).intValue();
                                    ViewGroup viewGroup3 = viewOnAttachStateChangeListenerC49251JUp5.LLIIII;
                                    if (viewGroup3 != null) {
                                        ((ViewGroup.MarginLayoutParams) c018905p).height = intValue + viewGroup3.getLayoutParams().height;
                                    } else {
                                        o.LJIJI("mTopVideoAdOutsideBottomLayout");
                                        throw null;
                                    }
                                }
                                c018905p.endToEnd = R.id.lh1;
                                int intValue2 = ((Number) osz2.getFirst()).intValue();
                                int T = viewOnAttachStateChangeListenerC49251JUp5.T();
                                if (intValue2 > T) {
                                    intValue2 = T;
                                }
                                ((ViewGroup.MarginLayoutParams) c018905p).width = intValue2;
                                ViewGroup viewGroup4 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LLIIIILZ;
                                if (viewGroup4 != null) {
                                    viewGroup4.setLayoutParams(c018905p);
                                } else {
                                    o.LJIJI("mTopVideoAdMaskLayout");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mTopVideoAdMaskLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mTopVideoAdOutsideBottomLayout");
                            throw null;
                        }
                    }
                    Aweme aweme4 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LLILZLL;
                    if (aweme4 != null && aweme4.isAd()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && (aweme = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LLILZLL) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && O5Y.LJJJZ(awemeRawAd)) {
                        ViewGroup viewGroup5 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LLIIIILZ;
                        if (viewGroup5 != null) {
                            C1JI.LJJIIZ(viewGroup5, C61328O5c.LIZJ(8), null, null, null, null, 30);
                            Aweme aweme5 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LLILZLL;
                            if (aweme5 != null && O5Y.LJIILL(aweme5)) {
                                return;
                            }
                            ConstraintLayout constraintLayout2 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LJLLLLLL;
                            if (constraintLayout2 != null) {
                                C1JI.LJJIIZ(constraintLayout2, null, C61328O5c.LIZJ(8), C61328O5c.LIZJ(8), null, null, 25);
                                ViewGroup viewGroup6 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LLIIII;
                                if (viewGroup6 != null) {
                                    C1JI.LJJIIZ(viewGroup6, null, null, null, C61328O5c.LIZJ(8), C61328O5c.LIZJ(8), 7);
                                    return;
                                } else {
                                    o.LJIJI("mTopVideoAdOutsideBottomLayout");
                                    throw null;
                                }
                            }
                            o.LJIJI("videoMediaGroup");
                            throw null;
                        }
                        o.LJIJI("mTopVideoAdMaskLayout");
                        throw null;
                    }
                    ConstraintLayout constraintLayout3 = ((ViewOnAttachStateChangeListenerC49251JUp) this.l0).LJLLLLLL;
                    if (constraintLayout3 != null) {
                        C1JI.LJJIIZ(constraintLayout3, C61328O5c.LIZJ(8), null, null, null, null, 30);
                        return;
                    } else {
                        o.LJIJI("videoMediaGroup");
                        throw null;
                    }
                }
                o.LJIJI("videoView");
                throw null;
            }
            o.LJIJI("videoCover");
            throw null;
        }
        o.LJIJI("videoMediaGroup");
        throw null;
    }

    public final void LIZ$9() {
        if (KR8.LJIIIZ((C8W0) this.l0)) {
            return;
        }
        KU5 actionHandler = ((KU4) ((C8W0) this.l0)).getActionHandler();
        C51782KTy c51782KTy = new C51782KTy((C8W0) this.l1, (C8W0) this.l0, (C221138m5) this.l2, null);
        actionHandler.getClass();
        XKX.LIZLLL(C48841JEv.LIZ((MBA) actionHandler.LJ.getValue()), null, null, new C74492w9(c51782KTy, actionHandler, "action_key_on_parent_set", null), 3);
    }

    public static final void run$0(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            try {
                C47069Idd LJIILLIIL = ((EnginePreloader) aRunnableS19S0300000_8.l2).LJIILLIIL((SimVideoUrlModel) aRunnableS19S0300000_8.l0, (C26206AQg) aRunnableS19S0300000_8.l1);
                if (LJIILLIIL != null) {
                    ((EnginePreloader) aRunnableS19S0300000_8.l2).LJIIIIZZ.post(new IDRunnableS6S0101000(9, LJIILLIIL, 0));
                }
            } catch (Exception e) {
                C46982IcE.LJI().ensureNotReachHere(e, "addMedias fail.");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            if (((View) aRunnableS19S0300000_8.l0).getParent() != null) {
                ((KAV) aRunnableS19S0300000_8.l1).LJJIL((SearchResultParam) aRunnableS19S0300000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        JOO joo = (JOO) aRunnableS19S0300000_8.l0;
        Video video = (Video) aRunnableS19S0300000_8.l1;
        SIR sir = (SIR) aRunnableS19S0300000_8.l2;
        joo.getClass();
        joo.T(video.getCover(), "AbsCellViewHolder", null, sir);
    }

    public static final void run$2(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            Context context = (Context) aRunnableS19S0300000_8.l0;
            if (context != null) {
                ((InterfaceC48720JAe) aRunnableS19S0300000_8.l1).LIZLLL(context, (Aweme) aRunnableS19S0300000_8.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            C49724JfM c49724JfM = C49724JfM.LIZ;
            int i = ((C76732zl) aRunnableS19S0300000_8.l0).element;
            List list = (List) aRunnableS19S0300000_8.l1;
            Context context = (Context) aRunnableS19S0300000_8.l2;
            c49724JfM.getClass();
            C49724JfM.LIZIZ(i, context, list);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            C47333Iht LJI = ((C48520J2m) aRunnableS19S0300000_8.l0).LJI((C47322Ihi) aRunnableS19S0300000_8.l1);
            InterfaceC48516J2i interfaceC48516J2i = (InterfaceC48516J2i) aRunnableS19S0300000_8.l2;
            if (interfaceC48516J2i != null) {
                interfaceC48516J2i.LIZ(LJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS19S0300000_8 aRunnableS19S0300000_8) {
        boolean LIZ;
        try {
            aRunnableS19S0300000_8.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS19S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
    }
}
