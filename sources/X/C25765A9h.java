package X;

import Y.ACListenerS24S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserPopupVM;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS38S1300000_4;
import kotlin.jvm.internal.AqS50S0400000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.A9h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25765A9h extends AbstractC253779xd {
    public CustomDialogFragment LJLLILLLL;
    public boolean LJLLJ;
    public InterfaceC65784Pro<C76800UCe> LJLLL;
    public int LJLLLL;
    public final List<InterfaceC88472Yns<CustomDialogFragment, C76800UCe>> LJLLLLLL = new ArrayList();

    @Override // X.InterfaceC25781A9x
    public final void dismiss() {
        Object LIZ;
        CustomDialogFragment customDialogFragment = this.LJLLILLLL;
        if (customDialogFragment != null) {
            try {
                customDialogFragment.LJLJL = "default";
                if (customDialogFragment.getFragmentManager() != null) {
                    customDialogFragment.dismiss();
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                try {
                    customDialogFragment.dismissAllowingStateLoss();
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                }
                C221018lt.LIZJ("UserCard", "CustomDialog dismiss", m10exceptionOrNullimpl);
            }
        }
    }

    @Override // X.InterfaceC25781A9x
    public final void LJIJ(AqS163S0100000_13 aqS163S0100000_13) {
        this.LJLLL = aqS163S0100000_13;
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        if (((abstractC57828Mmm instanceof C57830Mmo) || (abstractC57828Mmm instanceof C57831Mmp) || (abstractC57828Mmm instanceof C57825Mmj)) && (interfaceC65784Pro = this.LJLLL) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        InterfaceC88472Yns<? super C57778Mly, C76800UCe> interfaceC88472Yns = this.LJLJLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(state);
        }
        if (this.LJLIL != null) {
            boolean z = state.LIZJ instanceof C72912tb;
            if (z && !state.LIZJ()) {
                LJII(!C1E4.LJIJJLI());
                LJIIIIZZ(this, LIZLLL().getPowerList(), this.LJLLLL, 0, null, 12);
                return;
            }
            if (z && state.LIZJ()) {
                LIZLLL().getStatusView().setTopMargin(C32151Nz.LJIIZILJ(36));
                C73305Spp statusView = LIZLLL().getStatusView();
                ViewGroup.LayoutParams layoutParams = statusView.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 48;
                    statusView.setLayoutParams(layoutParams2);
                    LJIIIIZZ(this, LIZLLL().getStatusView(), 0, C7MY.LIZIZ(42), new AqS154S0100000_4(this, 1188), 2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            if (!(state.LIZ instanceof C3C1)) {
                return;
            }
            LIZLLL().getStatusView().setTopMargin(C32151Nz.LJIIZILJ(32));
            C73305Spp statusView2 = LIZLLL().getStatusView();
            ViewGroup.LayoutParams layoutParams3 = statusView2.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 48;
                statusView2.setLayoutParams(layoutParams4);
                LJIIIIZZ(this, LIZLLL().getStatusView(), 0, C7MY.LIZIZ(56), new AqS154S0100000_4(this, 1189), 2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Override // X.AbstractC253779xd
    public final void LIZIZ(Bundle extra, ActivityC45651qj host) {
        Object LIZJ;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(extra, "extra");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(host);
        if (LJJIFFI != null) {
            InterfaceC65784Pro interfaceC65784Pro = null;
            C57858MnG c57858MnG = new C57858MnG(LJJIFFI, null, 2);
            c57858MnG.LIZJ(new AqS135S0200000_4(this, extra, 234));
            c57858MnG.LIZ(new C57878Mna(extra));
            c57858MnG.LIZLLL(new AqS50S0400000_4(this, host, extra, extra, 11));
            c57858MnG.LIZIZ(new AqS135S0200000_4(this, host, 235));
            IRelationUserCardInternalService.LIZ.getClass();
            IRelationUserCardInternalService LIZ = C57930MoQ.LIZ();
            C57867MnP c57867MnP = c57858MnG.LIZLLL;
            if (c57867MnP.LIZLLL == -1) {
                int i = c57858MnG.LJFF.LIZJ - 10;
                if (i < 5) {
                    i = 5;
                }
                c57867MnP.LIZLLL = i;
            }
            C65776Prg LIZ2 = C65352Pkq.LIZ(C25771A9n.class);
            if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
                C57866MnO c57866MnO = c57858MnG.LJFF;
                if (c57866MnO.LJIILJJIL == null) {
                    c57866MnO.LJIILJJIL = Boolean.TRUE;
                }
            }
            C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
            C65776Prg LIZ3 = C65352Pkq.LIZ(C25771A9n.class);
            int i2 = 0;
            if (o.LJ(LIZ3, C65352Pkq.LIZ(C25771A9n.class))) {
                LIZJ = C94293mz.LIZ(LIZ, c57859MnH, 2).getLayout();
            } else if (o.LJ(LIZ3, C65352Pkq.LIZ(C25770A9m.class))) {
                LIZJ = LIZ.LIZIZ(c57859MnH, 0).getLayout();
            } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
                LIZJ = LIZ.LIZ(c57859MnH);
            } else if (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
                LIZJ = LIZ.LIZJ(c57859MnH);
            } else {
                "type is error!".toString();
                throw new IllegalStateException("type is error!");
            }
            if (LIZJ != null) {
                C25771A9n c25771A9n = (C25771A9n) LIZJ;
                C27484AqW.LJI(c25771A9n.getPowerList(), -1, -2);
                C27484AqW.LJI(c25771A9n.getStatusView(), -1, -2);
                c25771A9n.getStatusView().setLayoutVariant(1);
                c25771A9n.W7(this);
                this.LJLIL = c25771A9n;
                this.LJLJJL = (RecUserPopupVM) new C214298b3(C65352Pkq.LIZ(RecUserPopupVM.class), C94H.LJLIL, C214528bQ.LJLIL, C78926UyI.LJJII(host, false), C78926UyI.LJJIIJZLJL(host, false), C184077Kh.LJLIL, C253869xm.INSTANCE, interfaceC65784Pro, 384).getValue();
                C8YN.LJII(this, LJFF(), new TBT() { // from class: X.9xl
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C253809xg) obj).LJLJI;
                    }
                }, null, new AqS186S0100000_4((AbstractC253779xd) this, 295), 6);
                C8YN.LJII(this, LJFF(), new TBT() { // from class: X.9xj
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C253809xg) obj).LJLILLLLZI);
                    }
                }, null, new AqS186S0100000_4((AbstractC253779xd) this, 296), 6);
                C8YN.LJII(this, LJFF(), new TBT() { // from class: X.9xk
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C253809xg) obj).LJLIL;
                    }
                }, C213688a4.LIZLLL(), new AqS186S0100000_4((AbstractC253779xd) this, 297), 4);
                host.runOnUiThread(new ARunnableS40S0100000_4(this, 139));
                this.LJLILLLLZI.set(true);
                View LIZ4 = C7W6.LIZ(LIZJ(), R.layout.c_w, null);
                View findViewById = LIZ4.findViewById(R.id.ely);
                o.LJIIIIZZ(findViewById, "root.findViewById(R.id.info_icon_view)");
                TuxIconView tuxIconView = (TuxIconView) findViewById;
                this.LJLJI = tuxIconView;
                if (!this.LJLJJI || C1E4.LJIJJLI()) {
                    i2 = 8;
                }
                tuxIconView.setVisibility(i2);
                TuxIconView tuxIconView2 = this.LJLJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setEnabled(!C1E4.LJIJJLI());
                    TuxIconView tuxIconView3 = this.LJLJI;
                    if (tuxIconView3 != null) {
                        C16880lQ.LJJJ(tuxIconView3, new ACListenerS24S0100000_4(this, 276));
                        C16880lQ.LJJJ((TuxIconView) LIZ4.findViewById(R.id.bfs), new ACListenerS24S0100000_4(this, 277));
                        View findViewById2 = LIZ4.findViewById(R.id.bty);
                        o.LJIIIIZZ(findViewById2, "root.findViewById(R.id.content_ll)");
                        ((ViewGroup) findViewById2).addView(LIZLLL(), new ViewGroup.LayoutParams(-1, -1));
                        C74291TDr c74291TDr = (C74291TDr) LIZ4.findViewById(R.id.ipk);
                        if (C99W.LIZ) {
                            c74291TDr.setRadius(C32151Nz.LJIIZILJ(12));
                        }
                        C187047Vs c187047Vs = new C187047Vs();
                        c187047Vs.LIZ.getClass();
                        CustomDialogFragment customDialogFragment = c187047Vs.LIZ;
                        customDialogFragment.LJLJI = LIZ4;
                        customDialogFragment.LJLJJI = new OSZ<>(1, Integer.valueOf(R.style.a_c));
                        ((ArrayList) c187047Vs.LIZ.LJLJJL).add(new AqS170S0100000_4(this, 1262));
                        this.LJLLILLLL = c187047Vs.LIZ;
                        return;
                    }
                    o.LJIJI("infoIconView");
                    throw null;
                }
                o.LJIJI("infoIconView");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.RelationUserCardLayout");
        }
        "current context is not fragmentActivity!".toString();
        throw new IllegalStateException("current context is not fragmentActivity!");
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1 && (interfaceC65784Pro = this.LJLLL) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC25781A9x
    public final void LJIIZILJ(FragmentManager fragmentManager, String str, InterfaceC88472Yns<? super AA5, C76800UCe> interfaceC88472Yns) {
        LJI(new AqS38S1300000_4(this, (C25765A9h) fragmentManager, (FragmentManager) str, (String) interfaceC88472Yns, (InterfaceC88472Yns<? super AA5, C76800UCe>) 1));
    }

    public static void LJIIIIZZ(C25765A9h c25765A9h, View view, int i, int i2, InterfaceC65784Pro interfaceC65784Pro, int i3) {
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        int i4 = i;
        int i5 = i2;
        if ((i3 & 2) != 0) {
            i4 = -1;
        }
        if ((i3 & 4) != 0) {
            i5 = 0;
        }
        if ((i3 & 8) != 0) {
            interfaceC65784Pro2 = null;
        }
        c25765A9h.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("adjustSize, measureMaxHeight: ");
        LIZ.append(i4);
        LIZ.append(", extraIncHeight: ");
        LIZ.append(i5);
        C221018lt.LIZ("RecUserDialogController", X1D.LIZIZ(LIZ));
        view.post(new RunnableC25759A9b(i4, i5, view, c25765A9h, interfaceC65784Pro2));
    }
}
