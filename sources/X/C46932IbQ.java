package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS14S0101000_10;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.IbQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46932IbQ extends C46742IWc {
    public Surface LJLJI;
    public boolean LJLJJI;

    @Override // X.C46742IWc, X.IZT
    public final void LJIIJ() {
        this.LJLJI = null;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIJI() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        int LJJII = player.LJJII(43);
        boolean z = this.LJLILLLLZI.q7().LJJII;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBeforeStop. codecName = ");
            LIZ.append(LJJII);
            LIZ.append(", isConfigNativeWindow = ");
            LIZ.append(z);
            IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LIZ));
        }
        if (z && LJJII != 2) {
            Surface surface = this.LJLJI;
            this.LJLJI = null;
            if (surface == null) {
                return;
            }
            if (IXB.LIZ) {
                IXB.LIZIZ("EngineRefreshSurfaceHelper", "onBeforeStop. do refresh surface");
            }
            if (surface instanceof InterfaceC46937IbV) {
                Object value = IZ8.LLILL.getValue();
                o.LJIIIIZZ(value, "<get-tryFixNativeRenderTextureViewError>(...)");
                if (((Boolean) value).booleanValue()) {
                    player.LLILZIL(null);
                    this.LJLIL.post(new ARunnableS14S0101000_10(5, surface, 2));
                    return;
                }
                return;
            }
            Object value2 = IZ8.LLILLIZIL.getValue();
            o.LJIIIIZZ(value2, "<get-tryFixNativeRenderSurfaceViewError>(...)");
            if (!((Boolean) value2).booleanValue() || IZ8.LJJJJL()) {
                return;
            }
            SurfaceHolder LIZ2 = C46936IbU.LIZ(surface);
            InterfaceC46937IbV interfaceC46937IbV = C46936IbU.LIZJ.get(surface);
            if (IXB.LIZ) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onBeforeStop. holder = ");
                LIZ3.append(LIZ2);
                LIZ3.append(", listener = ");
                LIZ3.append(interfaceC46937IbV);
                IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LIZ3));
            }
            if (LIZ2 == null || interfaceC46937IbV == null) {
                return;
            }
            interfaceC46937IbV.LJ();
        }
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJJIIJ() {
        String str;
        HashMap hashMap = new HashMap();
        if (this.LJLJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_surfaceview", str);
        return hashMap;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJL(new C46933IbR(this, player));
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIL() {
        C46882Iac player;
        Surface surface;
        boolean z;
        if (!IZ8.LJJJJL() || !this.LJLJJI || (player = this.LJLILLLLZI.getPlayer()) == null || (surface = this.LJLJI) == null) {
            return;
        }
        WeakHashMap<Surface, Boolean> weakHashMap = C46936IbU.LIZIZ;
        Boolean bool = weakHashMap.get(surface);
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBeforeStart. last use native render = ");
            LIZ.append(bool);
            LIZ.append(", curSurface = ");
            LIZ.append(this.LJLJI);
            IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LIZ));
        }
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        int LJJII = player.LJJII(43);
        if (this.LJLILLLLZI.q7().LJJII && LJJII != 2) {
            z = true;
        } else {
            z = false;
        }
        if (IXB.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onBeforeStart. this time use native render = ");
            LIZ2.append(z);
            IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LIZ2));
        }
        if (z) {
            return;
        }
        SurfaceHolder LIZ3 = C46936IbU.LIZ(this.LJLJI);
        Surface surface2 = this.LJLJI;
        o.LJIIIZ(surface2, "surface");
        InterfaceC46937IbV interfaceC46937IbV = C46936IbU.LIZJ.get(surface2);
        if (LIZ3 == null || interfaceC46937IbV == null) {
            return;
        }
        if (IXB.LIZ) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("onBeforeStart. will dorefreshSurface, surface = ");
            LIZ4.append(this.LJLJI);
            IXB.LIZIZ("EngineRefreshSurfaceHelper", X1D.LIZIZ(LIZ4));
        }
        this.LJLIL.post(new ARunnableS11S0101000_7(2, interfaceC46937IbV, 15));
        Surface surface3 = this.LJLJI;
        o.LJIIIZ(surface3, "surface");
        weakHashMap.remove(surface3);
    }

    public C46932IbQ(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJII(Surface surface) {
        boolean z;
        this.LJLJI = surface;
        if (surface != null) {
            if (C46936IbU.LIZ(surface) != null) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJJI = z;
        }
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIII(boolean z) {
        this.LJLJI = null;
    }
}
