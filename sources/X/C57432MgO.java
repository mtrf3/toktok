package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.common.LiveEventObserver;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friends.model.RelationDataSource;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS108S0101000_9;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.MgO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57432MgO extends AbstractC57431MgN {
    public final RelationButton LJLLILLLL;
    public C226678v1 LJLLJ;

    @Override // X.InterfaceC57449Mgf
    public final void LIZIZ() {
        NextLiveData<RelationStatus> nextLiveData;
        LiveEventObserver<RelationStatus> liveEventObserver = this.LJLJJLL;
        if (liveEventObserver != null && (nextLiveData = liveEventObserver.LJLIL) != null) {
            nextLiveData.removeObserver(liveEventObserver);
        }
    }

    @Override // X.AbstractC57431MgN
    public final void LJII() {
        if (C99W.LIZ) {
            this.LJLLILLLL.getClass();
        }
        if (LJIILJJIL()) {
            IMService.createIIMServicebyMonsterPlugin(false).getImEnsureService().LIZ();
        }
        this.LJLLILLLL.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 184)));
    }

    @Override // X.AbstractC57431MgN
    public final void LJIILIIL() {
        this.LJLJJLL = RelationDataSource.INSTANCE.get().subscribe(LJ(), this);
        LJI().LJLJI.observe(LJ(), this.LJLJLJ);
    }

    @Override // X.AbstractC57431MgN, X.InterfaceC57449Mgf
    public final void LJJLIIIJJIZ() {
        String str;
        String str2;
        String str3;
        String str4;
        C57430MgM invoke;
        C57430MgM invoke2;
        String str5;
        C57430MgM invoke3;
        C57430MgM invoke4;
        C57430MgM invoke5;
        C226678v1 c226678v1 = this.LJLLJ;
        if (c226678v1 == null || !c226678v1.LJIILJJIL) {
            return;
        }
        int followStatus = LJFF().getFollowStatus();
        Integer valueOf = Integer.valueOf(LJFF().getFollowerStatus());
        if (followStatus != EnumC57435MgR.UNFOLLOW.getValue()) {
            return;
        }
        int value = EnumC57435MgR.FOLLOWED.getValue();
        if (valueOf == null || valueOf.intValue() != value) {
            return;
        }
        SocialDataStruct socialData = LJFF().getSocialData();
        if (socialData != null && socialData.isNewFollower()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        String uid = LJFF().getUid();
        String accurateRecType = LJFF().getAccurateRecType();
        String str6 = "";
        if (accurateRecType == null) {
            accurateRecType = "";
        }
        InterfaceC65784Pro<C57430MgM> tracker = this.LJLLILLLL.getTracker();
        String str7 = null;
        if (tracker == null || (invoke5 = tracker.invoke()) == null || (str2 = invoke5.LIZIZ) == null) {
            str2 = "";
        }
        InterfaceC65784Pro<C57430MgM> tracker2 = this.LJLLILLLL.getTracker();
        if (tracker2 == null || (invoke4 = tracker2.invoke()) == null || (str3 = invoke4.LJFF) == null) {
            str3 = "";
        }
        InterfaceC65784Pro<C57430MgM> tracker3 = this.LJLLILLLL.getTracker();
        if (tracker3 == null || (invoke3 = tracker3.invoke()) == null || (str4 = invoke3.LIZLLL) == null) {
            str4 = "";
        }
        InterfaceC65784Pro<C57430MgM> tracker4 = this.LJLLILLLL.getTracker();
        if (tracker4 != null && (invoke2 = tracker4.invoke()) != null && (str5 = invoke2.LJIILJJIL) != null) {
            str6 = str5;
        }
        InterfaceC65784Pro<C57430MgM> tracker5 = this.LJLLILLLL.getTracker();
        if (tracker5 != null && (invoke = tracker5.invoke()) != null) {
            str7 = invoke.LJJIIJ;
        }
        o.LJIIIIZZ(uid, "uid");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", uid);
        c188727au.LJIIIZ("rec_type", accurateRecType);
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("previous_page", str3);
        c188727au.LJIIIZ("position", str6);
        c188727au.LJIIIZ("enter_method", str4);
        c188727au.LJIIIZ("is_highlight", str);
        c188727au.LJIIIZ("search_id", str7);
        FMX.LJIIL("show_follow_back_button", c188727au.LIZ);
    }

    public final boolean LJIILJJIL() {
        if (LJFF().getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
            C226678v1 c226678v1 = this.LJLLJ;
            if (c226678v1 != null) {
                if (c226678v1.LIZLLL && !C78966Uyw.LJJIJ().LIZIZ() && this.LJLLI) {
                    return true;
                }
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        if (LJFF().getFollowStatus() == EnumC57435MgR.FOLLOWED.getValue()) {
            C226678v1 c226678v12 = this.LJLLJ;
            if (c226678v12 != null) {
                if (c226678v12.LIZLLL && this.LJLL) {
                    return true;
                }
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57432MgO(RelationButton button) {
        super(button);
        o.LJIIIZ(button, "button");
        this.LJLLILLLL = button;
    }

    @Override // X.AbstractC57431MgN
    /* renamed from: LJIIIIZZ */
    public final void onChanged(RelationStatus t) {
        C57430MgM c57430MgM;
        o.LJIIIZ(t, "t");
        super.onChanged(t);
        RelationViewVM LJI = LJI();
        int followStatus = LJFF().getFollowStatus();
        String uid = LJFF().getUid();
        InterfaceC65784Pro<C57430MgM> tracker = this.LJLLILLLL.getTracker();
        if (tracker != null) {
            c57430MgM = tracker.invoke();
        } else {
            c57430MgM = null;
        }
        Context context = this.LJLLILLLL.getContext();
        o.LJIIIIZZ(context, "button.context");
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context);
        LJI.getClass();
        RelationViewVM.jv0(followStatus, uid, c57430MgM, LIZIZ, false);
    }

    @Override // X.AbstractC57431MgN
    public final boolean LJIIIZ(int i) {
        boolean LJIIIZ = super.LJIIIZ(i);
        if (C6ZT.LIZIZ(this.LJLLILLLL, 300L)) {
            return false;
        }
        if (LJIIIZ) {
            C226678v1 c226678v1 = this.LJLLJ;
            if (c226678v1 != null) {
                if (c226678v1.LJI && LJFF().getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
                    ARI ari = new ARI(this.LJLIL.getCtx());
                    ari.LJI(R.string.tix, new AqS167S0100000_1(this, 328));
                    ari.LJIIIIZZ(R.string.gkb, null);
                    C26227ARb c26227ARb = new C26227ARb(this.LJLIL.getCtx());
                    c26227ARb.LJII = false;
                    c26227ARb.LIZ(R.string.tcl);
                    c26227ARb.LJIIL = ari;
                    c26227ARb.LJI().LIZLLL();
                    return false;
                }
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        if (i == EnumC57435MgR.FOLLOW_REQUESTED.getValue()) {
            C226678v1 c226678v12 = this.LJLLJ;
            if (c226678v12 != null) {
                if (c226678v12.LJFF != EnumC57853MnB.FEED_BIG_CARD) {
                    C36821Ecj<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
                    Integer followCount = privacyAccountFollowCount.LIZ();
                    if (followCount == null || followCount.intValue() != 0) {
                        o.LJIIIIZZ(followCount, "followCount");
                        int intValue = followCount.intValue();
                        if (1 <= intValue && intValue < 4) {
                            Activity LJIJJ = C45804HyK.LJIJJ(this.LJLIL.getCtx());
                            if (LJIJJ != null) {
                                C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                                c26045AKb.LJIIIIZZ(R.string.pao);
                                c26045AKb.LJIIJ();
                            } else {
                                "activity in RelationViewDelegate is null".toString();
                                throw new IllegalArgumentException("activity in RelationViewDelegate is null");
                            }
                        }
                    } else {
                        C62905OmT c62905OmT = new C62905OmT(this.LJLIL.getCtx());
                        c62905OmT.LIZ(R.string.pan);
                        c62905OmT.LJIIJ(R.string.h3a, null);
                        new C62906OmU(c62905OmT).LIZLLL();
                    }
                    privacyAccountFollowCount.LIZLLL(Integer.valueOf(followCount.intValue() + 1));
                }
                if (C3U6.LIZ) {
                    InterfaceC57106Mb8 imSayHiService = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
                    String uid = LJFF().getUid();
                    o.LJIIIIZZ(uid, "finalUser.uid");
                    imSayHiService.LJ(LJFF().getFollowerStatus(), uid, false);
                }
                return true;
            }
            o.LJIJI("config");
            throw null;
        }
        return LJIIIZ;
    }

    @Override // X.AbstractC57431MgN
    public final void LJIIJ(int i) {
        C226678v1 c226678v1 = this.LJLLJ;
        if (c226678v1 != null) {
            java.util.Map<EnumC57435MgR, Integer> map = c226678v1.LJIIIZ;
            if (map != null) {
                EnumC57435MgR.Companion.getClass();
                Integer num = map.get(C57437MgT.LIZ(i));
                if (num != null) {
                    this.LJLLILLLL.setButtonStartIcon(Integer.valueOf(num.intValue()));
                    C226678v1 c226678v12 = this.LJLLJ;
                    if (c226678v12 != null) {
                        java.util.Map<EnumC57435MgR, Boolean> map2 = c226678v12.LJIIJ;
                        if (map2 != null && o.LJ(map2.get(EnumC57435MgR.FOLLOW_MUTUAL), Boolean.TRUE)) {
                            RelationButton relationButton = this.LJLLILLLL;
                            relationButton.LL = true;
                            relationButton.LLIFFJFJJ.LIZLLL = null;
                            relationButton.LJJJJL();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("config");
                    throw null;
                }
            }
            this.LJLLILLLL.setButtonStartIcon(null);
            return;
        }
        o.LJIJI("config");
        throw null;
    }

    @Override // X.AbstractC57431MgN, X.InterfaceC57449Mgf
    public final void LJJJJJL(C57438MgU c57438MgU) {
        C57430MgM c57430MgM;
        NextLiveData<RelationStatus> nextLiveData;
        if (!(c57438MgU instanceof C226678v1)) {
            return;
        }
        LiveEventObserver<RelationStatus> liveEventObserver = this.LJLJJLL;
        if (liveEventObserver != null && (nextLiveData = liveEventObserver.LJLIL) != null) {
            nextLiveData.removeObserver(liveEventObserver);
        }
        this.LJLLJ = (C226678v1) c57438MgU;
        super.LJJJJJL(c57438MgU);
        RelationViewVM LJI = LJI();
        int followStatus = LJFF().getFollowStatus();
        String uid = LJFF().getUid();
        InterfaceC65784Pro<C57430MgM> tracker = this.LJLLILLLL.getTracker();
        if (tracker != null) {
            c57430MgM = tracker.invoke();
        } else {
            c57430MgM = null;
        }
        Context context = this.LJLLILLLL.getContext();
        o.LJIIIIZZ(context, "button.context");
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context);
        LJI.getClass();
        RelationViewVM.jv0(followStatus, uid, c57430MgM, LIZIZ, false);
    }

    @Override // X.AbstractC57431MgN, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(RelationStatus relationStatus) {
        onChanged(relationStatus);
    }

    @Override // X.AbstractC57431MgN
    public final void LJIIJJI(int i, Integer num) {
        int i2;
        C226678v1 c226678v1 = this.LJLLJ;
        if (c226678v1 != null) {
            int i3 = 2;
            switch (C57852MnA.LIZ[c226678v1.LJFF.ordinal()]) {
                case 1:
                    C226678v1 c226678v12 = this.LJLLJ;
                    if (c226678v12 != null) {
                        if (!c226678v12.LJIIZILJ) {
                            i3 = 5;
                        }
                        LJIILLIIL(i, 0, i3);
                        return;
                    }
                    o.LJIJI("config");
                    throw null;
                case 2:
                case 3:
                    LJIILLIIL(i, 0, 2);
                    return;
                case 4:
                    LJIILLIIL(i, EnumC57436MgS.TT_NOW_NORMAL_UNFOLLOW.getValue(), EnumC57436MgS.TT_NOW_NORMAL_FOLLOWING.getValue());
                    return;
                case 5:
                    EnumC57436MgS enumC57436MgS = EnumC57436MgS.TT_NOW_FOLLOW_BACK_OVERLAY;
                    LJIILLIIL(i, enumC57436MgS.getValue(), enumC57436MgS.getValue());
                    return;
                case 6:
                    LJIILLIIL(i, EnumC57436MgS.TT_NOW_POST_UNFOLLOW.getValue(), EnumC57436MgS.TT_NOW_POST_FOLLOWING.getValue());
                    return;
                case 7:
                    this.LJLLILLLL.setEllipsize(TextUtils.TruncateAt.END);
                    this.LJLLILLLL.setMinWidth(0);
                    this.LJLLILLLL.setMinHeight(0);
                    RelationButton relationButton = this.LJLLILLLL;
                    if (i == EnumC57435MgR.FOLLOW_REQUESTED.getValue() || i == EnumC57435MgR.FOLLOWED.getValue()) {
                        i2 = R.attr.gp;
                    } else {
                        i2 = R.attr.eb;
                    }
                    relationButton.setTextColorRes(i2);
                    return;
                default:
                    return;
            }
        }
        o.LJIJI("config");
        throw null;
    }

    public final void LJIILL(RelationButton relationButton, CharSequence charSequence) {
        C226678v1 c226678v1 = this.LJLLJ;
        if (c226678v1 == null || !c226678v1.LJIILL) {
            relationButton.setText(charSequence);
        } else if (!o.LJ(relationButton.getText().toString(), charSequence)) {
            relationButton.setText(charSequence);
        }
    }

    @Override // X.AbstractC57431MgN, X.InterfaceC57449Mgf
    public final void LJJIIJZLJL(int i, AqS108S0101000_9 aqS108S0101000_9) {
        E0X e0x;
        C226678v1 c226678v1 = this.LJLLJ;
        if (c226678v1 != null) {
            List<EnumC57853MnB> list = C57854MnC.LIZ;
            if (list.contains(c226678v1.LJFF)) {
                C226678v1 c226678v12 = this.LJLLJ;
                if (c226678v12 != null) {
                    if (list.contains(c226678v12.LJFF)) {
                        int value = EnumC57436MgS.TT_NOW_NORMAL_UNFOLLOW.getValue();
                        Integer valueOf = Integer.valueOf(R.attr.dj);
                        if (i == value) {
                            e0x = new E0X(R.attr.dj, this.LJLLILLLL.getContext().getDrawable(R.drawable.aup), 1.0f);
                        } else if (i == EnumC57436MgS.TT_NOW_NORMAL_FOLLOWING.getValue()) {
                            C110614Vt c110614Vt = new C110614Vt();
                            c110614Vt.LIZJ = C61328O5c.LIZJ(4);
                            c110614Vt.LIZIZ = Integer.valueOf(R.attr.da);
                            Context context = this.LJLLILLLL.getContext();
                            o.LJIIIIZZ(context, "button.context");
                            e0x = new E0X(R.attr.dj, c110614Vt.LIZ(context), 1.0f);
                        } else if (i == EnumC57436MgS.TT_NOW_FOLLOW_BACK_OVERLAY.getValue()) {
                            C110614Vt c110614Vt2 = new C110614Vt();
                            c110614Vt2.LIZJ = C61328O5c.LIZJ(98);
                            c110614Vt2.LIZIZ = valueOf;
                            Context context2 = this.LJLLILLLL.getContext();
                            o.LJIIIIZZ(context2, "button.context");
                            e0x = new E0X(R.attr.do, c110614Vt2.LIZ(context2), 1.0f);
                        } else if (i == EnumC57436MgS.TT_NOW_POST_UNFOLLOW.getValue()) {
                            C110614Vt c110614Vt3 = new C110614Vt();
                            c110614Vt3.LIZJ = C61328O5c.LIZJ(8);
                            c110614Vt3.LIZIZ = valueOf;
                            Context context3 = this.LJLLILLLL.getContext();
                            o.LJIIIIZZ(context3, "button.context");
                            e0x = new E0X(R.attr.do, c110614Vt3.LIZ(context3), 1.0f);
                        } else {
                            if (i != EnumC57436MgS.TT_NOW_POST_FOLLOWING.getValue()) {
                                return;
                            }
                            C110614Vt c110614Vt4 = new C110614Vt();
                            c110614Vt4.LIZJ = C61328O5c.LIZJ(8);
                            c110614Vt4.LIZIZ = Integer.valueOf(R.attr.dg);
                            Context context4 = this.LJLLILLLL.getContext();
                            o.LJIIIIZZ(context4, "button.context");
                            e0x = new E0X(R.attr.dj, c110614Vt4.LIZ(context4), 1.0f);
                        }
                        this.LJLLILLLL.setTextColorRes(e0x.LIZ);
                        this.LJLLILLLL.setBackground(e0x.LIZIZ);
                        this.LJLLILLLL.setAlpha(e0x.LIZJ);
                        return;
                    }
                    aqS108S0101000_9.invoke();
                    return;
                }
                o.LJIJI("config");
                throw null;
            }
        }
        aqS108S0101000_9.invoke();
    }

    @Override // X.AbstractC57431MgN
    public final void LJIIL(int i, Integer num, String str) {
        String str2;
        C112704ba c112704ba;
        if (o.LJ(((RBX) HG3.LJIILL()).getCurUserId(), str) || i == EnumC57435MgR.SAME_USER.getValue()) {
            this.LJLLILLLL.setVisibility(8);
            this.LJLJLLL = true;
            return;
        }
        if (this.LJLJLLL) {
            this.LJLLILLLL.setVisibility(0);
            this.LJLJLLL = false;
        }
        C226678v1 c226678v1 = this.LJLLJ;
        if (c226678v1 != null) {
            java.util.Map<EnumC57435MgR, C112704ba> map = c226678v1.LJIIIIZZ;
            if (this.LJLL) {
                str2 = str;
            } else {
                str2 = null;
            }
            String LIZLLL = LIZLLL(i, num, map, str2);
            if (i == EnumC57435MgR.UNFOLLOW.getValue() || i == EnumC57435MgR.FOLLOWED.getValue() || i == EnumC57435MgR.FOLLOW_REQUESTED.getValue()) {
                LJIILL(this.LJLLILLLL, LIZLLL);
                return;
            }
            EnumC57435MgR enumC57435MgR = EnumC57435MgR.FOLLOW_MUTUAL;
            if (i != enumC57435MgR.getValue()) {
                return;
            }
            C226678v1 c226678v12 = this.LJLLJ;
            if (c226678v12 != null) {
                java.util.Map<EnumC57435MgR, C112704ba> map2 = c226678v12.LJIIIIZZ;
                if ((map2 == null || (c112704ba = map2.get(enumC57435MgR)) == null || c112704ba.LIZ == null) && !C78966Uyw.LJJIJ().LIZIZ() && this.LJLLI) {
                    C226678v1 c226678v13 = this.LJLLJ;
                    if (c226678v13 != null) {
                        EnumC112694bZ enumC112694bZ = c226678v13.LJ;
                        Context context = this.LJLLILLLL.getContext();
                        o.LJIIIIZZ(context, "button.context");
                        int paddingLeft = (this.LJLLILLLL.getLayoutParams().width - this.LJLLILLLL.getPaddingLeft()) - this.LJLLILLLL.getPaddingRight();
                        o.LJIIIZ(enumC112694bZ, "<this>");
                        int i2 = C112684bY.LIZ[enumC112694bZ.ordinal()];
                        LIZLLL = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "" : IMService.createIIMServicebyMonsterPlugin(false).getImNudgeService().LIZIZ() : C57107Mb9.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService(), context, str, paddingLeft, 4) : C29822Bn8.LIZ(context, R.string.i3_, "context.resources.getStr…(R.string.message_button)") : C29822Bn8.LIZ(context, R.string.exk, "context.resources.getStr…g(R.string.double_follow)");
                    } else {
                        o.LJIJI("config");
                        throw null;
                    }
                }
                LJIILL(this.LJLLILLLL, LIZLLL);
                return;
            }
            o.LJIJI("config");
            throw null;
        }
        o.LJIJI("config");
        throw null;
    }

    public final void LJIILLIIL(int i, int i2, int i3) {
        if (i == EnumC57435MgR.UNFOLLOW.getValue()) {
            this.LJLLILLLL.setButtonVariant(i2);
        } else {
            this.LJLLILLLL.setButtonVariant(i3);
        }
    }

    @Override // X.AbstractC57431MgN
    public final String LIZLLL(int i, Integer num, java.util.Map<EnumC57435MgR, C112704ba> map, String str) {
        C112704ba c112704ba;
        String str2;
        EnumC57435MgR enumC57435MgR = EnumC57435MgR.FOLLOWED;
        if (i == enumC57435MgR.getValue()) {
            if (map == null || (c112704ba = map.get(enumC57435MgR)) == null || (str2 = c112704ba.LIZ) == null) {
                if (str != null) {
                    return C57107Mb9.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService(), this.LJLIL.getCtx(), str, (this.LJLLILLLL.getLayoutParams().width - this.LJLLILLLL.getPaddingLeft()) - this.LJLLILLLL.getPaddingRight(), 4);
                }
                String string = this.LJLIL.getCtx().getResources().getString(R.string.gkd);
                o.LJIIIIZZ(string, "view.ctx.resources.getString(R.string.followed)");
                return string;
            }
            return str2;
        }
        return super.LIZLLL(i, num, map, str);
    }
}
