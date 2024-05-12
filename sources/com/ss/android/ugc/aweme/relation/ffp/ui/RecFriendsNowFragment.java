package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC57781Mm1;
import X.AbstractC57828Mmm;
import X.AbstractC58014Mpm;
import X.AbstractC72932td;
import X.C188727au;
import X.C221108m2;
import X.C223208pQ;
import X.C223338pd;
import X.C25770A9m;
import X.C25771A9n;
import X.C32151Nz;
import X.C33X;
import X.C3C1;
import X.C57778Mly;
import X.C57858MnG;
import X.C57859MnH;
import X.C57866MnO;
import X.C57867MnP;
import X.C57885Mnh;
import X.C57930MoQ;
import X.C57934MoU;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72912tb;
import X.C72922tc;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C94293mz;
import X.C9UA;
import X.EnumC198697qz;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.InterfaceC57910Mo6;
import X.SIT;
import X.SYL;
import X.Z89;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecFriendsNowFragment extends FFPBaseFragment implements InterfaceC57910Mo6 {
    public AbstractC58014Mpm LJLJJI;
    public SIT LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final int LJLJI = R.layout.ay0;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 533));

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    public final C73305Spp Il() {
        return (C73305Spp) this.LJLJLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC58014Mpm abstractC58014Mpm = this.LJLJJI;
        if (abstractC58014Mpm != null) {
            ((C57934MoU) abstractC58014Mpm).K8(this);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int getLayoutRes() {
        return this.LJLJI;
    }

    public final void A90(boolean z) {
        View _$_findCachedViewById;
        C223338pd c223338pd = (C223338pd) _$_findCachedViewById(R.id.g94);
        if (c223338pd == null || (_$_findCachedViewById = _$_findCachedViewById(R.id.h7r)) == null) {
            return;
        }
        if (z) {
            c223338pd.setVisibility(0);
            c223338pd.LIZIZ();
            _$_findCachedViewById.setVisibility(8);
        } else {
            c223338pd.setVisibility(8);
            _$_findCachedViewById.setVisibility(0);
            c223338pd.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Gl(View view) {
        Object LIZJ;
        o.LJIIIZ(view, "view");
        this.LJLJJL = Z89.LIZIZ.LJIIIIZZ(EnumC198697qz.FFP, mo49getActivity(), this);
        SYL syl = (SYL) _$_findCachedViewById(R.id.h7r);
        SIT sit = this.LJLJJL;
        if (sit != null) {
            syl.LLLF.LLD(sit);
            C57858MnG c57858MnG = new C57858MnG(null, this, 1);
            c57858MnG.LIZLLL(new AqS175S0100000_9(this, 244));
            c57858MnG.LIZIZ(C57885Mnh.LJLIL);
            c57858MnG.LIZ(new AqS175S0100000_9(this, 245));
            c57858MnG.LIZJ(new AqS175S0100000_9(this, 246));
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
                this.LJLJJI = abstractC58014Mpm;
                ((C57934MoU) abstractC58014Mpm).LJIILL(null);
                AbstractC58014Mpm abstractC58014Mpm2 = this.LJLJJI;
                if (abstractC58014Mpm2 != null) {
                    ((C57934MoU) abstractC58014Mpm2).W7(this);
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.h7r);
                    AbstractC58014Mpm abstractC58014Mpm3 = this.LJLJJI;
                    if (abstractC58014Mpm3 != null) {
                        recyclerView.setItemAnimator(((C57934MoU) abstractC58014Mpm3).getItemAnimator());
                        SYL syl2 = (SYL) _$_findCachedViewById(R.id.h7r);
                        AbstractC58014Mpm abstractC58014Mpm4 = this.LJLJJI;
                        if (abstractC58014Mpm4 != null) {
                            syl2.LLLF.LLD(abstractC58014Mpm4);
                            AbstractC58014Mpm abstractC58014Mpm5 = this.LJLJJI;
                            if (abstractC58014Mpm5 != null) {
                                RecyclerView now_power_list = (RecyclerView) _$_findCachedViewById(R.id.h7r);
                                o.LJIIIIZZ(now_power_list, "now_power_list");
                                ((C57934MoU) abstractC58014Mpm5).LJLJJLL.LJIJJLI(now_power_list);
                                AbstractC58014Mpm abstractC58014Mpm6 = this.LJLJJI;
                                if (abstractC58014Mpm6 != null) {
                                    ((C57934MoU) abstractC58014Mpm6).LJLJLJ(false);
                                    new C9UA("normal", wl().getPreviousPage(), wl().getNewMafCount()).LIZLLL(null);
                                    return;
                                } else {
                                    o.LJIJI("userCardChunk");
                                    throw null;
                                }
                            }
                            o.LJIJI("userCardChunk");
                            throw null;
                        }
                        o.LJIJI("userCardChunk");
                        throw null;
                    }
                    o.LJIJI("userCardChunk");
                    throw null;
                }
                o.LJIJI("userCardChunk");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
        }
        o.LJIJI("inviteChunk");
        throw null;
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
        if ((abstractC72932td instanceof C33X) || (abstractC72932td instanceof C72922tc)) {
            A90(true);
            return;
        }
        if (abstractC72932td instanceof C3C1) {
            Il().setTopMargin(C32151Nz.LJIIZILJ(124));
            Il().setButtonTopMargin(C32151Nz.LJIIZILJ(208));
            C73305Spp Il = Il();
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJ(c73306Spq, new AqS159S0100000_9(this, 17));
            Il.setStatus(c73306Spq);
            Jl(Il(), true);
            A90(false);
            return;
        }
        if (!(abstractC72932td instanceof C72912tb)) {
            return;
        }
        AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td2 = state.LIZJ;
        if (!(abstractC72932td2 instanceof C72912tb)) {
            return;
        }
        if (((List) ((C72912tb) abstractC72932td2).LIZ).isEmpty()) {
            Il().setTopMargin(C32151Nz.LJIIZILJ(204));
            C73305Spp Il2 = Il();
            C73306Spq c73306Spq2 = new C73306Spq();
            String string = getString(R.string.j34);
            o.LJIIIIZZ(string, "getString(R.string.now_invite_empty_body)");
            c73306Spq2.LJI = string;
            Il2.setStatus(c73306Spq2);
            Jl(Il(), true);
            A90(false);
        } else {
            A90(false);
            Jl(Il(), false);
        }
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_now");
        c188727au.LIZLLL(((Number) state.LJFF.getValue()).intValue(), "new_suggested_account_cnt");
        FMX.LJIIL("enter_now_find_friends", c188727au.LIZ);
    }

    public final void Jl(C73305Spp c73305Spp, boolean z) {
        if (z) {
            if (this.LJLJJLL) {
                c73305Spp.setVisibility(0);
                return;
            }
            this.LJLJJLL = true;
            SIT sit = this.LJLJJL;
            if (sit != null) {
                sit.LIZ(c73305Spp);
                return;
            } else {
                o.LJIJI("inviteChunk");
                throw null;
            }
        }
        if (!this.LJLJJLL) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
