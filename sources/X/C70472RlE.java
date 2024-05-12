package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.RlE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70472RlE {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(EnumC70477RlJ state) {
        o.LJIIIZ(state, "state");
        int i = C70480RlM.LIZ[state.ordinal()];
        if (i == 1 || i == 2) {
            return "1";
        }
        if (i != 3) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "2";
    }

    public static final EnumC70477RlJ LIZIZ(Voucher voucher) {
        Integer voucherDisplayType;
        o.LJIIIZ(voucher, "voucher");
        if (voucher.getVoucherDisplayType() == null || (voucherDisplayType = voucher.getVoucherDisplayType()) == null || voucherDisplayType.intValue() != 3) {
            String voucherID = voucher.getVoucherID();
            if (voucherID == null || voucherID.length() == 0) {
                return EnumC70477RlJ.CLAIM;
            }
            String vapSchema = voucher.getVapSchema();
            if (vapSchema == null || vapSchema.length() == 0) {
                return EnumC70477RlJ.CLAIMED;
            }
            return EnumC70477RlJ.USE;
        }
        return EnumC70477RlJ.FOLLOW;
    }

    public static final EnumC70481RlN LIZJ(C69638RUs info) {
        o.LJIIIZ(info, "info");
        if (info.LJ.size() == 1) {
            return EnumC70481RlN.SHOW_ONE_COUPONS;
        }
        if (info.LJ.size() > 1) {
            return EnumC70481RlN.SHOW_DOUBLE_COUPONS;
        }
        return EnumC70481RlN.HIDE_ITEM;
    }
}
