package X;

import Y.IDCListenerS159S0100000_5;
import Y.IDCSpanS31S0100000_5;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.BUb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28853BUb {
    public static final /* synthetic */ int LIZ = 0;

    public static final DialogC77438UaI LIZ(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        o.LJIIIZ(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String communityGuideline = C15380j0.LJIILJJIL(R.string.ljd);
        String desc = C15380j0.LJIILL(R.string.ny5, communityGuideline);
        spannableStringBuilder.append((CharSequence) desc);
        if (!TextUtils.isEmpty(desc) && !TextUtils.isEmpty(communityGuideline)) {
            o.LJIIIIZZ(desc, "desc");
            o.LJIIIIZZ(communityGuideline, "communityGuideline");
            int LJJLIIIJL = s.LJJLIIIJL(desc, communityGuideline, 0, false, 6);
            if (LJJLIIIJL != -1) {
                C23010vJ.LJFF(spannableStringBuilder, LJJLIIIJL, communityGuideline.length() + LJJLIIIJL, 33, 600);
            }
            if (runnable != null) {
                spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(runnable, 5), LJJLIIIJL, communityGuideline.length() + LJJLIIIJL, 33);
            }
        }
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJIIIIZZ = R.drawable.da3;
        c77437UaH.LJI(R.string.ny8);
        c77437UaH.LJII = spannableStringBuilder;
        c77437UaH.LIZJ(R.string.ny7, new IDCListenerS159S0100000_5(runnable2, 10), false);
        c77437UaH.LJ(R.string.ny6, new IDCListenerS159S0100000_5(runnable3, 11), false);
        c77437UaH.LJJII = false;
        return c77437UaH.LIZ();
    }
}
