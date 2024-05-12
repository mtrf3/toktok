package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Abc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26560Abc {
    public static final SpannableStringBuilder LIZ(Context ctx, C26566Abi address, EnumC26562Abe type) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(address, "address");
        o.LJIIIZ(type, "type");
        int i = C26561Abd.LIZ[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ArrayList arrayList = new ArrayList();
                String str = address.LIZIZ;
                if (str != null) {
                    arrayList.add(str);
                }
                String str2 = address.LJIIJJI;
                if (str2 != null) {
                    arrayList.add(str2);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((String) next).length() > 0) {
                        arrayList2.add(next);
                    }
                }
                return new SpannableStringBuilder(ORZ.LLD(arrayList2, ", ", null, null, null, 62));
            }
            throw new C162476Zf();
        }
        SY9 sy9 = new SY9(ctx, R.raw.icon_map_pin);
        sy9.setBounds(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        sy9.LJFF(R.attr.go, ctx);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new C8FR(sy9, 2), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        String str3 = address.LIZIZ;
        if (str3 != null) {
            spannableStringBuilder.append((CharSequence) str3);
        }
        String str4 = address.LIZJ;
        if (str4 != null) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) str4);
        }
        if (C78685UuP.LJJJZ(address.LJFF) && C78685UuP.LJJJZ(address.LJII)) {
            spannableStringBuilder.append((CharSequence) " · ").append((CharSequence) address.LJII).append((CharSequence) " ");
        } else if (C78685UuP.LJJJZ(address.LJII)) {
            spannableStringBuilder.append((CharSequence) address.LJII).append((CharSequence) " ");
        }
        String str5 = address.LJ;
        if (str5 != null) {
            spannableStringBuilder.append((CharSequence) str5).append((CharSequence) " ");
        }
        String str6 = address.LIZLLL;
        if (str6 != null) {
            spannableStringBuilder.append((CharSequence) str6).append((CharSequence) " ");
        }
        String str7 = address.LJFF;
        if (str7 != null) {
            spannableStringBuilder.append((CharSequence) str7);
            return spannableStringBuilder;
        }
        return spannableStringBuilder;
    }
}
