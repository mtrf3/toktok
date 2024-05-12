package com.ss.android.ugc.aweme.wiki;

import X.AbstractC73672Svk;
import X.ActivityC86117Xqz;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C188727au;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25741A8j;
import X.C27739Aud;
import X.C2U8;
import X.C40689Fy1;
import X.C42910Gsk;
import X.C42941GtF;
import X.C59968NgC;
import X.C59971NgF;
import X.C59972NgG;
import X.C59974NgI;
import X.C63081OpJ;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76L;
import X.C7TR;
import X.C9KF;
import X.FMX;
import X.InterfaceC59973NgH;
import X.NXI;
import X.NZQ;
import X.NZR;
import X.OJD;
import X.ORZ;
import Y.ACListenerS30S0100000_10;
import Y.AfS62S0100000_10;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS15S0010000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.AqS62S1200000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class AddWikiActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LLII = 0;
    public NZQ LJLIL;
    public FrameLayout LJLILLLLZI;
    public LinearLayout LJLJI;
    public View LJLJJI;
    public C252709vu LJLJJL;
    public NZR LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public C76L<CheckAnchorModerationResultResponse> LJLLI;
    public boolean LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLL;
    public long LJLLLL;
    public boolean LJLLLLLL;
    public String LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public String LJLZ = "";
    public String LJZ = "";
    public final C73318Sq2 LJZI = new C73318Sq2();
    public String LLFF = "";
    public int LLFFF = -1;
    public String LLFII = "";
    public String LLFZ = "";
    public String LLI = "";

    static {
        new C59974NgI();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIFFJFJJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final LinearLayout LLIIIILZ() {
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("addBtn");
        throw null;
    }

    public final boolean LLIIIJ() {
        if (this.LLF || ujb.o.LJJJJIZL(this.LJLJLLL, "Wiki", true) || ujb.o.LJJJJIZL(this.LJLJLLL, "Yelp", true) || ujb.o.LJJJJIZL(this.LJLJLLL, "TripAdvisor", true) || ujb.o.LJJJJIZL(this.LJLJLLL, "Quizlet", true)) {
            return true;
        }
        return false;
    }

    public final C252709vu LLIIIZ() {
        C252709vu c252709vu = this.LJLJJL;
        if (c252709vu != null) {
            return c252709vu;
        }
        o.LJIJI("navBar");
        throw null;
    }

    public final NZR LLIIJLIL() {
        NZR nzr = this.LJLJJLL;
        if (nzr != null) {
            return nzr;
        }
        o.LJIJI("singleWebView");
        throw null;
    }

    public final String LLIILII() {
        String title;
        String str = "";
        if (TextUtils.isEmpty("") && (title = LLIIJLIL().getTitle()) != null) {
            str = title;
        }
        if (TextUtils.isEmpty(str)) {
            return this.LJZ;
        }
        return str;
    }

    public final NZQ LLIL() {
        NZQ nzq = this.LJLIL;
        if (nzq != null) {
            return nzq;
        }
        o.LJIJI("webView");
        throw null;
    }

    public final void LLILLJJLI() {
        String str;
        String str2;
        Boolean valueOf;
        String str3 = this.LJLZ;
        if (ujb.o.LJJJJIZL(this.LJLJLLL, "Yelp", true) || ujb.o.LJJJJIZL(this.LJLJLLL, "TripAdvisor", true)) {
            str3 = (String) ListProtector.get(s.LJLJJL(str3, new String[]{" - "}, 0, 6), 0);
        }
        C188727au c188727au = new C188727au();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "placeholder_enter_from");
        if (LLJJIJIIJIL == null || LLJJIJIIJIL.length() == 0) {
            str = "video_post_page";
        } else {
            str = C16880lQ.LLJJIJIIJIL(getIntent(), "placeholder_enter_from");
        }
        c188727au.LJIIIZ("enter_from", str);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way");
        if (LLJJIJIIJIL2 != null && LLJJIJIIJIL2.length() != 0) {
            c188727au.LJI("shoot_way", LLJJIJIIJIL2);
        }
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id");
        if (LLJJIJIIJIL3 != null && LLJJIJIIJIL3.length() != 0) {
            c188727au.LJI("creation_id", LLJJIJIIJIL3);
        }
        JSONObject jSONObject = new JSONObject();
        if (this.LLD) {
            jSONObject.put("add_from", 2);
            String currentUrl = LLIL().getCurrentUrl();
            if (currentUrl == null) {
                currentUrl = this.LLFZ;
            }
            String LLIILII = LLIILII();
            int i = this.LLFFF;
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "contentMap.toString()");
            String str4 = null;
            C2U8.LIZ(new C7TR(new AnchorTransData(i, jSONObject2, LLIILII, null, 1, null, null, false, currentUrl, null, null, null, this.LLFII, false, 12008, null)));
            finish();
            AnchorPublishStruct LJ = AnchorListManager.LJ(this.LLFFF, this.LLFII);
            if (LJ != null) {
                str4 = AnchorListManager.LJII(LJ);
            }
            c188727au.LJIIIZ("anchor_type", str4);
            c188727au.LJIIIZ("anchor_entry", LLIILII);
            AnchorPublishStruct LJ2 = AnchorListManager.LJ(this.LLFFF, this.LLFII);
            if (LJ2 != null && (valueOf = Boolean.valueOf(LJ2.hadNew)) != null && valueOf.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("new_tag", str2);
            c188727au.LIZLLL(1, "status");
            FMX.LJIIL("choose_anchor", c188727au.LIZ);
            return;
        }
        new AqS62S1200000_7(str3, this, c188727au, 2).invoke();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C2U8.LIZ(new C42910Gsk());
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!LLIL().canGoBack()) {
            super.onBackPressed();
        } else {
            LLIL().goBack();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        C2U8.LIZ(new C25741A8j(System.currentTimeMillis() - this.LJLLJ));
        if (this.LJLIL != null) {
            LLIL().LIZJ(this);
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if ((LLJJIJIIJIL != null && LLJJIJIIJIL.length() != 0) || this.LLF) {
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "mob_extra");
            C188727au c188727au = new C188727au();
            if (ujb.o.LJJJJIZL(this.LJLJLLL, "Yelp", true)) {
                c188727au.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"));
                c188727au.LJIIIZ("anchor_type", "Yelp");
                c188727au.LJIIIZ("anchor_entry", C16880lQ.LLJJIJIIJIL(getIntent(), "anchor_entry"));
                c188727au.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(getIntent(), "author_id"));
                c188727au.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(getIntent(), "group_id"));
                c188727au.LJ(System.currentTimeMillis() - this.LJLLJ, "duration");
                LLFZ(c188727au, LLJJIJIIJIL2);
                FMX.LJIIL("multi_anchor_stay_time", c188727au.LIZ);
            } else if (ujb.o.LJJJJIZL(this.LJLJLLL, "TripAdvisor", true)) {
                c188727au.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"));
                c188727au.LJIIIZ("anchor_type", "TripAdvisor");
                c188727au.LJIIIZ("anchor_entry", C16880lQ.LLJJIJIIJIL(getIntent(), "anchor_entry"));
                c188727au.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(getIntent(), "author_id"));
                c188727au.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(getIntent(), "group_id"));
                c188727au.LJ(System.currentTimeMillis() - this.LJLLJ, "duration");
                LLFZ(c188727au, LLJJIJIIJIL2);
                FMX.LJIIL("multi_anchor_stay_time", c188727au.LIZ);
            } else if (!this.LL) {
                LLII(c188727au);
                c188727au.LJ(System.currentTimeMillis() - this.LJLLJ, "duration");
                c188727au.LJIIIZ("anchor_id", C16880lQ.LLJJIJIIJIL(getIntent(), "anchor_id"));
                LLFZ(c188727au, LLJJIJIIJIL2);
                FMX.LJIIL("multi_anchor_stay_time", c188727au.LIZ);
            }
        }
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        if (!this.LJLLL) {
            this.LJLLL = true;
            this.LJLLLL = System.currentTimeMillis();
        }
        this.LJZI.LIZLLL();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", true);
        super.onResume();
        if (this.LJLLL) {
            this.LJLLL = false;
            this.LJLLJ = (System.currentTimeMillis() - this.LJLLLL) + this.LJLLJ;
        }
        LLIIJLIL().setDownloadListener(C59972NgG.LIZ);
        if (this.LL) {
            this.LJZI.LIZ(AbstractC73672Svk.LJJIJIIJI(500L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJL(C73969T1h.LIZIZ()).LJJJLIIL(new AfS62S0100000_10(this, 29), C59971NgF.LJLIL));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public static String LLILLIZIL(String str) {
        String str2;
        InterfaceC59973NgH find$default;
        String value;
        if (str == null || (find$default = OJD.find$default(new OJD("https://.+/"), str, 0, 2, null)) == null || (value = find$default.getValue()) == null || (str2 = (String) ListProtector.get(s.LJLJJL(C40689Fy1.LLF(8, value), new String[]{"/"}, 0, 6), 0)) == null) {
            str2 = "";
        }
        return ORZ.LLD(ORZ.LLILZ(2, s.LJLJJL(str2, new String[]{"."}, 0, 6)), ".", null, null, null, 62);
    }

    public final void A90(boolean z) {
        this.LJLLLLLL = z;
        if (ujb.o.LJJJJIZL(this.LJLJLLL, "Wiki", true)) {
            NZQ LLIL = LLIL();
            if (z) {
                LLIL.LJFF(R.id.bez).setVisibility(0);
                ((C73305Spp) LLIL.LJFF(R.id.g94)).LJFF();
                ((C73305Spp) LLIL.LJFF(R.id.g94)).setVisibility(0);
            } else {
                LLIL.LJFF(R.id.bez).setVisibility(8);
                ((C73305Spp) LLIL.LJFF(R.id.g94)).setVisibility(8);
            }
        }
    }

    public final void LLFII(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("button_name", str);
        c188727au.LJIIIZ("page_type", "wiki");
        LLFZ(c188727au, C16880lQ.LLJJIJIIJIL(getIntent(), "mob_extra"));
        FMX.LJIIL("search_webpage_button_click", c188727au.LIZ);
    }

    public final void LLII(C188727au c188727au) {
        c188727au.LJIIIZ("enter_from", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"));
        c188727au.LJIIIZ("wiki_entry", C16880lQ.LLJJIJIIJIL(getIntent(), "wiki_entry"));
        c188727au.LJIIIZ("author_id", C16880lQ.LLJJIJIIJIL(getIntent(), "author_id"));
        c188727au.LJIIIZ("group_id", C16880lQ.LLJJIJIIJIL(getIntent(), "group_id"));
        c188727au.LJIIIZ("language", C16880lQ.LLJJIJIIJIL(getIntent(), "language"));
    }

    public final void LLILIL(Uri uri) {
        boolean z = true;
        int i = 8;
        if (ujb.o.LJJJJIZL(this.LJLJLLL, "Yelp", true) || ujb.o.LJJJJIZL(this.LJLJLLL, "TripAdvisor", true)) {
            if (C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from") == null) {
                LLIIIILZ().setVisibility(0);
                LLILLL("close", true);
                LLILLL("back", LLIL().canGoBack());
                LLILLL("more", false);
                return;
            }
            LLIIIILZ().setVisibility(8);
            LLILLL("close", LLIL().canGoBack());
            LLILLL("back", true);
            LLILLL("more", LLIIIJ());
            return;
        }
        if (ujb.o.LJJJJIZL(this.LJLJLLL, "Quizlet", true)) {
            if (C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from") == null) {
                OJD ojd = new OJD(".*/tt/[0-9]*");
                String uri2 = uri.toString();
                o.LJIIIIZZ(uri2, "uri.toString()");
                if (ojd.matches(uri2)) {
                    LLIIIILZ().setVisibility(0);
                    LLILLL("close", true);
                    LLILLL("back", LLIL().canGoBack());
                    LLILLL("more", false);
                    return;
                }
            }
            LLIIIILZ().setVisibility(8);
            LLILLL("close", LLIL().canGoBack());
            LLILLL("back", true);
            LLILLL("more", LLIIIJ());
            return;
        }
        if (ujb.o.LJJJJIZL(LLIIJI(uri, "hide_nav_bar"), "1", true)) {
            LLIIIILZ().setVisibility(8);
            View view = this.LJLJJI;
            if (view != null) {
                view.setVisibility(8);
                LLIIIZ().setVisibility(8);
                return;
            } else {
                o.LJIJI("statusBar");
                throw null;
            }
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            view2.setVisibility(0);
            LLIIIZ().setVisibility(0);
            boolean LJJJJIZL = ujb.o.LJJJJIZL(LLIIJI(uri, "addButton"), "true", true);
            LinearLayout LLIIIILZ = LLIIIILZ();
            if (LJJJJIZL) {
                i = 0;
            }
            LLIIIILZ.setVisibility(i);
            boolean z2 = !ujb.o.LJJJJIZL(LLIIJI(uri, "close"), "false", true);
            LLILLL("close", z2);
            if (!(!ujb.o.LJJJJIZL(LLIIJI(uri, "back"), "false", true)) && z2) {
                z = false;
            }
            LLILLL("back", z);
            LLILLL("more", LLIIIJ());
            return;
        }
        o.LJIJI("statusBar");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v60, types: [X.NaV, X.NZR] */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", true);
        activityConfiguration(C42941GtF.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.ft);
        View findViewById = findViewById(R.id.c02);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.cross_react_view)");
        this.LJLIL = (NZQ) findViewById;
        View findViewById2 = findViewById(R.id.c03);
        o.LJIIIIZZ(findViewById2, "this.findViewById(R.id.cross_react_view_mask)");
        this.LJLILLLLZI = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.vc);
        o.LJIIIIZZ(findViewById3, "this.findViewById(R.id.add_btn)");
        this.LJLJI = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.kej);
        o.LJIIIIZZ(findViewById4, "this.findViewById(R.id.status_bar)");
        setStatusBar(findViewById4);
        View findViewById5 = findViewById(R.id.wg);
        o.LJIIIIZZ(findViewById5, "this.findViewById(R.id.add_wiki_nav_bar)");
        this.LJLJJL = (C252709vu) findViewById5;
        View findViewById6 = findViewById(R.id.vc);
        if (findViewById6 != null) {
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 60), findViewById6);
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "url");
        String str4 = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        NZR LIZ = ((NXI) LLIL().LJI(NXI.class)).LIZ();
        o.LJIIIIZZ(LIZ, "webView.getViewWrap(WebV…Wrap::class.java).webView");
        this.LJLJJLL = LIZ;
        Uri data = getIntent().getData();
        if (data != null) {
            str = data.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "third_party_common_webview")) {
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                str3 = data2.getPath();
            } else {
                str3 = null;
            }
            this.LL = true;
            if (TextUtils.equals(str3, "/create")) {
                this.LLD = true;
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "add_button_url_regex");
                if (LLJJIJIIJIL2 == null) {
                    LLJJIJIIJIL2 = "";
                }
                this.LLFF = LLJJIJIIJIL2;
                this.LLFFF = getIntent().getIntExtra("type", -1);
                String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "subtype");
                if (LLJJIJIIJIL3 == null) {
                    LLJJIJIIJIL3 = "";
                }
                this.LLFII = LLJJIJIIJIL3;
                String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "url");
                if (LLJJIJIIJIL4 == null) {
                    LLJJIJIIJIL4 = "";
                }
                this.LLFZ = LLJJIJIIJIL4;
            } else if (TextUtils.equals(str3, "/show")) {
                this.LLF = true;
            }
        }
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(getIntent(), "anchor_type");
        if (LLJJIJIIJIL5 == null) {
            LLJJIJIIJIL5 = "";
        }
        this.LJLJLLL = LLJJIJIIJIL5;
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(getIntent(), "anchor_subtype");
        if (LLJJIJIIJIL6 == null) {
            LLJJIJIIJIL6 = "";
        }
        this.LLI = LLJJIJIIJIL6;
        String str5 = this.LJLJLLL;
        if (str5 == null || str5.length() == 0) {
            AnchorPublishStruct LJ = AnchorListManager.LJ(this.LLFFF, this.LLFII);
            if (LJ == null || (str2 = AnchorListManager.LJII(LJ)) == null) {
                str2 = "";
            }
            this.LJLJLLL = str2;
        }
        if ((C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from") != null && (ujb.o.LJJJJIZL(this.LJLJLLL, "Wiki", true) || ujb.o.LJJJJIZL(this.LJLJLLL, "Yelp", true) || ujb.o.LJJJJIZL(this.LJLJLLL, "TripAdvisor", true) || ujb.o.LJJJJIZL(this.LJLJLLL, "Quizlet", true))) || this.LLF) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("anchor_id", C16880lQ.LLJJIJIIJIL(getIntent(), "anchor_id"));
            FMX.LJIIL("tns_tiktok_3Panchor_report_page_view", c188727au.LIZ);
        }
        this.LJLLJ = System.currentTimeMillis();
        String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(getIntent(), "title");
        if (LLJJIJIIJIL7 != null) {
            str4 = LLJJIJIIJIL7;
        }
        this.LJZ = str4;
        if (!TextUtils.equals(UriProtector.parse(LLJJIJIIJIL).getScheme(), "https")) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
            return;
        }
        Uri parse = UriProtector.parse(LLJJIJIIJIL);
        o.LJIIIIZZ(parse, "parse(url)");
        LLILIL(parse);
        Uri parse2 = UriProtector.parse(LLJJIJIIJIL);
        o.LJIIIIZZ(parse2, "parse(url)");
        if (ujb.o.LJJJJIZL(LLIIJI(parse2, "noRedirect"), "true", true)) {
            FrameLayout frameLayout = this.LJLILLLLZI;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            } else {
                o.LJIJI("webViewMask");
                throw null;
            }
        }
        LLIL().setCustomWebViewStatus(new C59968NgC(this));
        LLIL().setShouldOverrideInterceptor(new AqS192S0100000_10(this, 51));
        A90(true);
        getIntent().putExtra("sec_link_scene", "anchors");
        NZQ.LJIJI(LLIL(), LLJJIJIIJIL, false, null, 14);
        LLIL().requestFocus();
        this.LJZL = LLIL().getCurrentUrl();
        LLIIJLIL().getView().requestFocus();
        this.LJLLILLLL = getIntent().getBooleanExtra("show_keyboard", false);
        getWindow().getDecorView().setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.dj, this)));
        ?? r0 = LLIL().LJLJL;
        if (r0 != 0) {
            r0.controlGeolocationPermissions(false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C63081OpJ.LJJJJLI(this));
            View view = this.LJLJJI;
            if (view != null) {
                view.setLayoutParams(layoutParams);
                C252709vu LLIIIZ = LLIIIZ();
                C235119Kp c235119Kp = new C235119Kp();
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
                LIZJ.LIZIZ = "back";
                LIZJ.LIZIZ(new AqS160S0100000_10(this, 365));
                c235119Kp.LIZLLL(LIZJ);
                C234529Ii LIZJ2 = s1.LIZJ();
                LIZJ2.LIZJ = R.raw.icon_x_mark;
                LIZJ2.LIZIZ = "close";
                LIZJ2.LIZIZ(new AqS157S0100000_7(this, 338));
                c235119Kp.LIZLLL(LIZJ2);
                C234529Ii LIZJ3 = s1.LIZJ();
                LIZJ3.LIZJ = R.raw.icon_ellipsis_vertical;
                LIZJ3.LIZIZ = "more";
                LIZJ3.LIZIZ(new AqS160S0100000_10(this, 366));
                c235119Kp.LIZIZ(LIZJ3);
                c235119Kp.LIZJ = new C9KF();
                LLIIIZ.setNavActions(c235119Kp);
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
                return;
            }
            o.LJIJI("statusBar");
            throw null;
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }

    public final void setStatusBar(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LJLJJI = view;
    }

    public static void LLFZ(C188727au c188727au, String str) {
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        if (LJII != null) {
            for (Map.Entry<String, Object> entry : LJII.entrySet()) {
                c188727au.LJI(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
    }

    public static String LLIIJI(Uri uri, String str) {
        try {
            return UriProtector.getQueryParameter(uri, str);
        } catch (Exception unused) {
            return "";
        }
    }

    public final void LLILLL(Object obj, boolean z) {
        LLIIIZ().LJIJ(obj, new AqS15S0010000_10(z, 3));
    }
}
