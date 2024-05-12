package com.ss.android.ugc.aweme.relation.recuser.inbox;

import X.AbstractC029409q;
import X.AbstractC030109x;
import X.AbstractC57781Mm1;
import X.AbstractC57828Mmm;
import X.AbstractC57896Mns;
import X.AbstractC72932td;
import X.C00F;
import X.C175256uH;
import X.C221018lt;
import X.C221108m2;
import X.C223208pQ;
import X.C27484AqW;
import X.C33X;
import X.C3C1;
import X.C57759Mlf;
import X.C57761Mlh;
import X.C57765Mll;
import X.C57778Mly;
import X.C57780Mm0;
import X.C57823Mmh;
import X.C57825Mmj;
import X.C57900Mnw;
import X.C59522Vg;
import X.C5H3;
import X.C62822Ol8;
import X.C70712q3;
import X.C72912tb;
import X.C72922tc;
import X.C77266UUc;
import X.C78613UtF;
import X.C79081V1x;
import X.EnumC57165Mc5;
import X.EnumC57435MgR;
import X.EnumC58046MqI;
import X.EnumC94693nd;
import X.HG3;
import X.HH1;
import X.InterfaceC57760Mlg;
import X.InterfaceC57784Mm4;
import X.InterfaceC57910Mo6;
import X.InterfaceC57917MoD;
import X.InterfaceC86093Zl;
import X.K2B;
import X.LEA;
import X.MSB;
import X.QD3;
import X.RBX;
import X.X1D;
import X.XKX;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardAdapterWidget;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class UserCardAdapterWidget extends AbsUserCardInboxWidget implements InterfaceC57910Mo6 {
    public static String LJLLJ = ((RBX) HG3.LJIILL()).getCurUserId();
    public final int LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C5H3 LJLL;
    public final ChangeLiveData<EnumC94693nd> LJLLI;
    public final C62822Ol8 LJLLILLLL;

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final int LJIIIZ(int i) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget
    public final void LJIJI(K2B k2b) {
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget, com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, X.MLD
    public final void LJ() {
        if (!this.LJLJJI) {
            return;
        }
        LJJIFFI(true);
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget
    public final InterfaceC57760Mlg LJIIZILJ() {
        return (InterfaceC57760Mlg) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget
    public final AbstractC030109x LJIJ() {
        return (AbstractC030109x) this.LJLL.getValue();
    }

    public final InboxUserCardSharedVM LJIJJLI() {
        return (InboxUserCardSharedVM) this.LJLJLJ.getValue();
    }

    public final AbstractC57781Mm1 LJJ() {
        return (AbstractC57781Mm1) this.LJLLILLLL.getValue();
    }

    static {
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.2q4
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                    if (!o.LJ(UserCardAdapterWidget.LJLLJ, curUserId)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("the account ");
                        LIZ.append(UserCardAdapterWidget.LJLLJ);
                        LIZ.append(" -> ");
                        LIZ.append(curUserId);
                        C221018lt.LJFF("@UserCard_inbox", X1D.LIZIZ(LIZ));
                        UserCardAdapterWidget.LJLLJ = curUserId;
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final AbstractC029409q LJIIJ() {
        return LJJ();
    }

    public final String LJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("@UserCard_inbox_");
        LIZ.append((String) ((LinkedHashMap) this.LJLJI).get("position"));
        return X1D.LIZIZ(LIZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        ((C57780Mm0) LJJ()).LJIILL(null);
        ((C57780Mm0) LJJ()).W7(this);
        InterfaceC57760Mlg LJIIZILJ = LJIIZILJ();
        if (LJIIZILJ != null) {
            if (this.LJLJL == 0) {
                LJIIZILJ.O20();
            }
            ((C57780Mm0) LJJ()).W7(LJIIZILJ);
        }
        LJJIFFI(false);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC57760Mlg LJIIZILJ = LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.k0();
        }
        ((C57780Mm0) LJJ()).K8(this);
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final /* bridge */ /* synthetic */ LiveData LJIILIIL() {
        return this.LJLLI;
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget
    public final void LJIILLIIL(InterfaceC57917MoD interfaceC57917MoD) {
        ((C57780Mm0) LJJ()).LJLIL.LJJLIL(interfaceC57917MoD);
    }

    public final void LJJI(EnumC94693nd enumC94693nd) {
        String LJIL = LJIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("post ");
        LIZ.append(enumC94693nd);
        LIZ.append(" to outside");
        C221018lt.LJFF(LJIL, X1D.LIZIZ(LIZ));
        this.LJLLI.postValue(enumC94693nd);
    }

    public final void LJJIFFI(boolean z) {
        boolean z2;
        User curUser;
        Integer valueOf;
        C57759Mlf c57759Mlf = LJIJJLI().LJLIL;
        if (c57759Mlf.LJLIL) {
            C221018lt.LJFF(LJIL(), "current is on Loading!");
            return;
        }
        InboxUserCardSharedVM LJIJJLI = LJIJJLI();
        LJIJJLI.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("is force refresh: ");
        LIZ.append(z);
        LIZ.append(", shared: ");
        LIZ.append(LJIJJLI.LJLIL);
        C221018lt.LJFF("@UserCard_inbox", X1D.LIZIZ(LIZ));
        boolean z3 = true;
        if (!z) {
            C57759Mlf c57759Mlf2 = LJIJJLI.LJLIL;
            if (c57759Mlf2.LJLJJI instanceof C3C1) {
                C221018lt.LJFF("@UserCard_inbox", "refresh, cause by last fail!");
            } else {
                long j = c57759Mlf2.LJLJI;
                long currentTimeMillis = System.currentTimeMillis();
                if (j == -1 || currentTimeMillis - j > 60000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!LJIJJLI.LJLIL.LJLJJL || (curUser = ((RBX) HG3.LJIILL()).getCurUser()) == null || (valueOf = Integer.valueOf(curUser.getFriendCount())) == null || valueOf.intValue() > 5) {
                    z3 = z2;
                }
                StringBuilder LIZLLL = C00F.LIZLLL("shouldReq: ", z3, ", isExpired: ", z2, " isEmpty: ");
                HH1.LIZIZ(LIZLLL, LJIJJLI.LJLIL.LJLJJL, LIZLLL, "@UserCard_inbox");
                if (!z3) {
                    if (c57759Mlf.LJLJJL) {
                        LJJI(EnumC94693nd.EMPTY);
                        return;
                    } else {
                        LJJI(EnumC94693nd.SUCCESS);
                        return;
                    }
                }
            }
        }
        LJIJJLI().gv0(C57761Mlh.LJLIL);
        ((C57780Mm0) LJJ()).LJLJLJ(false);
        C221018lt.LJFF(LJIL(), "triggerRefresh!!");
        if (!c57759Mlf.LJLJJL) {
            LJJI(EnumC94693nd.SUCCESS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        if (abstractC57828Mmm instanceof C57823Mmh) {
            C57823Mmh c57823Mmh = (C57823Mmh) abstractC57828Mmm;
            User user = (User) c57823Mmh.LIZ;
            EnumC57435MgR enumC57435MgR = c57823Mmh.LIZJ;
            InterfaceC86093Zl imMafService = IMService.createIIMServicebyMonsterPlugin(false).getImMafService();
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            imMafService.LIZ(enumC57435MgR.getValue(), uid);
            Context context = this.LJLIL.getContext();
            if (context == null) {
                return;
            }
            if (C59522Vg.LIZ()) {
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLIL), C78613UtF.LIZJ, null, new C70712q3(this, null), 2);
                return;
            } else {
                C77266UUc.LIZIZ.LJFF(context, "notification_page", 0, "follow");
                return;
            }
        }
        if (abstractC57828Mmm instanceof C57825Mmj) {
            C79081V1x.LJJJIL(MSB.LJLIL);
            T t = abstractC57828Mmm.LIZ;
            if ((t instanceof C57900Mnw) && ((C57900Mnw) t).LJLIL == EnumC58046MqI.CONTACT) {
                EnumC57165Mc5.CONTACTS.markAction();
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLoginEvent(C175256uH event) {
        o.LJIIIZ(event, "event");
        C221018lt.LJFF(LJIL(), "reset shared state and userCardAdapter");
        ((C57780Mm0) LJJ()).reset();
        InboxUserCardSharedVM LJIJJLI = LJIJJLI();
        LJIJJLI.getClass();
        LJIJJLI.LJLIL = new C57759Mlf(0);
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        C72912tb c72912tb;
        o.LJIIIZ(state, "state");
        InboxUserCardSharedVM LJIJJLI = LJIJJLI();
        LJIJJLI.getClass();
        AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
        if (!(abstractC72932td instanceof C33X)) {
            if (abstractC72932td instanceof C3C1) {
                LJIJJLI.gv0(new AqS175S0100000_9(abstractC72932td, (AbstractC72932td<CreatorNoticeResponse>) 472));
            } else if (abstractC72932td instanceof C72922tc) {
                LJIJJLI.gv0(new AqS175S0100000_9(abstractC72932td, (AbstractC72932td<CreatorNoticeResponse>) 473));
            } else if (abstractC72932td instanceof C72912tb) {
                LJIJJLI.gv0(new AqS140S0200000_9(abstractC72932td, state, 66));
            }
        }
        AbstractC72932td<C223208pQ> abstractC72932td2 = state.LIZ;
        if (!(abstractC72932td2 instanceof C33X)) {
            if (abstractC72932td2 instanceof C72922tc) {
                LJJI(EnumC94693nd.LOADING);
                return;
            }
            if (abstractC72932td2 instanceof C72912tb) {
                AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td3 = state.LIZJ;
                if (!(abstractC72932td3 instanceof C72912tb) || (c72912tb = (C72912tb) abstractC72932td3) == null) {
                    return;
                }
                if (((List) c72912tb.LIZ).isEmpty()) {
                    LJJI(EnumC94693nd.EMPTY);
                    return;
                } else {
                    LJJI(EnumC94693nd.SUCCESS);
                    return;
                }
            }
            if (!(abstractC72932td2 instanceof C3C1)) {
                return;
            }
            LJJI(EnumC94693nd.FAIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget
    public final void LJIJJ(boolean z, boolean z2) {
        if (!z) {
            AbstractC72932td<C223208pQ> abstractC72932td = ((C57780Mm0) LJJ()).getCurrentState().LIZ;
            if (z2 && !(abstractC72932td instanceof C3C1)) {
                return;
            }
        }
        LJJIFFI(z);
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCardAdapterWidget(Fragment fragment, int i, LiveData<EnumC94693nd> liveData, AbstractC57896Mns authStrategy, int i2) {
        super(fragment, liveData);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(authStrategy, "authStrategy");
        this.LJLJL = i;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 566));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS156S0200000_9(fragment, this, 37));
        this.LJLL = C27484AqW.LJIIIIZZ(new AqS159S0100000_9(this, 567));
        this.LJLLI = new ChangeLiveData<>();
        this.LJLLILLLL = C221108m2.LIZIZ(new C57765Mll(fragment, i2, authStrategy, this));
        C221108m2.LIZIZ(new AqS159S0100000_9(this, 568));
    }
}
