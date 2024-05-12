package X;

import Y.ACListenerS49S0200000_15;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Xjh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85665Xjh extends LinearLayout implements InterfaceC69102RAc {
    public static final OJD LJLJJL = new OJD("\\D+");
    public static final C86804Y4y LJLJJLL = C86804Y4y.LJLJJLL;
    public InterfaceC65784Pro<C76800UCe> LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJI;
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

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        if (r5 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r6 = this;
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "phone"
            java.lang.Object r1 = X.C16880lQ.LLILL(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            kotlin.jvm.internal.o.LJII(r1, r0)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            X.Ffz r0 = X.C39405FdJ.LJFF
            r0.getClass()
            java.lang.String r5 = X.C39571Ffz.LJ(r1)
            int r0 = r5.length()
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L32
            X.FJs r2 = X.C38776FJs.LJIIL()
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "country"
            java.lang.String r5 = r2.LJFF(r1, r0)
            if (r5 == 0) goto L38
        L32:
            int r0 = r5.length()
            if (r0 != 0) goto L4c
        L38:
            X.Ffv r2 = X.C39399FdD.LIZIZ
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = "getDefault()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.getClass()
            java.lang.String r5 = X.C39567Ffv.LIZIZ(r1)
            if (r5 == 0) goto L52
        L4c:
            int r0 = r5.length()
            if (r0 != 0) goto L58
        L52:
            X.Y4y r0 = X.C85665Xjh.LJLJJLL
            r6.setCountry(r0)
            return
        L58:
            X.Pog<X.Y4y> r0 = X.C86804Y4y.LJLJL
            java.util.Iterator r2 = r0.iterator()
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            X.Y4y r1 = (X.C86804Y4y) r1
            java.lang.String r0 = r1.LJLJI
            boolean r0 = ujb.o.LJJJJIZL(r0, r5, r3)
            if (r0 == 0) goto L5e
            r6.setCountry(r1)
            r4 = 1
            goto L5e
        L77:
            if (r4 != 0) goto L7e
            X.Y4y r0 = X.C85665Xjh.LJLJJLL
            r6.setCountry(r0)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85665Xjh.LIZJ():void");
    }

    public final int getCountryCode() {
        try {
            return CastIntegerProtector.parseInt(getCountryCodeString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String getCountryCodeString() {
        String replace;
        CharSequence text = ((AppCompatTextView) LIZIZ(R.id.bwo)).getText();
        if (text == null || (replace = LJLJJL.replace(text, "")) == null) {
            return "";
        }
        return replace;
    }

    public final String getCountryName() {
        String charSequence;
        String charSequence2;
        CharSequence text = ((AppCompatTextView) LIZIZ(R.id.bwn)).getText();
        if (text == null || (charSequence = text.toString()) == null || (charSequence2 = s.LJZI(charSequence).toString()) == null) {
            return "";
        }
        return charSequence2;
    }

    public final EditText getEditText() {
        return ((C74090T5y) LIZIZ(R.id.bwr)).getEditText();
    }

    public final String getFullPhoneNumber() {
        String LIZ = PhoneNumberUtil.LIZ(getPhoneNumberObject());
        o.LJIIIIZZ(LIZ, "formatNumber(getPhoneNumberObject())");
        return LIZ;
    }

    public final C74090T5y getInputView() {
        C74090T5y country_code_phone_input = (C74090T5y) LIZIZ(R.id.bwr);
        o.LJIIIIZZ(country_code_phone_input, "country_code_phone_input");
        return country_code_phone_input;
    }

    public final long getPhoneNumber() {
        try {
            return CastLongProtector.parseLong(getPhoneNumberString());
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public final PhoneNumberUtil.PhoneNumber getPhoneNumberObject() {
        PhoneNumberUtil.PhoneNumber create = PhoneNumberUtil.PhoneNumber.create(getCountryCode(), getPhoneNumberString());
        create.setCountryIso(getCountryName());
        return create;
    }

    public final String getPhoneNumberString() {
        return ((C74090T5y) LIZIZ(R.id.bwr)).getText();
    }

    public final void setCountry(C86804Y4y c86804Y4y) {
        String str;
        String str2;
        String str3 = "";
        if (c86804Y4y == null || (str = c86804Y4y.LJLJJI) == null) {
            str = "";
        }
        setCountryCode(str);
        if (c86804Y4y != null && (str2 = c86804Y4y.LJLJI) != null) {
            str3 = str2;
        }
        setCountryName(str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (ujb.o.LJJJLIIL(r4, "+", false) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCountryCode(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "code"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            int r1 = r4.length()
            r0 = 0
            if (r1 <= 0) goto L2f
            java.lang.String r2 = "+"
            boolean r0 = ujb.o.LJJJLIIL(r4, r2, r0)
            if (r0 != 0) goto L2f
        L14:
            r0 = 2131365015(0x7f0a0c97, float:1.8349883E38)
            android.view.View r1 = r3.LIZIZ(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            r1.setText(r0)
            return
        L2f:
            java.lang.String r2 = ""
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85665Xjh.setCountryCode(java.lang.String):void");
    }

    public final void setCountryName(String name) {
        o.LJIIIZ(name, "name");
        ((TextView) LIZIZ(R.id.bwn)).setText(name);
    }

    public final void setInputCountryViewClick(InterfaceC65784Pro<C76800UCe> click) {
        o.LJIIIZ(click, "click");
        this.LJLIL = click;
    }

    public final void setPhoneNumber(String number) {
        o.LJIIIZ(number, "number");
        ((C74090T5y) LIZIZ(R.id.bwr)).setText(number);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85665Xjh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        View.inflate(context, R.layout.oz, this);
        C7FC.LIZIZ(LIZIZ(R.id.hnu));
        synchronized (C69101RAb.class) {
            ((LinkedList) C69101RAb.LIZIZ).add(new WeakReference(this));
        }
        C16880lQ.LJIIZILJ((LinearLayout) LIZIZ(R.id.hnu), new ACListenerS49S0200000_15(this, context, 3));
    }

    @Override // X.InterfaceC69102RAc
    public final void LIZ(C86804Y4y c86804Y4y, C86804Y4y c86804Y4y2) {
        String str;
        String str2;
        String str3 = "";
        if (c86804Y4y == null || (str = c86804Y4y.LJLJJI) == null) {
            str = "";
        }
        if (c86804Y4y2 != null && (str2 = c86804Y4y2.LJLJJI) != null) {
            str3 = str2;
        }
        String str4 = this.LJLILLLLZI;
        String str5 = this.LJLJI;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("previous_country_code", str);
        c35936E8m.LIZLLL("new_country_code", str3);
        c35936E8m.LIZLLL("enter_from", str4);
        c35936E8m.LIZLLL("login_panel_type", str5);
        FMX.LJIIL("change_country_code", c35936E8m.LIZ);
        setCountry(c86804Y4y2);
    }
}
