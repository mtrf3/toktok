package com.ss.android.ugc.aweme.prop.activity;

import X.AYA;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C27740Aue;
import X.C65803Ps7;
import X.InterfaceC18010nF;
import X.InterfaceC27853AwT;
import X.InterfaceC40934G4s;
import Y.AObjectS12S0001000_7;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class StickerPropDetailActicity extends ActivityC86117Xqz implements InterfaceC27853AwT, InterfaceC18010nF, InterfaceC40934G4s {
    public static final /* synthetic */ int LJLLL = 0;
    public String LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public Aweme LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public Boolean LJLL;
    public UrlModel LJLLI;
    public final List<String> LJLIL = new ArrayList();
    public boolean LJLJJLL = false;
    public String LJLLILLLL = "";
    public String LJLLJ = "";

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b1030";
    }

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "prop_page";
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
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
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", true);
        activityConfiguration(new AObjectS12S0001000_7(0, 2));
        super.onCreate(bundle);
        setContentView(R.layout.fa);
        View findViewById = findViewById(R.id.kej);
        if (findViewById != null) {
            AYA.LIZIZ(findViewById);
            C27740Aue.LJII(this);
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_log_pb");
        this.LJLILLLLZI = C16880lQ.LLJJIJIIJIL(getIntent(), "aweme_id");
        this.LJLJI = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_music_from");
        this.LJLJL = (Aweme) getIntent().getSerializableExtra("extra_related_item");
        this.LJLJLJ = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_owner_id");
        this.LJLJLLL = getIntent().getIntExtra("featured_video_source", 2);
        this.LJLL = Boolean.valueOf(getIntent().getBooleanExtra("extra_open_from_profile_page", false));
        this.LJLLI = (UrlModel) getIntent().getSerializableExtra("extra_url_icon");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_edit_effect_uid");
        Serializable serializableExtra = getIntent().getSerializableExtra("sticker_music");
        Serializable serializableExtra2 = getIntent().getSerializableExtra("music_model");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_enter_from");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "from_banner_id");
        int intExtra = getIntent().getIntExtra("is_bundled", 0);
        int intExtra2 = getIntent().getIntExtra("media_type", 0);
        C16880lQ.LLJJIJIIJIL(getIntent(), "from_token");
        this.LJLJJI = getIntent().getIntExtra("extra_video_length", 0);
        this.LJLJJL = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_previous_page");
        this.LJLJJLL = getIntent().getBooleanExtra("enter_record_from_feed", false);
        this.LJLLILLLL = C16880lQ.LLJJIJIIJIL(getIntent(), "prop_page_enter_from");
        this.LJLLJ = C16880lQ.LLJJIJIIJIL(getIntent(), "prop_page_enter_method");
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_stickers");
        if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
            stringArrayListExtra = new ArrayList<>();
            String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(getIntent(), "id");
            if (!TextUtils.isEmpty(LLJJIJIIJIL5)) {
                String[] split = LLJJIJIIJIL5.split(",");
                if (split.length > 0) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            stringArrayListExtra.add(str);
                        }
                    }
                }
            }
        }
        if (stringArrayListExtra.size() == 0) {
            finish();
        } else {
            ((ArrayList) this.LJLIL).addAll(stringArrayListExtra);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            Fragment LJJJIL = supportFragmentManager.LJJJIL("sticker_prop_detail_fragment_tag");
            String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_sticker_from");
            if (LJJJIL == null) {
                String str2 = this.LJLILLLLZI;
                String str3 = this.LJLJI;
                int i = this.LJLJJI;
                String str4 = this.LJLJJL;
                boolean z = this.LJLJJLL;
                Aweme aweme = this.LJLJL;
                String str5 = this.LJLLILLLL;
                String str6 = this.LJLLJ;
                UrlModel urlModel = this.LJLLI;
                int i2 = this.LJLJLLL;
                Boolean bool = this.LJLL;
                String str7 = this.LJLJLJ;
                Bundle bundle2 = new Bundle(3);
                bundle2.putStringArrayList("extra_stickers", stringArrayListExtra);
                bundle2.putString("aweme_id", str2);
                bundle2.putString("extra_edit_effect_uid", LLJJIJIIJIL2);
                bundle2.putString("extra_music_from", str3);
                bundle2.putString("extra_sticker_from", LLJJIJIIJIL6);
                bundle2.putSerializable("sticker_music", serializableExtra);
                bundle2.putSerializable("music_model", serializableExtra2);
                bundle2.putString("extra_log_pb", LLJJIJIIJIL);
                bundle2.putInt("media_type", intExtra2);
                bundle2.putInt("EXTRA_VIDEO_LENGTH", i);
                bundle2.putString("extra_previous_page", str4);
                if (LLJJIJIIJIL3 == null) {
                    LLJJIJIIJIL3 = "";
                }
                bundle2.putString("shoot_enter_from", LLJJIJIIJIL3);
                bundle2.putBoolean("enter_record_from_feed", z);
                if (!TextUtils.isEmpty(LLJJIJIIJIL4)) {
                    bundle2.putString("from_banner_id", LLJJIJIIJIL4);
                }
                bundle2.putInt("is_bundled", intExtra);
                bundle2.putSerializable("extra_related_item", aweme);
                bundle2.putString("extra_owner_id", str7);
                bundle2.putInt("featured_video_source", i2);
                bundle2.putString("prop_page_enter_from", str5);
                bundle2.putString("prop_page_enter_method", str6);
                bundle2.putSerializable("extra_url_icon", urlModel);
                bundle2.putBoolean("extra_open_from_profile_page", bool.booleanValue());
                LJJJIL = new StickerPropDetailFragment();
                LJJJIL.setArguments(bundle2);
            }
            c1b3.LJIIJ(LJJJIL, "sticker_prop_detail_fragment_tag", R.id.bs8);
            c1b3.LJIILJJIL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity", "onCreate", false);
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
