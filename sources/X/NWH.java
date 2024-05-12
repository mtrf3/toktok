package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer$provideActivityDelegate$1;
import com.ss.android.ugc.aweme.bullet.module.base.CommonBizActivityDelegate;
import com.ss.android.ugc.aweme.bullet.module.base.ui.BulletWebViewTouchDelegate;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class NWH extends C60193Njp {
    public static final /* synthetic */ int LLIIIJ = 0;
    public BulletWebViewTouchDelegate LLFF;
    public InterfaceC59505NWz LLFFF;
    public C59451NUx LLFII;
    public Activity LLFZ;
    public C59614NaU LLI;
    public LifecycleOwner LLIFFJFJJ;
    public java.util.Map<String, String> LLII;
    public View LLIIII;
    public final java.util.Map<Integer, View> LLIIIILZ;

    @Override // X.C60193Njp
    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LLIIIILZ;
        Integer valueOf = Integer.valueOf(R.id.b0v);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.b0v);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C60193Njp, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C60193Njp, X.InterfaceC37788EsK
    public final void release() {
        BaseCommonBizRootContainer$provideActivityDelegate$1 baseCommonBizRootContainer$provideActivityDelegate$1;
        super.release();
        LifecycleOwner lifecycleOwner = this.LLIFFJFJJ;
        if (lifecycleOwner != null) {
            C59451NUx c59451NUx = this.LLFII;
            if (c59451NUx != null) {
                baseCommonBizRootContainer$provideActivityDelegate$1 = new BaseCommonBizRootContainer$provideActivityDelegate$1(c59451NUx);
            } else {
                baseCommonBizRootContainer$provideActivityDelegate$1 = null;
            }
            if ((baseCommonBizRootContainer$provideActivityDelegate$1 instanceof CommonBizActivityDelegate) && baseCommonBizRootContainer$provideActivityDelegate$1 != null) {
                lifecycleOwner.getLifecycle().removeObserver(baseCommonBizRootContainer$provideActivityDelegate$1);
                baseCommonBizRootContainer$provideActivityDelegate$1.LJLIL = null;
            }
        }
    }

    public final Activity getActivity() {
        return this.LLFZ;
    }

    public final C59451NUx getRootContainer() {
        return this.LLFII;
    }

    public final InterfaceC59505NWz getScrollListener() {
        return this.LLFFF;
    }

    public final C59614NaU getWebView() {
        return this.LLI;
    }

    @Override // X.C60193Njp
    public final void LIZLLL(InterfaceC59504NWy coreProvider) {
        o.LJIIIZ(coreProvider, "coreProvider");
        super.LIZLLL(coreProvider);
    }

    @QD3
    public final void onJsBroadcast(C59231NMl event) {
        o.LJIIIZ(event, "event");
        BulletWebViewTouchDelegate bulletWebViewTouchDelegate = this.LLFF;
        if (bulletWebViewTouchDelegate != null) {
            bulletWebViewTouchDelegate.LIZJ(event);
        }
    }

    public final void setActivity(Activity activity) {
        this.LLFZ = activity;
    }

    public final void setCanScrollVertically(boolean z) {
        BulletWebViewTouchDelegate bulletWebViewTouchDelegate = this.LLFF;
        if (bulletWebViewTouchDelegate == null) {
            return;
        }
        bulletWebViewTouchDelegate.LIZIZ = z;
    }

    public final void setEnableScrollControl(boolean z) {
        BulletWebViewTouchDelegate bulletWebViewTouchDelegate = this.LLFF;
        if (bulletWebViewTouchDelegate == null) {
            return;
        }
        bulletWebViewTouchDelegate.LIZJ = z;
    }

    public final void setIsAutoReleasableWhenDetached(boolean z) {
        setAutoReleasableWhenDetached(z);
    }

    public final void setOutTouchDelegate(View.OnTouchListener onTouchListener) {
        BulletWebViewTouchDelegate bulletWebViewTouchDelegate = this.LLFF;
        if (bulletWebViewTouchDelegate == null) {
            return;
        }
        bulletWebViewTouchDelegate.LIZLLL = onTouchListener;
    }

    public final void setRootContainer(C59451NUx c59451NUx) {
        this.LLFII = c59451NUx;
    }

    public final void setScrollListener(InterfaceC59505NWz interfaceC59505NWz) {
        this.LLFFF = interfaceC59505NWz;
    }

    public final void setWebView(C59614NaU c59614NaU) {
        this.LLI = c59614NaU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NWH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIIIILZ = C62850Ola.LJFF(context, "context");
        setAutoReleasableWhenDetached(true);
    }

    @Override // X.C60193Njp, X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(param, "param");
        super.gk(instance, uri, param);
        C59451NUx c59451NUx = this.LLFII;
        if (c59451NUx != null) {
            c59451NUx.gk(instance, uri, param);
        }
    }

    @Override // X.C60193Njp, X.InterfaceC60057Nhd
    public final void t(android.net.Uri uri, Bundle bundle, InterfaceC60172NjU interfaceC60172NjU) {
        o.LJIIIZ(uri, "uri");
        if (this.LLIIII == null) {
            IBulletService LIZ = BulletService.LIZ();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            View LJIIJJI = LIZ.LJIIJJI(context);
            n8(LJIIJJI, 17, 0, 0, 0, 0);
            this.LLIIII = LJIIJJI;
        }
        super.t(uri, bundle, interfaceC60172NjU);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL(InterfaceC59504NWy coreProvider, C59458NVe c59458NVe, BulletActivityWrapper bulletActivityWrapper, LifecycleOwner lifecycleOwner) {
        C60219NkF c60219NkF;
        InterfaceC60179Njb interfaceC60179Njb;
        C59451NUx c59451NUx;
        F3T LLIIIILZ;
        NX1 nx1;
        AqS176S0100000_10 LIZ;
        o.LJIIIZ(coreProvider, "coreProvider");
        LIZLLL(coreProvider);
        InterfaceC60196Njs LIZ2 = coreProvider.LIZ();
        Activity activity = null;
        if ((LIZ2 instanceof C60219NkF) && (c60219NkF = (C60219NkF) LIZ2) != null) {
            InterfaceC60247Nkh interfaceC60247Nkh = c60219NkF.LJLL.get("ad_commerce");
            if (interfaceC60247Nkh != null && (LLIIIILZ = interfaceC60247Nkh.LLIIIILZ()) != null && (nx1 = (NX1) LLIIIILZ.LIZJ(NX1.class)) != null && (LIZ = nx1.LIZ()) != null) {
                interfaceC60179Njb = (InterfaceC60179Njb) LIZ.invoke(c60219NkF.LJLJJL);
            } else {
                interfaceC60179Njb = null;
            }
            if (interfaceC60179Njb instanceof C59451NUx) {
                c59451NUx = (C59451NUx) interfaceC60179Njb;
            } else {
                c59451NUx = null;
            }
            this.LLFII = c59451NUx;
            if (c59451NUx != null) {
                c59451NUx.LLF = c59458NVe;
            }
        }
        this.LLIFFJFJJ = lifecycleOwner;
        setActivityWrapper(bulletActivityWrapper);
        Activity activity2 = bulletActivityWrapper.getActivity();
        if (activity2 != 0) {
            if ((activity2 instanceof LifecycleOwner) && this.LLIFFJFJJ == null) {
                this.LLIFFJFJJ = (LifecycleOwner) activity2;
            }
            C59451NUx c59451NUx2 = this.LLFII;
            if (c59451NUx2 != null) {
                c59451NUx2.LJLZ = activity2;
                c59451NUx2.LJLILLLLZI.LJIIIIZZ(activity2);
            }
            activity = activity2;
        }
        this.LLFZ = activity;
        C59451NUx c59451NUx3 = this.LLFII;
        if (c59451NUx3 != null) {
            F3T providerFactory = getProviderFactory();
            providerFactory.getClass();
            providerFactory.LJ(InterfaceC60179Njb.class, new F26(c59451NUx3));
        }
        C59451NUx c59451NUx4 = this.LLFII;
        if (c59451NUx4 != null) {
            BaseCommonBizRootContainer$provideActivityDelegate$1 baseCommonBizRootContainer$provideActivityDelegate$1 = new BaseCommonBizRootContainer$provideActivityDelegate$1(c59451NUx4);
            LifecycleOwner lifecycleOwner2 = this.LLIFFJFJJ;
            if (lifecycleOwner2 != null) {
                baseCommonBizRootContainer$provideActivityDelegate$1.LJLIL = this.LLFZ;
                lifecycleOwner2.getLifecycle().addObserver(baseCommonBizRootContainer$provideActivityDelegate$1);
            }
            bulletActivityWrapper.LIZ(baseCommonBizRootContainer$provideActivityDelegate$1);
        }
    }

    @Override // X.C60193Njp, X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        C59614NaU c59614NaU;
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        super.LLIIL(viewComponents, uri, instance, z);
        if (instance instanceof NUX) {
            NUX nux = (NUX) instance;
            nux.Nf(this.LLII);
            WebView view = nux.getView();
            C59614NaU c59614NaU2 = null;
            if ((view instanceof C59614NaU) && (c59614NaU = (C59614NaU) view) != null) {
                c59614NaU.setWebScrollListener(new C59487NWh(this));
                BulletWebViewTouchDelegate bulletWebViewTouchDelegate = new BulletWebViewTouchDelegate(c59614NaU);
                this.LLFF = bulletWebViewTouchDelegate;
                c59614NaU.setWebViewEventDelegate(bulletWebViewTouchDelegate);
                C58909NAb.LIZ.getClass();
                InterfaceC59440NUm LIZ = NH3.LIZ();
                if (LIZ != null) {
                    ((NTF) LIZ).LIZJ(this.LLFII, c59614NaU);
                }
                c59614NaU2 = c59614NaU;
            }
            this.LLI = c59614NaU2;
        }
    }

    @Override // X.C60193Njp, X.InterfaceC60057Nhd
    public final void n8(View loadingView, int i, int i2, int i3, int i4, int i5) {
        o.LJIIIZ(loadingView, "loadingView");
        this.LLIIII = loadingView;
        super.n8(loadingView, i, i2, i3, i4, i5);
    }
}
