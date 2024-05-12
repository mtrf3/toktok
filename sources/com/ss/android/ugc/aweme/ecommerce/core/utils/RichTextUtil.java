package com.ss.android.ugc.aweme.ecommerce.core.utils;

import X.AnonymousClass636;
import X.C141335gf;
import X.C224848s4;
import X.C26730AeM;
import X.C26857AgP;
import X.C3C5;
import X.C76800UCe;
import X.C78857UxB;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class RichTextUtil {
    public static final RichTextUtil LIZ = new RichTextUtil();

    public static String LIZIZ(LogisticLinkRichText logisticLinkRichText) {
        String str;
        o.LJIIIZ(logisticLinkRichText, "<this>");
        String str2 = logisticLinkRichText.template;
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(logisticLinkRichText.template);
        Map<String, LogisticLinkText> map = logisticLinkRichText.arguments;
        if (map != null) {
            for (String str3 : map.keySet()) {
                LogisticLinkText logisticLinkText = map.get(str3);
                if (logisticLinkText != null && (str = logisticLinkText.text) != null) {
                    C26730AeM.LIZ(sb, str3, str);
                }
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public static SpannableStringBuilder LIZ(LogisticLinkRichText logisticLinkRichText, View view, InterfaceC88472Yns block) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        final String str2;
        Object LIZ2;
        Context context;
        Context context2;
        String str3;
        o.LJIIIZ(logisticLinkRichText, "<this>");
        o.LJIIIZ(block, "block");
        String str4 = logisticLinkRichText.template;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        StringBuilder sb = new StringBuilder(logisticLinkRichText.template);
        Map<String, LogisticLinkText> map = logisticLinkRichText.arguments;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str5 : map.keySet()) {
                LogisticLinkText logisticLinkText = map.get(str5);
                if (logisticLinkText != null && (str3 = logisticLinkText.text) != null) {
                    if (sb.indexOf(str5) != -1) {
                        linkedHashMap.put(str5, logisticLinkText);
                    }
                    C26730AeM.LIZ(sb, str5, str3);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            if (view != null && (context2 = view.getContext()) != null && AnonymousClass636.LJIILJJIL(context2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && C78857UxB.LJJJIL(logisticLinkRichText.textDarkColor)) {
                str = logisticLinkRichText.textDarkColor;
            } else {
                str = logisticLinkRichText.textColor;
            }
            if (str != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ColorProtector.parseColor(str)), 0, spannableStringBuilder.length(), 17);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str6 = (String) entry.getKey();
                final LogisticLinkText logisticLinkText2 = (LogisticLinkText) entry.getValue();
                String str7 = logisticLinkText2.text;
                if (str7 != null) {
                    int indexOf = sb.indexOf(str7);
                    int length = str7.length() + indexOf;
                    if (indexOf >= 0 && length <= sb.length()) {
                        if (view != null && (context = view.getContext()) != null && AnonymousClass636.LJIILJJIL(context)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && C78857UxB.LJJJIL(logisticLinkText2.darkColor)) {
                            str2 = logisticLinkText2.darkColor;
                        } else {
                            str2 = logisticLinkText2.color;
                        }
                        spannableStringBuilder.setSpan(new UnderlineSpan() { // from class: com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil$build$2$3
                            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint ds) {
                                o.LJIIIZ(ds, "ds");
                                if (o.LJ(LogisticLinkText.this.hasUnderscore, Boolean.TRUE)) {
                                    ds.setUnderlineText(true);
                                }
                                if (LogisticLinkText.this.color != null) {
                                    ds.setColor(ColorProtector.parseColor(str2));
                                }
                            }
                        }, indexOf, length, 17);
                        Boolean bool = logisticLinkText2.isBold;
                        if (bool != null && bool.booleanValue()) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, length, 17);
                        }
                        if (str2 != null) {
                            try {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str2)), indexOf, length, 17);
                                LIZ2 = C76800UCe.LIZ;
                                C3C5.m7constructorimpl(LIZ2);
                            } catch (Throwable th) {
                                LIZ2 = C141335gf.LIZ(th);
                                C3C5.m7constructorimpl(LIZ2);
                            }
                            C3C5.m6boximpl(LIZ2);
                        }
                        block.invoke(new C224848s4(str6, str7, indexOf, length, spannableStringBuilder));
                    }
                }
            }
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder(sb);
    }

    public static SpannableStringBuilder LIZLLL(RichTextUtil richTextUtil, Context context, String str, Map map) {
        richTextUtil.getClass();
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        if (map == null) {
            return spannableStringBuilder;
        }
        for (String str2 : map.keySet()) {
            String str3 = (String) map.get(str2);
            if (str3 != null && str3.length() != 0) {
                int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, str2, 0, false, 6);
                int length = str2.length() + LJJLIIIJL;
                if (LJJLIIIJL >= 0 && length <= spannableStringBuilder.length()) {
                    spannableStringBuilder.replace(LJJLIIIJL, length, (CharSequence) str3);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(LJIIIIZZ), LJJLIIIJL, str3.length() + LJJLIIIJL, 17);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder LIZJ(RichTextUtil richTextUtil, Context context, LinkRichText linkRichText, Integer num, int i, boolean z, Integer num2, InterfaceC88472Yns interfaceC88472Yns, int i2) {
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        Integer num3 = num2;
        int i3 = i;
        boolean z2 = z;
        SpannableStringBuilder spannableStringBuilder = null;
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            num3 = null;
        }
        if ((i2 & 64) != 0) {
            interfaceC88472Yns2 = null;
        }
        richTextUtil.getClass();
        o.LJIIIZ(context, "context");
        o.LJIIIZ(linkRichText, "linkRichText");
        String str = linkRichText.template;
        HashMap<String, LinkText> hashMap = linkRichText.arguments;
        if (str != null) {
            spannableStringBuilder = new SpannableStringBuilder(str);
            if (num != null) {
                num.intValue();
                spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, str.length(), 17);
            }
            if (hashMap != null) {
                for (String str2 : hashMap.keySet()) {
                    LinkText linkText = hashMap.get(str2);
                    if (linkText != null) {
                        String str3 = linkText.text;
                        if (str3 == null) {
                            str3 = "";
                        }
                        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, str2, 0, false, 6);
                        int length = str2.length() + LJJLIIIJL;
                        if (LJJLIIIJL >= 0 && length <= spannableStringBuilder.length()) {
                            spannableStringBuilder.replace(LJJLIIIJL, length, (CharSequence) str3);
                            int length2 = str3.length() + LJJLIIIJL;
                            if (!o.LJ(linkText.isBold, Boolean.FALSE)) {
                                spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, length2, 17);
                            }
                            if (o.LJ(linkText.hasStrike, Boolean.TRUE)) {
                                spannableStringBuilder.setSpan(new StrikethroughSpan(), LJJLIIIJL, length2, 17);
                            }
                            spannableStringBuilder.setSpan(new C26857AgP(linkText, interfaceC88472Yns2, z2, context, i3, num3), LJJLIIIJL, length2, 17);
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }
}
