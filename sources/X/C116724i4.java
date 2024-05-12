package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.4i4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116724i4 {
    public final C116714i3 LIZ;
    public final C116734i5 LIZIZ;

    public C116724i4() {
        char c;
        C116714i3 c116714i3 = new C116714i3();
        this.LIZ = c116714i3;
        this.LIZIZ = new C116734i5();
        if (C90193gN.LIZ()) {
            c = 8207;
        } else {
            c = 8206;
        }
        c116714i3.append(c);
        c116714i3.LIZ(0);
    }

    public final void LIZIZ(CharSequence cs) {
        o.LJIIIZ(cs, "cs");
        this.LIZ.append(cs);
    }

    public final void LIZLLL(CharSequence cs) {
        o.LJIIIZ(cs, "cs");
        C116734i5 c116734i5 = this.LIZIZ;
        C116714i3 c116714i3 = this.LIZ;
        c116734i5.getClass();
        C116734i5.LIZ(c116714i3, cs);
    }

    public final void LJ(CharSequence charSequence) {
        char c;
        C116734i5 c116734i5 = this.LIZIZ;
        C116714i3 text = this.LIZ;
        c116734i5.getClass();
        o.LJIIIZ(text, "text");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (C90193gN.LIZ()) {
            c = 8207;
        } else {
            c = 8206;
        }
        spannableStringBuilder.append(c);
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append(c);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        o.LJIIIIZZ(spannableStringBuilder2, "sb.toString()");
        text.LIZ(text.length());
        text.LIZ((spannableStringBuilder2.length() + r1) - 1);
        text.append((CharSequence) spannableStringBuilder2);
    }

    public final void LIZJ(CharSequence charSequence, Object obj) {
        int length = this.LIZ.length();
        this.LIZ.append(charSequence);
        if (obj != null) {
            this.LIZ.setSpan(obj, length, this.LIZ.length(), 33);
        }
    }

    public final void LIZ(Resources resources, int i, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String cs : strArr) {
            this.LIZIZ.getClass();
            o.LJIIIZ(cs, "cs");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((char) 8296);
            spannableStringBuilder.append((CharSequence) cs);
            spannableStringBuilder.append((char) 8297);
            arrayList.add(spannableStringBuilder);
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        String string = resources.getString(i, Arrays.copyOf(charSequenceArr, charSequenceArr.length));
        o.LJIIIIZZ(string, "resources.getString(resId, *params.toTypedArray())");
        this.LIZ.append((CharSequence) string);
    }
}
