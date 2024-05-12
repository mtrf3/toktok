package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity;

import X.AbstractActivityC239069Zu;
import X.C16880lQ;
import X.C188727au;
import X.C19K;
import X.C235119Kp;
import X.C238769Yq;
import X.C238859Yz;
import X.C238869Za;
import X.C238909Ze;
import X.C252709vu;
import X.C26227ARb;
import X.C36636EZk;
import X.C65803Ps7;
import X.C77413UZt;
import X.C78840Uwu;
import X.C9Z3;
import X.SY4;
import X.UC0;
import X.XKX;
import Y.ACListenerS24S0100000_4;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BaAutoReplyEditActivity extends AbstractActivityC239069Zu implements TextWatcher {
    public KeyListener LJLJJL;
    public KeyListener LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final IBaAutoMessageService LJLJI = BaAutoMessageServiceImpl.LJIJ();
    public C9Z3 LJLJJI = new C9Z3(0, "", "", 0);

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onWindowFocusChanged", true);
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

    public static final /* synthetic */ void LLFII(BaAutoReplyEditActivity baAutoReplyEditActivity) {
        super.onBackPressed();
    }

    public static void LLII(BaAutoReplyEditActivity baAutoReplyEditActivity) {
        if (o.LJ(String.valueOf(((C19K) baAutoReplyEditActivity._$_findCachedViewById(R.id.coy)).getText()), baAutoReplyEditActivity.LJLJJI.LIZJ) && o.LJ(String.valueOf(((C19K) baAutoReplyEditActivity._$_findCachedViewById(R.id.cp3)).getText()), baAutoReplyEditActivity.LJLJJI.LIZLLL)) {
            baAutoReplyEditActivity.finish();
            C238909Ze.LIZJ("automsg_keyword_content");
            return;
        }
        C26227ARb LIZIZ = C77413UZt.LIZIZ(baAutoReplyEditActivity);
        LIZIZ.LJII = false;
        LIZIZ.LJ(R.string.ej7);
        LIZIZ.LIZ(R.string.ej8);
        UC0.LIZJ(LIZIZ, new AqS47S0110000_4(false, baAutoReplyEditActivity, 21));
        LIZIZ.LJI().LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLFZ(X.InterfaceC67352kd<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C9Z1
            if (r0 == 0) goto L7b
            r4 = r10
            X.9Z1 r4 = (X.C9Z1) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L69
            if (r0 != r1) goto L81
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity r6 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            r8 = 0
            if (r3 == 0) goto L2e
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L35
        L2d:
            r8 = 1
        L2e:
            r0 = r8 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L35:
            java.util.Iterator r7 = r3.iterator()
        L39:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r5 = r7.next()
            X.9Z3 r5 = (X.C9Z3) r5
            long r3 = r5.LIZ
            X.9Z3 r0 = r6.LJLJJI
            long r1 = r0.LIZ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L39
            java.lang.String r1 = r5.LIZJ
            r0 = 2131366099(0x7f0a10d3, float:1.8352082E38)
            android.view.View r0 = r6._$_findCachedViewById(r0)
            X.19K r0 = (X.C19K) r0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L39
            goto L2e
        L69:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService r0 = r9.LJLJI
            r4.LJLIL = r9
            r4.LJLJJI = r1
            java.lang.Object r3 = r0.LJIIIIZZ(r4)
            if (r3 != r2) goto L79
            return r2
        L79:
            r6 = r9
            goto L22
        L7b:
            X.9Z1 r4 = new X.9Z1
            r4.<init>(r9, r10)
            goto L12
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity.LLFZ(X.2kd):java.lang.Object");
    }

    public final void LLIIIILZ(boolean z) {
        ((SY4) _$_findCachedViewById(R.id.b22)).setEnabled(z);
        ((SY4) _$_findCachedViewById(R.id.b2e)).setEnabled(z);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null) {
            return;
        }
        XKX.LIZLLL(this, C36636EZk.LIZ, null, new C238769Yq(this, null), 2);
    }

    @Override // X.AbstractActivityC239069Zu, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(32);
        setContentView(R.layout.cjq);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.hm5);
        o.LJIIIIZZ(string, "getString(R.string.keyword_auto_reply)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(this, 66));
        c252709vu.setNavActions(c235119Kp);
        KeyListener keyListener = ((TextView) _$_findCachedViewById(R.id.coy)).getKeyListener();
        o.LJIIIIZZ(keyListener, "edit_keyword.keyListener");
        this.LJLJJL = keyListener;
        KeyListener keyListener2 = ((TextView) _$_findCachedViewById(R.id.cp3)).getKeyListener();
        o.LJIIIIZZ(keyListener2, "edit_message.keyListener");
        this.LJLJJLL = keyListener2;
        _$_findCachedViewById(R.id.b2e).setActivated(true);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.b2e), new ACListenerS24S0100000_4(this, 28));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.b22), new ACListenerS24S0100000_4(this, 29));
        ((TextView) _$_findCachedViewById(R.id.coy)).addTextChangedListener(this);
        ((TextView) _$_findCachedViewById(R.id.cp3)).addTextChangedListener(this);
        long longExtra = getIntent().getLongExtra("mid", 0L);
        XKX.LIZLLL(this, null, null, new C238859Yz(longExtra, this, null), 3);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enterFrom");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        if (longExtra == 0) {
            C238869Za eventSender = C238869Za.LJLIL;
            o.LJIIIZ(eventSender, "eventSender");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", LLJJIJIIJIL);
            Map<String, String> map = c188727au.LIZ;
            o.LJIIIIZZ(map, "newBuilder()\n           …m)\n            .builder()");
            eventSender.invoke("add_auto_reply_keyword", map);
        } else {
            C238909Ze.LJI(LLJJIJIIJIL, 2, null, 12);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity", "onCreate", false);
    }
}
