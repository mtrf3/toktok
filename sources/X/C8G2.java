package X;

import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.b0;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import org.xml.sax.XMLReader;
import ujb.s;

/* renamed from: X.8G2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G2 {
    public static Spanned LIZ(String format, final Spannable... args) {
        Spanned fromHtml;
        o.LJIIIZ(format, "format");
        o.LJIIIZ(args, "args");
        int length = args.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = "";
        }
        int length2 = args.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            String obj = args[i2].toString();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("<tux-span-");
            LIZ.append(i3);
            LIZ.append('>');
            LIZ.append(obj);
            LIZ.append("</tux-span-");
            strArr[i3] = b0.LIZJ(LIZ, i3, '>', LIZ);
            i2++;
            i3++;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append((char) 8203);
        Object[] copyOf = Arrays.copyOf(strArr, length);
        String LLLZ = C16880lQ.LLLZ(format, Arrays.copyOf(copyOf, copyOf.length));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        LIZ2.append(LLLZ);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        Html.TagHandler tagHandler = new Html.TagHandler(args) { // from class: X.8G0
            public final Spannable[] LIZ;

            {
                o.LJIIIZ(args, "rawTexts");
                this.LIZ = args;
            }

            @Override // android.text.Html.TagHandler
            public final void handleTag(boolean z, String tag, Editable output, XMLReader xmlReader) {
                o.LJIIIZ(tag, "tag");
                o.LJIIIZ(output, "output");
                o.LJIIIZ(xmlReader, "xmlReader");
                if (ujb.o.LJJJLIIL(tag, "tux-span-", false) && !z) {
                    Integer index = CastIntegerProtector.valueOf((String) ORZ.LLFF(s.LJLJJL(tag, new String[]{"-"}, 0, 6)));
                    Spannable[] spannableArr = this.LIZ;
                    o.LJIIIIZZ(index, "index");
                    Spannable spannable = spannableArr[index.intValue()];
                    CharacterStyle[] spans = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
                    o.LJIIIIZZ(spans, "spans");
                    for (CharacterStyle characterStyle : spans) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        if (output.getSpanStart(characterStyle) < 0) {
                            int length3 = output.length() - spannable.length();
                            output.setSpan(characterStyle, spanStart + length3, spanEnd + length3, spannable.getSpanFlags(characterStyle));
                        }
                    }
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = C13680gG.LIZIZ(LIZIZ, 0, null, tagHandler);
        } else {
            fromHtml = Html.fromHtml(LIZIZ, null, tagHandler);
        }
        o.LJIIIIZZ(fromHtml, "fromHtml(\n              …ndler(args)\n            )");
        return fromHtml;
    }
}
