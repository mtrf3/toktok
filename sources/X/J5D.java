package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class J5D implements J3L {
    @Override // X.J3L
    public final void LIZ(C48545J3l c48545J3l) {
        String feature;
        String upperCase;
        float f;
        int i;
        float f2;
        String str;
        String[] split;
        HashMap<String, Object> hashMap = c48545J3l.LIZ;
        J5M j5m = c48545J3l.LIZLLL;
        List<String> labels = j5m.getLabels();
        List<String> args = j5m.getArgs();
        List<Float> oPTs = j5m.getOPTs();
        if (args != null) {
            feature = (String) ListProtector.get(args, 0);
        } else {
            feature = j5m.getFeature();
        }
        Object LJIILL = b.LJIILL(feature, hashMap);
        if (LJIILL == null) {
            upperCase = "";
        } else {
            upperCase = LJIILL.toString().toUpperCase(Locale.getDefault());
        }
        if (oPTs != null) {
            f = ((Float) ListProtector.get(oPTs, 0)).floatValue();
        } else {
            f = 0.0f;
        }
        int i2 = (int) f;
        int i3 = 0;
        loop0: while (true) {
            if (i3 >= labels.size()) {
                break;
            }
            if (ListProtector.get(labels, i3) == null) {
                str = "";
            } else {
                str = ((String) ListProtector.get(labels, i3)).toUpperCase(Locale.getDefault());
            }
            if (TextUtils.equals(str, upperCase)) {
                i2 = i3;
                break;
            }
            if (str.contains("|") && (split = str.split("\\|")) != null) {
                for (String str2 : split) {
                    if (TextUtils.equals(str2, upperCase)) {
                        i2 = i3;
                        break loop0;
                    }
                }
            }
            i3++;
        }
        List<String> list = c48545J3l.LJFF;
        if (list != null && (i = list.indexOf(feature)) >= 0) {
            list.remove(feature);
        } else {
            i = -1;
        }
        for (int i4 = 0; i4 < labels.size(); i4++) {
            String LIZIZ = YE1.LIZIZ(feature, "#", i4);
            if (i2 == i4) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            hashMap.put(LIZIZ, Float.valueOf(f2));
            if (list != null && !list.contains(LIZIZ)) {
                if (i >= 0) {
                    ListProtector.add(list, i, LIZIZ);
                    i++;
                } else {
                    list.add(LIZIZ);
                }
            }
        }
    }
}
