package X;

import Y.ARunnableS45S0100000_9;
import Y.IDcS38S0100000_9;
import Y.IDrS48S0100000_9;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MoO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57928MoO implements InterfaceC25772A9o, InterfaceC03360Bg {
    public static final Interpolator LJLLI = C55953Lxd.LJ();
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public C57859MnH LJLJI;
    public final List<InterfaceC57910Mo6> LJLJJI = new ArrayList();
    public C57934MoU LJLJJL;
    public AbstractC25774A9q LJLJJLL;
    public C73305Spp LJLJL;
    public C119254m9 LJLJLJ;
    public SYL LJLJLLL;
    public SwipeRefreshLayout LJLL;

    @Override // X.InterfaceC25772A9o, X.InterfaceC25773A9p
    public final void LJIILL(AbstractC57774Mlu<RecUser> abstractC57774Mlu) {
    }

    public final boolean LIZ() {
        C57859MnH c57859MnH = this.LJLJI;
        if (c57859MnH != null) {
            return c57859MnH.getUiConfig().LJIIZILJ;
        }
        o.LJIJI("userCardConfig");
        throw null;
    }

    public final void LIZIZ() {
        C73305Spp c73305Spp = this.LJLJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
            C57934MoU c57934MoU = this.LJLJJL;
            if (c57934MoU != null) {
                c57934MoU.LJLJLJ(false);
                return;
            } else {
                o.LJIJI("userCardChunk");
                throw null;
            }
        }
        o.LJIJI("_statusView");
        throw null;
    }

    public final void LJFF() {
        C57859MnH c57859MnH = this.LJLJI;
        if (c57859MnH != null) {
            C73306Spq c73306Spq = c57859MnH.getUiConfig().LJIIL;
            if (c73306Spq != null) {
                C73305Spp c73305Spp = this.LJLJL;
                if (c73305Spp != null) {
                    LJI(c73305Spp, c73306Spq);
                    return;
                } else {
                    o.LJIJI("_statusView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("userCardConfig");
        throw null;
    }

    @Override // X.InterfaceC25773A9p
    public final void destroy() {
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            c57934MoU.destroy();
        } else {
            o.LJIJI("userCardChunk");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final C57778Mly getCurrentState() {
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            return c57934MoU.getCurrentState();
        }
        o.LJIJI("userCardChunk");
        throw null;
    }

    @Override // X.InterfaceC25773A9p
    public final AbstractC030109x getItemAnimator() {
        "not supported itemAnimator".toString();
        throw new IllegalStateException("not supported itemAnimator");
    }

    @Override // X.InterfaceC25772A9o
    public final AbstractC25774A9q getLayout() {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            return abstractC25774A9q;
        }
        o.LJIJI("layout");
        throw null;
    }

    @Override // X.InterfaceC25772A9o
    public final SYL getPowerList() {
        SYL syl = this.LJLJLLL;
        if (syl != null) {
            return syl;
        }
        o.LJIJI("_powerList");
        throw null;
    }

    @Override // X.InterfaceC25772A9o
    public final C73305Spp getStatusView() {
        C73305Spp c73305Spp = this.LJLJL;
        if (c73305Spp != null) {
            return c73305Spp;
        }
        o.LJIJI("_statusView");
        throw null;
    }

    @Override // X.InterfaceC25773A9p
    public final void reset() {
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            c57934MoU.reset();
        } else {
            o.LJIJI("userCardChunk");
            throw null;
        }
    }

    @Override // X.InterfaceC03360Bg
    public final void LJ() {
        AbstractC72932td<C223208pQ> abstractC72932td = getCurrentState().LIZ;
        if (abstractC72932td instanceof C72922tc) {
            return;
        }
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            ((CopyOnWriteArraySet) c57934MoU.LJLJJLL.LIZ().jv0().LJLL).clear();
            if (!(abstractC72932td instanceof C33X)) {
                LJLJLJ(false);
                return;
            } else {
                LIZIZ();
                return;
            }
        }
        o.LJIJI("userCardChunk");
        throw null;
    }

    @Override // X.InterfaceC25772A9o
    public final void LJIIL() {
        LJFF();
    }

    @Override // X.InterfaceC25773A9p
    public final void K8(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLJJI).remove(listener);
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            c57934MoU.K8(listener);
        } else {
            o.LJIJI("userCardChunk");
            throw null;
        }
    }

    public final void LIZJ(boolean z) {
        boolean z2;
        SYL syl = this.LJLJLLL;
        if (syl != null) {
            int i = 0;
            if (syl.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 == z) {
                return;
            }
            AYY ayy = AYY.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("list view isVisible: ");
            LIZ.append(z);
            String LIZIZ = X1D.LIZIZ(LIZ);
            ayy.getClass();
            AYY.LIZIZ("LayoutController", LIZIZ);
            SYL syl2 = this.LJLJLLL;
            if (syl2 != null) {
                if (!z) {
                    i = 8;
                }
                syl2.setVisibility(i);
                if (LIZ()) {
                    SYL syl3 = this.LJLJLLL;
                    if (syl3 != null) {
                        syl3.setAlpha(0.0f);
                        if (z) {
                            SYL syl4 = this.LJLJLLL;
                            if (syl4 != null) {
                                syl4.animate().alpha(1.0f).setInterpolator(LJLLI).setDuration(400L).setStartDelay(400L).start();
                                return;
                            } else {
                                o.LJIJI("_powerList");
                                throw null;
                            }
                        }
                        return;
                    }
                    o.LJIJI("_powerList");
                    throw null;
                }
                return;
            }
            o.LJIJI("_powerList");
            throw null;
        }
        o.LJIJI("_powerList");
        throw null;
    }

    public final void LIZLLL(boolean z) {
        C57859MnH c57859MnH = this.LJLJI;
        if (c57859MnH != null) {
            Integer num = c57859MnH.getUiConfig().LIZIZ;
            if (this.LJLIL == z || num == null) {
                return;
            }
            AYY ayy = AYY.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("layout is loading: ");
            LIZ.append(z);
            String LIZIZ = X1D.LIZIZ(LIZ);
            ayy.getClass();
            AYY.LIZIZ("LayoutController", LIZIZ);
            int intValue = num.intValue();
            int i = 0;
            if (intValue != 300) {
                if (intValue == 301) {
                    if (!z) {
                        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(this, 184);
                        if (LIZ()) {
                            C119254m9 c119254m9 = this.LJLJLJ;
                            if (c119254m9 != null) {
                                c119254m9.animate().alpha(0.0f).setDuration(400L).setInterpolator(LJLLI).withEndAction(aRunnableS45S0100000_9).start();
                            } else {
                                o.LJIJI("skeletonLayout");
                                throw null;
                            }
                        } else {
                            aRunnableS45S0100000_9.run();
                        }
                    } else {
                        C119254m9 c119254m92 = this.LJLJLJ;
                        if (c119254m92 != null) {
                            c119254m92.setAlpha(1.0f);
                            C119254m9 c119254m93 = this.LJLJLJ;
                            if (c119254m93 != null) {
                                c119254m93.setVisibility(0);
                                C119254m9 c119254m94 = this.LJLJLJ;
                                if (c119254m94 != null) {
                                    c119254m94.setLoading(true);
                                } else {
                                    o.LJIJI("skeletonLayout");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("skeletonLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("skeletonLayout");
                            throw null;
                        }
                    }
                }
            } else {
                C73305Spp c73305Spp = this.LJLJL;
                if (c73305Spp != null) {
                    if (!z) {
                        i = 8;
                    }
                    c73305Spp.setVisibility(i);
                    if (z) {
                        C73305Spp c73305Spp2 = this.LJLJL;
                        if (c73305Spp2 != null) {
                            c73305Spp2.LJFF();
                        } else {
                            o.LJIJI("_statusView");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("_statusView");
                    throw null;
                }
            }
            SwipeRefreshLayout swipeRefreshLayout = this.LJLL;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(!z);
            }
            this.LJLIL = z;
            return;
        }
        o.LJIJI("userCardConfig");
        throw null;
    }

    @Override // X.InterfaceC25772A9o
    public final void LJIIZILJ(AbstractC25774A9q layout) {
        o.LJIIIZ(layout, "layout");
        this.LJLJJLL = layout;
        View findViewById = layout.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.status_view)");
        this.LJLJL = (C73305Spp) findViewById;
        View findViewById2 = layout.findViewById(R.id.i04);
        o.LJIIIIZZ(findViewById2, "layout.findViewById(R.id.power_list)");
        this.LJLJLLL = (SYL) findViewById2;
        View findViewById3 = layout.findViewById(R.id.k24);
        o.LJIIIIZZ(findViewById3, "layout.findViewById(R.id.skeleton_layout)");
        this.LJLJLJ = (C119254m9) findViewById3;
    }

    @Override // X.InterfaceC25772A9o
    public final void LJJJJLL(boolean z) {
        if (z) {
            SYL syl = this.LJLJLLL;
            if (syl != null) {
                syl.LJLIL(0);
                return;
            } else {
                o.LJIJI("_powerList");
                throw null;
            }
        }
        SYL syl2 = this.LJLJLLL;
        if (syl2 != null) {
            syl2.LJLI(0);
        } else {
            o.LJIJI("_powerList");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIIIJJIZ(InterfaceC88472Yns<? super C57819Mmd, C57819Mmd> interfaceC88472Yns) {
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            c57934MoU.LJLJJLL.LJJLIIIJJIZ(interfaceC88472Yns);
        } else {
            o.LJIJI("userCardChunk");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIL(InterfaceC57917MoD interfaceC57917MoD) {
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            c57934MoU.LJLJJLL.LJJLIL(interfaceC57917MoD);
        } else {
            o.LJIJI("userCardChunk");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void LJLJLJ(boolean z) {
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            c57934MoU.LJLJLJ(z);
        } else {
            o.LJIJI("userCardChunk");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void W7(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLJJI).add(listener);
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            c57934MoU.W7(listener);
        } else {
            o.LJIJI("userCardChunk");
            throw null;
        }
    }

    @Override // X.InterfaceC25772A9o
    public final void setConfigInner(C57859MnH config) {
        OSZ osz;
        o.LJIIIZ(config, "config");
        this.LJLJI = config;
        if (this.LJLJJLL == null) {
            new C25771A9n(C57898Mnu.LIZIZ(config), null, this, 6);
        }
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            C27484AqW.LJI(abstractC25774A9q, config.getListConfig().LIZIZ, config.getListConfig().LIZJ);
            if (config.getListConfig().LIZ == 401) {
                osz = new OSZ(1, 1);
            } else {
                osz = new OSZ(0, 0);
            }
            int intValue = ((Number) osz.getFirst()).intValue();
            int intValue2 = ((Number) osz.getSecond()).intValue();
            if (intValue == 1 && config.getUiConfig().LJII) {
                AbstractC25774A9q abstractC25774A9q2 = this.LJLJJLL;
                if (abstractC25774A9q2 != null) {
                    View findViewById = abstractC25774A9q2.findViewById(R.id.i05);
                    o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.power_list_inner)");
                    this.LJLJLLL = (SYL) findViewById;
                    AbstractC25774A9q abstractC25774A9q3 = this.LJLJJLL;
                    if (abstractC25774A9q3 != null) {
                        SwipeRefreshLayout setupViewByConfig$lambda$2$lambda$0 = (SwipeRefreshLayout) abstractC25774A9q3.findViewById(R.id.itq);
                        o.LJIIIIZZ(setupViewByConfig$lambda$2$lambda$0, "setupViewByConfig$lambda$2$lambda$0");
                        setupViewByConfig$lambda$2$lambda$0.setVisibility(0);
                        setupViewByConfig$lambda$2$lambda$0.setOnRefreshListener(this);
                        this.LJLL = setupViewByConfig$lambda$2$lambda$0;
                    } else {
                        o.LJIJI("layout");
                        throw null;
                    }
                } else {
                    o.LJIJI("layout");
                    throw null;
                }
            }
            SYL syl = this.LJLJLLL;
            if (syl != null) {
                syl.setOrientation(intValue);
                if (C52342KgU.LIZIZ() && config.getApiConfig().LIZ == EnumC57876MnY.SUGGESTED_TAB_PAGE) {
                    SYL syl2 = this.LJLJLLL;
                    if (syl2 != null) {
                        syl2.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
                        SYL syl3 = this.LJLJLLL;
                        if (syl3 != null) {
                            C57898Mnu.LIZIZ(config);
                            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(2);
                            wrapGridLayoutManager.LLIILII = new IDcS38S0100000_9(this, 5);
                            syl3.setLayoutManager(wrapGridLayoutManager);
                        } else {
                            o.LJIJI("_powerList");
                            throw null;
                        }
                    } else {
                        o.LJIJI("_powerList");
                        throw null;
                    }
                }
                SYL syl4 = this.LJLJLLL;
                if (syl4 != null) {
                    syl4.LJIIJJI(new IDrS48S0100000_9(this, 10));
                    Integer num = config.getUiConfig().LIZIZ;
                    if (num != null && num.intValue() == 301 && config.getListConfig().LIZ == 401) {
                        C119254m9 c119254m9 = this.LJLJLJ;
                        if (c119254m9 != null) {
                            c119254m9.setRepeat(0);
                            C119254m9 c119254m92 = this.LJLJLJ;
                            if (c119254m92 != null) {
                                c119254m92.setRepeatOrientation(intValue2);
                                C119254m9 c119254m93 = this.LJLJLJ;
                                if (c119254m93 != null) {
                                    c119254m93.setPreviewItemRes(R.layout.cat);
                                } else {
                                    o.LJIJI("skeletonLayout");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("skeletonLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("skeletonLayout");
                            throw null;
                        }
                    }
                    IRelationUserCardInternalService.LIZ.getClass();
                    C57934MoU LIZ = C57930MoQ.LIZ().LIZ(config);
                    o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.RelationUserCardChunk");
                    this.LJLJJL = LIZ;
                    LIZ.W7(new C57929MoP(this));
                    C57934MoU c57934MoU = this.LJLJJL;
                    if (c57934MoU != null) {
                        c57934MoU.LJIILL(null);
                        C57934MoU c57934MoU2 = this.LJLJJL;
                        if (c57934MoU2 != null) {
                            SYL syl5 = this.LJLJLLL;
                            if (syl5 != null) {
                                c57934MoU2.LJLJJLL.LJIJJLI(syl5);
                                C27484AqW.LJ(new AqS156S0200000_9(config, this, 84));
                                if (config.getUiConfig().LIZIZ != null) {
                                    LIZLLL(true);
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("_powerList");
                            throw null;
                        }
                        o.LJIJI("userCardChunk");
                        throw null;
                    }
                    o.LJIJI("userCardChunk");
                    throw null;
                }
                o.LJIJI("_powerList");
                throw null;
            }
            o.LJIJI("_powerList");
            throw null;
        }
        o.LJIJI("layout");
        throw null;
    }

    public final void LJI(C73305Spp c73305Spp, C73306Spq c73306Spq) {
        AYY.LIZ.getClass();
        AYY.LIZIZ("LayoutController", "set status view");
        LIZJ(false);
        c73305Spp.setStatus(c73306Spq);
        c73305Spp.setVisibility(0);
        if (LIZ()) {
            c73305Spp.setAlpha(0.0f);
            c73305Spp.animate().alpha(1.0f).setDuration(400L).setStartDelay(400L).setInterpolator(LJLLI).start();
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJIJ(String str, String str2, List list) {
        C57934MoU c57934MoU = this.LJLJJL;
        if (c57934MoU != null) {
            c57934MoU.LJJIJ(str, str2, list);
        } else {
            o.LJIJI("userCardChunk");
            throw null;
        }
    }

    @Override // X.InterfaceC25772A9o
    public final void LJJJ(ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC88472Yns<? super C57858MnG, C76800UCe> config) {
        o.LJIIIZ(config, "config");
        C57858MnG c57858MnG = new C57858MnG(activityC45651qj, fragment);
        config.invoke(c57858MnG);
        C57867MnP c57867MnP = c57858MnG.LIZLLL;
        if (c57867MnP.LIZLLL == -1) {
            int i = c57858MnG.LJFF.LIZJ - 10;
            if (i < 5) {
                i = 5;
            }
            c57867MnP.LIZLLL = i;
        }
        C65776Prg LIZ = C65352Pkq.LIZ(C25771A9n.class);
        if (!o.LJ(LIZ, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
            C57866MnO c57866MnO = c57858MnG.LJFF;
            if (c57866MnO.LJIILJJIL == null) {
                c57866MnO.LJIILJJIL = Boolean.TRUE;
            }
        }
        setConfigInner(new C57859MnH(activityC45651qj, fragment, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null));
    }
}
