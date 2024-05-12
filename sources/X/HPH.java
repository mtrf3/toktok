package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPH implements HPB {
    public static final HPH LIZ = new HPH();

    @Override // X.HPB
    public final boolean LIZ(Context context, Bundle bundle) {
        boolean z;
        boolean z2;
        o.LJIIIZ(context, "context");
        if (C44172HVg.LJJI.LJ().LIZIZ(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C44172HVg.LJJI.LJ().LIZ(context) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }
}
