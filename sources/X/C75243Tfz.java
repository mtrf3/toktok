package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestShareBgSupportLayoutAnimationSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tfz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75243Tfz implements InterfaceC76112Tu0 {
    public final /* synthetic */ AnimationManagerImpl LJLIL;

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
        this.LJLIL.LIZJ();
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
        this.LJLIL.LIZJ();
    }

    public C75243Tfz(AnimationManagerImpl animationManagerImpl) {
        this.LJLIL = animationManagerImpl;
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJI(InterfaceC75787Tol layout) {
        o.LJIIIZ(layout, "layout");
        String layoutId = layout.getLayoutId();
        String str = this.LJLIL.LJLJJL;
        if (str != null && layoutId != null && !o.LJ(str, layoutId)) {
            this.LJLIL.LJFF("submit animation onLayoutSwitch");
            AnimationManagerImpl animationManagerImpl = this.LJLIL;
            animationManagerImpl.LJFF("showAnimation");
            if (MultiGuestShareBgSupportLayoutAnimationSetting.INSTANCE.isInteractType()) {
                animationManagerImpl.LJFF("notShowAnimation as there is a bg");
            } else {
                animationManagerImpl.LJI(animationManagerImpl, animationManagerImpl);
            }
        }
        this.LJLIL.LJLJJL = layoutId;
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
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
        C29556Biq.LIZ().getClass();
        if (C74983Tbn.LJI(c76696U8e) == EnumC74991Tbv.GRID_FLOAT) {
            int size = c76696U8e.getAllLayoutWindows().size();
            if (size == 2) {
                if (i != 1) {
                    return;
                }
            } else if (size != 1 || i != 2) {
                return;
            }
            this.LJLIL.LJFF("submit animation onLayoutSwitch");
            AnimationManagerImpl animationManagerImpl = this.LJLIL;
            animationManagerImpl.LJFF("showAnimation");
            if (MultiGuestShareBgSupportLayoutAnimationSetting.INSTANCE.isInteractType()) {
                animationManagerImpl.LJFF("notShowAnimation as there is a bg");
            } else {
                animationManagerImpl.LJI(animationManagerImpl, animationManagerImpl);
            }
        }
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex interfaceC75179Tex, EnumC75419Tip enumC75419Tip, EnumC75419Tip enumC75419Tip2, U9O u9o, C75786Tok c75786Tok) {
        C75240Tfw.LIZ(interfaceC75179Tex, enumC75419Tip, enumC75419Tip2, u9o);
    }
}
