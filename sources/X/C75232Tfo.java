package X;

import com.bytedance.android.live.liveinteract.multiguestv3.OnPostLayoutSwitchEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.OnPreLayoutSwitchEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveOverdrawOptimizeSettings2;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tfo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75232Tfo implements InterfaceC76112Tu0 {
    public final /* synthetic */ WindowMaskAssem LJLIL;

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        C76696U8e LJJIII;
        DataChannel dataChannel;
        if ((this.LJLIL.L3().LJLIL || !this.LJLIL.LJLLLL) && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
            LJJIII.LJIIJ(null);
        }
        if (LiveOverdrawOptimizeSettings2.INSTANCE.enable() && (dataChannel = this.LJLIL.LJLLI) != null) {
            dataChannel.pv0(OnPostLayoutSwitchEvent.class);
        }
        WindowMaskAssem.X3(this.LJLIL, false, null, 3);
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
        U8H LJJZZI;
        C76696U8e LJJIII;
        U8H LJJZZI2;
        C76696U8e LJJIII2;
        if (this.LJLIL.L3().LJLIL || !this.LJLIL.LJLLLL) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
                LJJIII.LJIIJ(null);
            }
        } else {
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LJJZZI2 = R62.LJJZZI()) != null && (LJJIII2 = LJJZZI2.LJJIII()) != null) {
                LJJIII2.LJIIJ(this.LJLIL.LLF);
            }
        }
        WindowMaskAssem.X3(this.LJLIL, false, null, 3);
    }

    public C75232Tfo(WindowMaskAssem windowMaskAssem) {
        this.LJLIL = windowMaskAssem;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        DataChannel dataChannel;
        o.LJIIIZ(layout, "layout");
        if (LiveOverdrawOptimizeSettings2.INSTANCE.enable() && (dataChannel = this.LJLIL.LJLLI) != null) {
            dataChannel.pv0(OnPreLayoutSwitchEvent.class);
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJJ(C76696U8e layout) {
        o.LJIIIZ(layout, "layout");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJ(SeiAppData seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLLL(LinkUser user) {
        o.LJIIIZ(user, "user");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJIIJ(int i, List windows) {
        C76696U8e c76696U8e;
        DataChannel dataChannel;
        o.LJIIIZ(windows, "windows");
        if (LiveOverdrawOptimizeSettings2.INSTANCE.enable() && (dataChannel = this.LJLIL.LJLLI) != null) {
            dataChannel.pv0(OnPostLayoutSwitchEvent.class);
        }
        InterfaceC75579TlP LJJJIL = C78886Uxe.LJJJIL(C8E.LJ());
        if (LJJJIL != null) {
            c76696U8e = ((U8H) LJJJIL).LJJIII();
        } else {
            c76696U8e = null;
        }
        C29556Biq.LIZ().getClass();
        EnumC74991Tbv LJI = C74983Tbn.LJI(c76696U8e);
        if (LJI == null) {
            LJI = EnumC74991Tbv.NORMAL;
        }
        this.LJLIL.b4(3, LJI);
        WindowMaskAssem.X3(this.LJLIL, false, null, 3);
        WindowMaskAssem windowMaskAssem = this.LJLIL;
        Iterator it = windows.iterator();
        while (it.hasNext()) {
            windowMaskAssem.a4((InterfaceC75179Tex) it.next());
        }
        this.LJLIL.g4();
        this.LJLIL.P3();
        WindowMaskAssem windowMaskAssem2 = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : windows) {
            if (C29306Beo.LJIJJLI(((InterfaceC75179Tex) obj).LJJ())) {
                arrayList.add(obj);
            }
        }
        windowMaskAssem2.U3(arrayList.size());
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        o.LJIIIZ(layout, "layout");
        C29556Biq.LIZ().getClass();
        EnumC74991Tbv LJI = C74983Tbn.LJI(layout);
        if (LJI == null) {
            LJI = EnumC74991Tbv.NORMAL;
        }
        this.LJLIL.b4(i, LJI);
        this.LJLIL.g4();
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        int i;
        InterfaceC75973Trl LLIIJI;
        List<LinkUser> LJJIIZI;
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        this.LJLIL.a4(window);
        this.LJLIL.g4();
        this.LJLIL.P3();
        WindowMaskAssem windowMaskAssem = this.LJLIL;
        if (c75786Tok != null) {
            i = c75786Tok.LJLJJL;
        } else {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LLIIJI = R6.LLIIJI()) != null && (LJJIIZI = LLIIJI.LJJIIZI()) != null) {
                i = LJJIIZI.size();
            } else {
                i = 0;
            }
        }
        windowMaskAssem.U3(i);
    }
}
