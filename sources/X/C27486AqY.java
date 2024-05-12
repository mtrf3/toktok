package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.AqY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27486AqY extends LinearLayout {
    public static final OJD LJLJJI = new OJD("\\D+");
    public static final C86804Y4y LJLJJL = C86804Y4y.LJLJJLL;
    public View.OnClickListener LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27486AqY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C27488Aqa getPhoneModel() {
        return new C27488Aqa(getCountryName(), getCountryCodeString(), getPhoneNumberString());
    }

    private final int getCountryCode() {
        try {
            return CastIntegerProtector.parseInt(getCountryCodeString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private final String getCountryCodeString() {
        String replace;
        CharSequence text = ((AppCompatTextView) LIZ(R.id.bwo)).getText();
        if (text == null || (replace = LJLJJI.replace(text, "")) == null) {
            return "";
        }
        return replace;
    }

    private final long getPhoneNumber() {
        try {
            return CastLongProtector.parseLong(getPhoneNumberString());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    private final String getPhoneNumberString() {
        return ((C71731SDf) LIZ(R.id.bwr)).getText();
    }

    public final String getCountryName() {
        String charSequence;
        String charSequence2;
        CharSequence text = ((AppCompatTextView) LIZ(R.id.bwn)).getText();
        if (text == null || (charSequence = text.toString()) == null || (charSequence2 = s.LJZI(charSequence).toString()) == null) {
            return "";
        }
        return charSequence2;
    }

    public final EditText getEditText() {
        return ((C71731SDf) LIZ(R.id.bwr)).getEditText();
    }

    public final OSZ<String, String> getFullPhoneNumber() {
        return new OSZ<>(getCountryName(), LIZIZ(getCountryCodeString(), getPhoneNumberString()));
    }

    public final InterfaceC65784Pro<C76800UCe> getOnCountryCodeChangeListener() {
        return this.LJLILLLLZI;
    }

    public final View.OnClickListener getOnCountryCodeClickListener() {
        return this.LJLIL;
    }

    private final void setCountryCode(String str) {
        ((TextView) LIZ(R.id.bwo)).setText(str);
    }

    private final void setCountryName(String str) {
        ((TextView) LIZ(R.id.bwn)).setText(str);
    }

    public final void setHint(String str) {
        getEditText().setHint(str);
    }

    public final void setOnCountryCodeChangeListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(interfaceC65784Pro, "<set-?>");
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    public final void setOnCountryCodeClickListener(View.OnClickListener onClickListener) {
        this.LJLIL = onClickListener;
    }

    public final void setPhoneModel(C27488Aqa phoneModel) {
        o.LJIIIZ(phoneModel, "phoneModel");
        LIZLLL(new OSZ<>(phoneModel.LIZ, LIZIZ(phoneModel.LIZIZ, phoneModel.LIZJ)), false);
    }

    public final void setPhoneNumber(String number) {
        o.LJIIIZ(number, "number");
        C71731SDf c71731SDf = (C71731SDf) LIZ(R.id.bwr);
        boolean LJJJLZIJ = s.LJJJLZIJ(number, "*", false);
        CharSequence charSequence = number;
        if (LJJJLZIJ) {
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZLLL(number);
            charSequence = c116724i4.LIZ;
        }
        c71731SDf.setText(charSequence);
    }

    public static String LIZIZ(String str, String str2) {
        if (str2.length() == 0) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(+");
        LIZ.append(str);
        LIZ.append(")");
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …)\n            .toString()");
        return LIZIZ;
    }

    public final void LIZJ(String phoneCode, String shortCountryName) {
        o.LJIIIZ(phoneCode, "phoneCode");
        o.LJIIIZ(shortCountryName, "shortCountryName");
        setCountryCode(phoneCode);
        setCountryName(shortCountryName);
    }

    public final void LIZLLL(OSZ<String, String> osz, boolean z) {
        if (osz == null) {
            ((C71731SDf) LIZ(R.id.bwr)).setText("");
            return;
        }
        String second = osz.getSecond();
        if (second == null) {
            second = "";
        }
        String first = osz.getFirst();
        try {
            Object obj = null;
            if (ujb.o.LJJJJJL(second)) {
                ((C71731SDf) LIZ(R.id.bwr)).setText("");
                if (z && first != null && !ujb.o.LJJJJJL(first)) {
                    Iterator it = C86804Y4y.LJLJL.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (o.LJ(((C86804Y4y) next).LJLJI, first)) {
                            obj = next;
                            break;
                        }
                    }
                    C86804Y4y c86804Y4y = (C86804Y4y) obj;
                    if (c86804Y4y != null) {
                        LIZJ(c86804Y4y.LJLJJI, c86804Y4y.LJLJI);
                        return;
                    }
                    return;
                }
                return;
            }
            String substring = second.substring(1, s.LJJLIIIJL(second, ")", 0, false, 6));
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            CharSequence substring2 = second.substring(s.LJJLIIIJL(second, ")", 0, false, 6) + 1);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            AbstractC65590Pog<C86804Y4y> abstractC65590Pog = C86804Y4y.LJLJL;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = abstractC65590Pog.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (o.LJ(((C86804Y4y) next2).LJLJJI, substring)) {
                    arrayList.add(next2);
                }
            }
            if (first == null || first.length() == 0) {
                if (arrayList.size() == 1) {
                    LIZJ(((C86804Y4y) ListProtector.get(arrayList, 0)).LJLJJI, ((C86804Y4y) ListProtector.get(arrayList, 0)).LJLJI);
                } else {
                    LIZJ(substring, "");
                }
            } else {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (o.LJ(((C86804Y4y) next3).LJLJI, first)) {
                        obj = next3;
                        break;
                    }
                }
                C86804Y4y c86804Y4y2 = (C86804Y4y) obj;
                if (c86804Y4y2 != null) {
                    LIZJ(c86804Y4y2.LJLJJI, c86804Y4y2.LJLJI);
                }
            }
            C71731SDf c71731SDf = (C71731SDf) LIZ(R.id.bwr);
            if (s.LJJJLZIJ(substring2, "*", false)) {
                C116724i4 c116724i4 = new C116724i4();
                c116724i4.LIZLLL(substring2);
                substring2 = c116724i4.LIZ;
            }
            c71731SDf.setText(substring2);
        } catch (Exception unused) {
            C78983UzD.LJIILL("phone is not correct");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C27486AqY(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r5, r0)
            r4.LJLJI = r0
            r3 = 0
            r4.<init>(r5, r6, r3)
            r0 = 2131559690(0x7f0d050a, float:1.8744731E38)
            android.view.View.inflate(r5, r0, r4)
            r2 = 2131372914(0x7f0a2b72, float:1.8365904E38)
            android.view.View r0 = r4.LIZ(r2)
            X.C7FC.LIZIZ(r0)
            X.Y4y r0 = X.QDN.LIZ()
            java.lang.String r1 = r0.LJLJJI
            java.lang.String r0 = r0.LJLJI
            r4.LIZJ(r1, r0)
            android.view.View r2 = r4.LIZ(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            Y.ACListenerS39S0200000_4 r1 = new Y.ACListenerS39S0200000_4
            r0 = 16
            r1.<init>(r4, r5, r0)
            X.C16880lQ.LJIIZILJ(r2, r1)
            r0 = 2131365016(0x7f0a0c98, float:1.8349885E38)
            android.view.View r0 = r4.LIZ(r0)
            r0.setLayoutDirection(r3)
            X.AqZ r0 = X.C27487AqZ.LJLIL
            r4.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27486AqY.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
