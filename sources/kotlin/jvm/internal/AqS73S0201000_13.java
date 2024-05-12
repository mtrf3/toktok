package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C52926Kpu;
import X.C61099NyR;
import X.C61100NyS;
import X.C75022TcQ;
import X.C76120Tu8;
import X.C76800UCe;
import X.C77128UOu;
import X.C77134UPa;
import X.InterfaceC65784Pro;
import X.InterfaceC75179Tex;
import X.InterfaceC75787Tol;
import X.InterfaceC76125TuD;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.UF4;
import X.UPK;
import X.UPZ;
import X.UQ2;
import X.UQ4;
import android.graphics.Rect;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class AqS73S0201000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r3 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS73S0201000_13 r7) {
        /*
            int r1 = r7.i2
            r0 = 1
            if (r1 == r0) goto L67
            r0 = 2
            if (r1 == r0) goto L59
            r0 = 3
            if (r1 == r0) goto L4b
            r0 = 4
            if (r1 == r0) goto L1c
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LJLJLJ
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment
            r3.<init>()
            r3.LJLIL = r0
        L1b:
            return r3
        L1c:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r6 = r0.LJLJLJ
            android.widget.FrameLayout r5 = r0.LJLJLLL
            int r4 = r0.LJLLI
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = r0.LJZI
            X.0x8 r1 = r0.LL
            boolean r0 = r0.LLD
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestNewPropsPageFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestNewPropsPageFragment
            r3.<init>()
            r3.LJLIL = r6
            r3.LJLILLLLZI = r5
            r3.LJLJI = r4
            r3.LJLJJI = r2
            r3.LJLJJL = r1
            r3.LJLJJLL = r0
            java.lang.Object r2 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r2 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r2
            kotlin.jvm.internal.AqS163S0100000_13 r1 = new kotlin.jvm.internal.AqS163S0100000_13
            r0 = 91
            r1.<init>(r2, r0)
            r3.LJLJL = r1
            goto L1b
        L4b:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LJLJLJ
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestGuestPropsPageFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestGuestPropsPageFragment
            r3.<init>()
            r3.LJLJI = r0
            goto L1b
        L59:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LJLJLJ
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment
            r3.<init>()
            r3.LJLIL = r0
            goto L1b
        L67:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LJLJLJ
            r3 = 0
            if (r0 == 0) goto L99
            X.0x8 r0 = r0.LJLJJI
            if (r0 == 0) goto L78
            java.lang.Object r3 = r0.getAttachedComposerManager()
        L78:
            boolean r0 = r3 instanceof X.InterfaceC31981Ni
            if (r0 == 0) goto L99
            X.1Ni r3 = (X.InterfaceC31981Ni) r3
            if (r3 == 0) goto L99
            java.lang.Object r2 = r7.l1
            X.TcQ r2 = (X.C75022TcQ) r2
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            java.lang.String r0 = "getService(T::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.android.live.effect.api.IEffectService r1 = (com.bytedance.android.live.effect.api.IEffectService) r1
            X.TcP r0 = r2.LIZ
            com.bytedance.android.livesdk.ui.BaseFragment r3 = r1.getMultiGuestEffectFragment(r3, r0)
            if (r3 != 0) goto La6
        L99:
            java.lang.Object r0 = r7.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment) r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r0.LJLJLJ
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment r3 = new com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment
            r3.<init>()
            r3.LJLIL = r0
        La6:
            boolean r0 = r3 instanceof com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment
            if (r0 == 0) goto L1b
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "fragment should be LiveMultiGuestEffectFragment, not MultiGuestBeautyLevelAdjustFragment"
            X.C0K2.LIZ(r0, r1)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS73S0201000_13.invoke$0(kotlin.jvm.internal.AqS73S0201000_13):java.lang.Object");
    }

    public static final Object invoke$1(AqS73S0201000_13 aqS73S0201000_13) {
        ((MultiGuestV3GuestBeInvitedDialog) aqS73S0201000_13.l0).vl(aqS73S0201000_13.i2);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS73S0201000_13.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS73S0201000_13 aqS73S0201000_13) {
        Aweme aweme;
        String authorUid;
        UPK upk = (UPK) aqS73S0201000_13.l0;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS73S0201000_13.l1;
        o.LJIIIIZZ(activityC45651qj, "this");
        int i = aqS73S0201000_13.i2;
        upk.getClass();
        if (activityC45651qj.isFinishing()) {
            UPK.LJIIIZ();
        } else if (C52926Kpu.LIZ()) {
            upk.LJIILIIL(i, upk.LJFF(), null, null, null);
        } else {
            String invoke = upk.LIZLLL.invoke();
            if (i == 2) {
                UQ4.LJIILIIL(invoke, "user", "facebook", upk.LJFF(), "on", "off", C77134UPa.LIZ.LIZLLL(), null, 128);
                upk.LJIIJJI(2, activityC45651qj, invoke);
                UQ2.LIZ().LIZ.storeInt("last_permission_pop_up_type", 2);
            } else if (!UPZ.LIZ.LJ()) {
                HomePageDataViewModel homePageDataViewModel = upk.LIZJ;
                String str = null;
                if (homePageDataViewModel != null) {
                    aweme = homePageDataViewModel.LJLJLLL;
                } else {
                    aweme = null;
                }
                FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
                if (aweme != null) {
                    str = aweme.getAid();
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
                    str2 = authorUid;
                }
                LJJIJLIJ.LJIILJJIL(invoke, str, str2, "2");
                C61100NyS LIZ = C61099NyR.LIZIZ.LIZIZ(activityC45651qj, TokenCert.Companion.with("bpea-obtain_contact_access_for_login")).LIZ("android.permission.READ_CONTACTS");
                LIZ.LIZ(new UF4(upk, activityC45651qj));
                LIZ.LIZJ(new C77128UOu(upk, invoke));
                UQ2.LIZ().LIZ.storeInt("last_permission_pop_up_type", 1);
            } else {
                UQ4.LJIILIIL(invoke, "user", "contact", upk.LJFF(), "on", "off", null, null, 192);
                upk.LJIIJJI(1, activityC45651qj, invoke);
                UQ2.LIZ().LIZ.storeInt("last_permission_pop_up_type", 1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS73S0201000_13 aqS73S0201000_13) {
        ((UPK) aqS73S0201000_13.l0).LJI(aqS73S0201000_13.i2, (OSZ) aqS73S0201000_13.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS73S0201000_13 aqS73S0201000_13) {
        ((C76120Tu8) aqS73S0201000_13.l0).LJLLJ = ((InterfaceC75787Tol) aqS73S0201000_13.l1).getContainerActualRange();
        C76120Tu8 c76120Tu8 = (C76120Tu8) aqS73S0201000_13.l0;
        InterfaceC88472Yns<? super Rect, C76800UCe> interfaceC88472Yns = c76120Tu8.LJLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c76120Tu8.LJLLJ);
        }
        InterfaceC76125TuD interfaceC76125TuD = ((C76120Tu8) aqS73S0201000_13.l0).LJLIL;
        if (interfaceC76125TuD != null) {
            interfaceC76125TuD.LJJLIIIJJIZ((InterfaceC75787Tol) aqS73S0201000_13.l1, aqS73S0201000_13.i2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS73S0201000_13 aqS73S0201000_13) {
        List list = (List) aqS73S0201000_13.l0;
        C76120Tu8 c76120Tu8 = (C76120Tu8) aqS73S0201000_13.l1;
        int i = aqS73S0201000_13.i2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            InterfaceC76125TuD LJIILLIIL = c76120Tu8.LJIILLIIL(i, c76120Tu8.LJLJJI);
            if (LJIILLIIL != null) {
                LJIILLIIL.LJIIJ(i, list);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0201000_13(int i, MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment, C75022TcQ c75022TcQ, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = multiGuestEffectSwitchFragment;
        this.l1 = c75022TcQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0201000_13(C76120Tu8 c76120Tu8, InterfaceC75787Tol interfaceC75787Tol, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c76120Tu8;
        this.l1 = interfaceC75787Tol;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS73S0201000_13(UPK upk, UPK upk2, int i, OSZ<Boolean, Boolean> osz) {
        super(0);
        this.$t = osz;
        this.l0 = upk;
        this.i2 = upk2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S0201000_13(UPK upk, ActivityC45651qj activityC45651qj, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = upk;
        this.l1 = activityC45651qj;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS73S0201000_13(MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog2, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = multiGuestV3GuestBeInvitedDialog;
        this.i2 = multiGuestV3GuestBeInvitedDialog2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS73S0201000_13(List list, List<? extends InterfaceC75179Tex> list2, C76120Tu8 c76120Tu8, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = list2;
        this.i2 = c76120Tu8;
    }
}
