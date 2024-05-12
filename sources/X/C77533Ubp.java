package X;

import Y.IDCSpanS3S1100000_13;
import Y.IDcS172S0100000_13;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Ubp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77533Ubp implements InterfaceC77521Ubd {
    @Override // X.InterfaceC77521Ubd
    public final C77523Ubf getIcon() {
        return new C77523Ubf(new C28998BZq("tiktok_live_wallet_resource", "ttlive_ic_kyc_shield_v2.webp"));
    }

    @Override // X.InterfaceC77521Ubd
    public final C006800y LIZ(String mainText, IDcS172S0100000_13 iDcS172S0100000_13, String secondText, IDcS172S0100000_13 iDcS172S0100000_132) {
        o.LJIIIZ(mainText, "mainText");
        o.LJIIIZ(secondText, "secondText");
        C006700x c006700x = new C006700x();
        C279517v c279517v = new C279517v();
        c279517v.LIZ = mainText;
        c279517v.LIZJ = iDcS172S0100000_13;
        ((ArrayList) c006700x.LIZ).add(new C279617w(c279517v));
        C279717x c279717x = new C279717x();
        c279717x.LIZ = secondText;
        c279717x.LIZJ = iDcS172S0100000_132;
        ((ArrayList) c006700x.LIZ).add(new C279817y(c279717x));
        return new C006800y(c006700x);
    }

    @Override // X.InterfaceC77521Ubd
    public final SpannableStringBuilder LIZIZ(Context context, String content, java.util.Map map, C77520Ubc c77520Ubc) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(content);
        if (map != null) {
            boolean z = false;
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("%{");
                String LJFF = JBR.LJFF(LIZ, (String) entry.getKey(), "}%", LIZ);
                int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, LJFF, 0, false, 6);
                if (LJJLIIIJL >= 0) {
                    int length = LJFF.length() + LJJLIIIJL;
                    CustomErrorExtra.PopContentReplace popContentReplace = (CustomErrorExtra.PopContentReplace) entry.getValue();
                    String str = popContentReplace.replaceValue;
                    o.LJIIIIZZ(str, "replaceValueObj.replaveValue");
                    String str2 = popContentReplace.valueSchema;
                    o.LJIIIIZZ(str2, "replaceValueObj.valueSchema");
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    if (C29306Beo.LJIJJLI(str2)) {
                        int length2 = spannableStringBuilder2.length();
                        IDCSpanS3S1100000_13 iDCSpanS3S1100000_13 = new IDCSpanS3S1100000_13(c77520Ubc, str2, 1);
                        C17I c17i = new C17I();
                        c17i.LIZIZ = 0;
                        c17i.LIZJ = length2;
                        c17i.LIZLLL = 18;
                        c17i.LIZ(new ForegroundColorSpan(C77556UcC.LIZ(context)));
                        c17i.LIZ(new AbsoluteSizeSpan(13, true));
                        c17i.LIZ(iDCSpanS3S1100000_13);
                        c17i.LIZIZ(spannableStringBuilder2);
                        C23010vJ.LIZJ(context, spannableStringBuilder2, 0, length2, 33, 3, 600);
                    }
                    spannableStringBuilder.replace(LJJLIIIJL, length, (CharSequence) spannableStringBuilder2);
                    z = true;
                }
            }
            if (z) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(" >");
                Drawable LJI = C15380j0.LJI(R.drawable.cw7);
                if (LJI != null) {
                    LJI.setBounds(0, 0, C15380j0.LIZ(10.0f), C15380j0.LIZ(10.0f));
                    spannableStringBuilder3.setSpan(new ImageSpan(LJI, 1), 0, 2, 17);
                }
                spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
            }
        }
        return spannableStringBuilder;
    }
}
