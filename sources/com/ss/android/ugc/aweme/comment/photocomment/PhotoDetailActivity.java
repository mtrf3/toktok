package com.ss.android.ugc.aweme.comment.photocomment;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73305Spp;
import X.C78928UyK;
import X.C78939UyV;
import X.EnumC72807Shn;
import X.FMX;
import X.InterfaceC70769Rq1;
import X.LTT;
import X.SIR;
import X.W5F;
import X.W5U;
import Y.ACListenerS23S0100000_3;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PhotoDetailActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLLI = 0;
    public List<? extends UrlModel> LJLIL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, UserLevelGeckoUpdateSetting.DEFAULT));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 141));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 137));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 138));
    public long LJLJJLL = -1;
    public String LJLJL = "";
    public String LJLJLJ = "";
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 139));

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C73305Spp LLFII() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        if (this.LJLJJLL > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJJLL;
            String str = this.LJLJL;
            String str2 = this.LJLJLJ;
            C188727au LIZ = C78928UyK.LIZ(str, "enterFrom", str2, "source");
            LIZ.LJIIIZ("enter_from", str);
            LIZ.LJIIIZ("source", str2);
            LIZ.LJ(currentTimeMillis, "duration");
            FMX.LJIIL("full_screen_view_photo_duration", LIZ.LIZ);
        }
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
        UrlModel urlModel;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.p1);
        LTT.LIZJ(this);
        this.LJLIL = (List) getIntent().getSerializableExtra("image_uri");
        getIntent().getIntExtra("request_code", -1);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLJL = LLJJIJIIJIL;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "source");
        if (LLJJIJIIJIL2 != null) {
            str = LLJJIJIIJIL2;
        }
        this.LJLJLJ = str;
        List<? extends UrlModel> list = this.LJLIL;
        if (list != null) {
            urlModel = (UrlModel) ListProtector.get(list, 0);
        } else {
            urlModel = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJIJJ = EnumC72807Shn.FIT_CENTER;
        LJII.LIZIZ("PhotoDetailActivity");
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-imageView>(...)");
        LJII.LJJIIJ = (SmartImageView) value;
        LJII.LJJIZ = new SIR() { // from class: X.7Vr
            @Override // X.SIR
            public final /* synthetic */ void LIZ(JSONObject jSONObject) {
            }

            @Override // X.SIR
            public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str2, boolean z) {
                UrlModel urlModel2;
                UrlModel urlModel3;
                if (z) {
                    List<? extends UrlModel> list2 = PhotoDetailActivity.this.LJLIL;
                    if (list2 != null && (urlModel3 = (UrlModel) ORZ.LJLLLLLL(0, list2)) != null) {
                        Y89.LIZJ(1, String.valueOf(urlModel3.hashCode()));
                        return;
                    }
                    return;
                }
                List<? extends UrlModel> list3 = PhotoDetailActivity.this.LJLIL;
                if (list3 == null || (urlModel2 = (UrlModel) ORZ.LJLLLLLL(0, list3)) == null) {
                    return;
                }
                Y89.LIZJ(0, String.valueOf(urlModel2.hashCode()));
            }
        };
        LJII.LJFF((InterfaceC70769Rq1) this.LJLJLLL.getValue());
        setResult(101);
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.j83), new ACListenerS23S0100000_3(this, 24));
        Object value2 = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value2, "<get-imageView>(...)");
        C16880lQ.LJJIJLIJ((SmartImageView) value2, new ACListenerS23S0100000_3(this, 25));
        Object value3 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value3, "<get-backIcon>(...)");
        C16880lQ.LJJJ((TuxIconView) value3, new ACListenerS23S0100000_3(this, 26));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.comment.photocomment.PhotoDetailActivity", "onCreate", false);
    }
}
