package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC57781Mm1;
import X.AbstractC57828Mmm;
import X.AbstractC58014Mpm;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C214298b3;
import X.C214528bQ;
import X.C221018lt;
import X.C221108m2;
import X.C223208pQ;
import X.C25678A5y;
import X.C25770A9m;
import X.C25771A9n;
import X.C25775A9r;
import X.C32151Nz;
import X.C33X;
import X.C3C1;
import X.C52342KgU;
import X.C57778Mly;
import X.C57858MnG;
import X.C57859MnH;
import X.C57866MnO;
import X.C57867MnP;
import X.C57930MoQ;
import X.C57934MoU;
import X.C58073Mqj;
import X.C58074Mqk;
import X.C58075Mql;
import X.C58076Mqm;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72912tb;
import X.C72922tc;
import X.C73305Spp;
import X.C76800UCe;
import X.C78685UuP;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C94293mz;
import X.C9BD;
import X.C9BE;
import X.C9UA;
import X.EnumC41264GHk;
import X.EnumC58046MqI;
import X.EnumC58072Mqi;
import X.InterfaceC57760Mlg;
import X.InterfaceC57784Mm4;
import X.InterfaceC57910Mo6;
import X.InterfaceC65350Pko;
import X.O6R;
import X.P29;
import X.P2A;
import X.SYL;
import X.TBT;
import X.X1D;
import Y.IDcS38S0100000_9;
import Y.IDrS43S0100000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecFriendsFragment extends FFPBaseFragment implements InterfaceC57910Mo6 {
    public static final int LJLLI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
    public final C214298b3 LJLJI;
    public final C62822Ol8 LJLJJI;
    public C73305Spp LJLJJL;
    public SYL LJLJJLL;
    public AbstractC58014Mpm LJLJL;
    public C58075Mql LJLJLJ;
    public final int LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Hl() {
        C8YN.LJII(this, Il(), new TBT() { // from class: X.Mqo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C58080Mqq) obj).LJLIL;
            }
        }, null, new AqS191S0100000_9(this, 47), 6);
        AssemViewModel.asyncSubscribe$default(Il(), new TBT() { // from class: X.Mqp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C58080Mqq) obj).LJLILLLLZI;
            }
        }, null, new AqS175S0100000_9(this, 242), new AqS159S0100000_9(this, 532), new AqS175S0100000_9(this, 243), 2, null);
        C8YN.LJII(this, Il(), new TBT() { // from class: X.Mqr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C58080Mqq) obj).LJLILLLLZI;
            }
        }, null, new AqS191S0100000_9(this, 48), 6);
        C8YN.LJII(this, Il(), new TBT() { // from class: X.Mqs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C58080Mqq) obj).LJLJI;
            }
        }, null, new AqS191S0100000_9(this, 46), 6);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
    }

    public RecFriendsFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 530);
        C65776Prg LIZ = C65352Pkq.LIZ(RecFriendsVM.class);
        AqS159S0100000_9 aqS159S0100000_92 = new AqS159S0100000_9(LIZ, 531);
        C58076Mqm c58076Mqm = C58076Mqm.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS159S0100000_92, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), aqS159S0100000_9, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c58076Mqm, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS159S0100000_92, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS159S0100000_9, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c58076Mqm, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 529));
        this.LJLJJI = LIZIZ;
        this.LJLJLLL = R.layout.axx;
        InterfaceC57760Mlg interfaceC57760Mlg = (InterfaceC57760Mlg) LIZIZ.getValue();
        if (interfaceC57760Mlg != null) {
            interfaceC57760Mlg.xk0(null);
        }
    }

    public final RecFriendsVM Il() {
        return (RecFriendsVM) this.LJLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC58014Mpm abstractC58014Mpm = this.LJLJL;
        if (abstractC58014Mpm != null) {
            ((C57934MoU) abstractC58014Mpm).K8(this);
            InterfaceC57910Mo6 interfaceC57910Mo6 = (InterfaceC57910Mo6) this.LJLJJI.getValue();
            if (interfaceC57910Mo6 != null) {
                AbstractC58014Mpm abstractC58014Mpm2 = this.LJLJL;
                if (abstractC58014Mpm2 != null) {
                    ((C57934MoU) abstractC58014Mpm2).K8(interfaceC57910Mo6);
                } else {
                    o.LJIJI("userCardChunk");
                    throw null;
                }
            }
            _$_clearFindViewByIdCache();
            return;
        }
        o.LJIJI("userCardChunk");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ScreenShotService.LJIIIZ().LJI("friends_find_friends_page");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ScreenShotService.LJIIIZ().LIZ("friends_find_friends_page", new C58074Mqk());
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int getLayoutRes() {
        return this.LJLJLLL;
    }

    public static boolean Jl(RecFriendsFragment recFriendsFragment) {
        recFriendsFragment.getClass();
        if (NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getNetworkStatus() != EnumC41264GHk.NOT_AVAILABLE) {
            return true;
        }
        ActivityC45651qj mo49getActivity = recFriendsFragment.mo49getActivity();
        if (mo49getActivity == null) {
            return false;
        }
        C73305Spp c73305Spp = recFriendsFragment.LJLJJL;
        if (c73305Spp != null) {
            C25678A5y.LIZ(mo49getActivity, "find_friends", null, c73305Spp);
            return false;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Dl(InterfaceC65350Pko<? extends Fragment> interfaceC65350Pko) {
        C221018lt.LJFF("[ffp]", "rec friends show again!");
        new C9UA("normal", wl().getPreviousPage(), wl().getNewMafCount()).LIZLLL(null);
        if (!o.LJ(interfaceC65350Pko, C78685UuP.LJJLIL(false))) {
            Il().jv0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [androidx.recyclerview.widget.GridLayoutManager, com.ss.android.ugc.aweme.views.WrapGridLayoutManager] */
    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Gl(View view) {
        Object LIZJ;
        WrapLinearLayoutManager wrapLinearLayoutManager;
        this.LJLJJL = (C73305Spp) C7MY.LIZLLL(view, "view", R.id.kf_, "view.findViewById(R.id.status_view)");
        View findViewById = view.findViewById(R.id.i04);
        SYL syl = (SYL) findViewById;
        syl.setOrientation(1);
        syl.setLifecycleOwner(this);
        o.LJIIIIZZ(findViewById, "view.findViewById<PowerL…riendsFragment)\n        }");
        this.LJLJJLL = (SYL) findViewById;
        C57858MnG c57858MnG = new C57858MnG(null, this, 1);
        c57858MnG.LIZ(new AqS175S0100000_9(this, 10));
        c57858MnG.LIZJ(new AqS175S0100000_9(this, 11));
        c57858MnG.LIZLLL(new AqS175S0100000_9(this, 4));
        c57858MnG.LIZIZ(C25775A9r.LJLIL);
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
        C65776Prg LIZ2 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
        if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
            C57866MnO c57866MnO = c57858MnG.LJFF;
            if (c57866MnO.LJIILJJIL == null) {
                c57866MnO.LJIILJJIL = Boolean.TRUE;
            }
        }
        C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC58014Mpm.class);
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
            AbstractC58014Mpm abstractC58014Mpm = (AbstractC58014Mpm) LIZJ;
            this.LJLJL = abstractC58014Mpm;
            ((C57934MoU) abstractC58014Mpm).LJIILL(null);
            AbstractC58014Mpm abstractC58014Mpm2 = this.LJLJL;
            if (abstractC58014Mpm2 != null) {
                ((C57934MoU) abstractC58014Mpm2).W7(this);
                InterfaceC57910Mo6 interfaceC57910Mo6 = (InterfaceC57910Mo6) this.LJLJJI.getValue();
                if (interfaceC57910Mo6 != null) {
                    AbstractC58014Mpm abstractC58014Mpm3 = this.LJLJL;
                    if (abstractC58014Mpm3 != null) {
                        ((C57934MoU) abstractC58014Mpm3).W7(interfaceC57910Mo6);
                    } else {
                        o.LJIJI("userCardChunk");
                        throw null;
                    }
                }
                SYL syl2 = this.LJLJJLL;
                if (syl2 != null) {
                    AbstractC58014Mpm abstractC58014Mpm4 = this.LJLJL;
                    if (abstractC58014Mpm4 != null) {
                        syl2.setItemAnimator(((C57934MoU) abstractC58014Mpm4).getItemAnimator());
                        SYL syl3 = this.LJLJJLL;
                        if (syl3 != null) {
                            if (C52342KgU.LIZIZ()) {
                                getContext();
                                ?? wrapGridLayoutManager = new WrapGridLayoutManager(2);
                                SYL syl4 = this.LJLJJLL;
                                if (syl4 != null) {
                                    syl4.setPadding(C7MY.LIZIZ(6), C7MY.LIZIZ(6), C7MY.LIZIZ(6), O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
                                    wrapGridLayoutManager.LLIILII = new IDcS38S0100000_9(this, 1);
                                    wrapLinearLayoutManager = wrapGridLayoutManager;
                                } else {
                                    o.LJIJI("powerList");
                                    throw null;
                                }
                            } else {
                                getContext();
                                wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
                            }
                            syl3.setLayoutManager(wrapLinearLayoutManager);
                            this.LJLJLJ = new C58075Mql();
                            new C9UA("normal", wl().getPreviousPage(), wl().getNewMafCount()).LIZLLL(null);
                            SYL syl5 = this.LJLJJLL;
                            if (syl5 != null) {
                                syl5.LJIIJJI(new IDrS43S0100000_3(this, 6));
                                return;
                            } else {
                                o.LJIJI("powerList");
                                throw null;
                            }
                        }
                        o.LJIJI("powerList");
                        throw null;
                    }
                    o.LJIJI("userCardChunk");
                    throw null;
                }
                o.LJIJI("powerList");
                throw null;
            }
            o.LJIJI("userCardChunk");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        AbstractC72932td c72922tc;
        List<InterfaceC57784Mm4> LIZ;
        List<InterfaceC57784Mm4> LIZ2;
        o.LJIIIZ(state, "state");
        P29 p29 = vl().LJLJLJ;
        p29.getClass();
        P2A p2a = p29.LIZJ;
        if (p2a != null && p2a.LIZLLL.LJLIL == -1) {
            AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
            if (abstractC72932td instanceof C3C1) {
                p2a.LIZLLL = C58073Mqj.L(p2a.LIZLLL, System.currentTimeMillis() - p2a.LJFF, EnumC58072Mqi.FAIL, 10);
            } else if (abstractC72932td instanceof C72912tb) {
                long currentTimeMillis = System.currentTimeMillis() - p2a.LJFF;
                C58073Mqj c58073Mqj = p2a.LIZLLL;
                EnumC58072Mqi status = EnumC58072Mqi.SUCCESS;
                int LIZ3 = state.LIZ();
                boolean z = ((C223208pQ) ((C72912tb) abstractC72932td).LIZ).LJLILLLLZI;
                c58073Mqj.getClass();
                o.LJIIIZ(status, "status");
                p2a.LIZLLL = new C58073Mqj(currentTimeMillis, LIZ3, status, z);
            }
        }
        RecFriendsVM Il = Il();
        Il.getClass();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("user card state: ");
        LIZ4.append(state);
        C221018lt.LJFF("[ffp]_RecFriends", X1D.LIZIZ(LIZ4));
        AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td2 = state.LIZJ;
        if ((state.LIZ instanceof C72912tb) && (abstractC72932td2 instanceof C72912tb) && ((List) ((C72912tb) abstractC72932td2).LIZ).isEmpty()) {
            int length = EnumC58046MqI.values().length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (!r6[i].isGrant()) {
                        Il.LJLILLLLZI.gv0(C65352Pkq.LIZ(NeedAuthFragment.class));
                        break;
                    }
                    i++;
                } else {
                    Il.LJLILLLLZI.gv0(C65352Pkq.LIZ(RecEmptyFragment.class));
                    break;
                }
            }
        }
        AbstractC72932td<C223208pQ> abstractC72932td3 = state.LIZ;
        if (abstractC72932td3 instanceof C3C1) {
            c72922tc = new C3C1(((C3C1) abstractC72932td3).LIZ);
        } else {
            C57778Mly c57778Mly = Il.LJLJJL;
            AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td4 = state.LIZJ;
            if ((abstractC72932td4 instanceof C33X) || (abstractC72932td4 instanceof C72922tc) || (((LIZ = c57778Mly.LIZJ.LIZ()) != null && LIZ.isEmpty() && (state.LIZ instanceof C72922tc)) || ((LIZ2 = abstractC72932td4.LIZ()) != null && LIZ2.isEmpty()))) {
                c72922tc = new C72922tc();
            } else {
                c72922tc = new C72912tb(C76800UCe.LIZ);
            }
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("rec friends page status: ");
        LIZ5.append(C16880lQ.LJLLJ(c72922tc.getClass()));
        C221018lt.LJFF("[ffp]_RecFriends", X1D.LIZIZ(LIZ5));
        Il.LJLJJL = state;
        Il.setState(new AqS175S0100000_9(c72922tc, (AbstractC72932td<CreatorNoticeResponse>) 401));
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
