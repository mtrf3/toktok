package X;

import Y.IDCListenerS281S0100000_5;
import Y.IDCSpanS31S0100000_5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class BAY {
    public static final LiveDialog LIZ(DataChannel dataChannel, Context context, Runnable runnable, Runnable runnable2, String enterFrom, String source) {
        int LJJLIIIJL;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(source, "source");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String communityGuideline = C15380j0.LJIILJJIL(R.string.o22);
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o20);
        String LJIILL = C15380j0.LJIILL(R.string.o21, communityGuideline);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIILJJIL);
        LIZ.append("\n\n");
        LIZ.append(LJIILL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        spannableStringBuilder.append((CharSequence) LIZIZ);
        o.LJIIIIZZ(communityGuideline, "communityGuideline");
        if (!TextUtils.isEmpty(LIZIZ) && !TextUtils.isEmpty(communityGuideline) && (LJJLIIIJL = s.LJJLIIIJL(LIZIZ, communityGuideline, 0, false, 6)) != -1) {
            C23010vJ.LJFF(spannableStringBuilder, LJJLIIIJL, communityGuideline.length() + LJJLIIIJL, 33, 600);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.c0)), LJJLIIIJL, communityGuideline.length() + LJJLIIIJL, 33);
            if (runnable != null) {
                spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(runnable, 13), LJJLIIIJL, communityGuideline.length() + LJJLIIIJL, 33);
            }
        }
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LJIILLIIL(R.string.o23);
        c47071t1.LJII(spannableStringBuilder);
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIJ = new IDCListenerS281S0100000_5(runnable2, 4);
        c47071t1.LJIIL(R.string.njj, new BAS(dataChannel, enterFrom, source));
        c47071t1.LJIIIZ(R.string.n23, new BAR(runnable2, enterFrom, source));
        return c47071t1.LIZ();
    }
}
