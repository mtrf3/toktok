package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPriceColorSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.CWe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31456CWe {
    public static final /* synthetic */ int LIZ = 0;

    public static Drawable LIZ(int i, List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.addLast(Integer.valueOf(ColorProtector.parseColor((String) it.next())));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, ORZ.LLJ(linkedList));
        gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
        return gradientDrawable;
    }

    public static final Drawable LIZJ(int i, Context context) {
        if (i <= 499) {
            return context.getDrawable(R.drawable.cdp);
        }
        if (i <= 9999) {
            return context.getDrawable(R.drawable.cdq);
        }
        return context.getDrawable(R.drawable.cdo);
    }

    public static final Drawable LIZIZ(Context context, int i, int i2, boolean z) {
        if (z) {
            if (i <= 499) {
                Drawable drawable = context.getDrawable(R.drawable.cds);
                if (drawable == null) {
                    return LIZ(i2, C47261Igj.LJJIJIIJI("#99000000", "#33000000"));
                }
                return drawable;
            }
            if (i <= 9999) {
                Drawable drawable2 = context.getDrawable(R.drawable.cdt);
                if (drawable2 != null) {
                    return drawable2;
                }
                return LIZ(i2, C47261Igj.LJJIJIIJI("#99000000", "#33000000"));
            }
            Drawable drawable3 = context.getDrawable(R.drawable.cdr);
            if (drawable3 != null) {
                return drawable3;
            }
            return LIZ(i2, C47261Igj.LJJIJIIJI("#99000000", "#33000000"));
        }
        java.util.Map<String, List<String>> value = LiveGiftTrayPriceColorSetting.INSTANCE.getValue();
        String str = "1";
        for (String str2 : value.keySet()) {
            if (CastIntegerProtector.parseInt(str2) <= i && CastIntegerProtector.parseInt(str2) > CastIntegerProtector.parseInt(str)) {
                str = str2;
            }
        }
        List<String> list = value.get(str);
        if (list == null) {
            list = C47261Igj.LJJIJIIJI("#99000000", "#33000000");
        }
        return LIZ(i2, list);
    }
}
