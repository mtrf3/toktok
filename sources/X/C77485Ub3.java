package X;

import Y.ARunnableS49S0100000_13;
import android.content.Context;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ub3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77485Ub3 implements InterfaceC77500UbI {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ DataChannel LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ ExchangeParams LJ;
    public final /* synthetic */ InterfaceC88472Yns<Throwable, C76800UCe> LJFF;
    public final /* synthetic */ Context LJI;
    public final /* synthetic */ InterfaceC77468Uam LJII;

    @Override // X.InterfaceC77500UbI
    public final void LIZ(String str) {
        this.LIZ.invoke();
        DataChannel dataChannel = this.LIZIZ;
        C77448UaS.LJFF(this.LJ.way, this.LIZJ, dataChannel, this.LIZLLL, false);
        C30868C9o.LIZJ(R.string.l43);
        C73943T0h.LIZ().LIZIZ(new C77445UaP());
        C73943T0h LIZ = C73943T0h.LIZ();
        Boolean bool = Boolean.TRUE;
        LIZ.LIZIZ(new C77446UaQ(bool, (int) this.LJ.coinsCount, bool));
    }

    @Override // X.InterfaceC77500UbI
    public final void LIZIZ(Throwable e) {
        int i;
        int i2;
        Exception exc;
        o.LJIIIZ(e, "e");
        this.LJFF.invoke(e);
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l44);
        if (e instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) e;
            i = c29401Dk.getErrorCode();
            LJIILJJIL = c29401Dk.getPrompt();
        } else if (e instanceof C0TL) {
            i = ((C0TL) e).statusCode;
        } else if (e instanceof C64799Pbv) {
            i = ((C64799Pbv) e).getStatusCode();
        } else {
            i = -1;
        }
        Context context = this.LJI;
        if (context != null) {
            ExchangeParams exchangeParams = this.LJ;
            DataChannel dataChannel = this.LIZIZ;
            long j = this.LIZJ;
            String str = this.LIZLLL;
            InterfaceC77468Uam interfaceC77468Uam = this.LJII;
            RunnableC77484Ub2 runnableC77484Ub2 = new RunnableC77484Ub2(exchangeParams, e, context, dataChannel, j, str, interfaceC77468Uam);
            ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(interfaceC77468Uam, 6);
            UI8 ui8 = new UI8();
            ui8.LIZIZ = i;
            ui8.LJIIJJI = exchangeParams.source;
            ui8.LJIIL = exchangeParams.way;
            ui8.LJIILIIL = false;
            if (e instanceof Exception) {
                exc = (Exception) e;
            } else {
                exc = null;
            }
            ui8.LIZLLL = exc;
            C77489Ub7 LIZ = C77492UbA.LIZ(ui8);
            LIZ.LIZJ = aRunnableS49S0100000_13;
            LIZ.LIZLLL = runnableC77484Ub2;
            if (C77607Ud1.LIZ().LIZ(context, "exchange_fail_block", LIZ).LIZ()) {
                return;
            }
        }
        if (i == 4005205) {
            C77541Ubx.LJIIL();
            C30868C9o.LJI(LJIILJJIL);
        } else if (i == 10034) {
            C30868C9o.LJI(LJIILJJIL);
            InterfaceC77468Uam interfaceC77468Uam2 = this.LJII;
            if (interfaceC77468Uam2 != null) {
                interfaceC77468Uam2.LIZJ();
            }
        } else {
            if (i != 429) {
                switch (i) {
                    case 4005282:
                        i2 = R.string.nvy;
                        break;
                    case 4005283:
                        i2 = R.string.nw8;
                        break;
                    default:
                        i2 = R.string.l44;
                        break;
                }
            } else {
                i2 = R.string.oxu;
            }
            C30868C9o.LIZJ(i2);
            InterfaceC77468Uam interfaceC77468Uam3 = this.LJII;
            if (interfaceC77468Uam3 != null) {
                interfaceC77468Uam3.LIZJ();
            }
        }
        long j2 = this.LIZJ;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_exchange_failed");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j2), "gift_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
        LIZ2.LJIJJ("live_detail", "request_page");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ2.LJJIIJZLJL();
    }

    public C77485Ub3(long j, Context context, InterfaceC77468Uam interfaceC77468Uam, ExchangeParams exchangeParams, DataChannel dataChannel, String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = dataChannel;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = exchangeParams;
        this.LJFF = interfaceC88472Yns;
        this.LJI = context;
        this.LJII = interfaceC77468Uam;
    }
}
