package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class F31 {
    public final PackageInfo LIZ;
    public final String LIZIZ;
    public String LIZJ;

    public final String LIZ() {
        String str;
        String str2 = this.LIZJ;
        if (str2 != null) {
            return str2;
        }
        PackageInfo packageInfo = this.LIZ;
        String str3 = "UNK";
        if (packageInfo == null) {
            str = "UNK";
        } else {
            str = packageInfo.packageName;
            str3 = packageInfo.versionName;
        }
        Locale locale = Locale.getDefault();
        StringBuilder LIZLLL = C1FL.LIZLLL(str, "/", str3, " ChannelSDK/");
        LIZLLL.append(this.LIZIZ);
        LIZLLL.append(" (Linux; U; Android ");
        LIZLLL.append(Build.VERSION.RELEASE);
        LIZLLL.append("; ");
        LIZLLL.append(locale.getLanguage());
        LIZLLL.append("-");
        LIZLLL.append(locale.getCountry());
        LIZLLL.append("; ");
        LIZLLL.append(Build.MODEL);
        LIZLLL.append(" Build/");
        String LJFF = JBR.LJFF(LIZLLL, Build.ID, ")", LIZLLL);
        this.LIZJ = LJFF;
        return LJFF;
    }

    public F31(Context context) {
        try {
            this.LIZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 128);
            this.LIZIZ = "4.0.8";
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }
}
