package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.XGGoodsOrderMessage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CTP extends CQO<XGGoodsOrderMessage> {
    public final User LJIL;

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        String str;
        String str2;
        int i;
        User user;
        User user2 = this.LJIL;
        int i2 = 0;
        if (user2 != null && (user = ((XGGoodsOrderMessage) this.LJIJJLI).user) != null && user2.getId() == user.getId() && ((XGGoodsOrderMessage) this.LJIJJLI).goodsOrder != null) {
            C73943T0h LIZ = C73943T0h.LIZ();
            LIZ.LIZIZ(new C31375CTb());
        }
        XGGoodsOrderMessage xGGoodsOrderMessage = (XGGoodsOrderMessage) this.LJIJJLI;
        User user3 = xGGoodsOrderMessage.user;
        XGGoodsOrderMessage.GoodsOrder goodsOrder = xGGoodsOrderMessage.goodsOrder;
        if (user3 != null) {
            str = C05170If.LIZLLL(user3);
        } else {
            str = null;
        }
        if (goodsOrder != null) {
            str2 = String.valueOf(goodsOrder.goodsRoomOrder);
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        StringBuilder LIZJ = C278817o.LIZJ(str);
        LIZJ.append(C15380j0.LJIILL(R.string.szb, str2));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZJ.toString());
        if (this.LJIL == null || ((XGGoodsOrderMessage) this.LJIJJLI).user == null) {
            i = 0;
        } else {
            i = R.color.a_z;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(i)), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.a_y)), str.length(), str.length() + 6, 17);
        if (this.LJIL != null && ((XGGoodsOrderMessage) this.LJIJJLI).user != null) {
            i2 = R.color.a_z;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(i2)), str.length() + 6, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((XGGoodsOrderMessage) this.LJIJJLI).user;
    }

    public CTP(XGGoodsOrderMessage xGGoodsOrderMessage) {
        super(xGGoodsOrderMessage);
        this.LJIL = C05200Ii.LIZIZ();
    }
}
