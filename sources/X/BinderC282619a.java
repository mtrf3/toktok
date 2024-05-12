package X;

import android.content.pm.PackageManager;
import android.os.Binder;
import androidx.browser.trusted.TrustedWebActivityService;

/* renamed from: X.19a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class BinderC282619a extends AbstractBinderC11220cI {
    public final /* synthetic */ TrustedWebActivityService LJLIL;

    public final void LJLJI() {
        TrustedWebActivityService trustedWebActivityService = this.LJLIL;
        int i = trustedWebActivityService.LJLILLLLZI;
        if (i == -1) {
            PackageManager packageManager = trustedWebActivityService.getPackageManager();
            int callingUid = Binder.getCallingUid();
            if (!new C03880Dg(2).LIZJ(101310, "android/content/pm/PackageManager", "getPackagesForUid", packageManager, new Object[]{Integer.valueOf(callingUid)}, "java.lang.String[]", new C65300Pk0(false, "(I)[Ljava/lang/String;", "-4769190472935091964")).LIZ) {
                packageManager.getPackagesForUid(callingUid);
            }
            this.LJLIL.LIZJ();
            throw null;
        }
        if (i == Binder.getCallingUid()) {
        } else {
            throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
        }
    }

    public BinderC282619a(TrustedWebActivityService trustedWebActivityService) {
        this.LJLIL = trustedWebActivityService;
    }
}
