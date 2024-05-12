package X;

import android.content.Context;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.GiftGuideExchangeDialogVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Ub0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77482Ub0 {
    public static UHX LIZ(EnumC77490Ub8 type, Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam, String str) {
        o.LJIIIZ(type, "type");
        WalletCenter walletCenter = C32355Cmt.LIZ;
        UHX uhx = null;
        if (walletCenter.LJFF(c77453UaX.LIZIZ)) {
            return null;
        }
        WalletStruct walletStruct = walletCenter.LJLIL;
        int i = C77491Ub9.LIZ[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                uhx = new C77544Uc0(context, c77453UaX, interfaceC77468Uam);
            }
            return uhx;
        }
        Boolean LIZ = walletStruct.LIZ();
        o.LJIIIIZZ(LIZ, "walletStruct.liveAutoExchangeEnable");
        if (LIZ.booleanValue()) {
            uhx = new C77545Uc1(context, c77453UaX, interfaceC77468Uam);
        } else {
            uhx = new C77546Uc2(context, c77453UaX, interfaceC77468Uam);
        }
        ExchangeDialogVM LIZJ = uhx.LIZJ();
        if (LIZJ != null) {
            LIZJ.LJLJI = str;
        }
        return uhx;
    }

    public static boolean LIZIZ(EnumC77490Ub8 type, Context context, C77453UaX c77453UaX, InterfaceC77468Uam interfaceC77468Uam, String str) {
        C77470Uao c77470Uao;
        o.LJIIIZ(type, "type");
        if (C32355Cmt.LIZ.LJFF(c77453UaX.LIZIZ)) {
            return false;
        }
        int i = C77491Ub9.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            c77470Uao = new C77470Uao(context, c77453UaX, interfaceC77468Uam, "ug");
        } else {
            c77470Uao = new C77470Uao(context, c77453UaX, interfaceC77468Uam, "live");
        }
        GiftGuideExchangeDialogVM giftGuideExchangeDialogVM = c77470Uao.LJIIJ;
        if (giftGuideExchangeDialogVM != null) {
            giftGuideExchangeDialogVM.LJLJI = str;
        }
        if (c77470Uao == null) {
            return false;
        }
        return c77470Uao.LJI();
    }
}
