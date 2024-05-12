package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import X.AnonymousClass036;
import X.C16880lQ;
import X.C1799074g;
import X.C29822Bn8;
import X.C47261Igj;
import X.C48891JGt;
import X.C49704Jf2;
import X.C50293JoX;
import X.C50534JsQ;
import X.C50535JsR;
import X.C50539JsV;
import X.C50648JuG;
import X.C58096Mr6;
import X.C72242sW;
import X.C73411SrX;
import X.C73969T1h;
import X.C78685UuP;
import X.FMX;
import X.InterfaceC1798974f;
import X.InterfaceC48888JGq;
import X.T16;
import X.ViewOnTouchListenerC50533JsP;
import X.Z9N;
import Y.ACListenerS43S0200000_8;
import Y.ACListenerS6S1400000_8;
import Y.AfS21S0400000_8;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.IWatchHistoryValue;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugInfo;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import com.ss.android.ugc.aweme.watch.history.di.WatchHistoryValueService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class DetailFeedSearchHelper implements InterfaceC48888JGq {
    public static final DetailFeedSearchHelper LJLIL = new DetailFeedSearchHelper();
    public static C50534JsQ LJLILLLLZI;
    public static C73411SrX LJLJI;
    public static final List<String> LJLJJI;
    public static final Set<Integer> LJLJJL;

    static {
        IWatchHistoryValue iWatchHistoryValue;
        String[] strArr = new String[22];
        strArr[0] = "playlist";
        strArr[1] = "chat";
        strArr[2] = "notification_page";
        strArr[3] = "selfharm";
        strArr[4] = "discovery";
        strArr[5] = "others_homepage";
        strArr[6] = "personal_homepage";
        strArr[7] = "homepage_explore";
        strArr[8] = "general_search";
        strArr[9] = "search_result";
        strArr[10] = "challenge";
        strArr[11] = "single_song";
        strArr[12] = "poi_detail";
        strArr[13] = "prop_page";
        strArr[14] = "collection_video";
        strArr[15] = "trending_inflow_page";
        strArr[16] = "group_chat";
        strArr[17] = "link_auto_message";
        strArr[18] = "homepage_hot_tikbot";
        strArr[19] = "general_search_tikbot";
        Object LIZ = C58096Mr6.LIZ(IWatchHistoryValue.class, false);
        if (LIZ != null) {
            iWatchHistoryValue = (IWatchHistoryValue) LIZ;
        } else {
            if (C58096Mr6.a8 == null) {
                synchronized (IWatchHistoryValue.class) {
                    if (C58096Mr6.a8 == null) {
                        C58096Mr6.a8 = new WatchHistoryValueService();
                    }
                }
            }
            iWatchHistoryValue = C58096Mr6.a8;
        }
        iWatchHistoryValue.LIZ();
        strArr[20] = "account_history";
        strArr[21] = "edm_search";
        LJLJJI = C47261Igj.LJJIJIIJI(strArr);
        LJLJJL = new LinkedHashSet();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        C73411SrX c73411SrX = LJLJI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = LJLJI;
            o.LJI(c73411SrX2);
            c73411SrX2.dispose();
        }
        LJLJI = null;
        LJLJJL.clear();
    }

    @Override // X.InterfaceC48888JGq
    public final void onDestroy() {
        C48891JGt.onDestroy(this);
        LJLILLLLZI = null;
    }

    @Override // X.InterfaceC48888JGq
    public final void onStop() {
        C48891JGt.onStop(this);
        LJLILLLLZI = null;
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C48891JGt.onCreate(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C48891JGt.onPause(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C48891JGt.onResume(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    public static String LIZIZ(Context context) {
        return C29822Bn8.LIZ(context, R.string.qep, "context.resources.getStr…ar_recommended_generic_1)");
    }

    public static String LIZJ(Map map) {
        String str = (String) map.get("enter_from");
        if (TextUtils.isEmpty(str)) {
            return "unknow";
        }
        o.LJI(str);
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0041 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(java.lang.String r1) {
        /*
            if (r1 == 0) goto L9
            int r0 = r1.hashCode()
            switch(r0) {
                case -1731750228: goto L30;
                case -562830579: goto L39;
                case 3052376: goto L27;
                case 809483594: goto L1e;
                case 998835423: goto L15;
                case 1425879700: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = "0"
        Lb:
            return r0
        Lc:
            java.lang.String r0 = "search_result"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L9
        L15:
            java.lang.String r0 = "general_search"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L9
        L1e:
            java.lang.String r0 = "others_homepage"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L9
        L27:
            java.lang.String r0 = "chat"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L9
        L30:
            java.lang.String r0 = "single_song"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L41
            goto L9
        L39:
            java.lang.String r0 = "personal_homepage"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
        L41:
            java.lang.String r0 = "1"
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper.LIZLLL(java.lang.String):java.lang.String");
    }

    public static View LJ(View view) {
        View findViewWithTag = view.findViewWithTag("search_bar");
        if (findViewWithTag == null) {
            ViewStub viewStub = (ViewStub) DetailFeedServiceImpl.LJIIJ().LJIIIIZZ(view).get("search_bar_in_feed");
            if (viewStub == null) {
                return null;
            }
            viewStub.setLayoutResource(R.layout.cf2);
            View inflate = viewStub.inflate();
            inflate.setTag("search_bar");
            return inflate;
        }
        return findViewWithTag;
    }

    public static boolean LJIIIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || ((Fragment) lifecycleOwner).getView() == null) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(Map map) {
        String LIZJ;
        Object obj;
        C50539JsV c50539JsV = new C50539JsV();
        String str = "1";
        "1".toString();
        c50539JsV.LIZLLL("is_from_video", "1");
        c50539JsV.LJIIZILJ("enter_method", "enter");
        if (map.containsKey("tab_name") && (obj = map.get("tab_name")) != null) {
            c50539JsV.LIZLLL("tab_name", obj.toString());
        }
        if (map.containsKey("isTrending")) {
            LIZJ = "trending_inflow";
        } else {
            LJLIL.getClass();
            LIZJ = LIZJ(map);
        }
        c50539JsV.LJIJI(LIZJ);
        String str2 = (String) map.get("is_from_photo");
        if (str2 != null) {
            if (o.LJ(str2, "1")) {
                c50539JsV.LIZLLL("is_from_video", (String) map.get("is_from_video"));
            }
            c50539JsV.LIZLLL("is_from_photo", str2);
        }
        if (!Z9N.LIZIZ.LJII()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c50539JsV.LIZLLL("has_coin_task", str);
        c50539JsV.LJIILIIL();
    }

    public static void LIZ(C49704Jf2 c49704Jf2, Map map) {
        if (map.containsKey("isTrending")) {
            c49704Jf2.LJIIZILJ("search_position", "trending_inflow");
        } else {
            LJLIL.getClass();
            c49704Jf2.LJIIZILJ("search_position", LIZJ(map));
        }
        if (map.containsKey("tab_name")) {
            c49704Jf2.LJJIIJ(map.get("tab_name"));
        }
    }

    public static void LJI(Map map, View view) {
        View view2 = DetailFeedServiceImpl.LJIIJ().LJIIIIZZ(view).get("search_icon_in_feed");
        o.LJI(view2);
        view2.setVisibility(0);
        C16880lQ.LJIIJ(new ACListenerS43S0200000_8(view, map, 12), view2);
    }

    public static void LJII(SmartRoute smartRoute, Map map) {
        if (map.containsKey("isTrending")) {
            smartRoute.withParam("search_position", "trending_inflow");
            smartRoute.withParam("tab_name", LIZJ(map));
            smartRoute.withParam("enter_from", "trending_inflow");
        } else {
            if (map.containsKey("tab_name")) {
                smartRoute.withParam("tab_name", (String) map.get("tab_name"));
            }
            smartRoute.withParam("enter_from", LIZJ(map));
        }
    }

    public static void LJIIL(String str, Map map) {
        if (!FMX.LIZJ("search_button_show")) {
            return;
        }
        C50535JsR c50535JsR = new C50535JsR();
        String LIZJ = LIZJ(map);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c50535JsR.LJ("search_position", LIZJ, c1799074g);
        c50535JsR.LJ("group_id", str, c1799074g);
        c50535JsR.LJ("is_from_video", "1", c1799074g);
        if (map.containsKey("isTrending")) {
            c50535JsR.LIZLLL("search_position", "trending_inflow");
            LJLIL.getClass();
            c50535JsR.LIZLLL("tab_name", LIZJ(map));
        } else {
            if (map.containsKey("tab_name")) {
                c50535JsR.LIZLLL("tab_name", (String) map.get("tab_name"));
            }
            String str2 = (String) map.get("is_from_photo");
            if (str2 != null && o.LJ(str2, "1")) {
                c50535JsR.LIZLLL("is_from_photo", str2);
                String str3 = (String) map.get("enter_entrance_style");
                if (str3 != null) {
                    c50535JsR.LIZLLL("enter_entrance_style", str3);
                }
                String str4 = (String) map.get("is_from_video");
                if (str4 != null) {
                    c50535JsR.LIZLLL("is_from_video", str4);
                }
            }
        }
        c50535JsR.LJIILIIL();
    }

    public static Bundle LJFF(Map map, Map map2, String str, SearchSugWordResponse searchSugWordResponse) {
        String str2;
        List<SearchSugInfo> list;
        SearchSugInfo searchSugInfo;
        Bundle LIZJ = AnonymousClass036.LIZJ("is_from_video", "1", "in_single_stack", "true");
        LIZJ.putString("group_id", (String) map.get("group_id"));
        if (TextUtils.isEmpty(str)) {
            LIZJ.putString("set_hint_by_sug_word", "true");
        } else {
            LIZJ.putString("keyword", str);
            String str3 = null;
            if (searchSugWordResponse != null && (list = searchSugWordResponse.sugWordList) != null && (searchSugInfo = (SearchSugInfo) ListProtector.get(list, 0)) != null) {
                str2 = searchSugInfo.groupId;
            } else {
                str2 = null;
            }
            LIZJ.putString("hint_group_id", str2);
            if (searchSugWordResponse != null) {
                str3 = searchSugWordResponse.LJ();
            }
            LIZJ.putString("hint_imp_id", str3);
        }
        LIZJ.putString("is_from_outside", "true");
        if (map.containsKey("isTrending")) {
            LIZJ.putString("search_position", "trending_inflow");
            LIZJ.putString("tab_name", LIZJ(map));
            LIZJ.putString("enter_from", "trending_inflow");
        } else {
            if (map.containsKey("tab_name")) {
                LIZJ.putString("tab_name", (String) map.get("tab_name"));
            }
            LIZJ.putString("enter_from", LIZJ(map));
        }
        LIZJ.putString("is_feed_liked", String.valueOf(map2.get("is_feed_liked")));
        LIZJ.putString("is_feed_collected", String.valueOf(map2.get("is_feed_collected")));
        LIZJ.putString("is_feed_forward_clicked", String.valueOf(map2.get("is_feed_forward_clicked")));
        LIZJ.putString("is_feed_comment_clicked", String.valueOf(map2.get("is_feed_comment_clicked")));
        LIZJ.putString("back_flag", "1");
        LIZJ.putString("set_hint_by_sug_word", "true");
        LIZJ.putString("enter_method", "default_search_keyword");
        String str4 = (String) map.get("is_from_photo");
        if (str4 != null) {
            if (o.LJ(str4, "1")) {
                LIZJ.putString("is_from_video", (String) map.get("is_from_video"));
            }
            LIZJ.putString("is_from_photo", str4);
        }
        return LIZJ;
    }

    public static void LJIIIIZZ(View view, SearchSugWordResponse searchSugWordResponse, Map map, Map map2) {
        String str;
        String str2;
        String str3;
        String str4;
        SearchSugInfo searchSugInfo;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.mj3);
        String str5 = null;
        if (searchSugWordResponse != null) {
            if (searchSugWordResponse.sugWordList != null && (!r0.isEmpty())) {
                List<SearchSugInfo> list = searchSugWordResponse.sugWordList;
                o.LJI(list);
                str = ((SearchSugInfo) ListProtector.get(list, 0)).sugWord;
                if (C78685UuP.LJJJZ(str)) {
                    o.LJI(str);
                }
            }
            str = null;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "searchBar.context");
            str2 = LIZIZ(context);
            str3 = "";
        } else {
            o.LJI(str);
            if (o.LJ(searchSugWordResponse.qrecVirtualEnable, "1")) {
                C50293JoX.LIZLLL((String) map.get("group_id"), true);
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "searchBar.context");
                str2 = LIZIZ(context2);
            } else {
                str2 = str;
            }
            str3 = str;
        }
        appCompatTextView.setText(str2);
        LJIILJJIL(o.LJ(appCompatTextView.getText().toString(), str), view, map, map2, str3, searchSugWordResponse);
        if (C78685UuP.LJJJZ(str)) {
            if (searchSugWordResponse != null) {
                str4 = searchSugWordResponse.qrecVirtualEnable;
            } else {
                str4 = null;
            }
            if (o.LJ(str4, "1") || searchSugWordResponse == null || searchSugWordResponse.sugWordList == null) {
                return;
            }
            C50648JuG c50648JuG = new C50648JuG();
            c50648JuG.LJIIZILJ("search_position", LIZJ(map));
            c50648JuG.LJJIIJZLJL(0);
            c50648JuG.LJIIZILJ("words_source", "search_bar_outer");
            c50648JuG.LJIIZILJ("words_content", str);
            List<SearchSugInfo> list2 = searchSugWordResponse.sugWordList;
            if (list2 != null && (searchSugInfo = (SearchSugInfo) ListProtector.get(list2, 0)) != null) {
                str5 = searchSugInfo.groupId;
            }
            c50648JuG.LJIIZILJ("group_id", str5);
            c50648JuG.LJIIZILJ("impr_id", searchSugWordResponse.LJ());
            c50648JuG.LJJI(-1);
            LIZ(c50648JuG, map);
            String str6 = (String) map.get("is_from_photo");
            if (str6 != null) {
                if (o.LJ(str6, "1")) {
                    c50648JuG.LIZLLL("is_from_video", (String) map.get("is_from_video"));
                }
                c50648JuG.LIZLLL("is_from_photo", str6);
            }
            c50648JuG.LJIILIIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(android.view.View r9, java.util.Map r10, java.util.Map r11, java.lang.String r12, com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper.LJIIJ(android.view.View, java.util.Map, java.util.Map, java.lang.String, com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse):void");
    }

    public final void LJIIJJI(LifecycleOwner lifecycleOwner, View view, String str, Map<String, String> map, Map<String, Boolean> map2) {
        String LIZJ;
        Integer num;
        String str2;
        String str3;
        release();
        if (map.containsKey("isTrending")) {
            LIZJ = "trending_inflow";
        } else {
            LIZJ = LIZJ(map);
        }
        Integer num2 = null;
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        C50534JsQ c50534JsQ = LJLILLLLZI;
        if (c50534JsQ != null) {
            str2 = c50534JsQ.LIZ;
        } else {
            str2 = null;
        }
        if (o.LJ(str2, str)) {
            C50534JsQ c50534JsQ2 = LJLILLLLZI;
            if (c50534JsQ2 != null) {
                str3 = c50534JsQ2.LIZIZ;
            } else {
                str3 = null;
            }
            if (o.LJ(str3, LIZJ)) {
                C50534JsQ c50534JsQ3 = LJLILLLLZI;
                if (c50534JsQ3 != null) {
                    num2 = c50534JsQ3.LIZJ;
                }
                if (o.LJ(num2, num)) {
                    return;
                }
            }
        }
        LJLILLLLZI = new C50534JsQ(str, LIZJ, num);
        LJLJI = (C73411SrX) SearchApiNew.LIZ().fetchFeedDetailWords(str, LIZJ, num).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS21S0400000_8(lifecycleOwner, view, map, map2, 0), new AfS21S0400000_8(lifecycleOwner, view, map, map2, 1));
    }

    public static void LJIILJJIL(boolean z, View view, Map map, Map map2, String str, SearchSugWordResponse searchSugWordResponse) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.g5u);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.m0c);
        if (z) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS6S1400000_8(view, map, map2, str, searchSugWordResponse, 0));
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS6S1400000_8(view, map, map2, str, searchSugWordResponse, 1));
            tuxTextView.setOnTouchListener(new ViewOnTouchListenerC50533JsP(str, new C72242sW(), view, map, map2, searchSugWordResponse));
        } else {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS6S1400000_8(view, map, map2, str, searchSugWordResponse, 2));
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS6S1400000_8(view, map, map2, str, searchSugWordResponse, 3));
        }
    }
}
