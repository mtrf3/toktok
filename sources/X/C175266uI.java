package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.6uI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175266uI {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(JSONArray jSONArray) {
        Integer valueOf;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Integer.valueOf(jSONArray.length());
            } catch (Exception unused) {
            }
        }
        o.LJI(valueOf);
        int intValue = valueOf.intValue();
        if (intValue >= 0) {
            int i = 0;
            while (true) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                if (i == intValue) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
