package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ub4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77486Ub4 implements InterfaceC77512UbU {
    @Override // X.InterfaceC77512UbU
    public final InterfaceC77501UbJ LIZ(Context context, InterfaceC77503UbL interfaceC77503UbL) {
        int statusCode;
        int i;
        boolean z = interfaceC77503UbL instanceof C77489Ub7;
        int i2 = R.string.l44;
        if (z) {
            C77489Ub7 c77489Ub7 = (C77489Ub7) interfaceC77503UbL;
            UI8 ui8 = c77489Ub7.LJ;
            if (UII.LIZ(c77489Ub7.LIZ)) {
                if (ui8 != null) {
                    UI6.LIZJ(context, ui8);
                    return UIG.LIZIZ();
                }
            } else {
                Exception exc = c77489Ub7.LIZIZ;
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l44);
                if (exc instanceof C29401Dk) {
                    C29401Dk c29401Dk = (C29401Dk) exc;
                    statusCode = c29401Dk.getErrorCode();
                    LJIILJJIL = c29401Dk.getPrompt();
                    if (LJIILJJIL == null) {
                        LJIILJJIL = C15380j0.LJIILJJIL(R.string.l44);
                    }
                } else if (exc instanceof C0TL) {
                    statusCode = ((C0TL) exc).statusCode;
                } else {
                    if (exc instanceof C64799Pbv) {
                        statusCode = ((C64799Pbv) exc).getStatusCode();
                    }
                    C30868C9o.LJI(C15380j0.LJIILJJIL(i2));
                    return UIG.LIZIZ();
                }
                if (statusCode != 10034) {
                    int i3 = 0;
                    if (statusCode != 40001) {
                        if (statusCode != 4005205) {
                            if (statusCode != 4005285) {
                                if (statusCode != 429) {
                                    switch (statusCode) {
                                        case 4005282:
                                            i2 = R.string.nvy;
                                            break;
                                        case 4005283:
                                            i2 = R.string.nw8;
                                            break;
                                    }
                                } else {
                                    i2 = R.string.oxu;
                                }
                                C30868C9o.LJI(C15380j0.LJIILJJIL(i2));
                            } else {
                                IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
                                if (ui8 != null) {
                                    i = ui8.LJIIJJI;
                                    i3 = ui8.LJIIL;
                                } else {
                                    i = 0;
                                }
                                ((WalletExchange) walletExchange).LJJIFFI(context, i, i3, LJIILJJIL);
                            }
                        } else {
                            C77541Ubx.LJIIL();
                            C30868C9o.LJI(LJIILJJIL);
                        }
                    } else if (ui8 != null && (ui8.LJIIJJI == 9 || ui8.LJIIJJI == 10)) {
                        C30868C9o.LIZJ(R.string.kdm);
                    }
                } else {
                    C30868C9o.LJI(LJIILJJIL);
                }
                return UIG.LIZIZ();
            }
        } else {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.l44));
        }
        return UIG.LIZ();
    }
}
