package X;

import Y.IDCSpanS30S0100000_4;
import Y.IDComparatorS30S0000000_2;
import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Akb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27117Akb extends TuxTextView {
    public InterfaceC65784Pro<C76800UCe> LJLLLL;
    public long LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27117Akb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLZ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        SpannableString spannableString;
        Object[] spans;
        if ((getText() instanceof SpannableString) && motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && valueOf.intValue() == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.LJLLLLLL > 300) {
                this.LJLLLLLL = elapsedRealtime;
                int LLLLLLL = C16880lQ.LLLLLLL(getLayout(), getLayout().getLineForVertical((int) (motionEvent.getY() + getTotalPaddingTop() + getScrollY())), (motionEvent.getX() - getTotalPaddingLeft()) + getScrollX());
                CharSequence text = getText();
                if ((!(text instanceof SpannableString) || (spannableString = (SpannableString) text) == null || (spans = spannableString.getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class)) == null || ORY.LJJJJI(0, spans) == null) && (interfaceC65784Pro = this.LJLLLL) != null) {
                    interfaceC65784Pro.invoke();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDefaultClickListener(InterfaceC65784Pro<C76800UCe> defaultClickListener) {
        o.LJIIIZ(defaultClickListener, "defaultClickListener");
        this.LJLLLL = defaultClickListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C27117Akb(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            r0 = r5 & 4
            if (r0 == 0) goto L18
            r1 = 2130968911(0x7f04014f, float:1.754649E38)
        Lc:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r3, r0)
            r2.LJLZ = r0
            r2.<init>(r3, r4, r1)
            return
        L18:
            r1 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27117Akb.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LJJJIL(Context context, LogisticLinkRichText linkRichText, int i, int i2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        int i3;
        int i4;
        EnumC27120Ake enumC27120Ake;
        boolean z;
        o.LJIIIZ(linkRichText, "linkRichText");
        String str = linkRichText.template;
        if (str == null || str.length() == 0) {
            return;
        }
        setMovementMethod(LinkMovementMethod.getInstance());
        ArrayList arrayList = new ArrayList();
        String str2 = linkRichText.template;
        if (str2 != null && str2.length() != 0) {
            ArrayList arrayList2 = new ArrayList();
            java.util.Map<String, LogisticLinkText> map = linkRichText.arguments;
            if (map != null) {
                for (String str3 : map.keySet()) {
                    LogisticLinkText logisticLinkText = map.get(str3);
                    if (logisticLinkText != null) {
                        int LJJLIIIJL = s.LJJLIIIJL(str2, str3, 0, false, 6);
                        if (LJJLIIIJL == -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        IEnsure iEnsure = C78983UzD.LJLLLL;
                        if (iEnsure != null) {
                            iEnsure.ensureFalse(z, "logistic rich link text key not found");
                        }
                        if (LJJLIIIJL >= 0) {
                            arrayList2.add(new OSJ(Integer.valueOf(LJJLIIIJL), Integer.valueOf(str3.length() + LJJLIIIJL), logisticLinkText));
                        }
                    }
                }
            }
            int i5 = 0;
            for (OSJ osj : ORZ.LLILII(new IDComparatorS30S0000000_2(36), arrayList2)) {
                if (i5 < ((Number) osj.getFirst()).intValue()) {
                    String substring = str2.substring(i5, ((Number) osj.getFirst()).intValue());
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(new C27122Akg(new LogisticLinkText(substring, null, null, null, null, null, null, null, linkRichText.textColorType, linkRichText.textFontType, 254, null), EnumC27120Ake.TEXT));
                }
                LogisticLinkText logisticLinkText2 = (LogisticLinkText) osj.getThird();
                if (o.LJ(((LogisticLinkText) osj.getThird()).replaceWithIcon, Boolean.TRUE)) {
                    enumC27120Ake = EnumC27120Ake.ICON;
                } else {
                    enumC27120Ake = EnumC27120Ake.TEXT;
                }
                arrayList.add(new C27122Akg(logisticLinkText2, enumC27120Ake));
                i5 = ((Number) osj.getSecond()).intValue();
            }
            if (i5 != str2.length()) {
                String substring2 = str2.substring(i5);
                o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                arrayList.add(new C27122Akg(new LogisticLinkText(substring2, null, null, null, null, null, null, null, linkRichText.textColorType, linkRichText.textFontType, 254, null), EnumC27120Ake.TEXT));
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C27122Akg c27122Akg = (C27122Akg) it.next();
            String str4 = c27122Akg.LJLIL.text;
            if (str4 != null) {
                int i6 = C27121Akf.LIZ[c27122Akg.LJLILLLLZI.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_info_circle;
                        c2068389v.LIZIZ = C7MY.LIZIZ(16);
                        c2068389v.LIZJ = C7MY.LIZIZ(16);
                        c2068389v.LJ = Integer.valueOf(R.attr.go);
                        spannableStringBuilder2.setSpan(c2068389v.LIZIZ(0, context), 0, spannableStringBuilder2.length(), 17);
                        if (interfaceC65784Pro != null) {
                            interfaceC65784Pro.invoke();
                        }
                        spannableStringBuilder2.setSpan(new IDCSpanS30S0100000_4(interfaceC65784Pro2, 1), 0, spannableStringBuilder2.length(), 17);
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str4);
                    Integer num = c27122Akg.LJLIL.textColorType;
                    Integer num2 = linkRichText.textColorType;
                    if (num2 != null) {
                        i3 = num2.intValue();
                    } else {
                        i3 = i;
                    }
                    spannableStringBuilder3.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(C78685UuP.LJLI(num, Integer.valueOf(i3)), context)), 0, str4.length(), 17);
                    Integer num3 = c27122Akg.LJLIL.textFontType;
                    Integer num4 = linkRichText.textFontType;
                    if (num4 != null) {
                        i4 = num4.intValue();
                    } else {
                        i4 = i2;
                    }
                    spannableStringBuilder3.setSpan(new T5U(C78685UuP.LJLIIIL(num3, Integer.valueOf(i4)), false), 0, str4.length(), 17);
                    spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
                }
            }
        }
        setText(spannableStringBuilder);
    }
}
