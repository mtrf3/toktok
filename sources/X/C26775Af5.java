package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Af5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26775Af5 extends TuxTextView {
    public final SimpleDateFormat LJLLLL;
    public int LJLLLLLL;
    public final BDDateFormat LJLZ;
    public final BDDateFormat LJZ;
    public final SimpleDateFormat LJZI;
    public String LJZL;
    public Integer LL;
    public final java.util.Map<Integer, View> LLD;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLD;
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

    public final void setColor(Integer num) {
        this.LL = num;
    }

    public final void setStartTime(String str) {
        this.LJZL = str;
    }

    public final void setStyle(int i) {
        this.LJLLLLLL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26775Af5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLD = C62850Ola.LJFF(context, "context");
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", locale);
        this.LJLLLL = simpleDateFormat;
        this.LJLZ = new BDDateFormat("lt");
        this.LJZ = new BDDateFormat("lll-Y");
        this.LJZI = new SimpleDateFormat("yyyyMMdd", locale);
        if (isInEditMode()) {
            LJJJJJ(86339999L, null);
        }
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    public final C31827CeN LJJJIL(float f, Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            C31827CeN c31827CeN = new C31827CeN();
            c31827CeN.LJLJJLL.set(C32151Nz.LJIIZILJ(2), 0.0f, f, 0.0f);
            c31827CeN.LJLJJL.set(C32151Nz.LJIIZILJ(3), 0.0f, C32151Nz.LJIIZILJ(3), 0.0f);
            c31827CeN.LJLJL = C32151Nz.LJIIZILJ(2);
            c31827CeN.LJLILLLLZI = C32151Nz.LJIIZILJ(16);
            c31827CeN.LJLLI = C32151Nz.LJIIZILJ(17);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c31827CeN.LJLJI = AnonymousClass636.LJIIIIZZ(R.attr.dj, context);
            c31827CeN.LJLLILLLL = this.LL;
            return c31827CeN;
        }
        if (this.LJLLLLLL == 1) {
            C31827CeN c31827CeN2 = new C31827CeN();
            c31827CeN2.LJLJJLL.set(C32151Nz.LJIIZILJ(2), 0.0f, f, 0.0f);
            c31827CeN2.LJLJJL.set(C32151Nz.LJIIZILJ(3), 0.0f, C32151Nz.LJIIZILJ(3), 0.0f);
            c31827CeN2.LJLJL = C32151Nz.LJIIZILJ(2);
            c31827CeN2.LJLILLLLZI = C32151Nz.LJIIZILJ(16);
            c31827CeN2.LJLLI = C32151Nz.LJIIZILJ(17);
            c31827CeN2.LJLJI = getCurrentTextColor();
            c31827CeN2.LJLLILLLL = this.LL;
            return c31827CeN2;
        }
        C31827CeN c31827CeN3 = new C31827CeN();
        c31827CeN3.LJLJJLL.set(C32151Nz.LJIIZILJ(2), 0.0f, f, 0.0f);
        c31827CeN3.LJLJJL.set(C32151Nz.LJIIZILJ(2), 0.0f, C32151Nz.LJIIZILJ(2), 0.0f);
        c31827CeN3.LJLJL = C32151Nz.LJIIZILJ(2);
        c31827CeN3.LJLILLLLZI = C32151Nz.LJIIZILJ(16);
        c31827CeN3.LJLLI = C32151Nz.LJIIZILJ(17);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        c31827CeN3.LJLJI = AnonymousClass636.LJIIIIZZ(R.attr.go, context2);
        c31827CeN3.LJLLILLLL = this.LL;
        return c31827CeN3;
    }

    public final void LJJJJJ(long j, TuxTextView tuxTextView) {
        if (j <= 0) {
            setText("");
            return;
        }
        if (j >= 86400000) {
            String valueOf = String.valueOf((int) ((((((float) j) / 1000.0f) / 60.0f) / 60.0f) / 24.0f));
            setTuxFont(71);
            Resources resources = getContext().getResources();
            int parseInt = CastIntegerProtector.parseInt(valueOf);
            valueOf.toString();
            SpannableString spannableString = new SpannableString(resources.getQuantityString(R.plurals.e2, parseInt, valueOf));
            int LJJLIIIJL = s.LJJLIIIJL(spannableString, valueOf, 0, false, 6);
            if (LJJLIIIJL != -1) {
                spannableString.setSpan(new T5U(72, true), LJJLIIIJL, valueOf.length() + LJJLIIIJL, 33);
            }
            setText(spannableString);
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setVisibility(8);
            return;
        }
        setTuxFont(92);
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
        }
        String format = this.LJLLLL.format(new Date(j));
        o.LJIIIIZZ(format, "format.format(Date(time))");
        List LJLJJL = s.LJLJJL(format, new String[]{":"}, 0, 6);
        String str = (String) ListProtector.get(LJLJJL, 0);
        String str2 = (String) ListProtector.get(LJLJJL, 1);
        String str3 = (String) ListProtector.get(LJLJJL, 2);
        T5R t5r = new T5R(":");
        t5r.LIZ(72);
        T5R t5r2 = new T5R(":");
        t5r2.LIZ(72);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            C27570Aru.LIZ(spannableStringBuilder, str3, LJJJJ(this, null, 3));
            spannableStringBuilder.append((CharSequence) t5r);
            C27570Aru.LIZ(spannableStringBuilder, str2, LJJJJ(this, null, 3));
            spannableStringBuilder.append((CharSequence) t5r2);
            C27570Aru.LIZ(spannableStringBuilder, str, LJJJJ(this, null, 3));
        } else {
            C27570Aru.LIZ(spannableStringBuilder, str, LJJJJ(this, null, 3));
            spannableStringBuilder.append((CharSequence) t5r);
            C27570Aru.LIZ(spannableStringBuilder, str2, LJJJJ(this, null, 3));
            spannableStringBuilder.append((CharSequence) t5r2);
            C27570Aru.LIZ(spannableStringBuilder, str3, LJJJJ(this, null, 2));
        }
        setText(spannableStringBuilder);
    }

    public final void LJJJJL(long j, TuxTextView tuxTextView) {
        long j2;
        Long LJJIZ;
        String str = this.LJZL;
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            j2 = LJJIZ.longValue() * 1000;
        } else {
            j2 = 0;
        }
        if (!o.LJ(this.LJZI.format(Long.valueOf(j2)), this.LJZI.format(Long.valueOf(System.currentTimeMillis())))) {
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            String string = getContext().getString(R.string.vi);
            o.LJIIIIZZ(string, "context.getString(R.stri…Shop_flashsale_pdp_start)");
            CharSequence LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{BDDateFormat.LIZJ(this.LJZ, j2)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            setText(LLLZ);
            return;
        }
        if (j > 3600000) {
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            String string2 = getContext().getString(R.string.vj);
            o.LJIIIIZZ(string2, "context.getString(R.stri…Shop_flashsale_pdp_today)");
            CharSequence LLLZ2 = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{BDDateFormat.LIZJ(this.LJLZ, j2)}, 1));
            o.LJIIIIZZ(LLLZ2, "format(format, *args)");
            setText(LLLZ2);
            return;
        }
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
            String string3 = getContext().getString(R.string.f_1);
            o.LJIIIIZZ(string3, "context.getString(R.stri…_pdp_starts_in_countdown)");
            C025908h.LJ(new Object[]{""}, 1, string3, "format(format, *args)", tuxTextView);
        }
        setTuxFont(92);
        String format = this.LJLLLL.format(new Date(j));
        o.LJIIIIZZ(format, "format.format(Date(countdown))");
        List LJLJJL = s.LJLJJL(format, new String[]{":"}, 0, 6);
        String str2 = (String) ListProtector.get(LJLJJL, 0);
        String str3 = (String) ListProtector.get(LJLJJL, 1);
        String str4 = (String) ListProtector.get(LJLJJL, 2);
        T5R t5r = new T5R(":");
        t5r.LIZ(72);
        T5R t5r2 = new T5R(":");
        t5r2.LIZ(72);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            Boolean bool = Boolean.TRUE;
            C27570Aru.LIZ(spannableStringBuilder, str4, LJJJJ(this, bool, 1));
            spannableStringBuilder.append((CharSequence) t5r);
            C27570Aru.LIZ(spannableStringBuilder, str3, LJJJJ(this, bool, 1));
            spannableStringBuilder.append((CharSequence) t5r2);
            C27570Aru.LIZ(spannableStringBuilder, str2, LJJJJ(this, bool, 1));
        } else {
            Boolean bool2 = Boolean.TRUE;
            C27570Aru.LIZ(spannableStringBuilder, str2, LJJJJ(this, bool2, 1));
            spannableStringBuilder.append((CharSequence) t5r);
            C27570Aru.LIZ(spannableStringBuilder, str3, LJJJJ(this, bool2, 1));
            spannableStringBuilder.append((CharSequence) t5r2);
            C27570Aru.LIZ(spannableStringBuilder, str4, LJJJIL(0.0f, bool2));
        }
        setText(spannableStringBuilder);
    }

    public static /* synthetic */ C31827CeN LJJJJ(C26775Af5 c26775Af5, Boolean bool, int i) {
        float f;
        if ((i & 1) != 0) {
            f = C32151Nz.LJIIZILJ(2);
        } else {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            bool = Boolean.FALSE;
        }
        return c26775Af5.LJJJIL(f, bool);
    }
}
