package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Af0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26770Af0 extends TuxTextView {
    public final SimpleDateFormat LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLLLLLL;
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

    public final void setCountdownTimeMillis(long j) {
        if (j > 0) {
            String format = this.LJLLLL.format(new Date(j));
            o.LJIIIIZZ(format, "format.format(Date(time))");
            List LJLJJL = s.LJLJJL(format, new String[]{":"}, 0, 6);
            Object obj = ListProtector.get(LJLJJL, 0);
            Object obj2 = ListProtector.get(LJLJJL, 1);
            Object obj3 = ListProtector.get(LJLJJL, 2);
            if (j > 86400000) {
                obj = String.valueOf(((j / 86400000) * 24) + CastLongProtector.parseLong((String) obj));
            }
            T5R t5r = new T5R(":");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (C26338AVi.LIZJ(context)) {
                spannableStringBuilder.append((CharSequence) obj3);
                spannableStringBuilder.append((CharSequence) t5r);
                spannableStringBuilder.append((CharSequence) obj2);
                spannableStringBuilder.append((CharSequence) t5r);
                spannableStringBuilder.append((CharSequence) obj);
            } else {
                spannableStringBuilder.append((CharSequence) obj);
                spannableStringBuilder.append((CharSequence) t5r);
                spannableStringBuilder.append((CharSequence) obj2);
                spannableStringBuilder.append((CharSequence) t5r);
                spannableStringBuilder.append((CharSequence) obj3);
            }
            setText(spannableStringBuilder);
            return;
        }
        setText("");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26770Af0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLLLLL = C62850Ola.LJFF(context, "context");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        this.LJLLLL = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}
