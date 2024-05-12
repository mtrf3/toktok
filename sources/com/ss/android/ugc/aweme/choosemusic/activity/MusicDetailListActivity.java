package com.ss.android.ugc.aweme.choosemusic.activity;

import X.ActivityC86117Xqz;
import X.AnonymousClass036;
import X.C16880lQ;
import X.C1B3;
import X.C1DG;
import X.C27740Aue;
import X.C63057Oov;
import X.C65803Ps7;
import X.C78939UyV;
import X.C79045V0n;
import X.GBP;
import X.LTT;
import X.XVF;
import Y.AObjectS10S0001000_5;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.choosemusic.fragment.HotMusicListFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicSheetFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.SecondLevelMusicFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class MusicDetailListActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLIL = 0;

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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C78939UyV.LJJJJ(this);
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int intExtra;
        String str;
        String str2;
        long j;
        boolean z;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onCreate", true);
        activityConfiguration(new AObjectS10S0001000_5(1, 6));
        super.onCreate(bundle);
        if (GBP.LIZ()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.er);
        if (getIntent() != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "cid");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "music_class_id");
            }
            int intExtra2 = getIntent().getIntExtra("music_class_level", 0);
            if (!TextUtils.isEmpty(LLJJIJIIJIL)) {
                intExtra = 2;
            } else {
                intExtra = getIntent().getIntExtra("music_type", 1);
            }
            if (intExtra2 == 1) {
                intExtra = 7;
            }
            int intExtra3 = getIntent().getIntExtra("sound_page_scene", 0);
            Intent intent = getIntent();
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "from_banner_id");
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "banner_type");
            if (LLJJIJIIJIL2 != null || LLJJIJIIJIL3 != null) {
                CommerceMediaServiceImpl.LIZJ().LJIILL(this).Hw(LLJJIJIIJIL2, LLJJIJIIJIL3);
            }
            CommerceMediaServiceImpl.LIZJ().LJFF(this).qj(intExtra, Integer.valueOf(getIntent().getIntExtra("playlist_order_in_csp", -1)), LLJJIJIIJIL, LLJJIJIIJIL3, LLJJIJIIJIL2, getIntent().getBooleanExtra("ai_recommend_playlist", false));
            switch (intExtra) {
                case 1:
                    str = "hot_music_list";
                    break;
                case 2:
                    str = "music_class_sheet";
                    break;
                case 3:
                    str = "local_music_list";
                    break;
                case 4:
                    str = "tag_music_sheet";
                    break;
                case 5:
                    str = "local_music_list_shoot";
                    break;
                case 6:
                    str = "local_music_list_edit";
                    break;
                case 7:
                    str = "local_second_level_music_list_edit";
                    break;
                default:
                    str = "";
                    break;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment LJJJIL = supportFragmentManager.LJJJIL(str);
            if (LJJJIL == null) {
                Intent intent2 = getIntent();
                switch (intExtra) {
                    case 1:
                        LJJJIL = HotMusicListFragment.Ll(intent2.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1), intExtra3, intent2.getIntExtra("music_discovery_type", 0), intent2.getLongExtra("max_video_duration", 0L), intent2.getLongExtra("shoot_video_length", 0L));
                        break;
                    case 2:
                    case 7:
                        if (intent2 != null) {
                            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent2, "cid");
                            String musicClassName = C16880lQ.LLJJIJIIJIL(intent2, "name");
                            String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(intent2, "is_hot");
                            boolean booleanExtra = intent2.getBooleanExtra("music_category_is_hot", false);
                            if (!TextUtils.isEmpty(LLJJIJIIJIL5)) {
                                try {
                                    booleanExtra = Boolean.valueOf(LLJJIJIIJIL5).booleanValue();
                                } catch (Exception unused) {
                                }
                            }
                            if (TextUtils.isEmpty(LLJJIJIIJIL4)) {
                                str2 = C16880lQ.LLJJIJIIJIL(intent2, "music_class_id");
                            } else {
                                str2 = LLJJIJIIJIL4;
                            }
                            if (TextUtils.isEmpty(musicClassName)) {
                                musicClassName = C16880lQ.LLJJIJIIJIL(intent2, "music_class_name");
                            }
                            int intExtra4 = intent2.getIntExtra("music_class_level", 0);
                            String enterMethod = C16880lQ.LLJJIJIIJIL(intent2, "music_class_enter_method");
                            int intExtra5 = intent2.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
                            String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(intent2, "musicType");
                            if (!TextUtils.isEmpty(LLJJIJIIJIL6)) {
                                try {
                                    intExtra5 = CastIntegerProtector.valueOf(LLJJIJIIJIL6).intValue();
                                } catch (Exception unused2) {
                                    intExtra5 = 2;
                                }
                            }
                            if (intent2.hasExtra("enter_method")) {
                                enterMethod = C16880lQ.LLJJIJIIJIL(intent2, "enter_method");
                            } else if (!TextUtils.isEmpty(LLJJIJIIJIL4)) {
                                enterMethod = "click_banner";
                            }
                            if (intent2.hasExtra("previous_page")) {
                                XVF.LJIILLIIL(C16880lQ.LLJJIJIIJIL(intent2, "previous_page"));
                            }
                            String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(intent2, "track_id");
                            if (!TextUtils.isEmpty(str2)) {
                                if (intExtra4 == 1) {
                                    long longExtra = intent2.getLongExtra("max_video_duration", 0L);
                                    long longExtra2 = intent2.getLongExtra("shoot_video_length", 0L);
                                    int intExtra6 = intent2.getIntExtra("music_discovery_type", 0);
                                    String musicClassId = str2;
                                    o.LJIIIZ(musicClassId, "musicClassId");
                                    o.LJIIIZ(musicClassName, "musicClassName");
                                    o.LJIIIZ(enterMethod, "enterMethod");
                                    LJJJIL = new SecondLevelMusicFragment();
                                    Bundle LIZJ = AnonymousClass036.LIZJ("music_class_id", str2, "music_class_name", musicClassName);
                                    LIZJ.putString("music_class_enter_from", "change_music_page_detail");
                                    LIZJ.putBoolean("music_class_is_hot", booleanExtra);
                                    LIZJ.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", intExtra5);
                                    LIZJ.putString("music_class_enter_method", enterMethod);
                                    LIZJ.putInt("music_class_level", intExtra4);
                                    LIZJ.putInt("sound_page_scene", intExtra3);
                                    LIZJ.putLong("max_video_duration", longExtra);
                                    LIZJ.putLong("shoot_video_length", longExtra2);
                                    LIZJ.putInt("music_discovery_type", intExtra6);
                                    LJJJIL.setArguments(LIZJ);
                                    break;
                                } else {
                                    if (TextUtils.isEmpty(intent2.getScheme()) || intent2.getBooleanExtra("is_from_self", false)) {
                                        j = 0;
                                        z = false;
                                    } else {
                                        j = 0;
                                        z = true;
                                    }
                                    LJJJIL = MusicClassDetailFragment.Ll(str2, musicClassName, "change_music_page_detail", intExtra5, booleanExtra, enterMethod, intExtra4, null, intExtra3, LLJJIJIIJIL7, z, intent2.getLongExtra("max_video_duration", j), intent2.getLongExtra("shoot_video_length", j), C16880lQ.LLJJIJIIJIL(intent2, "extra_music_from"), intent2.getIntExtra("music_discovery_type", 0));
                                    break;
                                }
                            }
                        }
                        LJJJIL = null;
                        break;
                    case 3:
                        LJJJIL = LocalMusicFragment.Nl(intent2.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1));
                        break;
                    case 4:
                        int intExtra7 = intent2.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
                        long longExtra3 = intent2.getLongExtra("max_video_duration", 0L);
                        long longExtra4 = intent2.getLongExtra("shoot_video_length", 0L);
                        int intExtra8 = intent2.getIntExtra("more_tab_music_sheet_collection_type", 0);
                        LJJJIL = new MusicSheetFragment();
                        Bundle LIZLLL = C1DG.LIZLLL("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", intExtra7, "sound_page_scene", intExtra3);
                        LIZLLL.putLong("max_video_duration", longExtra3);
                        LIZLLL.putLong("shoot_video_length", longExtra4);
                        LIZLLL.putInt("more_tab_music_sheet_collection_type", intExtra8);
                        LJJJIL.setArguments(LIZLLL);
                        break;
                    case 5:
                        LJJJIL = LocalMusicFragment.Nl(intent2.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 2));
                        break;
                    case 6:
                        LJJJIL = LocalMusicFragment.Nl(intent2.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0));
                        break;
                    default:
                        LJJJIL = HotMusicListFragment.Ll(intent2.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1), intExtra3, intent2.getIntExtra("music_discovery_type", 0), intent2.getLongExtra("max_video_duration", 0L), intent2.getLongExtra("shoot_video_length", 0L));
                        break;
                }
            }
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(LJJJIL, str, R.id.dm7);
            c1b3.LJI();
        }
        if (C63057Oov.LIZ()) {
            C27740Aue.LJIIIIZZ(this);
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(1024);
            }
            Integer LJI = C79045V0n.LJI(R.attr.ca, this);
            if (LJI != null) {
                getWindow().setStatusBarColor(LJI.intValue());
            }
            LTT.LIZJ(this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity", "onCreate", false);
    }
}
