package X;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.QBw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66600QBw implements QC4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.QC4
    public final void LIZ(Bundle bundle, String str, Object obj) {
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        if (jSONArray.length() == 0) {
            bundle.putStringArrayList(str, arrayList);
            return;
        }
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                    if (i2 >= length) {
                        break;
                    } else {
                        i = i2;
                    }
                } else {
                    throw new IllegalArgumentException(o.LJIILLIIL(obj2.getClass(), "Unexpected type in an array: "));
                }
            }
        }
        bundle.putStringArrayList(str, arrayList);
    }
}
