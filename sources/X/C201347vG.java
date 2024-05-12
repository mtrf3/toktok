package X;

import android.os.Bundle;

/* renamed from: X.7vG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201347vG {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle, String str, int i) {
        String string;
        if ((i & 1) != 0) {
            bundle = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if (bundle == null || (string = bundle.getString("photo_shared_vm_unique_key")) == null) {
            if (str == null) {
                return "photo_shared_vm_unique_key";
            }
        } else {
            str = string;
        }
        return str;
    }
}
