package X;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.common.utility.reflect.Reflect;

/* renamed from: X.F8e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38476F8e {
    public static boolean LIZ = true;

    public static void LIZ(Bundle bundle) {
        Parcel parcel;
        if (bundle != null && (parcel = (Parcel) Reflect.on(bundle).field("mParcelledData", new Class[0]).get()) != null && !"Bundle[EMPTY_PARCEL]".equals(bundle.toString())) {
            parcel.recycle();
            Reflect.on(bundle).set("mParcelledData", null);
        }
    }
}
