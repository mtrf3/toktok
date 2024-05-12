package com.ss.android.ugc.aweme.profile.widgets.recommend.user;

import X.AbstractC57828Mmm;
import X.AbstractC72932td;
import X.AnonymousClass990;
import X.AnonymousClass991;
import X.AnonymousClass992;
import X.AnonymousClass993;
import X.C00F;
import X.C141415gn;
import X.C16880lQ;
import X.C188727au;
import X.C221018lt;
import X.C221108m2;
import X.C223208pQ;
import X.C2320198r;
import X.C2320698w;
import X.C234999Kd;
import X.C243089gO;
import X.C3C1;
import X.C57778Mly;
import X.C57788Mm8;
import X.C57825Mmj;
import X.C62822Ol8;
import X.C64698PaI;
import X.C65352Pkq;
import X.C72912tb;
import X.C8VC;
import X.C99C;
import X.C99F;
import X.C99U;
import X.C9TY;
import X.FMX;
import X.HG3;
import X.InterfaceC235069Kk;
import X.InterfaceC57760Mlg;
import X.InterfaceC57784Mm4;
import X.InterfaceC57910Mo6;
import X.RBX;
import X.V1I;
import X.X1D;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.experiment.HomepageRecommendSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HomepageRecommendVM extends AssemViewModel<C2320198r> implements InterfaceC57910Mo6 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 750));
    public boolean LJLILLLLZI;
    public boolean LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C2320198r defaultState() {
        return new C2320198r(0);
    }

    public final InterfaceC57760Mlg hv0() {
        return (InterfaceC57760Mlg) this.LJLIL.getValue();
    }

    public final User iv0() {
        User user;
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd == null || (user = c234999Kd.LIZ) == null) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            o.LJIIIIZZ(curUser, "userService().curUser");
            return curUser;
        }
        return user;
    }

    public final boolean jv0() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (C2320698w.LIZ().getBoolean(C9TY.LIZ("has_show_recommend_card_today"), false)) {
            C221018lt.LJFF(C16880lQ.LJLLJ(HomepageRecommendVM.class), "shouldAutoExpand[false], hasShowed");
            Boolean bool = Boolean.FALSE;
            C243089gO.LIZJ(bool, null, bool, 254);
            return false;
        }
        if (getState().LJLIL != AnonymousClass991.HIDE) {
            C221018lt.LJFF(C16880lQ.LJLLJ(HomepageRecommendVM.class), "shouldAutoExpand[false],already loading or expand");
            Boolean bool2 = Boolean.FALSE;
            C243089gO.LIZJ(bool2, bool2, Boolean.TRUE, LiveCoverMinSizeSetting.DEFAULT);
            return false;
        }
        HomepageRecommendSetting.HomepageRecommendConfigModel LIZ = HomepageRecommendSetting.LIZ();
        if (((Number) C99U.LIZ.getValue()).intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        long j = C2320698w.LIZ().getLong(C9TY.LIZ("hide_relation_card_timestamp"), Long.MIN_VALUE);
        if (j == Long.MIN_VALUE || ((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 86400000) - ((TimeZone.getDefault().getRawOffset() + j) / 86400000) >= LIZ.xDays) {
            z2 = true;
        } else {
            z2 = false;
        }
        int LIZIZ = C2320698w.LIZIZ();
        if (LIZIZ < LIZ.yHide) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i = C2320698w.LIZ().getInt(C9TY.LIZ("enter_profile_times_today"), 0);
        if (i >= C99F.LIZ()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z && z2 && z3 && z4) {
            z5 = true;
        }
        String LJLLJ = C16880lQ.LJLLJ(HomepageRecommendVM.class);
        StringBuilder LIZLLL = C00F.LIZLLL("shouldAutoExpand[result:", z5, "][hideTime:", z2, ", lastTime:");
        String date = new Date(j).toString();
        o.LJIIIIZZ(date, "Date(timestamp).toString()");
        LIZLLL.append(date);
        LIZLLL.append(", xDay:");
        V1I.LIZJ(LIZLLL, LIZ.xDays, "][hideCount:", z3);
        V1I.LIZLLL(LIZLLL, ", count:", LIZIZ, ", yHide:");
        V1I.LIZJ(LIZLLL, LIZ.yHide, "][enterTime:", z4);
        LIZLLL.append(", time:");
        LIZLLL.append(i);
        LIZLLL.append(", jTimes:");
        LIZLLL.append(C99F.LIZ());
        LIZLLL.append(']');
        C221018lt.LJFF(LJLLJ, X1D.LIZIZ(LIZLLL));
        Boolean valueOf = Boolean.valueOf(z5);
        Boolean bool3 = Boolean.TRUE;
        C243089gO.LIZIZ(valueOf, bool3, bool3, true, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), bool3);
        return z5;
    }

    public final void kv0() {
        if (((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 86400000) - ((C2320698w.LIZ().getLong(C9TY.LIZ("last_enter_profile_timestamp"), Long.MIN_VALUE) + TimeZone.getDefault().getRawOffset()) / 86400000) > 0) {
            C2320698w.LIZ().storeLong(C9TY.LIZ("last_enter_profile_timestamp"), System.currentTimeMillis());
            C2320698w.LIZ().storeInt(C9TY.LIZ("enter_profile_times_today"), 1);
            C2320698w.LIZ().storeBoolean(C9TY.LIZ("has_show_recommend_card_today"), false);
            this.LJLILLLLZI = false;
            return;
        }
        C2320698w.LIZ().storeInt(C9TY.LIZ("enter_profile_times_today"), C2320698w.LIZ().getInt(C9TY.LIZ("enter_profile_times_today"), 0) + 1);
    }

    public final void gv0(AnonymousClass992 reason) {
        InterfaceC57760Mlg hv0;
        o.LJIIIZ(reason, "reason");
        if (reason != AnonymousClass992.UNINITIALIZED && (hv0 = hv0()) != null) {
            hv0.xk0(null);
        }
        String name = reason.name();
        Locale locale = Locale.ROOT;
        String LIZIZ = C141415gn.LIZIZ(locale, "ROOT", name, locale, "this as java.lang.String).toLowerCase(locale)");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("reason", LIZIZ);
        FMX.LJIIL("homepage_rec_card_do_expand", c188727au.LIZ);
        if (!this.LJLJI) {
            setState(new AqS170S0100000_4(reason, 740));
        } else {
            setState(new AqS170S0100000_4(reason, 741));
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        if ((abstractC57828Mmm instanceof C57788Mm8) || (abstractC57828Mmm instanceof C57825Mmj)) {
            this.LJLILLLLZI = true;
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        boolean z;
        List<InterfaceC57784Mm4> LIZ;
        AnonymousClass993 anonymousClass993;
        C3C1 c3c1;
        o.LJIIIZ(state, "state");
        if (getState().LJLJJI == AnonymousClass992.CLICK) {
            z = true;
        } else {
            z = false;
        }
        AbstractC72932td<C223208pQ> abstractC72932td = state.LIZ;
        if (abstractC72932td instanceof C3C1) {
            o.LJIIIZ(abstractC72932td, "<this>");
            Throwable th = null;
            if ((abstractC72932td instanceof C3C1) && (c3c1 = (C3C1) abstractC72932td) != null) {
                th = c3c1.LIZ;
            }
            if (th instanceof C64698PaI) {
                anonymousClass993 = AnonymousClass993.NO_NET;
                C243089gO.LJ(false, "no_net");
            } else {
                anonymousClass993 = AnonymousClass993.API_ERROR;
                C243089gO.LJ(false, "api_error");
            }
            setState(new AqS47S0110000_4(z, anonymousClass993, 7));
            return;
        }
        if (!(abstractC72932td instanceof C72912tb) || (LIZ = state.LIZJ.LIZ()) == null) {
            return;
        }
        int size = LIZ.size();
        if (getState().LJLIL == AnonymousClass991.LOADING) {
            if (size <= 0) {
                C243089gO.LJ(false, "empty");
                setState(new AqS9S0010000_4(z, 38));
                return;
            } else {
                C243089gO.LJ(true, "begin_expand");
                setState(AnonymousClass990.LJLIL);
                this.LJLJI = true;
                return;
            }
        }
        if (size > 0) {
            return;
        }
        setState(C99C.LJLIL);
        this.LJLJI = false;
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLILLLLZI = true;
    }
}
