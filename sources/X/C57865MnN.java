package X;

import Y.ARunnableS45S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;
import q03.IDaS487S0100000_9;

/* renamed from: X.MnN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57865MnN implements InterfaceC25772A9o, InterfaceC57910Mo6 {
    public Integer LJLIL;
    public AbstractC25774A9q LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxIconView LJLJJI;
    public ViewGroup LJLJJL;
    public AbstractC25774A9q LJLJJLL;

    @Override // X.InterfaceC25772A9o
    public final void LJIIL() {
    }

    @Override // X.InterfaceC25772A9o, X.InterfaceC25773A9p
    public final void LJIILL(AbstractC57774Mlu<RecUser> abstractC57774Mlu) {
    }

    @Override // X.InterfaceC25773A9p
    public final void destroy() {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.destroy();
        } else {
            o.LJIJI("innerUserCardLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final C57778Mly getCurrentState() {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            return abstractC25774A9q.getCurrentState();
        }
        o.LJIJI("innerUserCardLayout");
        throw null;
    }

    @Override // X.InterfaceC25773A9p
    public final AbstractC030109x getItemAnimator() {
        "Not support itemAnimator".toString();
        throw new IllegalStateException("Not support itemAnimator");
    }

    @Override // X.InterfaceC25772A9o
    public final AbstractC25774A9q getLayout() {
        AbstractC25774A9q abstractC25774A9q = this.LJLILLLLZI;
        if (abstractC25774A9q != null) {
            return abstractC25774A9q;
        }
        o.LJIJI("horizontalCardLayout");
        throw null;
    }

    @Override // X.InterfaceC25772A9o
    public final SYL getPowerList() {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            return abstractC25774A9q.getPowerList();
        }
        o.LJIJI("innerUserCardLayout");
        throw null;
    }

    @Override // X.InterfaceC25772A9o
    public final C73305Spp getStatusView() {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            return abstractC25774A9q.getStatusView();
        }
        o.LJIJI("innerUserCardLayout");
        throw null;
    }

    @Override // X.InterfaceC25773A9p
    public final void reset() {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.reset();
        } else {
            o.LJIJI("innerUserCardLayout");
            throw null;
        }
    }

    public static C57859MnH LIZ(C57859MnH c57859MnH) {
        C57867MnP listConfig = c57859MnH.getListConfig();
        Integer num = listConfig.LIZIZ;
        Integer num2 = listConfig.LIZJ;
        int i = listConfig.LIZLLL;
        AbstractC57896Mns authCardStrategy = listConfig.LJ;
        boolean z = listConfig.LJFF;
        o.LJIIIZ(authCardStrategy, "authCardStrategy");
        C57867MnP c57867MnP = new C57867MnP(LiveChatShowDelayForHotLiveSetting.DEFAULT, num, num2, i, authCardStrategy, z);
        C57846Mn4 LIZ = C57846Mn4.LIZ(c57859MnH.getUiConfig(), -45187);
        C57866MnO apiConfig = c57859MnH.getApiConfig();
        EnumC57876MnY mafScene = apiConfig.LIZ;
        int i2 = apiConfig.LIZJ;
        int i3 = apiConfig.LIZLLL;
        List<? extends EnumC58046MqI> authPlatforms = apiConfig.LJ;
        String str = apiConfig.LJFF;
        String str2 = apiConfig.LJI;
        boolean z2 = apiConfig.LJII;
        EnumC57870MnS enumC57870MnS = apiConfig.LJIIIIZZ;
        String str3 = apiConfig.LJIIIZ;
        boolean z3 = apiConfig.LJIIJ;
        String str4 = apiConfig.LJIIJJI;
        boolean z4 = apiConfig.LJIIL;
        EnumC57870MnS recMoreType = apiConfig.LJIILIIL;
        Boolean bool = apiConfig.LJIILJJIL;
        int i4 = apiConfig.LJIILL;
        boolean z5 = apiConfig.LJIILLIIL;
        o.LJIIIZ(mafScene, "mafScene");
        o.LJIIIZ(authPlatforms, "authPlatforms");
        o.LJIIIZ(recMoreType, "recMoreType");
        return C57859MnH.copy$default(c57859MnH, null, null, LIZ, c57867MnP, null, new C57866MnO(mafScene, 1, i2, i3, authPlatforms, str, str2, z2, enumC57870MnS, str3, z3, str4, z4, recMoreType, bool, i4, z5), null, 83, null);
    }

    @Override // X.InterfaceC25773A9p
    public final void K8(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.K8(listener);
        } else {
            o.LJIJI("innerUserCardLayout");
            throw null;
        }
    }

    public final void LIZIZ(C57859MnH c57859MnH) {
        int i;
        if (this.LJLILLLLZI == null) {
            LJIIZILJ(new C25770A9m(C57898Mnu.LIZIZ(c57859MnH), null, this, 6));
        }
        C57846Mn4 uiConfig = c57859MnH.getUiConfig();
        C57851Mn9 c57851Mn9 = uiConfig.LJIIIIZZ;
        if (c57851Mn9 != null) {
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                tuxTextView.setText(c57851Mn9.LJLILLLLZI);
                TuxTextView tuxTextView2 = this.LJLJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColorRes(c57851Mn9.LJLJI);
                    TuxIconView tuxIconView = this.LJLJJI;
                    if (tuxIconView != null) {
                        tuxIconView.setTintColorRes(c57851Mn9.LJLJI);
                        TuxTextView tuxTextView3 = this.LJLJI;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setTuxFont(c57851Mn9.LJLJJI);
                        } else {
                            o.LJIJI("titleView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("infoIconView");
                        throw null;
                    }
                } else {
                    o.LJIJI("titleView");
                    throw null;
                }
            } else {
                o.LJIJI("titleView");
                throw null;
            }
        }
        TuxIconView tuxIconView2 = this.LJLJJI;
        if (tuxIconView2 != null) {
            if (!C1E4.LJIJJLI()) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView2.setVisibility(i);
            TuxIconView tuxIconView3 = this.LJLJJI;
            if (tuxIconView3 != null) {
                tuxIconView3.setEnabled(!C1E4.LJIJJLI());
                AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
                if (abstractC25774A9q != null) {
                    C26338AVi.LJIIIZ(abstractC25774A9q.getPowerList(), Integer.valueOf(uiConfig.LJJIIJ), null, Integer.valueOf(uiConfig.LJJIIJZLJL), null, 26);
                    ViewGroup viewGroup = this.LJLJJL;
                    if (viewGroup != null) {
                        C26338AVi.LJI(viewGroup, null, Integer.valueOf(uiConfig.LJJIJIIJI), null, null, false, 29);
                        AbstractC25774A9q abstractC25774A9q2 = this.LJLJJLL;
                        if (abstractC25774A9q2 != null) {
                            C26338AVi.LJI(abstractC25774A9q2, null, Integer.valueOf(uiConfig.LJJIJIIJIL), null, null, false, 29);
                            TuxIconView tuxIconView4 = this.LJLJJI;
                            if (tuxIconView4 != null) {
                                C9AE.LIZ(tuxIconView4, C9AC.ALPHA, 0.0f);
                                TuxIconView tuxIconView5 = this.LJLJJI;
                                if (tuxIconView5 != null) {
                                    C16880lQ.LJIIJ(new IDaS487S0100000_9(c57859MnH, 2), tuxIconView5);
                                    C57859MnH copy$default = C57859MnH.copy$default(c57859MnH, null, null, C57846Mn4.LIZ(uiConfig, -769), null, null, null, null, 123, null);
                                    AbstractC25774A9q abstractC25774A9q3 = this.LJLJJLL;
                                    if (abstractC25774A9q3 != null) {
                                        abstractC25774A9q3.setConfigInner(copy$default);
                                        AbstractC25774A9q abstractC25774A9q4 = this.LJLJJLL;
                                        if (abstractC25774A9q4 != null) {
                                            abstractC25774A9q4.W7(this);
                                            return;
                                        } else {
                                            o.LJIJI("innerUserCardLayout");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("innerUserCardLayout");
                                    throw null;
                                }
                                o.LJIJI("infoIconView");
                                throw null;
                            }
                            o.LJIJI("infoIconView");
                            throw null;
                        }
                        o.LJIJI("innerUserCardLayout");
                        throw null;
                    }
                    o.LJIJI("headerLayout");
                    throw null;
                }
                o.LJIJI("innerUserCardLayout");
                throw null;
            }
            o.LJIJI("infoIconView");
            throw null;
        }
        o.LJIJI("infoIconView");
        throw null;
    }

    @Override // X.InterfaceC25772A9o
    public final void LJIIZILJ(AbstractC25774A9q layout) {
        int i;
        o.LJIIIZ(layout, "layout");
        this.LJLILLLLZI = layout;
        View findViewById = layout.findViewById(R.id.e4c);
        o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.header_layout)");
        this.LJLJJL = (ViewGroup) findViewById;
        View findViewById2 = layout.findViewById(R.id.las);
        o.LJIIIIZZ(findViewById2, "layout.findViewById(R.id.title_view)");
        this.LJLJI = (TuxTextView) findViewById2;
        View findViewById3 = layout.findViewById(R.id.ely);
        o.LJIIIIZZ(findViewById3, "layout.findViewById(R.id.info_icon_view)");
        TuxIconView tuxIconView = (TuxIconView) findViewById3;
        this.LJLJJI = tuxIconView;
        if (!C1E4.LJIJJLI()) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
        TuxIconView tuxIconView2 = this.LJLJJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setEnabled(!C1E4.LJIJJLI());
            View findViewById4 = layout.findViewById(R.id.iun);
            o.LJIIIIZZ(findViewById4, "layout.findViewById(R.id…ser_card_layout_internal)");
            AbstractC25774A9q abstractC25774A9q = (AbstractC25774A9q) findViewById4;
            this.LJLJJLL = abstractC25774A9q;
            SYL powerList = abstractC25774A9q.getPowerList();
            C26338AVi.LJIIIZ(powerList, AnonymousClass391.LIZJ(16), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, 26);
            powerList.setClipToPadding(false);
            AbstractC029409q adapter = powerList.getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(new C57868MnQ(powerList, this));
                return;
            }
            return;
        }
        o.LJIJI("infoIconView");
        throw null;
    }

    @Override // X.InterfaceC25772A9o
    public final void LJJJJLL(boolean z) {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.LJJJJLL(z);
        } else {
            o.LJIJI("innerUserCardLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIIIJJIZ(InterfaceC88472Yns<? super C57819Mmd, C57819Mmd> interfaceC88472Yns) {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.LJJLIIIJJIZ(interfaceC88472Yns);
        } else {
            o.LJIJI("innerUserCardLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIL(InterfaceC57917MoD interfaceC57917MoD) {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.LJJLIL(interfaceC57917MoD);
        } else {
            o.LJIJI("innerUserCardLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void LJLJLJ(boolean z) {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.LJLJLJ(z);
        } else {
            o.LJIJI("innerUserCardLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC25773A9p
    public final void W7(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.W7(listener);
        } else {
            o.LJIJI("innerUserCardLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        if (abstractC57828Mmm instanceof C57830Mmo) {
            if (this.LJLIL == null) {
                this.LJLIL = Integer.valueOf(getPowerList().getChildAt(0).getWidth());
            }
            if (getPowerList().canScrollHorizontally(1)) {
                getPowerList().postDelayed(new ARunnableS45S0100000_9(this, 182), 600L);
            }
        }
    }

    @Override // X.InterfaceC25772A9o
    public final void setConfigInner(C57859MnH config) {
        o.LJIIIZ(config, "config");
        LIZIZ(LIZ(config));
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        int i;
        o.LJIIIZ(state, "state");
        if (state.LIZJ instanceof C72912tb) {
            ViewGroup viewGroup = this.LJLJJL;
            if (viewGroup != null) {
                if (!((Collection) ((C72912tb) r2).LIZ).isEmpty()) {
                    i = 0;
                } else {
                    i = 8;
                }
                viewGroup.setVisibility(i);
                return;
            }
            o.LJIJI("headerLayout");
            throw null;
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJIJ(String str, String str2, List list) {
        AbstractC25774A9q abstractC25774A9q = this.LJLJJLL;
        if (abstractC25774A9q != null) {
            abstractC25774A9q.LJJIJ(str, str2, list);
        } else {
            o.LJIJI("innerUserCardLayout");
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
        C65776Prg LIZ = C65352Pkq.LIZ(C25770A9m.class);
        if (!o.LJ(LIZ, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
            C57866MnO c57866MnO = c57858MnG.LJFF;
            if (c57866MnO.LJIILJJIL == null) {
                c57866MnO.LJIILJJIL = Boolean.TRUE;
            }
        }
        LIZIZ(LIZ(new C57859MnH(activityC45651qj, fragment, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null)));
    }
}
