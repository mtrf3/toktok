package com.ss.android.ugc.aweme.kids.homepage.ui;

import X.ActivityC86117Xqz;
import X.C0NY;
import X.C10K;
import X.C198517qh;
import X.C1B3;
import X.C221108m2;
import X.C25995AId;
import X.C26045AKb;
import X.C2U8;
import X.C38995FSd;
import X.C39398FdC;
import X.C41212GFk;
import X.C43205GxV;
import X.C58140Mro;
import X.C58141Mrp;
import X.C58142Mrq;
import X.C58151Mrz;
import X.C58278Mu2;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C65803Ps7;
import X.EnumC2323399x;
import X.InterfaceC36571c5;
import X.MD0;
import X.O69;
import X.O6A;
import X.O6B;
import X.O6D;
import X.QD3;
import X.X1D;
import Y.AgS125S0100000_8;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class KidsMainActivity extends ActivityC86117Xqz {
    public String LJLJI;
    public long LJLJJI;
    public int LJLJJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C58151Mrz.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 252));
    public final AtomicBoolean LJLJJL = new AtomicBoolean(false);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C58278Mu2.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C58142Mrq.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C58140Mro.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C58141Mrp.LJLIL);

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLFII() {
        boolean z;
        int i;
        if (o.LJ(this.LJLJI, "homepage_hot") || o.LJ(this.LJLJI, "tab_draft")) {
            z = true;
            i = R.attr.d4;
        } else {
            z = false;
            i = R.attr.cl;
        }
        C61713OJx LIZJ = C61712OJw.LIZJ(this);
        LIZJ.LJII(i);
        LIZJ.LJ(i);
        LIZJ.LIZIZ.LJIIJ(!z);
        LIZJ.LIZJ();
    }

    @Override // android.app.Activity
    public final FragmentManager getFragmentManager() {
        return (FragmentManager) this.LJLILLLLZI.getValue();
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getFragmentManager().LJJJJIZL() > 0) {
            getFragmentManager().LJJLIIIJJI();
            this.LJLJI = "personal_homepage";
            ((O6D) _$_findCachedViewById(R.id.e6c)).LIZ(this.LJLJI);
        } else if (System.currentTimeMillis() - this.LJLJJI <= 2000) {
            finish();
            this.LJLJJI = 0L;
        } else {
            this.LJLJJI = System.currentTimeMillis();
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.c39);
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) this.LJLIL.getValue();
        ReceiverRegisterLancet.loge(broadcastReceiver, false);
        unregisterReceiver(broadcastReceiver);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        O6B o6b;
        C65803Ps7.LIZJ(this);
        super.onPause();
        if (o.LJ(this.LJLJI, "homepage_hot")) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) this.LJLJL.getValue();
            if ((interfaceC36571c5 instanceof O6B) && (o6b = (O6B) interfaceC36571c5) != null) {
                o6b.vf(false);
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        Long l;
        O6B o6b;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onResume", true);
        super.onResume();
        String str = "homepage_hot";
        if (this.LJLJJLL == 0 && o.LJ(this.LJLJI, "homepage_hot")) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) this.LJLJL.getValue();
            if ((interfaceC36571c5 instanceof O6B) && (o6b = (O6B) interfaceC36571c5) != null) {
                o6b.b5(false);
            }
        }
        if (this.LJLJJLL != 0) {
            O6D o6d = (O6D) _$_findCachedViewById(R.id.e6c);
            int i = this.LJLJJLL;
            if (i != 0) {
                if (i != 1) {
                    if (i != 3) {
                        if (i == 4) {
                            str = "personal_homepage";
                        } else {
                            throw new IllegalArgumentException(C0NY.LIZIZ("page index [", i, "] is not support"));
                        }
                    } else {
                        str = "liked";
                    }
                } else {
                    str = "discovery";
                }
            }
            o6d.setCurrentTab(str);
        }
        if (this.LJLJJL.compareAndSet(false, true)) {
            C10K.LJII(1800L).LJI(new AgS125S0100000_8(this, 3), C38995FSd.LIZIZ(), null);
        }
        if (MD0.LIZ != null && (l = MD0.LIZIZ) != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            C198517qh c198517qh = new C198517qh();
            String lowerCase = String.valueOf(MD0.LIZ).toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            c198517qh.LIZ.put("type", lowerCase);
            c198517qh.LIZ.put("duration", String.valueOf(currentTimeMillis));
            JSONObject LJ = c198517qh.LJ();
            C39398FdC.LIZ.getClass();
            C39398FdC.LIZIZ("kids_app_launch", LJ);
        }
        MD0.LIZ = null;
        MD0.LIZIZ = null;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onResume", false);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public final Fragment Ja(String str) {
        switch (str.hashCode()) {
            case -562830579:
                if (str.equals("personal_homepage")) {
                    return (Fragment) this.LJLL.getValue();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                LIZ.append(str);
                LIZ.append("] is not support");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            case -121207376:
                if (str.equals("discovery")) {
                    return (Fragment) this.LJLJLJ.getValue();
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('[');
                LIZ2.append(str);
                LIZ2.append("] is not support");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            case 102974381:
                if (str.equals("liked")) {
                    return (Fragment) this.LJLJLLL.getValue();
                }
                StringBuilder LIZ22 = X1D.LIZ();
                LIZ22.append('[');
                LIZ22.append(str);
                LIZ22.append("] is not support");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ22));
            case 1691937916:
                if (str.equals("homepage_hot")) {
                    return (Fragment) this.LJLJL.getValue();
                }
                StringBuilder LIZ222 = X1D.LIZ();
                LIZ222.append('[');
                LIZ222.append(str);
                LIZ222.append("] is not support");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ222));
            default:
                StringBuilder LIZ2222 = X1D.LIZ();
                LIZ2222.append('[');
                LIZ2222.append(str);
                LIZ2222.append("] is not support");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2222));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onClickDraftEvent(C25995AId event) {
        o.LJIIIZ(event, "event");
        this.LJLJI = "tab_draft";
        LLFII();
        ((O6D) _$_findCachedViewById(R.id.e6c)).LIZ(this.LJLJI);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onCreate", true);
        activityConfiguration(C41212GFk.LJLIL);
        super.onCreate(bundle);
        if (MD0.LIZ == null) {
            MD0.LIZ = EnumC2323399x.WARM;
            MD0.LIZIZ = Long.valueOf(System.currentTimeMillis());
        }
        getWindow().clearFlags(1024);
        setContentView(R.layout.bfw);
        this.LJLJJLL = getIntent().getIntExtra("key_init_page_index", 0);
        EventBus.LIZJ().LJIILJJIL(this);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.getClass();
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIIIZZ(R.id.bs8, 1, (Fragment) this.LJLJL.getValue(), "homepage_hot");
        c1b3.LJIILJJIL();
        this.LJLJI = "homepage_hot";
        LLFII();
        AppWidgetServiceImpl.LJIJI().LIZIZ(this);
        ((O6D) _$_findCachedViewById(R.id.e6c)).setTabSelectListener(new O69(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) this.LJLIL.getValue();
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                ReceiverRegisterLancet.initHandler();
                registerReceiver(broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
            } else {
                registerReceiver(broadcastReceiver, intentFilter);
            }
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            } else {
                throw e;
            }
        }
        this.LJLJJL.set(false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDestroyDraftEvent(C43205GxV event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(this.LJLJI, "tab_draft")) {
            this.LJLJI = "personal_homepage";
        }
        LLFII();
        ((O6D) _$_findCachedViewById(R.id.e6c)).LIZ(this.LJLJI);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i != 24 && i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            z = true;
        } else {
            z = false;
        }
        C2U8.LIZ(new O6A(z));
        return true;
    }
}
