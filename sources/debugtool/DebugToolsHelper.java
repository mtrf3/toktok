package debugtool;

import X.C0NB;
import X.C16880lQ;
import X.C24740y6;
import X.C31195CMd;
import X.C31199CMh;
import X.C31200CMi;
import X.C38113ExZ;
import X.C76800UCe;
import X.CGG;
import X.CMK;
import X.CMM;
import X.CMZ;
import X.InterfaceC31193CMb;
import X.InterfaceC31194CMc;
import X.InterfaceC65784Pro;
import X.X1D;
import Y.AObjectS42S0101000_5;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.dataChannel.LiveFragmentVisibility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.play.core.appupdate.h;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public class DebugToolsHelper implements GenericLifecycleObserver {
    public final DataChannel LJLIL;
    public final Context LJLILLLLZI;
    public InterfaceC31194CMc LJLJI;
    public final CGG LJLJJI;
    public h LJLJJL;

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    public final InterfaceC65784Pro<C76800UCe> LIZ() {
        InterfaceC31194CMc interfaceC31194CMc = this.LJLJI;
        if (interfaceC31194CMc != null) {
            return interfaceC31194CMc.x3();
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        InterfaceC31194CMc interfaceC31194CMc;
        boolean z;
        InterfaceC31194CMc interfaceC31194CMc2 = this.LJLJI;
        if (interfaceC31194CMc2 != null) {
            interfaceC31194CMc2.LJII();
        }
        try {
            interfaceC31194CMc = (InterfaceC31194CMc) Class.forName("com.bytedance.android.livesdk.gift.debugservice.DebugToolInitServiceManager").getConstructor(Context.class, CGG.class).newInstance(this.LJLILLLLZI, this.LJLJJI);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createDebugService. exception=");
            LIZ.append(e.getMessage());
            C0NB.LJ("DebugToolsHelper", X1D.LIZIZ(LIZ));
            C16880lQ.LLLLIIL(e);
            interfaceC31194CMc = null;
        }
        this.LJLJI = interfaceC31194CMc;
        if (interfaceC31194CMc != null) {
            z = true;
            if (interfaceC31194CMc.LJIIL()) {
                InterfaceC31194CMc interfaceC31194CMc3 = this.LJLJI;
                LIZIZ(interfaceC31194CMc3, this.LJLILLLLZI, this.LJLIL);
                interfaceC31194CMc3.LJIIJJI();
                InterfaceC31193CMb LJI = interfaceC31194CMc3.LJI();
                if (LJI != null) {
                    this.LJLJJL = new h(LJI);
                    return;
                }
                return;
            }
        } else {
            z = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onCreate. init failed. serviceNotNull=");
        LIZ2.append(z);
        LIZ2.append("; enable=false");
        C0NB.LJ("DebugToolsHelper", X1D.LIZIZ(LIZ2));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        InterfaceC31194CMc interfaceC31194CMc = this.LJLJI;
        if (interfaceC31194CMc != null) {
            interfaceC31194CMc.LJII();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        InterfaceC31194CMc interfaceC31194CMc = this.LJLJI;
        if (interfaceC31194CMc != null) {
            interfaceC31194CMc.onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        InterfaceC31194CMc interfaceC31194CMc = this.LJLJI;
        if (interfaceC31194CMc != null) {
            interfaceC31194CMc.onResume();
        }
    }

    public final void LIZJ(C38113ExZ c38113ExZ) {
        InterfaceC31194CMc interfaceC31194CMc = this.LJLJI;
        if (interfaceC31194CMc != null) {
            interfaceC31194CMc.LIZLLL();
        }
    }

    public final void LIZLLL(C31200CMi c31200CMi) {
        InterfaceC31194CMc interfaceC31194CMc = this.LJLJI;
        if (interfaceC31194CMc != null) {
            interfaceC31194CMc.LJIIJ();
        }
    }

    public DebugToolsHelper(Context context, DataChannel dataChannel, CGG cgg) {
        this.LJLILLLLZI = context;
        this.LJLIL = dataChannel;
        this.LJLJJI = cgg;
        LifecycleOwner lifecycleOwner = dataChannel.LJLJJI;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        dataChannel.ov0(dataChannel.LJLJJI, LiveFragmentVisibility.class, new AObjectS42S0101000_5(6, this, 35));
    }

    public static void LIZIZ(InterfaceC31194CMc interfaceC31194CMc, Context context, DataChannel dataChannel) {
        C16880lQ.LLLLL(context);
        interfaceC31194CMc.initLynxEnv();
        new C31195CMd(context, dataChannel);
        interfaceC31194CMc.LIZIZ();
        new CMM(context, dataChannel);
        interfaceC31194CMc.LJIILL();
        new C24740y6(context);
        interfaceC31194CMc.LIZJ();
        interfaceC31194CMc.LJIILJJIL();
        new CMK(context, dataChannel);
        interfaceC31194CMc.LIZ();
        new C31199CMh(context, dataChannel);
        interfaceC31194CMc.LJ();
        new CMZ(context);
        interfaceC31194CMc.LJIIIZ();
        interfaceC31194CMc.LJFF();
    }
}
