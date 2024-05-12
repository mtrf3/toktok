package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C0NB;
import X.C72922tc;
import X.C74769TWb;
import X.C75814TpC;
import X.C76800UCe;
import X.InterfaceC31336CRo;
import X.InterfaceC74596TPk;
import X.InterfaceC88472Yns;
import X.TRU;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import defpackage.g0;

/* loaded from: classes14.dex */
public class AqS9S0111000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS9S0111000_13 aqS9S0111000_13, Object obj) {
        Context context;
        int intValue = ((Number) obj).intValue();
        if (aqS9S0111000_13.z1) {
            ((MultiGuestV3GuestPresenter) aqS9S0111000_13.l0).showApplyDialog(intValue);
        } else {
            InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) ((MultiGuestV3GuestPresenter) aqS9S0111000_13.l0).mView;
            if (interfaceC31336CRo != null) {
                context = interfaceC31336CRo.getContext();
            } else {
                context = null;
            }
            Activity LJIILJJIL = g0.LJIILJJIL(context);
            if (LJIILJJIL != null) {
                C74769TWb.LIZ(false, ((MultiGuestV3GuestPresenter) aqS9S0111000_13.l0).mDataChannel, aqS9S0111000_13.i2, LJIILJJIL, Long.valueOf(intValue), new AqS100S0101000_13((MultiGuestV3GuestPresenter) aqS9S0111000_13.l0, intValue, 0), null);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS9S0111000_13 aqS9S0111000_13, Object obj) {
        UserState mv0;
        UserState userState;
        int i;
        int i2;
        C75814TpC currentState = (C75814TpC) obj;
        o.LJIIIZ(currentState, "currentState");
        if (!(currentState.LJLJJI instanceof C72922tc) && (mv0 = ((LinkStatusViewModel) aqS9S0111000_13.l0).mv0(currentState)) != null) {
            LinkStatusViewModel linkStatusViewModel = (LinkStatusViewModel) aqS9S0111000_13.l0;
            int i3 = aqS9S0111000_13.i2;
            boolean z = aqS9S0111000_13.z1;
            if (i3 == 3) {
                if (z) {
                    i2 = 2;
                } else {
                    i2 = mv0.audioMuted;
                }
                userState = new UserState(null, null, null, 0L, 0, i2, 0, 0, 0, 0, 991, null);
            } else {
                if (z) {
                    i = 2;
                } else {
                    i = mv0.videoMuted;
                }
                userState = new UserState(null, null, null, 0L, 0, 0, i, 0, 0, 0, 959, null);
            }
            linkStatusViewModel.iv0(mv0, userState);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS9S0111000_13 aqS9S0111000_13, Object obj) {
        Context context;
        int intValue = ((Number) obj).intValue();
        if (aqS9S0111000_13.z1) {
            C0NB.LIZIZ("MultiGuestV3GuestReservationPresenter", "showReservationDialog, checkDeviceDelay");
            InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) ((TRU) aqS9S0111000_13.l0).mView;
            if (interfaceC74596TPk != null) {
                interfaceC74596TPk.showReservationDialog(intValue);
            }
        } else {
            C0NB.LIZIZ("MultiGuestV3GuestReservationPresenter", "showReservationDialog, checkDeviceAndPlugin");
            InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) ((TRU) aqS9S0111000_13.l0).mView;
            if (interfaceC31336CRo != null) {
                context = interfaceC31336CRo.getContext();
            } else {
                context = null;
            }
            Activity LJIILJJIL = g0.LJIILJJIL(context);
            if (LJIILJJIL != null) {
                C74769TWb.LIZ(false, ((TRU) aqS9S0111000_13.l0).LJLIL, aqS9S0111000_13.i2, LJIILJJIL, Long.valueOf(intValue), new AqS100S0101000_13((TRU) aqS9S0111000_13.l0, intValue, 12), null);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S0111000_13(boolean z, TRU tru, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = tru;
        this.i2 = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S0111000_13(LinkStatusViewModel linkStatusViewModel, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = linkStatusViewModel;
        this.i2 = i;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S0111000_13(boolean z, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z1 = z;
        this.l0 = multiGuestV3GuestPresenter;
        this.i2 = i;
    }
}
