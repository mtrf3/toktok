package com.ss.android.ugc.aweme.profile.widgets.recommend;

import X.AbstractC57828Mmm;
import X.AbstractC72932td;
import X.C221018lt;
import X.C223208pQ;
import X.C33X;
import X.C3C1;
import X.C57738MlK;
import X.C57778Mly;
import X.C57819Mmd;
import X.C65352Pkq;
import X.C72912tb;
import X.C72922tc;
import X.C8VC;
import X.C98K;
import X.C98L;
import X.C98O;
import X.C98Q;
import X.C9PN;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC57760Mlg;
import X.InterfaceC57784Mm4;
import X.InterfaceC57910Mo6;
import X.RBX;
import X.TBT;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.monitor.IRecUserMonManager;
import java.util.List;
import kotlin.jvm.internal.AqS13S0102000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS94S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileUserCardVM extends AssemViewModel<C98Q> implements InterfaceC57910Mo6 {
    public InterfaceC57760Mlg LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C98Q defaultState() {
        return new C98Q(0);
    }

    public final void hv0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on publish empty! isBlocked: ");
        LIZ.append(this.LJLILLLLZI);
        C221018lt.LJFF("UserCard_Assem", X1D.LIZIZ(LIZ));
        C98Q state = getState();
        if (gv0(state.LJLJLJ) || state.LJLL) {
            return;
        }
        setStateImmediate(C98K.LJLIL);
        InterfaceC57760Mlg interfaceC57760Mlg = this.LJLIL;
        if (interfaceC57760Mlg != null) {
            interfaceC57760Mlg.xk0(null);
        }
        jv0(2, true);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C8VC.LJIIL(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.98X
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 990));
        C8VC.LJIIL(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.98Y
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 991));
        C8VC.LJIIL(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.98W
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIIIZZ;
            }
        }, new AqS170S0100000_4(this, 992));
        C8VC.LJIIL(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.98Z
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJ;
            }
        }, new AqS170S0100000_4(this, 993));
    }

    public static boolean gv0(User user) {
        GeneralPermission generalPermission;
        if (user == null) {
            return false;
        }
        GeneralPermission generalPermission2 = user.getGeneralPermission();
        if ((generalPermission2 == null || generalPermission2.getFollowToastType() != 1) && (((generalPermission = user.getGeneralPermission()) == null || generalPermission.getFollowToastType() != 2) && !user.isBlocked() && !user.isUserCancelled() && !user.isGeoBlocked())) {
            return false;
        }
        return true;
    }

    public final void c3(int i) {
        boolean z;
        User user = getState().LJLJLJ;
        if (user == null || gv0(user)) {
            return;
        }
        if (i != 0) {
            z = true;
            InterfaceC57760Mlg interfaceC57760Mlg = this.LJLIL;
            if (interfaceC57760Mlg != null) {
                interfaceC57760Mlg.xk0(null);
            }
        } else {
            z = false;
        }
        jv0(1, z);
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        int size;
        o.LJIIIZ(state, "state");
        AbstractC72932td<Integer> abstractC72932td = getState().LJLJJL;
        int i = getState().LJLILLLLZI;
        AbstractC72932td<C223208pQ> abstractC72932td2 = state.LIZ;
        if (abstractC72932td2 instanceof C3C1) {
            List<InterfaceC57784Mm4> LIZ = state.LIZJ.LIZ();
            if (LIZ == null || (size = LIZ.size()) <= 0) {
                setState(new AqS94S0101000_4(this, i, 17));
            } else {
                setState(new AqS13S0102000_4(size, i, this, 2));
                setState(C98L.LJLIL);
            }
        } else if (abstractC72932td2 instanceof C72922tc) {
            setState(new AqS29S0001000_4(i, 14));
        } else if (abstractC72932td2 instanceof C72912tb) {
            AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td3 = state.LIZJ;
            if (abstractC72932td3 instanceof C72912tb) {
                int size2 = ((List) ((C72912tb) abstractC72932td3).LIZ).size();
                if (size2 <= 0) {
                    setState(new AqS13S0102000_4(0, i, this, 2));
                } else if (abstractC72932td instanceof C72922tc) {
                    setState(new AqS13S0102000_4(size2, i, this, 2));
                }
            }
        }
        if (state.LIZLLL()) {
            this.LJLJI = false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("user card state ");
        LIZ2.append(abstractC72932td);
        LIZ2.append(" to ");
        LIZ2.append(state);
        C221018lt.LJFF("UserCard_Assem", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    public final void iv0(User user, boolean z) {
        String str;
        String str2;
        Integer num;
        Boolean bool;
        int i;
        String str3;
        String uid;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attach new userId: ");
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", secUid: ");
        if (user != null) {
            str2 = user.getSecUid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(", follower: ");
        if (user != null) {
            num = Integer.valueOf(user.getFollowerCount());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", isBlock: ");
        if (user != null) {
            bool = Boolean.valueOf(user.isBlocked());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C221018lt.LJFF("UserCard_Assem", X1D.LIZIZ(LIZ));
        if (!z) {
            C9PN c9pn = (C9PN) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
            InterfaceC57760Mlg interfaceC57760Mlg = this.LJLIL;
            if (interfaceC57760Mlg != null) {
                getLifecycle().removeObserver(interfaceC57760Mlg);
            }
            this.LJLIL = null;
            if (user != null) {
                i = user.getFollowerCount();
            } else {
                i = -1;
            }
            IRecUserMonManager LJ = C57738MlK.LIZIZ.LJ();
            Lifecycle lifecycle = getLifecycle();
            String str4 = "";
            if (c9pn == null || (str3 = c9pn.LIZJ) == null) {
                str3 = "";
            }
            if (user != null && (uid = user.getUid()) != null) {
                str4 = uid;
            }
            this.LJLIL = LJ.Pz(lifecycle, new C57819Mmd("others_homepage", null, str3, str4, false, null, 8178), i);
        }
        this.LJLJI = false;
        this.LJLILLLLZI = false;
        setState(new AqS47S0110000_4(user, z, 6));
    }

    public final void jv0(int i, boolean z) {
        int i2;
        C98Q state = getState();
        AbstractC72932td<Integer> abstractC72932td = state.LJLJJL;
        int i3 = state.LJLJI;
        if (z) {
            User user = state.LJLJLJ;
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                setState(new AqS94S0101000_4(this, i, 17));
                return;
            }
            if (!(abstractC72932td instanceof C33X)) {
                Integer LIZ = abstractC72932td.LIZ();
                if (LIZ != null) {
                    i2 = LIZ.intValue();
                } else {
                    i2 = 0;
                }
                if (abstractC72932td instanceof C72912tb) {
                    setState(new AqS13S0102000_4(i2, i, this, 2));
                    return;
                } else if (abstractC72932td instanceof C3C1) {
                    setState(new AqS94S0101000_4(this, i, 17));
                    return;
                } else {
                    if (!(abstractC72932td instanceof C72922tc)) {
                        return;
                    }
                    setState(new AqS29S0001000_4(i, 14));
                    return;
                }
            }
            if (user == null || this.LJLJI) {
                return;
            }
            this.LJLJI = true;
            setState(new AqS94S0101000_4(user, i, 18));
            return;
        }
        if (i3 == 2) {
            return;
        }
        setState(C98O.LJLIL);
    }
}
