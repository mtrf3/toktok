package X;

import Y.AObjectS89S0100000_14;
import android.app.Activity;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WX9 extends AbstractC29891Fh<InterfaceC82353WTt> implements InterfaceC82353WTt, InterfaceC135635Tz, C0IA {
    public static final /* synthetic */ InterfaceC74236TBo[] LJZI;
    public final InterfaceC82353WTt LJLIL;
    public final InterfaceC82086WJm LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final Activity LJLJJI;
    public InterfaceC88472Yns<? super ScaleGestureDetector, OSZ<Boolean, Boolean>> LJLJJL;
    public final CopyOnWriteArrayList<WXL> LJLJJLL;
    public CopyOnWriteArraySet<WXK> LJLJL;
    public Cert LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C40871j1<WXG> LJLLI;
    public final C40871j1<ScaleGestureDetector> LJLLILLLL;
    public final C29901Fi<C39670Fha> LJLLJ;
    public final C29901Fi<Object> LJLLL;
    public final WMH LJLLLL;
    public final C82622Wbi LJLLLLLL;
    public final int LJLZ;
    public final WXM LJZ;

    static {
        TBT tbt = new TBT(WX9.class, "filterSwipeApi", "getFilterSwipeApi()Lcom/bytedance/creativex/recorder/filter/api/FilterSwipeApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt};
    }

    public final WXJ LJJLIIIIJ() {
        return (WXJ) this.LJLJI.LIZ(this, LJZI[0]);
    }

    public final DefaultGesturePresenter LJJLIIIJILLIZJL() {
        return (DefaultGesturePresenter) this.LJLL.getValue();
    }

    public final WXD LJJLIIIJJI() {
        return (WXD) this.LJLJLLL.getValue();
    }

    @Override // X.InterfaceC82353WTt
    public void hf(InterfaceC82354WTu intercept) {
        o.LJIIIZ(intercept, "intercept");
    }

    @Override // X.InterfaceC82353WTt
    public void v30(InterfaceC82354WTu intercept) {
        o.LJIIIZ(intercept, "intercept");
    }

    public final InterfaceC83624Wrs getCameraView() {
        return this.LJLILLLLZI.e8();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        View requireViewById = this.LJLLLL.requireViewById(this.LJLZ);
        o.LJIIIIZZ(requireViewById, "parentScene.requireViewById(gestureLayoutId)");
        LJJLI((WXF) requireViewById);
        this.LJLILLLLZI.QR().LIZIZ(this, new AObjectS89S0100000_14(this, 15));
    }

    @Override // X.InterfaceC82353WTt
    public /* bridge */ /* synthetic */ C0IB G00() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC82353WTt
    public /* bridge */ /* synthetic */ LiveEvent TU() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC82353WTt
    public /* bridge */ /* synthetic */ LiveEvent Vb() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82353WTt getApiComponent() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC82353WTt
    public /* bridge */ /* synthetic */ C0IB lh0() {
        return this.LJLLILLLL;
    }

    private final void LJJLI(WXF wxf) {
        DefaultGesturePresenter LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        LJJLIIIJILLIZJL.getClass();
        if (wxf instanceof WXF) {
            LJJLIIIJILLIZJL.LJLJJLL = wxf;
            wxf.setOnGestureListener(LJJLIIIJILLIZJL);
            LJJLIIIJILLIZJL.LJLJJLL.setOnInterceptListener(LJJLIIIJILLIZJL);
        }
        this.LJLLI.LJI(wxf.getOnGestureListener());
        this.LJLLILLLL.LJI(wxf.getScaleGestureDetector());
    }

    @Override // X.InterfaceC82353WTt
    public void Ef0(WXA listener) {
        o.LJIIIZ(listener, "listener");
        LJJLIIIJILLIZJL().LIZLLL(listener, 1, 100);
    }

    @Override // X.InterfaceC82353WTt
    public void Ge0(WXL interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        if (!this.LJLJJLL.contains(interceptor)) {
            this.LJLJJLL.add(interceptor);
        }
    }

    @Override // X.InterfaceC82353WTt
    public void Ij0(WXK interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LJLJL.add(interceptor);
    }

    @Override // X.InterfaceC82353WTt
    public void KO(WXE listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) LJJLIIIJILLIZJL().LJLILLLLZI).add(listener);
    }

    @Override // X.InterfaceC82353WTt
    public void L6(boolean z) {
        LJJLIIIJILLIZJL().LJLIL = z;
    }

    public final void LJJLIIIJJIZ(Cert doubleClickSwitchCameraCert) {
        o.LJIIIZ(doubleClickSwitchCameraCert, "doubleClickSwitchCameraCert");
        this.LJLJLJ = doubleClickSwitchCameraCert;
    }

    @Override // X.InterfaceC82353WTt
    public boolean Lg(int i) {
        boolean z;
        DefaultGesturePresenter LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        Iterator<HashSet<Integer>> it = LJJLIIIJILLIZJL.LJLJI.values().iterator();
        while (it.hasNext()) {
            it.next().remove(Integer.valueOf(i));
        }
        if (((ConcurrentHashMap) LJJLIIIJILLIZJL.LJLJJI).containsKey(Integer.valueOf(i))) {
            ((ConcurrentHashMap) LJJLIIIJILLIZJL.LJLJJI).put(Integer.valueOf(i), new W15());
            z = true;
        } else {
            z = false;
        }
        LJJLIIIJILLIZJL.LIZJ();
        return z;
    }

    @Override // X.InterfaceC82353WTt
    public WXA Zh(int i) {
        return (WXA) ((ConcurrentHashMap) LJJLIIIJILLIZJL().LJLJJI).get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC82353WTt
    public void dN(InterfaceC88472Yns<? super ScaleGestureDetector, OSZ<Boolean, Boolean>> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC82353WTt
    public void hR(WXL interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LJLJJLL.remove(interceptor);
    }

    @Override // X.InterfaceC82353WTt
    public void jz(WXK interceptor) {
        o.LJIIIZ(interceptor, "interceptor");
        this.LJLJL.remove(interceptor);
    }

    @Override // X.InterfaceC82353WTt
    public void Ik0(WXA listener, int i) {
        o.LJIIIZ(listener, "listener");
        DefaultGesturePresenter gesturePresenter = LJJLIIIJILLIZJL();
        o.LJIIIZ(gesturePresenter, "gesturePresenter");
        gesturePresenter.LIZLLL(listener, i, 100);
    }

    @Override // X.InterfaceC82353WTt
    public void YT(WXA listener, int i) {
        o.LJIIIZ(listener, "listener");
        DefaultGesturePresenter LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        synchronized (LJJLIIIJILLIZJL) {
            LJJLIIIJILLIZJL.LIZLLL(listener, i, 50);
        }
    }

    @Override // X.InterfaceC82353WTt
    public void ID(WXA listener, int i, int i2) {
        o.LJIIIZ(listener, "listener");
        LJJLIIIJILLIZJL().LIZLLL(listener, i, i2);
    }

    public WX9(WMH parentScene, C82622Wbi diContainer, int i, WXM cameraComponentConfig) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(cameraComponentConfig, "cameraComponentConfig");
        this.LJLLLL = parentScene;
        this.LJLLLLLL = diContainer;
        this.LJLZ = i;
        this.LJZ = cameraComponentConfig;
        this.LJLIL = this;
        this.LJLILLLLZI = (InterfaceC82086WJm) getDiContainer().LJ(InterfaceC82086WJm.class, null);
        this.LJLJI = UCI.LJII(getDiContainer(), WXJ.class, null);
        this.LJLJJI = (Activity) getDiContainer().LJ(Activity.class, null);
        this.LJLJJLL = new CopyOnWriteArrayList<>();
        this.LJLJL = new CopyOnWriteArraySet<>();
        this.LJLJLJ = cameraComponentConfig.LIZIZ();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 43));
        this.LJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 42));
        this.LJLLI = new C40871j1<>(null);
        this.LJLLILLLL = new C40871j1<>(null);
        this.LJLLJ = new C29901Fi<>();
        this.LJLLL = new C29901Fi<>();
    }

    public /* synthetic */ WX9(WMH wmh, C82622Wbi c82622Wbi, int i, WXM wxm, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wmh, c82622Wbi, i, (i2 & 8) != 0 ? C83663WsV.LJIIJ : wxm);
    }
}
