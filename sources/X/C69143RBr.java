package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.RBr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69143RBr {
    public static int LIZ(InterfaceC69056R8i accountCallback) {
        o.LJIIIZ(accountCallback, "accountCallback");
        if (accountCallback.scene() != EnumC69116RAq.MODIFY_PHONE) {
            Bundle extras = accountCallback.getExtras();
            if (extras != null) {
                if (extras.getBoolean("from_changePwd")) {
                    return 11;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return 6;
    }
}
