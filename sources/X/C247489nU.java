package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.9nU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247489nU {
    public static final C247489nU LIZ = new C247489nU();

    public static int LIZ(int i, Context context) {
        o.LJIIIZ(context, "context");
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            return abstractC247499nV.LJFF(i, context);
        }
        return -1;
    }

    public static int LIZIZ(C247489nU c247489nU, String str) {
        int parseColor;
        if (str != null) {
            try {
                if (!ujb.o.LJJJLIIL(str, "#", false)) {
                    parseColor = CastIntegerProtector.parseInt(str);
                } else {
                    parseColor = Color.parseColor(str);
                }
                return parseColor;
            } catch (Throwable unused) {
            }
        }
        return -1;
    }
}
