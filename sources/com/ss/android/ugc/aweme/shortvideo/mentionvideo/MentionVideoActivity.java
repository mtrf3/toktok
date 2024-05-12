package com.ss.android.ugc.aweme.shortvideo.mentionvideo;

import X.AR6;
import X.C145995oB;
import X.C16880lQ;
import X.C17N;
import X.C26224AQy;
import X.C33381Ss;
import X.C42053Gev;
import X.C43212Gxc;
import X.C44350Has;
import X.C60178Nja;
import X.C60903NvH;
import X.C65803Ps7;
import X.C80674VlO;
import X.C80675VlP;
import X.C8IC;
import X.FMX;
import X.GBO;
import X.GGS;
import X.HWM;
import X.VWH;
import Y.ACListenerS24S0201000_7;
import Y.ACListenerS27S0100000_7;
import Y.IDiS269S0100000_7;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MentionVideoActivity extends GBO {
    public static final /* synthetic */ int LJLLJ = 0;
    public C80675VlP LJLJI;
    public VWH LJLJJI;
    public C8IC LJLJJL;
    public int LJLL;
    public String LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final ArrayList<String> LJLJJLL = new ArrayList<>();
    public final ArrayList<Fragment> LJLJL = new ArrayList<>();
    public String LJLJLJ = "";
    public String LJLJLLL = "";

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.n, R.anim.y);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onStart", true);
        super.onStart();
        C44350Has c44350Has = new C44350Has(0);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        if (((IVideoRecordPreferences) c44350Has.LIZ(application, IVideoRecordPreferences.class)).getShouldShowMentionVideoGuidePanel(true)) {
            C26224AQy c26224AQy = new C26224AQy();
            C33381Ss c33381Ss = new C33381Ss();
            c33381Ss.LJLIL = R.drawable.bec;
            c26224AQy.LIZ = c33381Ss.LIZ(this);
            c26224AQy.LIZLLL = 2;
            String string = getString(R.string.e5p);
            o.LJIIIIZZ(string, "getString(R.string.creat…redit_video_dialog_title)");
            c26224AQy.LJ = string;
            String string2 = getString(R.string.e5m);
            o.LJIIIIZZ(string2, "getString(R.string.creat…deo_dialog_description_1)");
            String string3 = getString(R.string.e5n);
            o.LJIIIIZZ(string3, "getString(R.string.creat…deo_dialog_description_2)");
            String string4 = getString(R.string.e5o);
            o.LJIIIIZZ(string4, "getString(R.string.creat…deo_dialog_description_3)");
            c26224AQy.LIZLLL(new AR6(R.raw.icon_at, null, string2), new AR6(R.raw.icon_tilt_light_bulb, null, string3), new AR6(R.raw.icon_bell, null, string4));
            c26224AQy.LJIILIIL = false;
            String string5 = getString(R.string.e5l);
            AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 116);
            c26224AQy.LJII = string5;
            c26224AQy.LJIIIZ = aqS173S0100000_7;
            TuxSheet tuxSheet = c26224AQy.LIZ().LIZ;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            tuxSheet.show(supportFragmentManager, "mention_video_educational_panel");
            C44350Has c44350Has2 = new C44350Has(0);
            Application application2 = C60903NvH.LJ;
            o.LJIIIIZZ(application2, "getApplication()");
            ((IVideoRecordPreferences) c44350Has2.LIZ(application2, IVideoRecordPreferences.class)).setShouldShowMentionVideoGuidePanel(false);
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", "video_post_page");
            String str = this.LJLLI;
            if (str != null) {
                c145995oB.LJI("creation_id", str);
                FMX.LJIIL("show_credits_video_popup", c145995oB.LIZ);
            } else {
                o.LJIJI("creationId");
                throw null;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onStart", false);
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

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View view;
        String str;
        Window window;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.en);
        getWindow().addFlags(128);
        overridePendingTransition(R.anim.ae, R.anim.n);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id");
        String str2 = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLLI = LLJJIJIIJIL;
        if (!C60178Nja.LIZIZ(this) && (window = getWindow()) != null) {
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        View findViewById = findViewById(R.id.g8k);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.loading_hud)");
        this.LJLJJL = (C8IC) findViewById;
        View findViewById2 = findViewById(R.id.bfe);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.close_anchor)");
        C16880lQ.LJIILLIIL((ImageView) findViewById2, new ACListenerS27S0100000_7(this, 32));
        View findViewById3 = findViewById(R.id.n6k);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.video_list_tab)");
        this.LJLJI = (C80675VlP) findViewById3;
        View findViewById4 = findViewById(R.id.n6m);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.video_list_viewpager)");
        VWH vwh = (VWH) findViewById4;
        this.LJLJJI = vwh;
        vwh.setOffscreenPageLimit(3);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "music_id");
        if (LLJJIJIIJIL2 != null) {
            this.LJLJLJ = LLJJIJIIJIL2;
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "music_title");
            if (LLJJIJIIJIL3 == null) {
                LLJJIJIIJIL3 = "";
            }
            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "music_author");
            if (LLJJIJIIJIL4 != null) {
                str2 = LLJJIJIIJIL4;
            }
            this.LJLJLLL = LLJJIJIIJIL3 + " — " + str2;
        }
        C42053Gev c42053Gev = C42053Gev.LIZIZ;
        String str3 = this.LJLLI;
        if (str3 != null) {
            c42053Gev.LIZ.LJIIJJI(str3);
            ArrayList<String> arrayList = this.LJLJJLL;
            String str4 = this.LJLJLJ;
            if (str4 != null && str4.length() != 0 && (str = this.LJLJLLL) != null && str.length() != 0) {
                arrayList.add(getString(R.string.e69));
                this.LJLJL.add(c42053Gev.LJII(this.LJLJLJ, this.LJLJLLL));
            }
            arrayList.add(getString(R.string.e68));
            this.LJLJL.add(c42053Gev.LIZLLL(6));
            arrayList.add(getString(R.string.e67));
            this.LJLJL.add(c42053Gev.LIZLLL(9));
            arrayList.add(getString(R.string.e66));
            this.LJLJL.add(c42053Gev.LIZJ());
            C80675VlP c80675VlP = this.LJLJI;
            if (c80675VlP != null) {
                c80675VlP.setTabMode(0);
                C80675VlP c80675VlP2 = this.LJLJI;
                if (c80675VlP2 != null) {
                    c80675VlP2.setAutoFillWhenScrollable(true);
                    C80675VlP c80675VlP3 = this.LJLJI;
                    if (c80675VlP3 != null) {
                        c80675VlP3.LJIIZILJ(C17N.LJIILL(16.0d), C17N.LJIILL(16.0d));
                        C80675VlP c80675VlP4 = this.LJLJI;
                        if (c80675VlP4 != null) {
                            c80675VlP4.setCustomTabViewResId(R.layout.bsr);
                            VWH vwh2 = this.LJLJJI;
                            if (vwh2 != null) {
                                FragmentManager supportFragmentManager = getSupportFragmentManager();
                                o.LJIIIIZZ(supportFragmentManager, "this.supportFragmentManager");
                                vwh2.setAdapter(new HWM(supportFragmentManager, this.LJLJL, this.LJLJJLL));
                                C80675VlP c80675VlP5 = this.LJLJI;
                                if (c80675VlP5 != null) {
                                    VWH vwh3 = this.LJLJJI;
                                    if (vwh3 != null) {
                                        c80675VlP5.setupWithViewPager(vwh3);
                                        int size = this.LJLJJLL.size();
                                        for (int i = 0; i < size; i++) {
                                            C80675VlP c80675VlP6 = this.LJLJI;
                                            if (c80675VlP6 != null) {
                                                C80674VlO LJIIJ = c80675VlP6.LJIIJ(i);
                                                if (LJIIJ != null && (view = LJIIJ.LJFF) != null) {
                                                    C16880lQ.LJIIJ(new ACListenerS24S0201000_7(i, this, LJIIJ, 1), view);
                                                }
                                            } else {
                                                o.LJIJI("tabLayout");
                                                throw null;
                                            }
                                        }
                                        VWH vwh4 = this.LJLJJI;
                                        if (vwh4 != null) {
                                            vwh4.addOnPageChangeListener(new IDiS269S0100000_7(this, 1));
                                            C145995oB c145995oB = new C145995oB();
                                            c145995oB.LJI("enter_from", "video_post_page");
                                            String str5 = this.LJLLI;
                                            if (str5 != null) {
                                                c145995oB.LJI("creation_id", str5);
                                                FMX.LJIIL("show_credits_page", c145995oB.LIZ);
                                                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity", "onCreate", false);
                                                return;
                                            }
                                            o.LJIJI("creationId");
                                            throw null;
                                        }
                                        o.LJIJI("viewPager");
                                        throw null;
                                    }
                                    o.LJIJI("viewPager");
                                    throw null;
                                }
                                o.LJIJI("tabLayout");
                                throw null;
                            }
                            o.LJIJI("viewPager");
                            throw null;
                        }
                        o.LJIJI("tabLayout");
                        throw null;
                    }
                    o.LJIJI("tabLayout");
                    throw null;
                }
                o.LJIJI("tabLayout");
                throw null;
            }
            o.LJIJI("tabLayout");
            throw null;
        }
        o.LJIJI("creationId");
        throw null;
    }
}
