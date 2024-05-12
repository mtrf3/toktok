package X;

import com.bytedance.mt.protector.impl.color.ColorProtector;

/* renamed from: X.5BY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BY {
    public static final int LIZ;

    static {
        int parseColor;
        Integer num = C1291054w.LJ().LJIIL;
        if (num != null) {
            parseColor = num.intValue();
        } else {
            parseColor = ColorProtector.parseColor("#343434");
        }
        LIZ = parseColor;
    }
}
