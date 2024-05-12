package com.ss.android.ugc.aweme.following.ui;

import X.AYA;
import X.AbstractC029409q;
import X.AbstractC57781Mm1;
import X.AbstractC57896Mns;
import X.AbstractC58014Mpm;
import X.AnonymousClass391;
import X.C03880Dg;
import X.C04330Ez;
import X.C0A2;
import X.C10K;
import X.C110614Vt;
import X.C117374j7;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C25600zU;
import X.C25770A9m;
import X.C25771A9n;
import X.C26338AVi;
import X.C26374AWs;
import X.C26419AYl;
import X.C26421AYn;
import X.C27743Auh;
import X.C28871Bj;
import X.C38776FJs;
import X.C42398GkU;
import X.C52218KeU;
import X.C52342KgU;
import X.C53299Kvv;
import X.C53797L9l;
import X.C53882LCs;
import X.C54502LaE;
import X.C54960Lhc;
import X.C56747MOx;
import X.C57451Mgh;
import X.C57780Mm0;
import X.C57838Mmw;
import X.C57858MnG;
import X.C57859MnH;
import X.C57866MnO;
import X.C57867MnP;
import X.C57890Mnm;
import X.C57900Mnw;
import X.C57930MoQ;
import X.C58017Mpp;
import X.C58093Mr3;
import X.C58094Mr4;
import X.C58095Mr5;
import X.C58428MwS;
import X.C58701N2b;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C70857RrR;
import X.C72867Sil;
import X.C72908SjQ;
import X.C72909SjR;
import X.C72910SjS;
import X.C72919Sjb;
import X.C72920Sjc;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73165SnZ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73343SqR;
import X.C73345SqT;
import X.C73353Sqb;
import X.C78605Ut7;
import X.C78983UzD;
import X.C79004UzY;
import X.C79045V0n;
import X.C7MY;
import X.C84783Uk;
import X.C86V;
import X.C8DP;
import X.C8VV;
import X.C94293mz;
import X.C97653sP;
import X.C97843si;
import X.C99W;
import X.EnumC1804076e;
import X.EnumC26917AhN;
import X.HG3;
import X.InterfaceC228778yP;
import X.InterfaceC57702Mkk;
import X.InterfaceC57760Mlg;
import X.InterfaceC65350Pko;
import X.InterfaceC72447Sbz;
import X.InterfaceC92693kP;
import X.KL2;
import X.MPS;
import X.N2Y;
import X.NOL;
import X.OQN;
import X.QD3;
import X.QX2;
import X.RBX;
import X.TBT;
import X.ViewOnClickListenerC226978vV;
import Y.ACListenerS32S0100000_12;
import Y.ACallableS113S0100000_10;
import Y.IDObjectS183S0100000_12;
import Y.IDcS38S0100000_9;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.following.ui.FollowingRelationFragment;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.experiment.Config;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes10.dex */
public final class FollowingRelationFragment extends BaseRelationFragment {
    public final lifecycleAwareLazy LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C28871Bj LJLLLL;
    public FollowListAdapter LJLLLLLL;
    public C58094Mr4 LJLZ;
    public C58093Mr3 LJZ;
    public final C62822Ol8 LJZI;
    public boolean LJZL;
    public C27743Auh LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final NOL LLFF;
    public final C57451Mgh LLFFF;
    public String LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public C56747MOx LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public long LLIIIILZ;
    public final Map<Integer, View> LLIIIJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int Al() {
        return R.layout.c4f;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int Dl() {
        return R.string.pfn;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIJ;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public FollowingRelationFragment() {
        AqS194S0100000_12 aqS194S0100000_12 = new AqS194S0100000_12(this, 128);
        C65776Prg LIZ = C65352Pkq.LIZ(FollowingRelationViewModel.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 242);
        this.LJLLI = new lifecycleAwareLazy(this, aqS160S0100000_10, new AqS72S0400000_12(this, aqS160S0100000_10, LIZ, aqS194S0100000_12, 17));
        C65776Prg LIZ2 = C65352Pkq.LIZ(FollowRelationTabViewModel.class);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ2, LIZ2, 142));
        this.LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 582));
        this.LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 581));
        this.LJLLLL = new C28871Bj((AbstractC029409q<? extends RecyclerView.ViewHolder>[]) new AbstractC029409q[0]);
        this.LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 65));
        this.LLD = C221108m2.LIZIZ(new AqS154S0100000_4(this, 354));
        this.LLF = C221108m2.LIZIZ(new AqS162S0100000_12(this, 580));
        this.LLFF = new NOL();
        this.LLFFF = new C57451Mgh();
        this.LLFII = "";
        this.LLFZ = true;
        this.LLI = true;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void Jl() {
        InterfaceC57760Mlg interfaceC57760Mlg = (InterfaceC57760Mlg) this.LLD.getValue();
        if (interfaceC57760Mlg != null) {
            interfaceC57760Mlg.k0();
        }
        InterfaceC72447Sbz Pl = Pl();
        if (Pl != null) {
            Pl.k0();
        }
        C73345SqT LIZIZ = C73353Sqb.LIZIZ();
        if (!LIZIZ.LIZLLL) {
            C73343SqR.LJFF(LIZIZ, LIZIZ.LJFF(), 7);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJ() {
        C58093Mr3 c58093Mr3 = this.LJZ;
        if (c58093Mr3 != null && c58093Mr3.LJLJJL) {
            c58093Mr3.LJLJJL = false;
            c58093Mr3.LIZIZ(null);
        }
        Ol().LJLJLLL.refresh();
    }

    public final FollowingRelationViewModel Ol() {
        return (FollowingRelationViewModel) this.LJLLI.getValue();
    }

    public final InterfaceC72447Sbz Pl() {
        return (InterfaceC72447Sbz) this.LLF.getValue();
    }

    public final void Vl() {
        List<IMUser> LJIIIIZZ;
        if (this.LLFII.length() == 0) {
            return;
        }
        NOL nol = this.LLFF;
        String keyWord = this.LLFII;
        nol.getClass();
        o.LJIIIZ(keyWord, "keyWord");
        if (TextUtils.isEmpty(keyWord)) {
            LJIIIIZZ = new ArrayList();
        } else {
            LJIIIIZZ = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIIIZZ(keyWord, nol.LIZ);
        }
        ArrayList arrayList = new ArrayList();
        if (LJIIIIZZ != null) {
            for (IMUser iMUser : LJIIIIZZ) {
                if (iMUser.getFollowStatus() != 4) {
                    arrayList.add(iMUser);
                }
            }
        }
        if (C79004UzY.LJJIFFI(arrayList)) {
            ((C73305Spp) _$_findCachedViewById(R.id.kfh)).setVisibility(0);
            C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kfh);
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIIZ(c73306Spq);
            c73305Spp.setStatus(c73306Spq);
        } else {
            ((C73305Spp) _$_findCachedViewById(R.id.kfh)).setVisibility(8);
        }
        this.LLIIII = false;
        this.LLFFF.setData(arrayList);
        this.LLFFF.LJLIL = this.LLFII;
    }

    public final void Wl() {
        C73305Spp c73305Spp;
        if (this.LJZL) {
            return;
        }
        C73305Spp c73305Spp2 = (C73305Spp) _$_findCachedViewById(R.id.kfh);
        if (c73305Spp2 != null) {
            c73305Spp2.setVisibility(0);
        }
        C73305Spp c73305Spp3 = (C73305Spp) _$_findCachedViewById(R.id.kfh);
        if (c73305Spp3 != null) {
            c73305Spp3.setStatus((C73306Spq) this.LJLJLJ.getValue());
        }
        if (C53299Kvv.LIZJ() && (c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kfh)) != null) {
            c73305Spp.setLayoutVariant(0);
        }
    }

    public final void Zl() {
        FollowListAdapter followListAdapter = this.LJLLLLLL;
        if (followListAdapter != null) {
            if (followListAdapter.getItemCount() > 0) {
                FollowListAdapter followListAdapter2 = this.LJLLLLLL;
                if (followListAdapter2 != null) {
                    if (followListAdapter2.LJLIL == null && !e1.LIZ(31744, "relation_following_sort_by_crash_fix", true, false)) {
                        FollowListAdapter followListAdapter3 = this.LJLLLLLL;
                        if (followListAdapter3 != null) {
                            C27743Auh c27743Auh = this.LL;
                            if (c27743Auh != null) {
                                followListAdapter3.LJLIL = c27743Auh;
                                followListAdapter3.notifyItemInserted(0);
                            }
                        } else {
                            o.LJIJI("mFollowingListAdapter");
                            throw null;
                        }
                    }
                    KL2.LJIILLIIL(0, this.LL);
                    for (AbstractC029409q<? extends RecyclerView.ViewHolder> abstractC029409q : this.LJLLLL.LJLZ()) {
                        if (abstractC029409q.getItemCount() > 0) {
                            if (abstractC029409q instanceof FollowListAdapter) {
                                C27743Auh c27743Auh2 = this.LL;
                                if (c27743Auh2 != null) {
                                    c27743Auh2.setStyle("left");
                                    return;
                                }
                                return;
                            }
                            C27743Auh c27743Auh3 = this.LL;
                            if (c27743Auh3 == null) {
                                return;
                            }
                            c27743Auh3.setStyle("right");
                            return;
                        }
                    }
                    return;
                }
                o.LJIJI("mFollowingListAdapter");
                throw null;
            }
            KL2.LJIILLIIL(8, this.LL);
            return;
        }
        o.LJIJI("mFollowingListAdapter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJJIJL() {
        InterfaceC72447Sbz Pl = Pl();
        if (Pl != null) {
            Pl.qy();
        }
    }

    public final boolean Ml() {
        Config LIZ;
        if (!Hl() || (LIZ = C26374AWs.LIZ()) == null || LIZ.recommendFriendsInSelfFollowingList != 1) {
            return false;
        }
        return true;
    }

    public final void Nl() {
        if (!C52218KeU.LIZ() || !Hl()) {
            return;
        }
        if (getUserVisibleHint() && isResumed()) {
            if (this.LLIIIILZ <= 0 || System.currentTimeMillis() - this.LLIIIILZ <= 60000) {
                return;
            }
            ListMiddleware<FollowingRelationState, Object, C72909SjR> listMiddleware = Ol().LJLJLLL;
            C58428MwS predicate = C58428MwS.LJLIL;
            listMiddleware.getClass();
            o.LJIIJ(predicate, "predicate");
            AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(listMiddleware, predicate, 139);
            JediViewModel<FollowingRelationState> jediViewModel = listMiddleware.LJLILLLLZI;
            if (jediViewModel != null) {
                jediViewModel.Gv0(new AqS143S0200000_12(listMiddleware, aqS135S0200000_4, 21));
                Ol().LJLJLLL.refresh();
                this.LLIIIILZ = 0L;
                return;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        this.LLIIIILZ = System.currentTimeMillis();
    }

    public final boolean Sl() {
        return ((Boolean) withState(Ol(), C72910SjS.LJLIL)).booleanValue();
    }

    public final void Tl() {
        ((C73305Spp) _$_findCachedViewById(R.id.kfh)).setVisibility(8);
        this.LLIIII = false;
        this.LLFII = "";
        ((ImageView) _$_findCachedViewById(R.id.avg)).setVisibility(8);
        this.LLFFF.setData(new ArrayList());
        this.LLFFF.LJLIL = this.LLFII;
    }

    public final void Yl() {
        if (Hl()) {
            boolean z = false;
            if (this.LLI) {
                C56747MOx c56747MOx = this.LLIFFJFJJ;
                if (c56747MOx != null) {
                    c56747MOx.LIZ();
                }
                this.LLI = false;
                return;
            }
            C56747MOx c56747MOx2 = this.LLIFFJFJJ;
            if (c56747MOx2 == null || c56747MOx2.LIZIZ == null || c56747MOx2.LIZ == null || c56747MOx2.LIZJ == null) {
                return;
            }
            if (System.currentTimeMillis() - C38776FJs.LJIIL().LIZIZ(c56747MOx2.LIZIZ, "key_cross_push_notification_guide") > C56747MOx.LJFF * 86400000) {
                z = true;
            }
            if (C97843si.LIZ()) {
                if (C97653sP.LIZ() && z) {
                    return;
                }
                c56747MOx2.LIZ.setVisibility(8);
                return;
            }
            if (z && C38776FJs.LJIIL().LIZIZ(c56747MOx2.LIZIZ, "key_times_push_notification_guide") < C56747MOx.LJ) {
                return;
            }
            c56747MOx2.LIZ.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final String getEnterFrom() {
        if (Hl()) {
            return "following";
        }
        return "other_following";
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC92693kP interfaceC92693kP;
        C53882LCs c53882LCs;
        AnimatorSet animatorSet;
        super.onDestroy();
        FollowListAdapter followListAdapter = this.LJLLLLLL;
        if (followListAdapter != null && (c53882LCs = followListAdapter.LJLLI) != null && (animatorSet = c53882LCs.LJIIIIZZ) != null) {
            animatorSet.cancel();
            c53882LCs.LJII = false;
            c53882LCs.LIZLLL = false;
        }
        C54960Lhc.LIZ.LIZLLL();
        C54502LaE.LIZLLL("follow_relation", EnumC1804076e.CANCEL, 4);
        C73353Sqb.LIZIZ().LIZJ();
        C73353Sqb.LIZ().LIZJ();
        String str = this.LJLILLLLZI;
        if (C53299Kvv.LIZ() == 3 && (interfaceC92693kP = (InterfaceC92693kP) ((Map) C53797L9l.LIZ.getValue()).get(str)) != null) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Nl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Nl();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int wl() {
        if (Hl()) {
            return R.string.gkx;
        }
        return R.string.gky;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int xl() {
        Hl();
        return R.string.gks;
    }

    public final String Ql(int i) {
        String str;
        if (i != 2096) {
            if (i != 3002060) {
                String string = getString(R.string.pf1);
                o.LJIIIIZZ(string, "getString(R.string.profile_private_following_list)");
                return string;
            }
            Object[] objArr = new Object[1];
            User user = this.LJLJI;
            if (user != null) {
                str = user.getUniqueId();
            } else {
                str = null;
            }
            objArr[0] = str;
            String string2 = getString(R.string.gkv, objArr);
            o.LJIIIIZZ(string2, "getString(R.string.follo…cription, user?.uniqueId)");
            return string2;
        }
        String string3 = getString(R.string.pf1);
        o.LJIIIIZZ(string3, "getString(R.string.profile_private_following_list)");
        return string3;
    }

    public final String Rl(int i) {
        if (i != 2096) {
            if (i != 3002060) {
                String string = getString(R.string.pap);
                o.LJIIIIZZ(string, "getString(R.string.private_account_list_title)");
                return string;
            }
            String string2 = getString(R.string.gkw);
            o.LJIIIIZZ(string2, "getString(R.string.following_list_private_title)");
            return string2;
        }
        String string3 = getString(R.string.pap);
        o.LJIIIIZZ(string3, "getString(R.string.private_account_list_title)");
        return string3;
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str != null) {
            if (s.LJJJLZIJ(str, "/aweme/v1/user/follower/list/?", false) || s.LJJJLZIJ(str, "/aweme/v1/user/following/list/?", false)) {
                EventBus.LIZJ().LIZIZ(event);
                LJ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "2052459152524761191");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/following/ui/FollowingRelationFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/following/ui/FollowingRelationFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (!this.LLII) {
                this.LLII = true;
                C54502LaE.LIZ("follow_relation");
            }
        } else if (_$_findCachedViewById(R.id.czx) != null) {
            AYA.LIZ(mo49getActivity(), _$_findCachedViewById(R.id.czx));
        }
        Nl();
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/following/ui/FollowingRelationFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void Xl(String str, String str2) {
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.dlm);
        C73306Spq c73306Spq = new C73306Spq();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_lock;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        c73306Spq.LJFF = str;
        c73306Spq.LJI = str2;
        c73305Spp.setStatus(c73306Spq);
        ((C73305Spp) _$_findCachedViewById(R.id.dlm)).setVisibility(0);
        if (C53299Kvv.LIZJ()) {
            ((C73305Spp) _$_findCachedViewById(R.id.dlm)).setLayoutVariant(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [X.2ff] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        GridLayoutManager gridLayoutManager;
        Context context;
        boolean z;
        Object LIZJ;
        int i;
        C58094Mr4 c58094Mr4;
        C26421AYn c26421AYn;
        boolean z2;
        boolean z3;
        Integer num;
        Drawable drawable;
        Integer LJI;
        PrivacySetting privacySetting;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        User user = this.LJLJI;
        if (user != null && (privacySetting = user.getPrivacySetting()) != null && privacySetting.getFollowingVisibility() == 2) {
            Xl(Rl(3002060), Ql(3002060));
            return;
        }
        mo49getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.LLJJIII(1);
        ((RecyclerView) _$_findCachedViewById(R.id.j_9)).setLayoutManager(wrapLinearLayoutManager);
        ((RecyclerView) _$_findCachedViewById(R.id.j_9)).setItemAnimator(new C117374j7());
        C8DP.LIZ(8, (RecyclerView) _$_findCachedViewById(R.id.j_9));
        if (Hl()) {
            ((ViewOnClickListenerC226978vV) _$_findCachedViewById(R.id.dxc)).setIconImage(R.drawable.by4);
            SpannableString spannableString = new SpannableString(C86V.LJFF(R.string.gl0));
            SpannableString spannableString2 = new SpannableString(C42398GkU.LIZIZ(C86V.LJFF(R.string.gl1), ' '));
            Context context2 = getContext();
            o.LJI(context2);
            spannableString2.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context2, R.color.ck)), 0, spannableString2.length(), 34);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannableString2);
            if (getContext() != null) {
                Context context3 = getContext();
                o.LJI(context3);
                spannableString.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context3, R.color.q5)), 0, spannableString.length(), 34);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            ((ViewOnClickListenerC226978vV) _$_findCachedViewById(R.id.dxc)).setTitleText(spannableStringBuilder);
            C56747MOx c56747MOx = new C56747MOx((ViewOnClickListenerC226978vV) _$_findCachedViewById(R.id.dxc), new OQN());
            this.LLIFFJFJJ = c56747MOx;
            c56747MOx.LIZLLL = MPS.Follow;
        }
        FollowListAdapter followListAdapter = new FollowListAdapter(this, "following_relation", Hl(), ((FollowRelationTabViewModel) this.LJLLILLLL.getValue()).LJLJJLL);
        String str = this.LJLJJL;
        o.LJIIIZ(str, "<set-?>");
        followListAdapter.LJLJLLL = str;
        this.LJLLLLLL = followListAdapter;
        followListAdapter.setLoadEmptyText((CharSequence) null);
        C28871Bj c28871Bj = this.LJLLLL;
        FollowListAdapter followListAdapter2 = this.LJLLLLLL;
        if (followListAdapter2 != null) {
            c28871Bj.LJLLLLLL(followListAdapter2);
            ((RecyclerView) _$_findCachedViewById(R.id.j_9)).setAdapter(this.LJLLLL);
            FollowListAdapter followListAdapter3 = this.LJLLLLLL;
            if (followListAdapter3 != null) {
                followListAdapter3.setLoadMoreListener(new AqS162S0100000_12(this, 992));
                RecyclerView rv_list = (RecyclerView) _$_findCachedViewById(R.id.j_9);
                o.LJIIIIZZ(rv_list, "rv_list");
                new C72919Sjb(rv_list, new C58095Mr5(this));
                Context context4 = getContext();
                if (context4 != null && (LJI = C79045V0n.LJI(R.attr.cl, C78605Ut7.LJIIIIZZ(context4))) != null) {
                    int intValue = LJI.intValue();
                    _$_findCachedViewById(R.id.jfv).setBackgroundColor(intValue);
                    _$_findCachedViewById(R.id.je_).setBackgroundColor(intValue);
                }
                if (((Boolean) this.LJLLL.getValue()).booleanValue()) {
                    if (C99W.LIZ) {
                        View _$_findCachedViewById = _$_findCachedViewById(R.id.deg);
                        Context context5 = getContext();
                        if (context5 != null) {
                            C25600zU LJIIIIZZ = C78605Ut7.LJIIIIZZ(context5);
                            C110614Vt c110614Vt = new C110614Vt();
                            c110614Vt.LIZJ = C61328O5c.LIZJ(6);
                            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
                            drawable = c110614Vt.LIZ(LJIIIIZZ);
                        } else {
                            drawable = null;
                        }
                        _$_findCachedViewById.setBackground(drawable);
                    }
                    TextView textView = (TextView) _$_findCachedViewById(R.id.czx);
                    o.LJII(textView, "null cannot be cast to non-null type android.widget.TextView");
                    textView.setHint(getResources().getString(R.string.gkr));
                    C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.avg), new ACListenerS32S0100000_12(this, 98));
                    ((TextView) _$_findCachedViewById(R.id.czx)).addTextChangedListener(new IDObjectS183S0100000_12(this, 3));
                    ((TextView) _$_findCachedViewById(R.id.czx)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.4kB
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                            if (i2 != 3) {
                                return false;
                            }
                            FollowingRelationFragment.this.Vl();
                            Editable text = ((C19K) FollowingRelationFragment.this._$_findCachedViewById(R.id.czx)).getText();
                            if (text != null && text.length() > 0) {
                                ((TextView) FollowingRelationFragment.this._$_findCachedViewById(R.id.czx)).setCursorVisible(false);
                                FollowingRelationFragment.this._$_findCachedViewById(R.id.czx).clearFocus();
                                AYA.LIZ(FollowingRelationFragment.this.requireActivity(), FollowingRelationFragment.this._$_findCachedViewById(R.id.czx));
                            }
                            return true;
                        }
                    });
                    final AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 989);
                    final AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(this, 990);
                    final C68322mC c68322mC = new C68322mC();
                    final C68322mC c68322mC2 = new C68322mC();
                    final ?? r15 = new InterfaceC228778yP() { // from class: X.2ff
                        /* JADX WARN: Type inference failed for: r0v6, types: [T, X.XKQ] */
                        @Override // X.InterfaceC228778yP
                        public final void onHide() {
                            InterfaceC79150V4o interfaceC79150V4o = c68322mC2.element;
                            if (interfaceC79150V4o != null) {
                                interfaceC79150V4o.LIZIZ(null);
                            }
                            c68322mC2.element = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C63032df(200L, aqS162S0100000_122, null), 3);
                        }

                        /* JADX WARN: Type inference failed for: r0v6, types: [T, X.XKQ] */
                        @Override // X.InterfaceC228778yP
                        public final void onShow() {
                            InterfaceC79150V4o interfaceC79150V4o = C68322mC.this.element;
                            if (interfaceC79150V4o != null) {
                                interfaceC79150V4o.LIZIZ(null);
                            }
                            C68322mC.this.element = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C63042dg(200L, aqS162S0100000_12, null), 3);
                        }
                    };
                    getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.following.ui.ext.KeyboardExtKt$observeKeyboard$1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                            o.LJIIIZ(source, "source");
                            o.LJIIIZ(event, "event");
                            if (event == Lifecycle.Event.ON_RESUME) {
                                KeyboardUtils.LIZ(Fragment.this.getViewLifecycleOwner(), Fragment.this.getView(), r15);
                            }
                        }
                    });
                    NOL nol = this.LLFF;
                    nol.getClass();
                    C10K.LIZJ(new ACallableS113S0100000_10(nol, 14));
                }
                if (((Boolean) this.LJLLJ.getValue()).booleanValue()) {
                    C8VV.LIZ(this, false, new AqS170S0100000_4(this, 871));
                }
                int i2 = 5;
                if (Ml() && this.LJLZ == null) {
                    User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                    if (curUser != null) {
                        i = curUser.getFollowingCount();
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
                        N2Y.LIZJ.getClass();
                        if (((Boolean) C58701N2b.LIZLLL.getValue()).booleanValue()) {
                            if (!o.LJ(N2Y.LIZLLL, ((RBX) HG3.LJIILL()).getCurUserId())) {
                                N2Y.LIZLLL = ((RBX) HG3.LJIILL()).getCurUserId();
                                long j = N2Y.LIZ().getLong("following_h_ff_t", -1L);
                                if (j != -1 && (num = N2Y.LIZIZ.unTopListSuggestCardDay) != null) {
                                    if (Math.abs((System.currentTimeMillis() - j) / 86400000) >= num.intValue()) {
                                        z2 = true;
                                        N2Y.LIZ().storeLong("following_h_ff_t", -1L);
                                        N2Y.LIZ().storeInt("following_exp_ff_c", 0);
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z2 = true;
                                }
                                N2Y.LJ = z2;
                                if (z2) {
                                    User curUser2 = ((RBX) HG3.LJIILL()).getCurUser();
                                    if (curUser2 == null || curUser2.getFriendCount() <= 5) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    N2Y.LJ = z3;
                                }
                            }
                            if (N2Y.LJ) {
                                List<C57900Mnw> LIZ = C58017Mpp.LJI.LIZ();
                                ArrayList LJ = AnonymousClass391.LJ(LIZ, "<this>");
                                for (C57900Mnw c57900Mnw : LIZ) {
                                    if (!c57900Mnw.LJLIL.isGrant()) {
                                        LJ.add(c57900Mnw);
                                    }
                                }
                                if (!LJ.isEmpty()) {
                                    Iterator it = LJ.iterator();
                                    while (it.hasNext()) {
                                        if (C78983UzD.LJJJLL((C57900Mnw) it.next())) {
                                            c58094Mr4 = new C58094Mr4();
                                            String previousPageMob = Gl();
                                            o.LJIIIZ(previousPageMob, "previousPageMob");
                                            C84783Uk c84783Uk = C84783Uk.LJLIL;
                                            InterfaceC57702Mkk interfaceC57702Mkk = c58094Mr4.LIZIZ;
                                            AbstractC57896Mns abstractC57896Mns = c58094Mr4.LIZ;
                                            if (C52218KeU.LIZ()) {
                                                c26421AYn = null;
                                            } else {
                                                c26421AYn = new C26421AYn(c84783Uk);
                                            }
                                            AbstractC029409q<?> LIZIZ = interfaceC57702Mkk.LIZIZ(new C57838Mmw(this, abstractC57896Mns, new AqS32S1000000_9(previousPageMob, 3), c26421AYn, new AqS175S0100000_9(c58094Mr4, 406)));
                                            o.LJIIIZ(LIZIZ, "<set-?>");
                                            c58094Mr4.LJ = LIZIZ;
                                            this.LJLLLL.LJLIL.LIZ(0, LIZIZ);
                                            this.LJLZ = c58094Mr4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c58094Mr4 = null;
                    this.LJLZ = c58094Mr4;
                }
                if (Ml() && this.LJZ == null) {
                    if (this.LJLZ == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C58093Mr3 c58093Mr3 = new C58093Mr3(z, (InterfaceC57760Mlg) this.LLD.getValue());
                    String previousPageMob2 = Gl();
                    o.LJIIIZ(previousPageMob2, "previousPageMob");
                    C57858MnG c57858MnG = new C57858MnG(null, this, 1);
                    c57858MnG.LIZ(C57890Mnm.LJLIL);
                    c57858MnG.LIZJ(new AqS32S1000000_9(previousPageMob2, 4));
                    c57858MnG.LIZIZ(new AqS175S0100000_9(c58093Mr3, 407));
                    c57858MnG.LIZLLL(C26419AYl.LJLIL);
                    IRelationUserCardInternalService.LIZ.getClass();
                    IRelationUserCardInternalService LIZ2 = C57930MoQ.LIZ();
                    C57867MnP c57867MnP = c57858MnG.LIZLLL;
                    if (c57867MnP.LIZLLL == -1) {
                        int i3 = c57858MnG.LJFF.LIZJ - 10;
                        if (i3 >= 5) {
                            i2 = i3;
                        }
                        c57867MnP.LIZLLL = i2;
                    }
                    C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
                    if (!o.LJ(LIZ3, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ3, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ3, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
                        C57866MnO c57866MnO = c57858MnG.LJFF;
                        if (c57866MnO.LJIILJJIL == null) {
                            c57866MnO.LJIILJJIL = Boolean.TRUE;
                        }
                    }
                    C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
                    C65776Prg LIZ4 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
                    if (o.LJ(LIZ4, C65352Pkq.LIZ(C25771A9n.class))) {
                        LIZJ = C94293mz.LIZ(LIZ2, c57859MnH, 2).getLayout();
                    } else if (o.LJ(LIZ4, C65352Pkq.LIZ(C25770A9m.class))) {
                        LIZJ = LIZ2.LIZIZ(c57859MnH, 0).getLayout();
                    } else if (o.LJ(LIZ4, C65352Pkq.LIZ(AbstractC58014Mpm.class))) {
                        LIZJ = LIZ2.LIZ(c57859MnH);
                    } else if (o.LJ(LIZ4, C65352Pkq.LIZ(AbstractC57781Mm1.class))) {
                        LIZJ = LIZ2.LIZJ(c57859MnH);
                    } else {
                        "type is error!".toString();
                        throw new IllegalStateException("type is error!");
                    }
                    if (LIZJ != null) {
                        c58093Mr3.LJLJL = (AbstractC57781Mm1) LIZJ;
                        ((C57780Mm0) c58093Mr3.LIZ()).LJIILL(null);
                        ((C57780Mm0) c58093Mr3.LIZ()).W7(c58093Mr3);
                        InterfaceC57760Mlg interfaceC57760Mlg = c58093Mr3.LJLILLLLZI;
                        if (interfaceC57760Mlg != null) {
                            ((C57780Mm0) c58093Mr3.LIZ()).W7(interfaceC57760Mlg);
                        }
                        this.LJZ = c58093Mr3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardAdapter");
                    }
                }
                if (C52218KeU.LIZ() && Hl() && (context = getContext()) != null) {
                    C27743Auh c27743Auh = new C27743Auh(context);
                    if (((Boolean) this.LJLLJ.getValue()).booleanValue()) {
                        C26338AVi.LJIIIZ(c27743Auh, Integer.valueOf(C7MY.LIZIZ(16)), Integer.valueOf(C7MY.LIZIZ(4)), Integer.valueOf(C7MY.LIZIZ(16)), Integer.valueOf(C7MY.LIZIZ(4)), 16);
                    }
                    c27743Auh.setSortChangeCallback(new AqS175S0100000_9(context, this, 377));
                    FollowingRelationViewModel Ol = Ol();
                    EnumC26917AhN enumC26917AhN = EnumC26917AhN.DEFAULT;
                    int value = enumC26917AhN.getValue();
                    Ol.getClass();
                    Ol.setState(new AqS36S0001000_12(value, 10));
                    FollowListAdapter followListAdapter4 = this.LJLLLLLL;
                    if (followListAdapter4 != null) {
                        followListAdapter4.LLF(enumC26917AhN.getValue());
                        this.LJLLLL.registerAdapterDataObserver(new C72920Sjc(this));
                        this.LL = c27743Auh;
                        FollowListAdapter followListAdapter5 = this.LJLLLLLL;
                        if (followListAdapter5 != null) {
                            if (followListAdapter5.LJLIL == null && e1.LIZ(31744, "relation_following_sort_by_crash_fix", true, false)) {
                                FollowListAdapter followListAdapter6 = this.LJLLLLLL;
                                if (followListAdapter6 != null) {
                                    C27743Auh c27743Auh2 = this.LL;
                                    if (c27743Auh2 != null) {
                                        followListAdapter6.LJLIL = c27743Auh2;
                                        followListAdapter6.notifyItemInserted(0);
                                    }
                                    KL2.LJIILLIIL(8, this.LL);
                                } else {
                                    o.LJIJI("mFollowingListAdapter");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("mFollowingListAdapter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mFollowingListAdapter");
                        throw null;
                    }
                }
                C73156SnQ.LJIIIIZZ(this, Ol(), new TBT() { // from class: X.Sj0
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((FollowingRelationState) obj).getSearchBarStatus();
                    }
                }, new AqS191S0100000_9(this, 62));
                C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLLILLLL.getValue(), new TBT() { // from class: X.AWl
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((FollowRelationState) obj).isFollowingTab());
                    }
                }, new AqS186S0100000_4(this, 242));
                ListMiddleware<FollowingRelationState, Object, C72909SjR> listMiddleware = Ol().LJLJLLL;
                FollowListAdapter followListAdapter7 = this.LJLLLLLL;
                if (followListAdapter7 != null) {
                    ListMiddleware.LJIIIIZZ(listMiddleware, this, followListAdapter7, false, new C70857RrR(new AqS178S0100000_12(this, 334), new AqS191S0100000_9(this, 63), new AqS191S0100000_9(this, 64)), new C72867Sil(new AqS178S0100000_12(this, 338), new AqS194S0100000_12(this, 164), new AqS194S0100000_12(this, 157)), new AqS191S0100000_9(this, 61), null, new AqS194S0100000_12(this, 159), 396);
                    FollowingRelationViewModel Ol2 = Ol();
                    C72908SjQ c72908SjQ = new TBT() { // from class: X.SjQ
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((FollowingRelationState) obj).getListState();
                        }
                    };
                    C73165SnZ<C73140SnA> c73165SnZ = new C73165SnZ<>();
                    c73165SnZ.LIZ = true;
                    selectSubscribe(Ol2, c72908SjQ, c73165SnZ, new AqS194S0100000_12(this, 162));
                    if (!this.LJLJJI) {
                        C58093Mr3 c58093Mr32 = this.LJZ;
                        if (c58093Mr32 != null && c58093Mr32.LJLJJL) {
                            c58093Mr32.LJLJJL = false;
                            c58093Mr32.LIZIZ(null);
                        }
                        Ol().LJLJLLL.refresh();
                    }
                    C73353Sqb.LIZIZ().LJII();
                    C73353Sqb.LIZIZ().LJIIIZ(0L);
                    InterfaceC72447Sbz Pl = Pl();
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j_9);
                    if (Pl != null && recyclerView != null) {
                        Pl.lp(recyclerView);
                    }
                    if (!C52342KgU.LIZIZ()) {
                        return;
                    }
                    RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j_9);
                    getContext();
                    recyclerView2.setLayoutManager(new WrapGridLayoutManager(2));
                    C0A2 layoutManager = ((RecyclerView) _$_findCachedViewById(R.id.j_9)).getLayoutManager();
                    if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
                        return;
                    }
                    gridLayoutManager.LLJLILLLLZIIL(new IDcS38S0100000_9(this, 3));
                    return;
                }
                o.LJIJI("mFollowingListAdapter");
                throw null;
            }
            o.LJIJI("mFollowingListAdapter");
            throw null;
        }
        o.LJIJI("mFollowingListAdapter");
        throw null;
    }
}
