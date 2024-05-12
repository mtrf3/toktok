package X;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qnz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68095Qnz {
    public static final AtomicReference LIZIZ = new AtomicReference();
    public static final AtomicReference LIZJ = new AtomicReference();
    public static final AtomicReference LIZLLL = new AtomicReference();
    public final C48326Ixu LIZ;

    public C68095Qnz(C48326Ixu c48326Ixu) {
        this.LIZ = c48326Ixu;
    }

    public final String LIZ(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder LIZJ2 = C278817o.LIZJ("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = LIZIZ((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (LIZJ2.length() != 1) {
                    LIZJ2.append(", ");
                }
                LIZJ2.append(valueOf);
            }
        }
        LIZJ2.append("]");
        return LIZJ2.toString();
    }

    public final String LIZIZ(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.LIZ.LIZ()) {
            return bundle.toString();
        }
        StringBuilder LIZJ2 = C278817o.LIZJ("Bundle[{");
        for (String str : bundle.keySet()) {
            if (LIZJ2.length() != 8) {
                LIZJ2.append(", ");
            }
            LIZJ2.append(LJ(str));
            LIZJ2.append("=");
            Object LLJJIII = C16880lQ.LLJJIII(bundle, str);
            if (LLJJIII instanceof Bundle) {
                valueOf = LIZ(new Object[]{LLJJIII});
            } else if (LLJJIII instanceof Object[]) {
                valueOf = LIZ((Object[]) LLJJIII);
            } else if (LLJJIII instanceof ArrayList) {
                valueOf = LIZ(((ArrayList) LLJJIII).toArray());
            } else {
                valueOf = String.valueOf(LLJJIII);
            }
            LIZJ2.append(valueOf);
        }
        LIZJ2.append("}]");
        return LIZJ2.toString();
    }

    public final String LIZJ(zzaw zzawVar) {
        String LIZIZ2;
        if (!this.LIZ.LIZ()) {
            return zzawVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzawVar.zzc);
        sb.append(",name=");
        sb.append(LIZLLL(zzawVar.zza));
        sb.append(",params=");
        zzau zzauVar = zzawVar.zzb;
        if (zzauVar == null) {
            LIZIZ2 = null;
        } else if (!this.LIZ.LIZ()) {
            LIZIZ2 = zzauVar.toString();
        } else {
            LIZIZ2 = LIZIZ(zzauVar.LJJJJZI());
        }
        sb.append(LIZIZ2);
        return sb.toString();
    }

    public final String LIZLLL(String str) {
        if (str == null) {
            return null;
        }
        if (!this.LIZ.LIZ()) {
            return str;
        }
        return LJI(str, C68107QoB.LIZJ, C68107QoB.LIZ, LIZIZ);
    }

    public final String LJ(String str) {
        if (str == null) {
            return null;
        }
        if (!this.LIZ.LIZ()) {
            return str;
        }
        return LJI(str, C68094Qny.LIZIZ, C68094Qny.LIZ, LIZJ);
    }

    public final String LJFF(String str) {
        if (str == null) {
            return null;
        }
        if (!this.LIZ.LIZ()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return LJI(str, C68119QoN.LIZIZ, C68119QoN.LIZ, LIZLLL);
    }

    public static final String LJI(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        QH7.LJIIIIZZ(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        QH7.LIZIZ(z);
        for (int i = 0; i < strArr.length; i++) {
            Object obj = strArr[i];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }
}
