package X;

import Y.ACListenerS47S0200000_13;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostEnableNewInvitationPanelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostListReservationButtonColorOptSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TuP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76137TuP extends C78948Uye {
    public static final C76137TuP LJLJJLL = new C76137TuP();

    public static void LJIL(InterfaceC76140TuS viewHolder, C75981Trt data) {
        boolean z;
        boolean z2;
        C2A7 LLFF;
        String LJIILJJIL;
        int i;
        RivalExtraInfo.ReserveInfo reserveInfo;
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(data, "data");
        RivalExtraInfo rivalExtraInfo = data.LJLJJI;
        if (rivalExtraInfo != null && rivalExtraInfo.showPlayType == 2 && (data.LJLJL || !((IInteractService) CN1.LIZ(IInteractService.class)).ta0())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C2A7 LLFF2 = viewHolder.LLFF();
            if (LLFF2 != null) {
                LLFF2.setVisibility(8);
            }
            C2A7 LIZIZ = viewHolder.LIZIZ();
            if (LIZIZ == null) {
                return;
            }
            LIZIZ.setVisibility(0);
            return;
        }
        C2A7 LIZIZ2 = viewHolder.LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.setVisibility(8);
        }
        C2A7 LLFF3 = viewHolder.LLFF();
        if (LLFF3 != null) {
            LLFF3.setVisibility(0);
        }
        RivalExtraInfo rivalExtraInfo2 = data.LJLJJI;
        if (rivalExtraInfo2 == null || (reserveInfo = rivalExtraInfo2.reserveInfo) == null) {
            viewHolder.p(EnumC76138TuQ.RESERVABLE);
        } else if (reserveInfo.replyStatus == 0) {
            viewHolder.p(EnumC76138TuQ.RESERVING);
        } else {
            viewHolder.p(EnumC76138TuQ.RESERVED);
        }
        if (viewHolder.LLJLILLLLZIIL() == EnumC76138TuQ.RESERVED) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2A7 LLFF4 = viewHolder.LLFF();
        if (LLFF4 != null) {
            if (CoHostEnableNewInvitationPanelSetting.INSTANCE.isEnable()) {
                if (CoHostListReservationButtonColorOptSetting.INSTANCE.isEnable()) {
                    i = R.style.abz;
                } else {
                    i = R.style.aby;
                }
            } else if (CoHostListReservationButtonColorOptSetting.INSTANCE.isEnable()) {
                i = R.style.a35;
            } else {
                i = R.style.a3f;
            }
            LLFF4.LJJLL(i);
        }
        int i2 = C76139TuR.LIZ[viewHolder.LLJLILLLLZIIL().ordinal()];
        if (i2 != 1) {
            if ((i2 == 2 || i2 == 3) && (LLFF = viewHolder.LLFF()) != null) {
                LLFF.setEnabled(false);
                if (z2) {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.nbp);
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.nc3);
                }
                LLFF.setText(LJIILJJIL);
            }
        } else {
            C2A7 LLFF5 = viewHolder.LLFF();
            if (LLFF5 != null) {
                LLFF5.setEnabled(true);
                LLFF5.setText(C15380j0.LJIILJJIL(R.string.nbn));
            }
        }
        C2A7 LLFF6 = viewHolder.LLFF();
        if (LLFF6 == null) {
            return;
        }
        C16880lQ.LJJIII(LLFF6, new ACListenerS47S0200000_13(viewHolder, data, 60));
    }

    @Override // X.C78948Uye
    public final /* bridge */ /* synthetic */ void LJIJI(InterfaceC75966Tre interfaceC75966Tre, InterfaceC28306B9a interfaceC28306B9a, int i) {
        LJIL((InterfaceC76140TuS) interfaceC75966Tre, (C75981Trt) interfaceC28306B9a);
    }
}
