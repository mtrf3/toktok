package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.activity;

import X.AbstractC90763hI;
import X.ActivityC86117Xqz;
import X.AnonymousClass636;
import X.C107794Kx;
import X.C26045AKb;
import X.C40C;
import X.C41136GCm;
import X.C4NO;
import X.C63088OpQ;
import X.C63120Opw;
import X.C65803Ps7;
import X.C81273Gx;
import X.C84283Sm;
import X.C8VV;
import X.C95383ok;
import X.C95573p3;
import X.C95833pT;
import X.C98563ts;
import X.QD3;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupChatDetailActivity extends ActivityC86117Xqz {
    public C95573p3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.group.activity.GroupChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        C98563ts c98563ts;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        C63088OpQ coreInfo;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.group.activity.GroupChatDetailActivity", "onCreate", true);
        activityConfiguration(C41136GCm.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.b0f);
        C4NO.LIZ(this);
        Serializable serializableExtra = getIntent().getSerializableExtra("key_session_info");
        if (serializableExtra instanceof C98563ts) {
            c98563ts = (C98563ts) serializableExtra;
        } else {
            c98563ts = null;
        }
        if (c98563ts == null) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.group.activity.GroupChatDetailActivity", "onCreate", false);
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_from_out_push", false);
        AbstractC90763hI LIZ = C81273Gx.LIZ(c98563ts.getConversationId());
        C63120Opw LIZLLL = LIZ.LIZLLL();
        if (LIZLLL != null) {
            j = LIZLLL.getConversationShortId();
        } else {
            j = 0;
        }
        C63120Opw LIZLLL2 = LIZ.LIZLLL();
        if (LIZLLL2 != null && LIZLLL2.isMute()) {
            z = true;
        } else {
            z = false;
        }
        C63120Opw LIZLLL3 = LIZ.LIZLLL();
        if (LIZLLL3 != null && LIZLLL3.isStickTop()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = (Boolean) ((HashMap) C40C.LIZ).get(Long.valueOf(j));
        if (bool != null) {
            z3 = bool.booleanValue();
        } else {
            z3 = true;
        }
        C63120Opw LIZLLL4 = LIZ.LIZLLL();
        if (LIZLLL4 == null || (coreInfo = LIZLLL4.getCoreInfo()) == null || (str = coreInfo.getName()) == null) {
            str = "";
        }
        this.LJLIL = new C95573p3(c98563ts, LIZ, new C95383ok(z, z2, new C95833pT(8, str, C84283Sm.LJIIIZ(c98563ts.getConversationId())), z3, 97), booleanExtra);
        C8VV.LIZIZ(this, new AqS167S0100000_1(this, 144));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.group.activity.GroupChatDetailActivity", "onCreate", false);
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.gvi);
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJI(AnonymousClass636.LJIIIIZZ(R.attr.e8, this));
        c26045AKb.LJIIJ();
    }
}
