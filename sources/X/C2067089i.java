package X;

import android.content.Context;
import android.text.SpannableString;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.89i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2067089i {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, TuxTextView tuxTextView) {
        int i2;
        String string = tuxTextView.getContext().getString(i);
        o.LJIIIIZZ(string, "context.getString(rawTextId)");
        String string2 = tuxTextView.getContext().getString(R.string.j7d);
        o.LJIIIIZZ(string2, "context.getString(R.string.now_tiktok_now_index)");
        Context context = tuxTextView.getContext();
        o.LJIIIIZZ(context, "context");
        SpannableString valueOf = SpannableString.valueOf(string);
        o.LJIIIIZZ(valueOf, "SpannableString.valueOf(this)");
        int i3 = 0;
        int LJJLIIIJL = s.LJJLIIIJL(string, string2, 0, false, 6);
        if (LJJLIIIJL >= 0 && string2.length() + LJJLIIIJL <= valueOf.length()) {
            C40517FvF c40517FvF = new C40517FvF(LJJLIIIJL, string2.length() + LJJLIIIJL);
            Integer LJI = C79045V0n.LJI(R.attr.eg, context);
            if (LJI != null) {
                i2 = LJI.intValue();
            } else {
                i2 = 0;
            }
            Integer LJI2 = C79045V0n.LJI(R.attr.eg, context);
            if (LJI2 != null) {
                i3 = LJI2.intValue();
            }
            valueOf.setSpan(new C2066989h(string, string2, i2, i3), c40517FvF.getStart().intValue(), c40517FvF.LJIIIIZZ().intValue(), 17);
        }
        tuxTextView.setText(valueOf);
    }
}
