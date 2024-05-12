package com.ss.android.ugc.aweme.music.ui;

import X.ATO;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C34X;
import X.C41250GGw;
import X.C44202HWk;
import X.C44206HWo;
import X.C52736Kmq;
import X.C54502LaE;
import X.C56542MHa;
import X.C65803Ps7;
import X.C78939UyV;
import X.FOG;
import X.GBP;
import X.GHC;
import X.HT5;
import X.InterfaceC18010nF;
import X.InterfaceC27853AwT;
import X.InterfaceC40934G4s;
import X.InterfaceC45040Hm0;
import X.ViewOnApplyWindowInsetsListenerC51183K6x;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicDetailActivity extends ActivityC86117Xqz implements C34X, InterfaceC27853AwT, InterfaceC45040Hm0, InterfaceC18010nF, InterfaceC40934G4s {
    public String LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public String LJLJL;
    public String LJLJLJ;
    public Music LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public int LJLLJ;
    public String LJLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public C56542MHa LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final List<GHC> LJLJJLL = new ArrayList();
    public String LJLLLL = "";
    public final C44202HWk LJZI = new C44202HWk(this);

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b5171";
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "single_song";
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public final C56542MHa LLFII() {
        if (this.LJZL == null) {
            C56542MHa c56542MHa = new C56542MHa();
            c56542MHa.LJLILLLLZI = true;
            String str = this.LJLJL;
            String str2 = c56542MHa.LJLJLJ;
            c56542MHa.LJLJJI = str;
            c56542MHa.LJLJJL = 0L;
            c56542MHa.LJLJJLL = 20;
            c56542MHa.LJLIL = 0;
            if (str2 != null) {
                c56542MHa.LJLJLJ = str2;
            } else {
                c56542MHa.LJLJLJ = "";
            }
            c56542MHa.LJLLILLLL = false;
            c56542MHa.LJIIIZ(20, 0, 0L, str, false);
            this.LJZL = c56542MHa;
        }
        return this.LJZL;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:2|3)|(2:5|6)|7|8|9|10|11|(1:(0))) */
    @Override // X.InterfaceC45040Hm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.analysis.Analysis getAnalysis() {
        /*
            r7 = this;
            r4 = 0
            java.lang.String r0 = r7.LJLJL     // Catch: java.lang.Exception -> L17
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Exception -> L17
            long r2 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L17
            java.lang.String r0 = r7.LJLIL     // Catch: java.lang.Exception -> L15
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Exception -> L15
            long r4 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L15
            goto L1d
        L15:
            r0 = move-exception
            goto L1a
        L17:
            r0 = move-exception
            r2 = 0
        L1a:
            X.C16880lQ.LLLLIIL(r0)
        L1d:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r1 = "page_model"
            java.lang.String r0 = "detail"
            r6.put(r1, r0)     // Catch: org.json.JSONException -> L29
        L29:
            com.ss.android.ugc.aweme.analysis.Analysis r1 = new com.ss.android.ugc.aweme.analysis.Analysis
            r1.<init>()
            java.lang.String r0 = "single_song"
            r1.setLabelName(r0)
            r1.setExt_value(r2)
            r1.setValue(r4)
            r1.setExt_json(r6)
            java.lang.String r0 = "Analysis()\n            .…         .setExt_json(jo)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDetailActivity.getAnalysis():com.ss.android.ugc.aweme.analysis.Analysis");
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C78939UyV.LJJJJ(this);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        this.LJZI.LIZ(false);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", true);
        super.onResume();
        this.LJZI.LIZ(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onStart", true);
        super.onStart();
        IBenchmarkService createIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (createIBenchmarkServicebyMonsterPlugin != null) {
            createIBenchmarkServicebyMonsterPlugin.startBenchmark(4);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        IBenchmarkService createIBenchmarkServicebyMonsterPlugin = BenchmarkServiceImpl.createIBenchmarkServicebyMonsterPlugin(false);
        if (createIBenchmarkServicebyMonsterPlugin != null) {
            createIBenchmarkServicebyMonsterPlugin.stopBenchmark();
        }
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int intExtra;
        long j;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", true);
        C54502LaE.LIZ("single_song");
        ((Number) FOG.LIZ.getValue()).intValue();
        activityConfiguration(C41250GGw.LJLIL);
        if (ATO.LIZ()) {
            getWindow().setDecorFitsSystemWindows(false);
        }
        super.onCreate(bundle);
        if (GBP.LIZ()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.bug);
        View findViewById = findViewById(R.id.bs8);
        if (ATO.LIZ() && findViewById != null) {
            findViewById.setOnApplyWindowInsetsListener(ViewOnApplyWindowInsetsListenerC51183K6x.LIZ);
        }
        View findViewById2 = findViewById(R.id.kej);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.LJLLI = C16880lQ.LLJJIJIIJIL(getIntent(), "partnerName");
        this.LJLLILLLL = C16880lQ.LLJJIJIIJIL(getIntent(), "partnerMusicId");
        this.LJLJL = C16880lQ.LLJJIJIIJIL(getIntent(), "id");
        this.LJLJLLL = (Music) getIntent().getSerializableExtra("enter_music_from_pre_page");
        this.LJLL = C16880lQ.LLJJIJIIJIL(getIntent(), "process_id");
        this.LJLIL = C16880lQ.LLJJIJIIJIL(getIntent(), "aweme_id");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_music_from");
        this.LJLJI = LLJJIJIIJIL;
        if (o.LJ("search_result", LLJJIJIIJIL)) {
            intExtra = 2;
        } else {
            intExtra = getIntent().getIntExtra("extra_enter_from", 0);
        }
        this.LJLILLLLZI = intExtra;
        this.LJLJJI = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
        this.LJLJJL = C16880lQ.LLJJIJIIJIL(getIntent(), "previous_page_position");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "sticker_id");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "from_token");
        this.LJLLJ = getIntent().getIntExtra("extra_video_length", 0);
        this.LJLLL = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_track_info");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_enter_from");
        this.LJLLLL = C16880lQ.LLJJIJIIJIL(getIntent(), "banner_id");
        this.LJLLLLLL = getIntent().getBooleanExtra("enter_record_from_feed", false);
        if (getIntent().getIntExtra("open_edit_sheet", 0) == 1) {
            this.LJLZ = true;
        }
        this.LJZ = getIntent().getBooleanExtra("save_featured_video_success", false);
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(getIntent(), "banner_type");
        boolean booleanExtra = getIntent().getBooleanExtra("show_reuse_audio_entrance", false);
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(getIntent(), "video_id");
        int intExtra2 = getIntent().getIntExtra("is_bundled", 0);
        int intExtra3 = getIntent().getIntExtra("click_reason", 0);
        String LIZ = C44206HWo.LIZ(getIntent());
        long longExtra = getIntent().getLongExtra("EXTRA_PRELOAD_PAGE_START_TIME", -1L);
        int intExtra4 = getIntent().getIntExtra("extra_music_begin_time", 0);
        int intExtra5 = getIntent().getIntExtra("extra_music_end_time", 0);
        String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(getIntent(), "music_cover");
        this.LJLJLJ = C16880lQ.LLJJIJIIJIL(getIntent(), "group_id");
        String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(getIntent(), "is_original_and_added_sound");
        String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(getIntent(), "original_sound_volume");
        String LLJJIJIIJIL10 = C16880lQ.LLJJIJIIJIL(getIntent(), "added_sound_volume");
        String LLJJIJIIJIL11 = C16880lQ.LLJJIJIIJIL(getIntent(), "music_volume");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("tts_voice_ids");
        ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("tts_voice_ref_ids");
        ArrayList<String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("vc_voice_ids");
        ArrayList<String> stringArrayListExtra4 = getIntent().getStringArrayListExtra("vc_voice_ref_ids");
        if (TextUtils.isEmpty(this.LJLJL) && TextUtils.isEmpty(this.LJLLILLLL)) {
            finish();
        } else {
            String str = "";
            if (TextUtils.isEmpty(this.LJLL)) {
                this.LJLL = "";
            }
            if (TextUtils.equals(this.LJLJI, "choose_music_with_banner")) {
                CommerceMediaServiceImpl.LIZJ().LJIILL(this).Hw(this.LJLLLL, LLJJIJIIJIL5);
            }
            if (o.LJ("collection_music", this.LJLJI)) {
                HT5.LIZ = true;
            }
            if (((Boolean) C52736Kmq.LIZ.getValue()).booleanValue()) {
                LLFII();
            }
            Serializable serializableExtra = getIntent().getSerializableExtra("reuse_sound_from");
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            Fragment LJJJIL = supportFragmentManager.LJJJIL("music_detail_fragment_tag");
            if (LJJJIL == null) {
                String str2 = this.LJLJL;
                Music music = this.LJLJLLL;
                String str3 = this.LJLIL;
                String str4 = this.LJLJI;
                String str5 = this.LJLJJL;
                String str6 = this.LJLLILLLL;
                String str7 = this.LJLLI;
                String str8 = this.LJLL;
                int i = this.LJLLJ;
                String str9 = this.LJLLLL;
                String str10 = this.LJLLL;
                Long valueOf = Long.valueOf(longExtra);
                int i2 = this.LJLJJI;
                boolean z = this.LJLLLLLL;
                boolean z2 = this.LJLZ;
                boolean z3 = this.LJZ;
                String str11 = this.LJLJLJ;
                int i3 = this.LJLILLLLZI;
                Bundle bundle2 = new Bundle(3);
                bundle2.putString("id", str2);
                bundle2.putSerializable("enter_music_from_pre_page", music);
                bundle2.putString("partnerName", str7);
                bundle2.putString("partnerMusicId", str6);
                bundle2.putString("aweme_id", str3);
                bundle2.putString("sticker_id", LLJJIJIIJIL2);
                bundle2.putString("extra_music_from", str4);
                bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
                bundle2.putString("extra_previous_page_position", str5);
                bundle2.putInt("click_reason", intExtra3);
                bundle2.putString("from_token", LLJJIJIIJIL3);
                bundle2.putString("process_id", str8);
                bundle2.putInt("extra_video_length", i);
                bundle2.putString("extra_track_info", str10);
                bundle2.putString("banner_id", str9);
                bundle2.putString("video_id", LLJJIJIIJIL6);
                if (LIZ != null) {
                    bundle2.putString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", LIZ);
                }
                if (valueOf != null) {
                    j = valueOf.longValue();
                } else {
                    j = 0;
                }
                bundle2.putLong("EXTRA_PRELOAD_PAGE_START_TIME", j);
                if (LLJJIJIIJIL4 != null) {
                    str = LLJJIJIIJIL4;
                }
                bundle2.putString("shoot_enter_from", str);
                bundle2.putInt("is_bundled", intExtra2);
                bundle2.putInt("show_reuse_audio_entrance", booleanExtra ? 1 : 0);
                bundle2.putInt("extra_music_begin_time", intExtra4);
                bundle2.putInt("extra_music_end_time", intExtra5);
                bundle2.putBoolean("enter_record_from_feed", z);
                bundle2.putBoolean("open_edit_sheet", z2);
                bundle2.putSerializable("reuse_sound_from", serializableExtra);
                bundle2.putString("is_original_and_added_sound", LLJJIJIIJIL8);
                bundle2.putString("original_sound_volume", LLJJIJIIJIL9);
                bundle2.putString("added_sound_volume", LLJJIJIIJIL10);
                bundle2.putStringArrayList("tts_voice_ids", stringArrayListExtra);
                bundle2.putStringArrayList("tts_voice_ref_ids", stringArrayListExtra2);
                bundle2.putStringArrayList("vc_voice_ids", stringArrayListExtra3);
                bundle2.putStringArrayList("vc_voice_ref_ids", stringArrayListExtra4);
                bundle2.putBoolean("save_featured_video_success", z3);
                bundle2.putString("music_cover", LLJJIJIIJIL7);
                bundle2.putString("from_group_id", str11);
                bundle2.putInt("extra_enter_from", i3);
                bundle2.putString("music_volume", LLJJIJIIJIL11);
                LJJJIL = new MusicDetailFragment();
                LJJJIL.setArguments(bundle2);
            }
            LJJJIL.setUserVisibleHint(true);
            c1b3.LJIIJ(LJJJIL, "music_detail_fragment_tag", R.id.bs8);
            c1b3.LJIILJJIL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", false);
    }

    @Override // X.C34X
    public final void registerActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        List<GHC> list = this.LJLJJLL;
        o.LJI(list);
        if (!((ArrayList) list).contains(listener)) {
            ((ArrayList) this.LJLJJLL).add(listener);
        }
    }

    @Override // X.C34X
    public final void unRegisterActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        List<GHC> list = this.LJLJJLL;
        if (list != null) {
            ((ArrayList) list).remove(listener);
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        List<GHC> list = this.LJLJJLL;
        o.LJI(list);
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            if (((GHC) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
