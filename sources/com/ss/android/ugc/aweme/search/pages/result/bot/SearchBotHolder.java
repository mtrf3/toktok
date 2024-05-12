package com.ss.android.ugc.aweme.search.pages.result.bot;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C2068389v;
import X.C208218Fd;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C32151Nz;
import X.C33Q;
import X.C38995FSd;
import X.C3C8;
import X.C48905JHh;
import X.C49187JSd;
import X.C49196JSm;
import X.C49505Jbp;
import X.C49513Jbx;
import X.C49515Jbz;
import X.C49517Jc1;
import X.C49519Jc3;
import X.C49520Jc4;
import X.C49521Jc5;
import X.C49525Jc9;
import X.C49526JcA;
import X.C49532JcG;
import X.C49533JcH;
import X.C49543JcR;
import X.C49555Jcd;
import X.C49567Jcp;
import X.C4SV;
import X.C51566KLq;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71894SJm;
import X.C71895SJn;
import X.C76800UCe;
import X.C78685UuP;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.FN6;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC46334IGk;
import X.InterfaceC49137JQf;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.JNU;
import X.JQA;
import X.JSL;
import X.JSM;
import X.JSO;
import X.JT3;
import X.JT4;
import X.KPL;
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SY9;
import X.TBT;
import X.TBW;
import Y.ACListenerS28S0100000_8;
import Y.ACListenerS43S0200000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS2S1100000_1;
import Y.ARunnableS44S0100000_8;
import Y.IDrS47S0100000_8;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS171S0200000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchBotHolder extends JNU implements KPL, JSO {
    public static final /* synthetic */ int LLI = 0;
    public final View LJLJL;
    public final SmartImageView LJLJLJ;
    public final View LJLJLLL;
    public final C208218Fd LJLL;
    public final C71894SJm LJLLI;
    public final C71895SJn LJLLILLLL;
    public final View LJLLJ;
    public final View LJLLL;
    public final C49505Jbp LJLLLL;
    public final RecyclerView LJLLLLLL;
    public final TakoPollingVM LJLZ;
    public final SearchTakoCardUIVM LJZ;
    public SearchMixFeed LJZI;
    public String LJZL;
    public JQA LL;
    public SearchResultParam LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final IDrS47S0100000_8 LLFFF;
    public final SearchBotHolder$lifeCycleListener$1 LLFII;
    public final AObserverS76S0100000_8 LLFZ;

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.JSO
    public final boolean LLLLLLL() {
        return true;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return false;
    }

    @Override // X.JSO
    public final int q() {
        return 32;
    }

    public final void Q() {
        SearchTakoCardUIVM searchTakoCardUIVM;
        TakoPollingVM takoPollingVM = this.LJLZ;
        if (takoPollingVM != null && (searchTakoCardUIVM = this.LJZ) != null) {
            C212418Vh.LJIIJJI(takoPollingVM, new AqS139S0200000_8(this, searchTakoCardUIVM, 13));
        }
    }

    public final Map<String, String> T() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("search_id", LJLJL().LJII);
        SearchMixFeed searchMixFeed = this.LJZI;
        if (searchMixFeed != null) {
            str = searchMixFeed.providerDocIdStr;
        } else {
            str = null;
        }
        hashMap.put("search_result_id", str);
        hashMap.put("enter_from", LJLJL().LJFF);
        hashMap.put("token_type", "tikbot");
        hashMap.put("search_keyword", LJLJL().LJ);
        return hashMap;
    }

    public final void U() {
        this.LJLLI.setLoading(true);
        this.LJLLILLLL.setLoading(true);
        this.LJLLJ.setVisibility(8);
        this.LJLLL.setVisibility(8);
        this.LJLLLLLL.setVisibility(8);
        X("");
    }

    @Override // X.JSO
    public final View a() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.JSO
    public final JSL h() {
        JT3 jt3 = new JT3();
        jt3.LIZIZ = new JT4(this);
        return jt3;
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = getActivity().getLifecycle();
        o.LJIIIIZZ(lifecycle, "activity.lifecycle");
        return lifecycle;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        JSM.LIZLLL(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBotHolder(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJZL = "";
        this.LLF = C221108m2.LIZIZ(new AqS158S0100000_8(itemView, 209));
        this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(itemView, 208));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(14));
        c2068389v.LIZ = R.raw.icon_2pt_refresh;
        c2068389v.LJ = Integer.valueOf(R.attr.gu);
        SY9 LIZ = c2068389v.LIZ(getContext());
        View findViewById = itemView.findViewById(R.id.ao4);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.bot_message)");
        this.LJLL = (C208218Fd) findViewById;
        View findViewById2 = itemView.findViewById(R.id.ao2);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.bot_icon)");
        this.LJLJLJ = (SmartImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.ao5);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.bot_name)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.a8n);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.ask_more)");
        this.LJLJLLL = findViewById4;
        View findViewById5 = itemView.findViewById(R.id.ao3);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.bot_info)");
        this.LJLJL = findViewById5;
        View findViewById6 = itemView.findViewById(R.id.izu);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.retry_layout)");
        this.LJLLJ = findViewById6;
        View findViewById7 = itemView.findViewById(R.id.izx);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.retry_message)");
        TextView textView2 = (TextView) findViewById7;
        View findViewById8 = itemView.findViewById(R.id.izp);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.retry_btn)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById8;
        InterfaceC65784Pro interfaceC65784Pro = null;
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(LIZ, (Drawable) null, (Drawable) null, (Drawable) null);
        appCompatTextView.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)));
        View findViewById9 = itemView.findViewById(R.id.cyg);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.error_layout)");
        this.LJLLL = findViewById9;
        View findViewById10 = itemView.findViewById(R.id.k2b);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.skeleton_text)");
        C71894SJm c71894SJm = (C71894SJm) findViewById10;
        this.LJLLI = c71894SJm;
        Paint paint = new Paint();
        paint.setTextSize(C32151Nz.LJIIZILJ(16));
        c71894SJm.setFontConfig(new C49532JcG(paint, C32151Nz.LJIIZILJ(28)));
        View findViewById11 = itemView.findViewById(R.id.k2c);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.skeleton_text_more)");
        this.LJLLILLLL = (C71895SJn) findViewById11;
        View findViewById12 = itemView.findViewById(R.id.n6g);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.id.video_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById12;
        this.LJLLLLLL = recyclerView;
        this.LJLLLL = new C49505Jbp(recyclerView);
        ActivityC45651qj activity = getActivity();
        C65776Prg LIZ2 = C65352Pkq.LIZ(TakoPollingVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ2, 1557);
        C49526JcA c49526JcA = C49526JcA.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(activity, false);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(activity, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        TakoPollingVM takoPollingVM = (TakoPollingVM) new C214298b3(LIZ2, aqS153S0100000_3, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, c49526JcA, interfaceC65784Pro, 384).getValue();
        C8YN.LJIIJ(this, takoPollingVM, new TBT() { // from class: X.Jc6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C49517Jc1) obj).LJLIL);
            }
        }, new TBT() { // from class: X.JcB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C49517Jc1) obj).LJLILLLLZI;
            }
        }, null, new IDqS433S0100000_8(takoPollingVM, 1), 12);
        C8YN.LJII(this, takoPollingVM, new TBT() { // from class: X.Jc7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C49517Jc1) obj).LJLJJLL;
            }
        }, null, new AqS171S0200000_8(this, takoPollingVM, 0), 6);
        C8YN.LJII(this, takoPollingVM, new TBT() { // from class: X.JcD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C49517Jc1) obj).LJLJLLL;
            }
        }, null, new AqS171S0200000_8(this, takoPollingVM, 1), 6);
        C8YN.LJIIJ(this, takoPollingVM, new TBT() { // from class: X.Jc8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C49517Jc1) obj).LJLJJLL;
            }
        }, new TBT() { // from class: X.JcC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C49517Jc1) obj).LJLL;
            }
        }, null, new IDqS433S0100000_8(this, 0), 12);
        this.LJLZ = takoPollingVM;
        ActivityC45651qj activity2 = getActivity();
        C65776Prg LIZ3 = C65352Pkq.LIZ(SearchTakoCardUIVM.class);
        SearchTakoCardUIVM searchTakoCardUIVM = (SearchTakoCardUIVM) new C214298b3(LIZ3, new AqS153S0100000_3(LIZ3, 1456), c214528bQ, C78926UyI.LJJII(activity2, false), C78926UyI.LJJIIJZLJL(activity2, false), c184077Kh, C49525Jc9.INSTANCE, interfaceC65784Pro, 384).getValue();
        C8YN.LJII(this, searchTakoCardUIVM, new TBT() { // from class: X.Jci
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C49559Jch) obj).LJLIL);
            }
        }, null, new AqS190S0100000_8(this, 0), 6);
        this.LJZ = searchTakoCardUIVM;
        String botName = C49543JcR.LIZLLL().getBotName();
        if (botName == null || !C78685UuP.LJJJZ(botName)) {
            botName = getContext().getString(R.string.cnr);
            o.LJIIIIZZ(botName, "context.getString(R.string.chatGPT_name)");
        }
        textView.setText(botName);
        String string = getContext().getString(R.string.cmk);
        o.LJIIIIZZ(string, "context.getString(R.stri…loading_fail_placeholder)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{botName}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        textView2.setText(LLLZ);
        U();
        this.LLFFF = new IDrS47S0100000_8(this, 2);
        this.LLFII = new SearchBotHolder$lifeCycleListener$1(this);
        this.LLFZ = new AObserverS76S0100000_8(this, 42);
    }

    public final void X(String str) {
        C208218Fd c208218Fd = this.LJLL;
        String str2 = null;
        c208218Fd.LJLZ = null;
        c208218Fd.LJZ = null;
        if (TextUtils.isEmpty(str)) {
            this.LJLL.setText("");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Spanned LIZJ = C51566KLq.LIZ.LIZJ(str, this.LJLL, new C49513Jbx(this), null);
        SearchResultParam searchResultParam = this.LLD;
        if (searchResultParam != null) {
            str2 = C49567Jcp.LIZ(searchResultParam);
        }
        C49521Jc5.LIZIZ(str2).LJ = System.currentTimeMillis() - currentTimeMillis;
        this.LJLL.setText(LIZJ);
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        RecyclerView recyclerView;
        NextLiveData nextLiveData;
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        getLifecycle().addObserver(this.LLFII);
        SearchGlobalViewModel M = M();
        if (M != null && (nextLiveData = M.LJLL) != null) {
            nextLiveData.observe(this, this.LLFZ);
        }
        ViewParent parent = this.itemView.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
            recyclerView.LJIIJJI(this.LLFFF);
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        C49555Jcd gv0;
        NextLiveData nextLiveData;
        RecyclerView recyclerView;
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        ViewParent parent = this.itemView.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
            recyclerView.LJJLL(this.LLFFF);
        }
        SearchGlobalViewModel M = M();
        if (M != null && (nextLiveData = M.LJLL) != null) {
            nextLiveData.removeObserver(this.LLFZ);
        }
        getLifecycle().removeObserver(this.LLFII);
        SearchTakoCardUIVM searchTakoCardUIVM = this.LJZ;
        if (searchTakoCardUIVM != null && (gv0 = searchTakoCardUIVM.gv0()) != null) {
            gv0.LIZIZ(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        JSM.LJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.JSO
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        JSM.LIZIZ(this, aweme, c49196JSm);
    }

    public final void P(SearchMixFeed searchMixFeed, SearchResultParam searchResultParam) {
        String str;
        if (searchMixFeed.bot == null) {
            return;
        }
        this.LL = LJLJL();
        this.LLD = searchResultParam;
        this.LJZI = searchMixFeed;
        String str2 = searchMixFeed.providerDocIdStr;
        if (str2 == null) {
            str2 = "";
        }
        this.LJZL = str2;
        System.currentTimeMillis();
        C4SV c4sv = C4SV.LIZ;
        AqS190S0100000_8 aqS190S0100000_8 = new AqS190S0100000_8(this, 24);
        c4sv.getClass();
        C4SV.LIZIZ("tikbot_avatar_light.png", aqS190S0100000_8);
        PollingInfo pollingInfo = searchMixFeed.polling;
        C16880lQ.LJIIJ(new ACListenerS43S0200000_8(this, searchMixFeed, 2), this.itemView);
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 25), this.LJLJLLL);
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 26), this.LJLLJ);
        JQA jqa = this.LL;
        if (jqa != null) {
            str = jqa.LJII;
        } else {
            str = null;
        }
        TakoPollingVM takoPollingVM = this.LJLZ;
        if (takoPollingVM != null) {
            C212418Vh.LJIIJJI(takoPollingVM, new C49515Jbz(str, takoPollingVM, this, searchMixFeed, pollingInfo));
        }
    }

    public final void V(Map map, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.putAll(T());
        hashMap.putAll(map);
        if (z) {
            str = "search_result_click";
        } else {
            str = "search_result_show";
        }
        C38995FSd.LIZLLL().execute(new ARunnableS2S1100000_1(hashMap, str, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(C49517Jc1 c49517Jc1, boolean z) {
        String str;
        int i;
        long j;
        int i2;
        SearchResultParam searchResultParam = this.LLD;
        if (searchResultParam != null) {
            str = C49567Jcp.LIZ(searchResultParam);
        } else {
            str = null;
        }
        C49520Jc4 LIZIZ = C49521Jc5.LIZIZ(str);
        LIZIZ.getClass();
        if (!o.LJ(LIZIZ, C49533JcH.LIZ)) {
            LIZIZ.LIZJ = System.currentTimeMillis();
        }
        LIZIZ.LJII = !z ? 1 : 0;
        int i3 = c49517Jc1.LJLJJI;
        if (i3 > 0) {
            i = 2;
        } else {
            i = 1;
        }
        LIZIZ.LJI = i;
        LIZIZ.LJIIIIZZ = i3;
        if (i3 > 0) {
            j = System.currentTimeMillis() - c49517Jc1.LJLJJL;
        } else {
            j = 0;
        }
        LIZIZ.LJIIIZ = j;
        PollingInfo pollingInfo = c49517Jc1.LJLILLLLZI;
        if (pollingInfo != null) {
            i2 = o.LJ(pollingInfo.getEnable(), Boolean.TRUE);
        } else {
            i2 = 0;
        }
        LIZIZ.LJIIJ = i2 ^ 1;
        TakoPollingVM takoPollingVM = this.LJLZ;
        if (takoPollingVM != null) {
            takoPollingVM.setState(C49519Jc3.LJLIL);
        }
        FN6.LIZJ(new ARunnableS44S0100000_8(this, 37));
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
