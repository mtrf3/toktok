package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tej, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75165Tej implements InterfaceC76112Tu0 {
    public final /* synthetic */ MultiGuestSharedBgAnchorViewModel LJLIL;

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    public C75165Tej(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel) {
        this.LJLIL = multiGuestSharedBgAnchorViewModel;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
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
        o.LJIIIZ(windows, "windows");
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJJIZ(InterfaceC75787Tol layout, int i) {
        o.LJIIIZ(layout, "layout");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutSwitch layout=");
        LIZ.append(layout.getLayoutId());
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LJLIL;
        multiGuestSharedBgAnchorViewModel.setState(new AqS179S0100000_13(multiGuestSharedBgAnchorViewModel, 183));
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex interfaceC75179Tex, EnumC75419Tip enumC75419Tip, EnumC75419Tip enumC75419Tip2, U9O u9o, C75786Tok c75786Tok) {
        C75240Tfw.LIZ(interfaceC75179Tex, enumC75419Tip, enumC75419Tip2, u9o);
    }
}
