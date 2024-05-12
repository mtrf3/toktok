package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6C implements InterfaceC76661U6v {
    public final /* synthetic */ U8H LJLIL;

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
        Iterator<InterfaceC76112Tu0> it = this.LJLIL.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJJIIZ();
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
        Iterator<InterfaceC76112Tu0> it = this.LJLIL.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJJLIIIJILLIZJL();
        }
    }

    public U6C(U8H u8h) {
        this.LJLIL = u8h;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
        U8H u8h = this.LJLIL;
        View view = u8h.LJIJJLI;
        if (view != null) {
            u8h.LIZJ(view, layout);
        }
        Iterator<InterfaceC76112Tu0> it = this.LJLIL.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJJI(layout);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
        Iterator<InterfaceC76112Tu0> it = this.LJLIL.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJJJ(layout);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC76661U6v
    public final void LJLIL(List<? extends InterfaceC75179Tex> windows) {
        o.LJIIIZ(windows, "windows");
        U8H u8h = this.LJLIL;
        Iterator<InterfaceC76112Tu0> it = u8h.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ(u8h.LIZ.LIZIZ, windows);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        o.LJIIIZ(windows, "windows");
        Iterator<InterfaceC76112Tu0> it = this.LJLIL.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ(i, windows);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        o.LJIIIZ(layout, "layout");
        this.LJLIL.getClass();
        String LJJJ = U8H.LJJJ(570);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.LJJIJ());
        LIZ.append(":onLayoutSwitch isNormalType = ");
        LIZ.append(layout.LIZ());
        LIZ.append(" layoutId = ");
        LIZ.append(layout.getLayoutId());
        LIZ.append(" layout'all are = ");
        LIZ.append(layout.getContainerAllRange());
        LIZ.append(" realArea = ");
        LIZ.append(layout.getContainerActualRange());
        LIZ.append(" playerArea = ");
        LIZ.append(layout.getPlayerRange());
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        Layout LIZJ = this.LJLIL.LJIJJ().LIZJ(false);
        if (LIZJ != null) {
            U8H u8h = this.LJLIL;
            u8h.getClass();
            String LJJJ2 = U8H.LJJJ(572);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(u8h.LJJIJ());
            LIZ2.append(":onLayoutSwitch scene = ");
            LIZ2.append(LIZJ.getScene());
            LIZ2.append(" micCount = ");
            LIZ2.append(LIZJ.getMicCount());
            C32014ChO.LJFF(LJJJ2, X1D.LIZIZ(LIZ2));
            java.util.Map<Integer, Integer> LIZJ2 = InterfaceC30442Bx8.a0.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_SCENE_PANEL_SETTING_MAP.value");
            LIZJ2.put(Integer.valueOf(LIZJ.getScene()), Integer.valueOf(LIZJ.getMicCount()));
        }
        Iterator<InterfaceC76112Tu0> it = this.LJLIL.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJJLIIIJJIZ(layout, i);
        }
        this.LJLIL.LIZ.LJFF.LJJIFFI();
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
        U8H u8h = this.LJLIL;
        View view = u8h.LJIJJLI;
        if (view != null) {
            u8h.LIZJ(view, c76696U8e);
        }
        Iterator<InterfaceC76112Tu0> it = this.LJLIL.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJLJJL(c76696U8e, i);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        this.LJLIL.getClass();
        String LJJJ = U8H.LJJJ(606);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.LJJIJ());
        LIZ.append(":onWindowStateChanged window.pos = ");
        LIZ.append(window.LJZ());
        LIZ.append(" ,oldState = ");
        LIZ.append(oldState);
        LIZ.append(", newState = ");
        LIZ.append(newState);
        LIZ.append(" container = ");
        LIZ.append(window.LJJIJIL().hashCode());
        LIZ.append(" abs = ");
        LIZ.append(window.LJJLIIIJ());
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        Iterator<InterfaceC76112Tu0> it = this.LJLIL.LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LLIIJLIL(window, oldState, newState, actionType, c75786Tok);
        }
    }
}
