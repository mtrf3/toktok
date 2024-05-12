package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.livesetting.recharge.LiveRechargeStepOptimizeSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Cbe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31658Cbe implements InterfaceC77669Ue1 {
    @Override // X.InterfaceC77669Ue1
    public final boolean LIZIZ(Diamond diamond) {
        o.LJIIIZ(diamond, "diamond");
        int value = LiveRechargeStepOptimizeSetting.INSTANCE.getValue();
        if ((value != 2 && value != 3) || C79146V4k.LJJJIL(diamond)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC77669Ue1
    public final String LIZ(int i, String str) {
        String str2 = LiveRechargeStepOptimizeSetting.INSTANCE.getURL_MAP().get(2);
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("&coin_amount=");
        LIZ.append(i);
        String encode = URLEncoder.encode(X1D.LIZIZ(LIZ), "UTF-8");
        StringBuilder sb = new StringBuilder(str2);
        sb.insert(s.LJJLIIIJL(str2, "&", 0, false, 6), encode);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder(url).inser…\"&\"), content).toString()");
        return sb2;
    }

    @Override // X.InterfaceC77669Ue1
    public final SpannableStringBuilder LIZJ(Context context, String amount, boolean z, Diamond diamond) {
        SpannableString spannableString;
        o.LJIIIZ(amount, "amount");
        o.LJIIIZ(diamond, "diamond");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        if (!z || C79146V4k.LJJJIL(diamond)) {
            String string = context.getString(R.string.nv5);
            o.LJIIIIZZ(string, "context.getString(R.string.pm_recharge_spend_web)");
            spannableString = new SpannableString(string);
        } else {
            String string2 = context.getString(R.string.nv3);
            o.LJIIIIZZ(string2, "context.getString(R.stri…echarge_spend_amount_web)");
            int LJJLIIIJL = s.LJJLIIIJL(string2, "%s", 0, false, 6);
            int length = amount.length() + LJJLIIIJL;
            spannableString = new SpannableString(Q8U.LIZIZ(new Object[]{amount}, 1, string2, "format(format, *args)"));
            spannableString.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context, R.color.co)), LJJLIIIJL, length, 33);
        }
        if (C79146V4k.LJJJIL(diamond)) {
            spannableStringBuilder.append((CharSequence) spannableString);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(' ');
            LIZ.append(context.getString(R.string.nv4));
            LIZ.append(" >");
            SpannableString spannableString2 = new SpannableString(X1D.LIZIZ(LIZ));
            spannableString2.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context, R.color.c0)), 0, spannableString2.length(), 33);
            CharSequence[] charSequenceArr = {spannableString, spannableString2};
            do {
                spannableStringBuilder.append(charSequenceArr[i]);
                i++;
            } while (i < 2);
        }
        return spannableStringBuilder;
    }
}
