package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.InviteError;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS56S1200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.9zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C255099zl implements InterfaceC151715xP {
    public final ActivityC45651qj LJLIL;
    public GroupInviteViewModel LJLILLLLZI;
    public GroupInfo LJLJI;
    public final java.util.Set<C26231ARf> LJLJJI = new LinkedHashSet();

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "activity.lifecycle");
        return lifecycle;
    }

    public C255099zl(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    public final void LIZ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Iterator<C26231ARf> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(null);
        }
        this.LJLJJI.clear();
        ActivityC45651qj activityC45651qj = this.LJLIL;
        InterfaceC111364Yq LIZIZ = ((InterfaceC255129zo) C1E5.LIZLLL(InterfaceC255129zo.class, activityC45651qj)).LIZIZ();
        C65776Prg LIZ = C65352Pkq.LIZ(GroupInviteViewModel.class);
        AqS56S1200000_1 aqS56S1200000_1 = new AqS56S1200000_1(LIZIZ, activityC45651qj, str, 4);
        GroupInviteViewModel groupInviteViewModel = (GroupInviteViewModel) new C214298b3(LIZ, new AqS153S0100000_3(LIZ, 1490), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), aqS56S1200000_1, C254959zX.INSTANCE, (InterfaceC65784Pro) null, 384).getValue();
        this.LJLILLLLZI = groupInviteViewModel;
        AssemViewModel.asyncSubscribe$default(groupInviteViewModel, new TBT() { // from class: X.9zd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C254969zY) obj).LJLILLLLZI;
            }
        }, null, null, null, new C255059zh(this), 14, null);
        AssemViewModel.asyncSubscribe$default(groupInviteViewModel, new TBT() { // from class: X.9ze
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C254969zY) obj).LJLJI;
            }
        }, null, new AqS170S0100000_4(this, 928), null, new C255039zf(this), 10, null);
    }

    public final View LIZIZ(GroupInfo groupInfo) {
        String str = null;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.b1h, null, false);
        C62846OlW c62846OlW = (C62846OlW) LLLLIILL.findViewById(R.id.eec);
        if (groupInfo != null) {
            str = groupInfo.getAvatarUrl();
        }
        C45S.LIZJ(c62846OlW, C4AS.LJIIJ(str), "GroupInvitationProcessor");
        return LLLLIILL;
    }

    public final void LIZJ(C26227ARb c26227ARb) {
        c26227ARb.LIZJ(new AqS170S0100000_4(this, 922));
        c26227ARb.LJII = false;
        C26231ARf LJI = c26227ARb.LJI();
        this.LJLJJI.add(LJI);
        LJI.LIZLLL();
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public final void LIZLLL(GroupInfo groupInfo, InviteError inviteError, boolean z) {
        String str;
        String str2 = null;
        if (inviteError.LIZIZ()) {
            C26227ARb LIZIZ = C77413UZt.LIZIZ(this.LJLIL);
            C78857UxB.LJJI(LIZIZ, LIZIZ(groupInfo), null);
            LIZIZ.LJ(R.string.gu5);
            LIZIZ.LIZ(R.string.guh);
            UC0.LIZJ(LIZIZ, C255079zj.LJLIL);
            LIZIZ.LIZLLL(C255109zm.LJLIL);
            LIZIZ.LJIIIIZZ = true;
            LIZJ(LIZIZ);
        } else if (inviteError.LIZ()) {
            C26227ARb LIZIZ2 = C77413UZt.LIZIZ(this.LJLIL);
            C78857UxB.LJJI(LIZIZ2, LIZIZ(groupInfo), null);
            LIZIZ2.LJ(R.string.gu4);
            LIZIZ2.LIZ(R.string.gug);
            UC0.LIZJ(LIZIZ2, C255089zk.LJLIL);
            LIZIZ2.LJIIIIZZ = true;
            LIZJ(LIZIZ2);
        } else {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLIL), R.layout.b1i, null, false);
            ((TuxIconView) LLLLIILL.findViewById(R.id.ee_)).setTintColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, this.LJLIL));
            C26227ARb LIZIZ3 = C77413UZt.LIZIZ(this.LJLIL);
            LIZIZ3.LJII = false;
            if (z && (str = inviteError.errorTitle) != null && str.length() != 0) {
                C78857UxB.LJJI(LIZIZ3, LLLLIILL, null);
                LIZIZ3.LJFF(inviteError.errorTitle);
            }
            LIZIZ3.LIZIZ(inviteError.errorMessage);
            UC0.LIZJ(LIZIZ3, C255119zn.LJLIL);
            LIZIZ3.LIZJ(new AqS170S0100000_4(this, 923));
            LIZJ(LIZIZ3);
        }
        OSZ[] oszArr = new OSZ[2];
        GroupInfo groupInfo2 = this.LJLJI;
        if (groupInfo2 != null) {
            str2 = groupInfo2.getConversationId();
        }
        oszArr[0] = new OSZ(str2, "conversation_id");
        oszArr[1] = new OSZ(inviteError.errorCode, "error_code");
        FMX.LJIILL("show_invalid_share", oszArr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
