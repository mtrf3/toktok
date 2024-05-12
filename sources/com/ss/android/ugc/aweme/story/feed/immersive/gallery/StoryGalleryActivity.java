package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.ActivityC86117Xqz;
import X.C184077Kh;
import X.C189377bx;
import X.C189757cZ;
import X.C189837ch;
import X.C201037ul;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C221138m5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C78926UyI;
import X.InterfaceC65784Pro;
import X.KR8;
import X.LFH;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGalleryActivity extends ActivityC86117Xqz implements StoryViewerListHostAbility {
    public static Aweme LJLLI;
    public static Aweme LJLLILLLL;
    public final C214298b3 LJLILLLLZI;
    public final C221138m5 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final Aweme LJLJL;
    public final Aweme LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 981));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public StoryGalleryActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(StoryGalleryListViewModel.class);
        this.LJLILLLLZI = new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 983), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C189757cZ.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJI = KR8.LJIIJJI(new AqS153S0100000_3(this, 985));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 979));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 984));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 982));
        this.LJLJL = LJLLI;
        this.LJLJLJ = LJLLILLLL;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 980));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final boolean WR() {
        return ((Boolean) this.LJLJJLL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final C189377bx hL() {
        return (C189377bx) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final Aweme ke0() {
        Aweme aweme = this.LJLJL;
        if (aweme != null) {
            return aweme;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C201037ul.LIZ(1, this, false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C55096Ljo.LJIILL(C55230Lly.LIZLLL(this, null), StoryViewerListHostAbility.class, null);
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

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final Aweme Af0() {
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility
    public final List<StoryInsertUser> Fl0(String str) {
        if (!o.LJ(str, this.LJLJJI.getValue())) {
            return null;
        }
        return (List) this.LJLJJL.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        ((GestureDetector) this.LJLIL.getValue()).onTouchEvent(ev);
        return super.dispatchTouchEvent(ev);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onCreate", true);
        if (!LFH.LIZIZ.LIZLLL().LJFF()) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        setContentView(R.layout.cnz);
        C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(this, null), this, StoryViewerListHostAbility.class, null);
        C201037ul.LIZ(1, this, true);
        if (this.LJLJL == null) {
            C189837ch.LIZJ("StoryGalleryActivity", new RuntimeException("init select story is null"));
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryActivity", "onCreate", false);
    }
}
