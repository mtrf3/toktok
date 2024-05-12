package X;

import Y.AObserverS77S0100000_9;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS108S0101000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MgN */
/* loaded from: classes10.dex */
public abstract class AbstractC57431MgN implements InterfaceC57449Mgf, Observer<RelationStatus> {
    public final InterfaceC57447Mgd LJLIL;
    public User LJLILLLLZI;
    public LifecycleOwner LJLJI;
    public ViewModelStoreOwner LJLJJI;
    public C57438MgU LJLJJL;
    public LiveEventObserver<RelationStatus> LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final AObserverS77S0100000_9 LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    public abstract void LJII();

    public void LJIIJ(int i) {
    }

    public abstract void LJIIJJI(int i, Integer num);

    public abstract void LJIIL(int i, Integer num, String str);

    public abstract void LJIILIIL();

    @Override // X.InterfaceC57449Mgf
    public void LJJIIJZLJL(int i, AqS108S0101000_9 aqS108S0101000_9) {
    }

    @Override // X.InterfaceC57449Mgf
    public void LJJLIIIJJIZ() {
    }

    public final LifecycleOwner LJ() {
        LifecycleOwner lifecycleOwner = this.LJLJI;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        "lifecycleOwner in RelationViewDelegate is null".toString();
        throw new IllegalArgumentException("lifecycleOwner in RelationViewDelegate is null");
    }

    public final User LJFF() {
        User user = this.LJLILLLLZI;
        if (user != null) {
            return user;
        }
        "user in RelationViewDelegate is null".toString();
        throw new IllegalArgumentException("user in RelationViewDelegate is null");
    }

    public final RelationViewVM LJI() {
        return (RelationViewVM) this.LJLJL.getValue();
    }

    public AbstractC57431MgN(InterfaceC57447Mgd view) {
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 816));
        this.LJLJLJ = new AObserverS77S0100000_9(this, 69);
        this.LJLLI = true;
    }

    public static /* synthetic */ void LIZJ(AbstractC57431MgN abstractC57431MgN) {
        abstractC57431MgN.LIZ(true, null);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LJIIIIZZ */
    public void onChanged(RelationStatus t) {
        o.LJIIIZ(t, "t");
        if (!o.LJ(LJFF().getUid(), t.getUid())) {
            return;
        }
        EnumC57435MgR LIZ = C57434MgQ.LIZ(t.getFollowStatus());
        EnumC57435MgR LIZ2 = C57434MgQ.LIZ(LJFF().getFollowStatus());
        EnumC57435MgR enumC57435MgR = EnumC57435MgR.FOLLOW_REQUESTED;
        if (LIZ2 != enumC57435MgR && LIZ != enumC57435MgR) {
            EnumC57435MgR enumC57435MgR2 = EnumC57435MgR.UNFOLLOW;
            if (LIZ != enumC57435MgR2) {
                LJFF().setFollowerCount(LJFF().getFollowerCount() + 1);
            } else if (LIZ == enumC57435MgR2) {
                LJFF().setFollowerCount(LJFF().getFollowerCount() - 1);
            }
        }
        LJFF().setFollowStatus(t.getFollowStatus());
        Integer followerStatus = t.getFollowerStatus();
        if (followerStatus != null) {
            LJFF().setFollowerStatus(followerStatus.intValue());
        }
        LJIIL(t.getFollowStatus(), t.getFollowerStatus(), t.getUid());
        LJIIJ(t.getFollowStatus());
        LJIIJJI(t.getFollowStatus(), t.getFollowerStatus());
        InterfaceC88472Yns<EnumC57435MgR, C76800UCe> dataChangeListener = this.LJLIL.getDataChangeListener();
        if (dataChangeListener != null) {
            dataChangeListener.invoke(LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r1 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJIIIZ(int r7) {
        /*
            r6 = this;
            X.Mgd r0 = r6.LJLIL
            X.Pro r0 = r0.getTracker()
            r5 = 0
            if (r0 == 0) goto L43
            java.lang.Object r1 = r0.invoke()
            X.MgM r1 = (X.C57430MgM) r1
        Lf:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L50
            X.Mgd r0 = r6.LJLIL
            android.content.Context r0 = r0.getCtx()
            android.app.Activity r4 = X.C45804HyK.LJIJJ(r0)
            if (r4 == 0) goto L45
            java.lang.String r3 = ""
            if (r1 == 0) goto L2f
            java.lang.String r2 = r1.LIZIZ
            if (r2 != 0) goto L32
        L2f:
            r2 = r3
            if (r1 == 0) goto L36
        L32:
            java.lang.String r0 = r1.LIZLLL
            if (r0 != 0) goto L41
        L36:
            Y.IDgS346S0100000_1 r1 = new Y.IDgS346S0100000_1
            r0 = 2
            r1.<init>(r6, r0)
            X.J9P.LIZIZ(r4, r2, r3, r5, r1)
            r0 = 0
            return r0
        L41:
            r3 = r0
            goto L36
        L43:
            r1 = r5
            goto Lf
        L45:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "activity in RelationViewDelegate is null"
            r0.toString()
            r1.<init>(r0)
            throw r1
        L50:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC57431MgN.LJIIIZ(int):boolean");
    }

    @Override // X.InterfaceC57449Mgf
    public void LJJJJJL(C57438MgU c57438MgU) {
        LifecycleOwner LIZ = c57438MgU.LIZ();
        if (LIZ == null && (LIZ = C57434MgQ.LIZIZ(this.LJLIL.getCtx())) == null) {
            return;
        }
        this.LJLJI = LIZ;
        ViewModelStoreOwner LIZJ = c57438MgU.LIZJ();
        if (LIZJ == null && (LIZJ = C57434MgQ.LIZJ(this.LJLIL.getCtx())) == null) {
            return;
        }
        this.LJLJJI = LIZJ;
        User LIZIZ = c57438MgU.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        this.LJLILLLLZI = LIZIZ;
        this.LJLJJL = c57438MgU;
        if (LIZIZ.isCheckDMPermission()) {
            boolean z = false;
            this.LJLLI = false;
            List<Integer> canMessageFollowStatusList = LIZIZ.getCanMessageFollowStatusList();
            if (canMessageFollowStatusList != null) {
                if (canMessageFollowStatusList.contains(1) || canMessageFollowStatusList.contains(4)) {
                    z = true;
                }
                this.LJLL = z;
                this.LJLLI = canMessageFollowStatusList.contains(2);
            }
        }
        LJII();
        LJIIL(LJFF().getFollowStatus(), Integer.valueOf(LJFF().getFollowerStatus()), LJFF().getUid());
        LJIIJ(LJFF().getFollowStatus());
        LJIIJJI(LJFF().getFollowStatus(), Integer.valueOf(LJFF().getFollowerStatus()));
        LJIILIIL();
    }

    public final void LIZ(boolean z, InterfaceC88471Ynr<? super Boolean, ? super C38333F2r, C76800UCe> interfaceC88471Ynr) {
        C57430MgM c57430MgM;
        String str;
        String str2;
        String str3;
        int LJJLIIIJ;
        String str4;
        String str5;
        int i;
        String str6;
        String str7;
        String str8;
        java.util.Map<String, String> map;
        C226678v1 c226678v1;
        InterfaceC65784Pro<C57430MgM> tracker = this.LJLIL.getTracker();
        String str9 = null;
        if (tracker != null) {
            c57430MgM = tracker.invoke();
        } else {
            c57430MgM = null;
        }
        RelationViewVM LJI = LJI();
        ALX alx = new ALX();
        alx.LIZJ(LJFF().getUid());
        alx.LIZIZ(LJFF().getSecUid());
        alx.LIZ.LJIIIZ = LJFF().getFollowStatus();
        alx.LIZ.LJIIJ = LJFF().getFollowerStatus();
        alx.LIZ.LJIIL = LJFF().isAccuratePrivateAccount();
        int LIZ = C112674bX.LIZ(LJFF().getFollowStatus());
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LIZJ = LIZ;
        if (c57430MgM != null) {
            str = c57430MgM.LIZIZ;
        } else {
            str = null;
        }
        c57285Me1.LJFF = str;
        if (c57430MgM != null) {
            str2 = c57430MgM.LIZLLL;
        } else {
            str2 = null;
        }
        if (o.LJ(str2, "click_rec_label")) {
            LJJLIIIJ = 26;
        } else {
            if (c57430MgM != null) {
                str3 = c57430MgM.LIZIZ;
            } else {
                str3 = null;
            }
            LJJLIIIJ = C78897Uxp.LJJLIIIJ(str3, 3, false, false);
        }
        alx.LIZ.LIZLLL = LJJLIIIJ;
        if (c57430MgM != null) {
            str4 = c57430MgM.LIZLLL;
        } else {
            str4 = null;
        }
        if (o.LJ(str4, "click_rec_label")) {
            i = C78897Uxp.LJJLIIIJ(c57430MgM.LIZIZ, 3, false, false);
        } else {
            if (c57430MgM != null) {
                str5 = c57430MgM.LJFF;
            } else {
                str5 = null;
            }
            if (C78685UuP.LJJJZ(str5)) {
                if (c57430MgM != null) {
                    str6 = c57430MgM.LJFF;
                } else {
                    str6 = null;
                }
                int LJJLIIIJ2 = C78897Uxp.LJJLIIIJ(str6, 3, false, false);
                if (c57430MgM != null) {
                    str7 = c57430MgM.LIZIZ;
                } else {
                    str7 = null;
                }
                if (LJJLIIIJ2 != C78897Uxp.LJJLIIIJ(str7, 3, false, false)) {
                    if (c57430MgM != null) {
                        str8 = c57430MgM.LJFF;
                    } else {
                        str8 = null;
                    }
                    i = C78897Uxp.LJJLIIIJ(str8, 3, false, false);
                }
            }
            i = 0;
        }
        alx.LIZ.LJ = i;
        C57438MgU c57438MgU = this.LJLJJL;
        if (c57438MgU != null) {
            alx.LIZ.LJIILIIL = c57438MgU.LIZLLL();
            alx.LIZ.LJIILJJIL = LJFF();
            String accurateRecType = LJFF().getAccurateRecType();
            C57285Me1 c57285Me12 = alx.LIZ;
            c57285Me12.LJIILL = accurateRecType;
            c57285Me12.LJIIZILJ = z;
            C57438MgU c57438MgU2 = this.LJLJJL;
            if (c57438MgU2 != null) {
                if ((c57438MgU2 instanceof C226678v1) && (c226678v1 = (C226678v1) c57438MgU2) != null) {
                    map = c226678v1.LJII;
                } else {
                    map = null;
                }
                c57285Me12.LJIIJJI = map;
                C57285Me1 params = alx.LIZ();
                LJI.getClass();
                o.LJIIIZ(params, "params");
                if (c57430MgM != null) {
                    User user = params.LJIILJJIL;
                    String enterFrom = c57430MgM.LIZIZ;
                    String str10 = c57430MgM.LIZLLL;
                    String str11 = c57430MgM.LJ;
                    String str12 = c57430MgM.LJFF;
                    String str13 = c57430MgM.LJI;
                    Integer num = c57430MgM.LJII;
                    String str14 = c57430MgM.LJIIIIZZ;
                    String str15 = c57430MgM.LJIIIZ;
                    String str16 = c57430MgM.LJIIJ;
                    String str17 = c57430MgM.LJIIJJI;
                    String str18 = c57430MgM.LJIIL;
                    String str19 = c57430MgM.LJIILIIL;
                    String str20 = c57430MgM.LJIILJJIL;
                    String str21 = c57430MgM.LJIILL;
                    String str22 = c57430MgM.LJIILLIIL;
                    String str23 = c57430MgM.LJIIZILJ;
                    String str24 = c57430MgM.LJIJ;
                    int i2 = c57430MgM.LJIJI;
                    int i3 = c57430MgM.LJIJJ;
                    Boolean bool = c57430MgM.LJIJJLI;
                    int i4 = c57430MgM.LJIL;
                    boolean z2 = c57430MgM.LJJ;
                    int i5 = c57430MgM.LJJI;
                    Boolean bool2 = c57430MgM.LJJIFFI;
                    String str25 = c57430MgM.LJJII;
                    String str26 = c57430MgM.LJJIII;
                    String str27 = c57430MgM.LJJIIJ;
                    String str28 = c57430MgM.LJJIIJZLJL;
                    String str29 = c57430MgM.LJJIIZ;
                    String str30 = c57430MgM.LJJIIZI;
                    String str31 = c57430MgM.LJJIJ;
                    Integer num2 = c57430MgM.LJJIJIIJI;
                    String str32 = c57430MgM.LJJIJIIJIL;
                    Integer num3 = c57430MgM.LJJIJIL;
                    String str33 = c57430MgM.LJJIJL;
                    int i6 = c57430MgM.LJJIJLIJ;
                    String str34 = c57430MgM.LJJIL;
                    Boolean bool3 = c57430MgM.LJJIZ;
                    java.util.Map<String, String> map2 = c57430MgM.LJJJ;
                    String str35 = c57430MgM.LJJJI;
                    o.LJIIIZ(enterFrom, "enterFrom");
                    new C57430MgM(enterFrom, user, str10, str11, str12, str13, num, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, i2, i3, bool, i4, z2, i5, bool2, str25, str26, str27, str28, str29, str30, str31, num2, str32, num3, str33, i6, str34, bool3, map2, str35).LIZLLL(null);
                }
                if (params.LJIILIIL) {
                    RelationViewVM.hv0(params.LJIILJJIL, false, c57430MgM);
                }
                if (c57430MgM != null) {
                    str9 = c57430MgM.LIZIZ;
                }
                LJI.yQ(params, str9, interfaceC88471Ynr);
                return;
            }
            "config in RelationViewDelegate is null".toString();
            throw new IllegalArgumentException("config in RelationViewDelegate is null");
        }
        "config in RelationViewDelegate is null".toString();
        throw new IllegalArgumentException("config in RelationViewDelegate is null");
    }

    public String LIZLLL(int i, Integer num, java.util.Map<EnumC57435MgR, C112704ba> map, String str) {
        C112704ba c112704ba;
        String str2;
        C112704ba c112704ba2;
        String str3;
        C112704ba c112704ba3;
        String str4;
        C112704ba c112704ba4;
        String str5;
        if (i == EnumC57435MgR.UNFOLLOW.getValue()) {
            int value = EnumC57435MgR.FOLLOWED.getValue();
            if (num == null || num.intValue() != value) {
                String string = this.LJLIL.getCtx().getResources().getString(R.string.git);
                o.LJIIIIZZ(string, "{\n                    vi…follow)\n                }");
                return string;
            }
            if (map != null && (c112704ba4 = map.get(EnumC57435MgR.UNFOLLOW_BUT_BE_FOLLOWED)) != null && (str5 = c112704ba4.LIZ) != null) {
                return str5;
            }
            String string2 = this.LJLIL.getCtx().getResources().getString(R.string.gix);
            o.LJIIIIZZ(string2, "view.ctx.resources.getString(R.string.follow_back)");
            return string2;
        }
        EnumC57435MgR enumC57435MgR = EnumC57435MgR.FOLLOWED;
        if (i == enumC57435MgR.getValue()) {
            if (map != null && (c112704ba3 = map.get(enumC57435MgR)) != null && (str4 = c112704ba3.LIZ) != null) {
                return str4;
            }
            if (str != null) {
                return C57107Mb9.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService(), this.LJLIL.getCtx(), str, 0, 12);
            }
            String string3 = this.LJLIL.getCtx().getResources().getString(R.string.gkd);
            o.LJIIIIZZ(string3, "view.ctx.resources.getString(R.string.followed)");
            return string3;
        }
        EnumC57435MgR enumC57435MgR2 = EnumC57435MgR.FOLLOW_REQUESTED;
        if (i == enumC57435MgR2.getValue()) {
            if (map != null && (c112704ba2 = map.get(enumC57435MgR2)) != null && (str3 = c112704ba2.LIZ) != null) {
                return str3;
            }
            String string4 = this.LJLIL.getCtx().getResources().getString(R.string.gk4);
            o.LJIIIIZZ(string4, "view.ctx.resources.getSt….string.follow_requested)");
            return string4;
        }
        EnumC57435MgR enumC57435MgR3 = EnumC57435MgR.FOLLOW_MUTUAL;
        if (i == enumC57435MgR3.getValue()) {
            if (map != null && (c112704ba = map.get(enumC57435MgR3)) != null && (str2 = c112704ba.LIZ) != null) {
                return str2;
            }
            String string5 = this.LJLIL.getCtx().getResources().getString(R.string.exk);
            o.LJIIIIZZ(string5, "view.ctx.resources.getSt…g(R.string.double_follow)");
            return string5;
        }
        return "";
    }
}
