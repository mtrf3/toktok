package com.ss.android.ugc.aweme.relation.recuser.dm;

import X.AbstractC57781Mm1;
import X.AbstractC57828Mmm;
import X.AbstractC58014Mpm;
import X.C25770A9m;
import X.C25771A9n;
import X.C34B;
import X.C53383KxH;
import X.C57768Mlo;
import X.C57769Mlp;
import X.C57770Mlq;
import X.C57778Mly;
import X.C57780Mm0;
import X.C57788Mm8;
import X.C57789Mm9;
import X.C57823Mmh;
import X.C57825Mmj;
import X.C57858MnG;
import X.C57859MnH;
import X.C57866MnO;
import X.C57867MnP;
import X.C57869MnR;
import X.C57930MoQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73040SlY;
import X.C94293mz;
import X.FFL;
import X.InterfaceC57910Mo6;
import X.InterfaceC98113t9;
import X.SU4;
import X.X1D;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LegacyDMRecUserCompatImpl implements InterfaceC98113t9, InterfaceC57910Mo6, LifecycleEventObserver {
    public final C57770Mlq LJLIL;
    public AbstractC57781Mm1 LJLILLLLZI;
    public final ChangeLiveData<C57778Mly> LJLJI;
    public final LiveData<Boolean> LJLJJI;
    public final boolean LJLJJL;

    public LegacyDMRecUserCompatImpl() {
        this(0);
    }

    @Override // X.InterfaceC98113t9
    public final AbstractC57781Mm1 LJJLIIIJJIZ() {
        AbstractC57781Mm1 abstractC57781Mm1 = this.LJLILLLLZI;
        if (abstractC57781Mm1 != null) {
            return abstractC57781Mm1;
        }
        o.LJIJI("adapter");
        throw null;
    }

    @Override // X.InterfaceC98113t9
    public final /* bridge */ /* synthetic */ ChangeLiveData LIZ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC98113t9
    public final boolean getEnable() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC98113t9
    public final LiveData<Boolean> isLoading() {
        return this.LJLJJI;
    }

    public LegacyDMRecUserCompatImpl(int i) {
        C57770Mlq c57770Mlq = new C57770Mlq();
        this.LJLIL = c57770Mlq;
        ChangeLiveData<C57778Mly> changeLiveData = new ChangeLiveData<>();
        this.LJLJI = changeLiveData;
        LiveData<Boolean> map = Transformations.map(changeLiveData, C73040SlY.LJLJJLL);
        o.LJIIIIZZ(map, "map(userCardState) { sta… -> false\n        }\n    }");
        this.LJLJJI = map;
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            RecommendFriendInDMExperimentModel recommendFriendInDMExperimentModel = C57769Mlp.LIZ;
            LJIIIZ.getClass();
            RecommendFriendInDMExperimentModel recommendFriendInDMExperimentModel2 = (RecommendFriendInDMExperimentModel) FFL.LJIJ(true, "recommend_friends_in_imchat", 31744, RecommendFriendInDMExperimentModel.class, recommendFriendInDMExperimentModel);
            if (recommendFriendInDMExperimentModel2 != null) {
                if (recommendFriendInDMExperimentModel2.showRecommend == 0) {
                    c57770Mlq.LIZ = false;
                } else {
                    c57770Mlq.LIZ = System.currentTimeMillis() >= C53383KxH.LIZ().LIZ.getLong("next_session_time_ms", -1L);
                }
            }
        } catch (Throwable unused) {
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldShowRecommendFriend ");
        LIZ.append(c57770Mlq.LIZ);
        C34B.LJI("RecommendFriendInDMAppearHelper", X1D.LIZIZ(LIZ));
        this.LJLJJL = c57770Mlq.LIZ;
    }

    @Override // X.InterfaceC98113t9
    public final void LIZIZ(Fragment fragment) {
        Object LIZJ;
        o.LJIIIZ(fragment, "fragment");
        C57858MnG c57858MnG = new C57858MnG(null, fragment, 1);
        c57858MnG.LIZJ(C57768Mlo.LJLIL);
        c57858MnG.LIZ(C57869MnR.LJLIL);
        c57858MnG.LIZLLL(new AqS175S0100000_9(this, 248));
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
        C65776Prg LIZ2 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
        if (!o.LJ(LIZ2, C65352Pkq.LIZ(C25771A9n.class)) && !o.LJ(LIZ2, C65352Pkq.LIZ(C25770A9m.class)) && (o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC58014Mpm.class)) || o.LJ(LIZ2, C65352Pkq.LIZ(AbstractC57781Mm1.class)))) {
            C57866MnO c57866MnO = c57858MnG.LJFF;
            if (c57866MnO.LJIILJJIL == null) {
                c57866MnO.LJIILJJIL = Boolean.TRUE;
            }
        }
        C57859MnH c57859MnH = new C57859MnH(c57858MnG.LIZ, c57858MnG.LIZIZ, c57858MnG.LIZJ, c57858MnG.LIZLLL, c57858MnG.LJ, c57858MnG.LJFF, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(AbstractC57781Mm1.class);
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
            this.LJLILLLLZI = (AbstractC57781Mm1) LIZJ;
            fragment.getLifecycle().addObserver(this);
            ((C57780Mm0) LJJLIIIJJIZ()).LJIILL(null);
            ((C57780Mm0) LJJLIIIJJIZ()).LJLJLJ(false);
            ((C57780Mm0) LJJLIIIJJIZ()).W7(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardAdapter");
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        RecommendFriendInDMExperimentModel recommendFriendInDMExperimentModel;
        int i;
        if (abstractC57828Mmm instanceof C57789Mm9) {
            this.LJLIL.getClass();
            if (C57770Mlq.LIZIZ) {
                C57770Mlq.LIZIZ = false;
                try {
                    FFL LJIIIZ = FFL.LJIIIZ();
                    RecommendFriendInDMExperimentModel recommendFriendInDMExperimentModel2 = C57769Mlp.LIZ;
                    LJIIIZ.getClass();
                    recommendFriendInDMExperimentModel = (RecommendFriendInDMExperimentModel) FFL.LJIJ(true, "recommend_friends_in_imchat", 31744, RecommendFriendInDMExperimentModel.class, recommendFriendInDMExperimentModel2);
                } catch (Throwable unused) {
                    recommendFriendInDMExperimentModel = null;
                }
                int i2 = 3;
                if (recommendFriendInDMExperimentModel != null) {
                    i = recommendFriendInDMExperimentModel.sessionCount;
                    i2 = recommendFriendInDMExperimentModel.hideDays;
                } else {
                    i = 3;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j = C53383KxH.LIZ().LIZ.getLong("last_session_time_ms", -1L);
                int i3 = C53383KxH.LIZ().LIZ.getInt("session_count", 0);
                if (SU4.LIZLLL(j)) {
                    int i4 = i3 + 1;
                    C53383KxH.LIZ().LIZ.storeInt("session_count", i4);
                    if (i4 >= i) {
                        C53383KxH.LIZ().LIZ.storeLong("next_session_time_ms", (i2 * 86400000) + currentTimeMillis);
                        return;
                    }
                    return;
                }
                C53383KxH.LIZ().LIZ.storeLong("last_session_time_ms", currentTimeMillis);
                C53383KxH.LIZ().LIZ.storeInt("session_count", 1);
                return;
            }
            return;
        }
        if ((abstractC57828Mmm instanceof C57825Mmj) || (abstractC57828Mmm instanceof C57823Mmh) || (abstractC57828Mmm instanceof C57788Mm8)) {
            this.LJLIL.getClass();
            C53383KxH.LIZ().LIZ.storeInt("session_count", 0);
            C53383KxH.LIZ().LIZ.storeLong("last_session_time_ms", 0L);
            C53383KxH.LIZ().LIZ.storeLong("next_session_time_ms", 0L);
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        this.LJLJI.setValue(state);
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY && this.LJLILLLLZI != null) {
            source.getLifecycle().removeObserver(this);
            ((C57780Mm0) LJJLIIIJJIZ()).K8(this);
        }
    }
}
