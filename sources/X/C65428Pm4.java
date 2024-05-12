package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: X.Pm4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65428Pm4 {
    public static final android.net.Uri LJ = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ, null, Integer.valueOf(this.LIZJ), Boolean.valueOf(this.LIZLLL)});
    }

    public final String toString() {
        String str = this.LIZ;
        if (str != null) {
            return str;
        }
        QH7.LJIIIIZZ(null);
        throw null;
    }

    public final Intent LIZ(Context context) {
        Bundle bundle;
        Intent intent = null;
        if (this.LIZ != null) {
            if (this.LIZLLL) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.LIZ);
                try {
                    bundle = context.getContentResolver().call(LJ, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf = String.valueOf(this.LIZ);
                    if (valueOf.length() != 0) {
                        "Dynamic lookup for intent failed for action: ".concat(valueOf);
                    }
                }
            }
            if (intent == null) {
                return new Intent(this.LIZ).setPackage(this.LIZIZ);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65428Pm4)) {
            return false;
        }
        C65428Pm4 c65428Pm4 = (C65428Pm4) obj;
        if (C64363PNv.LIZ(this.LIZ, c65428Pm4.LIZ) && C64363PNv.LIZ(this.LIZIZ, c65428Pm4.LIZIZ) && C64363PNv.LIZ(null, null) && this.LIZJ == c65428Pm4.LIZJ && this.LIZLLL == c65428Pm4.LIZLLL) {
            return true;
        }
        return false;
    }

    public C65428Pm4(String str, String str2, int i, boolean z) {
        QH7.LJI(str);
        this.LIZ = str;
        QH7.LJI(str2);
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
