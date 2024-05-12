package X;

import Y.ARunnableS32S0200000_13;
import Y.ARunnableS5S0500000_13;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletException;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletException;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UaR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77447UaR implements InterfaceC77500UbI {
    public final /* synthetic */ ExchangeParams LIZ;
    public final /* synthetic */ C77455UaZ LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ CompletionBlock<InterfaceC77461Uaf> LIZLLL;
    public final /* synthetic */ Context LJ;

    @Override // X.InterfaceC77500UbI
    public final void LIZ(String str) {
        String str2;
        int i;
        C30868C9o.LIZJ(R.string.l43);
        ExchangeDisplayInfo exchangeDisplayInfo = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LJLJI;
        int i2 = this.LIZ.source;
        if (i2 == 10 || i2 == 15) {
            BZI LIZ = C28787BRn.LIZ("livesdk_withdraw_exchange_success");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(this.LIZ.exchangeLevel, "exchange_level");
            LIZ.LJIJJ(C77455UaZ.LJII(this.LIZ), "charge_reason");
            LIZ.LJIJJ(Integer.valueOf(!exchangeDisplayInfo.isFirstExchange ? 1 : 0), "is_exchange_before");
            LIZ.LJIJJ(Integer.valueOf(exchangeDisplayInfo.LIZ() ? 1 : 0), "is_tax_info_finished");
            LIZ.LJJIFFI(this.LIZ.eventParams);
            LIZ.LJJIIJZLJL();
        } else {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_exchange_success");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(Integer.valueOf(this.LIZ.isFirstRecharge ? 1 : 0), "is_first_recharge");
            LIZ2.LJIJJ(this.LIZ.exchangeLevel, "exchange_level");
            C77455UaZ c77455UaZ = this.LIZIZ;
            ExchangeParams exchangeParams = this.LIZ;
            c77455UaZ.getClass();
            int i3 = exchangeParams.source;
            if (i3 == 0) {
                str2 = "live_detail";
            } else if (i3 != 9) {
                str2 = "";
            } else {
                str2 = "my_profile";
            }
            LIZ2.LJIJJ(str2, "request_page");
            LIZ2.LJIJJ(C77455UaZ.LJII(this.LIZ), "charge_reason");
            LIZ2.LJIJJ(Long.valueOf(this.LIZ.coinsCount), "exchange_coins");
            LIZ2.LJJIFFI(this.LIZ.eventParams);
            if (this.LIZ.source == 0) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                if (dataChannelGlobal.mv0(BroadcastPageChannel.class) != null) {
                    EnumC29309Ber enumC29309Ber = (EnumC29309Ber) dataChannelGlobal.mv0(BroadcastPageChannel.class);
                    if (enumC29309Ber != null && enumC29309Ber.isAudience()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    LIZ2.LJIJJ(Integer.valueOf(i ^ 1), "is_anchor");
                }
            }
            LIZ2.LJJIIJZLJL();
        }
        BZI LIZ3 = C28787BRn.LIZ("livesdk_recharge_exchange_result_return");
        LIZ3.LJIIZILJ();
        LIZ3.LJIJJ("success", "status");
        LIZ3.LJIJJ("", "error_code");
        I9A.LIZ(C30725C4b.LIZ(), this.LIZJ, LIZ3, "loading_duration");
        LIZ3.LJIJJ(this.LIZIZ.LJLJJL, "exchange_entrance");
        LIZ3.LJIJJ(C77455UaZ.LJII(this.LIZ), "charge_reason");
        LIZ3.LJJIIJZLJL();
        C73943T0h.LIZ().LIZIZ(new C77445UaP());
        C73943T0h LIZ4 = C73943T0h.LIZ();
        Boolean bool = Boolean.TRUE;
        LIZ4.LIZIZ(new C77446UaQ(bool, (int) this.LIZ.coinsCount, bool));
        C77455UaZ c77455UaZ2 = this.LIZIZ;
        CompletionBlock<InterfaceC77461Uaf> completionBlock = this.LIZLLL;
        c77455UaZ2.getClass();
        InterfaceC77461Uaf interfaceC77461Uaf = (InterfaceC77461Uaf) ED5.LIZJ(InterfaceC77461Uaf.class, null);
        interfaceC77461Uaf.setOrderID(str);
        interfaceC77461Uaf.setResult("1");
        completionBlock.onSuccess(interfaceC77461Uaf, "");
    }

    @Override // X.InterfaceC77500UbI
    public final void LIZIZ(Throwable e) {
        int i;
        Exception exc;
        ARunnableS5S0500000_13 aRunnableS5S0500000_13;
        ARunnableS32S0200000_13 aRunnableS32S0200000_13;
        o.LJIIIZ(e, "e");
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l44);
        boolean z = e instanceof C29401Dk;
        if (z) {
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
        String str = "";
        if (this.LJ != null) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IWalletService.class);
            o.LJIIIIZZ(LIZ, "getService(IWalletService::class.java)");
            IWalletService iWalletService = (IWalletService) LIZ;
            if (z) {
                exc = (Exception) e;
            } else {
                exc = null;
            }
            CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
            Boolean isContinuable = ((WalletException) iWalletService.walletException()).LIZLLL(customErrorExtra, i);
            o.LJIIIIZZ(isContinuable, "isContinuable");
            if (isContinuable.booleanValue()) {
                ExchangeParams exchangeParams = this.LIZ;
                C77455UaZ c77455UaZ = this.LIZIZ;
                Context context = this.LJ;
                CompletionBlock<InterfaceC77461Uaf> completionBlock = this.LIZLLL;
                aRunnableS5S0500000_13 = new ARunnableS5S0500000_13(exchangeParams, customErrorExtra, c77455UaZ, context, completionBlock, 0);
                aRunnableS32S0200000_13 = new ARunnableS32S0200000_13(c77455UaZ, completionBlock, 3);
            } else {
                aRunnableS5S0500000_13 = null;
                aRunnableS32S0200000_13 = null;
            }
            IWalletException walletException = iWalletService.walletException();
            Context context2 = this.LJ;
            ExchangeParams exchangeParams2 = this.LIZ;
            if (!((WalletException) walletException).LIZ(context2, e, aRunnableS5S0500000_13, aRunnableS32S0200000_13, exchangeParams2.source, exchangeParams2.way, false, null).LJLIL) {
                C30868C9o.LJI(LJIILJJIL);
            }
            if (!isContinuable.booleanValue()) {
                C77455UaZ c77455UaZ2 = this.LIZIZ;
                CompletionBlock<InterfaceC77461Uaf> completionBlock2 = this.LIZLLL;
                c77455UaZ2.getClass();
                InterfaceC77461Uaf interfaceC77461Uaf = (InterfaceC77461Uaf) ED5.LIZJ(InterfaceC77461Uaf.class, null);
                interfaceC77461Uaf.setOrderID("");
                interfaceC77461Uaf.setResult(CardStruct.IStatusCode.DEFAULT);
                completionBlock2.onSuccess(interfaceC77461Uaf, "");
            }
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_exchange_failed");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
        C77455UaZ c77455UaZ3 = this.LIZIZ;
        ExchangeParams exchangeParams3 = this.LIZ;
        c77455UaZ3.getClass();
        int i2 = exchangeParams3.source;
        if (i2 == 0) {
            str = "live_detail";
        } else if (i2 == 9) {
            str = "my_profile";
        }
        LIZ2.LJIJJ(str, "request_page");
        LIZ2.LJJIFFI(this.LIZ.eventParams);
        LIZ2.LJJIIJZLJL();
        BZI LIZ3 = C28787BRn.LIZ("livesdk_recharge_exchange_result_return");
        LIZ3.LJIIZILJ();
        LIZ3.LJIJJ("failed", "status");
        LIZ3.LJIJJ(Integer.valueOf(i), "error_code");
        I9A.LIZ(C30725C4b.LIZ(), this.LIZJ, LIZ3, "loading_duration");
        LIZ3.LJIJJ(this.LIZIZ.LJLJJL, "exchange_entrance");
        LIZ3.LJIJJ(C77455UaZ.LJII(this.LIZ), "charge_reason");
        LIZ3.LJJIIJZLJL();
    }

    public C77447UaR(ExchangeParams exchangeParams, C77455UaZ c77455UaZ, long j, CompletionBlock<InterfaceC77461Uaf> completionBlock, Context context) {
        this.LIZ = exchangeParams;
        this.LIZIZ = c77455UaZ;
        this.LIZJ = j;
        this.LIZLLL = completionBlock;
        this.LJ = context;
    }
}
