package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.AnonymousClass175;
import X.AnonymousClass176;
import X.BZI;
import X.C05630Jz;
import X.C0NE;
import X.C28733BPl;
import X.C28787BRn;
import X.C30725C4b;
import X.C30868C9o;
import X.C31847Ceh;
import X.C39471gl;
import X.C39481gm;
import X.C39491gn;
import X.C39501go;
import X.C47071t1;
import X.C74838TYs;
import X.C75832TpU;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76278Twg;
import X.C76280Twi;
import X.C76800UCe;
import X.EnumC76178Tv4;
import X.InterfaceC29856Bng;
import X.InterfaceC74596TPk;
import X.InterfaceC88472Yns;
import X.Q7L;
import X.SY4;
import X.TRU;
import X.UDO;
import X.UF6;
import X.UF8;
import X.UQ6;
import X.UQ7;
import X.UQI;
import Y.AfS5S0000100_13;
import Y.AfS8S0100100_13;
import Y.IDcS172S0100000_13;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestBeInvitedDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.settings.customtab.KevaDebugFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AqS100S0101000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiGuestV3GuestBeInvitedDialog;
        this.i1 = 0;
    }

    public static final Object invoke$0(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        ((Number) obj).intValue();
        ((MultiGuestV3GuestPresenter) aqS100S0101000_13.l0).showApplyDialog(aqS100S0101000_13.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        ((Number) obj).intValue();
        ((MultiGuestV3GuestBeInvitedDialog) aqS100S0101000_13.l0).Gl(aqS100S0101000_13.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        ((Number) obj).intValue();
        ((GameLinkGuestBeInvitedDialog) aqS100S0101000_13.l0).vl(aqS100S0101000_13.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS100S0101000_13 aqS100S0101000_13, Object it) {
        o.LJIIIZ(it, "it");
        Context requireContext = ((SubscriptionSpotlightFragment) aqS100S0101000_13.l0).requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        String string = ((SubscriptionSpotlightFragment) aqS100S0101000_13.l0).getString(R.string.oa7);
        o.LJIIIIZZ(string, "getString(R.string.pm_su…ttings_deleteModal_title)");
        String string2 = ((SubscriptionSpotlightFragment) aqS100S0101000_13.l0).getString(R.string.o_t);
        o.LJIIIIZZ(string2, "getString(R.string.pm_su…gs_deleteModal_deleteBtn)");
        AqS111S0101000_13 aqS111S0101000_13 = new AqS111S0101000_13((SubscriptionSpotlightFragment) aqS100S0101000_13.l0, aqS100S0101000_13.i1, 4);
        String string3 = ((SubscriptionSpotlightFragment) aqS100S0101000_13.l0).getString(R.string.o_s);
        o.LJIIIIZZ(string3, "getString(R.string.pm_su…gs_deleteModal_cancelBtn)");
        UDO secondaryCB = UDO.LJLIL;
        o.LJIIIZ(secondaryCB, "secondaryCB");
        C47071t1 c47071t1 = new C47071t1(requireContext);
        c47071t1.LIZJ = string;
        AnonymousClass175 anonymousClass175 = new AnonymousClass175();
        C39471gl c39471gl = new C39471gl();
        c39471gl.LIZ = string2;
        c39471gl.LIZJ = new IDcS172S0100000_13(aqS111S0101000_13, 32);
        anonymousClass175.LIZ(new C39481gm(c39471gl));
        C39491gn c39491gn = new C39491gn();
        c39491gn.LIZ = string3;
        c39491gn.LIZJ = new IDcS172S0100000_13(secondaryCB, 33);
        anonymousClass175.LIZ(new C39501go(c39491gn));
        anonymousClass175.LIZIZ = 1;
        c47071t1.LIZJ(new AnonymousClass176(anonymousClass175));
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        C31847Ceh.LIZ(c47071t1.LIZ());
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = (SubscriptionSpotlightFragment) aqS100S0101000_13.l0;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_delete_click");
        subscriptionSpotlightFragment.Gl(LIZ);
        LIZ.LJIJJ(subscriptionSpotlightFragment.LJLIL, "show_entrance");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        ((Number) obj).intValue();
        InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) ((TRU) aqS100S0101000_13.l0).mView;
        if (interfaceC74596TPk != null) {
            interfaceC74596TPk.showReservationDialog(aqS100S0101000_13.i1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        ((Number) obj).intValue();
        ((MultiGuestV3GuestBeInvitedDialog) aqS100S0101000_13.l0).vl(aqS100S0101000_13.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        ((Number) obj).intValue();
        ((MultiGuestV3GuestBeInvitedDialog) aqS100S0101000_13.l0).Gl(aqS100S0101000_13.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        ((Number) obj).intValue();
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("invite_issue_check", "onPermissionGrant");
        if (C74838TYs.LJ().LJJ >= aqS100S0101000_13.i1) {
            C30868C9o.LIZJ(R.string.mij);
            ((GameLinkGuestBeInvitedDialog) aqS100S0101000_13.l0).Al();
            ((GameLinkGuestBeInvitedDialog) aqS100S0101000_13.l0).dismiss();
        } else {
            ((GameLinkGuestBeInvitedDialog) aqS100S0101000_13.l0).wl();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS100S0101000_13 aqS100S0101000_13, Object it) {
        o.LJIIIZ(it, "it");
        UF6 uf6 = ((KevaDebugFragment) aqS100S0101000_13.l0).LJLJJI;
        if (uf6 != null) {
            int i = aqS100S0101000_13.i1;
            UF8 uf8 = (UF8) ListProtector.get(uf6.LJLIL, i);
            uf8.getClass();
            uf8.LIZIZ = it;
            uf6.notifyItemChanged(i);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        List<TeamUsersInfo> list;
        Long l;
        int i;
        MutableLiveData<Long> mutableLiveData;
        int intValue = ((Number) obj).intValue();
        boolean z = false;
        if (intValue == 1) {
            C76278Twg c76278Twg = (C76278Twg) aqS100S0101000_13.l0;
            c76278Twg.getClass();
            C76280Twi c76280Twi = C76265TwT.LIZ;
            long LIZIZ = c76280Twi.LIZIZ();
            C76244Tw8 LJII = c76278Twg.LJII();
            if (LJII == null || (mutableLiveData = LJII.LIZ) == null || (l = mutableLiveData.getValue()) == null) {
                l = 0L;
            }
            long longValue = l.longValue();
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            C76271TwZ.LJIIL = C30725C4b.LIZ();
            JSONObject jSONObject = new JSONObject();
            long LIZ = C30725C4b.LIZ() - C76271TwZ.LJIIIIZZ;
            C05630Jz.LJFF(jSONObject, "match_duration", LIZ);
            if (c76280Twi.LJ() == EnumC76178Tv4.START) {
                i = 0;
            } else {
                i = 1;
            }
            C05630Jz.LIZ(i, "stage", jSONObject);
            C76271TwZ.LJJ(jSONObject, false);
            JSONObject jSONObject2 = new JSONObject();
            C05630Jz.LJFF(jSONObject2, "match_duration", LIZ);
            C76271TwZ.LJJZZIII(c76271TwZ, "quit_request", jSONObject, jSONObject2, new JSONObject(), false, 16);
            ((InterfaceC29856Bng) ((MultiMatchApi) Q7L.LIZIZ(MultiMatchApi.class)).quit(LIZIZ, longValue).LIZJ(c76278Twg.LIZIZ())).LIZJ(new AfS8S0100100_13(LIZIZ, c76278Twg, 5), new AfS5S0000100_13(LIZIZ, 1));
        }
        C75832TpU c75832TpU = C75832TpU.LIZ;
        int i2 = aqS100S0101000_13.i1;
        C76244Tw8 LJII2 = ((C76278Twg) aqS100S0101000_13.l0).LJII();
        if (LJII2 != null) {
            list = LJII2.LJIILL;
        } else {
            list = null;
        }
        if (intValue == 1) {
            z = true;
        }
        c75832TpU.LJJIJIIJIL(list, i2, true, z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS100S0101000_13 aqS100S0101000_13, Object it) {
        o.LJIIIZ(it, "it");
        ((MultiLiveAsAnchorListDialogV2) aqS100S0101000_13.l0).LJJLIIIIJ(aqS100S0101000_13.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS100S0101000_13 aqS100S0101000_13, Object it) {
        SY4 sy4;
        o.LJIIIZ(it, "it");
        SY4 sy42 = (SY4) ((SocialConsentFragment) aqS100S0101000_13.l0)._$_findCachedViewById(R.id.brk);
        if ((sy42 == null || !sy42.LLI) && (sy4 = (SY4) ((SocialConsentFragment) aqS100S0101000_13.l0)._$_findCachedViewById(R.id.brk)) != null) {
            sy4.setLoading(true);
        }
        SocialConsentFragment socialConsentFragment = (SocialConsentFragment) aqS100S0101000_13.l0;
        UQI uqi = socialConsentFragment.LJLJI;
        if (uqi != null) {
            int socialRecType = uqi.getSocialRecType();
            UQI uqi2 = ((SocialConsentFragment) aqS100S0101000_13.l0).LJLJI;
            if (uqi2 != null) {
                socialConsentFragment.Gl(socialRecType, uqi2.getStep());
                UQ6.LIZ(aqS100S0101000_13.i1, "sync");
                return C76800UCe.LIZ;
            }
            o.LJIJI("consentConfig");
            throw null;
        }
        o.LJIJI("consentConfig");
        throw null;
    }

    public static final Object invoke$8(AqS100S0101000_13 aqS100S0101000_13, Object it) {
        o.LJIIIZ(it, "it");
        ((SocialConsentFragment) aqS100S0101000_13.l0).vl(aqS100S0101000_13.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS100S0101000_13 aqS100S0101000_13, Object obj) {
        int i;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        if (aqS100S0101000_13.i1 == UQ7.NEW_VERSION_FACEBOOK.getValue()) {
            i = R.string.re6;
        } else {
            i = R.string.re7;
        }
        actionGroup.LJI(i, new AqS100S0101000_13(aqS100S0101000_13.i1, (SocialConsentFragment) aqS100S0101000_13.l0, 7));
        actionGroup.LJIIIIZZ(R.string.re8, new AqS100S0101000_13(aqS100S0101000_13.i1, (SocialConsentFragment) aqS100S0101000_13.l0, 8));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = gameLinkGuestBeInvitedDialog;
        this.i1 = 0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS100S0101000_13(int r3, com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 7: goto Lf;
                case 8: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS100S0101000_13.<init>(int, com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(int i, MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = multiLiveAsAnchorListDialogV2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(TRU tru, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = tru;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(C76278Twg c76278Twg, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c76278Twg;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = multiGuestV3GuestPresenter;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = multiGuestV3GuestBeInvitedDialog;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(SubscriptionSpotlightFragment subscriptionSpotlightFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = subscriptionSpotlightFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(KevaDebugFragment kevaDebugFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = kevaDebugFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0101000_13(int i, GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.l0 = gameLinkGuestBeInvitedDialog;
    }
}
