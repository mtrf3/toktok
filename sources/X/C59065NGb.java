package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NGb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59065NGb extends AbstractC59064NGa {
    public final IAdHybridCustomLoader LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC59064NGa
    public final void LJFF() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.close();
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJII() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.destroy();
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIIZ() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.onHide();
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIJJI() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.onShowSuccess();
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIJ() {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.releaseCache();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59065NGb(C59066NGc option) {
        super(option);
        Object obj;
        Class<?> cls;
        Class<? extends U> asSubclass;
        IAdHybridCustomLoader iAdHybridCustomLoader;
        o.LJIIIZ(option, "option");
        this.LIZJ = "AdHybridContainerDefaultImpl";
        NGT.LIZ.getClass();
        IAdHybridCustomLoader iAdHybridCustomLoader2 = null;
        try {
            NGU.LIZ.getClass();
            java.util.Map<?, ?> map = NGU.LIZJ;
            if (map != null) {
                obj = map.get(option.LJLILLLLZI.name());
            } else {
                obj = null;
            }
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("createContainer: containerClassName=");
            LIZ.append(str);
            C58582Rq.LIZ(X1D.LIZIZ(LIZ), NGT.LIZIZ);
            java.util.Map<String, Class<?>> map2 = NGT.LIZJ;
            if (map2.containsKey(str)) {
                cls = (Class) ((LinkedHashMap) map2).get(str);
            } else {
                cls = Class.forName(str);
                map2.put(str, cls);
            }
            if (cls != null && (asSubclass = cls.asSubclass(IAdHybridCustomLoader.class)) != 0 && (iAdHybridCustomLoader = (IAdHybridCustomLoader) asSubclass.newInstance()) != null) {
                iAdHybridCustomLoader.initialize(option.LJLIL, option.LJLJI);
                iAdHybridCustomLoader2 = iAdHybridCustomLoader;
            }
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                C58582Rq.LIZ(C25620zW.LIZ("createContainer: Exception = ", LJFF), NGT.LIZIZ);
                C78983UzD.LJIIZILJ(LJFF);
            }
        }
        this.LIZIZ = iAdHybridCustomLoader2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("createContainer: containerInstance=");
        LIZ2.append(iAdHybridCustomLoader2);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ2), this.LIZJ);
    }

    @Override // X.AbstractC59064NGa
    public final void LJIILIIL(InterfaceC59069NGf interfaceC59069NGf) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registAdWebFragmentViewProvider(interfaceC59069NGf);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIILJJIL(NVV nvv) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registerActivityCallback(nvv);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIILL(NVQ nvq) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registerActivityRootViewProvider(nvq);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIILLIIL(NZ2 nz2) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registerHybridRootContainer(nz2);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIZILJ(NVR nvr) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.registerTitleBarProvider(nvr);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIJI(String cacheKey) {
        o.LJIIIZ(cacheKey, "cacheKey");
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.releaseCacheWithKey(cacheKey);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIJJLI(C59421NTt c59421NTt) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.renderFullScreen(c59421NTt);
        }
    }

    @Override // X.AbstractC59064NGa
    public final NMS LJI(C59421NTt c59421NTt, boolean z) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            return iAdHybridCustomLoader.createHybridFragment(c59421NTt, z);
        }
        return null;
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIIIZZ(String str, JSONObject jSONObject) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.notifyFE(str, jSONObject);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIJ(String mainReason, String detailReasonCode) {
        o.LJIIIZ(mainReason, "mainReason");
        o.LJIIIZ(detailReasonCode, "detailReasonCode");
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.onShowFailed(mainReason, detailReasonCode);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIIL(C59421NTt adHybridRenderOption, InterfaceC59068NGe interfaceC59068NGe) {
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.preRender(this.LIZ, adHybridRenderOption, interfaceC59068NGe);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIL(C59421NTt c59421NTt, CN8 cn8) {
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.renderPopup(c59421NTt, cn8);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJJ(Context context, String str) {
        o.LJIIIZ(context, "context");
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.router(context, str);
        }
    }

    @Override // X.AbstractC59064NGa
    public final void LJIJJ(C59421NTt adHybridRenderOption, NV4 adHybridLoadStatus, InterfaceC59067NGd interfaceC59067NGd) {
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        o.LJIIIZ(adHybridLoadStatus, "adHybridLoadStatus");
        IAdHybridCustomLoader iAdHybridCustomLoader = this.LIZIZ;
        if (iAdHybridCustomLoader != null) {
            iAdHybridCustomLoader.render(adHybridRenderOption, adHybridLoadStatus, interfaceC59067NGd);
        }
    }
}
