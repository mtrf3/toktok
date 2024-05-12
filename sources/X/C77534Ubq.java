package X;

import Y.IDCSpanS3S1100000_13;
import Y.IDcS172S0100000_13;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ubq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77534Ubq implements InterfaceC77521Ubd {
    @Override // X.InterfaceC77521Ubd
    public final C006800y LIZ(String mainText, IDcS172S0100000_13 iDcS172S0100000_13, String secondText, IDcS172S0100000_13 iDcS172S0100000_132) {
        o.LJIIIZ(mainText, "mainText");
        o.LJIIIZ(secondText, "secondText");
        return null;
    }

    @Override // X.InterfaceC77521Ubd
    public final C77523Ubf getIcon() {
        return null;
    }

    @Override // X.InterfaceC77521Ubd
    public final SpannableStringBuilder LIZIZ(Context context, String content, java.util.Map map, C77520Ubc c77520Ubc) {
        ForegroundColorSpan foregroundColorSpan;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(content);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("%{");
                String LJFF = JBR.LJFF(LIZ, (String) entry.getKey(), "}%", LIZ);
                int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, LJFF, 0, false, 6);
                if (LJJLIIIJL >= 0) {
                    int length = LJFF.length() + LJJLIIIJL;
                    CustomErrorExtra.PopContentReplace popContentReplace = (CustomErrorExtra.PopContentReplace) entry.getValue();
                    String str = popContentReplace.replaceValue;
                    o.LJIIIIZZ(str, "replace.replaveValue");
                    String str2 = popContentReplace.valueSchema;
                    o.LJIIIIZZ(str2, "replace.valueSchema");
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    if (C29306Beo.LJIJJLI(str2)) {
                        int length2 = spannableStringBuilder2.length();
                        IDCSpanS3S1100000_13 iDCSpanS3S1100000_13 = new IDCSpanS3S1100000_13(c77520Ubc, str2, 2);
                        Integer LJI = C79045V0n.LJI(R.attr.go, context);
                        if (LJI != null) {
                            foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
                        } else {
                            foregroundColorSpan = null;
                        }
                        C17I c17i = new C17I();
                        c17i.LIZIZ = 0;
                        c17i.LIZJ = length2;
                        c17i.LIZLLL = 18;
                        c17i.LIZ(foregroundColorSpan);
                        c17i.LIZ(new AbsoluteSizeSpan(13, true));
                        c17i.LIZ(iDCSpanS3S1100000_13);
                        c17i.LIZIZ(spannableStringBuilder2);
                        C23010vJ.LIZJ(context, spannableStringBuilder2, 0, length2, 33, 3, 700);
                    }
                    spannableStringBuilder.replace(LJJLIIIJL, length, (CharSequence) spannableStringBuilder2);
                }
            }
        }
        return spannableStringBuilder;
    }
}
