package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: X.PjS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65266PjS {
    public static final Pattern LJI = PatternProtector.compile("[^\\p{Alnum}]");
    public final ReentrantLock LIZ;
    public final boolean LIZIZ;
    public final InterfaceC65285Pjl LIZJ;
    public final C65268PjU LIZLLL;
    public C021606q LJ;
    public boolean LJFF;

    static {
        Pattern.quote("/");
    }

    public final String LIZ() {
        C021606q c021606q;
        if (this.LIZIZ) {
            synchronized (this) {
                if (!this.LJFF) {
                    this.LJ = this.LIZLLL.LIZ();
                    this.LJFF = true;
                }
                c021606q = this.LJ;
            }
            if (c021606q != null) {
                return (String) c021606q.LIZIZ;
            }
        }
        return null;
    }

    public final String LIZIZ() {
        String str;
        if (!this.LIZIZ) {
            return "";
        }
        String str2 = null;
        String string = ((C65270PjW) this.LIZJ).LIZ.getString("installation_uuid", null);
        if (string == null) {
            this.LIZ.lock();
            try {
                String string2 = ((C65270PjW) this.LIZJ).LIZ.getString("installation_uuid", null);
                if (string2 == null) {
                    String uuid = UUID.randomUUID().toString();
                    if (uuid != null) {
                        str2 = LJI.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
                    }
                    InterfaceC65285Pjl interfaceC65285Pjl = this.LIZJ;
                    SharedPreferences.Editor putString = ((C65270PjW) interfaceC65285Pjl).LIZ.edit().putString("installation_uuid", str2);
                    ((C65270PjW) interfaceC65285Pjl).getClass();
                    putString.apply();
                    str = str2;
                } else {
                    str = string2;
                }
                return str;
            } finally {
                this.LIZ.unlock();
            }
        }
        return string;
    }

    public C65266PjS(Context context) {
        C65270PjW c65270PjW = new C65270PjW(context, "com.twitter.sdk.android.AdvertisingPreferences");
        C65268PjU c65268PjU = new C65268PjU(context, c65270PjW);
        this.LIZ = new ReentrantLock();
        context.getPackageName();
        this.LIZLLL = c65268PjU;
        this.LIZJ = c65270PjW;
        boolean LJIIJ = C78841Uwv.LJIIJ(context, "com.twitter.sdk.android.COLLECT_IDENTIFIERS_ENABLED", true);
        this.LIZIZ = LJIIJ;
        if (!LJIIJ) {
            C44432HcC LIZIZ = C65265PjR.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Device ID collection disabled for ");
            LIZ.append(context.getPackageName());
            X1D.LIZIZ(LIZ);
            LIZIZ.getClass();
        }
    }
}
