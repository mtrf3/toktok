package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AYY;
import X.AbstractC57829Mmn;
import X.AnonymousClass394;
import X.C175046tw;
import X.C221108m2;
import X.C27484AqW;
import X.C33X;
import X.C57778Mly;
import X.C57787Mm7;
import X.C57790MmA;
import X.C57826Mmk;
import X.C57859MnH;
import X.C57898Mnu;
import X.C57900Mnw;
import X.C57908Mo4;
import X.C57962Mow;
import X.C5H3;
import X.C62822Ol8;
import X.C72912tb;
import X.C72922tc;
import X.C72942te;
import X.C76800UCe;
import X.C78983UzD;
import X.EnumC57901Mnx;
import X.InterfaceC57784Mm4;
import X.InterfaceC57910Mo6;
import X.InterfaceC57927MoN;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.QD3;
import X.X1D;
import X.XKX;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.experiment.RecMoreExperiment;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.settings.AuthCardFreqParams;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class UserCardListAbility implements IUserCardListAbility {
    public final C57859MnH LJLIL;
    public final InterfaceC70422pa LJLILLLLZI;
    public final C5H3<C57962Mow> LJLJI;
    public final boolean LJLJJI;
    public final InterfaceC88472Yns<InterfaceC57927MoN, C76800UCe> LJLJJL;
    public final InterfaceC88471Ynr<RecUser, List<RecUser>, C76800UCe> LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final Set<InterfaceC57910Mo6> LJLJLJ;
    public C57778Mly LJLJLLL;
    public final Set<String> LJLL;

    public UserCardListAbility() {
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void onCleared() {
        this.LJLJLJ.clear();
        ((ConcurrentHashMap) this.LJLJL.getValue()).clear();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final Set<String> Sb0() {
        return this.LJLL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final C57859MnH getConfig() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final C57778Mly getState() {
        return this.LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final int GM(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof AbstractC57829Mmn) {
            return this.LJLJI.getValue().indexOf(((AbstractC57829Mmn) interfaceC57784Mm4).LIZ());
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void Gp(InterfaceC57927MoN element) {
        o.LJIIIZ(element, "element");
        if (element instanceof RecUser) {
            XKX.LIZLLL(this.LJLILLLLZI, null, null, new C57787Mm7(element, this, null), 3);
        } else if (element instanceof C57900Mnw) {
            C57900Mnw c57900Mnw = (C57900Mnw) element;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("social_permission_card_freq_");
            LIZ.append(C78983UzD.LJJII());
            Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
            o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_PREFIX + curUid)");
            C57908Mo4.LIZ.getClass();
            AuthCardFreqParams settings = (AuthCardFreqParams) C57908Mo4.LIZJ.getValue();
            o.LJIIIZ(settings, "settings");
            if (!c57900Mnw.LJLILLLLZI.LIZLLL) {
                int i = repo.getInt(C78983UzD.LJJIJIL(c57900Mnw, "key_delete_count_"), 0) + 1;
                repo.storeInt(C78983UzD.LJJIJIL(c57900Mnw, "key_delete_count_"), i);
                repo.storeInt(C78983UzD.LJJIJIL(c57900Mnw, "key_exp_count_"), 0);
                repo.storeLong(C78983UzD.LJJIJIL(c57900Mnw, "key_auto_hide_ts_"), -1L);
                if (i >= settings.maxDeleteCount) {
                    repo.storeLong(C78983UzD.LJJIJIL(c57900Mnw, "key_delete_hide_ts_"), -1L);
                } else {
                    repo.storeLong(C78983UzD.LJJIJIL(c57900Mnw, "key_delete_hide_ts_"), System.currentTimeMillis());
                }
            }
        }
        this.LJLJI.getValue().remove(element);
        InterfaceC88472Yns<InterfaceC57927MoN, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(element);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void Ju0(InterfaceC88472Yns<? super InterfaceC57910Mo6, C76800UCe> func) {
        o.LJIIIZ(func, "func");
        C27484AqW.LJ(new AqS156S0200000_9(this, (UserCardListAbility) func, (InterfaceC88472Yns<? super InterfaceC57910Mo6, C76800UCe>) 38));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void K8(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLJ.remove(listener);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void S70(C57778Mly c57778Mly) {
        this.LJLJLLL = c57778Mly;
        if (c57778Mly.LIZ instanceof C72922tc) {
            ((ConcurrentHashMap) this.LJLJL.getValue()).clear();
            this.LJLL.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void W7(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLJ.add(listener);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void mz(RecUser user) {
        o.LJIIIZ(user, "user");
        XKX.LIZLLL(this.LJLILLLLZI, null, null, new AnonymousClass394(user, null), 3);
    }

    @QD3(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onBlockUserEvent(C175046tw event) {
        User user;
        o.LJIIIZ(event, "event");
        User user2 = event.LJLIL;
        if (user2 == null) {
            return;
        }
        AYY ayy = AYY.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on block: ");
        LIZ.append(user2.getUid());
        String LIZIZ = X1D.LIZIZ(LIZ);
        ayy.getClass();
        AYY.LIZIZ("ListAbility", LIZIZ);
        Iterator<InterfaceC57927MoN> it = this.LJLJI.getValue().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (InterfaceC57927MoN) it.next();
            String str = null;
            if ((obj instanceof RecUser) && (user = (User) obj) != null) {
                str = user.getUid();
            }
            if (o.LJ(str, user2.getUid())) {
                if (i >= 0) {
                    InterfaceC57927MoN LJIIIIZZ = this.LJLJI.getValue().LJIIIIZZ(i);
                    if (LJIIIIZZ instanceof RecUser) {
                        mz((RecUser) LJIIIIZZ);
                    }
                    AYY ayy2 = AYY.LIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("remove item: ");
                    LIZ2.append(LJIIIIZZ);
                    LIZ2.append(" by blocked!");
                    String LIZIZ2 = X1D.LIZIZ(LIZ2);
                    ayy2.getClass();
                    AYY.LIZIZ("ListAbility", LIZIZ2);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility
    public final void my(C57826Mmk c57826Mmk, boolean z) {
        if (!C57898Mnu.LIZJ(this.LJLIL)) {
            AYY.LIZ.getClass();
            AYY.LIZIZ("ListAbility", "limit recommend more user!");
            return;
        }
        if (!C27484AqW.LJFF(C57898Mnu.LIZLLL(this.LJLIL)) && !z) {
            return;
        }
        RecUser recUser = c57826Mmk.LJLJI;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LJLJL.getValue();
        Object obj = concurrentHashMap.get(recUser);
        if (obj == null) {
            obj = C33X.LIZ;
        }
        o.LJIIIIZZ(obj, "lookup[recUser] ?: Uninitialized");
        if ((obj instanceof C72922tc) || (obj instanceof C72912tb)) {
            return;
        }
        RecMoreExperiment.LJII(EnumC57901Mnx.CARD);
        concurrentHashMap.put(recUser, new C72922tc());
        XKX.LIZLLL(this.LJLILLLLZI, null, null, new C57790MmA(this, recUser, concurrentHashMap, null), 3);
    }

    public UserCardListAbility(C57859MnH config, InterfaceC70422pa assemScope, C62822Ol8 c62822Ol8) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(assemScope, "assemScope");
        this.LJLIL = config;
        this.LJLILLLLZI = assemScope;
        this.LJLJI = c62822Ol8;
        this.LJLJJI = true;
        this.LJLJJL = null;
        this.LJLJJLL = null;
        this.LJLJL = C221108m2.LIZIZ(C72942te.LJLIL);
        this.LJLJLJ = new LinkedHashSet();
        this.LJLJLLL = new C57778Mly(0);
        this.LJLL = new LinkedHashSet();
        EventBus.LIZJ().LJIILJJIL(this);
    }
}
