package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletCurrencyLocaliseSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletUgLocaleMappingSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Uay, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77480Uay {
    public static CharSequence LIZIZ(int i) {
        String str;
        Integer num;
        String str2;
        long j;
        int i2;
        boolean z;
        UserBalance userBalance;
        String str3;
        int i3;
        String str4;
        String currencyCode;
        InterfaceC11100c6.LIZ.getClass();
        InterfaceC77573UcT interfaceC77573UcT = (InterfaceC77573UcT) C11090c5.LIZ().LIZIZ(InterfaceC77573UcT.class);
        String str5 = null;
        Locale forLanguageTag = null;
        if (interfaceC77573UcT != null) {
            str = interfaceC77573UcT.getContent();
        } else {
            str = null;
        }
        if (C29306Beo.LJIJJLI(str)) {
            return str;
        }
        if (i != -2) {
            if (i == -1) {
                IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
                BalanceStruct balanceStruct = ((WalletCenter) iWalletService.walletCenter()).LJLJJL;
                BalanceStructExtra exchangeInfo = balanceStruct.getExchangeInfo();
                if (exchangeInfo != null && (userBalance = balanceStruct.getUserBalance()) != null) {
                    CurrencyInfo currencyInfo = exchangeInfo.getCurrencyInfo();
                    if (currencyInfo != null) {
                        str3 = currencyInfo.getSymbol();
                    } else {
                        str3 = null;
                    }
                    long balance = userBalance.getBalance();
                    CurrencyInfo currencyInfo2 = exchangeInfo.getCurrencyInfo();
                    if (currencyInfo2 != null) {
                        i3 = currencyInfo2.getKeepDot();
                    } else {
                        i3 = 0;
                    }
                    CurrencyInfo currencyInfo3 = exchangeInfo.getCurrencyInfo();
                    if (currencyInfo3 != null) {
                        str4 = currencyInfo3.getCode();
                    } else {
                        str4 = null;
                    }
                    IWalletExchange walletExchange = iWalletService.walletExchange();
                    CurrencyInfo currencyInfo4 = exchangeInfo.getCurrencyInfo();
                    if (currencyInfo4 != null) {
                        currencyCode = currencyInfo4.getCode();
                    } else {
                        currencyCode = null;
                    }
                    walletExchange.getClass();
                    o.LJIIIZ(currencyCode, "currencyCode");
                    String str6 = LiveWalletUgLocaleMappingSetting.INSTANCE.getValue().get(currencyCode);
                    if (str6 != null) {
                        forLanguageTag = Locale.forLanguageTag(str6);
                    }
                    return LIZJ(-1, LIZ(str3, balance, i3, true, str4, forLanguageTag), null, false, exchangeInfo.getCoins());
                }
            }
        } else {
            WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
            ExchangeDisplayInfo exchangeDisplayInfo = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI;
            if (exchangeDisplayInfo != null) {
                num = Integer.valueOf(exchangeDisplayInfo.exchangeEntranceSubtitle);
            } else {
                num = null;
            }
            C0F3 c0f3 = new C0F3();
            if (num != null) {
                java.util.Map map = (java.util.Map) c0f3.LIZ;
                if (map != null) {
                    if (map.containsKey(num)) {
                        java.util.Map map2 = (java.util.Map) c0f3.LIZ;
                        if (map2 != null) {
                            String str7 = (String) map2.get(num);
                            if (str7 != null) {
                                return str7;
                            }
                        } else {
                            o.LJIJI("experimentMap");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("experimentMap");
                    throw null;
                }
            }
            BalanceStructExtra balanceStructExtra = walletStruct.LIZ;
            if (balanceStructExtra != null) {
                if (balanceStructExtra.isLocal()) {
                    str2 = ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIIZILJ(balanceStructExtra.getCoins(), true);
                } else {
                    str2 = null;
                }
                CurrencyInfo currencyInfo5 = balanceStructExtra.getCurrencyInfo();
                if (currencyInfo5 != null) {
                    str5 = currencyInfo5.getSymbol();
                }
                RevenueExchange revenueExchange = walletStruct.revenue;
                if (revenueExchange != null) {
                    j = revenueExchange.getBalance();
                } else {
                    j = 0;
                }
                CurrencyInfo currencyInfo6 = balanceStructExtra.getCurrencyInfo();
                if (currencyInfo6 != null) {
                    i2 = currencyInfo6.getKeepDot();
                } else {
                    i2 = 0;
                }
                String LIZ = LIZ(str5, j, i2, false, "", null);
                long coins = balanceStructExtra.getCoins();
                RevenueExchange revenueExchange2 = walletStruct.revenue;
                if (revenueExchange2 != null) {
                    z = revenueExchange2.isRevenue();
                } else {
                    z = false;
                }
                return LIZJ(-2, LIZ, str2, z, coins);
            }
        }
        return null;
    }

    public static CharSequence LIZJ(int i, String str, String str2, boolean z, long j) {
        int i2;
        String LJIILL;
        WalletStruct walletStruct = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLIL;
        Drawable LJI = C15380j0.LJI(R.drawable.cub);
        if (LJI != null) {
            int LIZ = C15380j0.LIZ(13.0f);
            LJI.setBounds(0, 0, LIZ, LIZ);
            C32207CkV c32207CkV = new C32207CkV(LJI);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(". ");
            LIZ2.append(j);
            LIZ2.append(" )");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            if (i == -1) {
                LJIILL = C15380j0.LJIILL(R.string.l46, a1.LJ(str, " ( ", LIZIZ));
            } else {
                if (z) {
                    if (walletStruct.isPeriodicPayout) {
                        i2 = R.string.l1o;
                    } else {
                        i2 = R.string.loc;
                    }
                } else if (walletStruct.isPeriodicPayout) {
                    i2 = R.string.l2d;
                } else {
                    i2 = R.string.lob;
                }
                if (str2 != null) {
                    LJIILL = C15380j0.LJIILL(i2, UPJ.LIZIZ(str, " ≈ ", str2, " ( ", LIZIZ));
                } else {
                    LJIILL = C15380j0.LJIILL(i2, a1.LJ(str, " ( ", LIZIZ));
                }
            }
            SpannableString spannableString = new SpannableString(LJIILL);
            spannableString.setSpan(c32207CkV, LJIILL.length() - LIZIZ.length(), (LJIILL.length() - LIZIZ.length()) + 1, 33);
            return spannableString;
        }
        return null;
    }

    public static String LIZ(String str, long j, int i, boolean z, String str2, Locale locale) {
        double pow = j / Math.pow(10.0d, 2.0d);
        String str3 = "";
        if (z && LiveWalletCurrencyLocaliseSetting.INSTANCE.getValue()) {
            IWalletExchange walletExchange = ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange();
            List LJJIJ = C47261Igj.LJJIJ(new BigDecimal(String.valueOf(pow)));
            if (str2 != null) {
                str3 = str2;
            }
            Boolean bool = Boolean.TRUE;
            Object obj = ListProtector.get(((WalletExchange) walletExchange).LJIILJJIL(LJJIJ, i, str3, locale, bool, bool), 0);
            o.LJIIIIZZ(obj, "{\n                Servic…e, true)[0]\n            }");
            return (String) obj;
        }
        StringBuilder LIZ = X1D.LIZ();
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIIL(pow, i));
        return X1D.LIZIZ(LIZ);
    }
}
