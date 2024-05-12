package X;

import android.os.Bundle;

/* renamed from: X.Q4b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66397Q4b extends C66398Q4c {
    public static final /* synthetic */ int LIZJ = 0;

    public C66397Q4b(String str, Bundle bundle) {
        super(str, bundle);
        android.net.Uri LIZ = Q4Z.LIZ(bundle == null ? new Bundle() : bundle, str);
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            this.LIZ = LIZ;
        } catch (Throwable unused) {
        }
    }
}
