package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
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

/* renamed from: X.Af1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26771Af1 extends TuxTextView {
    public String LJLLLL;
    public final SimpleDateFormat LJLLLLLL;
    public final SimpleDateFormat LJLZ;
    public final BDDateFormat LJZ;
    public final BDDateFormat LJZI;
    public final java.util.Map<Integer, View> LJZL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZL;
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

    public final void LJJJIL(long j) {
        String LIZIZ;
        Long LJJIZ;
        long j2 = 0;
        if (j >= 3600000) {
            String str = this.LJLLLL;
            if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                j2 = LJJIZ.longValue() * 1000;
            }
            if (!o.LJ(this.LJLLLLLL.format(Long.valueOf(j2)), this.LJLLLLLL.format(Long.valueOf(System.currentTimeMillis())))) {
                String string = getContext().getString(R.string.vi);
                o.LJIIIIZZ(string, "context.getString(R.stri…Shop_flashsale_pdp_start)");
                LIZIZ = Q8U.LIZIZ(new Object[]{BDDateFormat.LIZJ(this.LJZI, j2)}, 1, string, "format(format, *args)");
            } else {
                String string2 = getContext().getString(R.string.vj);
                o.LJIIIIZZ(string2, "context.getString(R.stri…Shop_flashsale_pdp_today)");
                LIZIZ = Q8U.LIZIZ(new Object[]{BDDateFormat.LIZJ(this.LJZ, j2)}, 1, string2, "format(format, *args)");
            }
            setText(LIZIZ);
            return;
        }
        if (j > 0) {
            String format = this.LJLZ.format(new Date(j));
            o.LJIIIIZZ(format, "hourFormat.format(Date(countDown))");
            List LJLJJL = s.LJLJJL(format, new String[]{":"}, 0, 6);
            String str2 = (String) ListProtector.get(LJLJJL, 0);
            String str3 = (String) ListProtector.get(LJLJJL, 1);
            String str4 = (String) ListProtector.get(LJLJJL, 2);
            String string3 = getContext().getString(R.string.vi);
            o.LJIIIIZZ(string3, "context.getString(R.stri…Shop_flashsale_pdp_start)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            LIZ.append(':');
            LIZ.append(str3);
            LIZ.append(':');
            LIZ.append(str4);
            String LLLZ = C16880lQ.LLLZ(string3, Arrays.copyOf(new Object[]{X1D.LIZIZ(LIZ)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            setText(LLLZ);
            return;
        }
        setText("");
    }

    public final void setStartTime(String time) {
        o.LJIIIZ(time, "time");
        this.LJLLLL = time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26771Af1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJZL = C62850Ola.LJFF(context, "context");
        Locale locale = Locale.ENGLISH;
        this.LJLLLLLL = new SimpleDateFormat("yyyyMMdd", locale);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", locale);
        this.LJLZ = simpleDateFormat;
        this.LJZ = new BDDateFormat("lt");
        this.LJZI = new BDDateFormat("lll-Y");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}
