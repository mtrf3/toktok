package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tx2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76300Tx2 implements InterfaceC76112Tu0 {
    public final /* synthetic */ C76301Tx3 LJLIL;

    @Override // X.InterfaceC76112Tu0
    public final void LJJIIZ() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJJLIIIJILLIZJL() {
    }

    @Override // X.InterfaceC76112Tu0
    public final void LJLJJL(C76696U8e c76696U8e, int i) {
    }

    public C76300Tx2(C76301Tx3 c76301Tx3) {
        this.LJLIL = c76301Tx3;
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
    }

    @Override // X.InterfaceC76112Tu0
    public final void LLIIJLIL(InterfaceC75179Tex window, EnumC75419Tip oldState, EnumC75419Tip newState, U9O actionType, C75786Tok c75786Tok) {
        List<C75989Ts1> LIZLLL;
        o.LJIIIZ(window, "window");
        o.LJIIIZ(oldState, "oldState");
        o.LJIIIZ(newState, "newState");
        o.LJIIIZ(actionType, "actionType");
        int i = 1;
        if (!window.LJLJI() && window.LJJIL() == EnumC75419Tip.StateLinked) {
            C76301Tx3 c76301Tx3 = this.LJLIL;
            EnumC75620Tm4 state = EnumC75620Tm4.Linked;
            c76301Tx3.getClass();
            o.LJIIIZ(state, "state");
            if (c76301Tx3.LJLL == state) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onMultiHostStateChanged, return by state same, state = ");
                LIZ.append(state);
                C0NB.LJIIIZ("MultiHostFeedView", X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onMultiHostStateChanged, state = ");
                LIZ2.append(state);
                LIZ2.append(", oldState=");
                LIZ2.append(c76301Tx3.LJLL);
                C0NB.LJIIIZ("MultiHostFeedView", X1D.LIZIZ(LIZ2));
                if (C75876TqC.LIZ[state.ordinal()] == 1) {
                    C75870Tq6 c75870Tq6 = new C75870Tq6();
                    c75870Tq6.LJIILL(c76301Tx3.LJLJL);
                    c75870Tq6.LJIILJJIL("cohost_widget_load");
                    c76301Tx3.LJLL = state;
                    c76301Tx3.LJLJJI.LIZ.hv0();
                    C76299Tx1 c76299Tx1 = c76301Tx3.LJLJLJ;
                    c76299Tx1.getClass();
                    C76316TxI.LIZ("create");
                    C76312TxE c76312TxE = c76299Tx1.LIZIZ;
                    c76312TxE.getClass();
                    c76312TxE.LIZ = c76299Tx1;
                    C76312TxE c76312TxE2 = c76299Tx1.LIZIZ;
                    c76312TxE2.getClass();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("initBattleInfo, viewInterface=");
                    LIZ3.append(c76312TxE2.LIZ);
                    C0NB.LJIIIZ("MatchFeedWidgetPresenter", X1D.LIZIZ(LIZ3));
                    InterfaceC76348Txo interfaceC76348Txo = c76312TxE2.LIZ;
                    if (interfaceC76348Txo == null) {
                        C0NB.LJIIIZ("MatchFeedWidgetPresenter", "initBattleInfo, return by viewInterface == null");
                    } else {
                        InterfaceC76347Txn LIZ4 = interfaceC76348Txo.LIZ();
                        if (LIZ4 == null || LIZ4.LIZIZ() == null) {
                            C0NB.LJIIIZ("MatchFeedWidgetPresenter", "initBattleInfo, return by MultiHostFeedInfoProvider == null");
                        } else {
                            c76312TxE2.LIZLLL = LiveMatchAudienceCheckBattleInfoSetting.INSTANCE.getEnterRetryCount();
                            c76312TxE2.LIZ(1);
                        }
                    }
                    c76299Tx1.LJ = true;
                }
            }
        }
        InterfaceC75871Tq7 interfaceC75871Tq7 = this.LJLIL.LJLJL;
        if (interfaceC75871Tq7 != null && (LIZLLL = interfaceC75871Tq7.LIZLLL()) != null) {
            i = LIZLLL.size();
        }
        C75728Tno c75728Tno = new C75728Tno(window, oldState, newState, i);
        List<InterfaceC88472Yns<C75732Tns<?>, C76800UCe>> list = C66612QCi.LIZ.get(C75728Tno.class);
        if (list != null) {
            Iterator<InterfaceC88472Yns<C75732Tns<?>, C76800UCe>> it = list.iterator();
            while (it.hasNext()) {
                it.next().invoke(new C75732Tns<>(c75728Tno));
            }
        }
    }
}
