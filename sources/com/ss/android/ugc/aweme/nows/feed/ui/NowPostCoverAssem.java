package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC194007jQ;
import X.C00F;
import X.C110614Vt;
import X.C1806977h;
import X.C181847Bs;
import X.C184637Ml;
import X.C193697iv;
import X.C193727iy;
import X.C193737iz;
import X.C193757j1;
import X.C193777j3;
import X.C193787j4;
import X.C193797j5;
import X.C193977jN;
import X.C193997jP;
import X.C194057jV;
import X.C194237jn;
import X.C194597kN;
import X.C195037l5;
import X.C195937mX;
import X.C196367nE;
import X.C197377or;
import X.C199947t0;
import X.C19N;
import X.C200007t6;
import X.C213688a4;
import X.C214348b8;
import X.C221108m2;
import X.C26338AVi;
import X.C29701Eo;
import X.C2WW;
import X.C32151Nz;
import X.C47704Ins;
import X.C47959Irz;
import X.C51029K0z;
import X.C55749LuL;
import X.C56412MCa;
import X.C57364MfI;
import X.C5H3;
import X.C61328O5c;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65314PkE;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78596Usy;
import X.C78847Ux1;
import X.C7MK;
import X.C7ML;
import X.C7O2;
import X.C7XD;
import X.C7YD;
import X.C8XO;
import X.C8YN;
import X.EnumC199997t5;
import X.EnumC57366MfK;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.O6R;
import X.SY4;
import X.TBT;
import Y.AObserverS71S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowAreaMonitorViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostCoverAssem extends ReusedUISlotAssem<NowPostCoverAssem> implements C8XO<InterfaceC194547kI>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJILLL;
    public final C55749LuL LLFF;
    public final C55749LuL LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public final InterfaceC115514g7 LLI;
    public ImageView LLIFFJFJJ;
    public View LLII;
    public View LLIIII;
    public View LLIIIILZ;
    public SmartAvatarImageView LLIIIJ;
    public TuxTextView LLIIIL;
    public TuxTextView LLIIIZ;
    public TuxTextView LLIIJI;
    public SY4 LLIIJLIL;
    public TuxTextView LLIIL;
    public SmartImageView LLIILII;
    public TuxTextView LLIILZL;
    public TuxTextView LLIIZ;
    public View LLIL;
    public TuxIconView LLILII;
    public C199947t0 LLILIL;
    public C29701Eo LLILL;
    public SmartImageView LLILLIZIL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;
    public C7O2 LLILZIL;
    public final C62822Ol8 LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final C62822Ol8 LLJ;
    public final C62822Ol8 LLJI;
    public final C62822Ol8 LLJIJIL;
    public final C62822Ol8 LLJILJIL;
    public final C62822Ol8 LLJILJILJ;

    static {
        TBT tbt = new TBT(NowPostCoverAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJILLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(NowPostCoverAssem.class, "areaMonitorVM", "getAreaMonitorVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowAreaMonitorViewModel;", 0, c65351Pkp)};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bye;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowPostCoverAssem() {
        new LinkedHashMap();
        this.LLFF = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLFFF = new C55749LuL(C47704Ins.LJ(this, C184637Ml.class, "now_publish_hierarchy_data_key"), checkSupervisorPrepared());
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 618), null, C193777j3.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C193797j5.INSTANCE);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowAreaMonitorViewModel.class);
        this.LLI = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 619), null, C193787j4.INSTANCE, null, null);
        this.LLILZIL = new AbstractC194007jQ() { // from class: X.7jO
        };
        this.LLILZLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 614));
        this.LLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 616));
        this.LLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 615));
        this.LLJIJIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 617));
        this.LLJILJIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 612));
        this.LLJILJILJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 613));
    }

    public final void D4() {
        boolean LJ;
        String str;
        C7O2 c7o2 = this.LLILZIL;
        if (c7o2 instanceof C193997jP) {
            LJ = true;
        } else {
            LJ = o.LJ(c7o2, C194057jV.LIZ);
        }
        if (LJ) {
            A4("show", "post");
        } else {
            if (!(c7o2 instanceof C193977jN)) {
                return;
            }
            if (this.LLIZLLLIL == 2) {
                str = "download";
            } else {
                str = "open";
            }
            A4("show", str);
        }
    }

    public final NowPostCellViewModel n4() {
        return (NowPostCellViewModel) this.LLFII.LIZ(this, LLJILLL[0]);
    }

    public final RelationButton p4() {
        Object value = this.LLILZLL.getValue();
        o.LJIIIIZZ(value, "<get-nowFollowBackButton>(...)");
        return (RelationButton) value;
    }

    public final C181847Bs q4() {
        return (C181847Bs) this.LLFF.getValue();
    }

    public final boolean C4() {
        if (((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LLLIL() && C2WW.LIZIZ() && C00F.LIZ(31744, 0, "tt_now_never_guide_exp", true) == 2) {
            return true;
        }
        if (!C193697iv.LIZLLL() || n4().getState().LJLILLLLZI.LIZ()) {
            return false;
        }
        return true;
    }

    public final void E4() {
        if (C1806977h.LIZ() && getContainerView().getHeight() != 0) {
            TuxTextView tuxTextView = this.LLIIL;
            ViewGroup.LayoutParams layoutParams = null;
            if (tuxTextView != null) {
                int i = 0;
                if (tuxTextView.getVisibility() == 0) {
                    return;
                }
                View view = this.LLIIIILZ;
                if (view != null) {
                    int height = getContainerView().getHeight();
                    View view2 = this.LLIIIILZ;
                    if (view2 != null) {
                        C26338AVi.LJI(view, null, null, null, Integer.valueOf((O6R.LJJIIZ(C32151Nz.LJIIZILJ(64)) + C47959Irz.LIZJ(58, height - view2.getHeight())) / 20), false, 23);
                        View view3 = this.LLIIIILZ;
                        if (view3 != null) {
                            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                layoutParams = layoutParams2;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (marginLayoutParams != null) {
                                i = marginLayoutParams.bottomMargin;
                            }
                            C7XD.LIZ("interactionBubble", String.valueOf(i));
                            return;
                        }
                        o.LJIJI("nowOverlayProfileContainer");
                        throw null;
                    }
                    o.LJIJI("nowOverlayProfileContainer");
                    throw null;
                }
                o.LJIJI("nowOverlayProfileContainer");
                throw null;
            }
            o.LJIJI("communityViolationLink");
            throw null;
        }
    }

    public final String getEnterFrom() {
        return C7MK.LIZLLL(q4().LJLILLLLZI, (C7ML) C51029K0z.LJIILLIIL(this));
    }

    public final void m4() {
        for (Aweme aweme : C78596Usy.LJJIFFI().LIZJ.LIZ()) {
            C195037l5 c195037l5 = C195037l5.LIZIZ;
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            c195037l5.LIZ.LIZ(aid);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, n4());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        view.findViewById(R.id.h76);
        View findViewById = view.findViewById(R.id.h7b);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.now_overlay_fyp_header)");
        this.LLIFFJFJJ = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.h7g);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.now_overlay_profile)");
        this.LLII = findViewById2;
        View findViewById3 = view.findViewById(R.id.h7i);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.now_overlay_profile_mask)");
        this.LLIIII = findViewById3;
        View findViewById4 = view.findViewById(R.id.h7h);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.n…verlay_profile_container)");
        this.LLIIIILZ = findViewById4;
        View findViewById5 = view.findViewById(R.id.h77);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.now_overlay_avatar)");
        this.LLIIIJ = (SmartAvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.h7e);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.now_overlay_name)");
        this.LLIIIL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.h7a);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.now_overlay_fyp_desc)");
        this.LLIIIZ = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.h7c);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.now_overlay_hint)");
        this.LLIIJI = (TuxTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.h7_);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.now_overlay_button)");
        this.LLIIJLIL = (SY4) findViewById9;
        View findViewById10 = view.findViewById(R.id.h7d);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.now_overlay_iv)");
        this.LLIILII = (SmartImageView) findViewById10;
        View findViewById11 = view.findViewById(R.id.cbo);
        o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.dislike_icon)");
        this.LLILII = (TuxIconView) findViewById11;
        SY4 sy4 = this.LLIIJLIL;
        if (sy4 != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
            c110614Vt.LIZJ = C61328O5c.LIZJ(98);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            sy4.setBackground(c110614Vt.LIZ(context));
            View findViewById12 = view.findViewById(R.id.bqk);
            o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.community_violation_link)");
            this.LLIIL = (TuxTextView) findViewById12;
            View findViewById13 = view.findViewById(R.id.h7q);
            o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.now_post_maf_view_tip)");
            this.LLIILZL = (TuxTextView) findViewById13;
            View findViewById14 = view.findViewById(R.id.h7p);
            o.LJIIIIZZ(findViewById14, "view.findViewById(R.id.now_post_full_timestamp)");
            this.LLIIZ = (TuxTextView) findViewById14;
            View findViewById15 = view.findViewById(R.id.h81);
            o.LJIIIIZZ(findViewById15, "view.findViewById(R.id.now_ttn_label_ll)");
            this.LLIL = findViewById15;
            View findViewById16 = view.findViewById(R.id.h7t);
            o.LJIIIIZZ(findViewById16, "view.findViewById(R.id.now_relation_label)");
            this.LLILIL = (C199947t0) findViewById16;
            View findViewById17 = view.findViewById(R.id.h78);
            C29701Eo c29701Eo = (C29701Eo) findViewById17;
            c29701Eo.setRepeatCount(-1);
            c29701Eo.setRepeatMode(1);
            o.LJIIIIZZ(findViewById17, "view.findViewById<Lottie…ble.RESTART\n            }");
            this.LLILL = (C29701Eo) findViewById17;
            View findViewById18 = view.findViewById(R.id.h79);
            o.LJIIIIZZ(findViewById18, "view.findViewById(R.id.n…rlay_avatar_badge_static)");
            this.LLILLIZIL = (SmartImageView) findViewById18;
            View findViewById19 = view.findViewById(R.id.h7z);
            o.LJIIIIZZ(findViewById19, "view.findViewById(R.id.n…ial_count_down_container)");
            this.LLILLJJLI = findViewById19;
            View findViewById20 = view.findViewById(R.id.h7y);
            o.LJIIIIZZ(findViewById20, "view.findViewById(R.id.now_trial_count_down)");
            this.LLILLL = (TuxTextView) findViewById20;
            View findViewById21 = view.findViewById(R.id.h80);
            o.LJIIIIZZ(findViewById21, "view.findViewById(R.id.now_trial_shadow)");
            this.LLILZ = findViewById21;
            NowPostCellViewModel n4 = n4();
            C56412MCa c56412MCa = new C56412MCa();
            c56412MCa.LIZ = true;
            n4.hv0(this, c56412MCa);
            if (C7YD.LIZ(this)) {
                C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.7j0
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C82B) obj).LJLJI;
                    }
                }, null, C193737iz.LJLIL, 6);
                return;
            }
            InterfaceC115514g7 interfaceC115514g7 = this.LLI;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLJILLL;
            C8YN.LJII(this, (AssemViewModel) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[1]), new TBT() { // from class: X.7j2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C196287n6) obj).LJLILLLLZI;
                }
            }, C213688a4.LIZLLL(), C193727iy.LJLIL, 4);
            C8YN.LJII(this, (AssemViewModel) this.LLI.LIZ(this, interfaceC74236TBoArr[1]), new TBT() { // from class: X.7j8
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C196287n6) obj).LJLJI;
                }
            }, C213688a4.LIZLLL(), C193757j1.LJLIL, 4);
            C65314PkE.LJIIJ(this, C194597kN.LIZ.LIZIZ, false, new AObserverS71S0100000_3(this, 28));
            return;
        }
        o.LJIJI("nowOverlayButton");
        throw null;
    }

    public final void r4(User user) {
        String str;
        String nowMediaType;
        if (user == null) {
            return;
        }
        if (((C7ML) C51029K0z.LJIILLIIL(this)).z() == 1 && !C19N.LJ("enable_tt_now_explore_enter_others_profile", true)) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//user/profile");
            buildRoute.withParam("uid", user.getUid());
            buildRoute.withParam("sec_user_id", user.getSecUid());
            buildRoute.withParam("extra_mutual_relation", user.getMutualStruct());
            buildRoute.withParam("extra_from_mutual", true);
            buildRoute.withParam("enter_from", getEnterFrom());
            buildRoute.withParam("enter_from_request_id", user.getRequestId());
            buildRoute.withParam("source_page", C7MK.LJFF(getEnterFrom(), q4().LJLIL));
            buildRoute.withParam("now_card_type", C7MK.LIZIZ(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme()));
            buildRoute.withParam("is_now_clear", String.valueOf(C7MK.LIZJ(n4().getState().LJLIL, ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme())));
            NowPostInfo nowPostInfo = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().nowPostInfo;
            if (nowPostInfo != null) {
                str = nowPostInfo.getNowMediaType();
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            buildRoute.withParam("now_type", str);
            buildRoute.withParam("has_small_window", C78847Ux1.LJJIJIL((C7ML) C51029K0z.LJIILLIIL(this)));
            if (!o.LJ(((C7ML) C51029K0z.LJIILLIIL(this)).LLJJJ(), Boolean.TRUE)) {
                C196367nE c196367nE = C196367nE.LIZ;
                Aweme aweme = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme();
                c196367nE.getClass();
                if (C196367nE.LJFF(aweme)) {
                    String enterFrom = getEnterFrom();
                    EnumC57366MfK enumC57366MfK = EnumC57366MfK.ITEM;
                    String accurateRecType = user.getAccurateRecType();
                    C57364MfI.Companion.getClass();
                    EnumC199997t5 LIZ = C200007t6.LIZ(user);
                    String uid = user.getUid();
                    String requestId = user.getRequestId();
                    String friendTypeStr = user.getFriendTypeStr();
                    if (friendTypeStr == null) {
                        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                        if (matchedFriendStruct != null) {
                            friendTypeStr = matchedFriendStruct.getRelationType();
                        } else {
                            friendTypeStr = null;
                        }
                    }
                    String socialInfo = user.getSocialInfo();
                    String LJLIL = ((InterfaceC194547kI) C51029K0z.LJIILLIIL(this)).LJLIL();
                    NowPostInfo nowPostInfo2 = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().nowPostInfo;
                    if (nowPostInfo2 != null && (nowMediaType = nowPostInfo2.getNowMediaType()) != null) {
                        str2 = nowMediaType;
                    }
                    buildRoute.withParam("recommend_enter_profile_params", new C57364MfI(enterFrom, "", enumC57366MfK, accurateRecType, LIZ, uid, null, null, requestId, null, friendTypeStr, socialInfo, null, null, null, null, false, null, LJLIL, str2, String.valueOf(C7MK.LIZJ(n4().getState().LJLIL, ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme())), false, null, false, 14938112, null));
                }
            }
            buildRoute.open();
        }
        C7MK.LJI("enter_personal_detail", new AqS134S0200000_3(this, user, 107));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    public final void A4(String str, String str2) {
        C7MK.LJI("now_button_action", new AqS13S2100000_3(str, str2, this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x046b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B4(X.C7O2 r20, X.C194227jm r21) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.ui.NowPostCoverAssem.B4(X.7O2, X.7jm):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x03a5, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0449, code lost:
    
        if (r6 != null) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x046e, code lost:
    
        if (r15 != null) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04d7, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, r1) != false) goto L572;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x097e  */
    @Override // X.InterfaceC194257jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIJLIL(X.AbstractC193947jK r31, X.C194437k7 r32) {
        /*
            Method dump skipped, instructions count: 2639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.ui.NowPostCoverAssem.LLIIJLIL(X.7jK, X.7k7):void");
    }

    public static /* synthetic */ void z4(NowPostCoverAssem nowPostCoverAssem, Context context, String str) {
        nowPostCoverAssem.u4(context, str, false, null, null, "", Boolean.FALSE);
    }

    public final void u4(Context context, String str, boolean z, String str2, String str3, String str4, Boolean bool) {
        C197377or.LIZJ(context, str, getEnterFrom(), ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme(), C195937mX.LJIIL(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAuthor(), ((C7ML) C51029K0z.LJIILLIIL(this)).z()), z, str2, bool, null, str3, str4, null, q4().LJLIL.LIZIZ(), q4().LJLJJL, q4().LJLJJLL, q4().LJLIL.LJFF(), 2304);
    }
}
