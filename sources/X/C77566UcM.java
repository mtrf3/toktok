package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM;
import com.lynx.tasm.behavior.shadow.text.AbsoluteSizeSpan;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.UcM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77566UcM extends FrameLayout {
    public final BillingAddressVM LJLIL;

    public final BillingAddressVM getVm() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77566UcM(Context context, BillingAddressVM vm) {
        super(context);
        o.LJIIIZ(vm, "vm");
        new LinkedHashMap();
        this.LJLIL = vm;
        addView(C16880lQ.LLLZIIL(R.layout.dne, C16880lQ.LLZIL(context), null));
    }

    public final void LIZ(String message, C77568UcO c77568UcO) {
        boolean z;
        String sb;
        o.LJIIIZ(message, "message");
        View findViewById = findViewById(R.id.lz2);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.tv_add_tax)");
        TextView textView = (TextView) findViewById;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) message);
        if (c77568UcO != null) {
            spannableStringBuilder.append((CharSequence) "\n\n");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (c77568UcO.LJFF) {
                sb = c77568UcO.LJI;
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (c77568UcO.LIZLLL.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sb2.append(c77568UcO.LIZLLL);
                    sb2.append(", ");
                }
                if (c77568UcO.LIZJ.length() > 0) {
                    sb2.append(c77568UcO.LIZJ);
                    sb2.append(", ");
                }
                if (c77568UcO.LJ.length() > 0) {
                    sb2.append(c77568UcO.LJ);
                    sb2.append(", ");
                }
                if (c77568UcO.LIZIZ.length() > 0) {
                    sb2.append(c77568UcO.LIZIZ);
                    sb2.append(", ");
                }
                if (c77568UcO.LIZ.length() > 0) {
                    sb2.append(c77568UcO.LIZ);
                }
                sb = sb2.toString();
                o.LJIIIIZZ(sb, "{\n            StringBuil…   }.toString()\n        }");
            }
            String policyText = C15380j0.LJIILJJIL(R.string.ke8);
            String billingAddrTaxText = C15380j0.LJIILL(R.string.ke9, policyText, sb);
            spannableStringBuilder2.append((CharSequence) billingAddrTaxText);
            o.LJIIIIZZ(policyText, "policyText");
            o.LJIIIIZZ(billingAddrTaxText, "billingAddrTaxText");
            int LJJLIIIJL = s.LJJLIIIJL(billingAddrTaxText, policyText, 0, false, 6);
            int length = policyText.length() + LJJLIIIJL;
            C77569UcP c77569UcP = new C77569UcP(this);
            C17I c17i = new C17I();
            c17i.LIZIZ = LJJLIIIJL;
            c17i.LIZJ = length;
            c17i.LIZLLL = 33;
            c17i.LIZ(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.a1b)));
            c17i.LIZ(new AbsoluteSizeSpan());
            c17i.LIZ(c77569UcP);
            c17i.LIZIZ(spannableStringBuilder2);
            C23010vJ.LIZJ(getContext(), spannableStringBuilder2, LJJLIIIJL, length, 33, 3, 600);
            int LJJLIIIJL2 = s.LJJLIIIJL(billingAddrTaxText, sb, 0, false, 6);
            int length2 = sb.length() + LJJLIIIJL2;
            C77567UcN c77567UcN = new C77567UcN(this);
            C17I c17i2 = new C17I();
            c17i2.LIZIZ = LJJLIIIJL2;
            c17i2.LIZJ = length2;
            c17i2.LIZLLL = 33;
            c17i2.LIZ(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.a1b)));
            c17i2.LIZ(new AbsoluteSizeSpan());
            c17i2.LIZ(c77567UcN);
            c17i2.LIZIZ(spannableStringBuilder2);
            C23010vJ.LIZJ(getContext(), spannableStringBuilder2, LJJLIIIJL2, length2, 33, 3, 600);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }
}
