package X;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ump, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78215Ump extends FrameLayout implements GenericLifecycleObserver, InterfaceC40159FpT, InterfaceC72822Si2, Handler.Callback {
    public static final Integer[] LJLLLLLL = {100, 102, 103, 104};
    public final O99 LJLIL;
    public C78181UmH LJLILLLLZI;
    public boolean LJLJI;
    public O98 LJLJJI;
    public O93 LJLJJL;
    public InterfaceC38239Ezb LJLJJLL;
    public SparkContext LJLJL;
    public String LJLJLJ;
    public C78239UnD LJLJLLL;
    public C60825Nu1 LJLL;
    public C78240UnE LJLLI;
    public boolean LJLLILLLL;
    public C78216Umq LJLLJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLLL;
    public final Handler LJLLLL;

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
        C32444CoK.LIZLLL(null, "LynxCall,lynx closed");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.NV7
    public final void refresh() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC78206Umg interfaceC78206Umg;
        C78216Umq c78216Umq;
        C78217Umr c78217Umr;
        if (this.LJLLLL.hasMessages(1002) && (c78216Umq = this.LJLLJ) != null && (c78217Umr = c78216Umq.LIZJ.LJIIJJI) != null) {
            interfaceC78206Umg = c78217Umr.LJIIJJI;
        } else {
            interfaceC78206Umg = null;
        }
        LIZ(true);
        C78163Ulz c78163Ulz = new C78163Ulz(-27, (String) null, 6);
        C78165Um1 c78165Um1 = new C78165Um1();
        c78165Um1.LIZ = this.LJLJI;
        c78163Ulz.LIZLLL = c78165Um1;
        if (interfaceC78206Umg != null) {
            interfaceC78206Umg.LJFF(EnumC78220Umu.LYNX, c78163Ulz);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onHide();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onShow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onDestroy();
    }

    public final void LIZ(boolean z) {
        this.LJLLLL.removeMessages(1001);
        this.LJLLLL.removeMessages(1002);
        this.LJLLLL.removeMessages(1003);
        C78181UmH c78181UmH = this.LJLILLLLZI;
        if (c78181UmH != null) {
            c78181UmH.LIZIZ();
        }
        this.LJLILLLLZI = null;
        if (z) {
            C32444CoK.LIZ(null, "LynxCall release#destroyLynxView");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.removeAllViews();
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                this.LJLLL = null;
            }
            this.LJLJL = null;
            C60825Nu1 c60825Nu1 = this.LJLL;
            if (c60825Nu1 != null) {
                c60825Nu1.LJLJI = true;
                this.LJLL = null;
            }
            this.LJLJJL = null;
            C78240UnE c78240UnE = this.LJLLI;
            if (c78240UnE != null) {
                c78240UnE.LJLILLLLZI = true;
                this.LJLLI = null;
            }
            C78239UnD c78239UnD = this.LJLJLLL;
            if (c78239UnD != null) {
                c78239UnD.LJLILLLLZI = true;
                C72818Shy.LJII("lynx_gift_on_ready", c78239UnD);
                C72818Shy.LJII("lynx_gift_on_completion", c78239UnD);
                C72818Shy.LJII("lynx_gift_on_error", c78239UnD);
                this.LJLJLLL = null;
            }
        }
        setVisibility(8);
        this.LJLLJ = null;
        this.LJLJJLL = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLLILLLL && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000d, code lost:
    
        return false;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            int r0 = r5.what
            r3 = 0
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1001: goto L27;
                case 1002: goto L12;
                case 1003: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            r4.LIZ(r1)
            goto Ld
        L12:
            X.Umq r0 = r4.LJLLJ
            if (r0 == 0) goto L1e
            X.CoP r0 = r0.LIZJ
            X.Umr r0 = r0.LJIIJJI
            if (r0 == 0) goto L1e
            X.Pro<X.UCe> r3 = r0.LJIIIZ
        L1e:
            r4.LIZ(r2)
            if (r3 == 0) goto Ld
            r3.invoke()
            goto Ld
        L27:
            X.Umq r0 = r4.LJLLJ
            if (r0 == 0) goto L33
            X.CoP r0 = r0.LIZJ
            X.Umr r0 = r0.LJIIJJI
            if (r0 == 0) goto L33
            X.Ynr<? super java.lang.Integer, ? super java.lang.String, X.UCe> r3 = r0.LJIIIIZZ
        L33:
            r4.LIZ(r1)
            if (r3 == 0) goto Ld
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "fe lynx ready timeout"
            r3.invoke(r1, r0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78215Ump.handleMessage(android.os.Message):boolean");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        C32257ClJ.LJIIIIZZ(new AqS160S0200000_13(c199097rd, this, 18));
    }

    public final void setBridgeRegistry$livegift_lynx_release(InterfaceC38239Ezb bridgeRegistry) {
        o.LJIIIZ(bridgeRegistry, "bridgeRegistry");
        this.LJLJJLL = bridgeRegistry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78215Ump(Context context, O99 lynxContainerCreator) {
        super(context);
        o.LJIIIZ(lynxContainerCreator, "lynxContainerCreator");
        new LinkedHashMap();
        this.LJLIL = lynxContainerCreator;
        this.LJLLLL = new Handler(C16880lQ.LLJJJJ(), this);
        ActivityC45651qj LIZ = C32257ClJ.LIZ(context);
        if (LIZ != null) {
            LIZ.getLifecycle().addObserver(this);
        }
    }
}
